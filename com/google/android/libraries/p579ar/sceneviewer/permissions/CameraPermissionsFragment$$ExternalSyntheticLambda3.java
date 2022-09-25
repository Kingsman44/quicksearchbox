package com.google.android.libraries.p579ar.sceneviewer.permissions;

/* renamed from: com.google.android.libraries.ar.sceneviewer.permissions.CameraPermissionsFragment$$ExternalSyntheticLambda3 */
/* compiled from: PG */
public final /* synthetic */ class CameraPermissionsFragment$$ExternalSyntheticLambda3 implements Runnable {
    public /* synthetic */ PermissionsCallback f$0;

    public /* synthetic */ CameraPermissionsFragment$$ExternalSyntheticLambda3(PermissionsCallback permissionsCallback) {
        this.f$0 = permissionsCallback;
    }

    public final void run() {
        this.f$0.onPermissionsCheckSuccess();
    }
}
