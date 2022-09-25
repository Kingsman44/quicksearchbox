package com.google.android.libraries.onegoogle.owners.mdi;

import android.graphics.Bitmap;
import android.util.Log;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.onegoogle.owners.mdi.q */
/* compiled from: PG */
final class C31002q implements C60845bz {
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (!(th instanceof MdiNotAvailableException)) {
            Log.w("OneGoogle", "Failed to load owner avatar", th);
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
    }
}
