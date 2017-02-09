/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyfile.implementation;

import fixtures.bodyfile.AutoRestSwaggerBATFileService;
import fixtures.bodyfile.Files;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.RestClient;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Initializes a new instance of the AutoRestSwaggerBATFileService class.
 */
public class AutoRestSwaggerBATFileServiceImpl extends ServiceClient implements AutoRestSwaggerBATFileService {

    /**
     * The Files object to access its operations.
     */
    private Files files;

    /**
     * Gets the Files object to access its operations.
     * @return the Files object.
     */
    public Files files() {
        return this.files;
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATFileService client.
     */
    public AutoRestSwaggerBATFileServiceImpl() {
        this("http://localhost");
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATFileService client.
     *
     * @param baseUrl the base URL of the host
     */
    public AutoRestSwaggerBATFileServiceImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATFileService client.
     *
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public AutoRestSwaggerBATFileServiceImpl(OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        this("http://localhost", clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATFileService client.
     *
     * @param baseUrl the base URL of the host
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public AutoRestSwaggerBATFileServiceImpl(String baseUrl, OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        super(baseUrl, clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATFileService client.
     *
     * @param restClient the REST client containing pre-configured settings
     */
    public AutoRestSwaggerBATFileServiceImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        this.files = new FilesImpl(retrofit(), this);
    }
}
