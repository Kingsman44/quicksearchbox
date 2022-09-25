package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b;

import com.google.android.apps.gsa.binaries.satin.app.aqu;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.C33725a;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.C33729b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34108q;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.b.k */
/* compiled from: PG */
public final class C121750k implements C33725a {

    /* renamed from: a */
    private static final C59071e f337861a = C59071e.m91331h();

    /* renamed from: b */
    private final aqu f337862b;

    public C121750k(aqu aqu) {
        C69664n.m101061g(aqu, "audioFocusResourceFactory");
        this.f337862b = aqu;
    }

    /* renamed from: a */
    public final Object mo39041a(C33729b bVar, C34053bp bpVar, C33514d dVar, C69577g gVar) {
        C61301b a = C34711b.m63445a(bpVar);
        C34108q qVar = bVar.f90084e.f90777f;
        if (qVar == null) {
            qVar = C34108q.f90841d;
        }
        C69664n.m101060f(qVar, "invocationParams.resourceConfig.audioFocus");
        if ((qVar.f90843a & 2) == 0) {
            C34037b bVar2 = bVar.f90080a.f90869a;
            throw new IllegalStateException(bVar2 + " tried to acquire AudioFocusResource without providing AudioFocusRequestParams. InvocationToken: " + a + ".");
        } else if (qVar.f90844b) {
            C59052c cVar = (C59052c) f337861a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "INV.AudioFocus.Strategy");
            cVar.mo56379ah(new C59094n(35948));
            cVar.mo56389s("Acquire focus immediately. InvocationToken: %s.", a);
            aqu aqu = this.f337862b;
            C34108q qVar2 = bVar.f90084e.f90777f;
            if (qVar2 == null) {
                qVar2 = C34108q.f90841d;
            }
            C69664n.m101060f(qVar2, "invocationParams.resourceConfig.audioFocus");
            return C121741b.m201164a(aqu, qVar2, bpVar, gVar);
        } else {
            C58976aa aaVar = C58975e.f156826a;
            aqu aqu2 = this.f337862b;
            C34108q qVar3 = bVar.f90084e.f90777f;
            if (qVar3 == null) {
                qVar3 = C34108q.f90841d;
            }
            C69664n.m101060f(qVar3, "invocationParams.resourceConfig.audioFocus");
            return aqu2.mo67208a(qVar3, bpVar);
        }
    }
}
