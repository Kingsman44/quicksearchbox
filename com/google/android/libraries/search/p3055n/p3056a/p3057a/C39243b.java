package com.google.android.libraries.search.p3055n.p3056a.p3057a;

import com.google.android.p3523p.p3524a.C45020e;
import com.google.android.p3523p.p3524a.C45023h;
import com.google.android.p3523p.p3524a.C45024i;
import com.google.common.base.C58838bb;
import com.google.speech.p5218j.C67087ko;
import java.util.concurrent.Callable;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.n.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C39243b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C39250i f103377a;

    /* renamed from: b */
    public final /* synthetic */ C67087ko f103378b;

    public /* synthetic */ C39243b(C39250i iVar, C67087ko koVar) {
        this.f103377a = iVar;
        this.f103378b = koVar;
    }

    public final Object call() {
        C39250i iVar = this.f103377a;
        C67087ko koVar = this.f103378b;
        int i = iVar.f103393f;
        boolean z = i == 3;
        if (i != 0) {
            C58838bb.m90884s(z, "Cannot push SodaEvent unless connected.");
            C45023h hVar = (C45023h) C45024i.f117638d.createBuilder();
            hVar.copyOnWrite();
            C45024i iVar2 = (C45024i) hVar.instance;
            koVar.getClass();
            iVar2.f117641b = koVar;
            iVar2.f117640a |= 1;
            C45020e eVar = (C45020e) iVar.f103391d.get();
            hVar.copyOnWrite();
            C45024i iVar3 = (C45024i) hVar.instance;
            eVar.getClass();
            iVar3.f117642c = eVar;
            iVar3.f117640a |= 2;
            ((C70862aj) iVar.f103392e.get()).mo20123c((C45024i) hVar.build());
            return null;
        }
        throw null;
    }
}
