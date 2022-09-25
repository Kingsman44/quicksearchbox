package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p780c.p783b.p784a;

import com.google.android.apps.gsa.binaries.satin.app.auj;
import com.google.android.apps.gsa.binaries.satin.app.aul;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p780c.C12314c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p780c.p783b.C12297a;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C13007y;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15480f;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4450a.C57934a;
import com.google.p4449cd.p4462i.C58048g;
import dagger.p5294a.C68225k;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.c.b.a.a */
/* compiled from: PG */
public final class C12298a implements C12297a {

    /* renamed from: a */
    private final C15481g f39086a;

    /* renamed from: b */
    private final auj f39087b;

    /* renamed from: c */
    private final C58048g f39088c;

    public C12298a(auj auj, C58048g gVar, C15481g gVar2) {
        this.f39087b = auj;
        this.f39088c = gVar;
        this.f39086a = gVar2;
    }

    /* renamed from: a */
    public final C60870cx mo20541a(C12314c cVar) {
        C47558bi a = C47831fm.m85006a("TextRequestProducer.createS3Requests");
        try {
            C15481g gVar = this.f39086a;
            C37252a c = C37179a.f97516bi.mo40779c();
            C13007y yVar = cVar.mo20526a().f40383b;
            if (yVar == null) {
                yVar = C13007y.f40413d;
            }
            C15480f.m32212a(c, Optional.m71637of(Long.valueOf(yVar.f40416b)));
            gVar.mo22353c(c, Optional.empty());
            auj auj = this.f39087b;
            auj.f204363d = this.f39088c.mo54628a("TextRequestsProducer");
            cVar.getClass();
            auj.f204362c = cVar;
            C68225k.m98529a(auj.f204362c, C12314c.class);
            C68225k.m98529a(auj.f204363d, C57934a.class);
            C60870cx gq = new aul(auj.f204360a, auj.f204361b, auj.f204362c, auj.f204363d).b.mo60297gq();
            a.mo51417a(gq);
            a.close();
            return gq;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
