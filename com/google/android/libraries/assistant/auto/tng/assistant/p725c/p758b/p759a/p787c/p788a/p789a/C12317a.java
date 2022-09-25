package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p788a.p789a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p788a.C12322b;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p788a.C12323c;
import com.google.android.libraries.assistant.auto.tng.p1028l.C13733aq;
import com.google.android.libraries.assistant.auto.tng.p1028l.C13735as;
import com.google.android.libraries.assistant.auto.tng.p1028l.C13883n;
import com.google.android.libraries.assistant.auto.tng.p1028l.p1033d.p1034a.C13831b;
import com.google.android.libraries.assistant.auto.tng.p1028l.p1033d.p1034a.C13833d;
import com.google.android.libraries.assistant.auto.tng.p1028l.p1033d.p1034a.C13847r;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.c.a.a.a */
/* compiled from: PG */
public final class C12317a implements C12322b {

    /* renamed from: a */
    private static final C59071e f39121a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.c.a.a.a");

    /* renamed from: b */
    private final C13735as f39122b;

    /* renamed from: c */
    private final C69464a f39123c;

    /* renamed from: d */
    private final C13883n f39124d;

    public C12317a(C13735as asVar, C13883n nVar, C69464a aVar) {
        this.f39122b = asVar;
        this.f39124d = nVar;
        this.f39123c = aVar;
    }

    /* renamed from: a */
    public final C12321e mo20548a(C12323c cVar) {
        C47558bi a = C47831fm.m85006a("HybridVoicePipeline.execute");
        try {
            ((C59052c) ((C59052c) f39121a.mo56224b()).mo56372aa(44176)).mo56386p("Executing hybrid voice request");
            if (cVar.mo20542a().f40384c) {
                C46459k.m82829b(this.f39124d.mo21336a(), "conversationContext reset failed", new Object[0]);
            }
            C13847r rVar = new C13847r();
            C13733aq a2 = this.f39122b.mo21235a(rVar);
            C13833d dVar = new C13833d();
            cVar.getClass();
            dVar.f42129a = new C13831b(cVar);
            dVar.mo21285b(cVar.mo20542a().f40386e);
            C60870cx b = a2.mo21234b(dVar.mo21284a());
            a.mo51417a(b);
            C12321e eVar = new C12321e(a2, rVar, b);
            C60870cx cxVar = eVar.f39130d;
            C12318b bVar = new C12318b();
            C60856cj.m92911t(cxVar, C47810es.m84974n(bVar), ((C12320d) this.f39123c.mo17428b()).f39126b);
            a.close();
            return eVar;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
