package com.google.android.apps.search.podcasts;

import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.app.C0395p;
import android.view.View;
import androidx.navigation.C3807af;
import com.google.android.apps.search.podcasts.p10550b.p10553c.C140050b;
import com.google.android.apps.search.podcasts.p10550b.p10557g.C140133ai;
import com.google.android.apps.search.podcasts.p10565f.C140285af;
import com.google.android.apps.search.podcasts.p10565f.C140288ai;
import com.google.android.apps.search.podcasts.p10565f.C140289aj;
import com.google.android.apps.search.podcasts.p10571i.C140415j;
import com.google.android.apps.search.podcasts.p10573k.p10575b.C140436c;
import com.google.android.apps.search.podcasts.p10576l.C140449ak;
import com.google.android.apps.search.podcasts.p10576l.C140450al;
import com.google.android.apps.search.podcasts.p10576l.C140459au;
import com.google.android.apps.search.podcasts.p10601r.p10608f.C140980a;
import com.google.android.apps.search.podcasts.widgets.p10624f.C141243d;
import com.google.android.apps.search.podcasts.widgets.p10624f.C141244e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60430py;
import com.google.common.p4552o.C60431pz;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.w */
/* compiled from: PG */
public final class C141182w {

    /* renamed from: a */
    public static final C59071e f383287a = C59071e.m91332i("com.google.android.apps.search.podcasts.w");

    /* renamed from: b */
    public final C140639m f383288b;

    /* renamed from: c */
    public final C47770dh f383289c;

    /* renamed from: d */
    public final C46855i f383290d;

    /* renamed from: e */
    public final C140415j f383291e;

    /* renamed from: f */
    public final C141181v f383292f;

    /* renamed from: g */
    public final C140285af f383293g;

    /* renamed from: h */
    public final C140420k f383294h;

    /* renamed from: i */
    public final C141244e f383295i;

    /* renamed from: j */
    public final C46439e f383296j;

    /* renamed from: k */
    public final C140133ai f383297k;

    /* renamed from: l */
    public final C140459au f383298l;

    /* renamed from: m */
    public final C141184b f383299m;

    /* renamed from: n */
    public final C141183a f383300n;

    /* renamed from: o */
    public final C28306ab f383301o;

    /* renamed from: p */
    public final AccountId f383302p;

    /* renamed from: q */
    public final C140050b f383303q;

    /* renamed from: r */
    public final C140436c f383304r;

    /* renamed from: s */
    public Runnable f383305s;

    /* renamed from: t */
    public C141243d f383306t;

    /* renamed from: u */
    public C58833ax f383307u = C58836b.f156633a;

    /* renamed from: com.google.android.apps.search.podcasts.w$a */
    /* compiled from: PG */
    final class C141183a implements C46440f {
        public C141183a() {
        }

