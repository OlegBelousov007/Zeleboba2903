package com.example.zeleboba2903.ui.theme.bottom_navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.zeleboba2903.R


@Composable
fun LoginScreen(onClick: () -> Unit) {
    var textLogin by remember { mutableStateOf("") }
    var textPassword by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.linearGradient(
                    listOf(
                        Color(0xFFE7D9B4),
                        Color(0xFFE6C88E),
                        Color(0xFFDDB85B)
                    )
                )
            )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = "Recipes from grandma", fontSize = 36.sp, color = Color(0xFFD86129), fontStyle = FontStyle.Italic)
        }

        Row(
            modifier = Modifier
                .fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Column( modifier = Modifier
                .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
                Text(
                    text = "Log in",
                    fontSize = 36.sp,
                    color = Color.Black
                )
                OutlinedTextField(
                    value = textLogin,
                    onValueChange = { textLogin = it },
                    label = { Text("Login") },
                    modifier = Modifier
                        .padding(10.dp),
                    shape = RoundedCornerShape(30.dp)
                )
                OutlinedTextField(
                    value = textPassword,
                    onValueChange = { textPassword = it },
                    label = { Text("Password") },
                    visualTransformation = PasswordVisualTransformation(),
                    modifier = Modifier
                        .padding(10.dp),
                    shape = RoundedCornerShape(30.dp)
                )
                Button(modifier = Modifier
                    .padding(10.dp)
                    .width(120.dp)
                    .height(60.dp),
                    onClick = { onClick() }) {
                    Text(text = "GO", color = Color(0xFFD86129))

                }
            }

        }
    }
}

@Composable
fun Screen1() {
    Column() {
        Row(modifier = Modifier
            .padding(15.dp, 20.dp, 0.dp, 0.dp)) {
            Text(text = "Top Categories", fontWeight = FontWeight.Black, fontSize = 24.sp)
        }
        Row(modifier = Modifier
            .padding(10.dp)) {
            Column {
                Card(
                    modifier = Modifier
                        .padding(10.dp)
                        .width(100.dp)
                        .height(100.dp)
                        .background(Color.White)
                        .clickable {
                        }) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxSize(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.supchick),
                                contentDescription = "image",
                                modifier = Modifier
                                    .width(120.dp)
                                    .height(120.dp)
                            )
                        }
                    }
                }
            }
            Column {

                Card(
                    modifier = Modifier
                        .padding(10.dp)
                        .width(100.dp)
                        .height(100.dp)
                        .background(Color.White)
                        .clickable {
                        }) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxSize(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.zarennoe),
                                contentDescription = "image",
                                modifier = Modifier
                                    .width(120.dp)
                                    .height(120.dp)
                            )
                        }
                    }
                }
            }
            Column {
                Card(
                    modifier = Modifier
                        .padding(10.dp)
                        .width(100.dp)
                        .height(100.dp)
                        .background(Color.White)
                        .clickable {
                        }) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxSize(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.torti),
                                contentDescription = "image",
                                modifier = Modifier
                                    .width(120.dp)
                                    .height(120.dp)
                            )
                        }
                    }
                }
            }
        }
        Row(modifier = Modifier
            .padding(15.dp, 20.dp, 0.dp, 0.dp)) {
            Text(text = "Recommended", fontWeight = FontWeight.Black, fontSize = 24.sp)
        }
        Column {
            Row(modifier = Modifier
                .padding(15.dp, 20.dp, 0.dp, 0.dp)) {
                Card(
                    modifier = Modifier
                        .padding(start = 5.dp, top = 5.dp, end = 5.dp)
                        .width(350.dp)
                        .height(350.dp)
                        .background(Color.White)
                        .clickable {
                        }) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Row(modifier = Modifier
                            .padding(5.dp)
                        ) {
                            Text(text = "Recipe", fontWeight = FontWeight.Bold)
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxSize(),
                            verticalAlignment = Alignment.Top,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.torti),
                                contentDescription = "image",
                                modifier = Modifier
                                    .width(200.dp)
                                    .height(200.dp)
                            )
                        }

                    }
                }
            }
        }

    }
}

