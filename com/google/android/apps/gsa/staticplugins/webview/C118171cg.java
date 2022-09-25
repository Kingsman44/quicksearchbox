package com.google.android.apps.gsa.staticplugins.webview;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.search.core.p6519al.p6622bv.C85028a;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.preferences.C86319j;
import com.google.android.apps.gsa.search.core.service.p6848e.C86695q;
import com.google.android.apps.gsa.search.core.webview.C87263i;
import com.google.android.apps.gsa.search.core.webview.C87264j;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import org.json.JSONObject;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.cg */
/* compiled from: PG */
public final class C118171cg implements C87263i {

    /* renamed from: a */
    public long f328045a;

    /* renamed from: b */
    private final C118174cj f328046b;

    /* renamed from: c */
    private final C21370a f328047c;

    public C118171cg(C118175ck ckVar, C21370a aVar, C87264j jVar) {
        C118175ck ckVar2 = ckVar;
        Context context = (Context) ckVar2.f328068a.mo17428b();
        context.getClass();
        C68214a a = C68219e.m98518a(((C68226l) ckVar2.f328069b).f184585a);
        a.getClass();
        C91097g gVar = (C91097g) ckVar2.f328070c.mo17428b();
        gVar.getClass();
        C86127w wVar = (C86127w) ckVar2.f328071d.mo17428b();
        wVar.getClass();
        C86319j jVar2 = (C86319j) ckVar2.f328072e.mo17428b();
        jVar2.getClass();
        C68214a a2 = C68219e.m98518a(((C68226l) ckVar2.f328073f).f184585a);
        a2.getClass();
        C68214a a3 = C68219e.m98518a(((C68226l) ckVar2.f328074g).f184585a);
        a3.getClass();
        C22871g gVar2 = (C22871g) ckVar2.f328075h.mo17428b();
        gVar2.getClass();
        C86695q qVar = (C86695q) ckVar2.f328076i.mo17428b();
        qVar.getClass();
        C85028a aVar2 = (C85028a) ckVar2.f328077j.mo17428b();
        aVar2.getClass();
        C68214a a4 = C68219e.m98518a(((C68226l) ckVar2.f328078k).f184585a);
        a4.getClass();
        C68214a a5 = C68219e.m98518a(((C68226l) ckVar2.f328079l).f184585a);
        a5.getClass();
        Optional optional = (Optional) ckVar2.f328080m.mo17428b();
        optional.getClass();
        C118174cj cjVar = r1;
        C118174cj cjVar2 = new C118174cj(jVar, context, a, gVar, wVar, jVar2, a2, a3, gVar2, qVar, aVar2, a4, a5, optional);
        this.f328046b = cjVar;
        this.f328047c = aVar;
    }

    @JavascriptInterface
    public void onJsEvents(String str, String str2) {
        C58976aa aaVar = C58975e.f156826a;
        JSONObject jSONObject = new JSONObject(str);
        jSONObject.put("TS", this.f328047c.mo26870b());
        jSONObject.put("SU", str2);
        C118174cj cjVar = this.f328046b;
        cjVar.f328062j.mo28207g("SrpJsEventHandler.handleEvents", new C118173ci(cjVar, jSONObject, this.f328045a));
    }
}
