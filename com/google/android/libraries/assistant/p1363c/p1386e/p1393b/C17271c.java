package com.google.android.libraries.assistant.p1363c.p1386e.p1393b;

import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17266e;
import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1390c.C17251p;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64308b;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64322bn;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5208h.C66639df;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.c.e.b.c */
/* compiled from: PG */
public final class C17271c implements C17266e {

    /* renamed from: a */
    private final C64308b f50060a;

    public C17271c(C64308b bVar) {
        C69664n.m101061g(bVar, "explicitAutomationRequest");
        this.f50060a = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo23245a() {
        return C60856cj.m92900i(C17270b.f50059a);
    }

    /* renamed from: c */
    public final C60870cx mo23246c(Consumer consumer) {
        C66606cd cdVar = (C66606cd) C66607ce.f181191f.createBuilder();
        C69664n.m101060f(cdVar, "newBuilder()");
        C66639df a = C69664n.m101061g(cdVar, "builder");
        C62940bt btVar = C64322bn.f173906a;
        C69664n.m101060f(btVar, "explicitAutomationRequestExt");
        C64308b bVar = this.f50060a;
        C69664n.m101061g(btVar, "extension");
        C69664n.m101061g(bVar, "value");
        a.f181308a.mo58885m(btVar, bVar);
        ((C17251p) consumer).accept(a.mo59697a());
        return C60866ct.f164955a;
    }
}
