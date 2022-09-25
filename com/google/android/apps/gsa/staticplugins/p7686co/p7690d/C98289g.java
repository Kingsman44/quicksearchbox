package com.google.android.apps.gsa.staticplugins.p7686co.p7690d;

import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.proactive.p6475b.C84160c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90996e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90998g;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.sidekick.main.entry.C91320ay;
import com.google.android.apps.gsa.sidekick.main.entry.C91329bg;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91388r;
import com.google.android.apps.gsa.sidekick.main.p7204g.C91391c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C8142xb;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.d.g */
/* compiled from: PG */
public final class C98289g implements C91391c {

    /* renamed from: a */
    public final C91320ay f274382a;

    /* renamed from: b */
    public final C91329bg f274383b;

    /* renamed from: c */
    public final C69464a f274384c;

    /* renamed from: d */
    public final C86124t f274385d;

    /* renamed from: e */
    public final C118827a f274386e;

    /* renamed from: f */
    public final C58881cr f274387f = C58886cw.m90973a(new C98288f(this));

    /* renamed from: g */
    public final C21370a f274388g;

    /* renamed from: h */
    private final C84160c f274389h;

    /* renamed from: i */
    private final C91388r f274390i;

    /* renamed from: j */
    private final C90998g f274391j;

    public C98289g(C84160c cVar, C91320ay ayVar, C91329bg bgVar, C69464a aVar, C86124t tVar, C91388r rVar, C90998g gVar, C118827a aVar2, C21370a aVar3) {
        this.f274389h = cVar;
        this.f274382a = ayVar;
        this.f274383b = bgVar;
        this.f274384c = aVar;
        this.f274385d = tVar;
        this.f274390i = rVar;
        this.f274391j = gVar;
        this.f274386e = aVar2;
        this.f274388g = aVar3;
    }

    /* renamed from: a */
    public final C60870cx mo85725a(C7642eo eoVar) {
        C60870cx c = this.f274389h.mo77602c(eoVar, false);
        C84160c cVar = this.f274389h;
        Objects.requireNonNull(cVar);
        C60870cx h = C60922j.m93045h(c, new C98286d(cVar), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return h;
    }

    /* renamed from: b */
    public final C60870cx mo85726b() {
        C60870cx g = C60922j.m93044g(this.f274382a.mo85616f(), new C98285c(this), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }

    /* renamed from: c */
    public final C60870cx mo85727c(C7642eo eoVar, String str) {
        C60870cx i = this.f274389h.mo77608i(eoVar, str);
        C84160c cVar = this.f274389h;
        Objects.requireNonNull(cVar);
        C60870cx h = C60922j.m93045h(i, new C98286d(cVar), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return h;
    }

    /* renamed from: d */
    public final C8142xb mo85728d() {
        return this.f274383b.mo85645e();
    }

    /* renamed from: e */
    public final String mo85729e() {
        return this.f274383b.mo85646f();
    }

    /* renamed from: f */
    public final C60870cx mo85730f(C8142xb xbVar, boolean z, C7642eo eoVar, C7669fo foVar, int i) {
        boolean z2 = this.f274385d.mo79746e(C90010bp.f246923S) && i != 2 && (!this.f274390i.mo85710b() || foVar != null || i == 3);
        if (z2) {
            if (foVar != null) {
                C58976aa aaVar = C58975e.f156826a;
                this.f274391j.mo85270f("Promotion: targetContentId", C90996e.f254198a);
            }
            if (!this.f274390i.mo85710b()) {
                C58976aa aaVar2 = C58975e.f156826a;
                this.f274391j.mo85270f("Promotion: expired session", C90996e.f254198a);
            }
            if (i == 3) {
                C58976aa aaVar3 = C58975e.f156826a;
                this.f274391j.mo85270f(String.format("Promoting background tree due to directive: %s (client trace %s)", new Object[]{"PROMOTE", Integer.valueOf(eoVar.f26533bC)}), C90996e.f254198a);
            }
        }
        C60870cx h = C60922j.m93045h(this.f274382a.mo85614c(z2, xbVar), new C98287e(this, xbVar, z, eoVar), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return h;
    }
}
