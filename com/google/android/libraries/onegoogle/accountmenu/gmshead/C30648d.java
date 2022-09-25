package com.google.android.libraries.onegoogle.accountmenu.gmshead;

import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.libraries.onegoogle.p2378b.C30829f;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.gmshead.d */
/* compiled from: PG */
final class C30648d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C30829f f82744a;

    public C30648d(C30829f fVar) {
        this.f82744a = fVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        Log.w("AvatarRetriever", "Failed to load avatar.", th);
        this.f82744a.mo35687a((Bitmap) null);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        this.f82744a.mo35687a((Bitmap) obj);
    }
}
