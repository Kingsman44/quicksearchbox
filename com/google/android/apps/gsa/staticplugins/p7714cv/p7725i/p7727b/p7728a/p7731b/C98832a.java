package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7728a.p7731b;

import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.base.C58887cx;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.a.b.a */
/* compiled from: PG */
final class C98832a implements C22868d {

    /* renamed from: a */
    final /* synthetic */ Query f276122a;

    /* renamed from: b */
    final /* synthetic */ C98847c f276123b;

    public C98832a(C98847c cVar, Query query) {
        this.f276123b = cVar;
        this.f276122a = query;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C58887cx.m90979f(th, Error.class);
        C59104x c = C98847c.f276205a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "VoiceSearchFetcher");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(31158)).mo56386p("Failed to get ConnectivityContext");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        this.f276123b.f276206b.mo78938d(this.f276122a, (C89061q) obj);
    }
}
