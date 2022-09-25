package com.google.android.libraries.mdi.download.p2248h;

import android.util.Log;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.phenotype.client.C31654aj;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.mdi.download.h.bl */
/* compiled from: PG */
final class C29591bl implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C31654aj f80165a;

    public C29591bl(C31654aj ajVar) {
        this.f80165a = ajVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        Log.e("PhFileGroupPop", "Failed to add file group", th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        String str = ((C28708an) this.f80165a.mo37303b()).f77997b;
        if (((Boolean) obj).booleanValue()) {
            Log.d("PhFileGroupPop", "Added file groups ".concat(String.valueOf(str)));
        } else {
            Log.e("PhFileGroupPop", "Failed to add file group ".concat(String.valueOf(str)));
        }
    }
}
