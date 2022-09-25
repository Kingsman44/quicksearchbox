package com.google.android.libraries.p579ar.sceneviewer.permissions;

import androidx.activity.result.C0815b;
import java.util.Map;

/* renamed from: com.google.android.libraries.ar.sceneviewer.permissions.MediaPermissionsFragment$$ExternalSyntheticLambda0 */
/* compiled from: PG */
public final /* synthetic */ class MediaPermissionsFragment$$ExternalSyntheticLambda0 implements C0815b {
    public /* synthetic */ PermissionsCallback f$0;

    public /* synthetic */ MediaPermissionsFragment$$ExternalSyntheticLambda0(PermissionsCallback permissionsCallback) {
        this.f$0 = permissionsCallback;
    }

    public final void onActivityResult(Object obj) {
        this.f$0.onRequestPermissionsResult((Map) obj);
    }
}
