package com.google.android.libraries.web.weblayer.p3468g.p3469a;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebResourceResponse;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.web.base.C43256g;
import com.google.android.libraries.web.base.C43257h;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.base.p3348b.p3349a.C43238c;
import com.google.android.libraries.web.base.p3348b.p3349a.C43239d;
import com.google.android.libraries.web.base.p3348b.p3350b.C43243b;
import com.google.android.libraries.web.contrib.contextmenu.internal.p3365a.C43456a;
import com.google.android.libraries.web.contrib.fullscreen.internal.C43560b;
import com.google.android.libraries.web.contrib.googlesignin.internal.weblayer.C43608b;
import com.google.android.libraries.web.contrib.p3389i.C43632f;
import com.google.android.libraries.web.lifecycle.C43891f;
import com.google.android.libraries.web.p3353c.p3355b.C43331ag;
import com.google.android.libraries.web.p3416i.C43807a;
import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.C43945v;
import com.google.android.libraries.web.p3428m.p3429a.p3430a.C43906a;
import com.google.android.libraries.web.p3428m.p3429a.p3430a.C43910e;
import com.google.android.libraries.web.postmessage.PostMessageConfig;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import com.google.android.libraries.web.weblayer.p3450c.p3451a.C44135f;
import com.google.android.libraries.web.weblayer.p3462e.p3463a.C44225d;
import com.google.android.libraries.web.weblayer.p3462e.p3463a.C44226e;
import com.google.android.libraries.web.weblayer.wrapper.C44315a;
import com.google.android.p445a.C8850c;
import com.google.apps.tiktok.tracing.contrib.p3714j.C47725b;
import com.google.apps.tiktok.tracing.contrib.p3714j.C47726c;
import com.google.apps.tiktok.tracing.contrib.p3714j.C47728e;
import com.google.apps.tiktok.tracing.contrib.p3714j.C47729f;
import com.google.apps.tiktok.tracing.contrib.p3714j.C47732i;
import com.google.apps.tiktok.tracing.contrib.p3714j.C47734k;
import com.google.apps.tiktok.tracing.contrib.p3714j.C47735l;
import com.google.apps.tiktok.tracing.contrib.p3714j.C47737n;
import com.google.apps.tiktok.tracing.contrib.p3714j.C47738o;
import com.google.apps.tiktok.tracing.contrib.p3714j.C47742s;
import com.google.apps.tiktok.tracing.contrib.p3714j.C47743t;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60888db;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72310af;
import org.chromium.p5643b.p5644a.C72312ah;
import org.chromium.p5643b.p5644a.C72341bj;
import org.chromium.weblayer.C72578an;
import org.chromium.weblayer.C72595bd;
import org.chromium.weblayer.C72597bf;
import org.chromium.weblayer.C72598bg;
import org.chromium.weblayer.C72600bi;
import org.chromium.weblayer.C72601bj;
import org.chromium.weblayer.C72604bm;
import org.chromium.weblayer.C72611bt;
import org.chromium.weblayer.C72636y;
import p3186j$.util.function.Predicate;
import p5462h.p5463a.C69502as;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5480j.C69694b;
import p5462h.p5480j.C69699g;

/* renamed from: com.google.android.libraries.web.weblayer.g.a.x */
/* compiled from: PG */
public final class C44296x implements C43906a {

    /* renamed from: a */
    public final C72601bj f115192a;

    /* renamed from: b */
    public final C43331ag f115193b;

    /* renamed from: c */
    public final C44280h f115194c;

    /* renamed from: d */
    public final C43243b f115195d;

    /* renamed from: e */
    public C69626l f115196e = C44289q.f115183a;

    /* renamed from: f */
    public final C44135f f115197f;

    /* renamed from: g */
    private final C43904a f115198g;

    /* renamed from: h */
    private final C47729f f115199h;

    /* renamed from: i */
    private final C47735l f115200i;

    /* renamed from: j */
    private final Set f115201j = new LinkedHashSet();

    /* renamed from: k */
    private final C44282j f115202k;

    /* renamed from: l */
    private final C43239d f115203l;

