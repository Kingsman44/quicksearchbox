package com.google.android.libraries.mdi.download.p2248h;

import android.util.Log;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.common.base.C58885cv;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.mdi.download.h.bv */
/* compiled from: PG */
final class C29601bv implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C29603bx f80182a;

    public C29601bv(C29603bx bxVar) {
        this.f80182a = bxVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        Log.e("SingleDataFileGroupPop", "Failed to add file group", th);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        String str = ((C28708an) ((C58885cv) this.f80182a.f80185a).f156729a).f77997b;
        if (((Boolean) obj).booleanValue()) {
            Log.d("SingleDataFileGroupPop", "Added file group ".concat(String.valueOf(str)));
        } else {
            Log.e("SingleDataFileGroupPop", "Failed to add file group ".concat(String.valueOf(str)));
        }
    }
}
