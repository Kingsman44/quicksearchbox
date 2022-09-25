package com.google.android.libraries.search.p3055n.p3056a.p3057a;

import androidx.p104d.p105a.C2164c;
import com.google.android.p3523p.p3524a.C45020e;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.n.a.a.g */
/* compiled from: PG */
final class C39248g implements C70862aj {

    /* renamed from: a */
    private final C2164c f103387a;

    public C39248g(C2164c cVar) {
        this.f103387a = cVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        C58838bb.m90884s(!this.f103387a.mo5438c(), "unexpected completer cancellation");
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C39250i.f103388a.mo56225c()).mo56382g(th)).mo56372aa(53393)).mo56386p("ClientInfoStreamObserver#onError");
        C58838bb.m90884s(!this.f103387a.mo5439d(th), "unexpected completer exception");
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C58838bb.m90884s(this.f103387a.mo5437b((C45020e) obj), "already assigned a ClientInfo to the completer");
    }
}
