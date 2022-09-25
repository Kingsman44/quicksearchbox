package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33108d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33110f;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33119g;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x;
import com.google.android.libraries.search.assistant.p2828y.p2845h.p2847b.C36972g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3902c.p3907c.C50931ac;
import com.google.assistant.p3897e.p3902c.p3907c.C50936ah;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52475tc;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51950fc;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.ax */
/* compiled from: PG */
public final class C33079ax implements C33110f {

    /* renamed from: a */
    public static final C59071e f88551a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.ax");

    /* renamed from: b */
    public static final C58528ij f88552b = C58528ij.m90011K("ui.SHOW_TEXT", "ui.SHOW_NATIVE_FORM");

    /* renamed from: c */
    public C51953ff f88553c;

    /* renamed from: d */
    public C52507uh f88554d;

    /* renamed from: e */
    public C51950fc f88555e = C51950fc.FORM_UI_THEME_DEFAULT;

    /* renamed from: f */
    private final PackageManager f88556f;

    /* renamed from: g */
    private final C60887da f88557g;

    /* renamed from: h */
    private final C36972g f88558h;

    public C33079ax(C36972g gVar, PackageManager packageManager, C60887da daVar) {
        this.f88558h = gVar;
        this.f88556f = packageManager;
        this.f88557g = daVar;
        this.f88553c = C51953ff.f136315l;
        this.f88554d = C52507uh.f137838b;
    }

    /* renamed from: a */
    public final C60870cx mo38501a(Context context, C51953ff ffVar, C52507uh uhVar, Optional optional, C33108d dVar) {
        C60870cx cxVar;
        C50936ah ahVar;
        C60870cx cxVar2;
        C50936ah ahVar2;
        if (uhVar.f137840a.size() != 1) {
            return C60856cj.m92900i(Optional.empty());
        }
        this.f88553c = ffVar;
        this.f88554d = uhVar;
        dVar.mo38533b().mo38550c(7);
        C51950fc a = C51950fc.m86447a(ffVar.f136324h);
        if (a == null) {
            a = C51950fc.FORM_UI_THEME_DEFAULT;
        }
        this.f88555e = a;
        C52091ex c = dVar.mo38534c();
        C52490tr trVar = (C52490tr) C58557jl.m90133n(this.f88554d.f137840a);
        if (trVar.f137798b == 9 && (trVar.f137797a & 1) != 0 && ((C52475tc) trVar.f137799c).f137747b) {
            Optional g = C33136x.m61490g(trVar.f137800d, this.f88553c);
            if (g.isPresent() && ((C51941eu) g.get()).f136277e == 17) {
                C51941eu euVar = (C51941eu) g.get();
                if (euVar.f136277e == 17) {
                    ahVar = (C50936ah) euVar.f136278f;
                } else {
                    ahVar = C50936ah.f132593m;
                }
                C50931ac a2 = C50931ac.m85981a(ahVar.f132602h);
                if (a2 == null) {
                    a2 = C50931ac.DEFAULT;
                }
                if (a2 == C50931ac.CONFIRM) {
                    C52091ex a3 = C33119g.m61465a(c);
                    C51953ff ffVar2 = this.f88553c;
                    Optional g2 = C33136x.m61490g("clock_app_picker_field", ffVar2);
                    if (!g2.isPresent() || ((C51941eu) g2.get()).f136277e != 17) {
                        ((C59052c) ((C59052c) f88551a.mo56224b()).mo56372aa(50902)).mo56386p("getSelectedAppIconIdentifier: ClockAppPickerField is absent.");
                        cxVar2 = C33094p.m61395b(this.f88556f, new Intent("android.intent.action.SET_TIMER"), this.f88558h.mo40496b(), this.f88557g);
                    } else {
                        C51941eu euVar2 = (C51941eu) g2.get();
                        if (euVar2.f136277e == 17) {
                            ahVar2 = (C50936ah) euVar2.f136278f;
                        } else {
                            ahVar2 = C50936ah.f132593m;
                        }
                        C51012dc dcVar = ahVar2.f132601g;
                        if (dcVar == null) {
                            dcVar = C51012dc.f132813k;
                        }
                        String str = dcVar.f132821g;
                        if (str.isEmpty()) {
                            cxVar2 = C60856cj.m92900i(Optional.empty());
                        } else {
                            cxVar2 = C60856cj.m92900i(Optional.m71637of(str));
                        }
                    }
                    C33075at atVar = new C33075at(ffVar2);
                    C60870cx g3 = C60922j.m93044g(cxVar2, C47810es.m84963c(atVar), this.f88557g);
                    C33074as asVar = new C33074as(this, a3, context);
                    cxVar = C60922j.m93044g(g3, C47810es.m84963c(asVar), this.f88557g);
                    C33076au auVar = new C33076au(this, c, trVar, context, optional);
                    C60870cx g4 = C60922j.m93044g(cxVar, C47810es.m84963c(auVar), this.f88557g);
                    C33077av avVar = new C33077av(this, dVar);
                    return C60922j.m93044g(g4, C47810es.m84963c(avVar), this.f88557g);
                }
            }
        }
        cxVar = C60856cj.m92900i(Optional.empty());
        C33076au auVar2 = new C33076au(this, c, trVar, context, optional);
        C60870cx g42 = C60922j.m93044g(cxVar, C47810es.m84963c(auVar2), this.f88557g);
        C33077av avVar2 = new C33077av(this, dVar);
        return C60922j.m93044g(g42, C47810es.m84963c(avVar2), this.f88557g);
    }

    /* renamed from: b */
    public final void mo38511b(String str) {
        C60870cx d = this.f88558h.mo40498d(str);
        C33078aw awVar = new C33078aw();
        C60856cj.m92911t(d, C47810es.m84974n(awVar), C60826bg.f164896a);
    }
}
