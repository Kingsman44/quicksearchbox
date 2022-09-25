package com.google.android.libraries.search.assistant.invocation.p2651n.p2653b;

import android.os.Bundle;
import com.google.android.libraries.search.assistant.invocation.p2651n.p2652a.C33975b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Duration;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.n.b.f */
/* compiled from: PG */
public final class C33982f implements C33975b {

    /* renamed from: a */
    private static final C59071e f90602a = C59071e.m91331h();

    /* renamed from: b */
    private static final String f90603b = "show_global_actions";

    /* renamed from: c */
    private static final String f90604c = "action";

    /* renamed from: d */
    private static final Bundle f90605d;

    /* renamed from: e */
    private static final String f90606e = "go_back";

    /* renamed from: f */
    private final C33981e f90607f;

    static {
        Bundle bundle = new Bundle();
        bundle.putString("action", "show_global_actions");
        f90605d = bundle;
        Duration.ofMillis(500);
        new Bundle().putString("action", "go_back");
    }

    public C33982f(C33981e eVar) {
        this.f90607f = eVar;
    }

    /* renamed from: a */
    public final C60870cx mo39172a() {
        C59052c cVar = (C59052c) f90602a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "INV.SystemUI");
        cVar.mo56379ah(new C59094n(51320));
        cVar.mo56386p("showGlobalPowerMenu");
        C33981e eVar = this.f90607f;
        Bundle bundle = f90605d;
        C69664n.m101061g(bundle, "hints");
        C59052c cVar2 = (C59052c) C33981e.f90599a.mo56224b();
        cVar2.mo56378ag(C58975e.f156826a, "INV.SystemUI");
        cVar2.mo56379ah(new C59094n(51319));
        cVar2.mo56389s("setUiHints(hints = %s)", bundle);
        return C71663i.m104692e(eVar.f90601c, (C71424ay) null, new C33980d(eVar, bundle, (C69577g) null), 3);
    }
}
