package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3066d;

import android.os.RemoteException;
import androidx.p104d.p105a.C2164c;
import com.google.android.hotword.service.C146591i;
import com.google.android.hotword.service.HotwordInformation;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.n.c.a.d.f */
/* compiled from: PG */
public final /* synthetic */ class C39491f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C39492g f104008a;

    /* renamed from: b */
    public final /* synthetic */ C146591i f104009b;

    public /* synthetic */ C39491f(C39492g gVar, C146591i iVar) {
        this.f104008a = gVar;
        this.f104009b = iVar;
    }

    public final void run() {
        C39492g gVar = this.f104008a;
        C146591i iVar = this.f104009b;
        C59104x b = C39493h.f104012a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HotwordInfoProvider");
        ((C59052c) ((C59052c) b).mo56372aa(53674)).mo56386p("Handing HotwordService connection in executor.");
        try {
            C39489d dVar = gVar.f104010a;
            HotwordInformation a = iVar.mo123389a();
            C59104x b2 = C39493h.f104012a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "HotwordInfoProvider");
            ((C59052c) ((C59052c) b2).mo56372aa(53670)).mo56386p("HotwordInformation fetch will try to save hotword model.");
            dVar.f104005b.mo41863b();
            String str = a.f395886g;
            if (str != null) {
                C39493h hVar = dVar.f104005b;
                C2164c cVar = dVar.f104004a;
                C39487b bVar = new C39487b(hVar, str);
                C60870cx m = C60856cj.m92904m(C47810es.m84978r(bVar), hVar.f104015d);
                C60845bz n = C47810es.m84974n(new C39490e(a, cVar));
                C60856cj.m92911t(m, C47810es.m84974n(n), hVar.f104016e);
            } else {
                C59104x c = C39493h.f104012a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "HotwordInfoProvider");
                ((C59052c) ((C59052c) c).mo56372aa(53671)).mo56358K("Hotword model location is null, isAlwaysOnEnabled : %b, isFromAnyScreenEnabled : %b", !a.f395883d, !a.f395885f);
                dVar.f104004a.mo5437b(a);
            }
            C59104x b3 = C39493h.f104012a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "HotwordInfoProvider");
            ((C59052c) ((C59052c) b3).mo56372aa(53675)).mo56386p("onSuccess getHotwordInformation");
        } catch (RemoteException e) {
            C59104x c2 = C39493h.f104012a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "HotwordInfoProvider");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(53676)).mo56386p("onFailure getHotwordInformation");
            C39489d dVar2 = gVar.f104010a;
            C59104x c3 = C39493h.f104012a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "HotwordInfoProvider");
            ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e)).mo56372aa(53669)).mo56386p("#getHotwordInformation failed");
            dVar2.f104005b.mo41863b();
            dVar2.f104004a.mo5439d(e);
        }
    }
}
