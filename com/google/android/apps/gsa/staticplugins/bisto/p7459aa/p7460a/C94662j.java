package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7460a;

import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.C94785f;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52648zn;
import com.google.assistant.p3897e.p3921j.C52654zt;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.a.j */
/* compiled from: PG */
public final class C94662j extends C22538o {

    /* renamed from: a */
    public final C94785f f264757a;

    /* renamed from: b */
    private final C22871g f264758b;

    public C94662j(C94785f fVar, C22871g gVar) {
        this.f264757a = fVar;
        this.f264758b = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if ("mic.UPDATE".equals(dyVar.f135936b)) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            int b = C52648zn.m86683b(((C52654zt) m41992m(dwVar, "mic_behavior_args", C52654zt.f138233e.getParserForType())).f138236b);
            if (b != 0 && b == 2) {
                this.f264758b.mo28212l("notify", new C94661i(this));
            }
            return C22538o.f62144n;
        }
        throw new C22428d(dyVar);
    }
}
