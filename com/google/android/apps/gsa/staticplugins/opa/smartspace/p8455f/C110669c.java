package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8455f;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.broadcastreceiver.C74445c;
import com.google.android.apps.gsa.opa.smartspace.C83793i;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.android.libraries.search.assistant.proactive.p2770b.C36232a;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.assistant.p3897e.p3921j.aaj;
import com.google.assistant.p3897e.p3921j.aam;
import com.google.assistant.p3897e.p3921j.aap;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.aax;
import com.google.assistant.p3897e.p3921j.abc;
import com.google.assistant.p3994s.p3995a.C53175ed;
import com.google.assistant.p3994s.p3995a.C53422nh;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59326i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p3717aq.p3718a.p3719a.C47867a;
import com.google.p3717aq.p3718a.p3719a.C47868b;
import com.google.p3717aq.p3718a.p3719a.C47872f;
import com.google.p3717aq.p3718a.p3719a.C47887u;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.concurrent.Callable;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.time.LocalDate;
import p3186j$.time.LocalDateTime;
import p3186j$.time.LocalTime;
import p3186j$.time.Month;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.f.c */
/* compiled from: PG */
public final /* synthetic */ class C110669c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C110679m f308387a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f308388b;

    /* renamed from: c */
    public final /* synthetic */ LocalDate f308389c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f308390d;

    public /* synthetic */ C110669c(C110679m mVar, C60870cx cxVar, LocalDate localDate, C60870cx cxVar2) {
        this.f308387a = mVar;
        this.f308388b = cxVar;
        this.f308389c = localDate;
        this.f308390d = cxVar2;
    }

    public final Object call() {
        C110679m mVar = this.f308387a;
        C60870cx cxVar = this.f308388b;
        LocalDate localDate = this.f308389c;
        C60870cx cxVar2 = this.f308390d;
        C58485gu guVar = (C58485gu) Collection.EL.stream((C58485gu) C60856cj.m92909r(cxVar)).filter(new C110677k(localDate)).collect(C58370cn.f155946a);
        if (guVar.isEmpty()) {
            String x = mVar.f308405e.mo79758x(C90017bw.f247982br);
            if (!x.isEmpty()) {
                try {
                    guVar = C58485gu.m89846n((C51473j) C62942bv.parseFrom((C62942bv) C51473j.f134090i, C59326i.f157517e.mo56826f().mo56836k(x), C62921ba.m95368a()));
                } catch (C62974ct e) {
                    C59104x c = C110679m.f308400a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "EvtSuggsManager");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(26625)).mo56386p("Invalid ZeroStateClientResponse proto bytes");
                }
            } else {
                C59104x b = C110679m.f308400a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "EvtSuggsManager");
                ((C59052c) ((C59052c) b).mo56372aa(26624)).mo56386p("No triggerable alarms found.");
                return C118826c.f331422a;
            }
        }
        C58833ax axVar = (C58833ax) C60856cj.m92909r(cxVar2);
        if (axVar.mo56113h() || mVar.mo98849d()) {
            C58833ax a = mVar.mo98846a((C53422nh) axVar.mo56109e(C53422nh.f140182m), localDate);
            if (!a.mo56113h()) {
                C59104x b2 = C110679m.f308400a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "EvtSuggsManager");
                ((C59052c) ((C59052c) b2).mo56372aa(26622)).mo56386p("Cannot find the corresponding holiday from ZS response.");
                return C118826c.f331422a;
            }
            C110681o oVar = mVar.f308406f;
            C53175ed edVar = (C53175ed) a.mo56107c();
            if (!oVar.f308414c.mo79746e(C90017bw.f247946bH)) {
                C59104x b3 = C110681o.f308412a.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "EvtSuggsProducer");
                ((C59052c) ((C59052c) b3).mo56372aa(26654)).mo56386p("Holiday alarms notification disabled. Abort.");
            } else if (oVar.f308414c.mo79746e(C90017bw.f247948bJ)) {
                Optional a2 = oVar.mo98850a(guVar, edVar);
                if (!a2.isPresent()) {
                    C58976aa aaVar = C58975e.f156826a;
                } else {
                    C47872f fVar = (C47872f) C47887u.f123976l.createBuilder();
                    String b4 = ((C110680n) a2.get()).mo98840b();
                    fVar.copyOnWrite();
                    C47887u uVar = (C47887u) fVar.instance;
                    b4.getClass();
                    uVar.f123978a = 1;
                    uVar.f123979b = b4;
                    String a3 = ((C110680n) a2.get()).mo98839a();
                    fVar.copyOnWrite();
                    C47887u uVar2 = (C47887u) fVar.instance;
                    a3.getClass();
                    uVar2.f123980c = 7;
                    uVar2.f123981d = a3;
                    C47867a aVar = (C47867a) C47868b.f123936f.createBuilder();
                    aVar.mo51701a("clock-app://com.google.android.deskclock/alarm");
                    C47868b bVar = (C47868b) aVar.build();
                    fVar.copyOnWrite();
                    bVar.getClass();
                    ((C47887u) fVar.instance).f123984g = bVar;
                    int i = true != oVar.f308414c.mo79746e(C90017bw.f247947bI) ? 5 : 2;
                    fVar.copyOnWrite();
                    C47887u uVar3 = (C47887u) fVar.instance;
                    uVar3.f123983f = Integer.valueOf(i - 2);
                    uVar3.f123982e = 20;
                    C47887u uVar4 = (C47887u) fVar.build();
                    aax aax = (aax) abc.f134691o.createBuilder();
                    aax.copyOnWrite();
                    abc abc = (abc) aax.instance;
                    abc.f134699f = 2;
                    abc.f134694a |= 16;
                    aax.copyOnWrite();
                    abc abc2 = (abc) aax.instance;
                    uVar4.getClass();
                    abc2.f134698e = uVar4;
                    abc2.f134694a |= 2;
                    aax.copyOnWrite();
                    abc abc3 = (abc) aax.instance;
                    abc3.f134694a |= 32;
                    abc3.f134700g = 42;
                    Instant instant = oVar.f308417f.mo57445b(oVar.f308418g).mo43076f(LocalTime.MAX).atZone(oVar.f308418g).toInstant();
                    aaj aaj = (aaj) aas.f134661u.createBuilder();
                    String l = Long.toString(C90719ac.f253778a.f253779b.nextLong());
                    aaj.copyOnWrite();
                    aas aas = (aas) aaj.instance;
                    l.getClass();
                    aas.f134663a |= 16;
                    aas.f134668f = l;
                    aaj.copyOnWrite();
                    aas aas2 = (aas) aaj.instance;
                    aas2.f134663a |= 256;
                    aas2.f134670h = "HOLIDAY_ALARMS_NOTIFICATION_GROUPING_KEY";
                    aaj.copyOnWrite();
                    aas aas3 = (aas) aaj.instance;
                    aas3.f134664b = 1;
                    aas3.f134663a |= 1;
                    aam aam = (aam) aap.f134650h.createBuilder();
                    aam.copyOnWrite();
                    aap aap = (aap) aam.instance;
                    aap.f134652a |= 1;
                    aap.f134653b = 115;
                    aam.copyOnWrite();
                    aap aap2 = (aap) aam.instance;
                    aap2.f134652a |= 4;
                    aap2.f134655d = 377;
                    aam.copyOnWrite();
                    aap aap3 = (aap) aam.instance;
                    aap3.f134658g = 0;
                    aap3.f134652a |= 16;
                    aap aap4 = (aap) aam.build();
                    aaj.copyOnWrite();
                    aas aas4 = (aas) aaj.instance;
                    aap4.getClass();
                    aas4.f134676n = aap4;
                    aas4.f134663a |= 8192;
                    aaj.mo58885m(abc.f134692p, (abc) aax.build());
                    long epochMilli = instant.toEpochMilli();
                    aaj.copyOnWrite();
                    aas aas5 = (aas) aaj.instance;
                    aas5.f134663a |= 4;
                    aas5.f134666d = epochMilli;
                    C36232a.m64676c(oVar.f308413b, (aas) aaj.build(), 4);
                }
            } else {
                Optional a4 = oVar.mo98850a(guVar, edVar);
                if (a4.isPresent()) {
                    Notification.Builder autoCancel = new Notification.Builder(oVar.f308413b, "com.google.android.apps.gsa.staticplugins.opa.smartspace.HOLIDAY_ALARMS_NOTIFICATION_CHANNEL_ID").setSmallIcon(R.drawable.quantum_gm_ic_alarm_googblue_24).setContentTitle(((C110680n) a4.get()).mo98840b()).setContentText(((C110680n) a4.get()).mo98839a()).setAutoCancel(true);
                    Optional ofNullable = Optional.ofNullable(C147798a.m240895a(oVar.f308413b, 0, new Intent("android.intent.action.VIEW", Uri.parse("clock-app://com.google.android.deskclock/alarm")), 1073741824));
                    if (ofNullable.isPresent()) {
                        autoCancel.setContentIntent((PendingIntent) ofNullable.get());
                    }
                    Notification build = autoCancel.build();
                    String string = oVar.f308413b.getResources().getString(R.string.holiday_alarms_notification_channel_name);
                    String string2 = oVar.f308413b.getResources().getString(R.string.holiday_alarms_notification_channel_description);
                    NotificationChannel a5 = oVar.f308416e.mo40029a("com.google.android.apps.gsa.staticplugins.opa.smartspace.HOLIDAY_ALARMS_NOTIFICATION_CHANNEL_ID");
                    C58976aa aaVar2 = C58975e.f156826a;
                    if (a5 != null) {
                        if (!string.contentEquals(a5.getName()) || !string2.equals(a5.getDescription()) || a5.getImportance() != 4) {
                            C59104x b5 = C110681o.f308412a.mo56224b();
                            b5.mo56378ag(C58975e.f156826a, "EvtSuggsProducer");
                            ((C59052c) ((C59052c) b5).mo56372aa(26652)).mo56386p("Channel config changed. Delete the existing channel.");
                            oVar.f308416e.mo40033e("com.google.android.apps.gsa.staticplugins.opa.smartspace.HOLIDAY_ALARMS_NOTIFICATION_CHANNEL_ID");
                        }
                        PendingIntent pendingIntent = build.contentIntent;
                        oVar.f308416e.mo40041m(((C110680n) a4.get()).mo98841c().hashCode(), build);
                    }
                    oVar.mo98851b(string, string2);
                    PendingIntent pendingIntent2 = build.contentIntent;
                    oVar.f308416e.mo40041m(((C110680n) a4.get()).mo98841c().hashCode(), build);
                }
            }
            C51473j jVar = (C51473j) guVar.get(0);
            C52403ql qlVar = jVar.f134096e;
            if (qlVar == null) {
                qlVar = C52403ql.f137512f;
            }
            if ((qlVar.f137514a & 1) != 0) {
                LocalDateTime plusDays = mVar.f308409i.mo57446c(mVar.f308411k).plusDays(1);
                int year = plusDays.getYear();
                Month month = plusDays.getMonth();
                int dayOfMonth = plusDays.getDayOfMonth();
                C52403ql qlVar2 = jVar.f134096e;
                int i2 = (qlVar2 == null ? C52403ql.f137512f : qlVar2).f137515b;
                if (qlVar2 == null) {
                    qlVar2 = C52403ql.f137512f;
                }
                Instant minus = LocalDateTime.m71186of(year, month, dayOfMonth, i2, qlVar2.f137516c).atZone(mVar.f308411k).toInstant().minus(Duration.ofMinutes(10));
                C83793i iVar = mVar.f308407g;
                int hashCode = minus.hashCode();
                C52403ql qlVar3 = jVar.f134096e;
                int i3 = (qlVar3 == null ? C52403ql.f137512f : qlVar3).f137515b;
                if (qlVar3 == null) {
                    qlVar3 = C52403ql.f137512f;
                }
                int i4 = qlVar3.f137516c;
                C58976aa aaVar3 = C58975e.f156826a;
                Intent intent = new Intent();
                intent.setPackage("com.google.android.googlequicksearchbox");
                intent.setAction("com.google.android.apps.gsa.staticplugins.opa.smartspace.HOLIDAY_ALARMS_MONITORING");
                intent.putExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.HOLIDAY_ALARMS_MONITORING_HOUR_EXTRA", i3);
                intent.putExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.HOLIDAY_ALARMS_MONITORING_MINUTE_EXTRA", i4);
                Context context = iVar.f228383c;
                ClipData clipData = C147798a.f398772a;
                C58833ax j = C58833ax.m90833j(C74445c.m120395b(context, hashCode, intent));
                if (!j.mo56113h()) {
                    C59104x c2 = C110679m.f308400a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "EvtSuggsManager");
                    ((C59052c) ((C59052c) c2).mo56372aa(26639)).mo56386p("Invalid pendingIntent. Please check getHolidayAlarmsMonitoringPendingIntent()");
                } else {
                    try {
                        mVar.f308404d.set(0, minus.toEpochMilli(), (PendingIntent) j.mo56107c());
                    } catch (RuntimeException e2) {
                        C59104x c3 = C110679m.f308400a.mo56225c();
                        c3.mo56378ag(C58975e.f156826a, "EvtSuggsManager");
                        ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e2)).mo56372aa(26638)).mo56386p("Unable to set the alarm window.");
                    }
                }
            } else {
                C59104x c4 = C110679m.f308400a.mo56225c();
                c4.mo56378ag(C58975e.f156826a, "EvtSuggsManager");
                ((C59052c) ((C59052c) c4).mo56372aa(26640)).mo56386p("Invalid alarm.");
            }
            return C118826c.f331422a;
        }
        C59104x b6 = C110679m.f308400a.mo56224b();
        b6.mo56378ag(C58975e.f156826a, "EvtSuggsManager");
        ((C59052c) ((C59052c) b6).mo56372aa(26623)).mo56386p("ZeroStateClientResponse not found in OpaStore.");
        return C118826c.f331422a;
    }
}
