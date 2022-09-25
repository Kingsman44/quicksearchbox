package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p780c.p781a;

import com.google.android.apps.gsa.binaries.satin.app.aet;
import com.google.android.apps.gsa.binaries.satin.app.aev;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p780c.C12296b;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p780c.C12314c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p780c.C12315d;
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

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.c.a.c */
/* compiled from: PG */
public final class C12290c implements C12296b {

    /* renamed from: a */
    public static final C59071e f39074a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.c.a.c");

    /* renamed from: b */
    private final C12295h f39075b;

    /* renamed from: c */
    private final Executor f39076c;

    /* renamed from: d */
    private final aet f39077d;

    /* renamed from: e */
    private final C58048g f39078e;

    public C12290c(C12295h hVar, aet aet, C58048g gVar, Executor executor) {
        this.f39075b = hVar;
        this.f39077d = aet;
        this.f39078e = gVar;
        this.f39076c = executor;
    }

    /* renamed from: a */
    public final C12315d mo20536a(C12314c cVar) {
        C47558bi a = C47831fm.m85006a("OnlineTextPipeline.execute");
        try {
            ((C59052c) ((C59052c) f39074a.mo56224b()).mo56372aa(44163)).mo56386p("#executeTextRequest");
            aet aet = this.f39077d;
            aet.f195579c = cVar;
            aet.f195580d = this.f39078e.mo54628a("OnlineTextPipeline");
            C68225k.m98529a(aet.f195579c, C12314c.class);
            C68225k.m98529a(aet.f195580d, C57934a.class);
            aev aev = new aev(aet.f195577a, aet.f195578b, aet.f195579c, aet.f195580d);
            C60870cx d = aev.mo20534d();
            a.mo51417a(d);
            C12289b bVar = new C12289b();
            C60856cj.m92911t(d, C47810es.m84974n(bVar), this.f39076c);
            Executor executor = (Executor) this.f39075b.f39085a.mo17428b();
            executor.getClass();
            C12294g gVar = new C12294g(aev, executor);
            a.close();
            return gVar;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
