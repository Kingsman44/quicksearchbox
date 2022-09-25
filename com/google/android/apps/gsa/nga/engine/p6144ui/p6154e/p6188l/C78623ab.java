package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.n.g.i;
import com.google.android.apps.gsa.nga.engine.p6029g.C76088d;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78257g;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65851t;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.ab */
/* compiled from: PG */
public final class C78623ab implements C78257g, C76088d {

    /* renamed from: a */
    public static final C59071e f216506a = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.ui.e.l.ab");

    /* renamed from: b */
    public String f216507b = BuildConfig.FLAVOR;

    /* renamed from: c */
    private final C22871g f216508c;

    /* renamed from: d */
    private final C76092h f216509d;

    /* renamed from: e */
    private final i f216510e;

    /* renamed from: f */
    private C60870cx f216511f = C60856cj.m92898g();

    public C78623ab(C22871g gVar, C76092h hVar, i iVar) {
        this.f216508c = gVar;
        this.f216509d = hVar;
        this.f216510e = iVar;
    }

    /* renamed from: Q */
    public final void mo71863Q() {
        Optional d = this.f216509d.mo72021b().mo72038d();
        if (d.isPresent() && !d.isEmpty() && d.get() != null) {
            if (!this.f216511f.isDone() || !this.f216511f.isCancelled()) {
                this.f216511f.cancel(true);
            }
            C60870cx i = this.f216508c.mo28209i(this.f216510e.c((String) d.get(), C65753ak.ASSISTANT_USER_DISPLAY_NAME, (String) null, C63662ac.f172144a, C65851t.f179007c), "[NGA] Read Assistant user display name from Geller", C78719y.f216684a);
            this.f216511f = i;
            new C90873ag(i, this.f216508c, "Parse user name from Geller response", new C78720z(this)).mo85223a(C78622aa.f216505a);
        }
    }

    /* renamed from: a */
    public final String mo73234a() {
        return this.f216507b;
    }

    /* renamed from: gC */
    public final boolean mo71201gC() {
        return true;
    }

    /* renamed from: gE */
    public final /* synthetic */ void mo73556gE(C58528ij ijVar) {
    }

    /* renamed from: l */
    public final String mo71204l() {
        return "NavBar assistant username observer";
    }

    /* renamed from: o */
    public final int mo71205o() {
        return 70;
    }
}
