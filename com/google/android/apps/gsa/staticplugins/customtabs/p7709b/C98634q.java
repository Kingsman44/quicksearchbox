package com.google.android.apps.gsa.staticplugins.customtabs.p7709b;

import android.content.Context;
import android.util.SparseArray;
import androidx.browser.p059a.C0962j;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.p6519al.p6660cn.C85142a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7061g.C89917a;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91007g;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.staticplugins.customtabs.p7708a.C98570f;
import com.google.android.apps.gsa.staticplugins.customtabs.p7708a.C98572h;
import com.google.android.apps.gsa.staticplugins.customtabs.p7708a.C98573i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1703d.C20645ai;
import com.google.android.libraries.p1703d.C20665u;
import com.google.android.libraries.p1703d.C20670z;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.b.q */
/* compiled from: PG */
public final class C98634q implements C91007g {

    /* renamed from: a */
    public static final C59071e f275470a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.customtabs.b.q");

    /* renamed from: b */
    public static final long f275471b = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: c */
    public final C98573i f275472c;

    /* renamed from: d */
    public final C98570f f275473d;

    /* renamed from: e */
    public final C22871g f275474e;

    /* renamed from: f */
    public final C86124t f275475f;

    /* renamed from: g */
    public final SparseArray f275476g;

    /* renamed from: h */
    public volatile C20665u f275477h;

    /* renamed from: i */
    public volatile C98642y f275478i;

    /* renamed from: j */
    public volatile C98642y f275479j;

    /* renamed from: k */
    private final Context f275480k;

    /* renamed from: l */
    private final C98643z f275481l;

    /* renamed from: m */
    private final Object f275482m = new Object();

    /* renamed from: n */
    private final C58881cr f275483n;

    /* renamed from: o */
    private final C22871g f275484o;

    /* renamed from: p */
    private final AtomicInteger f275485p;

    /* renamed from: q */
    private C98633p f275486q;

    public C98634q(Context context, C98573i iVar, C98570f fVar, C98643z zVar, C22871g gVar, C22871g gVar2, C86124t tVar, C68214a aVar, C21370a aVar2) {
        this.f275472c = iVar;
        this.f275473d = fVar;
        this.f275481l = zVar;
        this.f275484o = gVar;
        this.f275474e = gVar2;
        this.f275475f = tVar;
        this.f275483n = C58886cw.m90973a(new C98626i(aVar));
        this.f275485p = new AtomicInteger((int) (aVar2.mo26871c() % 2147483648L));
        this.f275476g = new SparseArray();
        this.f275480k = context;
    }

    /* renamed from: a */
    public final C98572h mo91230a(C20665u uVar) {
        C98572h a = this.f275472c.mo91191a();
        return a == null ? this.f275472c.mo91192b(uVar) : a;
    }

