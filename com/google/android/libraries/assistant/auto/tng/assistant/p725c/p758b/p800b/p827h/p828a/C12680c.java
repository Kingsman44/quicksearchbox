package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p827h.p828a;

import com.google.android.apps.gsa.binaries.satin.app.azj;
import com.google.android.apps.gsa.binaries.satin.app.azl;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p804b.C12434h;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p827h.C12690c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p827h.C12692e;
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

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.h.a.c */
/* compiled from: PG */
public final class C12680c implements C12690c {

    /* renamed from: a */
    public static final C59071e f39731a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.h.a.c");

    /* renamed from: b */
    public final C69464a f39732b;

    /* renamed from: c */
    private final C12688k f39733c;

    /* renamed from: d */
    private final C15494t f39734d;

    /* renamed from: e */
    private final Executor f39735e;

    /* renamed from: f */
    private final azj f39736f;

    /* renamed from: g */
    private final C58048g f39737g;

    public C12680c(azj azj, C12688k kVar, C58048g gVar, C15494t tVar, Executor executor, C69464a aVar) {
        this.f39736f = azj;
        this.f39733c = kVar;
        this.f39737g = gVar;
        this.f39734d = tVar;
        this.f39735e = executor;
        this.f39732b = aVar;
    }

    /* renamed from: a */
    public final C12434h mo20717a(C12692e eVar) {
        C47558bi a = C47831fm.m85006a("VoiceInteractionManager.handleInteraction");
        try {
            C58976aa aaVar = C58975e.f156826a;
            azj azj = this.f39736f;
            eVar.getClass();
            azj.f204829c = eVar;
            azj.f204830d = this.f39737g.mo54628a("VoiceInteractionManager");
            C68225k.m98529a(azj.f204829c, C12692e.class);
            C68225k.m98529a(azj.f204830d, C57934a.class);
            azl azl = new azl(azj.f204827a, azj.f204828b, azj.f204829c, azj.f204830d);
            C60870cx f = azl.mo20711f();
            a.mo51417a(f);
            C12679b bVar = new C12679b(this, eVar);
            C60856cj.m92911t(f, C47810es.m84974n(bVar), this.f39735e);
            Executor executor = (Executor) this.f39733c.f39746a.mo17428b();
            executor.getClass();
            C12687j jVar = new C12687j(azl, executor);
            a.close();
            return jVar;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }

    /* renamed from: b */
    public final void mo20718b(C12991i iVar, C62722b bVar) {
        if (!C15489o.m32223a(iVar)) {
            this.f39734d.mo22365c(C37179a.f97427Z.mo40806d(), iVar, bVar);
        }
    }
}
