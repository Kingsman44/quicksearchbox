package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c;

import android.content.Context;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.p620b.C11054a;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p627d.C11203a;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p627d.C11204b;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11207b;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11208c;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q;
import com.google.android.libraries.assistant.assistantactions.p636e.C11278h;
import com.google.assistant.p3897e.p3902c.p3907c.C50929aa;
import com.google.assistant.p3897e.p3902c.p3907c.C50936ah;
import com.google.assistant.p3897e.p3902c.p3907c.C50947as;
import com.google.assistant.p3897e.p3902c.p3907c.C50954az;
import com.google.assistant.p3897e.p3902c.p3907c.C50956ba;
import com.google.assistant.p3897e.p3902c.p3907c.C50959bd;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.assistant.p3897e.p3921j.C52477te;
import com.google.assistant.p3897e.p3921j.C52487to;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52492tt;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.C52510uk;
import com.google.assistant.p3897e.p3921j.C52511ul;
import com.google.assistant.p3897e.p3921j.C52512um;
import com.google.assistant.p3897e.p3921j.C52513un;
import com.google.assistant.p3897e.p3921j.p3926e.C51934en;
import com.google.assistant.p3897e.p3921j.p3926e.C51936ep;
import com.google.assistant.p3897e.p3921j.p3926e.C51937eq;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51952fe;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58847bk;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import java.util.Collections;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.c.aw */
/* compiled from: PG */
public final class C11160aw implements C11204b {

    /* renamed from: a */
    public static final /* synthetic */ int f36531a = 0;

    /* renamed from: b */
    private static final C59071e f36532b = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.c.b.c.aw");

    /* renamed from: c */
    private static final C58528ij f36533c = C58528ij.m90012L("datetime.date", "datetime.time", "recurrence");

    /* renamed from: d */
    private final C60950i f36534d;

    public C11160aw(C60950i iVar) {
        this.f36534d = iVar;
    }

    /* renamed from: b */
    public static C58833ax m26449b(C58833ax axVar) {
        if (!axVar.mo56113h()) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k((C52490tr) C58557jl.m90130k(((C52507uh) axVar.mo56107c()).f137840a, C52490tr.f137795g));
    }

    /* renamed from: c */
    public static boolean m26450c(C52393qb qbVar, C52393qb qbVar2) {
        return qbVar.f137482b == qbVar2.f137482b && qbVar.f137483c == qbVar2.f137483c && qbVar.f137484d == qbVar2.f137484d;
    }

    /* renamed from: g */
    public static boolean m26451g(C52403ql qlVar, C52403ql qlVar2) {
        return qlVar.f137515b == qlVar2.f137515b && qlVar.f137516c == qlVar2.f137516c;
    }

    /* renamed from: h */
    private static C51953ff m26452h(C51953ff ffVar, String str, boolean z) {
        C50936ah ahVar;
        C58833ax g = C11222q.m26610g(str, ffVar);
        if (!g.mo56113h()) {
            return ffVar;
        }
        C51937eq eqVar = (C51937eq) ((C51941eu) g.mo56107c()).toBuilder();
        C51941eu euVar = (C51941eu) g.mo56107c();
        if (euVar.f136277e == 17) {
            ahVar = (C50936ah) euVar.f136278f;
        } else {
            ahVar = C50936ah.f132593m;
        }
        C50929aa aaVar = (C50929aa) ahVar.toBuilder();
        aaVar.copyOnWrite();
        C50936ah ahVar2 = (C50936ah) aaVar.instance;
        ahVar2.f132595a |= 4;
        ahVar2.f132600f = z;
        eqVar.copyOnWrite();
        C51941eu euVar2 = (C51941eu) eqVar.instance;
        C50936ah ahVar3 = (C50936ah) aaVar.build();
        ahVar3.getClass();
        euVar2.f136278f = ahVar3;
        euVar2.f136277e = 17;
        return C11222q.m26609f((C51941eu) eqVar.build(), C58836b.f156633a, ffVar);
    }

