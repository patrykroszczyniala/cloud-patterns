from flask import Flask
from flask import Response

app = Flask(__name__)

@app.route('/hello')
def hello_world():
    return 'Hello from python app!'

@app.route('/health')
def healt_check():
    return Response('{"status":"UP"}', mimetype='application/json')

if __name__ == '__main__':
    app.run(debug=True,host='0.0.0.0')
