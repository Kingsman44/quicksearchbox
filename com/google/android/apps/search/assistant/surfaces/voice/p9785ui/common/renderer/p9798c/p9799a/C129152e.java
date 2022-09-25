package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9798c.p9799a;

import com.google.android.libraries.assistant.p1363c.p1386e.p1393b.C17269a;
import com.google.android.libraries.home.coreui.devicetile.C23655aa;
import com.google.android.libraries.home.coreui.devicetile.C23659ae;
import com.google.android.libraries.home.coreui.devicetile.model.C23739n;
import com.google.android.libraries.home.coreui.devicetile.model.C23749x;
import com.google.android.libraries.home.coreui.devicetile.model.Control;
import com.google.android.libraries.home.p1940a.p1941a.C23347d;
import com.google.android.libraries.home.p1940a.p1943c.C23415ar;
import com.google.android.libraries.home.p1940a.p1943c.C23544dr;
import com.google.android.libraries.home.p1948c.p1949a.C23621c;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.Map;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.c.a.e */
/* compiled from: PG */
public final class C129152e implements C23655aa {

    /* renamed from: a */
    public static final C59071e f354781a = C59071e.m91331h();

    /* renamed from: b */
    public final C17269a f354782b;

    /* renamed from: c */
    public final C71422aw f354783c;

    /* renamed from: d */
    public final C23347d f354784d;

    /* renamed from: e */
    public Map f354785e;

    /* renamed from: f */
    private final C60887da f354786f;

    /* renamed from: g */
    private final C46778cv f354787g;

    public C129152e(C17269a aVar, C60887da daVar, C71422aw awVar, C23347d dVar, C46778cv cvVar, Map map) {
        C69664n.m101061g(daVar, "lightweightExecutor");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(cvVar, "resultPropagator");
        this.f354782b = aVar;
        this.f354786f = daVar;
        this.f354783c = awVar;
        this.f354784d = dVar;
        this.f354787g = cvVar;
        this.f354785e = map;
    }

    /* renamed from: b */
    public final /* synthetic */ boolean mo28999b() {
        return true;
    }

    /* renamed from: d */
    public final void mo29000d(Control control, C23739n nVar, C23659ae aeVar) {
        C69664n.m101061g(control, "control");
        if (!(nVar instanceof C23749x)) {
            C23544dr a = C23621c.m44098a(nVar);
            if (a == null) {
                C59052c cVar = (C59052c) f354781a.mo56225c();
                String simpleName = nVar.getClass().getSimpleName();
                String a2 = nVar.mo29075a();
                cVar.mo56379ah(new C59094n(38232));
                cVar.mo56354G("Unsupported combination of action %s and trait %s", simpleName, a2);
                return;
            }
            C60870cx e = C71663i.m104692e(this.f354783c, (C71424ay) null, new C129151d(this, new C23415ar(control.f64883a, new C58759qy(a)), (C69577g) null), 3);
            this.f354787g.mo50787a(e, C129154g.f354788a);
            C129150c cVar2 = new C129150c(aeVar);
            C60856cj.m92911t(e, C47810es.m84974n(cVar2), this.f354786f);
        }
    }
}
