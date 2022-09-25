package com.google.android.libraries.assistant.p1363c.p1386e.p1393b;

import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17268f;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.protobuf.C62940bt;
import com.google.protobuf.p4746a.C62885d;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64303av;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64304aw;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64322bn;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64328d;
import com.google.speech.p5208h.C66611ci;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.c.e.b.e */
/* compiled from: PG */
public final class C17273e implements C17268f {

    /* renamed from: a */
    final /* synthetic */ C64303av f50062a;

    public C17273e(C64303av avVar) {
        this.f50062a = avVar;
    }

    /* renamed from: a */
    public final void mo23256a() {
    }

    /* renamed from: b */
    public final void mo23257b(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
    }

    /* renamed from: c */
    public final void mo23258c(C66611ci ciVar) {
        C64304aw awVar;
        C69664n.m101061g(ciVar, "s3Response");
        C64303av avVar = this.f50062a;
        C62940bt btVar = C64322bn.f173907b;
        C69664n.m101060f(btVar, "explicitAutomationResponseExt");
        C64328d dVar = (C64328d) C62885d.m94956a(ciVar, btVar);
        if (dVar.f173912a == 2) {
            awVar = (C64304aw) dVar.f173913b;
        } else {
            awVar = C64304aw.f173865b;
        }
        avVar.mergeFrom(awVar);
    }
}
