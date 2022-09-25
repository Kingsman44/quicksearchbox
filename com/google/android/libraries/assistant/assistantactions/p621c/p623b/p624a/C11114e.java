package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import android.content.Context;
import com.google.android.libraries.assistant.assistantactions.p620b.C11054a;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p627d.C11203a;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p627d.C11204b;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11208c;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11212g;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q;
import com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11228a;
import com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11241b;
import com.google.android.libraries.assistant.assistantactions.p633d.C11270g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3902c.p3907c.C50931ac;
import com.google.assistant.p3897e.p3902c.p3907c.C50936ah;
import com.google.assistant.p3897e.p3902c.p3907c.C50969bn;
import com.google.assistant.p3897e.p3917i.p3918a.C51401gi;
import com.google.assistant.p3897e.p3917i.p3918a.C51406gn;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52475tc;
import com.google.assistant.p3897e.p3921j.C52479tg;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51936ep;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51950fc;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.assistant.p3897e.p3921j.p3926e.C51995gu;
import com.google.assistant.p3897e.p3921j.p3926e.C52003hb;
import com.google.assistant.p3897e.p3921j.p3926e.C52056o;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58331bb;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58733pz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.e */
/* compiled from: PG */
public final class C11114e implements C11204b {

    /* renamed from: a */
    public static final C58528ij f36421a = C58528ij.m90011K("ui.SHOW_TEXT", "ui.SHOW_NATIVE_FORM");

    /* renamed from: b */
    public C51950fc f36422b = C51950fc.FORM_UI_THEME_DEFAULT;

    /* renamed from: c */
    C51953ff f36423c;

    /* renamed from: d */
    C52507uh f36424d;

    /* renamed from: e */
    Context f36425e;

    /* renamed from: f */
    public C11073ai f36426f;

    /* renamed from: g */
    public C11078an f36427g;

    /* renamed from: h */
    final C11241b f36428h;

    /* renamed from: i */
    final C21370a f36429i;

    /* renamed from: j */
    private boolean f36430j = false;

    /* renamed from: k */
    private C11054a f36431k;

    /* renamed from: l */
    private final C60887da f36432l;

    /* renamed from: m */
    private final C11228a f36433m;

    /* renamed from: n */
    private final C11270g f36434n;

