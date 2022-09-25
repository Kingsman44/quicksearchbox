package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.am.w;
import com.google.android.apps.gsa.nga.engine.p5913am.p5917c.C74885bc;
import com.google.android.apps.gsa.nga.engine.p5913am.p5917c.C74886bd;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6246w.C79402e;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80396i;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.C83044e;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3917i.p3918a.C51419h;
import com.google.assistant.p3897e.p3917i.p3918a.C51446i;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import com.google.assistant.p3897e.p3917i.p3918a.C51500k;
import com.google.assistant.p3897e.p3917i.p3918a.C51527l;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.assistant.p3897e.p3921j.C52395qd;
import com.google.assistant.p3897e.p3921j.C52396qe;
import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.assistant.p3897e.p3921j.C52402qk;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.Locale;
import p3186j$.time.ZonedDateTime;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.af */
/* compiled from: PG */
public final /* synthetic */ class C77153af implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C77160am f212924a;

    /* renamed from: b */
    public final /* synthetic */ C76590bg f212925b;

    /* renamed from: c */
    public final /* synthetic */ C74965n f212926c;

    /* renamed from: d */
    public final /* synthetic */ C74886bd f212927d;

    public /* synthetic */ C77153af(C77160am amVar, C76590bg bgVar, C74965n nVar, C74886bd bdVar) {
        this.f212924a = amVar;
        this.f212925b = bgVar;
        this.f212926c = nVar;
        this.f212927d = bdVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Optional optional;
        Optional optional2;
        Optional optional3;
        Optional optional4;
        C77160am amVar = this.f212924a;
        C76590bg bgVar = this.f212925b;
        C74965n nVar = this.f212926c;
        C74886bd bdVar = this.f212927d;
        C74885bc bcVar = (C74885bc) obj;
        if (Collection.EL.stream(bcVar.mo71273a()).anyMatch(C77276w.m124000d(C51419h.FIRING))) {
            ((C58970a) ((C58970a) C77160am.f212936b.mo56226d()).mo56372aa(3832)).mo56386p("Not fulfilling when an alarm is ringing.");
            amVar.f212941g.mo76648a(nVar.mo71336k(), C82835ce.ALARM_RINGING, C83044e.f226656a);
            return C80401n.f220656k;
        }
        Optional i = bgVar.mo72267i(C77149ab.f212917a);
        if (i.isPresent()) {
            if (amVar.f212939e.mo74015g().plus(C77160am.f212935a).isBefore(amVar.f212939e.mo74014f((C52395qd) i.get()))) {
                C80399l c = C77160am.m123863c();
                C81442m.m129557s(c, t.r(amVar.f212938d.mo75121a(nVar.mo71342q()).getString(R.string.nga_productivity_create_alarm_more_than_24_hours_future, new Object[0])));
                return (C80401n) c.build();
            }
        }
        Locale q = nVar.mo71342q();
        C58485gu e = bgVar.mo72263e(C77149ab.f212917a);
        if (e.size() != 1) {
            optional = Optional.empty();
        } else {
            C52395qd qdVar = (C52395qd) e.get(0);
            if ((qdVar.f137487a & 2) != 0) {
                C58485gu guVar = (C58485gu) Collection.EL.stream(bcVar.mo71273a()).filter(amVar.f212940f.mo72488b(bgVar, amVar.f212939e.mo74015g(), true).and(C77276w.m123999c(bgVar))).filter(new C77159al(amVar.mo72462d(qdVar))).collect(C58370cn.f155946a);
                Optional findFirst = Collection.EL.stream(guVar).filter(C77276w.m123998a(C51419h.DISABLED)).findFirst();
                optional = findFirst.isPresent() ? findFirst : Collection.EL.stream(guVar).findFirst();
            } else {
                optional = Optional.empty();
            }
        }
        if (!optional.isPresent()) {
            optional2 = Optional.empty();
        } else {
            C51473j jVar = (C51473j) optional.get();
            C80399l c2 = C77160am.m123863c();
            C51419h a = C51419h.m86180a(jVar.f134097f);
            if (a == null) {
                a = C51419h.UNKNOWN_ALARM_STATUS;
            }
            if (!a.equals(C51419h.DISABLED)) {
                amVar.mo72463e(q, c2, jVar, R.string.nga_productivity_create_alarm_alarm_found);
                optional2 = Optional.m71637of((C80401n) c2.build());
            } else {
                C51446i iVar = (C51446i) jVar.toBuilder();
                C51419h hVar = C51419h.SCHEDULED;
                iVar.copyOnWrite();
                C51473j jVar2 = (C51473j) iVar.instance;
                jVar2.f134097f = hVar.f133932g;
                jVar2.f134092a |= 16;
                C51473j jVar3 = (C51473j) iVar.build();
                C51500k kVar = (C51500k) C51527l.f134273f.createBuilder();
                kVar.mo53629a(jVar3);
                C81442m.m129557s(c2, t.i("alarm.UPDATE_ALARM", (C51527l) kVar.build()));
                amVar.mo72463e(q, c2, jVar3, R.string.nga_productivity_create_alarm_ok);
                optional2 = Optional.m71637of((C80401n) c2.build());
            }
        }
        if (optional2.isPresent()) {
            return (C80401n) optional2.get();
        }
        C80399l c3 = C77160am.m123863c();
        C51446i iVar2 = (C51446i) C51473j.f134090i.createBuilder();
        Optional i2 = bgVar.mo72267i(C77149ab.f212917a);
        if (!i2.isPresent()) {
            amVar.f212941g.mo76648a(nVar.mo71336k(), C82835ce.TRIGGER_TIME_NOT_PROVIDED, C83044e.f226656a);
            optional3 = Optional.empty();
        } else {
            C52395qd qdVar2 = (C52395qd) i2.get();
            if ((qdVar2.f137487a & 2) != 0) {
                ZonedDateTime g = amVar.f212939e.mo74015g();
                ZonedDateTime withZoneSameInstant = amVar.f212939e.mo74014f(qdVar2).withZoneSameInstant(g.getZone());
                if (withZoneSameInstant.isBefore(g)) {
                    ((C58970a) ((C58970a) C77160am.f212936b.mo56226d()).mo56372aa(3833)).mo56386p("The trigger time is not within a week from now; ignoring");
                    amVar.f212941g.mo76648a(nVar.mo71336k(), C82835ce.TRIGGER_TIME_OUT_OF_BOUNDS, C83044e.f226656a);
                    optional3 = Optional.empty();
                } else {
                    if (amVar.mo72462d(qdVar2)) {
                        C52396qe qeVar = (C52396qe) C52397qf.f137491j.createBuilder();
                        qeVar.mo53852c(C79402e.m127434a(withZoneSameInstant.getDayOfWeek()));
                        C52397qf qfVar = (C52397qf) qeVar.build();
                        iVar2.copyOnWrite();
                        C51473j jVar4 = (C51473j) iVar2.instance;
                        qfVar.getClass();
                        jVar4.f134094c = qfVar;
                        jVar4.f134093b = 4;
                    } else {
                        C52393qb qbVar = qdVar2.f137488b;
                        if (qbVar == null) {
                            qbVar = C52393qb.f137479e;
                        }
                        iVar2.copyOnWrite();
                        C51473j jVar5 = (C51473j) iVar2.instance;
                        qbVar.getClass();
                        jVar5.f134094c = qbVar;
                        jVar5.f134093b = 3;
                    }
                    C52402qk qkVar = (C52402qk) C52403ql.f137512f.createBuilder();
                    int hour = withZoneSameInstant.getHour();
                    qkVar.copyOnWrite();
                    C52403ql qlVar = (C52403ql) qkVar.instance;
                    qlVar.f137514a = 1 | qlVar.f137514a;
                    qlVar.f137515b = hour;
                    int minute = withZoneSameInstant.getMinute();
                    qkVar.copyOnWrite();
                    C52403ql qlVar2 = (C52403ql) qkVar.instance;
                    qlVar2.f137514a |= 2;
                    qlVar2.f137516c = minute;
                    int second = withZoneSameInstant.getSecond();
                    qkVar.copyOnWrite();
                    C52403ql qlVar3 = (C52403ql) qkVar.instance;
                    qlVar3.f137514a |= 4;
                    qlVar3.f137517d = second;
                    iVar2.copyOnWrite();
                    C51473j jVar6 = (C51473j) iVar2.instance;
                    C52403ql qlVar4 = (C52403ql) qkVar.build();
                    qlVar4.getClass();
                    jVar6.f134096e = qlVar4;
                    jVar6.f134092a |= 2;
                    optional3 = Optional.m71637of(iVar2);
                }
            } else {
                amVar.f212941g.mo76648a(nVar.mo71336k(), C82835ce.TRIGGER_TIME_TIME_OF_DAY_NOT_PROVIDED, C83044e.f226656a);
                optional3 = Optional.empty();
            }
        }
        Optional map = optional3.map(new C77155ah(bgVar)).map(C77156ai.f212930a).map(new C77157aj(amVar, bdVar)).map(C77158ak.f212933a);
        if (!map.isPresent()) {
            optional4 = Optional.empty();
        } else {
            C51473j jVar7 = (C51473j) map.get();
            if (amVar.f212942h.mo85405j(C90126fx.f251305gM) && C81442m.m129556r(amVar.f212943i.mo71218c(), nVar.mo71349x())) {
                C80396i a2 = w.a("PortableCreateAlarm", "ExecuteCreateAlarm_Earcon");
                c3.copyOnWrite();
                C80401n nVar2 = C80401n.f220656k;
                a2.getClass();
                ((C80401n) c3.instance).f220667j = a2;
            }
            C51500k kVar2 = (C51500k) C51527l.f134273f.createBuilder();
            kVar2.mo53629a(jVar7);
            kVar2.copyOnWrite();
            C51527l lVar = (C51527l) kVar2.instance;
            lVar.f134275a |= 8;
            lVar.f134279e = "com.google.android.deskclock";
            C81442m.m129557s(c3, t.i("alarm.CREATE_ALARM", (C51527l) kVar2.build()));
            amVar.mo72463e(nVar.mo71342q(), c3, jVar7, R.string.nga_productivity_create_alarm_ok);
            optional4 = Optional.m71637of((C80401n) c3.build());
        }
        return (C80401n) optional4.orElseGet(C77154ag.f212928a);
    }
}
