package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.libraries.assistant.assistantactions.p620b.C11054a;
import com.google.android.libraries.assistant.assistantactions.p621c.p622a.C11059d;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p627d.C11203a;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p627d.C11204b;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11207b;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11210e;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q;
import com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11228a;
import com.google.assistant.p3897e.p3902c.p3907c.C50931ac;
import com.google.assistant.p3897e.p3902c.p3907c.C50936ah;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52475tc;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52492tt;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51936ep;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51950fc;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.c.bn */
/* compiled from: PG */
public final class C11178bn implements C11204b {

    /* renamed from: a */
    public static final C59071e f36558a = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.c.b.c.bn");

    /* renamed from: b */
    public static final C58528ij f36559b = C58528ij.m90011K("ui.SHOW_TEXT", "ui.SHOW_NATIVE_FORM");

    /* renamed from: c */
    C51953ff f36560c;

    /* renamed from: d */
    C52507uh f36561d;

    /* renamed from: e */
    final C11059d f36562e;

    /* renamed from: f */
    final PackageManager f36563f;

    /* renamed from: g */
    final C60887da f36564g;

    /* renamed from: h */
    public C51950fc f36565h = C51950fc.FORM_UI_THEME_DEFAULT;

    /* renamed from: i */
    public final C11228a f36566i;

    public C11178bn(C11059d dVar, PackageManager packageManager, C11228a aVar, C60887da daVar) {
        this.f36562e = dVar;
        this.f36563f = packageManager;
        this.f36566i = aVar;
        this.f36564g = daVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C58833ax mo19603a(Context context, C52081en enVar, C11054a aVar) {
        return C58836b.f156633a;
    }

    /* renamed from: b */
    public final void mo19613b(String str) {
        C60856cj.m92911t(this.f36562e.mo19527a("fluid_actions_timer_preferred_app_package_name", str), new C11177bm(), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo19605d(Context context, C52081en enVar, C11054a aVar) {
        C60870cx cxVar;
        C50936ah ahVar;
        C60870cx cxVar2;
        C50936ah ahVar2;
        C58833ax b = C11207b.m26563b(enVar);
        if (!b.mo56113h()) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        C58833ax a = C11207b.m26562a((C51805du) b.mo56107c());
        if (!a.mo56113h() || (((C52492tt) a.mo56107c()).f137805a & 1) == 0 || (((C52492tt) a.mo56107c()).f137805a & 2) == 0) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        C51953ff ffVar = ((C52492tt) a.mo56107c()).f137806b;
        if (ffVar == null) {
            ffVar = C51953ff.f136315l;
        }
        this.f36560c = ffVar;
        C52507uh uhVar = ((C52492tt) a.mo56107c()).f137807c;
        if (uhVar == null) {
            uhVar = C52507uh.f137838b;
        }
        this.f36561d = uhVar;
        C51936ep a2 = C51936ep.m86435a(this.f36560c.f136323g);
        if (a2 == null) {
            a2 = C51936ep.DEFAULT;
        }
        if (a2 != C51936ep.TIMER) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        if (this.f36561d.f137840a.size() != 1) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        this.f36566i.mo19656z();
        C51950fc a3 = C51950fc.m86447a(this.f36560c.f136324h);
        if (a3 == null) {
            a3 = C51950fc.FORM_UI_THEME_DEFAULT;
        }
        this.f36565h = a3;
        C51805du duVar = (C51805du) b.mo56107c();
        C52490tr trVar = (C52490tr) C58557jl.m90133n(this.f36561d.f137840a);
        C52091ex exVar = enVar.f136685e;
        if (exVar == null) {
            exVar = C52091ex.f136710b;
        }
        if (trVar.f137798b == 9 && (trVar.f137797a & 1) != 0 && ((C52475tc) trVar.f137799c).f137747b) {
            C58833ax g = C11222q.m26610g(trVar.f137800d, this.f36560c);
            if (g.mo56113h() && ((C51941eu) g.mo56107c()).f136277e == 17) {
                C51941eu euVar = (C51941eu) g.mo56107c();
                if (euVar.f136277e == 17) {
                    ahVar = (C50936ah) euVar.f136278f;
                } else {
                    ahVar = C50936ah.f132593m;
                }
                C50931ac a4 = C50931ac.m85981a(ahVar.f132602h);
                if (a4 == null) {
                    a4 = C50931ac.DEFAULT;
                }
                if (a4 == C50931ac.CONFIRM) {
                    C52091ex a5 = C11210e.m26589a(exVar);
                    C51953ff ffVar2 = this.f36560c;
                    C58833ax g2 = C11222q.m26610g("clock_app_picker_field", ffVar2);
                    if (!g2.mo56113h() || ((C51941eu) g2.mo56107c()).f136277e != 17) {
                        ((C59052c) ((C59052c) f36558a.mo56224b()).mo56372aa(43125)).mo56386p("getSelectedAppIconIdentifier: ClockAppPickerField is absent.");
                        cxVar2 = C11185i.m26511b(this.f36563f, new Intent("android.intent.action.SET_TIMER"), this.f36562e, "fluid_actions_timer_preferred_app_package_name", this.f36564g);
                    } else {
                        C51941eu euVar2 = (C51941eu) g2.mo56107c();
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
                            cxVar2 = C60856cj.m92900i(C58836b.f156633a);
                        } else {
                            cxVar2 = C60856cj.m92900i(C58833ax.m90834k(str));
                        }
                    }
                    cxVar = C60922j.m93044g(C60922j.m93044g(cxVar2, new C11174bj(ffVar2), this.f36564g), new C11173bi(this, a5, context), this.f36564g);
                    return C60922j.m93044g(C60922j.m93044g(cxVar, new C11175bk(this, enVar, trVar, context, duVar), this.f36564g), new C11176bl(this), this.f36564g);
                }
            }
        }
        cxVar = C60856cj.m92900i(C58836b.f156633a);
        return C60922j.m93044g(C60922j.m93044g(cxVar, new C11175bk(this, enVar, trVar, context, duVar), this.f36564g), new C11176bl(this), this.f36564g);
    }

    /* renamed from: e */
    public final /* synthetic */ C60870cx mo19606e(Context context, C51953ff ffVar, C52507uh uhVar, C52091ex exVar, C11054a aVar) {
        return C11203a.m26544b(this, context, ffVar, uhVar, exVar);
    }

    /* renamed from: f */
    public final /* synthetic */ C58833ax mo19607f(Context context, C51953ff ffVar, C52507uh uhVar, C52091ex exVar) {
        return C58836b.f156633a;
    }
}
