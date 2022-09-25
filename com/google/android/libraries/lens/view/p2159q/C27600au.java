package com.google.android.libraries.lens.view.p2159q;

import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24465t;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24467v;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.C29651hv;
import com.google.android.libraries.mdi.download.C29652hw;
import com.google.android.libraries.mdi.download.C29678r;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.q.au */
/* compiled from: PG */
public final /* synthetic */ class C27600au implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C27608bb f75412a;

    /* renamed from: b */
    public final /* synthetic */ List f75413b;

    public /* synthetic */ C27600au(C27608bb bbVar, List list) {
        this.f75412a = bbVar;
        this.f75413b = list;
    }

    public final C60870cx apply(Object obj) {
        C27608bb bbVar = this.f75412a;
        List list = this.f75413b;
        List list2 = (List) obj;
        C58480gp e = C58485gu.m89837e();
        C58801sm G = ((C58485gu) list).listIterator(0);
        while (G.hasNext()) {
            C24465t tVar = ((C24467v) G.next()).f66974b;
            if (tVar == null) {
                tVar = C24465t.f66964f;
            }
            C29409fd fdVar = (C29409fd) bbVar.f75426b.mo27525b();
            C29651hv e2 = C29652hw.m54673e();
            String str = tVar.f66970e;
            if (str.isEmpty()) {
                e2.mo34790b(tVar.f66967b);
            } else {
                e2.mo34790b(str);
                ((C29678r) e2).f80365c = C58833ax.m90834k(tVar.f66967b);
            }
            e.mo55395g(C47633f.m84733g(fdVar.mo34722k(e2.mo34789a())).mo51515h(new C27597ar(tVar), bbVar.f75433i).mo51513e(RuntimeException.class, new C27598as(tVar), bbVar.f75433i));
        }
        return C60856cj.m92896e(e.mo55394f());
    }
}
