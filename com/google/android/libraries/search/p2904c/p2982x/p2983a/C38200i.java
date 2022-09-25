package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.android.libraries.search.p2904c.C37641gt;
import com.google.android.libraries.search.p2904c.C37678hy;
import com.google.android.libraries.search.p2904c.C37679hz;
import com.google.android.libraries.search.p2904c.p2982x.C38220ac;
import com.google.android.libraries.search.p2904c.p2982x.C38221ad;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.c.x.a.i */
/* compiled from: PG */
final class C38200i implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C70862aj f101247a;

    /* renamed from: b */
    final /* synthetic */ int f101248b;

    public C38200i(C70862aj ajVar, int i) {
        this.f101247a = ajVar;
        this.f101248b = i;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) C38203l.f101252a.mo56226d()).mo56372aa(52992)).mo56387q("#audio# Failed to get AudioInterceptResult. sessionToken: %d", this.f101248b);
        this.f101247a.mo20122b(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C37641gt gtVar = (C37641gt) obj;
        C70862aj ajVar = this.f101247a;
        C38220ac acVar = (C38220ac) C38221ad.f101300d.createBuilder();
        C37678hy hyVar = (C37678hy) C37679hz.f100067c.createBuilder();
        int i = this.f101248b;
        hyVar.copyOnWrite();
        C37679hz hzVar = (C37679hz) hyVar.instance;
        hzVar.f100069a |= 1;
        hzVar.f100070b = i;
        C37679hz hzVar2 = (C37679hz) hyVar.build();
        acVar.copyOnWrite();
        C38221ad adVar = (C38221ad) acVar.instance;
        hzVar2.getClass();
        adVar.f101303b = hzVar2;
        adVar.f101302a |= 1;
        acVar.copyOnWrite();
        C38221ad adVar2 = (C38221ad) acVar.instance;
        gtVar.getClass();
        adVar2.f101304c = gtVar;
        adVar2.f101302a |= 2;
        ajVar.mo20123c((C38221ad) acVar.build());
        this.f101247a.mo20121a();
    }
}
