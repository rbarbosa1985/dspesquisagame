import React, { useState } from 'react';
import {Text, StyleSheet, TextInput, View, Image, Alert} from 'react-native';
import Header from '../../components/Header';
import PlatformCard from './PlatformCard';
import { GamePlatform } from './types';

const CreateRecord = () => {

    const [platform, setPlatform] = useState<GamePlatform>();

    const handleChangePlatform = (selectedPlatform: GamePlatform) => {
        setPlatform(selectedPlatform);
    };

    return (
        <>
            <Header/>
            <View style={styles.container}>
                <TextInput style={styles.inputText} placeholder="Nome" placeholderTextColor="#9E9E9E"/>
                <TextInput style={styles.inputText} placeholder="Idade" placeholderTextColor="#9E9E9E" keyboardType="numeric" maxLength={2}/>
            </View>
            <View style={styles.platformContainer}>
                <PlatformCard platform="PC" icon="laptop" onChange={() => handleChangePlatform} activePlatform={platform} />
                <PlatformCard platform="XBOX" icon="xbox" onChange={() => handleChangePlatform} activePlatform={platform}/>
                <PlatformCard platform="PLAYSTATION" icon="playstation" onChange={() => handleChangePlatform} activePlatform={platform}/>
            </View>
        </>
    );
};

const styles = StyleSheet.create({
    container: {
      marginTop: '15%',
      paddingRight: '5%',
      paddingLeft: '5%',
      paddingBottom: 50
    },
    inputText: {
      height: 50,
      backgroundColor: '#FFF',
      borderRadius: 10,
      color: '#ED7947',
      fontFamily: "Play_700Bold",
      fontSize: 16,
      paddingLeft: 20,
      marginBottom: 21
    },
    platformContainer: {
      marginBottom: 20,
      flexDirection: 'row',
      justifyContent: 'space-between',
    },
    footer: {
      marginTop: '15%',
      alignItems: 'center',
    },
    button: {
      backgroundColor: '#00D4FF',
      flexDirection: 'row',
      borderRadius: 10,
      height: 60,
      width: '100%',
      alignItems: 'center',
      justifyContent: 'center'
    },
    buttonText: {
      fontFamily: "Play_700Bold",
      fontWeight: 'bold',
      fontSize: 18,
      color: '#0B1F34',
    }
  });

export default CreateRecord;