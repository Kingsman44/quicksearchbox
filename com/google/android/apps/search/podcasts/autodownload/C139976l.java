package com.google.android.apps.search.podcasts.autodownload;

import androidx.work.C4632m;
import androidx.work.C4645z;
import com.google.android.apps.search.podcasts.p10576l.C140450al;
import com.google.android.apps.search.podcasts.p10576l.C140508t;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.autodownload.l */
/* compiled from: PG */
final class C139976l extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C139977m f380464a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C139976l(C139977m mVar) {
        super(1);
        this.f380464a = mVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        C140450al alVar = (C140450al) obj;
        C140508t tVar = alVar.f381525k;
        if (tVar == null) {
            tVar = C140508t.f381626c;
        }
        if (!tVar.f381628a) {
            return C60856cj.m92900i(new C4645z(C4632m.f14549a));
        }
        C60870cx c = this.f380464a.f380472h.mo115472c();
        C139977m mVar = this.f380464a;
        return C140989k.m228947e(c, mVar.f380466b, new C139975k(alVar, mVar));
    }
}
