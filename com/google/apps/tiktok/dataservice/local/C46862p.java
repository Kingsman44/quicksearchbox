package com.google.apps.tiktok.dataservice.local;

/* renamed from: com.google.apps.tiktok.dataservice.local.p */
/* compiled from: PG */
final class C46862p extends IllegalStateException {
    public C46862p() {
        super("Calls to subscribe() should only be made by user action, from callbacks like click handlers. To set up a \"first load\" for a LocalDataSource subscription, use the `register()` overload that accepts an `initialLocalDataSource parameter. The `initialLocalDataSource` will be loaded from when the Lifecycle reaches STARTED for the first time.");
    }
}
