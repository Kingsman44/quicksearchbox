package com.google.android.libraries.web.weblayer.p3470ui;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.libraries.web.base.C43234b;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.browser.C43272a;
import com.google.android.libraries.web.browser.internal.C43296h;
import com.google.android.libraries.web.browser.internal.C43309u;
import com.google.android.libraries.web.p3353c.C43369n;
import com.google.android.libraries.web.p3353c.C43370o;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.android.libraries.web.p3420k.p3422b.C43856a;
import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import com.google.android.libraries.web.weblayer.p3446a.p3447a.C44117c;
import com.google.android.libraries.web.weblayer.p3450c.p3451a.C44141l;
import com.google.android.libraries.web.weblayer.p3450c.p3451a.C44142m;
import com.google.android.libraries.web.weblayer.p3468g.p3469a.C44296x;
import com.google.android.libraries.web.weblayer.p3468g.p3469a.C44297y;
import com.google.android.libraries.web.weblayer.wrapper.C44315a;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72331b;
import org.chromium.weblayer.C72601bj;
import org.chromium.weblayer.C72604bm;
import org.chromium.weblayer.C72611bt;
import org.chromium.weblayer.C72615d;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.weblayer.ui.d */
/* compiled from: PG */
public final class C44302d implements C43856a {

    /* renamed from: a */
    public final Fragment f115213a;

    /* renamed from: b */
    public boolean f115214b;

    /* renamed from: c */
    private final WebModelProvider f115215c;

    /* renamed from: d */
    private final Set f115216d;

    /* renamed from: e */
    private final C43269t f115217e;

    /* renamed from: f */
    private final C44315a f115218f;

    /* renamed from: g */
    private final C44117c f115219g;

    /* renamed from: h */
    private final C43234b f115220h;

    /* renamed from: i */
    private final C43377v f115221i;

    /* renamed from: j */
    private final C46801dp f115222j;

    /* renamed from: k */
    private final C44301c f115223k;

    /* renamed from: l */
    private final C44301c f115224l;

    /* renamed from: m */
    private final List f115225m;

    /* renamed from: n */
    private int f115226n;

    /* renamed from: o */
    private int f115227o;

