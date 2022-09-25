package com.google.android.apps.search.weather;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import androidx.viewpager2.widget.ViewPager2;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.gsa.binaries.satin.app.aqe;
import com.google.android.apps.search.weather.p10681a.p10682a.C142055h;
import com.google.android.apps.search.weather.p10683b.C142066i;
import com.google.android.apps.search.weather.p10687f.C142090c;
import com.google.android.apps.search.weather.p10688g.C142092a;
import com.google.android.apps.search.weather.p10689h.p10690a.C142095a;
import com.google.android.apps.search.weather.p10691i.C142104a;
import com.google.android.apps.search.weather.p10692j.p10693a.C142107a;
import com.google.android.apps.search.weather.suggestions.p10695b.C142133a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.p2199f.C28421h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p3090o.C39838p;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3132a.C40305b;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.dataservice.p3635a.p3636a.C46682c;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.p3644h.C47108ac;
import com.google.apps.tiktok.p3644h.C47141r;
import com.google.apps.tiktok.p3644h.C47148y;
import com.google.apps.tiktok.p3648i.p3650b.C47162f;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.base.C58911u;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4541l.C59326i;
import com.google.common.util.concurrent.C60888db;
import com.google.frameworks.client.data.android.C61512j;
import com.google.frameworks.client.data.android.p4638e.C61410e;
import com.google.p4017at.p4060h.p4075e.p4076a.C54273i;
import com.google.p4017at.p4060h.p4075e.p4076a.C54274j;
import com.google.p5269w.p5270a.C67962d;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p5488io.grpc.C70851i;
import p5488io.grpc.p5533i.C70864c;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69828d;

