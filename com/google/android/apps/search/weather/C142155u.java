package com.google.android.apps.search.weather;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.View;
import android.widget.ProgressBar;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.apps.search.weather.p10681a.p10682a.C142055h;
import com.google.android.apps.search.weather.p10683b.C142059b;
import com.google.android.apps.search.weather.p10692j.C142113e;
import com.google.android.apps.search.weather.suggestions.C142147f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.material.opensearchbar.OpenSearchView;
import com.google.android.libraries.search.p3090o.C39838p;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3132a.C40305b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.contrib.androidx.p3699d.C47627i;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47707g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59326i;
import com.google.p5269w.p5270a.C67962d;
import dagger.hilt.android.internal.managers.C68324h;
import p5488io.p5490b.p5494b.C69803b;

/* renamed from: com.google.android.apps.search.weather.u */
/* compiled from: PG */
public final class C142155u {

    /* renamed from: a */
    public static final C59071e f385631a = C59071e.m91332i("com.google.android.apps.search.weather.u");

    /* renamed from: b */
    public static final C59326i f385632b = C59326i.f157516d;

    /* renamed from: c */
    public final C142118o f385633c;

    /* renamed from: d */
    public final C142055h f385634d;

    /* renamed from: e */
    public final AccountId f385635e;

    /* renamed from: f */
    public final C46439e f385636f;

    /* renamed from: g */
    public final C47770dh f385637g;

    /* renamed from: h */
    public final C21232ab f385638h;

    /* renamed from: i */
    public final C28310af f385639i;

    /* renamed from: j */
    public final C28306ab f385640j;

    /* renamed from: k */
    public final C46778cv f385641k;

    /* renamed from: l */
    public final C47707g f385642l;

    /* renamed from: m */
    public final C39838p f385643m;

    /* renamed from: n */
    public final C28443m f385644n;

