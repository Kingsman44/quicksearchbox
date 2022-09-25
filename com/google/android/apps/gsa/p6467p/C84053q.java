package com.google.android.apps.gsa.p6467p;

import android.content.Context;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6884y.C87379h;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90091ep;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.search.googleapp.incognito.C136228b;
import com.google.android.apps.search.googleapp.incognito.education.p10326b.C136259a;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60826bg;

/* renamed from: com.google.android.apps.gsa.p.q */
/* compiled from: PG */
public final class C84053q implements C84042f {

    /* renamed from: a */
    public final C136259a f228938a;

    /* renamed from: b */
    public final Context f228939b;

    /* renamed from: c */
    private final C136228b f228940c;

    /* renamed from: d */
    private final C22871g f228941d;

    /* renamed from: e */
    private final C90021c f228942e;

    /* renamed from: f */
    private final C86034c f228943f;

    public C84053q(C136228b bVar, C22871g gVar, C136259a aVar, C90021c cVar, C86034c cVar2, Context context) {
        this.f228940c = bVar;
        this.f228941d = gVar;
        this.f228938a = aVar;
        this.f228942e = cVar;
        this.f228943f = cVar2;
        this.f228939b = context;
    }

    /* renamed from: a */
    public final void mo77506a(C87379h hVar, C23052c cVar, C84041e eVar, int i, C22871g gVar) {
        if (!this.f228942e.mo79746e(C90091ep.f250547j)) {
            mo77507b(hVar, i, eVar);
            return;
        }
        eVar.mo77505c();
        new C90873ag(C47633f.m84733g(C47633f.m84733g(this.f228943f.mo79697b()).mo51516i(new C84051o(this), C60826bg.f164896a)).mo51516i(new C84043g(this, gVar, hVar, cVar, eVar, i), C60826bg.f164896a), this.f228941d, "Get AccountId, Incognito Education State and launch modal.", C84047k.f228932a).mo85223a(C84048l.f228933a);
    }

    /* renamed from: b */
    public final void mo77507b(C91097g gVar, int i, C84041e eVar) {
        new C90873ag(this.f228940c.mo112855b(i), this.f228941d, "Start an Incognito session.", new C84049m(gVar, eVar)).mo85223a(C84050n.f228936a);
    }
}
