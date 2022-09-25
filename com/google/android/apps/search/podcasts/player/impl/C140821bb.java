package com.google.android.apps.search.podcasts.player.impl;

import android.graphics.Bitmap;
import androidx.media3.p174ui.C3647k;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60845bz;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.player.impl.bb */
/* compiled from: PG */
public final class C140821bb implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C140822bc f382436a;

    public C140821bb(C140822bc bcVar) {
        this.f382436a = bcVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) this.f382436a.f382438b.mo56226d()).mo56382g(th);
        String str = this.f382436a.f382439c;
        cVar.mo56379ah(new C59094n(41634));
        cVar.mo56389s("Couldn't load thumbnail %s", str);
        C140822bc bcVar = this.f382436a;
        bcVar.f382439c = null;
        bcVar.f382442f = null;
        bcVar.f382441e = null;
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C69664n.m101061g(bitmap, "result");
        C140822bc bcVar = this.f382436a;
        bcVar.f382440d = bitmap;
        C3647k kVar = bcVar.f382441e;
        if (kVar != null) {
            kVar.mo7690a(bitmap);
        }
        this.f382436a.f382437a.mo123342a();
        C140822bc bcVar2 = this.f382436a;
        bcVar2.f382442f = null;
        bcVar2.f382441e = null;
    }
}
