package com.google.android.libraries.lens.view.p2159q;

import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24465t;
import com.google.android.libraries.mdi.download.C28804cs;
import com.google.android.libraries.mdi.download.C28805ct;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.C29663j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.q.an */
/* compiled from: PG */
public final /* synthetic */ class C27593an implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C27608bb f75401a;

    public /* synthetic */ C27593an(C27608bb bbVar) {
        this.f75401a = bbVar;
    }

    public final C60870cx apply(Object obj) {
        C27608bb bbVar = this.f75401a;
        C58480gp e = C58485gu.m89837e();
        for (C24465t tVar : (List) obj) {
            if (tVar.f66970e.isEmpty()) {
                e.mo55395g(bbVar.mo33133j(tVar, 2));
            } else {
                String str = tVar.f66970e;
                String str2 = tVar.f66967b;
                C28804cs f = C28805ct.m53747f();
                f.mo34449c(str);
                ((C29663j) f).f80315c = C58833ax.m90834k(str2);
                f.mo34451e(false);
                C60870cx f2 = ((C29409fd) bbVar.f75426b.mo27525b()).mo34717f(f.mo34447a());
                C27599at atVar = new C27599at(bbVar, tVar);
                e.mo55395g(C60922j.m93045h(f2, C47810es.m84966f(atVar), bbVar.f75433i));
            }
        }
        return C60856cj.m92896e(e.mo55394f());
    }
}
