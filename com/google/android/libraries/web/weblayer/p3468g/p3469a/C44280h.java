package com.google.android.libraries.web.weblayer.p3468g.p3469a;

import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.web.base.C43257h;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.base.p3348b.p3350b.C43242a;
import com.google.android.libraries.web.base.p3348b.p3350b.C43243b;
import com.google.android.libraries.web.lifecycle.C43891f;
import com.google.android.libraries.web.p3353c.C43316a;
import com.google.android.libraries.web.p3353c.C43323b;
import com.google.android.libraries.web.p3353c.C43358c;
import com.google.android.libraries.web.p3353c.C43362g;
import com.google.android.libraries.web.p3353c.C43363h;
import com.google.android.libraries.web.p3353c.C43364i;
import com.google.android.libraries.web.p3353c.C43366k;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3353c.C43374s;
import com.google.android.libraries.web.p3353c.C43375t;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.p3355b.C43324a;
import com.google.android.libraries.web.p3353c.p3355b.C43331ag;
import com.google.android.libraries.web.p3408h.p3414b.C43804r;
import com.google.android.libraries.web.p3416i.C43807a;
import com.google.android.libraries.web.p3416i.p3417a.C43810c;
import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.C43945v;
import com.google.android.libraries.web.p3428m.p3429a.C43923l;
import com.google.android.libraries.web.postmessage.PostMessageConfig;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import com.google.android.libraries.web.weblayer.contrib.footprints.internal.C44206a;
import com.google.android.libraries.web.weblayer.p3462e.p3463a.C44226e;
import com.google.android.libraries.web.weblayer.wrapper.C44315a;
import com.google.android.p445a.C8850c;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72311ag;
import org.chromium.p5643b.p5644a.C72312ah;
import org.chromium.weblayer.C72575ak;
import org.chromium.weblayer.C72576al;
import org.chromium.weblayer.C72578an;
import org.chromium.weblayer.C72582ar;
import org.chromium.weblayer.C72601bj;
import org.chromium.weblayer.C72604bm;
import org.chromium.weblayer.C72611bt;
import p3186j$.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.weblayer.g.a.h */
/* compiled from: PG */
public final class C44280h extends C72576al {

    /* renamed from: a */
    public final C72601bj f115144a;

    /* renamed from: b */
    public final C43331ag f115145b;

    /* renamed from: c */
    public C43807a f115146c;

    /* renamed from: d */
    public C43257h f115147d;

    /* renamed from: e */
    public C44273ad f115148e;

    /* renamed from: f */
    public final Map f115149f = new LinkedHashMap();

    /* renamed from: g */
    private final C43904a f115150g;

    /* renamed from: h */
    private final C44315a f115151h;

    /* renamed from: i */
    private final C60888db f115152i;

    /* renamed from: j */
    private final C72578an f115153j;

    /* renamed from: k */
    private final C44226e f115154k;

    /* renamed from: l */
    private final boolean f115155l;

    /* renamed from: m */
    private final boolean f115156m;

    /* renamed from: n */
    private final boolean f115157n;

    /* renamed from: o */
    private final boolean f115158o;

    /* renamed from: p */
    private final C43243b f115159p;

    /* renamed from: q */
    private boolean f115160q;

    /* renamed from: r */
    private final C44287o f115161r;

    public C44280h(C43904a aVar, C72601bj bjVar, C43331ag agVar, C44287o oVar, C44315a aVar2, C60888db dbVar, WebModelProvider webModelProvider, WebModelProvider webModelProvider2, C43269t tVar) {
        this.f115150g = aVar;
        this.f115144a = bjVar;
        this.f115145b = agVar;
        this.f115161r = oVar;
        this.f115151h = aVar2;
        this.f115152i = dbVar;
        C72578an d = bjVar.mo64474d();
        C69664n.m101060f(d, "tab.navigationController");
        this.f115153j = d;
        this.f115154k = (C44226e) webModelProvider.mo47072a(C44226e.class);
        this.f115155l = tVar.mo46384b().f112964c;
        this.f115156m = tVar.mo46384b().f112971j;
        this.f115157n = tVar.mo46384b().f112975n;
        this.f115158o = tVar.mo46384b().f112972k;
        this.f115159p = (C43243b) webModelProvider2.mo47072a(C43243b.class);
    }

