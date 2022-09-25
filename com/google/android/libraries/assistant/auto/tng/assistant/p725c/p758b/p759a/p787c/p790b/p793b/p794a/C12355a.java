package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p790b.p793b.p794a;

import com.google.android.apps.gsa.binaries.satin.app.azs;
import com.google.android.apps.gsa.binaries.satin.app.azu;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p790b.C12391c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p790b.p793b.C12354a;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C13007y;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15480f;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4450a.C57934a;
import com.google.p4449cd.p4462i.C58048g;
import dagger.p5294a.C68225k;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.c.b.b.a.a */
/* compiled from: PG */
public final class C12355a implements C12354a {

    /* renamed from: a */
    private static final C59071e f39173a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.c.b.b.a.a");

    /* renamed from: b */
    private final C15481g f39174b;

    /* renamed from: c */
    private final azs f39175c;

    /* renamed from: d */
    private final C58048g f39176d;

    public C12355a(azs azs, C58048g gVar, C15481g gVar2) {
        this.f39175c = azs;
        this.f39176d = gVar;
        this.f39174b = gVar2;
    }

    /* renamed from: a */
    public final C60870cx mo20568a(C12391c cVar) {
        C47558bi a = C47831fm.m85006a("VoiceRequestProducer.createS3Requests");
        try {
            ((C59052c) ((C59052c) f39173a.mo56224b()).mo56372aa(44210)).mo56386p("#createS3Requests");
            C15481g gVar = this.f39174b;
            C37252a c = C37179a.f97516bi.mo40779c();
            C13007y yVar = cVar.mo20549a().f40383b;
            if (yVar == null) {
                yVar = C13007y.f40413d;
            }
            C15480f.m32212a(c, Optional.m71637of(Long.valueOf(yVar.f40416b)));
            gVar.mo22353c(c, Optional.empty());
            azs azs = this.f39175c;
            azs.f204844d = this.f39176d.mo54628a("VoiceRequestProducer");
            cVar.getClass();
            azs.f204843c = cVar;
            C68225k.m98529a(azs.f204843c, C12391c.class);
            C68225k.m98529a(azs.f204844d, C57934a.class);
            C60870cx gq = new azu(azs.f204841a, azs.f204842b, azs.f204843c, azs.f204844d).b.mo60297gq();
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
