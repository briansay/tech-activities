# JavaScript Dockerfile example

Below are some example instructions to build, run & push the image / container:

1. Ensure you are in the correct directory:

   ```bash
   cd <location_cloned>/tech-activities/2-containerise/javascript-dockerfile #Or whichever directory the .py file and Dockerfile are in
   ```

2. Build the container using docker build (or alternatives):

   ```bash
   docker build -t <enter_name> .
   ```

   e.g.:

   ```bash
   docker build -t javascript-hello-world .
   ```

   **Please note** not to forget the trailing `.` as this denotes the directory of the Dockerfile

3. Run the image using docker run (or alternatives):

   ```bash
   docker run -d -p <browser_port>:<container_port> <image_name>
   ```

   e.g.:

   ```bash
   docker run -d -p 3000:3000 javascript-hello-world
   ```

4. Confirm the container is running using docker ps:

   ```bash
   docker ps
   CONTAINER ID   IMAGE                                                   COMMAND                  CREATED         STATUS         PORTS                    NAMES
   9caf62d5059a   uk.icr.io/ce-interviews/javascript-hello-world:latest   "docker-entrypoint.s…"   8 seconds ago   Up 7 seconds   0.0.0.0:3000->3000/tcp   suspicious_dubinsky
   ```

5. **If using a hello world example** which exposes a port & displays info, access it locally using curl or a browser:

   ```bash
   curl http://localhost:<exposed_port>/
   ```

   e.g.

   ```bash
   curl http://localhost:3000/
   ```

6. Push to the IBM Cloud Container Registry (other registries available):

   Follow these instructions: [https://cloud.ibm.com/docs/Registry?topic=Registry-getting-started#gs_registry_images_pushing](https://cloud.ibm.com/docs/Registry?topic=Registry-getting-started#gs_registry_images_pushing)
