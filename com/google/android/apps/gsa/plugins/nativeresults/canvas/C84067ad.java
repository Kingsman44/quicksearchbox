package com.google.android.apps.gsa.plugins.nativeresults.canvas;

import com.google.android.apps.gsa.search.shared.p6928f.C87545a;
import com.google.android.apps.gsa.search.shared.p6928f.C87546b;
import com.google.android.apps.gsa.search.shared.p6928f.C87552h;
import com.google.android.libraries.componentview.p1675a.C19739a;
import com.google.android.libraries.componentview.p1675a.p1676a.C19740a;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20546a;
import com.google.android.libraries.componentview.services.application.C20550ad;
import com.google.android.libraries.componentview.services.application.C20573b;
import com.google.android.libraries.componentview.services.application.C20589bp;
import com.google.android.libraries.componentview.services.application.C20593bt;
import com.google.common.p4522b.C58322at;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.ad */
/* compiled from: PG */
public final class C84067ad extends C87546b {

    /* renamed from: b */
    private static final C59071e f228962b = C59071e.m91332i("com.google.android.apps.gsa.plugins.nativeresults.canvas.ad");

    /* renamed from: a */
    public final C84154z f228963a;

    /* renamed from: c */
    private final C19739a f228964c;

    /* renamed from: d */
    private final C20546a f228965d;

    /* renamed from: e */
    private final C20573b f228966e;

    /* renamed from: f */
    private final C20550ad f228967f;

    public C84067ad(C19739a aVar, C84154z zVar, C20546a aVar2, C20550ad adVar, C20573b bVar) {
        this.f228964c = aVar;
        this.f228963a = zVar;
        this.f228965d = aVar2;
        this.f228967f = adVar;
        this.f228966e = bVar;
    }

    /* renamed from: a */
    public final C87545a mo77519a(byte[] bArr) {
        try {
            C62921ba b = this.f228964c.mo25093b();
            C19740a a = this.f228964c.mo25092a((C54201r) C62942bv.parseFrom((C62942bv) C54201r.f142243f, bArr, b));
            if (a != null) {
                this.f228965d.mo25476a();
                return new C84066ac(this, a);
            }
            throw new C87552h(new Exception("ComponentView did not create component for data"));
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f228962b.mo56225c()).mo56382g(e)).mo56372aa(7024)).mo56386p("COM proto parsing failed");
            throw new C87552h(e);
        }
    }

    /* renamed from: b */
    public final List mo77520b(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        try {
            C54201r rVar = (C54201r) C62942bv.parseFrom((C62942bv) C54201r.f142243f, bArr, this.f228964c.mo25093b());
            if (rVar.f142247c.size() != 0) {
                arrayList.addAll(this.f228964c.mo25094c(rVar.f142247c));
            }
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f228962b.mo56225c()).mo56382g(e)).mo56372aa(7025)).mo56386p("COM proto parsing failed");
        }
        return arrayList;
    }

    /* renamed from: c */
    public final void mo77521c(String str, C20593bt btVar) {
        C20550ad adVar = this.f228967f;
        if (adVar == null) {
            return;
        }
        if (adVar.f57722a.mo54919w(str)) {
            for (C20589bp k : ((C58322at) adVar.f57722a).mo54986h(str)) {
                k.mo25117k(btVar);
            }
            return;
        }
        C20520h.m38497b(5, "DefaultInteractionPerformer", (Throwable) null, "Cannot perform interaction on card with id " + str + " as it's not registered.", new Object[0]);
    }

    /* renamed from: d */
    public final void mo77522d() {
        this.f228964c.mo25095d();
        this.f228966e.mo25501e();
    }
}
