package com.google.android.apps.search.assistant.platform.appintegration.p9001g;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.g.k */
/* compiled from: PG */
final class C119560k implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f333220a;

    /* renamed from: b */
    final /* synthetic */ C119561l f333221b;

    public C119560k(C119561l lVar, String str) {
        this.f333221b = lVar;
        this.f333220a = str;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C119561l.f333222a.mo56226d()).mo56382g(th)).mo56372aa(34535)).mo56389s("Future [%s] FAILED", this.f333220a);
        this.f333221b.f333228g.mo104427a(th);
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        ((C59052c) ((C59052c) C119561l.f333222a.mo56224b()).mo56372aa(34536)).mo56389s("Future [%s] SUCCESS", this.f333220a);
    }
}
