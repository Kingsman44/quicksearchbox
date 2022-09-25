package com.google.android.libraries.geller.p1818f;

import com.google.common.base.C58837ba;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protos.p5129p.p5130a.C65719d;
import com.google.protos.p5129p.p5130a.C65720e;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65813cq;

/* renamed from: com.google.android.libraries.geller.f.bz */
/* compiled from: PG */
public final /* synthetic */ class C21843bz implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C21846cb f60283a;

    /* renamed from: b */
    public final /* synthetic */ C65753ak f60284b;

    /* renamed from: c */
    public final /* synthetic */ C65813cq f60285c;

    /* renamed from: d */
    public final /* synthetic */ boolean f60286d;

    /* renamed from: e */
    public final /* synthetic */ String f60287e;

    /* renamed from: f */
    public final /* synthetic */ String f60288f;

    /* renamed from: g */
    public final /* synthetic */ String f60289g;

    /* renamed from: h */
    public final /* synthetic */ int f60290h;

    public /* synthetic */ C21843bz(C21846cb cbVar, C65753ak akVar, C65813cq cqVar, int i, boolean z, String str, String str2, String str3) {
        this.f60283a = cbVar;
        this.f60284b = akVar;
        this.f60285c = cqVar;
        this.f60290h = i;
        this.f60286d = z;
        this.f60287e = str;
        this.f60288f = str2;
        this.f60289g = str3;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx b;
        C21846cb cbVar = this.f60283a;
        C65753ak akVar = this.f60284b;
        C65813cq cqVar = this.f60285c;
        int i = this.f60290h;
        boolean z = this.f60286d;
        String str = this.f60287e;
        String str2 = this.f60288f;
        String str3 = this.f60289g;
        synchronized (cbVar.f60298a) {
            cbVar.f60300c.remove(akVar);
            C65719d dVar = (C65719d) C65720e.f178550l.createBuilder();
            dVar.mo59419b(akVar);
            dVar.copyOnWrite();
            C65720e eVar = (C65720e) dVar.instance;
            eVar.f178555e = cqVar.f178923h;
            eVar.f178552a |= 2;
            dVar.copyOnWrite();
            C65720e eVar2 = (C65720e) dVar.instance;
            eVar2.f178556f = i - 1;
            eVar2.f178552a |= 4;
            dVar.copyOnWrite();
            C65720e eVar3 = (C65720e) dVar.instance;
            eVar3.f178557g = 3;
            eVar3.f178552a |= 8;
            dVar.copyOnWrite();
            C65720e eVar4 = (C65720e) dVar.instance;
            eVar4.f178552a |= 16;
            eVar4.f178558h = z;
            String g = C58837ba.m90858g(str);
            dVar.copyOnWrite();
            C65720e eVar5 = (C65720e) dVar.instance;
            eVar5.f178552a |= 32;
            eVar5.f178559i = g;
            String g2 = C58837ba.m90858g((String) null);
            dVar.copyOnWrite();
            C65720e eVar6 = (C65720e) dVar.instance;
            eVar6.f178552a |= 64;
            eVar6.f178560j = g2;
            String g3 = C58837ba.m90858g(str2);
            dVar.copyOnWrite();
            C65720e eVar7 = (C65720e) dVar.instance;
            eVar7.f178552a |= 128;
            eVar7.f178561k = g3;
            if (str3 != null) {
                dVar.copyOnWrite();
                C65720e eVar8 = (C65720e) dVar.instance;
                eVar8.f178552a |= 1;
                eVar8.f178554d = str3;
            }
            b = cbVar.mo27145b((C65720e) dVar.build());
        }
        return b;
    }
}
