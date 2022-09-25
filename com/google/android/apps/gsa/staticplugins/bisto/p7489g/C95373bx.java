package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60285mz;
import com.google.common.p4552o.C60290nc;
import com.google.common.p4552o.C60298nk;
import com.google.common.p4552o.C60300nm;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.bx */
/* compiled from: PG */
public final class C95373bx {

    /* renamed from: a */
    public static final C59071e f266871a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.g.bx");

    /* renamed from: b */
    public final C21370a f266872b;

    /* renamed from: c */
    public long f266873c;

    /* renamed from: d */
    public C60285mz f266874d;

    /* renamed from: e */
    public int f266875e = 1;

    /* renamed from: f */
    private final C95307m f266876f;

    public C95373bx(C21370a aVar, C95307m mVar) {
        this.f266872b = aVar;
        this.f266876f = mVar;
    }

    /* renamed from: a */
    public final void mo89315a() {
        C60285mz mzVar = this.f266874d;
        if (mzVar != null) {
            C59104x b = f266871a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoTwsLogger");
            ((C59052c) ((C59052c) b).mo56372aa(14973)).mo56386p("reconnectCompleted");
            long c = this.f266872b.mo26871c();
            long j = this.f266873c;
            mzVar.copyOnWrite();
            C60290nc ncVar = (C60290nc) mzVar.instance;
            C60290nc ncVar2 = C60290nc.f163102j;
            ncVar.f163104a |= 32;
            ncVar.f163110g = (int) (c - j);
            if ((((C60290nc) mzVar.instance).f163104a & 16) == 0) {
                mzVar.copyOnWrite();
                C60290nc ncVar3 = (C60290nc) mzVar.instance;
                ncVar3.f163104a |= 16;
                ncVar3.f163109f = false;
            }
            C95307m mVar = this.f266876f;
            C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
            C60285mz mzVar2 = this.f266874d;
            nkVar.copyOnWrite();
            C60300nm nmVar = (C60300nm) nkVar.instance;
            C60290nc ncVar4 = (C60290nc) mzVar2.build();
            ncVar4.getClass();
            nmVar.f163169w = ncVar4;
            nmVar.f163148b |= 32;
            mVar.mo83545c(nkVar);
            this.f266874d = null;
        }
    }
}
