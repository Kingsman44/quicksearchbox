package com.google.android.apps.gsa.nga.engine.warmactions.p6250c;

import com.google.android.apps.gsa.assistant.settings.features.p545ag.p547b.C10036m;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6243v.C79359i;
import com.google.android.apps.gsa.nga.engine.p6243v.C79360j;
import com.google.android.apps.gsa.nga.engine.warmactions.C79475c;
import com.google.android.apps.gsa.nga.engine.warmactions.p6248a.C79456n;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6332a.C81005a;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6332a.C81006b;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6332a.C81009e;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.c.m */
/* compiled from: PG */
public final class C79488m extends C79360j implements C90991b, C79475c {

    /* renamed from: a */
    public final C79456n f218177a;

    /* renamed from: b */
    private final C76092h f218178b;

    /* renamed from: c */
    private final C60887da f218179c;

    /* renamed from: d */
    private final C81006b f218180d;

    /* renamed from: e */
    private final C91142g f218181e;

    /* renamed from: f */
    private final C10036m f218182f;

    public C79488m(C79359i iVar, C76092h hVar, C60887da daVar, C79456n nVar, C81006b bVar, C10036m mVar, C91142g gVar) {
        super(iVar, hVar, C81009e.f222032b);
        this.f218178b = hVar;
        this.f218179c = daVar;
        this.f218177a = nVar;
        this.f218180d = bVar;
        this.f218182f = mVar;
        this.f218181e = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: gB */
    public final boolean mo72819gB() {
        boolean a = C81005a.m128912a(this.f218180d);
        if (!this.f218181e.mo85405j(C90126fx.f251777ph)) {
            return a;
        }
        return a && this.f218178b.mo72021b().mo72036b() == C120124o.CLASSIC;
    }

    /* access modifiers changed from: protected */
    /* renamed from: gD */
    public final boolean mo71822gD() {
        return true;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("MWW Manager");
        fVar.mo85278b("Component enabled").mo85276a(C90752i.m148228b(Boolean.valueOf(mo72819gB())));
        fVar.mo85278b("Should reinitialize").mo85276a(C90752i.m148228b(true));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C60870cx mo71202h() {
        if (!mo72819gB()) {
            return C118826c.f331423b;
        }
        return C60922j.m93044g(this.f218182f.f34245a.mo46042d(), new C79487l(this), this.f218179c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C60870cx mo71203i() {
        return this.f218179c.mo19399b(new C79486k(this));
    }

    /* renamed from: l */
    public final String mo71204l() {
        return "WarmActionsManager";
    }

    /* renamed from: o */
    public final int mo71205o() {
        return 60;
    }
}
