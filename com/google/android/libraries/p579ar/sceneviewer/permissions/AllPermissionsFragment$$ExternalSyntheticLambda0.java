package com.google.android.libraries.p579ar.sceneviewer.permissions;

/* renamed from: com.google.android.libraries.ar.sceneviewer.permissions.AllPermissionsFragment$$ExternalSyntheticLambda0 */
/* compiled from: PG */
public final /* synthetic */ class AllPermissionsFragment$$ExternalSyntheticLambda0 implements Runnable {
    public /* synthetic */ PermissionsCallback f$0;

    public /* synthetic */ AllPermissionsFragment$$ExternalSyntheticLambda0(PermissionsCallback permissionsCallback) {
        this.f$0 = permissionsCallback;
    }

    public final void run() {
        this.f$0.onPermissionsCheckSuccess();
    }
}