    /* renamed from: i */
    private static C51953ff m26453i(C51953ff ffVar, String str) {
        C52510uk ukVar = (C52510uk) C52513un.f137850b.createBuilder();
        C58485gu p = C58485gu.m89848p("main", "time_form", "location_form");
        int i = ((C58724pq) p).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            String str2 = (String) p.get(i2);
            C52511ul ulVar = (C52511ul) C52512um.f137845d.createBuilder();
            ulVar.copyOnWrite();
            C52512um umVar = (C52512um) ulVar.instance;
            str2.getClass();
            umVar.f137847a |= 1;
            umVar.f137848b = str2;
            boolean equals = str2.equals(str);
            ulVar.copyOnWrite();
            C52512um umVar2 = (C52512um) ulVar.instance;
            umVar2.f137847a |= 2;
            umVar2.f137849c = !equals;
            ukVar.mo53878a(ulVar);
        }
        return C11222q.m26607d((C52513un) ukVar.build(), ffVar);
    }

    /* renamed from: j */
    private static C58833ax m26454j(C58833ax axVar, C52091ex exVar) {
        return C58833ax.m90834k(C11208c.m26566b(C58485gu.m89846n(C11209d.m26580j((C51953ff) ((C58847bk) axVar).f156646a)), C58733pz.f156496a, exVar));
    }

    /* renamed from: k */
    private static C58833ax m26455k(C52081en enVar) {
        C58833ax l = m26456l(enVar);
        if (!l.mo56113h()) {
            ((C59052c) ((C59052c) f36532b.mo56224b()).mo56372aa(43098)).mo56386p("Missing FormInput");
            return C58836b.f156633a;
        } else if ((((C52492tt) l.mo56107c()).f137805a & 1) != 0) {
            C52507uh uhVar = ((C52492tt) l.mo56107c()).f137807c;
            if (uhVar == null) {
                uhVar = C52507uh.f137838b;
            }
            return C58833ax.m90834k(uhVar);
        } else {
            ((C59052c) ((C59052c) f36532b.mo56224b()).mo56372aa(43097)).mo56386p("Missing NativeFormArgs");
            return C58836b.f156633a;
        }
    }

    /* renamed from: l */
    private static C58833ax m26456l(C52081en enVar) {
        C58833ax b = C11207b.m26563b(enVar);
        if (b.mo56113h()) {
            return C11207b.m26562a((C51805du) b.mo56107c());
        }
        ((C59052c) ((C59052c) f36532b.mo56224b()).mo56372aa(43099)).mo56386p("Missing FormInput ClientInput");
        return C58836b.f156633a;
    }

    /* renamed from: m */
    private static C58833ax m26457m(C58833ax axVar, String str, Consumer consumer) {
        C50959bd bdVar;
        if (!axVar.mo56113h()) {
            return C58836b.f156633a;
        }
        C58833ax g = C11222q.m26610g(str, (C51953ff) axVar.mo56107c());
        if (!g.mo56113h() || ((C51941eu) g.mo56107c()).f136277e != 33) {
            ((C59052c) ((C59052c) f36532b.mo56226d()).mo56372aa(43104)).mo56389s("Field '%s' should be a carousel.", str);
            return axVar;
        }
        C51941eu euVar = (C51941eu) g.mo56107c();
        if (euVar.f136277e == 33) {
            bdVar = (C50959bd) euVar.f136278f;
        } else {
            bdVar = C50959bd.f132657e;
        }
        C50956ba baVar = (C50956ba) bdVar.toBuilder();
        for (int i = 0; i < ((C50959bd) baVar.instance).f132660b.size(); i++) {
            C50947as asVar = (C50947as) baVar.mo53491a(i).toBuilder();
            consumer.accept(asVar);
            baVar.mo53492b(i, asVar);
        }
        int i2 = 1;
        if (true == Collection.EL.stream(Collections.unmodifiableList(((C50959bd) baVar.instance).f132660b)).anyMatch(C11140ac.f36508a)) {
            i2 = 2;
        }
        baVar.copyOnWrite();
        C50959bd bdVar2 = (C50959bd) baVar.instance;
        bdVar2.f132662d = i2 - 1;
        bdVar2.f132659a = 2 | bdVar2.f132659a;
        C51937eq eqVar = (C51937eq) ((C51941eu) g.mo56107c()).toBuilder();
        C50959bd bdVar3 = (C50959bd) baVar.build();
        eqVar.copyOnWrite();
        C51941eu euVar2 = (C51941eu) eqVar.instance;
        bdVar3.getClass();
        euVar2.f136278f = bdVar3;
        euVar2.f136277e = 33;
        return C58833ax.m90834k(C11222q.m26609f((C51941eu) eqVar.build(), C58836b.f156633a, (C51953ff) axVar.mo56107c()));
    }

    /* renamed from: n */
    private static C58833ax m26458n(C58833ax axVar, C58833ax axVar2, String str, String str2, Predicate predicate, Consumer consumer) {
        C50959bd bdVar;
        if (!axVar.mo56113h()) {
            return axVar;
        }
        C58833ax g = C11222q.m26610g(str, (C51953ff) axVar.mo56107c());
        if (!g.mo56113h() || ((C51941eu) g.mo56107c()).f136277e != 33) {
            return axVar;
        }
        Optional map = Optional.ofNullable((C52490tr) m26449b(axVar2).mo56111f()).filter(new C11151an(str)).map(C11152ao.f36520a);
        if (!map.isPresent()) {
            return axVar;
        }
        if (((C52477te) map.get()).f137751b != 4 && ((C52477te) map.get()).f137751b != 5 && ((C52477te) map.get()).f137751b != 6) {
            return axVar;
        }
        C51941eu euVar = (C51941eu) g.mo56107c();
        if (euVar.f136277e == 33) {
            bdVar = (C50959bd) euVar.f136278f;
        } else {
            bdVar = C50959bd.f132657e;
        }
        if (Collection.EL.stream(bdVar.f132660b).filter(new C11153ap(str2)).anyMatch(predicate)) {
            return axVar;
        }
        return m26457m(axVar, str, new C11154aq(str2, consumer, axVar2, str));
    }

    /* renamed from: a */
    public final C58833ax mo19603a(Context context, C52081en enVar, C11054a aVar) {
        C58833ax axVar;
        C58833ax axVar2;
        C51953ff ffVar;
        C50959bd bdVar;
        C52477te teVar;
        C52487to toVar;
        C58833ax l = m26456l(enVar);
        if (!l.mo56113h()) {
            ((C59052c) ((C59052c) f36532b.mo56224b()).mo56372aa(43096)).mo56386p("Missing FormInput");
            axVar = C58836b.f156633a;
        } else if ((((C52492tt) l.mo56107c()).f137805a & 1) != 0) {
            C51953ff ffVar2 = ((C52492tt) l.mo56107c()).f137806b;
            if (ffVar2 == null) {
                ffVar2 = C51953ff.f136315l;
            }
            axVar = C58833ax.m90834k(ffVar2);
        } else {
            ((C59052c) ((C59052c) f36532b.mo56224b()).mo56372aa(43095)).mo56386p("Missing NativeFormArgs");
            axVar = C58836b.f156633a;
        }
        C51953ff ffVar3 = (C51953ff) axVar.mo56111f();
        if (ffVar3 != null) {
            C51936ep a = C51936ep.m86435a(ffVar3.f136323g);
            if (a == null) {
                a = C51936ep.DEFAULT;
            }
            if (a == C51936ep.REMINDER_PORTMON) {
                C52490tr trVar = (C52490tr) m26449b(m26455k(enVar)).mo56111f();
                if (trVar == null) {
                    ((C59052c) ((C59052c) f36532b.mo56224b()).mo56372aa(43094)).mo56386p("no user interaction; no-op.");
                    return C58836b.f156633a;
                } else if (trVar.f137800d.equals("title")) {
                    C58833ax k = m26455k(enVar);
                    C52091ex exVar = enVar.f136685e;
                    if (exVar == null) {
                        exVar = C52091ex.f136710b;
                    }
                    C52490tr trVar2 = (C52490tr) m26449b(k).mo56111f();
                    if (!k.mo56113h() || trVar2 == null) {
                        return C58836b.f156633a;
                    }
                    C51953ff e = C11278h.m26775e(ffVar3, (C52507uh) k.mo56107c());
                    if (trVar2.f137798b == 3) {
                        toVar = (C52487to) trVar2.f137799c;
                    } else {
                        toVar = C52487to.f137774c;
                    }
                    C51934en enVar2 = (C51934en) m26452h(e, "confirm_field", !toVar.f137777b.isEmpty()).toBuilder();
                    C51952fe feVar = C51952fe.FORM_FIELD_STATUS_UPDATE;
                    enVar2.copyOnWrite();
                    C51953ff ffVar4 = (C51953ff) enVar2.instance;
                    ffVar4.f136326j = feVar.f136314c;
                    ffVar4.f136317a |= 256;
                    return C58833ax.m90834k(C11208c.m26566b(C58485gu.m89846n(C11209d.m26580j((C51953ff) enVar2.build())), C58733pz.f156496a, exVar));
                } else if (trVar.f137800d.equals("main_chips")) {
                    C58833ax k2 = m26455k(enVar);
                    if (!k2.mo56113h()) {
                        return C58836b.f156633a;
                    }
                    if (trVar.f137798b == 16) {
                        C58833ax g = C11222q.m26610g(trVar.f137800d, ffVar3);
                        if (!g.mo56113h()) {
                            axVar2 = C58836b.f156633a;
                        } else {
                            C51941eu euVar = (C51941eu) g.mo56107c();
                            if (euVar.f136277e == 33) {
                                bdVar = (C50959bd) euVar.f136278f;
                            } else {
                                bdVar = C50959bd.f132657e;
                            }
                            if (trVar.f137798b == 16) {
                                teVar = (C52477te) trVar.f137799c;
                            } else {
                                teVar = C52477te.f137748h;
                            }
                            axVar2 = C58833ax.m90834k(((C50954az) bdVar.f132660b.get((int) teVar.f137753d)).f132652l);
                        }
                    } else {
                        axVar2 = C58836b.f156633a;
                    }
                    if (!axVar2.mo56113h()) {
                        return C58836b.f156633a;
                    }
                    if (((String) axVar2.mo56107c()).equals("time")) {
                        ffVar = m26453i(ffVar3, "time_form");
                    } else if (((String) axVar2.mo56107c()).equals("location")) {
                        ffVar = m26453i(ffVar3, "location_form");
                    } else {
                        ((C59052c) ((C59052c) f36532b.mo56226d()).mo56372aa(43100)).mo56386p("unknown tap role for main tab chips");
                        return C58836b.f156633a;
                    }
                    C58833ax k3 = C58833ax.m90834k(C11278h.m26775e(ffVar, (C52507uh) k2.mo56107c()));
                    C52091ex exVar2 = enVar.f136685e;
                    if (exVar2 == null) {
                        exVar2 = C52091ex.f136710b;
                    }
                    return m26454j(k3, exVar2);
                } else if (trVar.f137800d.equals("cancel_field")) {
                    C52091ex exVar3 = enVar.f136685e;
                    if (exVar3 == null) {
                        exVar3 = C52091ex.f136710b;
                    }
                    return C11208c.m26568d(ffVar3, exVar3, trVar, context.getResources().getString(R.string.assistantactions_reminder_cancel_card_text));
                } else if (f36533c.contains(trVar.f137800d)) {
                    C58833ax k4 = m26455k(enVar);
                    C52091ex exVar4 = enVar.f136685e;
                    if (exVar4 == null) {
                        exVar4 = C52091ex.f136710b;
                    }
                    C11139ab abVar = new C11139ab(ffVar3, Optional.ofNullable((C52507uh) k4.mo56111f()), this.f36534d);
                    C58833ax k5 = C58833ax.m90834k(ffVar3);
                    if (abVar.f36504b.isPresent()) {
                        k5 = m26458n(k5, k4, "datetime.date", "custom_date", new C11158au(abVar), new C11159av(abVar));
                    }
                    if (abVar.f36505c.isPresent()) {
                        k5 = m26458n(k5, k4, "datetime.time", "custom_time", new C11141ad(abVar), new C11142ae(abVar));
                    }
                    if (abVar.f36506d.isPresent()) {
                        k5 = m26458n(k5, k4, "recurrence", "custom_recurrence", new C11143af(abVar), new C11144ag(abVar));
                    }
                    return m26454j(C58833ax.m90834k(m26452h((C51953ff) ((C58847bk) C58833ax.m90834k(C11278h.m26775e((C51953ff) m26457m(m26457m(m26457m(k5, "datetime.date", new C11155ar(abVar)), "datetime.time", new C11156as(abVar)), "recurrence", new C11157at(abVar)).mo56107c(), (C52507uh) k4.mo56107c()))).f156646a, "sub_confirm_field", abVar.mo19612a())), exVar4);
                } else {
                    ((C59052c) ((C59052c) f36532b.mo56224b()).mo56372aa(43093)).mo56389s("User interaction is not handled: %s", trVar);
                    return C58836b.f156633a;
                }
            }
        }
        ((C59052c) ((C59052c) f36532b.mo56224b()).mo56372aa(43091)).mo56386p("no form presented; no-op.");
        return C58836b.f156633a;
    }

    /* renamed from: d */
    public final /* synthetic */ C60870cx mo19605d(Context context, C52081en enVar, C11054a aVar) {
        return C11203a.m26543a(this, context, enVar, aVar);
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
