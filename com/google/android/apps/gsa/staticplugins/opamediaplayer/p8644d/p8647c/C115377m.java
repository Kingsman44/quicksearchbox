package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85343l;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85350s;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3897e.p3921j.C52582xb;
import com.google.assistant.p3897e.p3921j.C52583xc;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.m */
/* compiled from: PG */
public final /* synthetic */ class C115377m implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C115382r f320149a;

    /* renamed from: b */
    public final /* synthetic */ C52174hz f320150b;

    public /* synthetic */ C115377m(C115382r rVar, C52174hz hzVar) {
        this.f320149a = rVar;
        this.f320150b = hzVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C52583xc xcVar;
        C115382r rVar = this.f320149a;
        C52174hz hzVar = this.f320150b;
        C85343l lVar = (C85343l) obj;
        C85350s sVar = rVar.f320157b;
        C52568wo woVar = hzVar.f136897d;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        if (woVar.f137996c == 26) {
            xcVar = (C52583xc) woVar.f137997d;
        } else {
            xcVar = C52583xc.f138063o;
        }
        C52582xb a = C52582xb.m86658a(xcVar.f138076l);
        if (a == null) {
            a = C52582xb.UNKNOWN_TRIGGER_TYPE;
        }
        new C90873ag(sVar.mo78877l(lVar, a), rVar.f320159d, "update-metadata", new C115380p(rVar, hzVar)).mo85223a(C115381q.f320155a);
    }
}