    public C44296x(C43904a aVar, C72601bj bjVar, C44135f fVar, C47729f fVar2, C47735l lVar, C44315a aVar2, C44281i iVar, C47738o oVar, C47743t tVar, C44271ab abVar, C47726c cVar, WebModelProvider webModelProvider, WebModelProvider webModelProvider2, C69585o oVar2) {
        C58485gu guVar;
        C43904a aVar3 = aVar;
        C72601bj bjVar2 = bjVar;
        C44135f fVar3 = fVar;
        C44281i iVar2 = iVar;
        WebModelProvider webModelProvider3 = webModelProvider;
        WebModelProvider webModelProvider4 = webModelProvider2;
        C69664n.m101061g(aVar3, "window");
        C69664n.m101061g(bjVar2, "tab");
        C69664n.m101061g(fVar3, "host");
        C69664n.m101061g(aVar2, "webLayerWrapper");
        C69664n.m101061g(webModelProvider3, "webModelProvider");
        C69664n.m101061g(webModelProvider4, "coordinatorModelProvider");
        C69664n.m101061g(oVar2, "mainImmediateContext");
        this.f115198g = aVar3;
        this.f115192a = bjVar2;
        this.f115197f = fVar3;
        this.f115199h = fVar2;
        this.f115200i = lVar;
        C43891f d = aVar3.mo46411d(C43331ag.class);
        C69664n.m101060f(d, "getPlugin(T::class.java)");
        C43331ag agVar = (C43331ag) ((C43945v) d);
        this.f115193b = agVar;
        C44287o oVar3 = new C44287o(this);
        aVar.getClass();
        bjVar.getClass();
        agVar.getClass();
        C44315a aVar4 = (C44315a) iVar2.f115162a.mo17428b();
        aVar4.getClass();
        C60888db dbVar = (C60888db) iVar2.f115163b.mo17428b();
        dbVar.getClass();
        WebModelProvider webModelProvider5 = (WebModelProvider) iVar2.f115164c.mo17428b();
        webModelProvider5.getClass();
        WebModelProvider webModelProvider6 = (WebModelProvider) iVar2.f115165d.mo17428b();
        webModelProvider6.getClass();
        C43269t tVar2 = (C43269t) iVar2.f115166e.mo17428b();
        tVar2.getClass();
        C44280h hVar = r2;
        C44280h hVar2 = new C44280h(aVar, bjVar, agVar, oVar3, aVar4, dbVar, webModelProvider5, webModelProvider6, tVar2);
        this.f115194c = hVar;
        agVar.getClass();
        bjVar.getClass();
        C44282j jVar = new C44282j(agVar, bjVar2);
        this.f115202k = jVar;
        bjVar.getClass();
        C47732i iVar3 = (C47732i) abVar.f115132a.mo17428b();
        iVar3.getClass();
        this.f115203l = new C44270aa(bjVar2, iVar3);
        this.f115195d = (C43243b) webModelProvider4.mo47072a(C43243b.class);
        bjVar2.mo64475f(new C47742s(tVar, jVar));
        C72578an d2 = bjVar.mo64474d();
        C47737n nVar = new C47737n(oVar, hVar);
        C72604bm.m107399a();
        d2.f193106a.mo64455c(nVar);
        C47725b bVar = new C47725b(cVar, new C44285m(this));
        C72604bm.m107399a();
        bjVar.mo64476g();
        try {
            bjVar2.f193153k.mo63739j(new C72595bd(bVar));
            C44226e eVar = (C44226e) webModelProvider3.mo47072a(C44226e.class);
            for (PostMessageConfig postMessageConfig : eVar.f115022c) {
                C44225d dVar = new C44225d(eVar, postMessageConfig, aVar);
                String str = postMessageConfig.mo42598a().f114149a;
                if (eVar.f115024e.f112982a) {
                    C58480gp e = C58485gu.m89837e();
                    e.mo55395g("http://localhost:9879");
                    e.mo55395g("http://localhost:8888");
                    e.mo55396h(postMessageConfig.mo42599b());
                    guVar = e.mo55394f();
                } else {
                    guVar = postMessageConfig.mo42599b();
                }
                C72604bm.m107399a();
                bjVar.mo64476g();
                try {
                    bjVar2.f193153k.mo63737h(str, guVar, new C72600bi(dVar));
                } catch (RemoteException e2) {
                    throw new C72304a(e2);
                }
            }
        } catch (RemoteException e3) {
            throw new C72304a(e3);
        }
    }

