import React, { useEffect, useState } from 'react';
import axios from 'axios';
import './styles.css';
import {formatDate} from './helpers';
import { RecordResponse } from "./types";

const BASE_URL = 'http://localhost:8080'

const Records = () => {

    const [ recordsResponse, setRecordsResponse] = useState<RecordResponse>();

    useEffect(() =>{
        axios.get(`${BASE_URL}/records?linePerPage=12`).then(response => setRecordsResponse(response.data));
    }, []);

    return (
        <div className="page-container">
            <table className="records-table" cellPadding="0" cellSpacing="0">
                <thead>
                    <tr>
                        <th>INSTANTE</th>
                        <th>NOME</th>
                        <th>IDADE</th>
                        <th>PLATAFORMA</th>
                        <th>GENERO</th>
                        <th>TITULO</th>
                    </tr>
                </thead>
                <tbody>
                    {recordsResponse?.content.map(record =>(
                        <tr key={record.id}>
                            <td>{formatDate(record.moment)}</td>
                            <td>{record.name}</td>
                            <td>{record.age}</td>
                            <td className="text-secondary">{record.gamePlatform}</td>
                            <td>{record.genreName}</td>
                            <td className="text-primary">{record.gameTitle}</td>
                        </tr>
                    ))}
                </tbody>
            </table>

        </div>
    );
}

export default Records;