    public C11114e(C60887da daVar, C11241b bVar, C11228a aVar, C21370a aVar2, C11270g gVar) {
        this.f36432l = daVar;
        this.f36428h = bVar;
        this.f36433m = aVar;
        this.f36429i = aVar2;
        this.f36434n = gVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C58833ax mo19603a(Context context, C52081en enVar, C11054a aVar) {
        return C58836b.f156633a;
    }

    /* renamed from: b */
    public final C58833ax mo19608b() {
        C11078an anVar;
        C58833ax axVar;
        if (this.f36431k == null || this.f36423c == null || this.f36424d == null || (anVar = this.f36427g) == null || this.f36426f == null || this.f36425e == null) {
            return C58836b.f156633a;
        }
        anVar.mo19558D(C51401gi.FULFILLMENT);
        C58331bb bbVar = new C58331bb();
        C58833ax c = mo19609c();
        if (c.mo56113h()) {
            bbVar.mo54920x(0, (C51809dy) c.mo56107c());
        }
        if (!this.f36430j || this.f36422b == C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY) {
            C58833ax c2 = C11118i.m26418c(this.f36425e, this.f36423c, this.f36427g, this.f36426f);
            if (c2.mo56113h()) {
                bbVar.mo54920x(0, (C51809dy) c2.mo56107c());
            }
        }
        bbVar.mo54920x(0, C11209d.m26577g(C52056o.f136624a));
        if (C11115f.m26413j(this.f36427g)) {
            axVar = this.f36427g.mo19595z();
        } else {
            axVar = this.f36427g.mo19573d();
        }
        if (axVar.mo56113h()) {
            C11212g.m26597a(this.f36434n, this.f36431k, ((C51809dy) axVar.mo56107c()).f135936b);
            bbVar.mo54920x(1, (C51809dy) axVar.mo56107c());
        }
        bbVar.mo54920x(2, C11209d.m26576f());
        return C58833ax.m90834k(C11208c.m26565a(bbVar, this.f36426f.mo19552a()));
    }

    /* renamed from: c */
    public final C58833ax mo19609c() {
        C11073ai aiVar = this.f36426f;
        if (aiVar != null && aiVar.f36352c.mo56113h()) {
            C58833ax e = C11118i.m26420e((C51406gn) this.f36426f.f36352c.mo56107c());
            if (e.mo56113h()) {
                C51995gu guVar = (C51995gu) C52003hb.f136476i.createBuilder();
                String str = (String) e.mo56107c();
                guVar.copyOnWrite();
                C52003hb hbVar = (C52003hb) guVar.instance;
                str.getClass();
                hbVar.f136478a |= 1;
                hbVar.f136479b = str;
                return C58833ax.m90834k(C11209d.m26582l((C52003hb) guVar.build()));
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: d */
    public final /* synthetic */ C60870cx mo19605d(Context context, C52081en enVar, C11054a aVar) {
        return C11203a.m26543a(this, context, enVar, aVar);
    }

    /* renamed from: e */
    public final C60870cx mo19606e(Context context, C51953ff ffVar, C52507uh uhVar, C52091ex exVar, C11054a aVar) {
        C11078an anVar;
        C60870cx cxVar;
        C52507uh uhVar2;
        C50969bn bnVar;
        C50936ah ahVar;
        Object obj;
        C11078an anVar2;
        C11054a aVar2 = aVar;
        this.f36425e = context;
        this.f36426f = new C11073ai(exVar);
        this.f36431k = aVar2;
        if (aVar2.mo19521b(19)) {
            anVar = new C11101bj(this.f36426f);
        } else {
            anVar = new C11102bk(this.f36426f);
        }
        this.f36427g = anVar;
        this.f36423c = ffVar;
        this.f36424d = uhVar;
        this.f36430j = aVar2.mo19521b(6);
        if (!this.f36426f.f36352c.mo56113h()) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        C51953ff ffVar2 = this.f36423c;
        if (ffVar2 == null || this.f36424d == null || this.f36426f == null || this.f36427g == null || this.f36425e == null) {
            cxVar = C60856cj.m92900i(C58836b.f156633a);
        } else {
            C51936ep a = C51936ep.m86435a(ffVar2.f136323g);
            if (a == null) {
                a = C51936ep.DEFAULT;
            }
            if (a != C51936ep.CALL) {
                cxVar = C60856cj.m92900i(C58836b.f156633a);
            } else {
                C51950fc a2 = C51950fc.m86447a(this.f36423c.f136324h);
                if (a2 == null) {
                    a2 = C51950fc.FORM_UI_THEME_DEFAULT;
                }
                this.f36422b = a2;
                this.f36433m.mo19645o();
                if (this.f36423c == null || (uhVar2 = this.f36424d) == null || this.f36426f == null || this.f36427g == null || this.f36425e == null) {
                    cxVar = C60856cj.m92900i(C58836b.f156633a);
                } else if (uhVar2.f137840a.size() != 1) {
                    cxVar = C60856cj.m92900i(C58836b.f156633a);
                } else {
                    C52490tr trVar = (C52490tr) C58557jl.m90133n(this.f36424d.f137840a);
                    int i = trVar.f137798b;
                    if (i == 9) {
                        if ((trVar.f137797a & 1) != 0 && ((C52475tc) trVar.f137799c).f137747b) {
                            C58833ax g = C11222q.m26610g(trVar.f137800d, this.f36423c);
                            if (g.mo56113h() && ((C51941eu) g.mo56107c()).f136277e == 17) {
                                C51941eu euVar = (C51941eu) g.mo56107c();
                                if (euVar.f136277e == 17) {
                                    ahVar = (C50936ah) euVar.f136278f;
                                } else {
                                    ahVar = C50936ah.f132593m;
                                }
                                C51401gi giVar = C51401gi.CONTROLLER_STATE_UNKNOWN;
                                C50931ac acVar = C50931ac.DEFAULT;
                                C50931ac a3 = C50931ac.m85981a(ahVar.f132602h);
                                if (a3 == null) {
                                    a3 = C50931ac.DEFAULT;
                                }
                                int ordinal = a3.ordinal();
                                if (ordinal == 1) {
                                    C11212g.m26598b(this.f36434n, aVar2, 10);
                                    this.f36427g.mo19559E();
                                    if (this.f36423c == null || this.f36424d == null || this.f36426f == null || (anVar2 = this.f36427g) == null || this.f36425e == null) {
                                        obj = C58836b.f156633a;
                                    } else {
                                        anVar2.mo19558D(C51401gi.CANCEL);
                                        ArrayList arrayList = new ArrayList();
                                        C58833ax c = mo19609c();
                                        if (c.mo56113h()) {
                                            arrayList.add((C51809dy) c.mo56107c());
                                        }
                                        arrayList.add(C11209d.m26577g(C52056o.f136624a));
                                        obj = C58833ax.m90834k(C11208c.m26566b(arrayList, C58733pz.f156496a, this.f36426f.mo19552a()));
                                    }
                                    cxVar = C60856cj.m92900i(obj);
                                } else if (ordinal == 2) {
                                    C11212g.m26598b(this.f36434n, aVar2, 9);
                                    this.f36427g.mo19559E();
                                    if (!this.f36427g.mo19586q().mo56113h()) {
                                        C11115f.m26411h(this.f36427g);
                                    }
                                    if (this.f36427g.mo19582m().mo56113h() || (this.f36427g.mo19587r().mo56113h() && this.f36427g.mo19592w().mo56113h())) {
                                        cxVar = C60856cj.m92900i(mo19608b());
                                    }
                                }
                            }
                        }
                        cxVar = C60856cj.m92900i(C58836b.f156633a);
                    } else {
                        if (i == 8 && (trVar.f137797a & 1) != 0) {
                            C52479tg tgVar = (C52479tg) trVar.f137799c;
                            C58833ax g2 = C11222q.m26610g(trVar.f137800d, this.f36423c);
                            if (g2.mo56113h() && ((C51941eu) g2.mo56107c()).f136277e == 16) {
                                int i2 = true != C11115f.m26414k(aVar) ? 1 : 2;
                                Context context2 = this.f36425e;
                                C51941eu euVar2 = (C51941eu) g2.mo56107c();
                                if (euVar2.f136277e == 16) {
                                    bnVar = (C50969bn) euVar2.f136278f;
                                } else {
                                    bnVar = C50969bn.f132678i;
                                }
                                cxVar = C60922j.m93044g(new C11070af(context2, bnVar, tgVar, this.f36426f, this.f36427g, i2, this.f36428h, this.f36432l, this.f36429i, aVar, this.f36434n).mo19543j(), new C11113d(this, trVar), this.f36432l);
                            }
                        }
                        cxVar = C60856cj.m92900i(C58836b.f156633a);
                    }
                }
                this.f36433m.mo19644n();
            }
        }
        return C60922j.m93044g(cxVar, new C11112c(this), this.f36432l);
    }

    /* renamed from: f */
    public final /* synthetic */ C58833ax mo19607f(Context context, C51953ff ffVar, C52507uh uhVar, C52091ex exVar) {
        return C58836b.f156633a;
    }
}
