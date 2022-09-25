package com.google.p3723ar.core.exceptions;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.ar.core.exceptions.FineLocationPermissionNotGrantedException */
/* compiled from: PG */
public class FineLocationPermissionNotGrantedException extends SecurityException {
    public FineLocationPermissionNotGrantedException() {
        this(BuildConfig.FLAVOR);
    }

    public FineLocationPermissionNotGrantedException(String str) {
        super("The Android permission ACCESS_FINE_LOCATION has not been granted prior to calling Session.configure() with Geospatial mode enabled (Config.GeospatialMode.ENABLED).".concat(String.valueOf(str)));
    }
}
