package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.storage.C114484d;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.android.libraries.p1635au.C19569f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.proactive.p2776h.C36313f;
import com.google.android.libraries.search.assistant.proactive.p2776h.C36314g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3803ag.p3809c.C49138hw;
import com.google.assistant.p3803ag.p3809c.C49150t;
import com.google.assistant.p3803ag.p3809c.C49151u;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.assistant.p3897e.p3921j.aaj;
import com.google.assistant.p3897e.p3921j.aap;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.p3926e.C51962fo;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4184bj.p4189b.C55881aa;
import com.google.p4184bj.p4189b.C55882ab;
import com.google.p4184bj.p4189b.C55893j;
import com.google.protos.p4985f.p5036r.C65316b;
import com.google.protos.p4985f.p5036r.C65330p;
import dagger.C68214a;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p3186j$.time.ZoneId;
import p3186j$.time.ZonedDateTime;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.ar */
/* compiled from: PG */
public final class C114396ar {

    /* renamed from: a */
    public static final C59071e f317198a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.worker.proactive.ar");

    /* renamed from: g */
    private static final long f317199g = Duration.ofDays(7).toMillis();

    /* renamed from: b */
    public final C114484d f317200b;

    /* renamed from: c */
    public final C68214a f317201c;

    /* renamed from: d */
    public final C114418bj f317202d;

    /* renamed from: e */
    public final C36314g f317203e;

    /* renamed from: f */
    public final Executor f317204f;

    /* renamed from: h */
    private final Context f317205h;

    /* renamed from: i */
    private final AlarmManager f317206i;

    /* renamed from: j */
    private final C21370a f317207j;

    /* renamed from: k */
    private final C68214a f317208k;

    /* renamed from: l */
    private final ZoneId f317209l = ZoneId.systemDefault();

    public C114396ar(Context context, AlarmManager alarmManager, C21370a aVar, C114484d dVar, C68214a aVar2, C68214a aVar3, C114418bj bjVar, C36314g gVar, Executor executor) {
        this.f317205h = context;
        this.f317206i = alarmManager;
        this.f317207j = aVar;
        this.f317200b = dVar;
        this.f317208k = aVar2;
        this.f317201c = aVar3;
        this.f317202d = bjVar;
        this.f317203e = gVar;
        this.f317204f = executor;
    }

    /* renamed from: a */
    public final C60870cx mo101311a(String str, long j) {
        return this.f317200b.mo101348b(str, j);
    }

    /* renamed from: b */
    public final C60870cx mo101312b(aas aas) {
        C36314g gVar = this.f317203e;
        aap aap = aas.f134676n;
        if (aap == null) {
            aap = aap.f134650h;
        }
        gVar.mo40101c(aap, 1);
        return C60922j.m93045h(C60838bs.m92859i(mo101313c(aas, C58836b.f156633a)), new C114395aq(this, aas), this.f317204f);
    }

