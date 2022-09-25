package com.google.android.libraries.assistant.soda.speakerid.p1613a;

import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;
import com.google.speech.p5218j.C66838bp;
import java.util.Collections;

/* renamed from: com.google.android.libraries.assistant.soda.speakerid.a.g */
/* compiled from: PG */
public final /* synthetic */ class C19369g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C19372j f54206a;

    public /* synthetic */ C19369g(C19372j jVar) {
        this.f54206a = jVar;
    }

    public final Object apply(Object obj) {
        C66838bp bpVar = (C66838bp) obj;
        C63088z zVar = (C63088z) Collections.unmodifiableMap(this.f54206a.f54211c.mo24504e().f182479a).get("0");
        C59104x b = C19372j.f54209a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaEnrollmentClient");
        ((C59052c) ((C59052c) b).mo56372aa(47795)).mo56389s("Returning SpeakerIdModel bytes: %s", zVar);
        if (true == C63088z.f170246b.equals(zVar)) {
            zVar = null;
        }
        return C58833ax.m90833j(zVar).mo56106b(C19368f.f54205a);
    }
}
