package com.google.p3723ar.core.exceptions;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.ar.core.exceptions.GooglePlayServicesLocationLibraryNotLinkedException */
/* compiled from: PG */
public class GooglePlayServicesLocationLibraryNotLinkedException extends UnsupportedConfigurationException {
    public GooglePlayServicesLocationLibraryNotLinkedException() {
        this(BuildConfig.FLAVOR);
    }

    public GooglePlayServicesLocationLibraryNotLinkedException(String str) {
        super("The Google Fused Location Provider for Android classes must be linked into the app's binary when calling Session.configure() with Geospatial mode enabled (Config.GeospatialMode.ENABLED). ".concat(String.valueOf(str)));
    }
}
