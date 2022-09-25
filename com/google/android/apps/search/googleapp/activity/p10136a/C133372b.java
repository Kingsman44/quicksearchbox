package com.google.android.apps.search.googleapp.activity.p10136a;

import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import androidx.core.p094f.C1891d;
import androidx.navigation.fragment.C3884h;
import com.google.android.apps.search.googleapp.homescreen.C136149c;
import com.google.android.apps.search.googleapp.p10527u.C139764e;
import com.google.android.apps.search.googleapp.p10527u.C139765f;
import com.google.android.apps.search.googleapp.p10527u.C139767h;
import com.google.android.apps.search.googleapp.p10527u.C139770k;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.performance.primes.metrics.p2410e.C31435u;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.contrib.p3629c.C46490k;
import com.google.apps.tiktok.inject.C47231d;
import p3186j$.util.Optional;
import p5462h.C69685i;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.activity.a.b */
/* compiled from: PG */
public final class C133372b implements C133376f {

    /* renamed from: a */
    public boolean f363423a;

    /* renamed from: b */
    private final C46485f f363424b;

    /* renamed from: c */
    private final C31435u f363425c;

    /* renamed from: d */
    private final Fragment f363426d;

    /* renamed from: e */
    private final boolean f363427e;

    /* renamed from: f */
    private final boolean f363428f;

    public C133372b(C46485f fVar, C31435u uVar, Fragment fragment, boolean z, boolean z2) {
        C69664n.m101061g(fVar, "accountNavigation");
        C69664n.m101061g(uVar, "memoryMetricService");
        C69664n.m101061g(fragment, "parentFragment");
        this.f363424b = fVar;
        this.f363425c = uVar;
        this.f363426d = fragment;
        this.f363427e = z;
        this.f363428f = z2;
    }