    /* renamed from: o */
    public final C46440f f385645o = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) C142155u.f385631a.mo56224b()).mo56382g(th)).mo56372aa(42026)).mo56386p("Unable to get temperature unit data.");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C142118o oVar = C142155u.this.f385633c;
            if (oVar != null) {
                C142155u.this.f385650t = ((ViewPager2) oVar.requireView().findViewById(R.id.weather_tabs_pager)).f13893c;
            }
            C142155u uVar = C142155u.this;
            uVar.mo117037h(uVar.f385650t);
        }

        /* renamed from: i */
        public final /* bridge */ /* synthetic */ void mo18068i(Object obj) {
            Void voidR = (Void) obj;
        }
    };

    /* renamed from: p */
    C67962d f385646p;

    /* renamed from: q */
    public C69803b f385647q;

    /* renamed from: r */
    public C28439i f385648r;

    /* renamed from: s */
    public boolean f385649s = true;

    /* renamed from: t */
    public int f385650t;

    /* renamed from: u */
    private final String f385651u;

    /* renamed from: v */
    private final C47627i f385652v;

    /* renamed from: w */
    private final C46801dp f385653w;

    /* renamed from: x */
    private final C142059b f385654x;

    /* renamed from: y */
    private final C142113e f385655y;

    public C142155u(C142055h hVar, C142118o oVar, AccountId accountId, C142120q qVar, String str, C47627i iVar, C40305b bVar, C46801dp dpVar, C46439e eVar, C142059b bVar2, C47770dh dhVar, C142113e eVar2, C28310af afVar, C28306ab abVar, C46778cv cvVar, C47707g gVar, C39838p pVar, C28443m mVar) {
        C67962d dVar;
        C142120q qVar2 = qVar;
        this.f385633c = oVar;
        this.f385634d = hVar;
        this.f385635e = accountId;
        this.f385651u = str;
        if ((1 & qVar2.f385566a) != 0) {
            dVar = qVar2.f385567b;
            if (dVar == null) {
                dVar = C67962d.f184173g;
            }
        } else {
            dVar = null;
        }
        this.f385646p = dVar;
        this.f385650t = qVar2.f385568c;
        this.f385652v = iVar;
        this.f385653w = dpVar;
        this.f385636f = eVar;
        this.f385654x = bVar2;
        this.f385637g = dhVar;
        this.f385655y = eVar2;
        this.f385638h = bVar.mo32545d();
        this.f385639i = afVar;
        this.f385640j = abVar;
        this.f385641k = cvVar;
        this.f385642l = gVar;
        this.f385643m = pVar;
        this.f385648r = null;
        this.f385644n = mVar;
        bVar.mo32554n().mo42409a();
    }

    /* renamed from: d */
    public static void m230776d(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: e */
    public static void m230777e(View view) {
        if (view != null) {
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.weather_data_progress_bar);
            progressBar.bringToFront();
            progressBar.setVisibility(0);
        }
    }

    /* renamed from: g */
    public static void m230778g(View view) {
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C142147f mo117034a() {
        Fragment c = this.f385633c.getChildFragmentManager().f634a.mo671c("SUGGESTIONS_FRAGMENT");
        if (c == null) {
            return null;
        }
        return (C142147f) c;
    }

    /* renamed from: b */
    public final OpenSearchView mo117035b() {
        View view = this.f385633c.getView();
        view.getClass();
        return (OpenSearchView) view.findViewById(R.id.weather_open_search_view);
    }

    /* renamed from: f */
    public final void mo117036f() {
        if (mo117034a() == null) {
            AccountId accountId = this.f385635e;
            C142147f fVar = new C142147f();
            C68324h.m98669f(fVar);
            C47247a.m84047b(fVar, accountId);
            C0154a aVar = new C0154a(this.f385633c.getChildFragmentManager());
            aVar.mo511h(R.id.weather_suggestions_fragment_container, fVar, "SUGGESTIONS_FRAGMENT", 1);
            aVar.mo509f();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00d5  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo117037h(int r13) {
        /*
            r12 = this;
            com.google.android.apps.search.weather.o r0 = r12.f385633c
            android.view.View r0 = r0.getView()
            m230777e(r0)
            com.google.at.h.e.a.b r0 = com.google.p4017at.p4060h.p4075e.p4076a.C54266b.f142487i
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.at.h.e.a.a r0 = (com.google.p4017at.p4060h.p4075e.p4076a.C54263a) r0
            java.lang.String r1 = r12.f385651u
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.at.h.e.a.b r2 = (com.google.p4017at.p4060h.p4075e.p4076a.C54266b) r2
            r1.getClass()
            int r3 = r2.f142489a
            r3 = r3 | 8
            r2.f142489a = r3
            r2.f142493e = r1
            com.google.android.apps.search.weather.o r1 = r12.f385633c
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            float r1 = r1.fontScale
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.at.h.e.a.b r2 = (com.google.p4017at.p4060h.p4075e.p4076a.C54266b) r2
            int r3 = r2.f142489a
            r3 = r3 | 16
            r2.f142489a = r3
            r2.f142494f = r1
            com.google.android.apps.search.weather.o r1 = r12.f385633c
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            android.os.LocaleList r2 = r1.getLocales()
            int r3 = r2.size()
            if (r3 <= 0) goto L_0x0066
            r1 = 0
            java.util.Locale r1 = r2.get(r1)
            java.lang.String r1 = r1.toLanguageTag()
            goto L_0x006c
        L_0x0066:
            java.util.Locale r1 = r1.locale
            java.lang.String r1 = r1.toLanguageTag()
        L_0x006c:
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.at.h.e.a.b r2 = (com.google.p4017at.p4060h.p4075e.p4076a.C54266b) r2
            r1.getClass()
            int r3 = r2.f142489a
            r3 = r3 | 256(0x100, float:3.59E-43)
            r2.f142489a = r3
            r2.f142496h = r1
            com.google.w.a.d r1 = r12.f385646p
            if (r1 == 0) goto L_0x0091
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.at.h.e.a.b r2 = (com.google.p4017at.p4060h.p4075e.p4076a.C54266b) r2
            r2.f142491c = r1
            int r1 = r2.f142489a
            r1 = r1 | 2
            r2.f142489a = r1
        L_0x0091:
            com.google.android.libraries.elements.interfaces.ab r1 = r12.f385638h
            java.lang.String r2 = "weather_sync_saved_locations_key"
            io.b.l r1 = r1.mo26139b(r2)
            java.lang.Object r1 = r1.mo61655o()
            com.google.common.base.ax r1 = (com.google.common.base.C58833ax) r1
            boolean r2 = r1.mo56113h()
            if (r2 == 0) goto L_0x00cd
            java.lang.Object r1 = r1.mo56107c()     // Catch:{ Exception -> 0x00be }
            byte[] r1 = (byte[]) r1     // Catch:{ Exception -> 0x00be }
            com.google.protobuf.ba r2 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ Exception -> 0x00be }
            com.google.bv.b.a.a.ab.d r3 = com.google.p4283bv.p4287b.p4288a.p4289a.p4292ab.C56628d.f151191c     // Catch:{ Exception -> 0x00be }
            com.google.protobuf.bv r1 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (byte[]) r1, (com.google.protobuf.C62921ba) r2)     // Catch:{ Exception -> 0x00be }
            com.google.bv.b.a.a.ab.d r1 = (com.google.p4283bv.p4287b.p4288a.p4289a.p4292ab.C56628d) r1     // Catch:{ Exception -> 0x00be }
            java.lang.String r1 = r1.f151194b     // Catch:{ Exception -> 0x00be }
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)     // Catch:{ Exception -> 0x00be }
            goto L_0x00cf
        L_0x00be:
            r1 = move-exception
            com.google.common.f.e r2 = f385631a
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r3 = "Failed to parse SyncSavedLocationsResponse from Bytes."
            r4 = 42027(0xa42b, float:5.8892E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r1)).mo56372aa(r4)).mo56386p(r3)
        L_0x00cd:
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
        L_0x00cf:
            boolean r2 = r1.mo56113h()
            if (r2 == 0) goto L_0x00ed
            java.lang.Object r1 = r1.mo56107c()
            java.lang.String r1 = (java.lang.String) r1
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.at.h.e.a.b r2 = (com.google.p4017at.p4060h.p4075e.p4076a.C54266b) r2
            r1.getClass()
            int r3 = r2.f142489a
            r3 = r3 | 64
            r2.f142489a = r3
            r2.f142495g = r1
        L_0x00ed:
            com.google.apps.tiktok.dataservice.dp r1 = r12.f385653w
            com.google.android.apps.search.weather.b.b r2 = r12.f385654x
            com.google.protobuf.bv r0 = r0.build()
            com.google.at.h.e.a.b r0 = (com.google.p4017at.p4060h.p4075e.p4076a.C54266b) r0
            com.google.apps.tiktok.dataservice.ag r0 = r2.mo116995a(r0)
            com.google.android.apps.search.weather.m r11 = new com.google.android.apps.search.weather.m
            com.google.android.apps.search.weather.o r3 = r12.f385633c
            com.google.apps.tiktok.account.AccountId r4 = r12.f385635e
            com.google.apps.tiktok.tracing.contrib.androidx.d.i r6 = r12.f385652v
            com.google.android.apps.search.weather.j.e r7 = r12.f385655y
            com.google.android.libraries.logging.ve.i r8 = r12.f385648r
            r8.getClass()
            com.google.android.libraries.logging.ve.m r9 = r12.f385644n
            com.google.android.apps.search.weather.a.a.h r10 = r12.f385634d
            r2 = r11
            r5 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.mo50709c(r0, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.weather.C142155u.mo117037h(int):void");
    }

    /* renamed from: c */
    public static void m230775c(OpenSearchView openSearchView) {
        int i = openSearchView.f77616r;
        if (i == 0) {
            throw null;
        } else if (i == 4 || i == 3) {
            openSearchView.mo34103e();
        }
    }
}