    /* renamed from: com.google.android.libraries.web.weblayer.ui.d$a */
    /* compiled from: PG */
    final class C44303a implements C46792di {
        public C44303a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C69664n.m101061g(th, C42181t.f110467a);
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C43376u uVar = (C43376u) obj;
            C69664n.m101061g(uVar, "data");
            C43369n a = C43369n.m76519a(uVar.f113330c);
            if (a == null) {
                a = C43369n.UNSPECIFIED;
            }
            if (C43370o.m76522b(a)) {
                C44302d dVar = C44302d.this;
                if (!dVar.f115214b) {
                    dVar.f115214b = true;
                    View view = dVar.f115213a.getView();
                    if (view != null) {
                        C44302d.this.mo47208n(view);
                    }
                }
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C44302d(Fragment fragment, WebModelProvider webModelProvider, Set set, C43269t tVar, C44315a aVar, C44117c cVar, C43234b bVar, C43377v vVar, C46801dp dpVar) {
        C69664n.m101061g(fragment, "fragment");
        C69664n.m101061g(tVar, "webCoordinatorInfo");
        C69664n.m101061g(aVar, "webLayerWrapper");
        C69664n.m101061g(dpVar, "subscriptionMixin");
        this.f115213a = fragment;
        this.f115215c = webModelProvider;
        this.f115216d = set;
        this.f115217e = tVar;
        this.f115218f = aVar;
        this.f115219g = cVar;
        this.f115220h = bVar;
        this.f115221i = vVar;
        this.f115222j = dpVar;
        if (bVar.f112984c.length() > 0) {
            C44299a aVar2 = new C44299a(this);
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            childFragmentManager.f644k.mo606o(new C44312m(aVar2, fragment), false);
        }
        this.f115223k = new C44301c(fragment, R.layout.webx_web_layer_top_view_root, R.id.webx_top_view_root);
        this.f115224l = new C44301c(fragment, R.layout.webx_web_layer_bottom_view_root, R.id.webx_bottom_view_root);
        this.f115225m = new ArrayList();
    }

    /* renamed from: o */
    private final C44142m m78202o() {
        return (C44142m) this.f115215c.mo47072a(C44142m.class);
    }

    /* renamed from: p */
    private final void m78203p() {
        if (this.f115227o != 0 && m78202o().mo47100e()) {
            C72615d dVar = m78202o().f114872j;
            C69664n.m101058d(dVar);
            int i = this.f115226n;
            int i2 = this.f115227o;
            C72604bm.m107399a();
            if (C72611bt.m107413a() >= 89) {
                dVar.mo64487f();
                try {
                    C72331b bVar = dVar.f193182e;
                    Parcel gA = bVar.mo17260gA();
                    gA.writeInt(i);
                    gA.writeInt(i2);
                    bVar.mo17262he(16, gA);
                } catch (RemoteException e) {
                    throw new C72304a(e);
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c0, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c1, code lost:
        p5462h.p5472e.C69598b.m101013a(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c4, code lost:
        throw r8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo46854a(android.view.LayoutInflater r7, android.view.ViewGroup r8, android.os.Bundle r9) {
        /*
            r6 = this;
            java.lang.String r0 = "inflater"
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r0)
            r0 = 2131627270(0x7f0e0d06, float:1.88818E38)
            r1 = 0
            android.view.View r7 = r7.inflate(r0, r8, r1)
            java.lang.String r0 = "inflater.inflate(R.layou…* attachToRoot= */ false)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r0)
            android.support.v4.app.Fragment r0 = r6.f115213a
            android.support.v4.app.FragmentManager r0 = r0.getChildFragmentManager()
            android.support.v4.app.cc r0 = r0.f634a
            java.lang.String r1 = "browser_fragment"
            android.support.v4.app.Fragment r0 = r0.mo671c(r1)
            if (r0 != 0) goto L_0x00c5
            java.lang.String r0 = "Create Browser Fragment"
            com.google.apps.tiktok.tracing.bi r0 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r0)
            com.google.android.libraries.web.weblayer.wrapper.a r2 = r6.f115218f     // Catch:{ all -> 0x00be }
            org.chromium.weblayer.h r3 = new org.chromium.weblayer.h     // Catch:{ all -> 0x00be }
            r3.<init>()     // Catch:{ all -> 0x00be }
            com.google.android.libraries.web.base.t r4 = r6.f115217e     // Catch:{ all -> 0x00be }
            com.google.android.libraries.web.profile.Profile r4 = r4.mo46386d()     // Catch:{ all -> 0x00be }
            boolean r4 = r4.f114485c     // Catch:{ all -> 0x00be }
            r3.f193190a = r4     // Catch:{ all -> 0x00be }
            com.google.android.libraries.web.base.t r4 = r6.f115217e     // Catch:{ all -> 0x00be }
            com.google.android.libraries.web.profile.Profile r4 = r4.mo46386d()     // Catch:{ all -> 0x00be }
            java.lang.String r4 = r4.f114483a     // Catch:{ all -> 0x00be }
            r3.f193191b = r4     // Catch:{ all -> 0x00be }
            com.google.android.libraries.web.base.t r4 = r6.f115217e     // Catch:{ all -> 0x00be }
            com.google.android.libraries.web.base.WebConfig r4 = r4.mo46384b()     // Catch:{ all -> 0x00be }
            java.lang.String r4 = r4.f112969h     // Catch:{ all -> 0x00be }
            r3.f193192c = r4     // Catch:{ all -> 0x00be }
            com.google.android.libraries.web.base.t r4 = r6.f115217e     // Catch:{ all -> 0x00be }
            boolean r4 = r4.mo46389g()     // Catch:{ all -> 0x00be }
            r3.f193193d = r4     // Catch:{ all -> 0x00be }
            android.support.v4.app.Fragment r2 = r2.mo47213d(r3)     // Catch:{ all -> 0x00be }
            com.google.android.libraries.web.base.b r3 = r6.f115220h     // Catch:{ all -> 0x00be }
            java.lang.String r3 = r3.f112984c     // Catch:{ all -> 0x00be }
            int r3 = r3.length()     // Catch:{ all -> 0x00be }
            if (r3 <= 0) goto L_0x0066
            r6.mo47207m()     // Catch:{ all -> 0x00be }
        L_0x0066:
            android.support.v4.app.Fragment r3 = r6.f115213a     // Catch:{ all -> 0x00be }
            android.support.v4.app.FragmentManager r3 = r3.getChildFragmentManager()     // Catch:{ all -> 0x00be }
            java.lang.String r4 = "fragment.childFragmentManager"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)     // Catch:{ all -> 0x00be }
            android.support.v4.app.a r4 = new android.support.v4.app.a     // Catch:{ all -> 0x00be }
            r4.<init>((android.support.p031v4.app.FragmentManager) r3)     // Catch:{ all -> 0x00be }
            r3 = 2131437191(0x7f0b2687, float:1.8496274E38)
            r5 = 1
            r4.mo511h(r3, r2, r1, r5)     // Catch:{ all -> 0x00be }
            r4.mo509f()     // Catch:{ all -> 0x00be }
            java.util.List r1 = r6.f115225m     // Catch:{ all -> 0x00be }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00be }
            if (r1 != 0) goto L_0x00b8
            java.util.List r1 = r6.f115225m     // Catch:{ all -> 0x00be }
            java.util.List r1 = p5462h.p5463a.C69540x.m100840V(r1)     // Catch:{ all -> 0x00be }
            com.google.android.libraries.web.weblayer.ui.l r3 = new com.google.android.libraries.web.weblayer.ui.l     // Catch:{ all -> 0x00be }
            r3.<init>(r1)     // Catch:{ all -> 0x00be }
            androidx.lifecycle.o r1 = r2.getLifecycle()     // Catch:{ all -> 0x00be }
            androidx.lifecycle.n r1 = r1.mo5789a()     // Catch:{ all -> 0x00be }
            androidx.lifecycle.n r4 = androidx.lifecycle.C2383n.STARTED     // Catch:{ all -> 0x00be }
            boolean r1 = r1.mo5788a(r4)     // Catch:{ all -> 0x00be }
            if (r1 == 0) goto L_0x00a7
            r3.mo5672a()     // Catch:{ all -> 0x00be }
            goto L_0x00b3
        L_0x00a7:
            androidx.lifecycle.o r1 = r2.getLifecycle()     // Catch:{ all -> 0x00be }
            com.google.android.libraries.web.weblayer.ui.WebLayerFragmentPeerDelegateKt$runWhenStarted$1 r4 = new com.google.android.libraries.web.weblayer.ui.WebLayerFragmentPeerDelegateKt$runWhenStarted$1     // Catch:{ all -> 0x00be }
            r4.<init>(r3)     // Catch:{ all -> 0x00be }
            r1.mo5790b(r4)     // Catch:{ all -> 0x00be }
        L_0x00b3:
            java.util.List r1 = r6.f115225m     // Catch:{ all -> 0x00be }
            r1.clear()     // Catch:{ all -> 0x00be }
        L_0x00b8:
            r1 = 0
            p5462h.p5472e.C69598b.m101013a(r0, r1)
            r0 = r2
            goto L_0x00c5
        L_0x00be:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r8 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r7)
            throw r8
        L_0x00c5:
            com.google.android.libraries.web.weblayer.c.a.m r1 = r6.m78202o()
            boolean r1 = r1.mo47100e()
            if (r1 != 0) goto L_0x017f
            com.google.android.libraries.web.weblayer.wrapper.a r1 = r6.f115218f
            org.chromium.weblayer.bt r1 = r1.mo47217h()
            if (r1 == 0) goto L_0x00e8
            com.google.android.libraries.web.base.b r2 = r6.f115220h
            boolean r2 = r2.f112982a
            org.chromium.b.a.bc r1 = r1.f193174f     // Catch:{ RemoteException -> 0x00e1 }
            r1.mo63785r(r2)     // Catch:{ RemoteException -> 0x00e1 }
            goto L_0x00e8
        L_0x00e1:
            r7 = move-exception
            org.chromium.b.a.a r8 = new org.chromium.b.a.a
            r8.<init>(r7)
            throw r8
        L_0x00e8:
            com.google.android.libraries.web.weblayer.c.a.m r1 = r6.m78202o()
            com.google.android.libraries.web.weblayer.wrapper.a r2 = r6.f115218f
            org.chromium.weblayer.d r0 = r2.mo47215f(r0)
            p5462h.p5473f.p5475b.C69664n.m101058d(r0)
            java.lang.String r2 = "browser"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r2)
            r1.f114872j = r0
            org.chromium.weblayer.bl r1 = r1.f114869g
            org.chromium.weblayer.C72604bm.m107399a()
            org.chromium.weblayer.aq r0 = r0.f193179b
            r0.mo64455c(r1)
            com.google.android.libraries.web.weblayer.a.a.c r0 = r6.f115219g
            java.lang.String r0 = r0.mo46278a()
            com.google.android.libraries.web.base.t r1 = r6.f115217e
            com.google.android.libraries.web.base.WebConfig r1 = r1.mo46384b()
            java.lang.String r1 = r1.f112967f
            com.google.android.libraries.web.base.t r2 = r6.f115217e
            com.google.android.libraries.web.base.WebConfig r2 = r2.mo46384b()
            java.lang.String r2 = r2.f112966e
            int r3 = r1.length()
            if (r3 != 0) goto L_0x0128
            int r3 = r2.length()
            if (r3 == 0) goto L_0x0155
        L_0x0128:
            com.google.android.libraries.web.weblayer.c.a.m r3 = r6.m78202o()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = " "
            r4.append(r1)
            r4.append(r0)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            java.lang.CharSequence r0 = p5462h.p5483m.C69764m.m101197q(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "<set-?>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r1)
            r3.f114866d = r0
        L_0x0155:
            java.util.Set r0 = r6.f115216d
            java.util.Iterator r0 = r0.iterator()
        L_0x015b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x016b
            java.lang.Object r1 = r0.next()
            com.google.android.libraries.web.g.a r1 = (com.google.android.libraries.web.p3407g.C43772a) r1
            r1.mo46790a()
            goto L_0x015b
        L_0x016b:
            if (r9 == 0) goto L_0x017c
            com.google.android.libraries.web.weblayer.c.a.m r0 = r6.m78202o()
            java.lang.String r1 = "weblayer-tab-order"
            java.util.ArrayList r9 = r9.getStringArrayList(r1)
            p5462h.p5473f.p5475b.C69664n.m101058d(r9)
            r0.f114874l = r9
        L_0x017c:
            r6.m78203p()
        L_0x017f:
            r9 = 2131437175(0x7f0b2677, float:1.8496241E38)
            android.view.View r9 = r7.findViewById(r9)
            com.google.android.libraries.web.weblayer.c.a.m r0 = r6.m78202o()
            org.chromium.weblayer.d r0 = r0.f114872j
            p5462h.p5473f.p5475b.C69664n.m101058d(r0)
            com.google.android.libraries.web.weblayer.ui.c r1 = r6.f115223k
            com.google.android.libraries.web.weblayer.ui.f r2 = new com.google.android.libraries.web.weblayer.ui.f
            r2.<init>(r0)
            com.google.android.libraries.web.weblayer.ui.h r3 = new com.google.android.libraries.web.weblayer.ui.h
            r3.<init>(r9)
            r1.mo47205a(r8, r2, r3)
            com.google.android.libraries.web.weblayer.ui.c r1 = r6.f115224l
            com.google.android.libraries.web.weblayer.ui.i r2 = new com.google.android.libraries.web.weblayer.ui.i
            r2.<init>(r0)
            com.google.android.libraries.web.weblayer.ui.k r0 = new com.google.android.libraries.web.weblayer.ui.k
            r0.<init>(r9)
            r1.mo47205a(r8, r2, r0)
            r6.mo47208n(r7)
            com.google.apps.tiktok.dataservice.dp r8 = r6.f115222j
            com.google.android.libraries.web.c.v r9 = r6.f115221i
            com.google.apps.tiktok.dataservice.ag r9 = r9.mo46469b()
            com.google.android.libraries.web.weblayer.ui.d$a r0 = new com.google.android.libraries.web.weblayer.ui.d$a
            r0.<init>()
            r8.mo50707a(r9, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.weblayer.p3470ui.C44302d.mo46854a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* renamed from: b */
    public final C43272a mo46855b() {
        return m78202o().f114865c;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo46856c() {
    }

    /* renamed from: d */
    public final void mo46857d(Bundle bundle) {
        C69664n.m101061g(bundle, "outState");
        C44142m o = m78202o();
        C69664n.m101061g(bundle, "bundle");
        ArrayList arrayList = new ArrayList();
        for (C43904a a : o.f114870h.mo46943j()) {
            C44296x a2 = C44297y.m78190a(a);
            if (!a2.f115192a.mo64478i()) {
                arrayList.add(a2.f115192a.mo64472a());
            }
        }
        bundle.putStringArrayList("weblayer-tab-order", arrayList);
    }

    /* renamed from: e */
    public final /* synthetic */ void mo46858e() {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo46859f() {
    }

    /* renamed from: g */
    public final void mo46860g(boolean z, C69615a aVar) {
        if (z) {
            m78202o().f114873k = new C44141l(new C44313n(aVar));
            return;
        }
        aVar.mo5672a();
    }

    /* renamed from: h */
    public final void mo46861h(Fragment fragment) {
        this.f115224l.mo47206b(fragment);
    }

    /* renamed from: i */
    public final void mo46862i(int i, int i2) {
        this.f115226n = i;
        this.f115227o = i2;
        m78203p();
    }

    /* renamed from: j */
    public final void mo46863j(Fragment fragment) {
        C69664n.m101061g(fragment, "topFragment");
        this.f115223k.mo47206b(fragment);
    }

    /* renamed from: k */
    public final boolean mo46864k() {
        C72615d dVar = m78202o().f114872j;
        C69664n.m101058d(dVar);
        C72601bj a = dVar.mo64482a();
        if (a != null) {
            return a.mo64477h();
        }
        return false;
    }

    /* renamed from: l */
    public final boolean mo46865l() {
        C72615d dVar = m78202o().f114872j;
        C69664n.m101058d(dVar);
        C72601bj a = dVar.mo64482a();
        if (a == null || !a.mo64477h()) {
            return C43309u.m76408a(m78202o().f114865c).mo46407f(C43296h.f113112a);
        }
        return true;
    }

    /* renamed from: m */
    public final void mo47207m() {
        this.f115218f.mo47218i(C44304e.f115229a);
    }

    /* renamed from: n */
    public final void mo47208n(View view) {
        View findViewById = view.findViewById(R.id.webx_web_layer_cover);
        if (this.f115214b) {
            findViewById.setVisibility(8);
            return;
        }
        Integer num = this.f115217e.mo46384b().f112968g;
        if (num != null) {
            findViewById.setBackgroundColor(num.intValue());
            findViewById.setVisibility(0);
        }
    }
}
