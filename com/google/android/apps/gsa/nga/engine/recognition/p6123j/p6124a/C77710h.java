package com.google.android.apps.gsa.nga.engine.recognition.p6123j.p6124a;

import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6260x.C79856d;
import com.google.android.apps.gsa.nga.engine.recognition.C77566as;
import com.google.android.apps.gsa.nga.engine.recognition.p6101a.C77496a;
import com.google.android.apps.gsa.nga.engine.recognition.p6125k.C77732a;
import com.google.android.apps.gsa.nga.engine.recognition.p6125k.p6126a.C77733a;
import com.google.android.apps.gsa.nga.engine.recognition.p6125k.p6126a.C77734b;
import com.google.android.apps.gsa.nga.engine.recognition.p6125k.p6126a.C77735c;
import com.google.android.apps.gsa.nga.shared.p6363s.C81459h;
import com.google.android.apps.gsa.nga.shared.p6363s.C81465n;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58889cz;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.j.a.h */
/* compiled from: PG */
public final class C77710h {

    /* renamed from: a */
    public static final C58974d f214049a = C58974d.m91136j();

    /* renamed from: b */
    public final byte[] f214050b;

    /* renamed from: c */
    public final C77720r f214051c;

    /* renamed from: d */
    public final C22871g f214052d;

    /* renamed from: e */
    public final C91142g f214053e;

    /* renamed from: f */
    public final C79856d f214054f;

    /* renamed from: g */
    public final C77566as f214055g;

    /* renamed from: h */
    public final C77733a f214056h;

    /* renamed from: i */
    public final C76092h f214057i;

    /* renamed from: j */
    public final C77496a f214058j;

    /* renamed from: k */
    public final C77732a f214059k;

    /* renamed from: l */
    public final C77734b f214060l;

    /* renamed from: m */
    public final C22871g f214061m;

    /* renamed from: n */
    public final C83305i f214062n;

    /* renamed from: o */
    public final C77713k f214063o;

    /* renamed from: p */
    public final C81459h f214064p;

    public C77710h(C79856d dVar, C77566as asVar, C77733a aVar, C77720r rVar, C22871g gVar, C22871g gVar2, C91142g gVar3, C76092h hVar, C77735c cVar, C77496a aVar2, C77732a aVar3, C83305i iVar, C81465n nVar, C22871g gVar4, C77713k kVar) {
        this.f214054f = dVar;
        this.f214055g = asVar;
        this.f214051c = rVar;
        this.f214052d = gVar2;
        this.f214053e = gVar3;
        this.f214056h = aVar;
        this.f214057i = hVar;
        this.f214058j = aVar2;
        this.f214059k = aVar3;
        int c = asVar.mo72680c();
        C58889cz czVar = (C58889cz) cVar.f214147a.mo17428b();
        czVar.getClass();
        this.f214060l = new C77734b(c, czVar);
        this.f214061m = gVar;
        this.f214062n = iVar;
        long seconds = C77723u.f214118b.multipliedBy((long) asVar.mo72680c()).multipliedBy((long) Integer.bitCount(asVar.mo72678a())).multipliedBy(2).getSeconds();
        int i = (int) seconds;
        if (seconds == ((long) i)) {
            this.f214050b = new byte[i];
            this.f214063o = kVar;
            this.f214064p = nVar.mo75095b(gVar4, C77703b.f214040a);
            return;
        }
        throw new ArithmeticException();
    }
}