    /* renamed from: c */
    public final C60870cx mo101313c(aas aas, C58833ax axVar) {
        C58833ax axVar2;
        C58833ax axVar3;
        long j;
        C60870cx cxVar;
        C58833ax axVar4;
        Object obj;
        C49151u uVar;
        C49151u uVar2;
        C49151u uVar3;
        C49151u uVar4;
        C58976aa aaVar = C58975e.f156826a;
        Iterator it = aas.f134673k.iterator();
        while (true) {
            if (!it.hasNext()) {
                axVar2 = C58836b.f156633a;
                break;
            }
            C49138hw hwVar = (C49138hw) it.next();
            if (hwVar.f127070a == 8) {
                uVar3 = (C49151u) hwVar.f127071b;
            } else {
                uVar3 = C49151u.f127105d;
            }
            if ((uVar3.f127107a & 2) != 0) {
                if (hwVar.f127070a == 8) {
                    uVar4 = (C49151u) hwVar.f127071b;
                } else {
                    uVar4 = C49151u.f127105d;
                }
                C49150t tVar = uVar4.f127109c;
                if (tVar == null) {
                    tVar = C49150t.f127100c;
                }
                C52393qb qbVar = tVar.f127102a;
                if (qbVar == null) {
                    qbVar = C52393qb.f137479e;
                }
                int i = qbVar.f137482b;
                C52393qb qbVar2 = tVar.f127102a;
                int i2 = (qbVar2 == null ? C52393qb.f137479e : qbVar2).f137483c;
                if (qbVar2 == null) {
                    qbVar2 = C52393qb.f137479e;
                }
                int i3 = qbVar2.f137484d;
                C52403ql qlVar = tVar.f127103b;
                if (qlVar == null) {
                    qlVar = C52403ql.f137512f;
                }
                int i4 = qlVar.f137515b;
                C52403ql qlVar2 = tVar.f127103b;
                int i5 = (qlVar2 == null ? C52403ql.f137512f : qlVar2).f137516c;
                if (qlVar2 == null) {
                    qlVar2 = C52403ql.f137512f;
                }
                axVar2 = C58833ax.m90834k(Long.valueOf(ZonedDateTime.m71295of(i, i2, i3, i4, i5, qlVar2.f137517d, 0, this.f317209l).toInstant().toEpochMilli()));
            }
        }
        if (axVar2.mo56113h()) {
            aaj aaj = (aaj) aas.f134661u.createBuilder(aas);
            long longValue = ((Long) axVar2.mo56107c()).longValue();
            aaj.copyOnWrite();
            aas aas2 = (aas) aaj.instance;
            aas2.f134663a |= 8;
            aas2.f134667e = longValue;
            aas = (aas) aaj.build();
            axVar2.mo56107c();
        }
        Iterator it2 = aas.f134673k.iterator();
        while (true) {
            if (!it2.hasNext()) {
                axVar3 = C58836b.f156633a;
                break;
            }
            C49138hw hwVar2 = (C49138hw) it2.next();
            if (hwVar2.f127070a == 8) {
                uVar = (C49151u) hwVar2.f127071b;
            } else {
                uVar = C49151u.f127105d;
            }
            if ((uVar.f127107a & 1) != 0) {
                if (hwVar2.f127070a == 8) {
                    uVar2 = (C49151u) hwVar2.f127071b;
                } else {
                    uVar2 = C49151u.f127105d;
                }
                C55893j jVar = uVar2.f127108b;
                if (jVar == null) {
                    jVar = C55893j.f148728h;
                }
                axVar3 = C58833ax.m90834k(jVar);
            }
        }
        if (axVar.mo56113h()) {
            j = ((Long) axVar.mo56107c()).longValue();
        } else {
            j = C90719ac.f253778a.f253779b.nextLong();
        }
        if ((aas.f134663a & 8) != 0) {
            long b = aas.f134667e - this.f317207j.mo26870b();
            if (b < 0) {
                return C60856cj.m92900i(C58836b.f156633a);
            }
            if (b > f317199g) {
                return C60856cj.m92900i(C58833ax.m90834k(Long.valueOf(j)));
            }
            Context context = this.f317205h;
            String str = aas.f134670h;
            if (C58837ba.m90859h(str)) {
                axVar4 = C58836b.f156633a;
            } else {
                axVar4 = C58833ax.m90834k(new Intent().setAction("com.google.android.googlequicksearchbox.OPA_TRIGGER_DELAYED_NOTIFICATION").setClassName(context, "com.google.android.apps.gsa.broadcastreceiver.CommonBroadcastReceiver").addCategory("opa_delayed_notification".concat(String.valueOf(str))).putExtra("grouping_key", str).putExtra("delayed_unique_id", j));
            }
            if (!axVar4.mo56113h()) {
                obj = C58836b.f156633a;
            } else {
                Intent intent = (Intent) axVar4.mo56107c();
                intent.toURI();
                PendingIntent broadcast = PendingIntent.getBroadcast(this.f317205h, 0, C147798a.m240896b(intent, 201326592, 0), 201326592);
                broadcast.getClass();
                this.f317206i.setExactAndAllowWhileIdle(0, aas.f134667e, broadcast);
                obj = C58833ax.m90834k(Long.valueOf(j));
            }
            return C60856cj.m92900i(obj);
        } else if (axVar3.mo56113h()) {
            C114496u uVar5 = (C114496u) this.f317201c.mo27525b();
            Long valueOf = Long.valueOf(j);
            String b2 = uVar5.mo101356b(aas);
            ContextFenceStub contextFenceStub = new ContextFenceStub(((C55893j) axVar3.mo56107c()).toByteArray());
            long longValue2 = valueOf.longValue();
            Intent intent2 = new Intent();
            intent2.setClassName(uVar5.f317468c, "com.google.android.apps.gsa.broadcastreceiver.CommonBroadcastReceiver");
            intent2.setAction("com.google.android.googlequicksearchbox.AWARENESS_OPA_NOTIFICATION_TRIGGER");
            intent2.addCategory(uVar5.mo101356b(aas));
            intent2.putExtra("notification", aas.toByteArray());
            intent2.putExtra("fence_key", uVar5.mo101356b(aas));
            intent2.putExtra("unique_id", longValue2);
            PendingIntent broadcast2 = PendingIntent.getBroadcast(uVar5.f317468c, 0, intent2, 301989888);
            if (uVar5.f317469d.mo79668a() == null) {
                cxVar = C60856cj.m92899h(new NullPointerException("Account not found."));
            } else {
                cxVar = uVar5.f317471f.mo41558a("com.google.android.apps.gsa.staticplugins.opa.worker.proactive.ContextFenceRegistration", b2, contextFenceStub, broadcast2, C114496u.f317467b);
            }
            return C47633f.m84733g(cxVar).mo51515h(new C114478q(valueOf), uVar5.f317470e).mo51513e(Exception.class, new C114479r(b2), uVar5.f317470e);
        } else {
            C59104x c = f317198a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "NotifDelayedTrigger");
            ((C59052c) ((C59052c) c).mo56372aa(29002)).mo56386p("Delayed notification has no trigger timestamp or context fences.");
            return C60856cj.m92899h(new C114463da(C51962fo.INVALID_NOTIFICATION_ARGS));
        }
    }

    /* renamed from: d */
    public final void mo101314d(aas aas) {
        this.f317200b.mo101349c(aas.f134670h);
        C114496u uVar = (C114496u) this.f317201c.mo27525b();
        String b = uVar.mo101356b(aas);
        C60870cx a = uVar.mo101355a(b);
        C114495t tVar = new C114495t(b);
        C60856cj.m92911t(a, C47810es.m84974n(tVar), uVar.f317470e);
    }

    /* renamed from: e */
    public final void mo101315e(aas aas) {
        Optional optional;
        String str;
        C49151u uVar;
        C49151u uVar2;
        C36314g gVar = this.f317203e;
        C58976aa aaVar = C58975e.f156826a;
        aap aap = aas.f134676n;
        if (aap == null) {
            aap = aap.f134650h;
        }
        int b = C65330p.m96670b(aap.f134653b);
        int c = C65316b.m96666c(aap.f134655d);
        if ((aas.f134663a & 8) == 0) {
            Iterator it = aas.f134673k.iterator();
            while (true) {
                if (!it.hasNext()) {
                    optional = Optional.empty();
                    break;
                }
                C49138hw hwVar = (C49138hw) it.next();
                if (hwVar.f127070a == 8) {
                    uVar = (C49151u) hwVar.f127071b;
                } else {
                    uVar = C49151u.f127105d;
                }
                if ((uVar.f127107a & 1) != 0) {
                    if (hwVar.f127070a == 8) {
                        uVar2 = (C49151u) hwVar.f127071b;
                    } else {
                        uVar2 = C49151u.f127105d;
                    }
                    C55893j jVar = uVar2.f127108b;
                    if (jVar == null) {
                        jVar = C55893j.f148728h;
                    }
                    if ((jVar.f148730a & 2) == 0) {
                        continue;
                    } else {
                        C55882ab abVar = jVar.f148733d;
                        if (abVar == null) {
                            abVar = C55882ab.f148700g;
                        }
                        int a = C55881aa.m87798a(abVar.f148703b);
                        if (a != 0 && a == 2) {
                            C55882ab abVar2 = jVar.f148733d;
                            if (abVar2 == null) {
                                abVar2 = C55882ab.f148700g;
                            }
                            optional = Optional.m71637of(Long.valueOf(abVar2.f148705d));
                        }
                    }
                }
            }
        } else {
            optional = Optional.m71637of(Long.valueOf(aas.f134667e));
        }
        if (optional.isPresent()) {
            Duration ofMillis = Duration.ofMillis(gVar.f94827b.mo26870b() - ((Long) optional.get()).longValue());
            C36313f fVar = gVar.f94826a;
            double minutes = (double) ofMillis.toMinutes();
            String str2 = BuildConfig.FLAVOR;
            if (b == 0) {
                str = str2;
            } else {
                str = C65330p.m96669a(b);
            }
            if (c != 0) {
                str2 = C65316b.m96664a(c);
            }
            ((C19569f) fVar.f94823d.mo6453a()).mo24824b(minutes, str, str2);
        }
        aaj aaj = (aaj) aas.toBuilder();
        aaj.copyOnWrite();
        aas aas2 = (aas) aaj.instance;
        aas2.f134664b = 1;
        aas2.f134663a |= 1;
        ((C85005h) this.f317208k.mo27525b()).mo78613I(((aas) aaj.build()).toByteArray());
    }
}
