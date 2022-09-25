package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p760a.p761a.C12182h;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p857b.p858a.p859a.C12880b;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p857b.p858a.p859a.C12886h;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.s */
/* compiled from: PG */
public final /* synthetic */ class C12852s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C12855v f40096a;

    /* renamed from: b */
    public final /* synthetic */ C12182h f40097b;

    public /* synthetic */ C12852s(C12855v vVar, C12182h hVar) {
        this.f40096a = vVar;
        this.f40097b = hVar;
    }

    public final void run() {
        C12855v vVar = this.f40096a;
        C12182h hVar = this.f40097b;
        if (vVar.f40110k) {
            vVar.f40110k = false;
            vVar.f40106g.mo22352b(C37179a.f97526bs);
        }
        if (!vVar.f40109j) {
            C60870cx cxVar = vVar.f40108i;
            C12848o oVar = new C12848o(vVar, hVar);
            C60870cx h = C60922j.m93045h(cxVar, C47810es.m84966f(oVar), vVar.f40101b);
            C60870cx cxVar2 = C60866ct.f164955a;
            if (vVar.f40105f.mo56113h()) {
                C12886h hVar2 = (C12886h) vVar.f40105f.mo56107c();
                C52091ex exVar = hVar.mo20475a().f136685e;
                if (exVar == null) {
                    exVar = C52091ex.f136710b;
                }
                cxVar2 = hVar2.mo20836a(new C12880b(exVar));
            }
            C47633f h2 = C47633f.m84733g(C60856cj.m92896e(C58485gu.m89847o(cxVar, h))).mo51515h(new C12857x(), vVar.f40103d.f40115a);
            vVar.f40108i = C47638k.m84751b(cxVar2, h2).mo51520a(new C12849p(h2), vVar.f40101b);
        }
    }
}
