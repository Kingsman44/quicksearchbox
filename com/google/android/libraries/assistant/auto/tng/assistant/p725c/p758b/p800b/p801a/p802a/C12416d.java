package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p801a.p802a;

import com.google.android.apps.gsa.binaries.satin.app.C74076id;
import com.google.android.apps.gsa.binaries.satin.app.if;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p801a.C12423b;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p801a.C12424c;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4450a.C57934a;
import com.google.p4449cd.p4462i.C58048g;
import dagger.p5294a.C68225k;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.a.a.d */
/* compiled from: PG */
public final class C12416d implements C12423b {

    /* renamed from: a */
    public static final C59071e f39274a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.a.a.d");

    /* renamed from: b */
    private final C12422j f39275b;

    /* renamed from: c */
    private final Executor f39276c;

    /* renamed from: d */
    private final C74076id f39277d;

    /* renamed from: e */
    private final C58048g f39278e;

    public C12416d(C12422j jVar, C74076id idVar, C58048g gVar, Executor executor) {
        this.f39275b = jVar;
        this.f39277d = idVar;
        this.f39278e = gVar;
        this.f39276c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo20589a(C12424c cVar) {
        C47558bi a;
        C58976aa aaVar = C58975e.f156826a;
        C47558bi a2 = C47831fm.m85006a("CallInteractionManager.handleCallInteraction");
        try {
            a = C47831fm.m85006a("CallInteractionManager.callGraphInteractionResult");
            C74076id idVar = this.f39277d;
            idVar.f206328c = cVar;
            idVar.f206329d = this.f39278e.mo54628a("CallInteractionManager");
            C68225k.m98529a(idVar.f206328c, C12424c.class);
            C68225k.m98529a(idVar.f206329d, C57934a.class);
            if ifVar = new if(idVar.f206326a, idVar.f206327b, idVar.f206328c, idVar.f206329d);
            C60870cx d = ifVar.mo20586d();
            a.mo51417a(d);
            C12415c cVar2 = new C12415c();
            C60856cj.m92911t(d, C47810es.m84974n(cVar2), this.f39276c);
            Executor executor = (Executor) this.f39275b.f39285a.mo17428b();
            executor.getClass();
            C60870cx i = C60856cj.m92900i(new C12421i(ifVar, executor));
            a.close();
            a2.mo51417a(i);
            a2.close();
            return i;
        } catch (Throwable th) {
            try {
                a2.close();
            } catch (Throwable th2) {
                C12414b.m28464a(th, th2);
            }
            throw th;
        }
        throw th;
    }
}
