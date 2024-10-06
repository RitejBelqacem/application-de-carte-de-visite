package com.example.applicationdecartedevisite

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.filled.Email

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.applicationdecartedevisite.ui.theme.ApplicationDeCarteDeVisiteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ApplicationDeCarteDeVisiteTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CarteVisite(
                        modifier = Modifier.padding(innerPadding)
                    )
            }
        }
    }
}
@Composable
fun CarteVisite(modifier: Modifier = Modifier)
{
    Column(
        modifier= Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(modifier = Modifier.weight(1f))
        Profile()
        Spacer(modifier = Modifier.weight(1f))
        Contact()

    }
}


@Composable
fun Profile(modifier: Modifier = Modifier)
{
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        val image = painterResource(R.drawable.android_logo)
        Box(
            modifier= Modifier
                .size(100.dp)
                .background(Color.Black)

        )
        {
            Image(
            painter = image,
            contentDescription = null,
            modifier= Modifier
                .width(100.dp)
                .height(80.dp)

            )}
        Text(
            text=stringResource(R.string.nom),
            style= MaterialTheme.typography.headlineMedium.copy(
                fontWeight=FontWeight.Bold

            )
        )
        Text(
            text=stringResource(R.string.fonction),
            style=MaterialTheme.typography.bodyLarge
        )

    }
}

@Composable
fun Contact(modifier: Modifier = Modifier) {

    Column (horizontalAlignment = Alignment.Start){
       Row(verticalAlignment=Alignment.CenterVertically)
       {

           Icon(
               imageVector = Icons.Default.Phone,
               contentDescription = stringResource(R.string.tel_label),
               tint = Color.Green,
               modifier = Modifier.size(24.dp)
           )
           Text(
               text=stringResource(R.string.tel)
           )
       }
        Row(verticalAlignment=Alignment.CenterVertically)
        {
            Icon(
                imageVector = Icons.Default.Phone,
                contentDescription = stringResource(R.string.web_label),
                tint = Color.Green,
                modifier = Modifier.size(24.dp)
            )
            Text(
                text=stringResource(R.string.web)
            )
        }
        Row(verticalAlignment=Alignment.CenterVertically)
        {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = stringResource(R.string.email_label),
                tint = Color.Green,
                modifier = Modifier.size(24.dp)
            )
            Text(
                modifier=Modifier.width(250.dp),
                text=stringResource(R.string.email)
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ApplicationDeCarteDeVisiteTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
        )
        {
            CarteVisite()
        }
    }
}}