package com.google.android.libraries.search.p3055n.p3056a.p3057a;

import com.google.common.base.C58838bb;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.n.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C39242a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C39250i f103376a;

    public /* synthetic */ C39242a(C39250i iVar) {
        this.f103376a = iVar;
    }

    public final Object call() {
        C39250i iVar = this.f103376a;
        int i = iVar.f103393f;
        boolean z = i == 3;
        if (i != 0) {
            C58838bb.m90884s(z, "Cannot disconnect unless connected.");
            ((C70862aj) iVar.f103392e.get()).mo20121a();
            iVar.f103391d = Optional.empty();
            iVar.f103392e = Optional.empty();
            iVar.f103393f = 1;
            return null;
        }
        throw null;
    }
}
