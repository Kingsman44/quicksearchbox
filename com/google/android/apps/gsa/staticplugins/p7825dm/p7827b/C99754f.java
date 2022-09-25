package com.google.android.apps.gsa.staticplugins.p7825dm.p7827b;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import androidx.mediarouter.p175a.C3685au;
import androidx.mediarouter.p175a.C3687aw;
import androidx.mediarouter.p175a.C3752y;
import androidx.mediarouter.p175a.C3753z;
import com.google.android.apps.gsa.search.core.p6500ac.C84397a;
import com.google.android.apps.gsa.search.core.p6500ac.C84398b;
import com.google.android.apps.gsa.search.core.p6500ac.C84399c;
import com.google.android.apps.gsa.search.core.p6500ac.C84400d;
import com.google.android.apps.gsa.search.core.p6500ac.C84406j;
import com.google.android.apps.gsa.search.core.p6500ac.C84410n;
import com.google.android.apps.gsa.search.core.p6500ac.C84411o;
import com.google.android.apps.gsa.search.shared.p6929g.C87556d;
import com.google.android.apps.gsa.shared.p7030bj.C89688a;
import com.google.android.gms.cast.C143606o;
import com.google.android.gms.cast.CastDevice;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4283bv.p4412k.p4414b.C57837a;
import com.google.p4283bv.p4412k.p4414b.C57838b;
import com.google.p4283bv.p4412k.p4414b.C57839c;
import com.google.p4283bv.p4412k.p4414b.C57840d;
import com.google.p4283bv.p4412k.p4414b.C57841e;
import com.google.p4283bv.p4412k.p4414b.C57842f;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.dm.b.f */
/* compiled from: PG */
public final class C99754f {

    /* renamed from: e */
    private static final C59071e f279122e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.dm.b.f");

    /* renamed from: a */
    final C3687aw f279123a;

    /* renamed from: b */
    C99753e f279124b;

    /* renamed from: c */
    boolean f279125c;

    /* renamed from: d */
    C57840d f279126d = C57840d.f154539b;

    /* renamed from: f */
    private final C89688a f279127f;

    /* renamed from: g */
    private final C22871g f279128g;

    /* renamed from: h */
    private final C84411o f279129h;

    /* renamed from: i */
    private final C84400d f279130i;

    /* renamed from: j */
    private final Map f279131j;

    public C99754f(C89688a aVar, Context context, C22871g gVar, C84411o oVar, C84400d dVar) {
        this.f279127f = aVar;
        this.f279128g = gVar;
        this.f279129h = oVar;
        this.f279130i = dVar;
        this.f279123a = C3687aw.m10683e(context);
        this.f279131j = new HashMap();
    }

    /* renamed from: a */
    public final void mo91581a(C84399c cVar) {
        String str;
        HashSet hashSet = new HashSet();
        C57839c cVar2 = (C57839c) C57840d.f154539b.createBuilder();
        for (C3685au auVar : this.f279123a.mo7772g()) {
            Bundle bundle = auVar.f11876p;
            if (bundle != null) {
                CastDevice a = CastDevice.m232553a(bundle);
                if (!auVar.equals(this.f279123a.mo7769c()) && a != null && (str = a.f388614p) != null && !hashSet.contains(str)) {
                    hashSet.add(str);
                    C57837a aVar = (C57837a) C57838b.f154532f.createBuilder();
                    aVar.copyOnWrite();
                    ((C57838b) aVar.instance).f154534a = str;
                    if (!this.f279131j.isEmpty()) {
                        C57841e eVar = (C57841e) C57842f.f154542b.createBuilder();
                        for (String str2 : this.f279131j.keySet()) {
                            if (auVar.mo7766m("android.media.intent.category.REMOTE_PLAYBACK") && auVar.mo7765l((C3753z) this.f279131j.get(str2))) {
                                eVar.copyOnWrite();
                                C57842f fVar = (C57842f) eVar.instance;
                                str2.getClass();
                                C62971cq cqVar = fVar.f154544a;
                                if (!cqVar.mo58948c()) {
                                    fVar.f154544a = C62942bv.mutableCopy(cqVar);
                                }
                                fVar.f154544a.add(str2);
                            }
                        }
                        if (((C57842f) eVar.build()).f154544a.size() != 0) {
                            C57842f fVar2 = (C57842f) eVar.build();
                            aVar.copyOnWrite();
                            fVar2.getClass();
                            ((C57838b) aVar.instance).f154538e = fVar2;
                        }
                    }
                    String str3 = auVar.f11865e;
                    if (str3 != null) {
                        aVar.copyOnWrite();
                        ((C57838b) aVar.instance).f154535b = str3;
                    }
                    String str4 = auVar.f11864d;
                    if (str4 != null) {
                        aVar.copyOnWrite();
                        ((C57838b) aVar.instance).f154537d = str4;
                    }
                    Uri uri = auVar.f11866f;
                    if (uri != null) {
                        aVar.copyOnWrite();
                        ((C57838b) aVar.instance).f154536c = uri.toString();
                    }
                    C57838b bVar = (C57838b) aVar.build();
                    cVar2.copyOnWrite();
                    C57840d dVar = (C57840d) cVar2.instance;
                    bVar.getClass();
                    C62971cq cqVar2 = dVar.f154541a;
                    if (!cqVar2.mo58948c()) {
                        dVar.f154541a = C62942bv.mutableCopy(cqVar2);
                    }
                    dVar.f154541a.add(bVar);
                }
            }
        }
        C57840d dVar2 = (C57840d) cVar2.build();
        this.f279126d = dVar2;
        cVar.f229663c.mo28212l("invokeCallback", new C84398b(cVar, cVar.f229661a.replace("@{result}", C84406j.m134709a(C87556d.m142213b(dVar2)))));
    }