        /* renamed from: d */
        private final void m229200d(int i) {
            if (C141182w.this.f383288b.getActivity() instanceof C0395p) {
                ((C0395p) C141182w.this.f383288b.getActivity()).mo1322k().mo1191s(i);
            }
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) C141182w.f383287a.mo56226d()).mo56382g(th)).mo56372aa(41498)).mo56386p("Failed to retrieve Preferences.");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            C140449ak akVar = C140449ak.DEFAULT;
            C140449ak a = C140449ak.m228147a(((C140450al) ((ProtoParsers.ParcelableProto) obj2).mo58938a(C140450al.f381513p, C62921ba.m95368a())).f381518d);
            if (a == null) {
                a = C140449ak.UNRECOGNIZED;
            }
            int ordinal = a.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    m229200d(1);
                    return;
                } else if (ordinal == 2) {
                    m229200d(2);
                    return;
                } else if (!(ordinal == 3 || ordinal == 4)) {
                    return;
                }
            }
            m229200d(-1);
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    /* renamed from: com.google.android.apps.search.podcasts.w$b */
    /* compiled from: PG */
    final class C141184b implements C46440f {
        public C141184b() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) C141182w.f383287a.mo56226d()).mo56382g(th)).mo56372aa(41499)).mo56386p("Failed to retrieve the number of subs.");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Integer num = (Integer) obj2;
            C141182w.this.f383307u = C58833ax.m90834k(num);
            C141182w.this.mo116213d();
            if (num.intValue() == 0 && C141182w.this.f383288b.getActivity() != null && !C141182w.this.f383288b.getActivity().getIntent().hasExtra("android-support-nav:controller:deepLinkIntent")) {
                C141182w.this.mo116212c(new C140289aj(C140288ai.EXPLORE, (Integer) null));
            }
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public C141182w(C140639m mVar, C47770dh dhVar, AccountId accountId, C46855i iVar, C140415j jVar, C140285af afVar, C140420k kVar, C141244e eVar, C46439e eVar2, C140133ai aiVar, C28306ab abVar, C140459au auVar, C140050b bVar, C140436c cVar) {
        this.f383288b = mVar;
        this.f383289c = dhVar;
        this.f383290d = iVar;
        this.f383291e = jVar;
        this.f383293g = afVar;
        this.f383294h = kVar;
        this.f383295i = eVar;
        this.f383296j = eVar2;
        this.f383297k = aiVar;
        this.f383298l = auVar;
        this.f383301o = abVar;
        this.f383302p = accountId;
        this.f383303q = bVar;
        this.f383304r = cVar;
        this.f383299m = new C141184b();
        this.f383300n = new C141183a();
        this.f383292f = new C141181v(this);
    }

    /* renamed from: a */
    public static int m229194a(Fragment fragment) {
        return fragment.getResources().getDimensionPixelOffset(R.dimen.gm3_bottom_nav_min_height);
    }

    /* renamed from: b */
    public static BottomSheetBehavior m229195b(Fragment fragment) {
        return BottomSheetBehavior.m78767C(fragment.requireView().findViewById(R.id.podcasts_players_panel_container));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0075, code lost:
        if (r13 == false) goto L_0x0077;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m229196f(com.google.android.apps.search.podcasts.C140639m r10, com.google.apps.tiktok.account.AccountId r11, boolean r12, boolean r13, boolean r14) {
        /*
            java.lang.String r0 = "MainFragment playback update"
            com.google.apps.tiktok.tracing.bi r0 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r0)
            if (r13 == 0) goto L_0x000c
            r1 = 2131434661(0x7f0b1ca5, float:1.8491142E38)
            goto L_0x000f
        L_0x000c:
            r1 = 2131434705(0x7f0b1cd1, float:1.8491231E38)
        L_0x000f:
            r2 = 1
            r3 = 0
            android.view.View r4 = r10.requireView()     // Catch:{ all -> 0x00a0 }
            android.support.v4.app.FragmentManager r5 = r10.getChildFragmentManager()     // Catch:{ all -> 0x00a0 }
            android.support.v4.app.cc r5 = r5.f634a     // Catch:{ all -> 0x00a0 }
            android.support.v4.app.Fragment r5 = r5.mo670b(r1)     // Catch:{ all -> 0x00a0 }
            r6 = 2131434773(0x7f0b1d15, float:1.849137E38)
            android.view.View r6 = r4.findViewById(r6)     // Catch:{ all -> 0x00a0 }
            android.content.res.Resources r7 = r10.getResources()     // Catch:{ all -> 0x00a0 }
            int r8 = m229194a(r10)     // Catch:{ all -> 0x00a0 }
            r9 = 2131434646(0x7f0b1c96, float:1.8491112E38)
            android.view.View r9 = r4.findViewById(r9)     // Catch:{ all -> 0x00a0 }
            int r9 = r9.getPaddingBottom()     // Catch:{ all -> 0x00a0 }
            int r8 = r8 + r9
            if (r12 == 0) goto L_0x0088
            if (r5 != 0) goto L_0x007f
            android.support.v4.app.FragmentManager r10 = r10.getChildFragmentManager()     // Catch:{ all -> 0x00a0 }
            android.support.v4.app.a r12 = new android.support.v4.app.a     // Catch:{ all -> 0x00a0 }
            r12.<init>((android.support.p031v4.app.FragmentManager) r10)     // Catch:{ all -> 0x00a0 }
            java.lang.String r10 = "accountId"
            if (r13 == 0) goto L_0x005a
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r10)     // Catch:{ all -> 0x00a0 }
            com.google.android.apps.search.podcasts.playerpanel.d r10 = new com.google.android.apps.search.podcasts.playerpanel.d     // Catch:{ all -> 0x00a0 }
            r10.<init>()     // Catch:{ all -> 0x00a0 }
            dagger.hilt.android.internal.managers.C68324h.m98669f(r10)     // Catch:{ all -> 0x00a0 }
            com.google.apps.tiktok.inject.p3660e.p3661a.C47247a.m84047b(r10, r11)     // Catch:{ all -> 0x00a0 }
            goto L_0x0068
        L_0x005a:
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r10)     // Catch:{ all -> 0x00a0 }
            com.google.android.apps.search.podcasts.playerpanel.o r10 = new com.google.android.apps.search.podcasts.playerpanel.o     // Catch:{ all -> 0x00a0 }
            r10.<init>()     // Catch:{ all -> 0x00a0 }
            dagger.hilt.android.internal.managers.C68324h.m98669f(r10)     // Catch:{ all -> 0x00a0 }
            com.google.apps.tiktok.inject.p3660e.p3661a.C47247a.m84047b(r10, r11)     // Catch:{ all -> 0x00a0 }
        L_0x0068:
            r11 = 0
            r12.mo511h(r1, r10, r11, r2)     // Catch:{ all -> 0x00a0 }
            r12.mo509f()     // Catch:{ all -> 0x00a0 }
            r10 = 4
            if (r14 == 0) goto L_0x0075
            if (r13 == 0) goto L_0x0078
            goto L_0x0077
        L_0x0075:
            if (r13 != 0) goto L_0x0078
        L_0x0077:
            r10 = 0
        L_0x0078:
            android.view.View r11 = r4.findViewById(r1)     // Catch:{ all -> 0x00a0 }
            r11.setVisibility(r10)     // Catch:{ all -> 0x00a0 }
        L_0x007f:
            r10 = 2131171335(0x7f071807, float:1.7957054E38)
            int r10 = r7.getDimensionPixelOffset(r10)     // Catch:{ all -> 0x00a0 }
            int r8 = r8 + r10
            goto L_0x0099
        L_0x0088:
            if (r5 == 0) goto L_0x0099
            android.support.v4.app.FragmentManager r10 = r10.getChildFragmentManager()     // Catch:{ all -> 0x00a0 }
            android.support.v4.app.a r11 = new android.support.v4.app.a     // Catch:{ all -> 0x00a0 }
            r11.<init>((android.support.p031v4.app.FragmentManager) r10)     // Catch:{ all -> 0x00a0 }
            r11.mo516m(r5)     // Catch:{ all -> 0x00a0 }
            r11.mo509f()     // Catch:{ all -> 0x00a0 }
        L_0x0099:
            r6.setPadding(r3, r3, r3, r8)     // Catch:{ all -> 0x00a0 }
            r0.close()
            return
        L_0x00a0:
            r10 = move-exception
            r0.close()     // Catch:{ all -> 0x00a5 }
            goto L_0x00bb
        L_0x00a5:
            r11 = move-exception
            java.lang.Class[] r12 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x00bb }
            java.lang.Class<java.lang.Throwable> r13 = java.lang.Throwable.class
            r12[r3] = r13     // Catch:{ Exception -> 0x00bb }
            java.lang.Class<java.lang.Throwable> r13 = java.lang.Throwable.class
            java.lang.String r14 = "addSuppressed"
            java.lang.reflect.Method r12 = r13.getDeclaredMethod(r14, r12)     // Catch:{ Exception -> 0x00bb }
            java.lang.Object[] r13 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00bb }
            r13[r3] = r11     // Catch:{ Exception -> 0x00bb }
            r12.invoke(r10, r13)     // Catch:{ Exception -> 0x00bb }
        L_0x00bb:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.C141182w.m229196f(com.google.android.apps.search.podcasts.m, com.google.apps.tiktok.account.AccountId, boolean, boolean, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C47392e mo116212c(C140289aj ajVar) {
        C141243d dVar = this.f383306t;
        if (dVar != null) {
            C69664n.m101061g(ajVar, "navigateUnderTabEvent");
            if (ajVar.f381139a != C140288ai.CURRENT) {
                BottomNavigationView bottomNavigationView = dVar.f383455c;
                if (bottomNavigationView.f116865b.f116936e != bottomNavigationView.f116864a.getItem(ajVar.f381139a.f381138e).getItemId()) {
                    BottomNavigationView bottomNavigationView2 = dVar.f383455c;
                    bottomNavigationView2.mo48182d(bottomNavigationView2.f116864a.getItem(ajVar.f381139a.f381138e).getItemId());
                }
            }
            Integer num = ajVar.f381140b;
            if (num != null) {
                int intValue = num.intValue();
                C3807af afVar = (C3807af) dVar.f383458f.get();
                if (afVar != null) {
                    dVar.f383453a.mo50484e(afVar).mo50508d(intValue, (Bundle) null);
                }
            }
        }
        return C47392e.f123115a;
    }

    /* renamed from: d */
    public final void mo116213d() {
        if (this.f383288b.getView() != null && this.f383307u.mo56113h()) {
            C28306ab abVar = this.f383301o;
            View findViewById = this.f383288b.requireView().findViewById(R.id.podcasts_home_tab);
            C28313c a = this.f383301o.f76990a.mo33805a(C28427h.m53115a(967121));
            int intValue = ((Integer) this.f383307u.mo56107c()).intValue();
            C60430py pyVar = (C60430py) C60431pz.f163541h.createBuilder();
            pyVar.copyOnWrite();
            C60431pz pzVar = (C60431pz) pyVar.instance;
            pzVar.f163543a |= 1;
            pzVar.f163544b = intValue;
            a.mo33858f(new C28353e(C140980a.f382762a, pyVar.build()));
            abVar.mo33801b(findViewById, a);
            this.f383301o.mo33801b(this.f383288b.requireView().findViewById(R.id.podcasts_explore_tab), this.f383301o.f76990a.mo33805a(C28427h.m53115a(967122)));
            this.f383301o.mo33801b(this.f383288b.requireView().findViewById(R.id.podcasts_library_tab), this.f383301o.f76990a.mo33805a(C28427h.m53115a(967120)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo116214e(View view, float f) {
        View findViewById = this.f383288b.requireView().findViewById(R.id.podcasts_mask);
        findViewById.setVisibility(f == 0.0f ? 8 : 0);
        findViewById.setAlpha(f);
        C140647n nVar = new C140647n(this, view, f);
        if (view.isLaidOut()) {
            nVar.run();
        } else {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new C140998s(view, nVar));
        }
        View findViewById2 = this.f383288b.requireView().findViewById(R.id.podcasts_expanded_player_panel_container);
        View findViewById3 = this.f383288b.requireView().findViewById(R.id.podcasts_collapsed_player_panel_container);
        double d = (double) f;
        if (d < 0.1d) {
            findViewById2.setVisibility(4);
            findViewById3.setVisibility(0);
            findViewById3.setAlpha(1.0f - (f / 0.1f));
        } else if (d < 0.8d) {
            findViewById3.setVisibility(4);
            findViewById2.setVisibility(0);
            findViewById2.setAlpha((f - 44.8f) / 0.7f);
        } else {
            findViewById3.setVisibility(4);
            findViewById2.setVisibility(0);
            findViewById2.setAlpha(1.0f);
        }
    }
}
