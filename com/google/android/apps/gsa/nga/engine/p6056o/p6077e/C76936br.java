package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import com.google.android.apps.gsa.assistant.shared.C73848bu;
import com.google.android.apps.gsa.nga.engine.p5960as.C75042j;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6243v.C79356f;
import com.google.android.apps.gsa.nga.engine.p6243v.C79359i;
import com.google.android.apps.gsa.nga.shared.p6345h.C81251ap;
import com.google.android.apps.gsa.nga.shared.p6345h.C81315k;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p3186j$.time.temporal.Temporal;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.br */
/* compiled from: PG */
public final class C76936br extends C79356f implements C75042j {

    /* renamed from: a */
    public final AtomicReference f212422a = new AtomicReference(true);

    /* renamed from: b */
    private final C60950i f212423b;

    /* renamed from: c */
    private final C73848bu f212424c;

    /* renamed from: d */
    private final C22871g f212425d;

    /* renamed from: e */
    private final C91142g f212426e;

    /* renamed from: f */
    private final C81315k f212427f;

    /* renamed from: g */
    private final C76092h f212428g;

    public C76936br(C60950i iVar, C73848bu buVar, C22871g gVar, C91142g gVar2, C81315k kVar, C79359i iVar2, C76092h hVar) {
        super(iVar2, C58528ij.m90011K(Integer.valueOf(C90037cp.f248426aG.f248757a), Integer.valueOf(C90037cp.f248592dj.f250556a)));
        this.f212423b = iVar;
        this.f212424c = buVar;
        this.f212425d = gVar;
        this.f212426e = gVar2;
        this.f212427f = kVar;
        this.f212428g = hVar;
    }

    /* renamed from: b */
    private final C60870cx m123584b() {
        if (mo71200a()) {
            this.f212422a.set(false);
            return C60856cj.m92900i(C118826c.f331422a);
        }
        C73848bu buVar = this.f212424c;
        return this.f212425d.mo28209i(buVar.mo65334a(buVar.f195151a), "[NGA] setShouldEnableSpeedBump", new C76935bq(this));
    }

    /* renamed from: I */
    public final void mo71412I(C81251ap apVar) {
        if (C81251ap.GROWTH_PREFERENCES.equals(apVar)) {
            m123584b();
        }
    }

    /* renamed from: a */
    public final boolean mo71200a() {
        long millis = Duration.ofDays(this.f212426e.mo85399d(C90037cp.f248592dj)).toMillis();
        if (millis <= 0) {
            return false;
        }
        Optional X = this.f212427f.mo74876X();
        if (!X.isPresent() || Duration.between((Temporal) X.get(), this.f212423b.mo57444a()).toMillis() <= millis) {
            return true;
        }
        return false;
    }

    /* renamed from: gC */
    public final boolean mo71201gC() {
        return this.f212428g.mo72021b().mo72041f() && this.f212426e.mo85405j(C90037cp.f248426aG);
    }

    /* access modifiers changed from: protected */
    /* renamed from: gD */
    public final boolean mo71822gD() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C60870cx mo71202h() {
        return m123584b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C60870cx mo71203i() {
        this.f212422a.set(true);
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* renamed from: l */
    public final String mo71204l() {
        return "SpeedBumpHelper";
    }

    /* renamed from: o */
    public final int mo71205o() {
        return 72;
    }
}
