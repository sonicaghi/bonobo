package models

import play.api.libs.json.Json

case class BonoboKeys
(Id: String,
 key: String,
 email: String,
 name: String,
 surname: String,
 company: String,
 url: String,
 requests_per_day: Int,
 requests_per_minute: Int,
 tier: String,
 status: String,
 created_at: Long)

case class ConsumerInput(id: String, created_at: Long)

object ConsumerInput {
 implicit val consumerRead = Json.reads[ConsumerInput]
}
