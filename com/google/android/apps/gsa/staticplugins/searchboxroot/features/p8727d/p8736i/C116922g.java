package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.p8736i;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a.C88552c;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89204i;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59326i;
import com.google.p395al.p417d.p418a.C8575bc;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protos.p4932ax.C64260a;
import com.google.protos.p4932ax.C64270b;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.i.g */
/* compiled from: PG */
public final class C116922g implements C88552c, C89204i {

    /* renamed from: a */
    private static final C59071e f324622a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.i.g");

    /* renamed from: b */
    private final C86124t f324623b;

    /* renamed from: c */
    private final C116920e f324624c;

    /* renamed from: d */
    private boolean f324625d = true;

    public C116922g(C86124t tVar, C116920e eVar) {
        this.f324623b = tVar;
        this.f324624c = eVar;
    }

    /* renamed from: a */
    private final void m194290a(C88616t tVar) {
        String str;
        C8575bc a = this.f324624c.mo103057a(tVar.f239556a);
        if (a == null || a.f29694c.isEmpty()) {
            tVar.f239561f.putBoolean("cs::on_focus", false);
            tVar.f239561f.putBoolean("cs::on_focus_fallback", true);
        }
        tVar.f239562g.mo55429h("sugexp", "foo,onf=1");
        if (!this.f324623b.mo79746e(C90085ej.f250119W)) {
            str = a == null ? BuildConfig.FLAVOR : a.f29695d;
        } else {
            C64260a aVar = (C64260a) C64270b.f173770c.createBuilder();
            if (a != null) {
                try {
                    aVar.mergeFrom(C59326i.f157517e.mo56826f().mo56836k(a.f29695d), C62921ba.m95368a());
                } catch (C62974ct | IllegalArgumentException e) {
                    C59104x b = f324622a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "sb.r.OnFocusRequestAdvisor");
                    ((C59052c) ((C59052c) ((C59052c) b).mo56382g(e)).mo56372aa(32508)).mo56386p("SERP on-focus token parsing failed.");
                }
            }
            aVar.copyOnWrite();
            C64270b bVar = (C64270b) aVar.instance;
            bVar.f173772a |= 1;
            bVar.f173773b = true;
            C59326i f = C59326i.f157517e.mo56826f();
            byte[] byteArray = ((C64270b) aVar.build()).toByteArray();
            str = f.mo56837l(byteArray, byteArray.length);
        }
        if (!str.isEmpty()) {
            tVar.f239562g.mo55429h("ofp", str);
        }
    }

    /* renamed from: c */
    public final int mo82214c(C88616t tVar) {
        String bk = tVar.f239556a.mo84352bk();
        if (this.f324623b.mo79746e(C90085ej.f250117U) && !bk.isEmpty() && tVar.f239561f.getBoolean("cs::on_focus")) {
            if (tVar.f239561f.getBoolean("cs::on_focus_prefetch")) {
                m194290a(tVar);
                return 1;
            }
            if (!this.f324625d || !"web".equals(tVar.f239558c) || tVar.f239557b != 1) {
                tVar.f239561f.putBoolean("cs::on_focus", false);
            } else {
                m194290a(tVar);
            }
            this.f324625d = false;
        }
        return 1;
    }

    /* renamed from: hE */
    public final void mo78006hE() {
        this.f324625d = true;
    }
}
