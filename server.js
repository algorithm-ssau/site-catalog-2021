const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser')

const app = express();

// BodyParser Middleware
app.use(bodyParser.json());

// DB config
const dbURI = require('./config/keys').mongoURI;

// Connect to Mongo
const MongoClient = require('mongodb').MongoClient;
const client = new MongoClient(dbURI, { useNewUrlParser: true, useUnifiedTopology: true });
client.connect()
    .then(() => console.log('MongoDB connected...'))
    .catch(err => console.log(err));

// Connect to Mongo v.2 (deprecated)
// mongoose.connect(dbURI)
//     .then(() => console.log('MongoDB connected...'))
//     .catch(err => console.log(err));

const port = process.env.PORT || 5000;

app.listen(port, () => console.log(`Server started on port ${port}`));