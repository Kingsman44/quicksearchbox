package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p819f.p820a;

import com.google.android.apps.gsa.binaries.satin.app.aud;
import com.google.android.apps.gsa.binaries.satin.app.auf;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p804b.C12434h;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p819f.C12610c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p819f.C12612e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15489o;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15494t;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4449cd.p4450a.C57934a;
import com.google.p4449cd.p4462i.C58048g;
import dagger.p5294a.C68225k;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.f.a.c */
/* compiled from: PG */
public final class C12601c implements C12610c {

    /* renamed from: a */
    public static final C59071e f39566a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.f.a.c");

    /* renamed from: b */
    public final C69464a f39567b;

    /* renamed from: c */
    private final C12608j f39568c;

    /* renamed from: d */
    private final C15494t f39569d;

    /* renamed from: e */
    private final Executor f39570e;

    /* renamed from: f */
    private final aud f39571f;

    /* renamed from: g */
    private final C58048g f39572g;

    public C12601c(aud aud, C12608j jVar, C15494t tVar, C58048g gVar, Executor executor, C69464a aVar) {
        this.f39571f = aud;
        this.f39568c = jVar;
        this.f39569d = tVar;
        this.f39572g = gVar;
        this.f39570e = executor;
        this.f39567b = aVar;
    }

    /* renamed from: a */
    public final C12434h mo20672a(C12612e eVar) {
        C47558bi a = C47831fm.m85006a("TextInteractionManager.handleInteraction");
        try {
            C58976aa aaVar = C58975e.f156826a;
            aud aud = this.f39571f;
            eVar.getClass();
            aud.f204354c = eVar;
            aud.f204355d = this.f39572g.mo54628a("TextInteractionManager");
            C68225k.m98529a(aud.f204354c, C12612e.class);
            C68225k.m98529a(aud.f204355d, C57934a.class);
            auf auf = new auf(aud.f204352a, aud.f204353b, aud.f204354c, aud.f204355d);
            C60870cx d = auf.mo20668d();
            a.mo51417a(d);
            C12600b bVar = new C12600b(this, eVar);
            C60856cj.m92911t(d, C47810es.m84974n(bVar), this.f39570e);
            Executor executor = (Executor) this.f39568c.f39580a.mo17428b();
            executor.getClass();
            C12607i iVar = new C12607i(auf, executor);
            a.close();
            return iVar;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }

    /* renamed from: b */
    public final void mo20673b(C12991i iVar, C62722b bVar) {
        if (!C15489o.m32223a(iVar)) {
            this.f39569d.mo22365c(C37179a.f97427Z.mo40806d(), iVar, bVar);
        }
    }
}
