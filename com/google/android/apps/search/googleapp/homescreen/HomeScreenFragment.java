package com.google.android.apps.search.googleapp.homescreen;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.gsa.h.p.a;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.search.googleapp.accounts.C133149a;
import com.google.android.apps.search.googleapp.compliance.p10145b.C133611i;
import com.google.android.apps.search.googleapp.discover.p10181d.C134212aq;
import com.google.android.apps.search.googleapp.discover.streamui.C134714d;
import com.google.android.apps.search.googleapp.discover.streamui.C134720e;
import com.google.android.apps.search.googleapp.discover.streamui.C134744f;
import com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134724d;
import com.google.android.apps.search.googleapp.homescreen.p10313c.C136151b;
import com.google.android.apps.search.googleapp.homescreen.p10313c.C136153d;
import com.google.android.apps.search.googleapp.homescreen.searchbox.C136198a;
import com.google.android.apps.search.googleapp.homescreen.searchbox.C136199b;
import com.google.android.apps.search.googleapp.homescreen.searchbox.C136200c;
import com.google.android.apps.search.googleapp.p10257g.C135421al;
import com.google.android.apps.search.googleapp.p10257g.C135451x;
import com.google.android.apps.search.googleapp.p10257g.p10258a.C135408y;
import com.google.android.apps.search.googleapp.p10516t.p10520d.C139697a;
import com.google.android.apps.search.googleapp.p10516t.p10521e.C139701a;
import com.google.android.apps.search.googleapp.p10516t.p10522f.C139708c;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C136969bx;
import com.google.android.apps.search.googleapp.search.p10409e.C137419h;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139680b;
import com.google.android.apps.search.googleapp.startup.p10514a.C139676e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.experiments.C46897i;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.C68214a;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p3186j$.util.Optional;
import p5304e.p5305a.p5306a.p5411p.p5416c.p5417a.C69036bf;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class HomeScreenFragment extends C136211w implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C136193o f370774a;

    /* renamed from: c */
    private Context f370775c;

    /* renamed from: d */
    private final C2393x f370776d = new C2393x(this);

    /* renamed from: e */
    private boolean f370777e;

    @Deprecated
    public HomeScreenFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C136193o mo17754z() {
        C136193o oVar = this.f370774a;
        if (oVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f370777e) {
            return oVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo112796b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f370775c == null) {
            this.f370775c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f370775c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f122869b.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f370776d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C136141a.m221234a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C136193o a = mo17754z();
            if (bundle != null) {
                a.f370904Q = bundle.getBoolean("isActiveTab");
            }
            a.f370916k.mo50429i(a.f370900M);
            if (a.f370888A) {
                a.f370896I.mo50828h(R.id.googleapp_hint_text_subscription, new C133611i(a.f370895H), new C136184f(a));
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C136141a.m221234a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0206, code lost:
        r15 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        p5462h.p5472e.C69598b.m101013a(r14, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x020a, code lost:
        throw r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x020d, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        p5462h.p5472e.C69598b.m101013a(r1, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0211, code lost:
        throw r14;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r13, android.view.ViewGroup r14, android.os.Bundle r15) {
        /*
            r12 = this;
            java.lang.String r0 = "doodle"
            com.google.apps.tiktok.tracing.ab r1 = r12.f122869b
            r1.mo51381i()
            r12.mo51119t(r13, r14, r15)     // Catch:{ all -> 0x0212 }
            com.google.android.apps.search.googleapp.homescreen.o r15 = r12.mo17754z()     // Catch:{ all -> 0x0212 }
            java.lang.String r1 = "inflater"
            p5462h.p5473f.p5475b.C69664n.m101061g(r13, r1)     // Catch:{ all -> 0x0212 }
            java.lang.String r1 = "HomeScreenFragmentPeer#onCreateView"
            com.google.apps.tiktok.tracing.bi r1 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r1)     // Catch:{ all -> 0x0212 }
            com.google.android.libraries.search.k.h r2 = r15.f370906S     // Catch:{ all -> 0x020b }
            boolean r2 = r2.f101930a     // Catch:{ all -> 0x020b }
            r3 = 1
            if (r3 == r2) goto L_0x0024
            r2 = 2131625294(0x7f0e054e, float:1.8877792E38)
            goto L_0x0027
        L_0x0024:
            r2 = 2131625295(0x7f0e054f, float:1.8877794E38)
        L_0x0027:
            r4 = 0
            android.view.View r13 = r13.inflate(r2, r14, r4)     // Catch:{ all -> 0x020b }
            java.lang.String r14 = "inflater.inflate(\n      …oRoot= */ false\n        )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r14)     // Catch:{ all -> 0x020b }
            com.google.android.libraries.logging.ve.ab r14 = r15.f370913h     // Catch:{ all -> 0x020b }
            com.google.android.libraries.logging.ve.af r2 = r14.f76990a     // Catch:{ all -> 0x020b }
            r4 = 78437(0x13265, float:1.09914E-40)
            com.google.android.libraries.logging.ve.h r4 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r4)     // Catch:{ all -> 0x020b }
            com.google.android.libraries.logging.ve.c r2 = r2.mo33805a(r4)     // Catch:{ all -> 0x020b }
            r14.mo33801b(r13, r2)     // Catch:{ all -> 0x020b }
            r14 = 2131431554(0x7f0b1082, float:1.848484E38)
            android.view.View r14 = androidx.core.p098j.C2043bi.m5589r(r13, r14)     // Catch:{ all -> 0x020b }
            java.lang.String r2 = "requireViewById<Searchbo…p_facade_search_box_view)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r2)     // Catch:{ all -> 0x020b }
            com.google.android.apps.search.googleapp.homescreen.searchbox.SearchboxView r14 = (com.google.android.apps.search.googleapp.homescreen.searchbox.SearchboxView) r14     // Catch:{ all -> 0x020b }
            com.google.android.apps.search.googleapp.startup.a.e r2 = r15.f370920o     // Catch:{ all -> 0x020b }
            com.google.android.apps.search.googleapp.homescreen.HomeScreenFragment r4 = r15.f370907b     // Catch:{ all -> 0x020b }
            com.google.android.apps.search.googleapp.homescreen.g r5 = new com.google.android.apps.search.googleapp.homescreen.g     // Catch:{ all -> 0x020b }
            r5.<init>(r15)     // Catch:{ all -> 0x020b }
            r2.mo115161a(r4, r14, r5)     // Catch:{ all -> 0x020b }
            com.google.android.libraries.search.k.h r14 = r15.f370906S     // Catch:{ all -> 0x020b }
            boolean r14 = r14.f101930a     // Catch:{ all -> 0x020b }
            r2 = 8
            r4 = 0
            java.lang.String r5 = "requireViewById(root, R.…_hs_search_box_container)"
            r6 = 2131431587(0x7f0b10a3, float:1.8484907E38)
            if (r14 == 0) goto L_0x006d
            goto L_0x012a
        L_0x006d:
            android.view.View r14 = androidx.core.p098j.C2043bi.m5589r(r13, r6)     // Catch:{ all -> 0x020b }
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r5)     // Catch:{ all -> 0x020b }
            r7 = 2131431585(0x7f0b10a1, float:1.8484903E38)
            android.view.View r7 = androidx.core.p098j.C2043bi.m5589r(r13, r7)     // Catch:{ all -> 0x020b }
            java.lang.String r8 = "requireViewById(root, R.…eapp_hs_header_container)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)     // Catch:{ all -> 0x020b }
            com.google.android.apps.search.googleapp.homescreen.c.d r8 = r15.f370919n     // Catch:{ all -> 0x020b }
            com.google.android.apps.search.googleapp.homescreen.c.c r9 = new com.google.android.apps.search.googleapp.homescreen.c.c     // Catch:{ all -> 0x020b }
            r14.getClass()     // Catch:{ all -> 0x020b }
            g.a.a r8 = r8.f370811a     // Catch:{ all -> 0x020b }
            java.lang.Object r8 = r8.mo17428b()     // Catch:{ all -> 0x020b }
            android.content.Context r8 = (android.content.Context) r8     // Catch:{ all -> 0x020b }
            r8.getClass()     // Catch:{ all -> 0x020b }
            r9.<init>(r14, r8)     // Catch:{ all -> 0x020b }
            r15.f370902O = r9     // Catch:{ all -> 0x020b }
            com.google.android.apps.search.googleapp.homescreen.c.b r14 = r15.f370918m     // Catch:{ all -> 0x020b }
            com.google.android.apps.search.googleapp.homescreen.c.a r8 = new com.google.android.apps.search.googleapp.homescreen.c.a     // Catch:{ all -> 0x020b }
            r7.getClass()     // Catch:{ all -> 0x020b }
            g.a.a r14 = r14.f370806a     // Catch:{ all -> 0x020b }
            java.lang.Object r14 = r14.mo17428b()     // Catch:{ all -> 0x020b }
            android.app.Activity r14 = (android.app.Activity) r14     // Catch:{ all -> 0x020b }
            r14.getClass()     // Catch:{ all -> 0x020b }
            r8.<init>(r7, r14)     // Catch:{ all -> 0x020b }
            r15.f370901N = r8     // Catch:{ all -> 0x020b }
            boolean r14 = r15.f370894G     // Catch:{ all -> 0x020b }
            if (r14 != 0) goto L_0x00c2
            com.google.apps.tiktok.dataservice.dp r14 = r15.f370925t     // Catch:{ all -> 0x020b }
            com.google.android.apps.search.googleapp.g.a.y r7 = r15.f370924s     // Catch:{ all -> 0x020b }
            com.google.apps.tiktok.dataservice.ag r7 = r7.mo112310a()     // Catch:{ all -> 0x020b }
            com.google.android.apps.search.googleapp.homescreen.n r8 = new com.google.android.apps.search.googleapp.homescreen.n     // Catch:{ all -> 0x020b }
            r8.<init>(r15)     // Catch:{ all -> 0x020b }
            r14.mo50707a(r7, r8)     // Catch:{ all -> 0x020b }
        L_0x00c2:
            java.lang.String r14 = "HomeScreenFragmentPeer#maybeAttachDoodleFragment"
            com.google.apps.tiktok.tracing.bi r14 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r14)     // Catch:{ all -> 0x020b }
            com.google.android.apps.search.googleapp.homescreen.HomeScreenFragment r7 = r15.f370907b     // Catch:{ all -> 0x0204 }
            android.support.v4.app.FragmentManager r7 = r7.getChildFragmentManager()     // Catch:{ all -> 0x0204 }
            android.support.v4.app.cc r7 = r7.f634a     // Catch:{ all -> 0x0204 }
            android.support.v4.app.Fragment r7 = r7.mo671c(r0)     // Catch:{ all -> 0x0204 }
            if (r7 != 0) goto L_0x0127
            com.google.android.apps.search.googleapp.homescreen.HomeScreenFragment r7 = r15.f370907b     // Catch:{ all -> 0x0204 }
            android.support.v4.app.FragmentManager r7 = r7.getChildFragmentManager()     // Catch:{ all -> 0x0204 }
            android.support.v4.app.a r8 = new android.support.v4.app.a     // Catch:{ all -> 0x0204 }
            r8.<init>((android.support.p031v4.app.FragmentManager) r7)     // Catch:{ all -> 0x0204 }
            java.util.Set r7 = com.google.android.apps.search.googleapp.p10257g.C135435j.f368973a     // Catch:{ all -> 0x0204 }
            com.google.apps.tiktok.account.AccountId r7 = r15.f370912g     // Catch:{ all -> 0x0204 }
            com.google.android.apps.search.googleapp.g.f r9 = com.google.android.apps.search.googleapp.p10257g.C135431f.f368964f     // Catch:{ all -> 0x0204 }
            com.google.protobuf.bn r9 = r9.createBuilder()     // Catch:{ all -> 0x0204 }
            com.google.android.apps.search.googleapp.g.c r9 = (com.google.android.apps.search.googleapp.p10257g.C135428c) r9     // Catch:{ all -> 0x0204 }
            com.google.android.apps.search.googleapp.g.e r10 = com.google.android.apps.search.googleapp.p10257g.C135430e.HOMESCREEN     // Catch:{ all -> 0x0204 }
            r9.copyOnWrite()     // Catch:{ all -> 0x0204 }
            com.google.protobuf.bv r11 = r9.instance     // Catch:{ all -> 0x0204 }
            com.google.android.apps.search.googleapp.g.f r11 = (com.google.android.apps.search.googleapp.p10257g.C135431f) r11     // Catch:{ all -> 0x0204 }
            int r10 = r10.f368963g     // Catch:{ all -> 0x0204 }
            r11.f368967b = r10     // Catch:{ all -> 0x0204 }
            int r10 = r11.f368966a     // Catch:{ all -> 0x0204 }
            r3 = r3 | r10
            r11.f368966a = r3     // Catch:{ all -> 0x0204 }
            boolean r3 = r15.f370891D     // Catch:{ all -> 0x0204 }
            r9.copyOnWrite()     // Catch:{ all -> 0x0204 }
            com.google.protobuf.bv r10 = r9.instance     // Catch:{ all -> 0x0204 }
            com.google.android.apps.search.googleapp.g.f r10 = (com.google.android.apps.search.googleapp.p10257g.C135431f) r10     // Catch:{ all -> 0x0204 }
            int r11 = r10.f368966a     // Catch:{ all -> 0x0204 }
            r11 = r11 | r2
            r10.f368966a = r11     // Catch:{ all -> 0x0204 }
            r10.f368970e = r3     // Catch:{ all -> 0x0204 }
            com.google.protobuf.bv r3 = r9.build()     // Catch:{ all -> 0x0204 }
            java.lang.String r9 = "newBuilder()\n           …\n                .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r9)     // Catch:{ all -> 0x0204 }
            com.google.android.apps.search.googleapp.g.f r3 = (com.google.android.apps.search.googleapp.p10257g.C135431f) r3     // Catch:{ all -> 0x0204 }
            com.google.android.apps.search.googleapp.g.b r3 = com.google.android.apps.search.googleapp.p10257g.C135434i.m219595a(r7, r3)     // Catch:{ all -> 0x0204 }
            r7 = 2131431525(0x7f0b1065, float:1.8484782E38)
            r8.mo689v(r7, r3, r0)     // Catch:{ all -> 0x0204 }
            r8.mo509f()     // Catch:{ all -> 0x0204 }
        L_0x0127:
            p5462h.p5472e.C69598b.m101013a(r14, r4)     // Catch:{ all -> 0x020b }
        L_0x012a:
            com.google.android.apps.search.googleapp.discover.streamui.f r14 = r15.mo112824a()     // Catch:{ all -> 0x020b }
            if (r14 == 0) goto L_0x0133
            r15.mo112825k(r14)     // Catch:{ all -> 0x020b }
        L_0x0133:
            r14 = 2131431577(0x7f0b1099, float:1.8484887E38)
            android.view.View r14 = androidx.core.p098j.C2043bi.m5589r(r13, r14)     // Catch:{ all -> 0x020b }
            java.lang.String r0 = "requireViewById(root, R.…p_header_icons_container)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r0)     // Catch:{ all -> 0x020b }
            com.google.android.apps.search.googleapp.restrictedwidthlayout.RestrictedWidthLayout r14 = (com.google.android.apps.search.googleapp.restrictedwidthlayout.RestrictedWidthLayout) r14     // Catch:{ all -> 0x020b }
            boolean r0 = r15.f370891D     // Catch:{ all -> 0x020b }
            java.lang.String r3 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            if (r0 == 0) goto L_0x0170
            android.content.Context r0 = r15.f370908c     // Catch:{ all -> 0x020b }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ all -> 0x020b }
            r7 = 2131168487(0x7f070ce7, float:1.7951277E38)
            int r7 = r0.getDimensionPixelSize(r7)     // Catch:{ all -> 0x020b }
            r14.f373297a = r7     // Catch:{ all -> 0x020b }
            r14.requestLayout()     // Catch:{ all -> 0x020b }
            android.view.ViewGroup$LayoutParams r7 = r14.getLayoutParams()     // Catch:{ all -> 0x020b }
            p5462h.p5473f.p5475b.C69664n.m101059e(r7, r3)     // Catch:{ all -> 0x020b }
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7     // Catch:{ all -> 0x020b }
            r8 = 2131168489(0x7f070ce9, float:1.7951281E38)
            int r0 = r0.getDimensionPixelSize(r8)     // Catch:{ all -> 0x020b }
            r7.leftMargin = r0     // Catch:{ all -> 0x020b }
            r7.rightMargin = r0     // Catch:{ all -> 0x020b }
            r14.setLayoutParams(r7)     // Catch:{ all -> 0x020b }
        L_0x0170:
            com.google.android.apps.search.googleapp.homescreen.h r0 = new com.google.android.apps.search.googleapp.homescreen.h     // Catch:{ all -> 0x020b }
            r0.<init>(r15, r14)     // Catch:{ all -> 0x020b }
            r13.setOnApplyWindowInsetsListener(r0)     // Catch:{ all -> 0x020b }
            android.view.View r14 = androidx.core.p098j.C2043bi.m5589r(r13, r6)     // Catch:{ all -> 0x020b }
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r5)     // Catch:{ all -> 0x020b }
            com.google.android.apps.search.googleapp.restrictedwidthlayout.RestrictedWidthLayout r14 = (com.google.android.apps.search.googleapp.restrictedwidthlayout.RestrictedWidthLayout) r14     // Catch:{ all -> 0x020b }
            boolean r0 = r15.f370891D     // Catch:{ all -> 0x020b }
            if (r0 == 0) goto L_0x01b1
            android.content.Context r0 = r15.f370908c     // Catch:{ all -> 0x020b }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ all -> 0x020b }
            r5 = 2131168501(0x7f070cf5, float:1.7951306E38)
            int r5 = r0.getDimensionPixelSize(r5)     // Catch:{ all -> 0x020b }
            r14.f373297a = r5     // Catch:{ all -> 0x020b }
            r14.requestLayout()     // Catch:{ all -> 0x020b }
            android.view.ViewGroup$LayoutParams r5 = r14.getLayoutParams()     // Catch:{ all -> 0x020b }
            p5462h.p5473f.p5475b.C69664n.m101059e(r5, r3)     // Catch:{ all -> 0x020b }
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5     // Catch:{ all -> 0x020b }
            r3 = 2131168500(0x7f070cf4, float:1.7951304E38)
            int r0 = r0.getDimensionPixelSize(r3)     // Catch:{ all -> 0x020b }
            int r3 = r5.topMargin     // Catch:{ all -> 0x020b }
            int r6 = r5.bottomMargin     // Catch:{ all -> 0x020b }
            r5.setMargins(r0, r3, r0, r6)     // Catch:{ all -> 0x020b }
            r14.setLayoutParams(r5)     // Catch:{ all -> 0x020b }
        L_0x01b1:
            com.google.apps.tiktok.dataservice.dp r14 = r15.f370925t     // Catch:{ all -> 0x020b }
            com.google.android.apps.search.googleapp.promomanager.b.bx r0 = r15.f370890C     // Catch:{ all -> 0x020b }
            com.google.protos.aw.a.a.a.bu r3 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63934bu.LENS_ICON     // Catch:{ all -> 0x020b }
            com.google.protos.aw.a.a.a.bm r5 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm.HOME     // Catch:{ all -> 0x020b }
            com.google.apps.tiktok.dataservice.ag r0 = r0.mo113453j(r3, r5)     // Catch:{ all -> 0x020b }
            com.google.android.apps.search.googleapp.homescreen.k r3 = new com.google.android.apps.search.googleapp.homescreen.k     // Catch:{ all -> 0x020b }
            r3.<init>(r15)     // Catch:{ all -> 0x020b }
            r14.mo50707a(r0, r3)     // Catch:{ all -> 0x020b }
            com.google.apps.tiktok.dataservice.dp r14 = r15.f370925t     // Catch:{ all -> 0x020b }
            com.google.android.apps.search.googleapp.promomanager.b.bx r0 = r15.f370890C     // Catch:{ all -> 0x020b }
            com.google.protos.aw.a.a.a.bu r3 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63934bu.VOICE_SEARCH_ICON     // Catch:{ all -> 0x020b }
            com.google.protos.aw.a.a.a.bm r5 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm.HOME     // Catch:{ all -> 0x020b }
            com.google.apps.tiktok.dataservice.ag r0 = r0.mo113453j(r3, r5)     // Catch:{ all -> 0x020b }
            com.google.android.apps.search.googleapp.homescreen.l r3 = new com.google.android.apps.search.googleapp.homescreen.l     // Catch:{ all -> 0x020b }
            r3.<init>(r15)     // Catch:{ all -> 0x020b }
            r14.mo50707a(r0, r3)     // Catch:{ all -> 0x020b }
            com.google.android.apps.search.googleapp.startup.appinteractive.f r14 = r15.f370923r     // Catch:{ all -> 0x020b }
            com.google.android.apps.search.googleapp.homescreen.i r0 = new com.google.android.apps.search.googleapp.homescreen.i     // Catch:{ all -> 0x020b }
            r0.<init>(r15)     // Catch:{ all -> 0x020b }
            r14.mo115167b(r0)     // Catch:{ all -> 0x020b }
            boolean r14 = r15.f370931z     // Catch:{ all -> 0x020b }
            if (r14 == 0) goto L_0x01f3
            r14 = 2131432094(0x7f0b129e, float:1.8485936E38)
            android.view.View r14 = r13.findViewById(r14)     // Catch:{ all -> 0x020b }
            if (r14 == 0) goto L_0x01f3
            r14.setVisibility(r2)     // Catch:{ all -> 0x020b }
        L_0x01f3:
            p5462h.p5472e.C69598b.m101013a(r1, r4)     // Catch:{ all -> 0x0212 }
            if (r13 == 0) goto L_0x01fc
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r13
        L_0x01fc:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException     // Catch:{ all -> 0x0212 }
            java.lang.String r14 = "Fragment cannot use Event annotations with null view!"
            r13.<init>(r14)     // Catch:{ all -> 0x0212 }
            throw r13     // Catch:{ all -> 0x0212 }
        L_0x0204:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x0206 }
        L_0x0206:
            r15 = move-exception
            p5462h.p5472e.C69598b.m101013a(r14, r13)     // Catch:{ all -> 0x020b }
            throw r15     // Catch:{ all -> 0x020b }
        L_0x020b:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x020d }
        L_0x020d:
            r14 = move-exception
            p5462h.p5472e.C69598b.m101013a(r1, r13)     // Catch:{ all -> 0x0212 }
            throw r14     // Catch:{ all -> 0x0212 }
        L_0x0212:
            r13 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x0217 }
            goto L_0x021b
        L_0x0217:
            r14 = move-exception
            com.google.android.apps.search.googleapp.homescreen.C136141a.m221234a(r13, r14)
        L_0x021b:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.homescreen.HomeScreenFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            C136193o a = mo17754z();
            C134744f a2 = a.mo112824a();
            if (a2 != null) {
                a2.mo111958l((View.OnTouchListener) null);
            }
            if (a.f370897J) {
                a.f370898K.mo50482c(a.f370907b).mo50505a().mo8054n(a.f370905R);
            }
            c.close();
            return;
        } catch (Throwable th) {
            C136141a.m221234a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f370777e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C136141a.m221234a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C136141a.m221234a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        C134744f a;
        this.f122869b.mo51381i();
        try {
            mo51115p();
            C136193o a2 = mo17754z();
            C0167am activity = a2.f370907b.getActivity();
            if (!(activity == null || !activity.isChangingConfigurations() || (a = a2.mo112824a()) == null)) {
                a.mo111956j(C134720e.CONFIGURATION_CHANGED);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C136141a.m221234a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24721A(bundle);
            C136193o a = mo17754z();
            C69664n.m101061g(bundle, "outState");
            bundle.putBoolean("isActiveTab", a.f370904Q);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C136141a.m221234a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C136193o a = mo17754z();
            C47393f.m84233d(this, C136198a.class, new C136194p(a));
            C47393f.m84233d(this, C136200c.class, new C136195q(a));
            C47393f.m84233d(this, C136199b.class, new C136196r(a));
            C47393f.m84233d(this, C133149a.class, new C136197s());
            C47393f.m84233d(this, C135421al.class, new C136208t(a));
            C47393f.m84233d(this, C135451x.class, new C136209u());
            this.f54442o.mo24720k(bundle);
            C136193o a2 = mo17754z();
            C69664n.m101061g(view, "view");
            if (a2.f370897J) {
                a2.f370898K.mo50482c(a2.f370907b).mo50505a().mo8051k(a2.f370905R);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C136141a.m221234a(th, th);
        }
        throw th;
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        HomeScreenFragment homeScreenFragment = this;
        homeScreenFragment.f122869b.mo51381i();
        try {
            if (!homeScreenFragment.f370777e) {
                super.onAttach(context);
                if (homeScreenFragment.f370774a == null) {
                    Object jN = mo112839d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof HomeScreenFragment) {
                        HomeScreenFragment homeScreenFragment2 = (HomeScreenFragment) fragment;
                        C68225k.m98532d(homeScreenFragment2);
                        Context context2 = (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                        a k = ((C74176nj) jN).mo69918k();
                        C134714d bR = ((C74176nj) jN).mo69522bR();
                        C134724d dVar = (C134724d) ((C74176nj) jN).f206730b.f198179ct.mo17428b();
                        AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                        C28306ab abVar = (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b();
                        C68214a a = C68219e.m98518a(((C74176nj) jN).f206677a.b.f200016bd);
                        C134212aq aqVar = (C134212aq) ((C74176nj) jN).f206677a.d.f201623cc.mo17428b();
                        C46439e eVar = (C46439e) ((C74176nj) jN).f206942f.mo17428b();
                        C137419h cx = ((C74176nj) jN).f206730b.mo66157cx();
                        C136151b bVar = new C136151b(((C74176nj) jN).f206836d.f205391d);
                        C136153d dVar2 = new C136153d(((C74176nj) jN).f206677a.g);
                        Bundle b = ((C74176nj) jN).mo69504b();
                        C137419h hVar = cx;
                        C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C136149c cVar = (C136149c) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C136149c.f370793c, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                        C68225k.m98532d(cVar);
                        C46439e eVar2 = eVar;
                        C136193o oVar = r4;
                        C137419h hVar2 = hVar;
                        C136151b bVar2 = bVar;
                        C136149c cVar2 = cVar;
                        C136193o oVar2 = new C136193o(homeScreenFragment2, context2, k, bR, dVar, accountId, abVar, a, aqVar, eVar2, hVar2, bVar2, dVar2, (C139676e) ((C74176nj) jN).f206836d.f205434p.mo17428b(), (C139701a) ((C74176nj) jN).f206677a.b.f200102dJ.mo17428b(), (C139680b) ((C74176nj) jN).f206836d.f205429k.mo17428b(), ((C74176nj) jN).mo69691eb(), (C135408y) ((C74176nj) jN).f206783c.f205458l.mo17428b(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), cVar2, (C89859i) ((C74176nj) jN).f206677a.c.f201254bi.mo17428b(), C139697a.m227129a(((C74176nj) jN).f206730b.f198027a.mo66885eE()), (C139708c) ((C74176nj) jN).f206730b.f198027a.f199482fp.mo17428b(), ((C74176nj) jN).mo69702em(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 457").mo50907f(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45375289").mo50907f(), (C38553h) ((C74176nj) jN).f206730b.f198027a.f199220as.mo17428b(), ((C74176nj) jN).mo69638db(), (C136969bx) ((C74176nj) jN).f206730b.f198027a.f199441fA.mo17428b(), ((Boolean) ((C74176nj) jN).f206710ag.mo17428b()).booleanValue(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45367282").mo50907f(), Optional.empty(), ((C74176nj) jN).f206730b.f198027a.mo66950fQ().mo60835a(), ((C74176nj) jN).mo69506bB(), ((C74176nj) jN).mo69793gX(), (C46855i) ((C74176nj) jN).f207083j.mo17428b(), C69036bf.m100108a(((C74176nj) jN).f206730b.f198009I), (C46485f) ((C74176nj) jN).f206995g.mo17428b(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45374635").mo50907f());
                        homeScreenFragment = this;
                        homeScreenFragment.f370774a = oVar;
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(homeScreenFragment.f122869b, homeScreenFragment.f370776d));
                    } else {
                        String obj = C136193o.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar2 = homeScreenFragment.f122869b;
                    if (abVar2.f123354b == null) {
                        abVar2.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            th = th;
            Throwable th2 = th;
            C47831fm.m85019n();
            throw th2;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
