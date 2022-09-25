package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7460a;

import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.C94785f;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.C94800u;
import com.google.android.libraries.gsa.conversation.clientop.C22407c;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.conversation.p1852f.C22585l;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.a.h */
/* compiled from: PG */
public final class C94660h extends C22538o {

    /* renamed from: a */
    public static final C59071e f264751a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.aa.a.h");

    /* renamed from: b */
    public final C94785f f264752b;

    /* renamed from: c */
    public final C94800u f264753c;

    /* renamed from: d */
    public final C90021c f264754d;

    /* renamed from: e */
    private final C22871g f264755e;

    public C94660h(C94785f fVar, C22871g gVar, C94800u uVar, C90021c cVar) {
        this.f264752b = fVar;
        this.f264755e = gVar;
        this.f264753c = uVar;
        this.f264754d = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        String str = dyVar.f135936b;
        if (str.equals("gacs_accessory.TTS_OUTPUT")) {
            C59104x b = f264751a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoGacsTtsPerf");
            ((C59052c) ((C59052c) b).mo56372aa(16826)).mo56389s("Received: %s", str);
            C22407c cVar = (C22407c) eVar;
            if (cVar.f61902d.mo56113h()) {
                return this.f264755e.mo28210j(((C22585l) cVar.f61902d.mo56107c()).f62230d, "gacs-tts-future", new C94659g(this, dyVar));
            }
            return C60856cj.m92900i(C22402a.f61894b);
        }
        throw new C22428d(dyVar);
    }
}
