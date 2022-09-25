package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9083a.p9084a;

import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120420b;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120481c;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120507d;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120515l;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9083a.C120392a;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.C33660c;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.C33662e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.b.a.a.e */
/* compiled from: PG */
public final class C120397e implements C120392a {

    /* renamed from: a */
    final /* synthetic */ C120398f f334897a;

    /* renamed from: b */
    final /* synthetic */ C33660c f334898b;

    /* renamed from: c */
    private final C120507d f334899c;

    public C120397e(C120398f fVar, C33660c cVar) {
        C120420b bVar;
        this.f334897a = fVar;
        this.f334898b = cVar;
        C120515l f = C120507d.m199598f();
        C33662e a = cVar.mo39012a();
        C69664n.m101060f(a, "audioInputConfig");
        int i = a.f89961d;
        if (i == 2) {
            f.mo104791c(C120481c.f335068a);
            C33662e a2 = cVar.mo39012a();
            C69664n.m101060f(a2, "audioInputConfig");
            int i2 = a2.f89960c;
            if (i2 == 1) {
                bVar = C120420b.MONO;
            } else if (i2 == 12) {
                bVar = C120420b.STEREO;
            } else if (i2 == 16) {
                bVar = C120420b.MONO;
            } else {
                throw new IllegalStateException("Invalid channel config.");
            }
            f.mo104790b(bVar);
            f.mo104792d(cVar.mo39012a().f89959b);
            this.f334899c = f.mo104789a();
            return;
        }
        throw new C120418z(i);
    }

    /* renamed from: a */
    public final C120507d mo104739a() {
        return this.f334899c;
    }

    /* renamed from: b */
    public final C60870cx mo104740b() {
        return C60922j.m93045h(C60838bs.m92859i(this.f334898b.mo39013b()), C120396d.f334896a, this.f334897a.f334901b);
    }

    /* renamed from: c */
    public final C60870cx mo104741c() {
        return C60856cj.m92900i(this.f334898b.mo39016d());
    }

    public final void close() {
        C59052c cVar = (C59052c) C120398f.f334900a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "ConvEngine.Audio");
        cVar.mo56379ah(new C59094n(35444));
        cVar.mo56386p("Session#close");
        this.f334898b.close();
    }

    /* renamed from: d */
    public final Optional mo104743d() {
        Optional c = this.f334898b.mo39014c();
        C69664n.m101060f(c, "hotwordEvent");
        return c;
    }
}
