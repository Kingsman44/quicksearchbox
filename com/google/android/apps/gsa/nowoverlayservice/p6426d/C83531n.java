package com.google.android.apps.gsa.nowoverlayservice.p6426d;

import android.content.Context;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.View;
import android.view.Window;
import com.facebook.litho.C6105ap;
import com.google.android.apps.gsa.nowoverlayservice.C83546s;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90994c;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90996e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90997f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90998g;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10348f.C136470f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3041d.C39143kr;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import dagger.C68214a;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.d.n */
/* compiled from: PG */
public final class C83531n implements C83520c {

    /* renamed from: a */
    public static final C59071e f227738a = C59071e.m91332i("com.google.android.apps.gsa.nowoverlayservice.d.n");

    /* renamed from: k */
    private static final Set f227739k = new HashSet();

    /* renamed from: b */
    public final C68214a f227740b;

    /* renamed from: c */
    public final C68214a f227741c;

    /* renamed from: d */
    public final Executor f227742d;

    /* renamed from: e */
    public final C90998g f227743e;

    /* renamed from: f */
    public C83530m f227744f = C83530m.CONSTRUCTED;

    /* renamed from: g */
    public Context f227745g;

    /* renamed from: h */
    public int f227746h;

    /* renamed from: i */
    C83518a f227747i;

    /* renamed from: j */
    public boolean f227748j;

    /* renamed from: l */
    private final C68214a f227749l;

    /* renamed from: m */
    private final Executor f227750m;

    /* renamed from: n */
    private boolean f227751n;

    /* renamed from: o */
    private Runnable f227752o;

    public C83531n(C21370a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, Executor executor, Executor executor2) {
        this.f227749l = aVar2;
        this.f227740b = aVar3;
        this.f227741c = aVar4;
        this.f227750m = executor;
        this.f227742d = executor2;
        this.f227743e = new C90994c(aVar, 20);
    }

    /* renamed from: s */
    public static C136470f m132986s(Fragment fragment) {
        return (C136470f) ((C47231d) fragment).mo17754z();
    }

    /* renamed from: v */
    private final C136470f m132987v() {
        Fragment r = mo76851r();
        if (r != null) {
            return m132986s(r);
        }
        return null;
    }

    /* renamed from: w */
    private final void m132988w(C83530m mVar) {
        String valueOf = String.valueOf(this.f227744f);
        String valueOf2 = String.valueOf(mVar);
        this.f227743e.mo85270f("advancing from " + valueOf + " to " + valueOf2, C90996e.f254198a);
        this.f227744f = mVar;
    }

    /* renamed from: x */
    private final void m132989x(Consumer consumer) {
        C136470f v = m132987v();
        if (v != null) {
            consumer.accept(v);
        }
    }

    /* renamed from: a */
    public final Optional mo76830a() {
        C136470f v = m132987v();
        if (v == null) {
            return Optional.empty();
        }
        return v.mo113066d();
    }

    /* renamed from: b */
    public final void mo76831b(boolean z) {
        this.f227743e.mo85270f("minimizeUiUpdates(" + z + ")", C90996e.f254198a);
        m132989x(new C83528k(z));
    }

    /* renamed from: c */
    public final void mo76832c(Bundle bundle) {
        Set set = f227739k;
        if (!set.isEmpty()) {
            ((C19567d) ((C39143kr) this.f227741c.mo27525b()).f103056a.f103088A.mo6453a()).mo24822a(1, Integer.valueOf(set.size()));
        }
        Context context = this.f227745g;
        C58838bb.m90866a(context, "FragmentHost must be initialized first via #prepareTngFragmentHost()");
        C6105ap.m15885a(context);
        if (!set.add(this.f227745g)) {
            ((C19567d) ((C39143kr) this.f227741c.mo27525b()).f103056a.f103117z.mo6453a()).mo24822a(1, new Object[0]);
        }
        C83518a aVar = this.f227747i;
        C58838bb.m90866a(aVar, "FragmentHost must be initialized first via #prepareTngFragmentHost()");
        aVar.mo19987jP(bundle);
        m132988w(C83530m.CREATED);
    }

