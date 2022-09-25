package com.google.android.libraries.onegoogle.accountmenu;

import com.google.android.libraries.onegoogle.p2380c.C30860b;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.protos.p4868ao.p4869a.p4870a.C63643a;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.aa */
/* compiled from: PG */
public final /* synthetic */ class C30289aa implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30317ag f81918a;

    /* renamed from: b */
    public final /* synthetic */ Object f81919b;

    /* renamed from: c */
    public final /* synthetic */ int f81920c;

    public /* synthetic */ C30289aa(C30317ag agVar, Object obj, int i) {
        this.f81918a = agVar;
        this.f81919b = obj;
        this.f81920c = i;
    }

    public final void run() {
        C30317ag agVar = this.f81918a;
        Object obj = this.f81919b;
        int i = this.f81920c;
        C58485gu b = agVar.f81983a.mo35858i().f81934a.mo35794b();
        C58833ax l = agVar.f81983a.mo35860k().mo36179l();
        agVar.f81983a.mo35852b();
        Object g = C30317ag.m56477g(b, obj, i, l);
        if (!agVar.mo35883a(g, obj)) {
            agVar.mo35885c(i);
            C30860b m = agVar.f81983a.mo35862m();
            int i2 = i == 3 ? 40 : 39;
            C63643a aVar = (C63643a) C63644b.f172119g.createBuilder();
            aVar.copyOnWrite();
            C63644b bVar = (C63644b) aVar.instance;
            bVar.f172123c = 8;
            bVar.f172121a |= 2;
            aVar.copyOnWrite();
            C63644b bVar2 = (C63644b) aVar.instance;
            bVar2.f172125e = 10;
            bVar2.f172121a |= 32;
            aVar.copyOnWrite();
            C63644b bVar3 = (C63644b) aVar.instance;
            bVar3.f172124d = 3;
            bVar3.f172121a |= 8;
            aVar.copyOnWrite();
            C63644b bVar4 = (C63644b) aVar.instance;
            bVar4.f172122b = i2 - 1;
            bVar4.f172121a |= 1;
            m.mo35875a(obj, (C63644b) aVar.build());
            agVar.f81983a.mo35858i().f81934a.mo35796e(g);
        }
    }
}
