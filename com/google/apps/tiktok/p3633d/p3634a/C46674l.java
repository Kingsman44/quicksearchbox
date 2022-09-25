package com.google.apps.tiktok.p3633d.p3634a;

import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.apps.tiktok.d.a.l */
/* compiled from: PG */
public final class C46674l {

    /* renamed from: a */
    private final C60888db f121942a;

    public C46674l(C60888db dbVar) {
        this.f121942a = dbVar;
    }

    /* renamed from: b */
    public static final void m83158b(StringBuilder sb, Throwable th) {
        sb.append(th.getClass().getName());
        sb.append("\n");
        for (StackTraceElement append : th.getStackTrace()) {
            sb.append("\tat ");
            sb.append(append);
            sb.append("\n");
        }
    }

    /* renamed from: c */
    private final C60870cx m83159c(C46677o oVar, String str, C60870cx cxVar) {
        C60870cx g = C60846c.m92878g(cxVar, Throwable.class, new C46670h(oVar), m83160d(oVar));
        if (oVar.mo50697a() > 0) {
            g = C60846c.m92878g(C60856cj.m92908q(g, oVar.mo50697a(), TimeUnit.MILLISECONDS, this.f121942a), TimeoutException.class, C46672j.f121939a, this.f121942a);
        } else if (oVar.mo50697a() == 0 && !g.isDone()) {
            g.cancel(true);
            g = C60856cj.m92900i(C46675m.f121943k);
        }
        return C60922j.m93044g(g, new C46673k(str, oVar), m83160d(oVar));
    }

    /* renamed from: d */
    private final Executor m83160d(C46677o oVar) {
        return oVar.mo50706f() ? C60826bg.f164896a : this.f121942a;
    }

    /* renamed from: a */
    public final C60870cx mo50704a(C46677o oVar, Map map, Map map2) {
        C60870cx cxVar;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            try {
                cxVar = ((C46675m) entry.getValue()).mo20647a(oVar);
            } catch (Throwable th) {
                cxVar = C60856cj.m92899h(th);
            }
            arrayList.add(m83159c(oVar, str, cxVar));
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            arrayList.add(m83159c(oVar, (String) entry2.getKey(), (C60870cx) entry2.getValue()));
        }
        return C60922j.m93044g(C60856cj.m92896e(arrayList), C46671i.f121938a, m83160d(oVar));
    }
}
