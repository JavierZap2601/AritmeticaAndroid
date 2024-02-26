package com.example.aritmetica

import android.os.Bundle
import android.text.TextUtils
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.aritmetica.ui.theme.AritmeticaTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AritmeticaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArithmeticScreen()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ArithmeticScreen(){
    var numberOne:Int by remember{
        mutableStateOf(0)
    }
    var numberTwo:Int by remember{
        mutableStateOf(0)
    }
    var resultado:String by remember{
        mutableStateOf("")
    }
    var numberOneResta:Int by remember{
        mutableStateOf(0)
    }
    var numberTwoResta:Int by remember{
        mutableStateOf(0)
    }
    var resultadoResta:String by remember{
        mutableStateOf("")
    }
    var numberOneDiv:Int by remember{
        mutableStateOf(0)
    }
    var numberTwoDiv:Int by remember{
        mutableStateOf(0)
    }
    var resultadoDiv:String by remember{
        mutableStateOf("")
    }
    var numberOneMulti:Int by remember{
        mutableStateOf(0)
    }
    var numberTwoMulti:Int by remember{
        mutableStateOf(0)
    }
    var resultadoMulti:String by remember{
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            //.fillMaxSize()
            .height(3000.dp)
            .fillMaxWidth()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
        ){
        Text(text="Suma")
        TextField(value = numberOne.toString(), onValueChange ={
            numberOne = checkWroteNumber(it)
        }, label = {
            Text(text = "Primer Numero")
        }, placeholder = {
            Text(text = "Por Favor escribe un número")
        }, leadingIcon = {
            Icon(imageVector = Icons.Default.Star, contentDescription = "Icono de Estrella")
        }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = numberTwo.toString(), onValueChange ={
            numberTwo = checkWroteNumber(it)
        }, label = {
            Text(text = "Segundo Numero")
        }, placeholder = {
            Text(text = "Por Favor escribe un número")
        }, leadingIcon = {
            Icon(imageVector = Icons.Default.Star, contentDescription = "Icono de Estrella")
        }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Button(onClick={
            resultado = (numberOne + numberTwo).toString()

        }){
            Text(text = "Sumar")
        }
        Text(text = resultado)
        Text(text="Resta")
        TextField(value = numberOneResta.toString(), onValueChange ={
            numberOneResta = checkWroteNumber(it)
        }, label = {
            Text(text = "Primer Numero")
        }, placeholder = {
            Text(text = "Por Favor escribe un número")
        }, leadingIcon = {
            Icon(imageVector = Icons.Default.Star, contentDescription = "Icono de Estrella")
        }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = numberTwoResta.toString(), onValueChange ={
            numberTwoResta = checkWroteNumber(it)
        }, label = {
            Text(text = "Segundo Numero")
        }, placeholder = {
            Text(text = "Por Favor escribe un número")
        }, leadingIcon = {
            Icon(imageVector = Icons.Default.Star, contentDescription = "Icono de Estrella")
        }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Button(onClick={
            resultadoResta = (numberOneResta - numberTwoResta).toString()

        }){
            Text(text = "Restar")
        }
        Text(text = resultadoResta)

        Text(text="División")
        TextField(value = numberOneDiv.toString(), onValueChange ={
            numberOneDiv = checkWroteNumber(it)
        }, label = {
            Text(text = "Primer Numero")
        }, placeholder = {
            Text(text = "Por Favor escribe un número")
        }, leadingIcon = {
            Icon(imageVector = Icons.Default.Star, contentDescription = "Icono de Estrella")
        }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = numberTwoDiv.toString(), onValueChange ={
            numberTwoDiv = checkWroteNumber(it)
        }, label = {
            Text(text = "Segundo Numero")
        }, placeholder = {
            Text(text = "Por Favor escribe un número")
        }, leadingIcon = {
            Icon(imageVector = Icons.Default.Star, contentDescription = "Icono de Estrella")
        }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Button(onClick={
            resultadoDiv = (numberOneDiv / numberTwoDiv).toString()

        }){
            Text(text = "Dividir")
        }
        Text(text = resultadoDiv)
    }
    Text(text="Multiplicación")
    TextField(value = numberOneMulti.toString(), onValueChange ={
        numberOneMulti = checkWroteNumber(it)
    }, label = {
        Text(text = "Primer Numero")
    }, placeholder = {
        Text(text = "Por Favor escribe un número")
    }, leadingIcon = {
        Icon(imageVector = Icons.Default.Star, contentDescription = "Icono de Estrella")
    }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
    Spacer(modifier = Modifier.height(16.dp))
    OutlinedTextField(value = numberTwoMulti.toString(), onValueChange ={
        numberTwoMulti = checkWroteNumber(it)
    }, label = {
        Text(text = "Segundo Numero")
    }, placeholder = {
        Text(text = "Por Favor escribe un número")
    }, leadingIcon = {
        Icon(imageVector = Icons.Default.Star, contentDescription = "Icono de Estrella")
    }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
    Button(onClick={
        resultadoMulti = (numberOneMulti * numberTwoMulti).toString()

    }){
        Text(text = "Mutiplicar")
    }
    Text(text = resultadoMulti)
}



fun checkWroteNumber(text: String):Int{
    if (text.toIntOrNull() != null) {
        return text.toInt()
    }else if (TextUtils.isEmpty(text)){
        return 0
    }
    return 1
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AritmeticaTheme {
        ArithmeticScreen()
    }
}