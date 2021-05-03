chmod 777 ./frontend/start.sh
chmod 777 ./backend/start.sh

cd frontend
sh ./start.sh &
cd ../backend
sh ./start.sh