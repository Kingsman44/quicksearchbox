package com.google.android.libraries.search.p2904c.p2967t.p2969b;

import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37400be;
import com.google.android.libraries.search.p2904c.C37401bf;
import com.google.android.libraries.search.p2904c.C37402bg;
import com.google.android.libraries.search.p2904c.C37453cb;
import com.google.android.libraries.search.p2904c.C37454cc;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.C37639gr;
import com.google.android.libraries.search.p2904c.C37679hz;
import com.google.android.libraries.search.p2904c.p2982x.C38232ao;
import com.google.android.libraries.search.p2904c.p2982x.C38233ap;
import com.google.android.libraries.search.p2904c.p2982x.C38246e;
import com.google.android.libraries.search.p2904c.p2982x.C38250i;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.search.c.t.b.p */
/* compiled from: PG */
public final class C38045p implements C37402bg {

    /* renamed from: b */
    private static final C59071e f100805b = C59071e.m91332i("com.google.android.libraries.search.c.t.b.p");

    /* renamed from: a */
    public final C60870cx f100806a;

    /* renamed from: c */
    private final C37639gr f100807c;

    /* renamed from: d */
    private final C37679hz f100808d;

    /* renamed from: e */
    private final C58881cr f100809e;

    /* renamed from: f */
    private final C38246e f100810f;

    public C38045p(C37639gr grVar, C37679hz hzVar, C37561eb ebVar, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C60870cx cxVar, C38246e eVar) {
        this.f100807c = grVar;
        this.f100808d = hzVar;
        this.f100810f = eVar;
        this.f100806a = cxVar;
        this.f100809e = C58886cw.m90973a(new C38042m(axVar, axVar2, ebVar, axVar3));
    }

    /* renamed from: a */
    public final C37401bf mo20354a() {
        C59104x b = f100805b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.GrpcARCSession");
        ((C59052c) ((C59052c) b).mo56372aa(52924)).mo56393w("#audio# stop listening audio request client(token(%d)) session(token(%d)) remotely", this.f100807c.f100007b, this.f100808d.f100070b);
        C38246e eVar = this.f100810f;
        C38232ao aoVar = (C38232ao) C38233ap.f101324d.createBuilder();
        C37639gr grVar = this.f100807c;
        aoVar.copyOnWrite();
        C38233ap apVar = (C38233ap) aoVar.instance;
        grVar.getClass();
        apVar.f101327b = grVar;
        apVar.f101326a |= 1;
        C37679hz hzVar = this.f100808d;
        aoVar.copyOnWrite();
        C38233ap apVar2 = (C38233ap) aoVar.instance;
        hzVar.getClass();
        apVar2.f101328c = hzVar;
        apVar2.f101326a |= 2;
        return new C38043n(C70876o.m103760a(eVar.f189039a.mo39510a(C38250i.m67545m(), eVar.f189040b), (C38233ap) aoVar.build()));
    }

    /* renamed from: b */
    public final C60870cx mo20355b() {
        return C60856cj.m92900i(C37360ay.f99224l);
    }

    /* renamed from: c */
    public final C60870cx mo20356c() {
        C37453cb cbVar = (C37453cb) C37454cc.f99428c.createBuilder();
        int i = this.f100808d.f100070b;
        cbVar.copyOnWrite();
        C37454cc ccVar = (C37454cc) cbVar.instance;
        ccVar.f99430a |= 1;
        ccVar.f99431b = i;
        return C60856cj.m92900i((C37454cc) cbVar.build());
    }

    /* renamed from: d */
    public final C60870cx mo20357d() {
        return C60856cj.m92900i((C37400be) this.f100809e.mo6453a());
    }

    /* renamed from: e */
    public final /* synthetic */ Object mo20358e() {
        return new C38044o(this);
    }
}
