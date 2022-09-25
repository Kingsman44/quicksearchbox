package com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9183f;

import androidx.work.WorkerParameters;
import com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9185a.C121285e;
import com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9199h.C121340a;
import com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9199h.C121344b;
import com.google.apps.tiktok.contrib.work.C46513b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3781ad.p3789d.p3791b.C48744z;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.platform.i.a.f.b */
/* compiled from: PG */
public final class C121276b implements C46513b {

    /* renamed from: a */
    private final C121344b f336850a;

    /* renamed from: b */
    private final Executor f336851b;

    public C121276b(C121344b bVar, Executor executor) {
        this.f336850a = bVar;
        this.f336851b = executor;
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        C121344b bVar = this.f336850a;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : bVar.f336956b.entrySet()) {
            try {
                if (entry.getValue() != null) {
                    arrayList.add(((C121285e) ((C69464a) entry.getValue()).mo17428b()).mo105110c());
                }
            } catch (Throwable th) {
                ((C59052c) ((C59052c) ((C59052c) C121344b.f336955a.mo56225c()).mo56382g(th)).mo56372aa(35783)).mo56389s("#startOffline: exception for '%s'", ((C48744z) entry.getKey()).name());
            }
        }
        C60870cx o = C60856cj.m92906o(arrayList);
        C121340a aVar = C121340a.f336947a;
        C60870cx g = C60922j.m93044g(o, C47810es.m84963c(aVar), C60826bg.f164896a);
        C121275a aVar2 = C121275a.f336849a;
        return C60922j.m93044g(g, C47810es.m84963c(aVar2), this.f336851b);
    }
}