/* renamed from: com.google.android.apps.search.weather.o */
/* compiled from: PG */
public final class C142118o extends C142069c implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C142155u f385560a;

    /* renamed from: c */
    private Context f385561c;

    /* renamed from: d */
    private final C2393x f385562d = new C2393x(this);

    /* renamed from: e */
    private boolean f385563e;

    @Deprecated
    public C142118o() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo116997b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f385561c == null) {
            this.f385561c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f385561c;
    }

    /* renamed from: f */
    public final C142155u mo17754z() {
        C142155u uVar = this.f385560a;
        if (uVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f385563e) {
            return uVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
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
        return this.f385562d;
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
            C142117n.m230726a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005e A[Catch:{ all -> 0x0079, all -> 0x007e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            com.google.apps.tiktok.tracing.ab r0 = r5.f122869b
            r0.mo51381i()
            r5.mo51111l(r6)     // Catch:{ all -> 0x0079 }
            com.google.android.apps.search.weather.u r6 = r5.mo17754z()     // Catch:{ all -> 0x0079 }
            com.google.apps.tiktok.concurrent.futuresmixin.e r0 = r6.f385636f     // Catch:{ all -> 0x0079 }
            com.google.apps.tiktok.concurrent.futuresmixin.f r1 = r6.f385645o     // Catch:{ all -> 0x0079 }
            r0.mo50429i(r1)     // Catch:{ all -> 0x0079 }
            com.google.android.apps.search.weather.o r0 = r6.f385633c     // Catch:{ all -> 0x0079 }
            android.support.v4.app.am r0 = r0.getActivity()     // Catch:{ all -> 0x0079 }
            com.google.android.apps.search.weather.o r6 = r6.f385633c     // Catch:{ all -> 0x0079 }
            android.support.v4.app.am r6 = r6.getActivity()     // Catch:{ all -> 0x0079 }
            android.content.Intent r6 = r6.getIntent()     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = "source"
            java.lang.String r1 = r6.getStringExtra(r1)     // Catch:{ all -> 0x0079 }
            java.lang.String r2 = "weather_widget_id_source_key"
            if (r1 == 0) goto L_0x0043
            java.lang.String r3 = "and.gsa.weather.launcher.icon"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0079 }
            if (r1 == 0) goto L_0x0043
            r1 = 0
            int r6 = r6.getIntExtra(r2, r1)     // Catch:{ all -> 0x0079 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0079 }
            j$.util.Optional r6 = p3186j$.util.Optional.m71637of(r6)     // Catch:{ all -> 0x0079 }
            goto L_0x0047
        L_0x0043:
            j$.util.Optional r6 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x0079 }
        L_0x0047:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0079 }
            r1.<init>()     // Catch:{ all -> 0x0079 }
            java.lang.String r3 = "com.google.android.googlequicksearchbox"
            java.lang.String r4 = "com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.WeatherWidget_Receiver"
            r1.setClassName(r3, r4)     // Catch:{ all -> 0x0079 }
            java.lang.String r3 = "android.appwidget.action.UPDATE_ALL_WEATHER_WIDGETS"
            r1.setAction(r3)     // Catch:{ all -> 0x0079 }
            boolean r3 = r6.isPresent()     // Catch:{ all -> 0x0079 }
            if (r3 == 0) goto L_0x006b
            java.lang.Object r6 = r6.get()     // Catch:{ all -> 0x0079 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0079 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x0079 }
            r1.putExtra(r2, r6)     // Catch:{ all -> 0x0079 }
        L_0x006b:
            java.lang.String r6 = "update_source"
            java.lang.String r2 = "tap_weather_app"
            r1.putExtra(r6, r2)     // Catch:{ all -> 0x0079 }
            r0.sendBroadcast(r1)     // Catch:{ all -> 0x0079 }
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return
        L_0x0079:
            r6 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x007e }
            goto L_0x0082
        L_0x007e:
            r0 = move-exception
            com.google.android.apps.search.weather.C142117n.m230726a(r6, r0)
        L_0x0082:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.weather.C142118o.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x027b A[Catch:{ ct | IllegalArgumentException -> 0x02a0, all -> 0x02e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x02df A[SYNTHETIC, Splitter:B:34:0x02df] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r17, android.view.ViewGroup r18, android.os.Bundle r19) {
        /*
            r16 = this;
            r1 = r16
            r0 = r19
            com.google.apps.tiktok.tracing.ab r2 = r1.f122869b
            r2.mo51381i()
            r16.mo51119t(r17, r18, r19)     // Catch:{ all -> 0x02e7 }
            com.google.android.apps.search.weather.u r2 = r16.mo17754z()     // Catch:{ all -> 0x02e7 }
            r3 = 2131627239(0x7f0e0ce7, float:1.8881737E38)
            r4 = 0
            r5 = r17
            r6 = r18
            android.view.View r3 = r5.inflate(r3, r6, r4)     // Catch:{ all -> 0x02e7 }
            android.view.View r5 = r3.getRootView()     // Catch:{ all -> 0x02e7 }
            r6 = 2131437068(0x7f0b260c, float:1.8496024E38)
            android.view.View r5 = r5.findViewById(r6)     // Catch:{ all -> 0x02e7 }
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r5 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r5     // Catch:{ all -> 0x02e7 }
            android.view.View r6 = r3.getRootView()     // Catch:{ all -> 0x02e7 }
            r7 = 2131437062(0x7f0b2606, float:1.8496012E38)
            android.view.View r6 = r6.findViewById(r7)     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.material.opensearchbar.OpenSearchView r6 = (com.google.android.libraries.material.opensearchbar.OpenSearchView) r6     // Catch:{ all -> 0x02e7 }
            r7 = 2131437061(0x7f0b2605, float:1.849601E38)
            android.view.View r7 = r3.findViewById(r7)     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.material.opensearchbar.OpenSearchBar r7 = (com.google.android.libraries.material.opensearchbar.OpenSearchBar) r7     // Catch:{ all -> 0x02e7 }
            android.widget.TextView r8 = r7.f77584B     // Catch:{ all -> 0x02e7 }
            r9 = 2132093644(0x7f152acc, float:1.9827719E38)
            r8.setText(r9)     // Catch:{ all -> 0x02e7 }
            r8 = 2131755059(0x7f100033, float:1.9140987E38)
            r7.mo2404n(r8)     // Catch:{ all -> 0x02e7 }
            android.view.View r8 = r3.getRootView()     // Catch:{ all -> 0x02e7 }
            r9 = 2131437070(0x7f0b260e, float:1.8496028E38)
            android.view.View r8 = r8.findViewById(r9)     // Catch:{ all -> 0x02e7 }
            androidx.viewpager2.widget.ViewPager2 r8 = (androidx.viewpager2.widget.ViewPager2) r8     // Catch:{ all -> 0x02e7 }
            android.view.View r4 = r8.getChildAt(r4)     // Catch:{ all -> 0x02e7 }
            android.support.v7.widget.RecyclerView r4 = (android.support.p033v7.widget.RecyclerView) r4     // Catch:{ all -> 0x02e7 }
            r9 = 2
            r4.setOverScrollMode(r9)     // Catch:{ all -> 0x02e7 }
            r2.mo117036f()     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.logging.ve.ab r4 = r2.f385640j     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.logging.ve.af r9 = r2.f385639i     // Catch:{ all -> 0x02e7 }
            r10 = 121826(0x1dbe2, float:1.70715E-40)
            com.google.android.libraries.logging.ve.h r10 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r10)     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.logging.ve.c r9 = r9.mo33805a(r10)     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.logging.ve.i r4 = r4.mo33801b(r3, r9)     // Catch:{ all -> 0x02e7 }
            r2.f385648r = r4     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.logging.ve.ab r4 = r2.f385640j     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.logging.ve.af r9 = r2.f385639i     // Catch:{ all -> 0x02e7 }
            r10 = 121825(0x1dbe1, float:1.70713E-40)
            com.google.android.libraries.logging.ve.h r10 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r10)     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.logging.ve.c r9 = r9.mo33805a(r10)     // Catch:{ all -> 0x02e7 }
            r4.mo33801b(r6, r9)     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.logging.ve.ab r4 = r2.f385640j     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.logging.ve.af r9 = r2.f385639i     // Catch:{ all -> 0x02e7 }
            r10 = 129848(0x1fb38, float:1.81956E-40)
            com.google.android.libraries.logging.ve.h r10 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r10)     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.logging.ve.c r9 = r9.mo33805a(r10)     // Catch:{ all -> 0x02e7 }
            r4.mo33801b(r5, r9)     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.logging.ve.ab r4 = r2.f385640j     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.logging.ve.af r9 = r2.f385639i     // Catch:{ all -> 0x02e7 }
            r10 = 129885(0x1fb5d, float:1.82008E-40)
            com.google.android.libraries.logging.ve.h r10 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r10)     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.logging.ve.c r9 = r9.mo33805a(r10)     // Catch:{ all -> 0x02e7 }
            r4.mo33801b(r8, r9)     // Catch:{ all -> 0x02e7 }
            com.google.android.apps.search.weather.r r4 = new com.google.android.apps.search.weather.r     // Catch:{ all -> 0x02e7 }
            r4.<init>(r2, r6)     // Catch:{ all -> 0x02e7 }
            r6.mo34100b(r4)     // Catch:{ all -> 0x02e7 }
            com.google.android.apps.search.weather.o r4 = r2.f385633c     // Catch:{ all -> 0x02e7 }
            android.support.v4.app.am r4 = r4.getActivity()     // Catch:{ all -> 0x02e7 }
            android.view.Window r4 = r4.getWindow()     // Catch:{ all -> 0x02e7 }
            r8 = 48
            r4.setSoftInputMode(r8)     // Catch:{ all -> 0x02e7 }
            r6.mo34106h(r4)     // Catch:{ all -> 0x02e7 }
            r6.mo34108j(r7)     // Catch:{ all -> 0x02e7 }
            android.widget.EditText r4 = r6.f77608j     // Catch:{ all -> 0x02e7 }
            com.google.apps.tiktok.tracing.dh r6 = r2.f385637g     // Catch:{ all -> 0x02e7 }
            com.google.android.apps.search.weather.v r8 = new com.google.android.apps.search.weather.v     // Catch:{ all -> 0x02e7 }
            r8.<init>(r2, r3)     // Catch:{ all -> 0x02e7 }
            com.google.apps.tiktok.tracing.db r9 = new com.google.apps.tiktok.tracing.db     // Catch:{ all -> 0x02e7 }
            java.lang.String r10 = "OpenSearchView text watcher"
            r9.<init>(r6, r8, r10)     // Catch:{ all -> 0x02e7 }
            r4.addTextChangedListener(r9)     // Catch:{ all -> 0x02e7 }
            com.google.android.apps.search.weather.a.a.h r4 = r2.f385634d     // Catch:{ all -> 0x02e7 }
            com.google.android.apps.search.weather.o r6 = r2.f385633c     // Catch:{ all -> 0x02e7 }
            com.google.apps.tiktok.account.AccountId r8 = r2.f385635e     // Catch:{ all -> 0x02e7 }
            android.view.Menu r7 = r7.mo2393g()     // Catch:{ all -> 0x02e7 }
            r9 = 2131437051(0x7f0b25fb, float:1.849599E38)
            android.view.MenuItem r7 = r7.findItem(r9)     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.onegoogle.accountmenu.accountlayer.o r9 = new com.google.android.libraries.onegoogle.accountmenu.accountlayer.o     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.onegoogle.account.a.c r10 = r4.f385423g     // Catch:{ all -> 0x02e7 }
            r9.<init>(r10)     // Catch:{ all -> 0x02e7 }
            android.content.Context r10 = r4.f385418b     // Catch:{ all -> 0x02e7 }
            java.lang.Class<com.google.apps.tiktok.account.data.a> r11 = com.google.apps.tiktok.account.data.C46108a.class
            com.google.android.libraries.onegoogle.accountmenu.accountlayer.m r10 = com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n.m56405f(r10, r11)     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.onegoogle.account.a.c r11 = r4.f385423g     // Catch:{ all -> 0x02e7 }
            r12 = r10
            com.google.android.libraries.onegoogle.accountmenu.accountlayer.r r12 = (com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30309r) r12     // Catch:{ all -> 0x02e7 }
            r12.f81942d = r11     // Catch:{ all -> 0x02e7 }
            r11 = r10
            com.google.android.libraries.onegoogle.accountmenu.accountlayer.r r11 = (com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30309r) r11     // Catch:{ all -> 0x02e7 }
            r11.f81941c = r9     // Catch:{ all -> 0x02e7 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x02e7 }
            r11.<init>()     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.onegoogle.accountmenu.features.m r12 = com.google.android.libraries.onegoogle.accountmenu.features.C30631n.m57247k()     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.onegoogle.accountmenu.d.s r13 = new com.google.android.libraries.onegoogle.accountmenu.d.s     // Catch:{ all -> 0x02e7 }
            r13.<init>(r9)     // Catch:{ all -> 0x02e7 }
            r14 = r12
            com.google.android.libraries.onegoogle.accountmenu.features.g r14 = (com.google.android.libraries.onegoogle.accountmenu.features.C30606g) r14     // Catch:{ all -> 0x02e7 }
            r14.f82678c = r13     // Catch:{ all -> 0x02e7 }
            android.content.Context r13 = r4.f385418b     // Catch:{ all -> 0x02e7 }
            r14 = 2131234478(0x7f080eae, float:1.8085123E38)
            android.graphics.drawable.Drawable r13 = androidx.core.content.C1877c.m5125a(r13, r14)     // Catch:{ all -> 0x02e7 }
            r13.getClass()
            r14 = r12
            com.google.android.libraries.onegoogle.accountmenu.features.g r14 = (com.google.android.libraries.onegoogle.accountmenu.features.C30606g) r14     // Catch:{ all -> 0x02e7 }
            r14.f82676a = r13     // Catch:{ all -> 0x02e7 }
            com.google.apps.tiktok.tracing.dh r13 = r4.f385428l     // Catch:{ all -> 0x02e7 }
            com.google.android.apps.search.weather.a.a.b r14 = new com.google.android.apps.search.weather.a.a.b     // Catch:{ all -> 0x02e7 }
            r14.<init>(r4, r9, r6)     // Catch:{ all -> 0x02e7 }
            com.google.apps.tiktok.tracing.co r15 = new com.google.apps.tiktok.tracing.co     // Catch:{ all -> 0x02e7 }
            java.lang.String r1 = "Temperature unit option clicked"
            r15.<init>(r13, r1, r14)     // Catch:{ all -> 0x02e7 }
            r1 = r12
            com.google.android.libraries.onegoogle.accountmenu.features.g r1 = (com.google.android.libraries.onegoogle.accountmenu.features.C30606g) r1     // Catch:{ all -> 0x02e7 }
            r1.f82677b = r15     // Catch:{ all -> 0x02e7 }
            android.content.Context r1 = r4.f385418b     // Catch:{ all -> 0x02e7 }
            r13 = 2132093657(0x7f152ad9, float:1.9827745E38)
            java.lang.String r1 = r1.getString(r13)     // Catch:{ all -> 0x02e7 }
            r12.mo36303d(r1)     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.onegoogle.accountmenu.features.n r1 = r12.mo36300a()     // Catch:{ all -> 0x02e7 }
            r4.f385429m = r1     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.onegoogle.accountmenu.features.n r1 = r4.f385429m     // Catch:{ all -> 0x02e7 }
            boolean r12 = r4.f385430n     // Catch:{ all -> 0x02e7 }
            r4.mo116993a(r1, r12)     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.onegoogle.accountmenu.features.n r1 = r4.f385429m     // Catch:{ all -> 0x02e7 }
            r1.getClass()
            r11.add(r1)     // Catch:{ all -> 0x02e7 }
            com.google.android.apps.search.weather.g.a r1 = r4.f385424h     // Catch:{ all -> 0x02e7 }
            android.content.Context r1 = r1.f385502b     // Catch:{ all -> 0x02e7 }
            java.lang.Class<android.content.pm.ShortcutManager> r12 = android.content.pm.ShortcutManager.class
            java.lang.Object r1 = r1.getSystemService(r12)     // Catch:{ all -> 0x02e7 }
            android.content.pm.ShortcutManager r1 = (android.content.pm.ShortcutManager) r1     // Catch:{ all -> 0x02e7 }
            if (r1 == 0) goto L_0x01b2
            boolean r1 = r1.isRequestPinShortcutSupported()     // Catch:{ all -> 0x02e7 }
            if (r1 != 0) goto L_0x017b
            goto L_0x01b2
        L_0x017b:
            com.google.android.libraries.onegoogle.accountmenu.features.m r1 = com.google.android.libraries.onegoogle.accountmenu.features.C30631n.m57247k()     // Catch:{ all -> 0x02e7 }
            android.content.Context r12 = r4.f385418b     // Catch:{ all -> 0x02e7 }
            android.content.res.Resources r12 = r12.getResources()     // Catch:{ all -> 0x02e7 }
            r13 = 2132093641(0x7f152ac9, float:1.9827712E38)
            java.lang.String r12 = r12.getString(r13)     // Catch:{ all -> 0x02e7 }
            r1.mo36303d(r12)     // Catch:{ all -> 0x02e7 }
            android.content.Context r12 = r4.f385418b     // Catch:{ all -> 0x02e7 }
            r13 = 2131234535(0x7f080ee7, float:1.8085238E38)
            android.graphics.drawable.Drawable r12 = androidx.core.content.C1877c.m5125a(r12, r13)     // Catch:{ all -> 0x02e7 }
            r12.getClass()
            r13 = r1
            com.google.android.libraries.onegoogle.accountmenu.features.g r13 = (com.google.android.libraries.onegoogle.accountmenu.features.C30606g) r13     // Catch:{ all -> 0x02e7 }
            r13.f82676a = r12     // Catch:{ all -> 0x02e7 }
            com.google.android.apps.search.weather.a.a.a r12 = new com.google.android.apps.search.weather.a.a.a     // Catch:{ all -> 0x02e7 }
            r12.<init>(r4, r6)     // Catch:{ all -> 0x02e7 }
            r13 = r1
            com.google.android.libraries.onegoogle.accountmenu.features.g r13 = (com.google.android.libraries.onegoogle.accountmenu.features.C30606g) r13     // Catch:{ all -> 0x02e7 }
            r13.f82677b = r12     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.onegoogle.accountmenu.features.n r1 = r1.mo36300a()     // Catch:{ all -> 0x02e7 }
            r11.add(r1)     // Catch:{ all -> 0x02e7 }
            goto L_0x01c0
        L_0x01b2:
            com.google.common.f.e r1 = com.google.android.apps.search.weather.p10688g.C142092a.f385501a     // Catch:{ all -> 0x02e7 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x02e7 }
            java.lang.String r12 = "Cannot install a shortcut, not supported by launcher."
            r13 = 42033(0xa431, float:5.8901E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r13)).mo56386p(r12)     // Catch:{ all -> 0x02e7 }
        L_0x01c0:
            com.google.android.libraries.onegoogle.accountmenu.features.m r1 = com.google.android.libraries.onegoogle.accountmenu.features.C30631n.m57247k()     // Catch:{ all -> 0x02e7 }
            android.content.Context r12 = r4.f385418b     // Catch:{ all -> 0x02e7 }
            android.content.res.Resources r12 = r12.getResources()     // Catch:{ all -> 0x02e7 }
            r13 = 2132093655(0x7f152ad7, float:1.982774E38)
            java.lang.String r12 = r12.getString(r13)     // Catch:{ all -> 0x02e7 }
            r1.mo36303d(r12)     // Catch:{ all -> 0x02e7 }
            android.content.Context r12 = r4.f385418b     // Catch:{ all -> 0x02e7 }
            r13 = 2131234183(0x7f080d87, float:1.8084525E38)
            android.graphics.drawable.Drawable r12 = androidx.core.content.C1877c.m5125a(r12, r13)     // Catch:{ all -> 0x02e7 }
            r12.getClass()
            r13 = r1
            com.google.android.libraries.onegoogle.accountmenu.features.g r13 = (com.google.android.libraries.onegoogle.accountmenu.features.C30606g) r13     // Catch:{ all -> 0x02e7 }
            r13.f82676a = r12     // Catch:{ all -> 0x02e7 }
            com.google.apps.tiktok.tracing.dh r12 = r4.f385428l     // Catch:{ all -> 0x02e7 }
            com.google.android.apps.search.weather.a.a.c r13 = new com.google.android.apps.search.weather.a.a.c     // Catch:{ all -> 0x02e7 }
            r13.<init>(r4)     // Catch:{ all -> 0x02e7 }
            com.google.apps.tiktok.tracing.co r14 = new com.google.apps.tiktok.tracing.co     // Catch:{ all -> 0x02e7 }
            java.lang.String r15 = "Send Feedback option clicked"
            r14.<init>(r12, r15, r13)     // Catch:{ all -> 0x02e7 }
            r12 = r1
            com.google.android.libraries.onegoogle.accountmenu.features.g r12 = (com.google.android.libraries.onegoogle.accountmenu.features.C30606g) r12     // Catch:{ all -> 0x02e7 }
            r12.f82677b = r14     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.onegoogle.accountmenu.features.n r1 = r1.mo36300a()     // Catch:{ all -> 0x02e7 }
            r11.add(r1)     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.onegoogle.accountmenu.features.a r1 = com.google.android.libraries.onegoogle.accountmenu.features.C30518b.m56960a()     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.onegoogle.accountmenu.features.i.c r12 = com.google.android.libraries.onegoogle.accountmenu.features.p2375i.C30624c.m57226e()     // Catch:{ all -> 0x02e7 }
            com.google.common.base.ax r12 = com.google.common.base.C58833ax.m90834k(r12)     // Catch:{ all -> 0x02e7 }
            r13 = r1
            com.google.android.libraries.onegoogle.accountmenu.features.c r13 = (com.google.android.libraries.onegoogle.accountmenu.features.C30522c) r13     // Catch:{ all -> 0x02e7 }
            r13.f82435e = r12     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.onegoogle.accountmenu.features.a.d r12 = com.google.android.libraries.onegoogle.accountmenu.features.p2359a.C30508e.m56929a()     // Catch:{ all -> 0x02e7 }
            com.google.common.b.gu r11 = com.google.common.p4522b.C58485gu.m89842j(r11)     // Catch:{ all -> 0x02e7 }
            r12.mo36152c(r11)     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.onegoogle.accountmenu.features.a.e r11 = r12.mo36138a()     // Catch:{ all -> 0x02e7 }
            r1.mo36134f(r11)     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.onegoogle.accountmenu.features.b r1 = r1.mo36129a()     // Catch:{ all -> 0x02e7 }
            r10.mo35845s(r1)     // Catch:{ all -> 0x02e7 }
            com.google.apps.tiktok.media.e r1 = r4.f385422f     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.onegoogle.account.a.c r11 = r4.f385423g     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.onegoogle.b.a.f r1 = com.google.apps.tiktok.account.p3616e.p3623f.C46354b.m82635a(r1, r6, r11)     // Catch:{ all -> 0x02e7 }
            r11 = r10
            com.google.android.libraries.onegoogle.accountmenu.accountlayer.r r11 = (com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30309r) r11     // Catch:{ all -> 0x02e7 }
            r11.f81947i = r1     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.onegoogle.c.a r1 = new com.google.android.libraries.onegoogle.c.a     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.onegoogle.account.a.c r11 = r4.f385423g     // Catch:{ all -> 0x02e7 }
            android.content.Context r12 = r4.f385418b     // Catch:{ all -> 0x02e7 }
            r1.<init>(r11, r12)     // Catch:{ all -> 0x02e7 }
            r11 = r10
            com.google.android.libraries.onegoogle.accountmenu.accountlayer.r r11 = (com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30309r) r11     // Catch:{ all -> 0x02e7 }
            r11.f81945g = r1     // Catch:{ all -> 0x02e7 }
            java.util.concurrent.ScheduledExecutorService r1 = r4.f385427k     // Catch:{ all -> 0x02e7 }
            r10.f81933b = r1     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.logging.ve.f.h r1 = r4.f385425i     // Catch:{ all -> 0x02e7 }
            r10.mo35849w(r1)     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.onegoogle.accountmenu.accountlayer.n r1 = r10.mo35830d()     // Catch:{ all -> 0x02e7 }
            com.google.apps.tiktok.dataservice.dp r10 = r4.f385420d     // Catch:{ all -> 0x02e7 }
            com.google.apps.tiktok.account.data.b r11 = r4.f385419c     // Catch:{ all -> 0x02e7 }
            com.google.apps.tiktok.dataservice.ag r11 = r11.mo50245b()     // Catch:{ all -> 0x02e7 }
            com.google.android.apps.search.weather.a.a.h$a r12 = new com.google.android.apps.search.weather.a.a.h$a     // Catch:{ all -> 0x02e7 }
            r12.<init>(r9, r8)     // Catch:{ all -> 0x02e7 }
            r10.mo50707a(r11, r12)     // Catch:{ all -> 0x02e7 }
            com.google.android.apps.search.weather.a.a.e r10 = new com.google.android.apps.search.weather.a.a.e     // Catch:{ all -> 0x02e7 }
            com.google.android.apps.gsa.h.b.b r4 = r4.f385421e     // Catch:{ all -> 0x02e7 }
            r10.<init>(r4, r8)     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.onegoogle.accountmanagement.j r4 = r9.f81934a     // Catch:{ all -> 0x02e7 }
            java.util.concurrent.CopyOnWriteArrayList r4 = r4.f81880a     // Catch:{ all -> 0x02e7 }
            r4.add(r10)     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc r4 = com.google.android.libraries.onegoogle.accountmenu.C30789p.m57485a(r7)     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.onegoogle.accountmenu.p2353c.C30343m.m56502b(r6, r1, r4)     // Catch:{ all -> 0x02e7 }
            com.google.android.apps.search.weather.C142155u.m230777e(r3)     // Catch:{ all -> 0x02e7 }
            if (r0 == 0) goto L_0x02b1
            java.lang.String r1 = "TAB_INDEX"
            int r1 = r0.getInt(r1)     // Catch:{ all -> 0x02e7 }
            r2.f385650t = r1     // Catch:{ all -> 0x02e7 }
            java.lang.String r1 = "BASE64_LOCATION"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ all -> 0x02e7 }
            if (r0 == 0) goto L_0x02b1
            com.google.common.l.i r1 = com.google.android.apps.search.weather.C142155u.f385632b     // Catch:{ ct -> 0x02a2, IllegalArgumentException -> 0x02a0 }
            byte[] r0 = r1.mo56836k(r0)     // Catch:{ ct -> 0x02a2, IllegalArgumentException -> 0x02a0 }
            com.google.protobuf.ba r1 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x02a2, IllegalArgumentException -> 0x02a0 }
            com.google.w.a.d r4 = com.google.p5269w.p5270a.C67962d.f184173g     // Catch:{ ct -> 0x02a2, IllegalArgumentException -> 0x02a0 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (byte[]) r0, (com.google.protobuf.C62921ba) r1)     // Catch:{ ct -> 0x02a2, IllegalArgumentException -> 0x02a0 }
            com.google.w.a.d r0 = (com.google.p5269w.p5270a.C67962d) r0     // Catch:{ ct -> 0x02a2, IllegalArgumentException -> 0x02a0 }
            r2.f385646p = r0     // Catch:{ ct -> 0x02a2, IllegalArgumentException -> 0x02a0 }
            goto L_0x02b1
        L_0x02a0:
            r0 = move-exception
            goto L_0x02a3
        L_0x02a2:
            r0 = move-exception
        L_0x02a3:
            com.google.common.f.e r1 = com.google.android.apps.search.weather.C142155u.f385631a     // Catch:{ all -> 0x02e7 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x02e7 }
            java.lang.String r4 = "Couldn't decode location from saved instance state."
            r6 = 42028(0xa42c, float:5.8894E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r6)).mo56386p(r4)     // Catch:{ all -> 0x02e7 }
        L_0x02b1:
            int r0 = r2.f385650t     // Catch:{ all -> 0x02e7 }
            r2.mo117037h(r0)     // Catch:{ all -> 0x02e7 }
            com.google.android.libraries.elements.interfaces.ab r0 = r2.f385638h     // Catch:{ all -> 0x02e7 }
            java.lang.String r1 = "weather_location_request_update_key"
            io.b.l r0 = r0.mo26139b(r1)     // Catch:{ all -> 0x02e7 }
            com.google.android.apps.search.weather.s r1 = new com.google.android.apps.search.weather.s     // Catch:{ all -> 0x02e7 }
            r1.<init>(r2)     // Catch:{ all -> 0x02e7 }
            io.b.b.b r0 = r0.mo61654n(r1)     // Catch:{ all -> 0x02e7 }
            r2.f385647q = r0     // Catch:{ all -> 0x02e7 }
            com.google.apps.tiktok.tracing.contrib.i.c.g r0 = r2.f385642l     // Catch:{ all -> 0x02e7 }
            com.google.android.apps.search.weather.t r1 = new com.google.android.apps.search.weather.t     // Catch:{ all -> 0x02e7 }
            r1.<init>(r2, r3, r5)     // Catch:{ all -> 0x02e7 }
            com.google.apps.tiktok.tracing.contrib.i.c.a r2 = new com.google.apps.tiktok.tracing.contrib.i.c.a     // Catch:{ all -> 0x02e7 }
            java.lang.String r4 = "Swipe refresh for new weather data"
            r2.<init>(r0, r4, r1)     // Catch:{ all -> 0x02e7 }
            r5.f13508a = r2     // Catch:{ all -> 0x02e7 }
            if (r3 == 0) goto L_0x02df
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r3
        L_0x02df:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x02e7 }
            java.lang.String r1 = "Fragment cannot use Event annotations with null view!"
            r0.<init>(r1)     // Catch:{ all -> 0x02e7 }
            throw r0     // Catch:{ all -> 0x02e7 }
        L_0x02e7:
            r0 = move-exception
            r1 = r0
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x02ed }
            goto L_0x02f2
        L_0x02ed:
            r0 = move-exception
            r2 = r0
            com.google.android.apps.search.weather.C142117n.m230726a(r1, r2)
        L_0x02f2:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.weather.C142118o.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            C142155u f = mo17754z();
            f.f385638h.mo26141d("weather_location_request_update_key");
            f.f385638h.mo26141d("weather_additional_entity");
            f.f385638h.mo26141d("weather_hidden_entity");
            C69803b bVar = f.f385647q;
            if (bVar != null) {
                C69828d.m101309f((AtomicReference) bVar);
                f.f385647q = null;
            }
            c.close();
            return;
        } catch (Throwable th) {
            C142117n.m230726a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f385563e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C142117n.m230726a(th, th);
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
            C142117n.m230726a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24721A(bundle);
            C142155u f = mo17754z();
            bundle.putInt("TAB_INDEX", ((ViewPager2) f.f385633c.requireView().findViewById(R.id.weather_tabs_pager)).f13893c);
            C67962d dVar = f.f385646p;
            if (dVar != null) {
                C59326i iVar = C142155u.f385632b;
                byte[] byteArray = dVar.toByteArray();
                bundle.putString("BASE64_LOCATION", iVar.mo56837l(byteArray, byteArray.length));
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C142117n.m230726a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C142155u f = mo17754z();
            C47393f.m84233d(this, C142133a.class, new C142158w(f));
            C47393f.m84233d(this, C142095a.class, new C142159x(f));
            C47393f.m84233d(this, C142107a.class, new C142160y(f));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C142117n.m230726a(th, th);
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

    /* JADX WARNING: type inference failed for: r10v8, types: [java.lang.Object, com.google.android.libraries.search.location.aa] */
    public final void onAttach(Context context) {
        String str = BuildConfig.FLAVOR;
        this.f122869b.mo51381i();
        try {
            if (!this.f385563e) {
                super.onAttach(context);
                if (this.f385560a == null) {
                    Object jN = mo116996a().mo17653jN();
                    C142055h hVar = new C142055h((Context) ((C74176nj) jN).f206677a.g.mo17428b(), (C46175b) ((C74176nj) jN).f206730b.f198398h.mo17428b(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), ((C74176nj) jN).mo69663e(), (C47449e) ((C74176nj) jN).f207092s.mo17428b(), new C142092a((Context) ((C74176nj) jN).f206677a.g.mo17428b()), (C28421h) ((C74176nj) jN).f206677a.b.f200192eu.mo17428b(), ((C74176nj) jN).mo69794gY(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (ScheduledExecutorService) ((C74176nj) jN).f206677a.p.mo17428b());
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C142118o) {
                        C142118o oVar = (C142118o) fragment;
                        C68225k.m98532d(oVar);
                        AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                        Bundle b = ((C74176nj) jN).mo69504b();
                        C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C142120q qVar = (C142120q) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C142120q.f385564d, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                        C68225k.m98532d(qVar);
                        Context context2 = (Context) ((C74176nj) jN).f206677a.d.f201488a.g.mo17428b();
                        PackageInfo packageInfo = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0);
                        C58485gu i = C58485gu.m89841i(C58869cf.m90936b(new C58903m('.')).mo56152f(C58911u.f156751b).mo56151a().mo56153g(packageInfo != null ? packageInfo.versionName : str));
                        if (i.size() >= 3) {
                            str = String.format("%s.%s.%s", new Object[]{i.get(0), i.get(1), i.get(2)});
                        }
                        String str2 = str;
                        C68225k.m98532d(str2);
                        aqe aqe = ((C74176nj) jN).f206730b.f198027a;
                        C54274j jVar = (C54274j) ((C54274j) C70864c.m103731e(new C54273i(), C47148y.m83855a(aqe.f199228b.f198071ar, (C47141r) aqe.f199175a.d.f201643cw.mo17428b(), (C61512j) aqe.f199175a.a.f203023iC.mo17428b(), C58836b.f156633a), C70851i.f189015a)).mo62576o((C47108ac) aqe.f199175a.mj.mo17428b());
                        C68225k.m98532d(jVar);
                        C142090c cVar = new C142090c(jVar, (C61410e) aqe.f199586hn.mo17428b(), (Executor) aqe.f199175a.n.mo17428b());
                        ? is = aqe.f199228b.mo66470is();
                        C46682c eN = aqe.mo66894eN();
                        Duration ofMinutes = Duration.ofMinutes(30);
                        C68225k.m98532d(ofMinutes);
                        this.f385560a = new C142155u(hVar, oVar, accountId, qVar, str2, ((C74176nj) jN).mo69843ha(), (C40305b) ((C74176nj) jN).f206770bn.mo17428b(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), (C46439e) ((C74176nj) jN).f206942f.mo17428b(), new C142066i((Context) aqe.f199175a.g.mo17428b(), (C46407v) aqe.f199585hm.mo17428b(), cVar, is, eN, new C39838p((C60888db) aqe.f199175a.n.mo17428b(), (C42876ab) aqe.f199540gu.mo17428b(), ofMinutes, (Executor) aqe.f199175a.p.mo17428b(), (C47162f) aqe.f199539gt.mo17428b(), (C46778cv) aqe.f199175a.ao.mo17428b(), (C21370a) aqe.f199175a.i.mo17428b()), (Executor) aqe.f199175a.n.mo17428b()), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), ((C74176nj) jN).mo69668eE(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C46778cv) ((C74176nj) jN).f206677a.ao.mo17428b(), ((C74176nj) jN).mo69846hd(), ((C74176nj) jN).mo69755fm(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f385562d));
                    } else {
                        String obj = C142155u.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f122869b;
                    if (abVar.f123354b == null) {
                        abVar.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (PackageManager.NameNotFoundException e2) {
            ((C59052c) ((C59052c) ((C59052c) C142104a.f385524a.mo56225c()).mo56382g(e2)).mo56372aa(42038)).mo56386p("Error while getting Android certificate.");
        } catch (Throwable th) {
            Throwable th2 = th;
            try {
                C47831fm.m85019n();
            } catch (Throwable th3) {
                C142117n.m230726a(th2, th3);
            }
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