    /* renamed from: h */
    private final C3884h m216464h() {
        Fragment b = this.f363426d.getChildFragmentManager().f634a.mo670b(R.id.googleapp_nav_host);
        C69664n.m101059e(b, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        return (C3884h) b;
    }

    /* renamed from: a */
    public final Bundle mo111109a() {
        return C1891d.m5154a(new C69685i("is_search_initialized", Boolean.valueOf(this.f363423a)));
    }

    /* renamed from: b */
    public final /* synthetic */ Optional mo111110b(C139779t tVar) {
        return C133374d.m216484a(this, tVar);
    }

    /* renamed from: c */
    public final Optional mo111111c(C139779t tVar, Class cls) {
        C69664n.m101061g(tVar, "tabType");
        Fragment fragment = m216464h().getChildFragmentManager().f650q;
        if (fragment == null) {
            Optional empty = Optional.empty();
            C69664n.m101060f(empty, "empty()");
            return empty;
        }
        Object obj = null;
        C47231d dVar = fragment instanceof C47231d ? (C47231d) fragment : null;
        if (dVar != null) {
            obj = dVar.mo17754z();
        }
        if (cls.isInstance(obj)) {
            Optional ofNullable = Optional.ofNullable(cls.cast(obj));
            C69664n.m101060f(ofNullable, "{\n      Optional.ofNullable(type.cast(peer))\n    }");
            return ofNullable;
        }
        Optional empty2 = Optional.empty();
        C69664n.m101060f(empty2, "{\n      Optional.empty()\n    }");
        return empty2;
    }

    /* renamed from: d */
    public final void mo111112d(C139779t tVar, C139770k kVar) {
        C136149c cVar;
        C69664n.m101061g(kVar, "tabFragmentArgument");
        if (this.f363426d.getChildFragmentManager().f634a.mo670b(R.id.googleapp_nav_host) == null) {
            C46485f fVar = this.f363424b;
            if (kVar.f379884a == 1) {
                cVar = (C136149c) kVar.f379885b;
            } else {
                cVar = C136149c.f370793c;
            }
            C3884h b = fVar.mo50481b(R.navigation.googleapp_nav_graph, C46490k.m82868a(cVar).mo50504d());
            C0154a aVar = new C0154a(this.f363426d.getChildFragmentManager());
            aVar.mo511h(R.id.googleapp_nav_host, b, (String) null, 1);
            aVar.mo518o(b);
            aVar.mo509f();
        }
        if (tVar != C139779t.HOME_SCREEN) {
            if (tVar == C139779t.SEARCH) {
                this.f363423a = true;
            }
            C139765f fVar2 = (C139765f) C139767h.f379869k.createBuilder();
            C69664n.m101060f(fVar2, "newBuilder()");
            C139764e a = C69664n.m101061g(fVar2, "builder");
            a.mo115226b(kVar);
            mo111113e(a.mo115225a(), C139779t.HOME_SCREEN, tVar);
            return;
        }
        C133375e.m216486b(this.f363427e, this.f363425c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0170, code lost:
        if (r10 == r11) goto L_0x0172;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo111113e(com.google.android.apps.search.googleapp.p10527u.C139767h r9, com.google.android.apps.search.googleapp.p10527u.C139779t r10, com.google.android.apps.search.googleapp.p10527u.C139779t r11) {
        /*
            r8 = this;
            java.lang.String r0 = "eventData"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r0)
            java.lang.String r0 = "currentTabType"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r0)
            java.lang.String r0 = "destinationTabType"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r0)
            androidx.navigation.fragment.h r0 = r8.m216464h()
            com.google.android.apps.search.googleapp.u.t r1 = com.google.android.apps.search.googleapp.p10527u.C139779t.UNSPECIFIED
            int r1 = r11.ordinal()
            r2 = 6
            r3 = 3
            java.lang.String r4 = "Unsupported tab type "
            r5 = 2
            r6 = 1
            if (r1 == r6) goto L_0x0051
            if (r1 == r5) goto L_0x004d
            if (r1 == r3) goto L_0x0049
            if (r1 != r2) goto L_0x0033
            boolean r1 = r8.f363428f
            if (r1 == 0) goto L_0x002f
            r1 = 2131431562(0x7f0b108a, float:1.8484857E38)
            goto L_0x0054
        L_0x002f:
            r1 = 2131431563(0x7f0b108b, float:1.8484859E38)
            goto L_0x0054
        L_0x0033:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r4)
            r10.append(r11)
            java.lang.String r10 = java.lang.String.valueOf(r11)
            java.lang.String r10 = r4.concat(r10)
            r9.<init>(r10)
            throw r9
        L_0x0049:
            r1 = 2131431401(0x7f0b0fe9, float:1.848453E38)
            goto L_0x0054
        L_0x004d:
            r1 = 2131431830(0x7f0b1196, float:1.84854E38)
            goto L_0x0054
        L_0x0051:
            r1 = 2131431583(0x7f0b109f, float:1.84849E38)
        L_0x0054:
            int r7 = r11.ordinal()
            if (r7 == r6) goto L_0x0111
            if (r7 == r5) goto L_0x00a7
            if (r7 == r3) goto L_0x008f
            if (r7 != r2) goto L_0x0079
            com.google.android.apps.search.googleapp.u.k r2 = r9.f379877g
            if (r2 != 0) goto L_0x0066
            com.google.android.apps.search.googleapp.u.k r2 = com.google.android.apps.search.googleapp.p10527u.C139770k.f379882c
        L_0x0066:
            int r3 = r2.f379884a
            r4 = 4
            if (r3 != r4) goto L_0x0070
            java.lang.Object r2 = r2.f379885b
            com.google.android.apps.search.googleapp.googleappbrowser.a.h r2 = (com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h) r2
            goto L_0x0072
        L_0x0070:
            com.google.android.apps.search.googleapp.googleappbrowser.a.h r2 = com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h.f369059n
        L_0x0072:
            java.lang.String r3 = "eventData.tabFragmentArg…ppbrowserFragmentArgument"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            goto L_0x0127
        L_0x0079:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r4)
            r10.append(r11)
            java.lang.String r10 = java.lang.String.valueOf(r11)
            java.lang.String r10 = r4.concat(r10)
            r9.<init>(r10)
            throw r9
        L_0x008f:
            com.google.android.apps.search.googleapp.u.k r2 = r9.f379877g
            if (r2 != 0) goto L_0x0095
            com.google.android.apps.search.googleapp.u.k r2 = com.google.android.apps.search.googleapp.p10527u.C139770k.f379882c
        L_0x0095:
            int r4 = r2.f379884a
            if (r4 != r3) goto L_0x009e
            java.lang.Object r2 = r2.f379885b
            com.google.android.apps.search.googleapp.collections.l r2 = (com.google.android.apps.search.googleapp.collections.C133514l) r2
            goto L_0x00a0
        L_0x009e:
            com.google.android.apps.search.googleapp.collections.l r2 = com.google.android.apps.search.googleapp.collections.C133514l.f363786c
        L_0x00a0:
            java.lang.String r3 = "eventData.tabFragmentArg…llectionsFragmentArgument"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            goto L_0x0127
        L_0x00a7:
            com.google.android.apps.search.googleapp.u.k r2 = r9.f379877g
            if (r2 != 0) goto L_0x00ad
            com.google.android.apps.search.googleapp.u.k r2 = com.google.android.apps.search.googleapp.p10527u.C139770k.f379882c
        L_0x00ad:
            int r3 = r2.f379884a
            if (r3 != r5) goto L_0x00b6
            java.lang.Object r2 = r2.f379885b
            com.google.android.apps.search.googleapp.search.e r2 = (com.google.android.apps.search.googleapp.search.C137411e) r2
            goto L_0x00b8
        L_0x00b6:
            com.google.android.apps.search.googleapp.search.e r2 = com.google.android.apps.search.googleapp.search.C137411e.f373755g
        L_0x00b8:
            int r2 = r2.f373757a
            r2 = r2 & 8
            if (r2 == 0) goto L_0x00d5
            com.google.android.apps.search.googleapp.u.k r2 = r9.f379877g
            if (r2 != 0) goto L_0x00c4
            com.google.android.apps.search.googleapp.u.k r2 = com.google.android.apps.search.googleapp.p10527u.C139770k.f379882c
        L_0x00c4:
            int r3 = r2.f379884a
            if (r3 != r5) goto L_0x00cd
            java.lang.Object r2 = r2.f379885b
            com.google.android.apps.search.googleapp.search.e r2 = (com.google.android.apps.search.googleapp.search.C137411e) r2
            goto L_0x00cf
        L_0x00cd:
            com.google.android.apps.search.googleapp.search.e r2 = com.google.android.apps.search.googleapp.search.C137411e.f373755g
        L_0x00cf:
            java.lang.String r3 = "eventData.tabFragmentArg…nt.searchFragmentArgument"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            goto L_0x0127
        L_0x00d5:
            com.google.android.apps.search.googleapp.u.k r2 = r9.f379877g
            if (r2 != 0) goto L_0x00db
            com.google.android.apps.search.googleapp.u.k r2 = com.google.android.apps.search.googleapp.p10527u.C139770k.f379882c
        L_0x00db:
            int r3 = r2.f379884a
            if (r3 != r5) goto L_0x00e4
            java.lang.Object r2 = r2.f379885b
            com.google.android.apps.search.googleapp.search.e r2 = (com.google.android.apps.search.googleapp.search.C137411e) r2
            goto L_0x00e6
        L_0x00e4:
            com.google.android.apps.search.googleapp.search.e r2 = com.google.android.apps.search.googleapp.search.C137411e.f373755g
        L_0x00e6:
            com.google.protobuf.bn r2 = r2.toBuilder()
            java.lang.String r3 = "eventData.tabFragmentArg…gmentArgument.toBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            com.google.android.apps.search.googleapp.search.d r2 = (com.google.android.apps.search.googleapp.search.C137404d) r2
            com.google.android.apps.search.googleapp.search.e.g r3 = com.google.android.apps.search.googleapp.activity.p10136a.C133375e.m216487c(r9)
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.search.googleapp.search.e r4 = (com.google.android.apps.search.googleapp.search.C137411e) r4
            r3.getClass()
            r4.f373761e = r3
            int r3 = r4.f373757a
            r3 = r3 | 8
            r4.f373757a = r3
            com.google.protobuf.bv r2 = r2.build()
            java.lang.String r3 = "searchArgument.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            goto L_0x0127
        L_0x0111:
            com.google.android.apps.search.googleapp.u.k r2 = r9.f379877g
            if (r2 != 0) goto L_0x0117
            com.google.android.apps.search.googleapp.u.k r2 = com.google.android.apps.search.googleapp.p10527u.C139770k.f379882c
        L_0x0117:
            int r3 = r2.f379884a
            if (r3 != r6) goto L_0x0120
            java.lang.Object r2 = r2.f379885b
            com.google.android.apps.search.googleapp.homescreen.c r2 = (com.google.android.apps.search.googleapp.homescreen.C136149c) r2
            goto L_0x0122
        L_0x0120:
            com.google.android.apps.search.googleapp.homescreen.c r2 = com.google.android.apps.search.googleapp.homescreen.C136149c.f370793c
        L_0x0122:
            java.lang.String r3 = "eventData.tabFragmentArg…omescreenFragmentArgument"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
        L_0x0127:
            boolean r3 = r9.f379873c
            r4 = 0
            if (r3 == 0) goto L_0x016c
            com.google.android.apps.search.googleapp.u.t r3 = com.google.android.apps.search.googleapp.p10527u.C139779t.HOME_SCREEN
            if (r11 != r3) goto L_0x0172
            com.google.android.apps.search.googleapp.u.t r3 = com.google.android.apps.search.googleapp.p10527u.C139779t.HOME_SCREEN
            if (r10 != r3) goto L_0x0135
            goto L_0x0172
        L_0x0135:
            androidx.navigation.af r9 = r0.mo8129a()
            r9.mo8062v(r1, r4, r6)
            androidx.navigation.af r9 = r0.mo8129a()
            r9.mo8062v(r1, r6, r4)
            com.google.apps.tiktok.contrib.c.f r9 = r8.f363424b
            com.google.apps.tiktok.contrib.c.q r9 = r9.mo50482c(r0)
            com.google.apps.tiktok.contrib.c.x r10 = com.google.apps.tiktok.contrib.p3629c.C46504y.m82902f(r1)
            com.google.apps.tiktok.contrib.c.p r11 = com.google.apps.tiktok.contrib.p3629c.C46490k.m82868a(r2)
            r1 = r10
            com.google.apps.tiktok.contrib.c.l r1 = (com.google.apps.tiktok.contrib.p3629c.C46491l) r1
            r1.f121639c = r11
            com.google.apps.tiktok.contrib.c.y r10 = r10.mo50495a()
            r9.mo50507c(r10)
            android.support.v4.app.FragmentManager r9 = r0.getChildFragmentManager()
            r9.mo467ah()
            boolean r9 = r8.f363427e
            com.google.android.libraries.performance.primes.metrics.e.u r10 = r8.f363425c
            com.google.android.apps.search.googleapp.activity.p10136a.C133375e.m216486b(r9, r10)
            return
        L_0x016c:
            com.google.android.apps.search.googleapp.u.t r3 = com.google.android.apps.search.googleapp.p10527u.C139779t.SEARCH
            if (r10 == r3) goto L_0x01b8
            if (r10 != r11) goto L_0x01b8
        L_0x0172:
            com.google.android.apps.search.googleapp.u.t r10 = com.google.android.apps.search.googleapp.p10527u.C139779t.SEARCH
            if (r11 != r10) goto L_0x0178
            r8.f363423a = r4
        L_0x0178:
            androidx.navigation.fragment.h r10 = r8.m216464h()
            com.google.apps.tiktok.contrib.c.f r3 = r8.f363424b
            com.google.apps.tiktok.contrib.c.q r3 = r3.mo50482c(r10)
            androidx.navigation.af r3 = r3.mo50505a()
            androidx.navigation.ax r3 = r3.mo8046f()
            if (r3 == 0) goto L_0x019e
            int r3 = r3.f12360i
            if (r1 != r3) goto L_0x019e
            com.google.apps.tiktok.contrib.c.f r3 = r8.f363424b
            com.google.apps.tiktok.contrib.c.q r3 = r3.mo50482c(r10)
            androidx.navigation.af r3 = r3.mo50505a()
            r3.mo8062v(r1, r6, r4)
            goto L_0x01b1
        L_0x019e:
            com.google.apps.tiktok.contrib.c.f r3 = r8.f363424b
            com.google.apps.tiktok.contrib.c.q r3 = r3.mo50482c(r10)
            androidx.navigation.af r3 = r3.mo50505a()
            boolean r5 = r3.mo8058r(r1)
            if (r5 == 0) goto L_0x01b1
            r3.mo8059s()
        L_0x01b1:
            android.support.v4.app.FragmentManager r10 = r10.getChildFragmentManager()
            r10.mo467ah()
        L_0x01b8:
            com.google.apps.tiktok.contrib.c.f r10 = r8.f363424b
            com.google.apps.tiktok.contrib.c.q r10 = r10.mo50482c(r0)
            com.google.apps.tiktok.contrib.c.x r1 = com.google.apps.tiktok.contrib.p3629c.C46504y.m82902f(r1)
            com.google.apps.tiktok.contrib.c.p r2 = com.google.apps.tiktok.contrib.p3629c.C46490k.m82868a(r2)
            r3 = r1
            com.google.apps.tiktok.contrib.c.l r3 = (com.google.apps.tiktok.contrib.p3629c.C46491l) r3
            r3.f121639c = r2
            androidx.navigation.bg r2 = new androidx.navigation.bg
            r2.<init>()
            r2.f12382b = r6
            com.google.apps.tiktok.contrib.c.f r5 = r8.f363424b
            com.google.apps.tiktok.contrib.c.q r5 = r5.mo50482c(r0)
            androidx.navigation.af r5 = r5.mo50505a()
            androidx.navigation.bb r5 = r5.mo8047g()
            int r5 = r5.f12375b
            r2.mo8100b(r5, r4, r6)
            androidx.navigation.bh r2 = r2.mo8099a()
            r3.f121640d = r2
            com.google.apps.tiktok.contrib.c.y r1 = r1.mo50495a()
            r10.mo50507c(r1)
            android.support.v4.app.FragmentManager r10 = r0.getChildFragmentManager()
            r10.mo467ah()
            com.google.android.apps.search.googleapp.u.t r10 = com.google.android.apps.search.googleapp.p10527u.C139779t.SEARCH
            if (r11 != r10) goto L_0x020d
            boolean r10 = r8.f363423a
            if (r10 != 0) goto L_0x020d
            j$.util.Optional r10 = com.google.android.apps.search.googleapp.activity.p10136a.C133374d.m216484a(r8, r11)
            com.google.android.apps.search.googleapp.activity.a.a r11 = new com.google.android.apps.search.googleapp.activity.a.a
            r11.<init>(r8, r9)
            r10.ifPresent(r11)
        L_0x020d:
            boolean r9 = r8.f363427e
            com.google.android.libraries.performance.primes.metrics.e.u r10 = r8.f363425c
            com.google.android.apps.search.googleapp.activity.p10136a.C133375e.m216486b(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.activity.p10136a.C133372b.mo111113e(com.google.android.apps.search.googleapp.u.h, com.google.android.apps.search.googleapp.u.t, com.google.android.apps.search.googleapp.u.t):void");
    }

    /* renamed from: f */
    public final void mo111114f(Bundle bundle) {
        this.f363423a = bundle.getBoolean("is_search_initialized");
    }

    /* renamed from: g */
    public final boolean mo111115g(C139779t tVar) {
        return tVar == C139779t.HOME_SCREEN;
    }
}
