package com.google.android.apps.gsa.staticplugins.accl.performers.p7347h;

import com.google.android.apps.gsa.n.g.i;
import com.google.android.apps.gsa.n.g.u;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.aek;
import com.google.assistant.p3897e.p3921j.aem;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65849r;

@Deprecated
/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h.c */
/* compiled from: PG */
public final class C93164c extends C22538o {

    /* renamed from: d */
    public static final /* synthetic */ int f259843d = 0;

    /* renamed from: a */
    public final u f259844a;

    /* renamed from: b */
    public final C21370a f259845b;

    /* renamed from: c */
    public final C86124t f259846c;

    /* renamed from: e */
    private final C86054o f259847e;

    /* renamed from: f */
    private final i f259848f;

    /* renamed from: g */
    private final C22871g f259849g;

    public C93164c(C86054o oVar, i iVar, u uVar, C22871g gVar, C21370a aVar, C86124t tVar) {
        this.f259847e = oVar;
        this.f259848f = iVar;
        this.f259844a = uVar;
        this.f259849g = gVar;
        this.f259845b = aVar;
        this.f259846c = tVar;
    }

    /* renamed from: b */
    private final C60870cx m153236b(boolean z) {
        String F = this.f259847e.mo79659F();
        if (F == null) {
            return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, "Account name cannot be null."));
        }
        return C60922j.m93044g(this.f259849g.mo28210j(this.f259848f.a(F, C65753ak.ASSISTANT_SETTINGS, "driving_settings", C63662ac.f172144a, C65849r.f179002c), "readPreviousAssistantSettings", new C93121a(this, z, F)), C93148b.f259797a, C60826bg.f164896a);
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("auto_read.MODIFY_SETTINGS")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            int a = aek.m86299a(((aem) m41992m(dwVar, "auto_read_settings_args", aem.f134938b.getParserForType())).f134940a);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 1) {
                return m153236b(true);
            }
            if (i == 2) {
                return m153236b(false);
            }
            throw new C22428d(dyVar);
        }
        throw new C22428d(dyVar);
    }
}
