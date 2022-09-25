package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p773b.p777b;

import com.google.android.apps.gsa.binaries.satin.app.aee;
import com.google.android.apps.gsa.binaries.satin.app.aeg;
import com.google.android.libraries.assistant.auto.tng.assistant.p720b.C11964a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p773b.C12278c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p773b.C12280e;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p773b.C12281f;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p773b.p777b.p778a.C12233d;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p773b.p777b.p778a.C12235f;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4450a.C57934a;
import com.google.p4449cd.p4462i.C58048g;
import dagger.p5294a.C68225k;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.b.b.c */
/* compiled from: PG */
public final class C12274c implements C12278c {

    /* renamed from: a */
    public static final C59071e f39049a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.b.b.c");

    /* renamed from: b */
    public final C69464a f39050b;

    /* renamed from: c */
    private final C12277f f39051c;

    /* renamed from: d */
    private final C12235f f39052d;

    /* renamed from: e */
    private final Executor f39053e;

    /* renamed from: f */
    private final aee f39054f;

    /* renamed from: g */
    private final C58048g f39055g;

    public C12274c(C12277f fVar, aee aee, C12235f fVar2, C58048g gVar, Executor executor, C69464a aVar) {
        this.f39051c = fVar;
        this.f39054f = aee;
        this.f39052d = fVar2;
        this.f39055g = gVar;
        this.f39053e = executor;
        this.f39050b = aVar;
    }

    /* renamed from: a */
    public final C12281f mo20521a(C12280e eVar) {
        C47558bi a = C47831fm.m85006a("OfflineTextPipeline.execute");
        try {
            ((C59052c) ((C59052c) f39049a.mo56224b()).mo56372aa(44131)).mo56386p("#executeTextRequest");
            if (eVar.mo20503a().f40384c) {
                C12235f fVar = this.f39052d;
                C12233d dVar = new C12233d(fVar);
                C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(dVar), fVar.f38973a), "offlineTextPipelineContext#reset failed", new Object[0]);
            }
            aee aee = this.f39054f;
            eVar.getClass();
            aee.f195558c = eVar;
            aee.f195559d = this.f39055g.mo54628a("OfflineTextPipeline");
            C68225k.m98529a(aee.f195558c, C12280e.class);
            C68225k.m98529a(aee.f195559d, C57934a.class);
            aeg aeg = new aeg(aee.f195556a, aee.f195557b, aee.f195558c, aee.f195559d);
            C60870cx d = aeg.mo20511d();
            a.mo51417a(d);
            C12236b bVar = new C12236b(this);
            C60856cj.m92911t(d, C47810es.m84974n(bVar), this.f39053e);
            C12277f fVar2 = this.f39051c;
            C12991i a2 = eVar.mo20503a();
            a2.getClass();
            C11964a aVar = (C11964a) fVar2.f39062a.mo17428b();
            aVar.getClass();
            Executor executor = (Executor) fVar2.f39063b.mo17428b();
            executor.getClass();
            C12276e eVar2 = new C12276e(aeg, a2, aVar, executor);
            a.close();
            return eVar2;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