    /* renamed from: t */
    private static final String m78170t(C72578an anVar, int i) {
        String uri = anVar.mo64449c(i).toString();
        C69664n.m101060f(uri, "getNavigationEntryDisplayUri(index).toString()");
        return uri;
    }

    /* renamed from: a */
    public final int mo46926a() {
        Integer num;
        C72578an d = this.f115192a.mo64474d();
        int a = d.mo64447a();
        C69502as a2 = C69699g.m101122d(a + 1, d.mo64448b()).iterator();
        while (true) {
            if (!((C69694b) a2).f186062a) {
                num = null;
                break;
            }
            num = Integer.valueOf(a2.mo5128a());
            if (!d.mo64452f(num.intValue())) {
                break;
            }
        }
        return num != null ? num.intValue() : a;
    }

    /* renamed from: b */
    public final int mo46927b(C69626l lVar) {
        Object obj;
        C72578an d = this.f115192a.mo64474d();
        int a = d.mo64447a();
        Iterator it = C69699g.m101121c(a - 1, 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            int intValue = ((Number) obj).intValue();
            if (!d.mo64452f(intValue)) {
                C69664n.m101060f(d, BuildConfig.FLAVOR);
                if (((Boolean) lVar.mo5761a(m78170t(d, intValue))).booleanValue()) {
                    break;
                }
            }
        }
        Integer num = (Integer) obj;
        return num != null ? num.intValue() : a;
    }

    /* renamed from: c */
    public final int mo46928c() {
        return this.f115192a.mo64474d().mo64447a();
    }

    /* renamed from: d */
    public final C43239d mo46916d() {
        return this.f115203l;
    }

    /* renamed from: e */
    public final /* synthetic */ String mo46929e() {
        return C43910e.m77520a(this);
    }

    /* renamed from: f */
    public final String mo46930f(int i) {
        C72578an d = this.f115192a.mo64474d();
        C58838bb.m90861B(i, d.mo64448b(), "Navigation history index");
        C69664n.m101060f(d, BuildConfig.FLAVOR);
        return m78170t(d, i);
    }

    /* renamed from: g */
    public final Set mo46917g() {
        return this.f115201j;
    }