    /* renamed from: m */
    private final C44283k m78133m(C72575ak akVar, boolean z) {
        String n = m78134n();
        C43367l lVar = this.f115145b.mo46439a().f113335h;
        if (lVar == null) {
            lVar = C43367l.f113293h;
        }
        C43323b bVar = lVar.f113300f;
        if (bVar == null) {
            bVar = C43323b.f113174a;
        }
        C43323b bVar2 = bVar;
        C69664n.m101060f(bVar2, "webStateModel.webState.pendingRequest.clientData");
        int a = this.f115151h.mo47210a();
        C69664n.m101061g(akVar, "navigation");
        C69664n.m101061g(n, "title");
        C69664n.m101061g(bVar2, "clientData");
        String uri = akVar.mo64441c().toString();
        C69664n.m101060f(uri, "navigation.uri.toString()");
        C72604bm.m107399a();
        if (C72611bt.m107413a() >= 89) {
            C72604bm.m107399a();
            C72604bm.m107399a();
            try {
                C72311ag agVar = akVar.f193104a;
                Parcel gT = agVar.mo17261gT(21, agVar.mo17260gA());
                String readString = gT.readString();
                gT.recycle();
                String uri2 = Uri.parse(readString).toString();
                C69664n.m101060f(uri2, "navigation.referrer.toString()");
                boolean g = akVar.mo64445g();
                C72604bm.m107399a();
                if (C72611bt.m107413a() >= 89) {
                    C72604bm.m107399a();
                    C72604bm.m107399a();
                    try {
                        C72311ag agVar2 = akVar.f193104a;
                        Parcel gT2 = agVar2.mo17261gT(20, agVar2.mo17260gA());
                        boolean i = C8850c.m23500i(gT2);
                        gT2.recycle();
                        int a2 = akVar.mo64439a();
                        C72604bm.m107399a();
                        try {
                            ArrayList arrayList = new ArrayList();
                            C72311ag agVar3 = akVar.f193104a;
                            Parcel gT3 = agVar3.mo17261gT(3, agVar3.mo17260gA());
                            ArrayList<String> createStringArrayList = gT3.createStringArrayList();
                            gT3.recycle();
                            for (String parse : createStringArrayList) {
                                arrayList.add(Uri.parse(parse));
                            }
                            return new C44283k(uri, n, uri2, bVar2, g, i, a, a2, arrayList, z);
                        } catch (RemoteException e) {
                            throw new C72304a(e);
                        }
                    } catch (RemoteException e2) {
                        throw new C72304a(e2);
                    }
                } else {
                    throw new UnsupportedOperationException();
                }
            } catch (RemoteException e3) {
                throw new C72304a(e3);
            }
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: n */
    private final String m78134n() {
        if (this.f115153j.mo64447a() == -1) {
            return BuildConfig.FLAVOR;
        }
        C72578an anVar = this.f115153j;
        int a = anVar.mo64447a();
        C72604bm.m107399a();
        anVar.mo64450d(a);
        try {
            C72312ah ahVar = anVar.f193107b;
            Parcel gA = ahVar.mo17260gA();
            gA.writeInt(a);
            Parcel gT = ahVar.mo17261gT(12, gA);
            String readString = gT.readString();
            gT.recycle();
            C69664n.m101060f(readString, "{\n      navigationContro…onListCurrentIndex)\n    }");
            return readString;
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    /* renamed from: o */
    private final void m78135o(C72575ak akVar, C43363h hVar) {
        m78136p(akVar, hVar);
        this.f115145b.mo46443e(hVar);
    }

    /* renamed from: p */
    private final void m78136p(C72575ak akVar, C43363h hVar) {
        if (this.f115157n) {
            akVar.mo64442d();
            C43891f d = this.f115150g.mo46411d(C43804r.class);
            C69664n.m101060f(d, "getPlugin(T::class.java)");
            Uri c = akVar.mo64441c();
            C69664n.m101060f(c, "navigation.uri");
            C72582ar d2 = akVar.mo64442d();
            C69664n.m101060f(d2, "navigation.page");
            ((C43804r) ((C43945v) d)).mo46820d(akVar, c, d2, hVar);
        }
        C44226e eVar = this.f115154k;
        for (PostMessageConfig a : eVar.f115022c) {
            eVar.f115021b.mo46963a(a.mo42598a()).mo46968d();
        }
        C43331ag agVar = this.f115145b;
        String uri = akVar.mo64441c().toString();
        String n = m78134n();
        if (n.length() == 0) {
            n = null;
        }
        agVar.mo46453o(uri, n);
        m78141u();
    }

    /* renamed from: q */
    private final void m78137q(C72575ak akVar) {
        C43367l lVar = this.f115145b.mo46439a().f113335h;
        if (lVar == null) {
            lVar = C43367l.f113293h;
        }
        C43366k a = C43366k.m76517a(lVar.f113299e);
        if (a == null) {
            a = C43366k.UNSPECIFIED;
        }
        C69664n.m101060f(a, "webStateModel.webState.pendingRequest.triggerType");
        if (a == C43366k.GO_BACK || a == C43366k.GO_FORWARD) {
            this.f115145b.mo46441c(akVar.mo64441c().toString());
        }
        m78141u();
        this.f115145b.mo46459u(akVar.mo64441c().toString());
        if (this.f115157n) {
            C43891f d = this.f115150g.mo46411d(C43804r.class);
            C69664n.m101060f(d, "getPlugin(T::class.java)");
            C43804r rVar = (C43804r) ((C43945v) d);
            C72582ar d2 = akVar.mo64442d();
            C69664n.m101060f(d2, "navigation.page");
            Uri c = akVar.mo64441c();
            C69664n.m101060f(c, "navigation.uri");
            rVar.mo46823g(d2, c);
            rVar.mo46822f(akVar);
        }
    }

    /* renamed from: r */
    private final void m78138r(C43242a aVar) {
        if (this.f115153j.mo64448b() == 0 && this.f115150g.mo46915a()) {
            this.f115159p.f113006a.ifPresent(new C44275c(aVar));
        }
    }

    /* renamed from: s */
    private final void m78139s(C72575ak akVar) {
        if (this.f115157n) {
            C43367l lVar = this.f115145b.mo46439a().f113335h;
            if (lVar == null) {
                lVar = C43367l.f113293h;
            }
            C43366k a = C43366k.m76517a(lVar.f113299e);
            if (a == null) {
                a = C43366k.UNSPECIFIED;
            }
            if (a == C43366k.RESTORATION) {
                C43891f d = this.f115150g.mo46411d(C43804r.class);
                C69664n.m101060f(d, "getPlugin(T::class.java)");
                C43804r rVar = (C43804r) ((C43945v) d);
                if (rVar.f114214a.containsKey(1)) {
                    rVar.mo46818b(1, akVar);
                }
            }
        }
    }

    /* renamed from: t */
    private final void m78140t(C72575ak akVar) {
        C58495hd d;
        C43257h hVar = this.f115147d;
        if (!(hVar == null || (d = hVar.mo46353d()) == null)) {
            Map.EL.forEach(d, new C44278f(akVar));
        }
        String str = this.f115161r.f115182a.f115197f.f114854a.f114866d;
        if (str.length() != 0) {
            C72604bm.m107399a();
            try {
                C72311ag agVar = akVar.f193104a;
                Parcel gA = agVar.mo17260gA();
                gA.writeString(str);
                agVar.mo17262he(9, gA);
            } catch (RemoteException e) {
                throw new C72304a(e);
            }
        }
        if (!this.f115156m) {
            C72604bm.m107399a();
            if (!C72611bt.m107423k() || C72611bt.m107413a() >= 88) {
                try {
                    C72311ag agVar2 = akVar.f193104a;
                    agVar2.mo17262he(18, agVar2.mo17260gA());
                } catch (RemoteException e2) {
                    throw new C72304a(e2);
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        if (!this.f115158o || (hVar != null && hVar.mo46361j())) {
            C72604bm.m107399a();
            if (!C72611bt.m107423k() || C72611bt.m107413a() >= 97) {
                try {
                    C72311ag agVar3 = akVar.f193104a;
                    agVar3.mo17262he(24, agVar3.mo17260gA());
                } catch (RemoteException e3) {
                    throw new C72304a(e3);
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        this.f115147d = null;
    }

    /* renamed from: u */
    private final void m78141u() {
        C43331ag agVar = this.f115145b;
        boolean e = this.f115153j.mo64451e();
        C72578an anVar = this.f115153j;
        C72604bm.m107399a();
        try {
            C72312ah ahVar = anVar.f193107b;
            Parcel gT = ahVar.mo17261gT(10, ahVar.mo17260gA());
            boolean i = C8850c.m23500i(gT);
            gT.recycle();
            agVar.mo46456r(e, i);
        } catch (RemoteException e2) {
            throw new C72304a(e2);
        }
    }

    /* renamed from: v */
    private final void m78142v(C72575ak akVar, C43364i iVar) {
        C43323b bVar = ((C43367l) iVar.instance).f113300f;
        if (bVar == null) {
            bVar = C43323b.f113174a;
        }
        C43316a aVar = (C43316a) bVar.toBuilder();
        C43810c cVar = new C43810c();
        C62942bv build = iVar.build();
        C69664n.m101060f(build, "requestBuilder.build()");
        C43367l lVar = (C43367l) build;
        C43807a aVar2 = this.f115146c;
        if (aVar2 != null) {
            aVar2.mo42700x(lVar, cVar);
        }
        Map.EL.forEach(cVar.f114230a, new C44279g(akVar));
    }

    /* renamed from: a */
    public final C43362g mo47176a(C72575ak akVar) {
        C69664n.m101061g(akVar, "navigation");
        int b = akVar.mo64440b();
        if (b == 1) {
            return this.f115155l ? C43362g.HTTP : C43362g.CLIENT;
        }
        if (b == 2) {
            return this.f115155l ? C43362g.HTTP : C43362g.SERVER;
        }
        if (b == 3) {
            return C43362g.SSL;
        }
        if (b == 4) {
            return C43362g.CONNECTIVITY;
        }
        if (b != 6) {
            return C43362g.UNSPECIFIED;
        }
        return C43362g.SAFE_BROWSING;
    }

    /* renamed from: b */
    public final void mo47177b(C44283k kVar, String str) {
        String str2 = kVar.f115170a;
        C44206a a = this.f115161r.mo47199a();
        if (a != null) {
            String str3 = kVar.f115170a;
            String n = m78134n();
            String str4 = kVar.f115171b;
            C43323b bVar = kVar.f115172c;
            a.f114985a.mo47142c(str3, n, str4, str, kVar.f115173d, kVar.f115174e, kVar.f115175f, kVar.f115176g, kVar.f115177h);
        }
    }

    /* renamed from: c */
    public final void mo47178c() {
        this.f115145b.mo46445g();
    }

    /* renamed from: d */
    public final void mo47179d(double d) {
        int i = (int) (d * 100.0d);
        if (true != this.f115160q) {
            i = 100;
        }
        this.f115145b.mo46457s(i);
        if (i == 100) {
            this.f115145b.mo46444f();
        }
    }

    /* renamed from: e */
    public final void mo47180e(boolean z, boolean z2) {
        boolean z3 = false;
        if (z && z2) {
            z3 = true;
        }
        this.f115160q = z3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008b  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47181f(org.chromium.weblayer.C72575ak r9) {
        /*
            r8 = this;
            java.lang.String r0 = "navigation"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r0)
            r9.mo64446h()
            r9.mo64441c()
            com.google.android.libraries.web.weblayer.g.a.o r0 = r8.f115161r
            com.google.android.libraries.web.weblayer.contrib.footprints.internal.a r0 = r0.mo47199a()
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0078
            com.google.android.libraries.web.weblayer.contrib.footprints.b r0 = r0.f114985a
            boolean r0 = r0.mo47141b()
            if (r0 == 0) goto L_0x0078
            org.chromium.weblayer.C72604bm.m107399a()
            org.chromium.b.a.ag r0 = r9.f193104a     // Catch:{ RemoteException -> 0x0071 }
            android.os.Parcel r3 = r0.mo17260gA()     // Catch:{ RemoteException -> 0x0071 }
            android.os.Parcel r0 = r0.mo17261gT(r2, r3)     // Catch:{ RemoteException -> 0x0071 }
            int r3 = r0.readInt()     // Catch:{ RemoteException -> 0x0071 }
            r0.recycle()     // Catch:{ RemoteException -> 0x0071 }
            if (r3 != r1) goto L_0x0078
            org.chromium.weblayer.ar r0 = r9.mo64442d()
            java.lang.String r3 = "navigation.page"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r3)
            java.util.Map r3 = r8.f115149f
            r4 = 0
            com.google.android.libraries.web.weblayer.g.a.k r5 = r8.m78133m(r9, r4)
            r3.put(r0, r5)
            com.google.android.libraries.web.weblayer.g.a.o r3 = r8.f115161r
            com.google.android.libraries.web.weblayer.contrib.footprints.internal.a r3 = r3.mo47199a()
            if (r3 == 0) goto L_0x0081
            com.google.common.util.concurrent.db r5 = r8.f115152i
            com.google.android.libraries.web.weblayer.g.a.b r6 = new com.google.android.libraries.web.weblayer.g.a.b
            r6.<init>(r8, r0)
            java.lang.Runnable r0 = com.google.apps.tiktok.tracing.C47810es.m84977q(r6)
            com.google.android.libraries.web.weblayer.contrib.footprints.b r3 = r3.f114985a
            j$.time.Duration r3 = r3.mo47140a()
            long r6 = r3.toNanos()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            com.google.common.util.concurrent.cz r0 = r5.mo29164d(r0, r6, r3)
            java.lang.String r3 = "Failed to notify footprintsListener."
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.google.apps.tiktok.concurrent.C46459k.m82829b(r0, r3, r4)
            goto L_0x0081
        L_0x0071:
            r9 = move-exception
            org.chromium.b.a.a r0 = new org.chromium.b.a.a
            r0.<init>(r9)
            throw r0
        L_0x0078:
            com.google.android.libraries.web.weblayer.g.a.k r0 = r8.m78133m(r9, r2)
            java.lang.String r3 = ""
            r8.mo47177b(r0, r3)
        L_0x0081:
            boolean r0 = r9.mo64446h()
            if (r0 == 0) goto L_0x008b
            r8.m78137q(r9)
            return
        L_0x008b:
            r8.m78139s(r9)
            com.google.android.libraries.web.weblayer.g.a.ad r0 = r8.f115148e
            if (r0 == 0) goto L_0x00b0
            org.chromium.weblayer.ak r3 = r0.f115135b
            boolean r3 = p5462h.p5473f.p5475b.C69664n.m101066l(r3, r9)
            if (r3 == 0) goto L_0x00b0
            com.google.android.libraries.web.i.a.b r3 = r0.f115134a
            com.google.android.libraries.web.i.a.a r3 = r3.f114228a
            com.google.android.libraries.web.c.h r3 = r3.f114226a
            if (r3 != 0) goto L_0x00a3
            goto L_0x00b0
        L_0x00a3:
            com.google.android.libraries.web.i.a.b r0 = r0.f115134a
            com.google.android.libraries.web.i.a.a r0 = r0.f114228a
            com.google.android.libraries.web.c.h r0 = r0.f114226a
            p5462h.p5473f.p5475b.C69664n.m101058d(r0)
            r8.m78135o(r9, r0)
            return
        L_0x00b0:
            boolean r0 = r8.f115155l
            if (r0 == 0) goto L_0x00fc
            int r0 = r9.mo64440b()
            if (r0 == r2) goto L_0x00c0
            int r0 = r9.mo64440b()
            if (r0 != r1) goto L_0x00fc
        L_0x00c0:
            com.google.android.libraries.web.c.h r0 = com.google.android.libraries.web.p3353c.C43363h.f113275f
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.web.c.c r0 = (com.google.android.libraries.web.p3353c.C43358c) r0
            com.google.android.libraries.web.c.g r1 = com.google.android.libraries.web.p3353c.C43362g.HTTP
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.libraries.web.c.h r3 = (com.google.android.libraries.web.p3353c.C43363h) r3
            int r1 = r1.f113274h
            r3.f113278b = r1
            int r1 = r3.f113277a
            r1 = r1 | r2
            r3.f113277a = r1
            int r1 = r9.mo64439a()
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.libraries.web.c.h r2 = (com.google.android.libraries.web.p3353c.C43363h) r2
            int r3 = r2.f113277a
            r3 = r3 | 4
            r2.f113277a = r3
            r2.f113280d = r1
            com.google.protobuf.bv r0 = r0.build()
            java.lang.String r1 = "newBuilder()\n          .…sCode)\n          .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            com.google.android.libraries.web.c.h r0 = (com.google.android.libraries.web.p3353c.C43363h) r0
            r8.m78135o(r9, r0)
            return
        L_0x00fc:
            r0 = 0
            r8.m78136p(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.weblayer.p3468g.p3469a.C44280h.mo47181f(org.chromium.weblayer.ak):void");
    }

    /* renamed from: g */
    public final void mo47182g(C72575ak akVar) {
        C69664n.m101061g(akVar, "navigation");
        akVar.mo64440b();
        akVar.mo64439a();
        akVar.mo64441c();
        if (!this.f115144a.mo64478i()) {
            if (!akVar.mo64446h()) {
                C72604bm.m107399a();
                try {
                    C72311ag agVar = akVar.f193104a;
                    Parcel gT = agVar.mo17261gT(11, agVar.mo17260gA());
                    boolean i = C8850c.m23500i(gT);
                    gT.recycle();
                    if (!i) {
                        m78139s(akVar);
                        if (akVar.mo64439a() == 204) {
                            if (this.f115157n) {
                                C43891f d = this.f115150g.mo46411d(C43804r.class);
                                C69664n.m101060f(d, "getPlugin(T::class.java)");
                                ((C43804r) ((C43945v) d)).mo46821e(akVar);
                            }
                            this.f115145b.mo46442d(akVar.mo64441c().toString());
                            return;
                        }
                        C72604bm.m107399a();
                        try {
                            C72311ag agVar2 = akVar.f193104a;
                            Parcel gT2 = agVar2.mo17261gT(10, agVar2.mo17260gA());
                            boolean i2 = C8850c.m23500i(gT2);
                            gT2.recycle();
                            if (i2) {
                                if (this.f115157n) {
                                    C43891f d2 = this.f115150g.mo46411d(C43804r.class);
                                    C69664n.m101060f(d2, "getPlugin(T::class.java)");
                                    ((C43804r) ((C43945v) d2)).mo46821e(akVar);
                                }
                                C43331ag agVar3 = this.f115145b;
                                String uri = akVar.mo64441c().toString();
                                C43375t tVar = (C43375t) agVar3.mo46439a().toBuilder();
                                tVar.copyOnWrite();
                                C43376u uVar = (C43376u) tVar.instance;
                                uVar.f113335h = null;
                                uVar.f113328a &= -65;
                                agVar3.mo46452n((C43376u) tVar.build());
                                C43324a c = agVar3.f113186b.mo46464c();
                                if (c != null) {
                                    c.mo46422a(uri);
                                }
                                m78138r(C43242a.DESTROYED_FROM_DOWNLOAD);
                                return;
                            }
                            C72604bm.m107399a();
                            if (C72611bt.m107413a() >= 89) {
                                try {
                                    C72311ag agVar4 = akVar.f193104a;
                                    Parcel gT3 = agVar4.mo17261gT(14, agVar4.mo17260gA());
                                    boolean i3 = C8850c.m23500i(gT3);
                                    gT3.recycle();
                                    if (i3) {
                                        if (this.f115157n) {
                                            C43891f d3 = this.f115150g.mo46411d(C43804r.class);
                                            C69664n.m101060f(d3, "getPlugin(T::class.java)");
                                            ((C43804r) ((C43945v) d3)).mo46821e(akVar);
                                        }
                                        C43331ag agVar5 = this.f115145b;
                                        String uri2 = akVar.mo64441c().toString();
                                        C43375t tVar2 = (C43375t) agVar5.mo46439a().toBuilder();
                                        tVar2.copyOnWrite();
                                        C43376u uVar2 = (C43376u) tVar2.instance;
                                        uVar2.f113335h = null;
                                        uVar2.f113328a &= -65;
                                        agVar5.mo46452n((C43376u) tVar2.build());
                                        C43324a c2 = agVar5.f113186b.mo46464c();
                                        if (c2 != null) {
                                            c2.mo46423b(uri2);
                                        }
                                        m78138r(C43242a.DESTROYED_FROM_INTENT_LAUNCHED);
                                        return;
                                    }
                                    C72604bm.m107399a();
                                    try {
                                        C72311ag agVar6 = akVar.f193104a;
                                        Parcel gT4 = agVar6.mo17261gT(6, agVar6.mo17260gA());
                                        boolean i4 = C8850c.m23500i(gT4);
                                        gT4.recycle();
                                        if (!i4) {
                                            if (this.f115157n) {
                                                C43891f d4 = this.f115150g.mo46411d(C43804r.class);
                                                C69664n.m101060f(d4, "getPlugin(T::class.java)");
                                                ((C43804r) ((C43945v) d4)).mo46822f(akVar);
                                            }
                                            C43331ag agVar7 = this.f115145b;
                                            String uri3 = akVar.mo64441c().toString();
                                            C43375t tVar3 = (C43375t) agVar7.mo46439a().toBuilder();
                                            tVar3.copyOnWrite();
                                            C43376u uVar3 = (C43376u) tVar3.instance;
                                            uVar3.f113335h = null;
                                            uVar3.f113328a &= -65;
                                            agVar7.mo46452n((C43376u) tVar3.build());
                                            C43324a c3 = agVar7.f113186b.mo46464c();
                                            if (c3 != null) {
                                                c3.mo46432k(uri3);
                                                return;
                                            }
                                            return;
                                        }
                                        mo47177b(m78133m(akVar, true), BuildConfig.FLAVOR);
                                        C43358c cVar = (C43358c) C43363h.f113275f.createBuilder();
                                        C43362g a = mo47176a(akVar);
                                        cVar.copyOnWrite();
                                        C43363h hVar = (C43363h) cVar.instance;
                                        hVar.f113278b = a.f113274h;
                                        hVar.f113277a = 1 | hVar.f113277a;
                                        C62942bv build = cVar.build();
                                        C69664n.m101060f(build, "newBuilder().setType(get…Type(navigation)).build()");
                                        m78135o(akVar, (C43363h) build);
                                    } catch (RemoteException e) {
                                        throw new C72304a(e);
                                    }
                                } catch (RemoteException e2) {
                                    throw new C72304a(e2);
                                }
                            } else {
                                throw new UnsupportedOperationException();
                            }
                        } catch (RemoteException e3) {
                            throw new C72304a(e3);
                        }
                    } else if (this.f115153j.mo64448b() == 0 && !this.f115150g.mo46915a()) {
                        if (!this.f115150g.mo46410c().mo46899e()) {
                            this.f115161r.f115182a.f115197f.mo47095a(this.f115144a);
                        }
                        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(new C44277e(this)), this.f115152i), "Failed to destroy the tab", new Object[0]);
                    }
                } catch (RemoteException e4) {
                    throw new C72304a(e4);
                }
            } else {
                m78137q(akVar);
            }
        }
    }

    /* renamed from: h */
    public final void mo47183h(C72575ak akVar) {
        C69664n.m101061g(akVar, "navigation");
        akVar.mo64441c();
        C43364i iVar = (C43364i) C43367l.f113293h.createBuilder();
        C43367l lVar = this.f115145b.mo46439a().f113335h;
        if (lVar == null) {
            lVar = C43367l.f113293h;
        }
        String str = lVar.f113297c;
        iVar.copyOnWrite();
        C43367l lVar2 = (C43367l) iVar.instance;
        str.getClass();
        lVar2.f113295a |= 2;
        lVar2.f113297c = str;
        C43367l lVar3 = this.f115145b.mo46439a().f113335h;
        if (lVar3 == null) {
            lVar3 = C43367l.f113293h;
        }
        C43366k a = C43366k.m76517a(lVar3.f113299e);
        if (a == null) {
            a = C43366k.UNSPECIFIED;
        }
        iVar.copyOnWrite();
        C43367l lVar4 = (C43367l) iVar.instance;
        lVar4.f113299e = a.f113292i;
        lVar4.f113295a |= 8;
        String uri = akVar.mo64441c().toString();
        iVar.copyOnWrite();
        C43367l lVar5 = (C43367l) iVar.instance;
        uri.getClass();
        lVar5.f113295a |= 1;
        lVar5.f113296b = uri;
        iVar.copyOnWrite();
        C43367l lVar6 = (C43367l) iVar.instance;
        lVar6.f113295a |= 4;
        lVar6.f113298d = true;
        C62942bv build = iVar.build();
        C69664n.m101060f(build, "newBuilder()\n        .se…ct(true)\n        .build()");
        C43367l lVar7 = (C43367l) build;
        if (!C43923l.m77561a(this.f115150g).mo46946a(lVar7, akVar)) {
            m78139s(akVar);
            C43364i iVar2 = (C43364i) lVar7.toBuilder();
            C69664n.m101060f(iVar2, "this");
            m78142v(akVar, iVar2);
            C62942bv build2 = iVar2.build();
            C69664n.m101060f(build2, "notUpdatedRequest.toBuil…vigation, this) }.build()");
            C43367l lVar8 = (C43367l) build2;
            if (this.f115157n) {
                C43891f d = this.f115150g.mo46411d(C43804r.class);
                C69664n.m101060f(d, "getPlugin(T::class.java)");
                Uri c = akVar.mo64441c();
                C69664n.m101060f(c, "navigation.uri");
                ((C43804r) ((C43945v) d)).mo46825i(akVar, c);
            }
            this.f115145b.mo46447i(lVar8);
        }
    }

    /* renamed from: i */
    public final void mo47184i(C72575ak akVar) {
        C43366k kVar;
        C69664n.m101061g(akVar, "navigation");
        akVar.mo64446h();
        akVar.mo64441c();
        akVar.mo64444f();
        akVar.mo64445g();
        if (!akVar.mo64446h()) {
            C44273ad adVar = this.f115148e;
            if (adVar != null) {
                if (adVar.f115135b == null) {
                    adVar.f115135b = akVar;
                } else {
                    this.f115148e = null;
                }
            }
            C43374s a = C43374s.m76523a(this.f115145b.mo46439a().f113337j);
            if (a == null) {
                a = C43374s.RENDER_UNSUPPORTED;
            }
            if (a == C43374s.RENDER_DEAD_IN_BACKGROUND && (this.f115145b.mo46439a().f113328a & 64) == 0) {
                C43364i iVar = (C43364i) C43367l.f113293h.createBuilder();
                String uri = akVar.mo64441c().toString();
                iVar.copyOnWrite();
                C43367l lVar = (C43367l) iVar.instance;
                uri.getClass();
                lVar.f113295a |= 2;
                lVar.f113297c = uri;
                iVar.copyOnWrite();
                C43367l lVar2 = (C43367l) iVar.instance;
                lVar2.f113295a |= 4;
                lVar2.f113298d = false;
                C43366k kVar2 = C43366k.RESTORATION;
                iVar.copyOnWrite();
                C43367l lVar3 = (C43367l) iVar.instance;
                lVar3.f113299e = kVar2.f113292i;
                lVar3.f113295a |= 8;
                m78142v(akVar, iVar);
                C62942bv build = iVar.build();
                C69664n.m101060f(build, "newBuilder()\n          .…his) }\n          .build()");
                this.f115145b.mo46450l((C43367l) build, akVar);
                m78140t(akVar);
                return;
            }
            if (akVar.mo64444f()) {
                if (akVar.mo64445g()) {
                    kVar = C43366k.UNSPECIFIED;
                } else {
                    C72604bm.m107399a();
                    if (C72611bt.m107413a() >= 92) {
                        try {
                            C72311ag agVar = akVar.f193104a;
                            Parcel gT = agVar.mo17261gT(23, agVar.mo17260gA());
                            int readInt = gT.readInt();
                            gT.recycle();
                            if (readInt < 0) {
                                kVar = C43366k.UNSPECIFIED;
                            } else {
                                kVar = C43366k.USER_INITIATED_NEW_PAGE;
                            }
                        } catch (RemoteException e) {
                            throw new C72304a(e);
                        }
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            } else if ((this.f115145b.mo46439a().f113328a & 64) != 0) {
                C43367l lVar4 = this.f115145b.mo46439a().f113335h;
                if (lVar4 == null) {
                    lVar4 = C43367l.f113293h;
                }
                kVar = C43366k.m76517a(lVar4.f113299e);
                if (kVar == null) {
                    kVar = C43366k.UNSPECIFIED;
                }
                C69664n.m101060f(kVar, "webStateModel.webState.pendingRequest.triggerType");
            } else if (akVar.mo64445g()) {
                kVar = C43366k.NETWORK_RETRY;
            } else {
                kVar = C43366k.UNSPECIFIED;
            }
            boolean z = kVar == C43366k.USER_INITIATED_NEW_PAGE;
            if (z || kVar == C43366k.UNSPECIFIED || kVar == C43366k.NETWORK_RETRY) {
                if (z) {
                    this.f115145b.mo46446h();
                }
                C43364i iVar2 = (C43364i) C43367l.f113293h.createBuilder();
                String uri2 = akVar.mo64441c().toString();
                iVar2.copyOnWrite();
                C43367l lVar5 = (C43367l) iVar2.instance;
                uri2.getClass();
                lVar5.f113295a |= 2;
                lVar5.f113297c = uri2;
                iVar2.copyOnWrite();
                C43367l lVar6 = (C43367l) iVar2.instance;
                lVar6.f113299e = kVar.f113292i;
                lVar6.f113295a |= 8;
                iVar2.copyOnWrite();
                C43367l lVar7 = (C43367l) iVar2.instance;
                lVar7.f113295a |= 4;
                lVar7.f113298d = false;
                String uri3 = akVar.mo64441c().toString();
                iVar2.copyOnWrite();
                C43367l lVar8 = (C43367l) iVar2.instance;
                uri3.getClass();
                lVar8.f113295a = 1 | lVar8.f113295a;
                lVar8.f113296b = uri3;
                C62942bv build2 = iVar2.build();
                C69664n.m101060f(build2, "newBuilder()\n          .…ing())\n          .build()");
                C43367l lVar9 = (C43367l) build2;
                if (!z || !C43923l.m77561a(this.f115150g).mo46946a(lVar9, akVar)) {
                    C43364i iVar3 = (C43364i) lVar9.toBuilder();
                    C69664n.m101060f(iVar3, "this");
                    m78142v(akVar, iVar3);
                    C62942bv build3 = iVar3.build();
                    C69664n.m101060f(build3, "notUpdatedRequest.toBuil…vigation, this) }.build()");
                    this.f115145b.mo46450l((C43367l) build3, akVar);
                } else {
                    return;
                }
            } else {
                C43367l lVar10 = this.f115145b.mo46439a().f113335h;
                if (lVar10 == null) {
                    lVar10 = C43367l.f113293h;
                }
                C62934bn builder = lVar10.toBuilder();
                C69664n.m101060f(builder, "webStateModel.webState.pendingRequest.toBuilder()");
                m78142v(akVar, (C43364i) builder);
                if (this.f115157n) {
                    C43891f d = this.f115150g.mo46411d(C43804r.class);
                    C69664n.m101060f(d, "getPlugin(T::class.java)");
                    ((C43804r) ((C43945v) d)).mo46818b(1, akVar);
                }
            }
            m78140t(akVar);
        }
    }

    /* renamed from: j */
    public final void mo47185j(Uri uri) {
        C69664n.m101061g(uri, "newNavigationUri");
        if (!this.f115144a.mo64478i()) {
            this.f115145b.mo46454p();
            if (this.f115157n) {
                C43891f d = this.f115150g.mo46411d(C43804r.class);
                C69664n.m101060f(d, "getPlugin(T::class.java)");
                ((C43804r) ((C43945v) d)).mo46826j();
            }
        }
    }

    /* renamed from: k */
    public final void mo47186k(C72582ar arVar) {
        C69664n.m101061g(arVar, "page");
        if (!this.f115144a.mo64478i()) {
            C44283k kVar = (C44283k) this.f115149f.get(arVar);
            if (kVar != null && !kVar.f115178i) {
                mo47177b(kVar, BuildConfig.FLAVOR);
            }
            this.f115149f.remove(arVar);
            if (this.f115157n) {
                C43891f d = this.f115150g.mo46411d(C43804r.class);
                C69664n.m101060f(d, "getPlugin(T::class.java)");
                ((C43804r) ((C43945v) d)).mo46822f(arVar);
            }
        }
    }

    /* renamed from: l */
    public final void mo47187l(C72582ar arVar, String str) {
        C69664n.m101061g(arVar, "page");
        C69664n.m101061g(str, "language");
        Map.EL.computeIfPresent(this.f115149f, arVar, new C44276d(this, str));
    }
}
