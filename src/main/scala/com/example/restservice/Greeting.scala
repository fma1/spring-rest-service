package com.example.restservice

import scala.beans.BeanProperty

case class Greeting(@BeanProperty id: Long, @BeanProperty content: String)
