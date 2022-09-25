package com.google.android.libraries.onegoogle.owners.mdi;

import android.util.Log;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.onegoogle.owners.mdi.a */
/* compiled from: PG */
final class C30979a implements C60845bz {
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        Log.w("OneGoogle", "Failed to grant account access to app", th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            Log.e("OneGoogle", "Failed to grant account access to app");
        }
    }
}