@Composable
fun Screen2() {
    Row(modifier = Modifier
        .verticalScroll(rememberScrollState())) {
        Column {
            Card(
                modifier = Modifier
                    .padding(10.dp)
                    .width(180.dp)
                    .height(180.dp)
                    .background(Color.White)
                    .clickable {
                    }) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.sirnic),
                            contentDescription = "image",
                            modifier = Modifier
                                .width(180.dp)
                                .height(180.dp)
                        )
                        Button(modifier = Modifier
                            .width(10.dp)
                            .height(10.dp)
                            .background(Color.Red)
                            .padding(start = 1.dp, top = 1.dp),
                            onClick = {}) {

                        }
                    }
                }
            }
            Card(
                modifier = Modifier
                    .padding(10.dp)
                    .width(180.dp)
                    .height(180.dp)
                    .background(Color.White)
                    .clickable {
                    }) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.pirozokskapystoi),
                            contentDescription = "image",
                            modifier = Modifier
                                .width(180.dp)
                                .height(180.dp)
                        )
                    }
                }
            }
            Card(
                modifier = Modifier
                    .padding(10.dp)
                    .width(180.dp)
                    .height(180.dp)
                    .background(Color.White)
                    .clickable {
                    }) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.pelmeni),
                            contentDescription = "image",
                            modifier = Modifier
                                .width(180.dp)
                                .height(180.dp)
                        )
                    }
                }
            }
            Card(
                modifier = Modifier
                    .padding(10.dp)
                    .width(180.dp)
                    .height(180.dp)
                    .background(Color.White)
                    .clickable {
                    }) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.karbonara),
                            contentDescription = "image",
                            modifier = Modifier
                                .width(180.dp)
                                .height(180.dp)
                        )
                    }
                }
            }
        }
        Column {
            Card(
                modifier = Modifier
                    .padding(10.dp)
                    .width(180.dp)
                    .height(180.dp)
                    .background(Color.White)
                    .clickable {
                    }) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.pomodoriogyrci),
                            contentDescription = "image",
                            modifier = Modifier
                                .width(180.dp)
                                .height(180.dp)
                        )
                    }
                }
            }
            Card(
                modifier = Modifier
                    .padding(10.dp)
                    .width(180.dp)
                    .height(180.dp)
                    .background(Color.White)
                    .clickable {
                    }) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.iaechnicaskolbasoi),
                            contentDescription = "image",
                            modifier = Modifier
                                .width(180.dp)
                                .height(180.dp)
                        )
                    }
                }
            }
            Card(
                modifier = Modifier
                    .padding(10.dp)
                    .width(180.dp)
                    .height(180.dp)
                    .background(Color.White)
                    .clickable {
                    }) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.chockolatetortick),
                            contentDescription = "image",
                            modifier = Modifier
                                .width(180.dp)
                                .height(180.dp)
                        )
                    }
                }
            }
            Card(
                modifier = Modifier
                    .padding(10.dp)
                    .width(180.dp)
                    .height(180.dp)
                    .background(Color.White)
                    .clickable {
                    }) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.chivapchichi),
                            contentDescription = "image",
                            modifier = Modifier
                                .width(180.dp)
                                .height(180.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Screen3() {
    Text(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentHeight(),
        text = "Screen 3",
        textAlign = TextAlign.Center
    )
}

@Composable
fun Screen4() {
    Column {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(all = 8.dp)) {
            Image(
                painter = painterResource(R.drawable.photoprofile),
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .border(1.5.dp, MaterialTheme.colorScheme.primary, CircleShape)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Column {
                Text(
                    text = "Oleg",
                    color = MaterialTheme.colorScheme.secondary
                )
                Spacer(modifier = Modifier.height(4.dp))

                Text(text = "zeleboba007@mail.ru")

                Spacer(modifier = Modifier.height(30.dp))

            }
        }
        Row(modifier = Modifier
            .fillMaxWidth()
        ) {
            Button( modifier = Modifier
                .fillMaxWidth()
                .height(45.dp),
                onClick = { /*TODO*/ }) {
                Text(text = "View data")
            }
            Spacer(modifier = Modifier.height(60.dp))
        }
        Row(modifier = Modifier
            .fillMaxWidth()
        ) {
            Button( modifier = Modifier
                .fillMaxWidth()
                .height(45.dp),
                onClick = { /*TODO*/ }) {
                Text(text = "Your recipes")
            }
            Spacer(modifier = Modifier.height(60.dp))
        }
    }
}