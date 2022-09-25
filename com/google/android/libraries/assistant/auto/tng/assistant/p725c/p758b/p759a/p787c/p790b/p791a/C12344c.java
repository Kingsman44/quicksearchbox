package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p790b.p791a;

import com.google.android.apps.gsa.binaries.satin.app.aez;
import com.google.android.apps.gsa.binaries.satin.app.afb;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p790b.C12353b;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p790b.C12391c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p790b.C12392d;
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

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.c.b.a.c */
/* compiled from: PG */
public final class C12344c implements C12353b {

    /* renamed from: a */
    public static final C59071e f39158a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.c.b.a.c");

    /* renamed from: b */
    private final C12352k f39159b;

    /* renamed from: c */
    private final Executor f39160c;

    /* renamed from: d */
    private final C69464a f39161d;

    /* renamed from: e */
    private final aez f39162e;

    /* renamed from: f */
    private final C58048g f39163f;

    public C12344c(C12352k kVar, aez aez, C58048g gVar, Executor executor, C69464a aVar) {
        this.f39159b = kVar;
        this.f39162e = aez;
        this.f39163f = gVar;
        this.f39160c = executor;
        this.f39161d = aVar;
    }

    /* renamed from: a */
    public final C12392d mo20561a(C12391c cVar) {
        C47558bi a = C47831fm.m85006a("OnlineVoicePipeline.execute");
        try {
            ((C59052c) ((C59052c) f39158a.mo56224b()).mo56372aa(44189)).mo56386p("#executeVoiceRequest");
            aez aez = this.f39162e;
            aez.f195594d = cVar;
            aez.f195593c = this.f39163f.mo54628a("OnlineVoicePipeline");
            C68225k.m98529a(aez.f195593c, C57934a.class);
            C68225k.m98529a(aez.f195594d, C12391c.class);
            afb afb = new afb(aez.f195591a, aez.f195592b, aez.f195593c, aez.f195594d);
            C60870cx e = afb.mo20558e();
            a.mo51417a(e);
            C12343b bVar = new C12343b();
            C60856cj.m92911t(e, C47810es.m84974n(bVar), this.f39160c);
            Executor executor = (Executor) this.f39159b.f39172a.mo17428b();
            executor.getClass();
            C12351j jVar = new C12351j(afb, executor);
            C60870cx c = jVar.mo20565c();
            C12345d dVar = new C12345d();
            C60856cj.m92911t(c, C47810es.m84974n(dVar), ((C12347f) this.f39161d.mo17428b()).f39165b);
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
}
