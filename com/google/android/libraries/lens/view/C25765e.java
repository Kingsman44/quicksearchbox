package com.google.android.libraries.lens.view;

import com.google.android.libraries.lens.view.gallery.p2110c.C26333a;
import com.google.android.libraries.lens.view.gallery.p2110c.C26334b;
import com.google.android.libraries.lens.view.p2078at.C25538u;
import com.google.android.libraries.lens.view.p2113h.p2122e.C26786ak;
import com.google.android.libraries.lens.view.p2113h.p2122e.C26787al;
import com.google.android.libraries.lens.view.p2113h.p2122e.C26788am;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.e */
/* compiled from: PG */
public final /* synthetic */ class C25765e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C25797f f70033a;

    public /* synthetic */ C25765e(C25797f fVar) {
        this.f70033a = fVar;
    }

    public final C60870cx apply(Object obj) {
        C25797f fVar = this.f70033a;
        Void voidR = (Void) obj;
        C25538u uVar = C25538u.LVF_STARTUP;
        int ordinal = fVar.f70081f.mo30590a().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw new AssertionError();
            } else if (fVar.f70083h || fVar.f70082g.mo33016a()) {
                C26334b bVar = (C26334b) fVar.f70078c.mo17428b();
                C60870cx d = bVar.f71587e.mo31597d();
                C26333a aVar = new C26333a(bVar);
                return C60922j.m93044g(d, C47810es.m84963c(aVar), bVar.f71586d);
            } else {
                ((C59052c) ((C59052c) C25797f.f70076a.mo56224b()).mo56372aa(48973)).mo56386p("Skips early gallery initialization: not onboarded");
                return C60866ct.f164955a;
            }
        } else if (fVar.f70082g.mo33016a()) {
            C26788am amVar = (C26788am) fVar.f70077b.mo17428b();
            String str = (String) amVar.f73040d.mo32701h().mo56111f();
            if (str == null || str.toLowerCase(Locale.ROOT).contains("camera")) {
                ((C58970a) ((C58970a) C26788am.f73037a.mo56224b()).mo56372aa(49181)).mo56389s("Skipping camera early start: callerPackage=%s", str);
                return C60866ct.f164955a;
            }
            C60870cx b = amVar.f73041e.mo19399b(C47810es.m84978r(new C26786ak(amVar)));
            C26787al alVar = new C26787al(amVar);
            return C60922j.m93044g(b, C47810es.m84963c(alVar), C60826bg.f164896a);
        } else {
            ((C59052c) ((C59052c) C25797f.f70076a.mo56224b()).mo56372aa(48972)).mo56386p("Skips early camera initialization: not onboarded");
            return C60866ct.f164955a;
        }
    }
}
