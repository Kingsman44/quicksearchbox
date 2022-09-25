package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p6968aa.C89068x;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58881cr;
import dagger.C68214a;

/* renamed from: com.google.android.libraries.gsa.c.a.bc */
/* compiled from: PG */
public final /* synthetic */ class C22231bc implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C22239bk f61382a;

    /* renamed from: b */
    public final /* synthetic */ C89061q f61383b;

    /* renamed from: c */
    public final /* synthetic */ C89020ar f61384c;

    /* renamed from: d */
    public final /* synthetic */ C89068x f61385d;

    public /* synthetic */ C22231bc(C22239bk bkVar, C89061q qVar, C89020ar arVar, C89068x xVar) {
        this.f61382a = bkVar;
        this.f61383b = qVar;
        this.f61384c = arVar;
        this.f61385d = xVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C22239bk bkVar = this.f61382a;
        C89061q qVar = this.f61383b;
        C89020ar arVar = this.f61384c;
        C89068x xVar = this.f61385d;
        C22245bq bfVar = new C22234bf(bkVar, qVar);
        if (bkVar.f61405f.mo56113h()) {
            bfVar = new C22233be(bkVar, (C68214a) bkVar.f61405f.mo56107c(), bfVar);
        }
        if (bkVar.f61406g.mo56113h()) {
            bfVar = new C22235bg((C68214a) bkVar.f61406g.mo56107c(), bfVar);
        }
        C22237bi biVar = new C22237bi(bkVar, bfVar);
        C89019aq aqVar = new C89019aq(arVar, arVar.f241260i);
        String str = arVar.f241259h;
        if (str == null && bkVar.f61482b.mo56113h()) {
            str = (String) ((C58881cr) bkVar.f61482b.mo56107c()).mo6453a();
        }
        if (str != null) {
            aqVar.mo82993e("User-Agent", str);
        }
        if (((C89037bh) bkVar.f61483c.mo27525b()).mo27385k()) {
            aqVar.mo82993e("Save-Data", "on");
        }
        return biVar.mo27491a(aqVar.mo82989a(), xVar).mo27489b();
    }
}
