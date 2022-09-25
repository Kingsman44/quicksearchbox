package com.google.android.libraries.p579ar.sceneviewer.permissions;

import android.content.Context;
import android.content.DialogInterface;

/* renamed from: com.google.android.libraries.ar.sceneviewer.permissions.PermissionUtilities$$ExternalSyntheticLambda3 */
/* compiled from: PG */
public final /* synthetic */ class PermissionUtilities$$ExternalSyntheticLambda3 implements DialogInterface.OnClickListener {
    public /* synthetic */ Context f$0;

    public /* synthetic */ PermissionUtilities$$ExternalSyntheticLambda3(Context context) {
        this.f$0 = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        PermissionUtilities.launchPermissionSettings(this.f$0);
    }
}
