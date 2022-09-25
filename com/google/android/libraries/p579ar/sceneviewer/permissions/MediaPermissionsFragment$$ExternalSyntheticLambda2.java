package com.google.android.libraries.p579ar.sceneviewer.permissions;

/* renamed from: com.google.android.libraries.ar.sceneviewer.permissions.MediaPermissionsFragment$$ExternalSyntheticLambda2 */
/* compiled from: PG */
public final /* synthetic */ class MediaPermissionsFragment$$ExternalSyntheticLambda2 implements Runnable {
    public /* synthetic */ PermissionsCallback f$0;

    public /* synthetic */ MediaPermissionsFragment$$ExternalSyntheticLambda2(PermissionsCallback permissionsCallback) {
        this.f$0 = permissionsCallback;
    }

    public final void run() {
        this.f$0.onPermissionsCheckSuccess();
    }
}
