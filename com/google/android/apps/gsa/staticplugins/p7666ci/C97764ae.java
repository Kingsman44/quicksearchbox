package com.google.android.apps.gsa.staticplugins.p7666ci;

import android.content.Context;
import com.google.android.apps.gsa.p8839t.p8842c.C118348a;
import com.google.android.apps.gsa.p8839t.p8846g.C118378l;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.search.assistant.platform.pcp.api.C123587c;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.C123991o;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123623b;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.apps.search.assistant.platform.pcp.p9337g.C124013j;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.ae */
/* compiled from: PG */
public final class C97764ae implements C118348a, C90991b {

    /* renamed from: a */
    public static final C59071e f272971a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ci.ae");

    /* renamed from: b */
    public final Context f272972b;

    /* renamed from: c */
    public final C68214a f272973c;

    /* renamed from: d */
    public final Executor f272974d;

    /* renamed from: e */
    private final C22871g f272975e;

    /* renamed from: f */
    private final C86034c f272976f;

    /* renamed from: g */
    private final C118378l f272977g;

    /* renamed from: h */
    private final C68214a f272978h;

    /* renamed from: i */
    private final C46175b f272979i;

    /* renamed from: com.google.android.apps.gsa.staticplugins.ci.ae$a */
    /* compiled from: PG */
    public interface C97765a {
        /* renamed from: O */
        C123587c mo90806O();

        /* renamed from: Q */
        C123623b mo90807Q();

        /* renamed from: T */
        C123991o mo90808T();

        /* renamed from: Z */
        C124013j mo90809Z();
    }

    public C97764ae(Context context, C22871g gVar, Executor executor, C86034c cVar, C118378l lVar, C68214a aVar, C68214a aVar2, C46175b bVar, C91022f fVar) {
        this.f272972b = context;
        this.f272975e = gVar;
        this.f272974d = executor;
        this.f272976f = cVar;
        this.f272977g = lVar;
        this.f272978h = aVar;
        this.f272979i = bVar;
        this.f272973c = aVar2;
        fVar.mo85301a(this);
    }

    /* renamed from: a */
    public final C60870cx mo90803a() {
        C60870cx a = this.f272977g.mo103687a(4);
        C60870cx d = this.f272979i.mo50247d();
        return C47638k.m84751b(a, d).mo51521b(new C97849u(this, d, a), this.f272974d);
    }

    /* renamed from: b */
    public final C60870cx mo90804b(C53306j jVar, Optional optional, C123777f fVar, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        ((C89859i) this.f272973c.mo27525b()).mo83702b(C89849ae.PCP_FORCE_GET_PROACTIVE_CONTENT_START);
        C60870cx a = this.f272977g.mo103687a(3);
        C60870cx b = this.f272976f.mo79697b();
        C60870cx b2 = C47638k.m84751b(a, b).mo51521b(new C97760aa(this, b, jVar, a, optional, fVar, z), C60826bg.f164896a);
        new C90873ag(C90877ak.m148471e(b2, ((C86124t) this.f272978h.mo27525b()).mo79743a(C90014bt.f247810oF), TimeUnit.SECONDS, this.f272975e), this.f272975e, "Log AppFlow end event.", new C97762ac(this)).mo85223a(new C97763ad(this));
        return b2;
    }

    /* renamed from: c */
    public final C60870cx mo90805c(C53306j jVar, Set set, C123777f fVar, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (jVar == C53306j.AMBIENT_ASSISTANT) {
            return mo90804b(jVar, Optional.m71637of(set), fVar, false);
        }
        C60870cx a = this.f272977g.mo103687a(3);
        C60870cx b = this.f272976f.mo79697b();
        return C47638k.m84751b(a, b).mo51521b(new C97851w(this, b, jVar, set, z, a, fVar), this.f272974d);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("PCP State Dump");
        C47633f.m84733g(this.f272979i.mo50247d()).mo51516i(new C97854z(this, new ArrayList(), fVar), this.f272974d);
    }
}
