package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b;

import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94934b;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94936d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124671cj;
import com.google.assistant.p3739a.p3740a.C48080bn;
import com.google.assistant.p3739a.p3740a.C48081bo;
import com.google.assistant.p3739a.p3740a.C48084br;
import com.google.assistant.p3739a.p3740a.C48085bs;
import com.google.assistant.p3739a.p3740a.C48086bt;
import com.google.assistant.p3739a.p3740a.C48087bu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.C63088z;
import java.util.concurrent.atomic.AtomicBoolean;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.b.w */
/* compiled from: PG */
public final class C94925w {

    /* renamed from: a */
    public static final C59071e f265529a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.b.w");

    /* renamed from: b */
    public final C124671cj f265530b;

    /* renamed from: c */
    C70862aj f265531c = null;

    /* renamed from: d */
    final AtomicBoolean f265532d = new AtomicBoolean(false);

    /* renamed from: e */
    private final C60888db f265533e;

    /* renamed from: f */
    private final C60836bq f265534f = new C60836bq();

    /* renamed from: g */
    private final C94934b f265535g;

    public C94925w(C124671cj cjVar, C60888db dbVar, C94934b bVar) {
        this.f265530b = cjVar;
        this.f265533e = dbVar;
        this.f265535g = bVar;
    }

    /* renamed from: a */
    public final synchronized void mo88830a() {
        C60856cj.m92911t(this.f265534f.mo57304a(new C94918p(this), this.f265533e), new C94924v(), this.f265533e);
    }

    /* renamed from: b */
    public final synchronized void mo88831b(byte[] bArr) {
        C60856cj.m92911t(this.f265534f.mo57304a(new C94919q(this, bArr), this.f265533e), new C94923u(), this.f265533e);
    }

    /* renamed from: c */
    public final synchronized void mo88832c(long j) {
        C60856cj.m92911t(this.f265534f.mo57304a(new C94920r(this, j), this.f265533e), new C94921s(), this.f265533e);
    }

    /* renamed from: d */
    public final synchronized void mo88833d(long j, C63088z zVar) {
        C94934b bVar = this.f265535g;
        C94936d dVar = C94936d.PROXY_OUTPUT;
        C48080bn bnVar = (C48080bn) C48081bo.f124437c.createBuilder();
        C48084br brVar = (C48084br) C48085bs.f124444c.createBuilder();
        brVar.copyOnWrite();
        ((C48085bs) brVar.instance).f124446a = j;
        brVar.copyOnWrite();
        zVar.getClass();
        ((C48085bs) brVar.instance).f124447b = zVar;
        bnVar.copyOnWrite();
        C48081bo boVar = (C48081bo) bnVar.instance;
        C48085bs bsVar = (C48085bs) brVar.build();
        bsVar.getClass();
        boVar.f124440b = bsVar;
        boVar.f124439a = 2;
        bVar.mo88663s(dVar, ((C48081bo) bnVar.build()).toByteArray());
    }

    /* renamed from: e */
    public final synchronized void mo88834e(int i) {
        C94934b bVar = this.f265535g;
        C94936d dVar = C94936d.PROXY_OUTPUT;
        C48080bn bnVar = (C48080bn) C48081bo.f124437c.createBuilder();
        C48086bt btVar = (C48086bt) C48087bu.f124448b.createBuilder();
        btVar.copyOnWrite();
        ((C48087bu) btVar.instance).f124450a = i - 2;
        C48087bu buVar = (C48087bu) btVar.build();
        bnVar.copyOnWrite();
        C48081bo boVar = (C48081bo) bnVar.instance;
        buVar.getClass();
        boVar.f124440b = buVar;
        boVar.f124439a = 1;
        bVar.mo88663s(dVar, ((C48081bo) bnVar.build()).toByteArray());
    }
}
