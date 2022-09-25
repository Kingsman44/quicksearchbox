package com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.k */
/* compiled from: PG */
public enum C112976k {
    UNKNOWN('?', "unknown"),
    SUGGESTION_FETCH('A', "Suggestion fetching"),
    DATA_SOURCE_FETCH('B', "All Data Source fetching"),
    TAPAS_SERVER_SOURCE('C', "TapasServerSource"),
    TAPAS_SERVER_FETCHER('D', "TapasServerFetcher"),
    TAPAS_SEARCH('E', "TapasSearch"),
    S3_STREAMING_REQUEST('F', "S3 request - streaming (client side)"),
    S3_REQUEST_HANDLER('G', "S3 request handler (server side)"),
    TAPAS_SERVICE_REQUEST('H', "Tapas Service Request (S3 side)"),
    TAPAS_SERVICE_HANDLER('I', "Tapas Service Request (service side)"),
    CORTEX_SERVICE_REQUEST('J', "Cortex Service Request (Tapas service side)"),
    CORTEX_SERVICE_HANDLER('K', "Cortex Service Request (Cortex side)"),
    ON_DEVICE_RANKING('R', "On-device ranking"),
    S3_UNARY_REQUEST('U', "S3 request - unary (client side)"),
    S3_INITIAL_STREAMING_REQUEST('S', "S3 request - initial streaming (client side)");
    

    /* renamed from: p */
    public final char f313079p;

    /* renamed from: q */
    public final String f313080q;

    private C112976k(char c, String str) {
        this.f313079p = c;
        this.f313080q = str;
    }
}