    /* renamed from: b */
    public final C98642y mo91231b(C20665u uVar, int i) {
        C20670z zVar;
        if (mo91230a(uVar).mo91189j()) {
            zVar = uVar.mo25659e(i);
        } else {
            C59104x c = f275470a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "CustomTabsController");
            ((C59052c) ((C59052c) c).mo56372aa(19135)).mo56386p("CCT session id support is not available. Falling back to id-less sessions");
            zVar = uVar.mo25658d();
        }
        C20670z zVar2 = zVar;
        if (zVar2 == null) {
            return null;
        }
        C98643z zVar3 = this.f275481l;
        C98621d dVar = r2;
        C98621d dVar2 = new C98621d(this);
        C98622e eVar = r2;
        C98622e eVar2 = new C98622e(this);
        Context context = (Context) zVar3.f275522a.mo17428b();
        context.getClass();
        C86124t tVar = (C86124t) zVar3.f275523b.mo17428b();
        tVar.getClass();
        C98573i iVar = (C98573i) zVar3.f275524c.mo17428b();
        iVar.getClass();
        C22871g gVar = (C22871g) zVar3.f275525d.mo17428b();
        gVar.getClass();
        C22871g gVar2 = (C22871g) zVar3.f275526e.mo17428b();
        gVar2.getClass();
        C22871g gVar3 = (C22871g) zVar3.f275527f.mo17428b();
        gVar3.getClass();
        C85142a aVar = (C85142a) zVar3.f275528g.mo17428b();
        aVar.getClass();
        C98611ap apVar = (C98611ap) zVar3.f275529h.mo17428b();
        apVar.getClass();
        C68214a a = C68219e.m98518a(((C68226l) zVar3.f275530i).f184585a);
        a.getClass();
        C98595a aVar2 = (C98595a) zVar3.f275531j.mo17428b();
        aVar2.getClass();
        C85929cw cwVar = (C85929cw) zVar3.f275532k.mo17428b();
        cwVar.getClass();
        C89917a aVar3 = (C89917a) zVar3.f275533l.mo17428b();
        C98642y yVar = r2;
        aVar3.getClass();
        C98642y yVar2 = new C98642y(context, tVar, iVar, gVar, gVar2, gVar3, aVar, apVar, a, aVar2, cwVar, aVar3, zVar2, i, dVar, eVar);
        yVar.f275506k.f57940c.f57883a = yVar.f275507l;
        if (yVar.f275498c.mo79743a(C90110fh.f250579D) > 0) {
            C20670z zVar4 = yVar.f275506k;
            C20665u uVar2 = zVar4.f57938a;
            uVar2.f57933b.mo3580a("requestBottomBarScrollStateForSession", zVar4.mo25662a());
        }
        if (!yVar.f275498c.mo79746e(C90110fh.f250592Q)) {
            yVar.f275503h.mo91204c(yVar.f275506k);
        } else if (!yVar.f275506k.f57938a.mo25588l()) {
            yVar.f275509n = yVar.f275503h.mo91204c(yVar.f275506k);
        }
        C98642y yVar3 = yVar;
        synchronized (this.f275476g) {
            this.f275476g.append(i, new WeakReference(yVar3));
        }
        return yVar3;
    }

    /* renamed from: c */
    public final C60870cx mo91232c() {
        synchronized (this.f275482m) {
            C98572h a = this.f275472c.mo91191a();
            if (a == null) {
                C58976aa aaVar = C58975e.f156826a;
                C60870cx i = C60856cj.m92900i(false);
                return i;
            }
            C98633p pVar = this.f275486q;
            if (pVar != null) {
                C58976aa aaVar2 = C58975e.f156826a;
                C60870cx j = C60856cj.m92901j(pVar.f275468b);
                return j;
            }
            C58976aa aaVar3 = C58975e.f156826a;
            C118831d dVar = (C118831d) this.f275483n.mo6453a();
            long a2 = dVar.mo104019a();
            C98633p pVar2 = new C98633p(this);
            if (C0962j.m2898d(this.f275480k, a.f57882c.mo25582b(), pVar2)) {
                this.f275486q = pVar2;
                SettableFuture settableFuture = pVar2.f275468b;
                C60856cj.m92911t(settableFuture, new C98628k(dVar, a2), C60826bg.f164896a);
                this.f275484o.mo28213m("Time limit for CCT connection", f275471b, new C98627j(this, settableFuture));
                C60870cx j2 = C60856cj.m92901j(settableFuture);
                return j2;
            }
            C60870cx i2 = C60856cj.m92900i(false);
            return i2;
        }
    }

    /* renamed from: e */
    public final void mo91233e(C20665u uVar) {
        this.f275479j = mo91231b(uVar, this.f275485p.getAndIncrement());
    }

    /* renamed from: f */
    public final void mo91234f() {
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f275482m) {
            C98633p pVar = this.f275486q;
            if (pVar != null) {
                try {
                    this.f275480k.unbindService(pVar);
                } catch (RuntimeException e) {
                    C59104x c = f275470a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "CustomTabsController");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(19146)).mo56386p("Failed to unbind ServiceConnection");
                }
                this.f275486q = null;
            }
        }
        this.f275478i = null;
        this.f275479j = null;
        synchronized (this.f275476g) {
            this.f275476g.clear();
        }
    }

    /* renamed from: g */
    public final void mo91235g(C20645ai aiVar) {
        C98642y yVar = this.f275479j;
        if (yVar == null) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        yVar.f275506k.mo25669h(aiVar);
        C58976aa aaVar2 = C58975e.f156826a;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("CustomTabsConnectionController");
        synchronized (this.f275482m) {
            fVar.mo85279c("hasServiceConnection").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f275486q != null)));
        }
        fVar.mo85287n(this.f275478i);
        fVar.mo85287n(this.f275479j);
    }
}