    /* renamed from: e */
    public final void mo76833e() {
        C83518a aVar = this.f227747i;
        C58838bb.m90866a(aVar, "FragmentHost must be initialized first via #prepareTngFragmentHost()");
        aVar.mo51129jQ();
        m132988w(C83530m.DESTROYED);
        this.f227752o = null;
        Context context = this.f227745g;
        context.getClass();
        C6105ap.m15886b(context);
        f227739k.remove(this.f227745g);
    }

    /* renamed from: f */
    public final void mo76834f() {
        if (this.f227748j) {
            this.f227748j = false;
            m132989x(C83524g.f227711a);
            this.f227743e.mo85270f("onFeedHide", C90996e.f254198a);
        }
    }

    /* renamed from: g */
    public final void mo76835g() {
        if (!this.f227748j) {
            this.f227748j = true;
            m132989x(C83521d.f227705a);
            this.f227743e.mo85270f("onFeedShow", C90996e.f254198a);
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("TngMinusOneIntegrationShim");
        this.f227743e.mo85271g(fVar, "recent events", (C90997f) null, false);
    }

    /* renamed from: h */
    public final void mo76836h(float f) {
        m132989x(new C83523f(f));
    }

    /* renamed from: i */
    public final void mo76837i() {
        C83518a aVar = this.f227747i;
        C58838bb.m90866a(aVar, "FragmentHost must be initialized first via #prepareTngFragmentHost()");
        aVar.mo51126e();
        m132988w(C83530m.PAUSED);
    }

    /* renamed from: j */
    public final void mo76838j() {
        C83518a aVar = this.f227747i;
        C58838bb.m90866a(aVar, "FragmentHost must be initialized first via #prepareTngFragmentHost()");
        aVar.mo51127f();
        m132988w(C83530m.RESUMED);
    }

    /* renamed from: k */
    public final void mo76839k(Bundle bundle) {
        C83518a aVar = this.f227747i;
        C58838bb.m90866a(aVar, "FragmentHost must be initialized first via #prepareTngFragmentHost()");
        aVar.mo51132v(bundle);
    }

    /* renamed from: l */
    public final void mo76840l() {
        C83518a aVar = this.f227747i;
        C58838bb.m90866a(aVar, "FragmentHost must be initialized first via #prepareTngFragmentHost()");
        aVar.mo51128g();
        m132988w(C83530m.STARTED);
    }

    /* renamed from: m */
    public final void mo76841m() {
        C83518a aVar = this.f227747i;
        C58838bb.m90866a(aVar, "FragmentHost must be initialized first via #prepareTngFragmentHost()");
        aVar.mo22016h();
        m132988w(C83530m.STOPPED);
    }

    /* renamed from: n */
    public final void mo76842n(boolean z) {
        if (this.f227751n != z) {
            C58976aa aaVar = C58975e.f156826a;
            this.f227751n = z;
            if (z) {
                this.f227743e.mo85270f("Deferring fragment initialization", C90996e.f254198a);
            }
            Runnable runnable = this.f227752o;
            if (!z && runnable != null) {
                this.f227743e.mo85270f("Running deferred fragment initialization", C90996e.f254198a);
                runnable.run();
                this.f227752o = null;
            }
        }
    }

    /* renamed from: o */
    public final boolean mo76843o() {
        Fragment r = mo76851r();
        if (r != null) {
            return m132986s(r).mo113075o();
        }
        return false;
    }

    /* renamed from: p */
    public final void mo76844p(Window window, View view, View view2, C83546s sVar) {
        this.f227742d.execute(C47810es.m84977q(new C83527j(this, window, view, view2, sVar)));
    }

    /* renamed from: q */
    public final void mo76845q(Context context, Window window, View view, View view2, C83546s sVar) {
        this.f227745g = context;
        this.f227746h = R.id.tng_container;
        mo76853u(window, view, view2, sVar, false);
    }

    /* renamed from: r */
    public final Fragment mo76851r() {
        C83518a aVar = this.f227747i;
        C58838bb.m90866a(aVar, "FragmentHost must be initialized first via #prepareTngFragmentHost()");
        FragmentManager q = aVar.mo51122q();
        if (q.f659z) {
            this.f227743e.mo85270f("FragmentManager is destroyed, cannot get fragment", C90996e.f254198a);
            return null;
        }
        return q.f634a.mo670b(this.f227746h);
    }

    /* renamed from: t */
    public final void mo76852t(View view, C83546s sVar, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        C60856cj.m92911t(((C86034c) this.f227749l.mo27525b()).mo79697b(), C47810es.m84974n(new C83529l(this, view, z, sVar)), this.f227750m);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        if (r4 != 5) goto L_0x0059;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0063  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo76853u(android.view.Window r3, android.view.View r4, android.view.View r5, com.google.android.apps.gsa.nowoverlayservice.C83546s r6, boolean r7) {
        /*
            r2 = this;
            com.google.android.apps.gsa.nowoverlayservice.d.a r0 = new com.google.android.apps.gsa.nowoverlayservice.d.a
            r0.<init>()
            android.content.Context r1 = r4.getContext()
            r0.mo51130t(r3, r4, r1)
            r2.f227747i = r0
            com.google.android.apps.gsa.nowoverlayservice.d.m r3 = r2.f227744f
            java.lang.String r3 = java.lang.String.valueOf(r3)
            com.google.android.apps.gsa.shared.util.debug.a.b.g r4 = r2.f227743e
            java.lang.String r0 = "advancing fragment host to state "
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r0.concat(r3)
            com.google.android.apps.gsa.shared.util.debug.a.b.e r0 = com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90996e.f254198a
            r4.mo85270f(r3, r0)
            com.google.android.apps.gsa.nowoverlayservice.d.a r3 = r2.f227747i
            java.lang.String r4 = "FragmentHost must be initialized first via #prepareTngFragmentHost()"
            com.google.common.base.C58838bb.m90866a(r3, r4)
            com.google.android.apps.gsa.nowoverlayservice.d.m r4 = com.google.android.apps.gsa.nowoverlayservice.p6426d.C83530m.CONSTRUCTED
            com.google.android.apps.gsa.nowoverlayservice.d.m r4 = r2.f227744f
            int r4 = r4.ordinal()
            r0 = 1
            r1 = 0
            if (r4 == r0) goto L_0x0056
            r0 = 2
            if (r4 == r0) goto L_0x004f
            r0 = 3
            if (r4 == r0) goto L_0x0045
            r0 = 4
            if (r4 == r0) goto L_0x004f
            r0 = 5
            if (r4 == r0) goto L_0x0056
            goto L_0x0059
        L_0x0045:
            r3.mo19987jP(r1)
            r3.mo51128g()
            r3.mo51127f()
            goto L_0x0059
        L_0x004f:
            r3.mo19987jP(r1)
            r3.mo51128g()
            goto L_0x0059
        L_0x0056:
            r3.mo19987jP(r1)
        L_0x0059:
            r2.f227752o = r1
            boolean r3 = r2.f227751n
            if (r3 != 0) goto L_0x0063
            r2.mo76852t(r5, r6, r7)
            return
        L_0x0063:
            com.google.android.apps.gsa.nowoverlayservice.d.e r3 = new com.google.android.apps.gsa.nowoverlayservice.d.e
            r3.<init>(r2, r5, r6, r7)
            r2.f227752o = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nowoverlayservice.p6426d.C83531n.mo76853u(android.view.Window, android.view.View, android.view.View, com.google.android.apps.gsa.nowoverlayservice.s, boolean):void");
    }
}
