package com.google.android.libraries.web.webview.p3478d.p3479a;

import android.os.Bundle;
import com.google.android.apps.gsa.binaries.satin.app.axr;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.base.p3348b.p3350b.C43243b;
import com.google.android.libraries.web.browser.internal.C43309u;
import com.google.android.libraries.web.browser.internal.C43313y;
import com.google.android.libraries.web.lifecycle.C43891f;
import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.C43945v;
import com.google.android.libraries.web.p3428m.C43946w;
import com.google.android.libraries.web.p3428m.p3429a.C43920i;
import com.google.android.libraries.web.p3428m.p3429a.C43921j;
import com.google.android.libraries.web.shared.lifecycle.C44107h;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import com.google.android.libraries.web.webview.p3480e.C44407f;
import com.google.android.libraries.web.webview.p3485h.C44425b;
import com.google.android.libraries.web.webview.p3485h.p3486a.C44424l;
import com.google.android.libraries.web.webview.p3492k.p3493a.C44475p;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p3186j$.util.Optional;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.webview.d.a.g */
/* compiled from: PG */
public final class C44401g implements C44107h {

    /* renamed from: a */
    public final C44425b f115416a;

    /* renamed from: b */
    public final C43313y f115417b;

    /* renamed from: c */
    public final boolean f115418c;

    /* renamed from: d */
    public final C44424l f115419d;

    /* renamed from: e */
    public final C44397c f115420e = new C44397c(this);

    /* renamed from: f */
    public final C43920i f115421f;

    /* renamed from: g */
    public boolean f115422g;

    /* renamed from: h */
    public Bundle f115423h;

    /* renamed from: i */
    public Bundle f115424i;

    /* renamed from: j */
    public final axr f115425j;

    /* renamed from: k */
    private final C43243b f115426k;

    public C44401g(WebModelProvider webModelProvider, C43269t tVar, axr axr, C44425b bVar, C71422aw awVar, C44407f fVar, WebModelProvider webModelProvider2) {
        C69664n.m101061g(webModelProvider, "webModelProvider");
        C69664n.m101061g(tVar, "webCoordinatorInfo");
        C69664n.m101061g(axr, "coreWindowPluginFactory");
        C69664n.m101061g(bVar, "webViewPostMessageImplPicker");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(fVar, "localAssetsManager");
        C69664n.m101061g(webModelProvider2, "coordinatorModelProvider");
        this.f115425j = axr;
        this.f115416a = bVar;
        this.f115418c = tVar.mo46384b().f112974m;
        this.f115419d = (C44424l) webModelProvider.mo47072a(C44424l.class);
        this.f115426k = (C43243b) webModelProvider2.mo47072a(C43243b.class);
        C43313y yVar = (C43313y) webModelProvider.mo47072a(C43313y.class);
        yVar.mo46414g(new C44396b(this));
        this.f115417b = yVar;
        this.f115421f = C43921j.m77556a(yVar);
        C43309u.m76408a(yVar);
        if (fVar.f115445d) {
            C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C44395a(fVar, (C69577g) null), 3);
        }
    }

    /* renamed from: a */
    public final void mo44356a() {
        this.f115417b.f113166b.mo46902h();
        for (C43904a d : this.f115421f.mo46943j()) {
            C43891f d2 = d.mo46411d(C44475p.class);
            C69664n.m101060f(d2, "getPlugin(T::class.java)");
            ((C44475p) ((C43945v) d2)).mo47361u();
        }
        this.f115426k.f113006a.ifPresent(C44399e.f115413a);
    }

    /* renamed from: b */
    public final C44475p mo47292b() {
        Object obj = mo47293c().get();
        C69664n.m101060f(obj, "getActiveWindowPlugin().get()");
        return (C44475p) obj;
    }

    /* renamed from: c */
    public final Optional mo47293c() {
        Optional map = C43946w.m77584a(this.f115421f).map(C44398d.f115412a);
        C69664n.m101060f(map, "windowsManager.activeWin…n<WVCoreWindowPlugin>() }");
        return map;
    }
}
