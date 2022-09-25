package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7460a;

import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.C94785f;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.a.o */
/* compiled from: PG */
public final class C94667o extends C22538o {

    /* renamed from: a */
    private static final C59071e f264769a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.aa.a.o");

    /* renamed from: b */
    private final C94785f f264770b;

    /* renamed from: c */
    private final C22871g f264771c;

    public C94667o(C94785f fVar, C22871g gVar) {
        this.f264770b = fVar;
        this.f264771c = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if ("device.WAIT_FOR_AUTHENTICATION".equals(dyVar.f135936b)) {
            C59104x b = f264769a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoWaitForAuthPerf");
            ((C59052c) ((C59052c) b).mo56372aa(16828)).mo56386p("Requesting PR notification");
            C22871g gVar = this.f264771c;
            C94785f fVar = this.f264770b;
            Objects.requireNonNull(fVar);
            gVar.mo28212l("bistoPrRequestPermissionEvent", new C94666n(fVar));
            return C22538o.f62144n;
        }
        throw new C22428d(dyVar);
    }
}
