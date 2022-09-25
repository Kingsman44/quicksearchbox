package com.google.android.gms.common.internal;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.os.Build;
import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.y */
/* compiled from: PG */
public abstract class C143954y implements DialogInterface.OnClickListener {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo119482a();

    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo119482a();
        } catch (ActivityNotFoundException e) {
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains("generic")) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", str, e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
