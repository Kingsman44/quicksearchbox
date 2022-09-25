package com.google.android.apps.gsa.staticplugins.p7699cq;

import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58887cx;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.cq.f */
/* compiled from: PG */
final class C98513f implements C22868d {

    /* renamed from: a */
    final /* synthetic */ Runnable f275079a;

    /* renamed from: b */
    final /* synthetic */ String f275080b;

    public C98513f(Runnable runnable, String str) {
        this.f275079a = runnable;
        this.f275080b = str;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C58887cx.m90979f(th, Error.class);
        C59104x c = C98514g.f275081a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "PronLearningWorker");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(30701)).mo56389s("Failed to get %s signal", this.f275080b);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        if (((C58833ax) obj).mo56113h()) {
            this.f275079a.run();
        }
    }
}
