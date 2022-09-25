package com.google.android.apps.gsa.staticplugins.opa.morris2;

import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14115ap;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59710cy;
import com.google.common.p4552o.C59711cz;
import com.google.common.util.concurrent.C60845bz;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.l */
/* compiled from: PG */
final class C109709l implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C109710m f305619a;

    public C109709l(C109710m mVar) {
        this.f305619a = mVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C109710m.f305620a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.MiniCtrlImpl");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(24744)).mo56386p("Failed to poll foreground app");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        String str = (String) obj;
        if (str != null) {
            C109710m mVar = this.f305619a;
            if (mVar.f305647v != null && !mVar.f305646u.contains(str)) {
                C109710m mVar2 = this.f305619a;
                if (!mVar2.f305646u.contains(mVar2.f305647v)) {
                    C59104x d = C109710m.f305620a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "Morris.MiniCtrlImpl");
                    ((C59052c) ((C59052c) d).mo56372aa(24745)).mo56389s("#onForegroundAppPoll(): %s is not an allowed host app.", str);
                    this.f305619a.mo98040p();
                    C14115ap apVar = this.f305619a.f305633h;
                    C37258g gVar = C37182a.f98084fy;
                    C62940bt btVar = C59711cz.f160208s;
                    C59710cy cyVar = (C59710cy) C59711cz.f160207r.createBuilder();
                    cyVar.copyOnWrite();
                    C59711cz czVar = (C59711cz) cyVar.instance;
                    czVar.f160210a |= 2048;
                    czVar.f160221l = str;
                    C37252a e = gVar.mo40812e(btVar, (C59711cz) cyVar.build());
                    e.mo40787k();
                    apVar.mo21431e(e);
                    this.f305619a.mo98036k(str);
                }
            }
        }
        this.f305619a.f305647v = str;
    }
}
