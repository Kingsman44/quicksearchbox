package com.google.android.libraries.web.weblayer.p3450c.p3451a;

import android.os.RemoteException;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.base.p3348b.p3350b.C43243b;
import com.google.android.libraries.web.browser.internal.C43309u;
import com.google.android.libraries.web.browser.internal.C43313y;
import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.p3429a.C43914c;
import com.google.android.libraries.web.p3428m.p3429a.C43920i;
import com.google.android.libraries.web.p3428m.p3429a.C43921j;
import com.google.android.libraries.web.shared.lifecycle.C44107h;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import com.google.android.libraries.web.weblayer.contrib.footprints.internal.C44206a;
import com.google.android.libraries.web.weblayer.p3468g.p3469a.C44286n;
import com.google.android.libraries.web.weblayer.p3468g.p3469a.C44297y;
import com.google.android.libraries.web.weblayer.wrapper.C44315a;
import com.google.apps.tiktok.tracing.contrib.p3714j.C47739p;
import com.google.apps.tiktok.tracing.contrib.p3714j.C47740q;
import com.google.apps.tiktok.tracing.contrib.p3714j.C47745v;
import com.google.apps.tiktok.tracing.contrib.p3714j.C47746w;
import com.google.common.p4526f.C59071e;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.weblayer.C72601bj;
import org.chromium.weblayer.C72603bl;
import org.chromium.weblayer.C72604bm;
import org.chromium.weblayer.C72615d;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.weblayer.c.a.m */
/* compiled from: PG */
public final class C44142m implements C44107h {

    /* renamed from: a */
    public static final C59071e f114863a = C59071e.m91331h();

    /* renamed from: b */
    public final C44286n f114864b;

    /* renamed from: c */
    public final C43313y f114865c;

    /* renamed from: d */
    public String f114866d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public final boolean f114867e;

    /* renamed from: f */
    public final C43243b f114868f;

    /* renamed from: g */
    public final C72603bl f114869g;

    /* renamed from: h */
    public final C43920i f114870h;

    /* renamed from: i */
    public final Set f114871i;

    /* renamed from: j */
    public C72615d f114872j;

    /* renamed from: k */
    public C69615a f114873k;

    /* renamed from: l */
    public List f114874l;

    /* renamed from: m */
    public C44206a f114875m;

    /* renamed from: n */
    public final C44135f f114876n = new C44135f(this);

    /* renamed from: o */
    private final C43269t f114877o;

    /* renamed from: p */
    private final C47740q f114878p;

    public C44142m(C43269t tVar, C47740q qVar, C44286n nVar, C44315a aVar, WebModelProvider webModelProvider, C47746w wVar, WebModelProvider webModelProvider2) {
        C69664n.m101061g(tVar, "webCoordinatorInfo");
        C69664n.m101061g(nVar, "coreWindowPluginFactory");
        C69664n.m101061g(aVar, "webLayerWrapper");
        C69664n.m101061g(webModelProvider, "webModelProvider");
        C69664n.m101061g(webModelProvider2, "coordinatorModelProvider");
        this.f114877o = tVar;
        this.f114878p = qVar;
        this.f114864b = nVar;
        this.f114867e = tVar.mo46384b().f112969h != null;
        this.f114868f = (C43243b) webModelProvider2.mo47072a(C43243b.class);
        this.f114869g = new C47745v(wVar, new C44134e(this));
        this.f114871i = new LinkedHashSet();
        this.f114873k = C44138i.f114859a;
        C43313y yVar = (C43313y) webModelProvider.mo47072a(C43313y.class);
        yVar.mo46414g(new C44131b(this));
        this.f114865c = yVar;
        this.f114870h = C43921j.m77556a(yVar);
        C43309u.m76408a(yVar);
    }

    /* renamed from: a */
    public final void mo44356a() {
        mo47098c();
    }

    /* renamed from: b */
    public final C43904a mo47097b() {
        C43914c i = this.f114870h.mo46769c();
        C69664n.m101058d(i);
        return i;
    }

    /* renamed from: c */
    public final void mo47098c() {
        this.f114872j = null;
        this.f114865c.f113166b.mo46902h();
    }

    /* renamed from: d */
    public final void mo47099d(C72601bj bjVar) {
        int f = this.f114870h.mo46939f(new C44140k(bjVar));
        if (f != -1) {
            C43920i.m77543m(this.f114870h, f, false, new C44139j(this), 2);
        }
    }

    /* renamed from: e */
    public final boolean mo47100e() {
        return this.f114872j != null;
    }

    /* renamed from: f */
    public final void mo47101f(C72601bj bjVar) {
        C43904a g = this.f114870h.mo46940g(new C44137h(this, bjVar));
        C47739p pVar = new C47739p(this.f114878p, new C44136g(bjVar, this));
        C72604bm.m107399a();
        bjVar.mo64476g();
        bjVar.f193150h = pVar;
        try {
            bjVar.f193153k.mo63743n(bjVar.f193150h != null);
            C44297y.m78190a(g);
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }
}