    @JavascriptInterface
    public void getDeviceList(String str, String str2) {
        this.f279128g.mo28212l("getDeviceList", new C99751c(this, this.f279129h.mo77963a(str, str2, this.f279127f)));
    }

    @JavascriptInterface
    public void startDiscoverList(String str, String str2, String str3) {
        C84410n a = this.f279129h.mo77963a(str2, str3, this.f279127f);
        C84399c a2 = this.f279130i.mo77955a(str, this.f279127f);
        C3752y yVar = new C3752y();
        yVar.mo7923c("com.google.android.gms.cast.CATEGORY_CAST");
        yVar.mo7923c("android.media.intent.category.REMOTE_PLAYBACK");
        C3753z a3 = yVar.mo7921a();
        try {
            synchronized (this) {
                this.f279128g.mo28212l("startDiscoverList", new C99749a(this, a2, a3, a));
            }
        } catch (RuntimeException e) {
            a.mo77959a(e);
        }
    }

    @JavascriptInterface
    public void startDiscoverListWithAppIdList(String str, String str2, String str3, String str4) {
        C3752y yVar = new C3752y();
        yVar.mo7923c("com.google.android.gms.cast.CATEGORY_CAST");
        yVar.mo7923c("android.media.intent.category.REMOTE_PLAYBACK");
        C84410n a = this.f279129h.mo77963a(str3, str4, this.f279127f);
        C84399c a2 = this.f279130i.mo77955a(str2, this.f279127f);
        try {
            C57842f fVar = (C57842f) C87556d.m142212a(str, C57842f.f154542b.getParserForType());
            synchronized (this.f279131j) {
                this.f279131j.clear();
                for (String str5 : fVar.f154544a) {
                    C3752y yVar2 = new C3752y();
                    yVar2.mo7923c(C143606o.m233298a(str5));
                    C3753z a3 = yVar2.mo7921a();
                    this.f279131j.put(str5, a3);
                    yVar.mo7924d(a3);
                }
            }
            try {
                synchronized (this) {
                    this.f279128g.mo28212l("startDiscoverList", new C99752d(this, a2, yVar, a));
                }
            } catch (RuntimeException e) {
                a.mo77959a(e);
            }
        } catch (C62974ct | IllegalArgumentException unused) {
            ((C59052c) ((C59052c) f279122e.mo56225c()).mo56372aa(32873)).mo56386p("Could not parse list while setting app ID list");
            a.mo77959a(new C84397a());
        }
    }

    @JavascriptInterface
    public void stopDiscoverList(String str, String str2) {
        C84410n a = this.f279129h.mo77963a(str, str2, this.f279127f);
        synchronized (this) {
            this.f279128g.mo28212l("stopDiscovery", new C99750b(this, a));
        }
    }
}
