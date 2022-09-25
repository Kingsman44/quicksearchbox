package com.google.android.libraries.p579ar.sceneviewer.permissions;

import android.content.DialogInterface;

/* renamed from: com.google.android.libraries.ar.sceneviewer.permissions.PermissionUtilities$$ExternalSyntheticLambda8 */
/* compiled from: PG */
public final /* synthetic */ class PermissionUtilities$$ExternalSyntheticLambda8 implements DialogInterface.OnClickListener {
    public /* synthetic */ Runnable f$0;

    public /* synthetic */ PermissionUtilities$$ExternalSyntheticLambda8(Runnable runnable) {
        this.f$0 = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f$0.run();
    }
}
