package com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1388a;

import android.media.AudioManager;
import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17266e;
import com.google.android.libraries.search.assistant.p2783s.p2785b.C36395n;
import com.google.android.libraries.search.integrations.p3013a.p3014a.C38487e;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66549af;
import com.google.speech.p5208h.C66550ag;
import com.google.speech.p5208h.C66616cn;
import com.google.speech.p5208h.C66617co;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.c.e.a.a.q */
/* compiled from: PG */
public final class C17232q {

    /* renamed from: a */
    public static final C66617co f49986a;

    /* renamed from: b */
    public static final C66550ag f49987b;

    /* renamed from: c */
    public static final C59071e f49988c = C59071e.m91331h();

    static {
        C66616cn cnVar = (C66616cn) C66617co.f181233c.createBuilder();
        cnVar.copyOnWrite();
        C66617co coVar = (C66617co) cnVar.instance;
        coVar.f181236a |= 1;
        coVar.f181237b = true;
        C62942bv build = cnVar.build();
        C69664n.m101060f(build, "newBuilder().setEnablePr…amedActions(true).build()");
        f49986a = (C66617co) build;
        C66549af afVar = (C66549af) C66550ag.f180992c.createBuilder();
        afVar.copyOnWrite();
        C66550ag agVar = (C66550ag) afVar.instance;
        agVar.f180995a |= 1;
        agVar.f180996b = true;
        C62942bv build2 = afVar.build();
        C69664n.m101060f(build2, "newBuilder().setGaiaLoggingAllowed(true).build()");
        f49987b = (C66550ag) build2;
    }

    /* renamed from: a */
    public static final C17266e m34393a(C71422aw awVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        return new C17218c(awVar);
    }

    /* renamed from: b */
    public static final C17266e m34394b(C71422aw awVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        return new C17225j(awVar);
    }

    /* renamed from: c */
    public static final C17266e m34395c(C71422aw awVar, C36395n nVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(nVar, "mobileInfoProvider");
        return new C17228m(awVar, nVar);
    }

    /* renamed from: d */
    public static final C17266e m34396d(C71422aw awVar, AudioManager audioManager, C38487e eVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(audioManager, "audioManager");
        C69664n.m101061g(eVar, "clientInstanceIdGenerator");
        return new C17222g(awVar, audioManager, eVar);
    }
}