    /* renamed from: h */
    public final void mo46931h(int i) {
        C72578an d = this.f115192a.mo64474d();
        C72604bm.m107399a();
        d.mo64450d(i);
        try {
            C72312ah ahVar = d.f193107b;
            Parcel gA = ahVar.mo17260gA();
            gA.writeInt(i);
            ahVar.mo17262he(11, gA);
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    /* renamed from: i */
    public final void mo46932i(C43257h hVar) {
        boolean z;
        WebResourceResponse webResourceResponse;
        C69664n.m101061g(hVar, "loadUrlParams");
        this.f115194c.f115147d = hVar;
        boolean k = hVar.mo46362k();
        boolean h = hVar.mo46358h();
        boolean i = hVar.mo46360i();
        if (!hVar.mo46357g()) {
            z = false;
        } else if (!C72611bt.m107423k() || C72611bt.m107413a() >= 89) {
            z = true;
        } else {
            throw new UnsupportedOperationException();
        }
        C72310af afVar = null;
        this.f115194c.f115148e = null;
        C43256g b = hVar.mo46351b();
        if (b != null) {
            C44273ad adVar = new C44273ad(b.f113052a, new C44288p(b));
            this.f115194c.f115148e = adVar;
            webResourceResponse = adVar.f115134a.f114229b;
        } else {
            webResourceResponse = null;
        }
        C72578an d = this.f115192a.mo64474d();
        Uri parse = Uri.parse(hVar.mo46356f());
        C72604bm.m107399a();
        try {
            C72312ah ahVar = d.f193107b;
            Parcel gT = ahVar.mo17261gT(16, ahVar.mo17260gA());
            IBinder readStrongBinder = gT.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("org.chromium.weblayer_private.interfaces.INavigateParams");
                afVar = queryLocalInterface instanceof C72310af ? (C72310af) queryLocalInterface : new C72310af(readStrongBinder);
            }
            gT.recycle();
            if (k) {
                afVar.mo17262he(1, afVar.mo17260gA());
            }
            if (i) {
                afVar.mo17262he(2, afVar.mo17260gA());
            }
            if (C72611bt.m107413a() >= 89) {
                if (C72611bt.m107423k()) {
                    if (C72611bt.m107413a() < 89) {
                        throw new UnsupportedOperationException();
                    }
                }
                if (z) {
                    afVar.mo17262he(6, afVar.mo17260gA());
                }
            }
            if (h) {
                afVar.mo17262he(4, afVar.mo17260gA());
            }
            if (webResourceResponse != null) {
                C72341bj bjVar = new C72341bj(webResourceResponse);
                Parcel gA = afVar.mo17260gA();
                C8850c.m23499h(gA, bjVar);
                afVar.mo17262he(5, gA);
            }
            C72312ah ahVar2 = d.f193107b;
            String uri = parse.toString();
            Parcel gA2 = ahVar2.mo17260gA();
            gA2.writeString(uri);
            C8850c.m23499h(gA2, afVar);
            ahVar2.mo17262he(17, gA2);
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    /* renamed from: j */
    public final void mo46933j(boolean z) {
        C72578an d = this.f115192a.mo64474d();
        C72604bm.m107399a();
        try {
            C72312ah ahVar = d.f193107b;
            ahVar.mo17262he(5, ahVar.mo17260gA());
            if (!z && this.f115192a.mo64474d().mo64448b() == 0 && !this.f115198g.mo46915a()) {
                this.f115197f.mo47095a(this.f115192a);
            }
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    /* renamed from: k */
    public final void mo46934k() {
        C72578an d = this.f115192a.mo64474d();
        C72604bm.m107399a();
        try {
            C72312ah ahVar = d.f193107b;
            ahVar.mo17262he(4, ahVar.mo17260gA());
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    /* renamed from: l */
    public final /* synthetic */ void mo46918l(View.OnCreateContextMenuListener onCreateContextMenuListener) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: m */
    public final void mo46919m(Predicate predicate) {
        this.f115196e = new C44290r(predicate);
    }

    /* renamed from: n */
    public final void mo46920n(C43238c cVar) {
        C72601bj bjVar = this.f115192a;
        C47728e eVar = new C47728e(this.f115199h, new C44291s(cVar, this));
        C72604bm.m107399a();
        bjVar.mo64476g();
        new C72636y(bjVar.f193153k, eVar);
    }

    /* renamed from: o */
    public final void mo46921o(C43807a aVar) {
        this.f115194c.f115146c = aVar;
    }

    /* renamed from: p */
    public final void mo46922p(C43456a aVar) {
        this.f115202k.f115167a = aVar;
    }

    /* renamed from: q */
    public final void mo46923q(C43560b bVar) {
        C72601bj bjVar = this.f115192a;
        C44293u uVar = new C44293u(bVar, this);
        C72604bm.m107399a();
        bjVar.mo64476g();
        try {
            bjVar.f193149g = new C72597bf(uVar);
            bjVar.f193153k.mo63740k(bjVar.f193149g);
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    /* renamed from: r */
    public final void mo46924r(C43608b bVar) {
        C72601bj bjVar = this.f115192a;
        C47734k kVar = new C47734k(this.f115200i, new C44294v(bVar));
        C72604bm.m107399a();
        bjVar.mo64476g();
        try {
            bjVar.f193153k.mo63741l(new C72598bg(kVar));
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    /* renamed from: s */
    public final void mo46925s(C43632f fVar) {
        C72601bj bjVar = this.f115192a;
        C44295w wVar = new C44295w(fVar);
        C72604bm.m107399a();
        bjVar.mo64476g();
        if (bjVar.f193151i.mo64454b()) {
            try {
                bjVar.f193153k.mo63752w();
            } catch (RemoteException e) {
                throw new C72304a(e);
            }
        }
        bjVar.f193151i.mo64455c(wVar);
    }
}
