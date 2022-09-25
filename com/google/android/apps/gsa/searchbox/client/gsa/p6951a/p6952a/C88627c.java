package com.google.android.apps.gsa.searchbox.client.gsa.p6951a.p6952a;

import android.content.Context;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.tasks.C118473ah;
import com.google.android.apps.gsa.tasks.C118474ai;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58701ou;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.a.a.c */
/* compiled from: PG */
public final class C88627c implements C68220f {
    /* renamed from: a */
    public static C118474ai m143271a(Context context, C86124t tVar, C86034c cVar) {
        int i;
        long j = 2;
        if (tVar.mo79746e(C90085ej.f250183bG)) {
            try {
                i = ((Integer) C90877ak.m148472f(C47633f.m84733g(cVar.mo79697b()).mo51516i(new C88624a(context), C60826bg.f164896a))).intValue();
            } catch (InterruptedException | ExecutionException e) {
                C59104x d = C88625b.f239587a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "RefreshZpTaskModule");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(9843)).mo56386p("Failed to read usage data service for AGA-C ZP cache refresh");
                i = -1;
            }
            if (i >= 0) {
                C58495hd q = tVar.mo79751q(C90085ej.f250211bm);
                Iterator it = C58701ou.f156429a.mo55816k(q.keySet()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    int intValue = ((Integer) it.next()).intValue();
                    Integer num = (Integer) q.get(Integer.valueOf(intValue));
                    if (num != null && i >= num.intValue()) {
                        j = (long) intValue;
                        break;
                    }
                }
            }
        }
        C118473ah ahVar = (C118473ah) C118474ai.f328830g.createBuilder();
        long millis = TimeUnit.HOURS.toMillis(j);
        ahVar.copyOnWrite();
        C118474ai aiVar = (C118474ai) ahVar.instance;
        aiVar.f328832a |= 1;
        aiVar.f328833b = millis;
        ahVar.copyOnWrite();
        C118474ai aiVar2 = (C118474ai) ahVar.instance;
        aiVar2.f328834c = 1;
        aiVar2.f328832a |= 2;
        C118474ai aiVar3 = (C118474ai) ahVar.build();
        C68225k.m98532d(aiVar3);
        return aiVar3;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
