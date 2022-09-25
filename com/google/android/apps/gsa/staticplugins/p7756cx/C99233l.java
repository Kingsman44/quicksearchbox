package com.google.android.apps.gsa.staticplugins.p7756cx;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.LocationArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.RecurrenceArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeOfDayArgument;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.p7146u.C90618b;
import com.google.android.apps.gsa.shared.util.C90734ar;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.sidekick.shared.p7243l.C91755a;
import com.google.android.apps.gsa.sidekick.shared.p7243l.C91756b;
import com.google.android.apps.gsa.sidekick.shared.p7243l.C91757c;
import com.google.android.apps.gsa.sidekick.shared.p7243l.C91758d;
import com.google.android.apps.gsa.staticplugins.p7756cx.p7757a.C99222a;
import com.google.android.gms.reminders.C145775d;
import com.google.android.gms.reminders.C145779h;
import com.google.android.gms.reminders.model.Address;
import com.google.android.gms.reminders.model.C145822ab;
import com.google.android.gms.reminders.model.CategoryInfo;
import com.google.android.gms.reminders.model.ChainInfo;
import com.google.android.gms.reminders.model.DailyPattern;
import com.google.android.gms.reminders.model.ExternalApplicationLink;
import com.google.android.gms.reminders.model.Location;
import com.google.android.gms.reminders.model.LocationGroup;
import com.google.android.gms.reminders.model.Recurrence;
import com.google.android.gms.reminders.model.RecurrenceEnd;
import com.google.android.gms.reminders.model.RecurrenceInfo;
import com.google.android.gms.reminders.model.RecurrenceStart;
import com.google.android.gms.reminders.model.Task;
import com.google.android.gms.reminders.model.TaskId;
import com.google.android.gms.reminders.model.TaskIdEntity;
import com.google.android.gms.reminders.model.WeeklyPattern;
import com.google.android.gms.reminders.model.YearlyPattern;
import com.google.android.libraries.p11024al.p11025a.C147753i;
import com.google.android.libraries.p11024al.p11025a.C147756l;
import com.google.android.libraries.p11024al.p11025a.C147757m;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7703gv;
import com.google.p375ai.p378b.C7704gw;
import com.google.p375ai.p378b.C7948px;
import com.google.p375ai.p378b.C7949py;
import com.google.p381aj.p382a.p383a.p384a.C8242v;
import com.google.p4653i.p4654a.C61649a;
import com.google.p4653i.p4654a.C61660aa;
import com.google.p4653i.p4654a.C61662ac;
import com.google.p4653i.p4654a.C61663ad;
import com.google.p4653i.p4654a.C61664ae;
import com.google.p4653i.p4654a.C61665af;
import com.google.p4653i.p4654a.C61666ag;
import com.google.p4653i.p4654a.C61668ai;
import com.google.p4653i.p4654a.C61670ak;
import com.google.p4653i.p4654a.C61672am;
import com.google.p4653i.p4654a.C61673an;
import com.google.p4653i.p4654a.C61674ao;
import com.google.p4653i.p4654a.C61675ap;
import com.google.p4653i.p4654a.C61676aq;
import com.google.p4653i.p4654a.C61678as;
import com.google.p4653i.p4654a.C61679at;
import com.google.p4653i.p4654a.C61680au;
import com.google.p4653i.p4654a.C61681av;
import com.google.p4653i.p4654a.C61682aw;
import com.google.p4653i.p4654a.C61683ax;
import com.google.p4653i.p4654a.C61684ay;
import com.google.p4653i.p4654a.C61685az;
import com.google.p4653i.p4654a.C61686b;
import com.google.p4653i.p4654a.C61687ba;
import com.google.p4653i.p4654a.C61688bb;
import com.google.p4653i.p4654a.C61689bc;
import com.google.p4653i.p4654a.C61690bd;
import com.google.p4653i.p4654a.C61691be;
import com.google.p4653i.p4654a.C61692bf;
import com.google.p4653i.p4654a.C61693c;
import com.google.p4653i.p4654a.C61694d;
import com.google.p4653i.p4654a.C61695e;
import com.google.p4653i.p4654a.C61696f;
import com.google.p4653i.p4654a.C61697g;
import com.google.p4653i.p4654a.C61698h;
import com.google.p4653i.p4654a.C61699i;
import com.google.p4653i.p4654a.C61700j;
import com.google.p4653i.p4654a.C61707q;
import com.google.p4653i.p4654a.C61709s;
import com.google.p4653i.p4654a.C61710t;
import com.google.p4653i.p4654a.C61711u;
import com.google.p4653i.p4654a.C61713w;
import com.google.p4653i.p4654a.C61714x;
import com.google.p4653i.p4654a.C61715y;
import com.google.p4653i.p4654a.C61716z;
import com.google.p4653i.p4654a.p4655a.C61651b;
import com.google.p4653i.p4654a.p4655a.C61652c;
import com.google.p4653i.p4654a.p4655a.C61653d;
import com.google.p4653i.p4654a.p4655a.C61654e;
import com.google.p4653i.p4654a.p4655a.C61655f;
import com.google.p4653i.p4654a.p4655a.C61656g;
import com.google.p4653i.p4654a.p4655a.C61658i;
import com.google.p4653i.p4654a.p4655a.C61659j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cx.l */
/* compiled from: PG */
public final class C99233l implements C91755a {

    /* renamed from: a */
    public static final C59071e f277603a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cx.l");

    /* renamed from: b */
    static final C58485gu f277604b = C58485gu.m89851s(3, 2, 5, 6, 16, 17);

    /* renamed from: c */
    static final C58485gu f277605c = C58485gu.m89848p(1, 4, 7);

    /* renamed from: d */
    static final long f277606d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    static final long f277607e = TimeUnit.HOURS.toMillis(24);

    /* renamed from: f */
    public final C147753i f277608f;

    /* renamed from: g */
    public final C145779h f277609g;

    /* renamed from: h */
    private final C69464a f277610h;

    /* renamed from: i */
    private final C69464a f277611i;

    /* renamed from: j */
    private long f277612j = f277607e;

    /* renamed from: k */
    private long f277613k = f277606d;

    public C99233l(C145779h hVar, C147753i iVar, C69464a aVar, C69464a aVar2) {
        this.f277608f = iVar;
        this.f277609g = hVar;
        this.f277610h = aVar;
        this.f277611i = aVar2;
    }

    /* renamed from: j */
    private final Object m164546j(C91757c cVar, String str, Integer num) {
        C91758d dVar = (C91758d) this.f277610h.mo17428b();
        if (dVar == null) {
            C59104x c = f277603a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GmsRemindersHelper");
            ((C59052c) ((C59052c) c).mo56372aa(31667)).mo56386p("Not executing ARP call because apiClient is null");
            return null;
        }
        C90748e.m148224b();
        try {
            C91756b bVar = new C91756b(dVar, cVar);
            C90748e.m148224b();
            dVar.mo84772f();
            Object obj = new Object();
            try {
                synchronized (dVar.f253321f) {
                    dVar.f253323h.add(obj);
                }
                if (!dVar.f253319d.mo119133h()) {
                    int i = dVar.f253319d.mo119130c(10000, TimeUnit.MILLISECONDS).f389574c;
                    if (i != 0) {
                        throw new C90618b("Failed to connect: " + i);
                    }
                }
                dVar.mo84773g();
                Object call = bVar.call();
                synchronized (dVar.f253321f) {
                    dVar.f253323h.remove(obj);
                }
                return call;
            } catch (Exception e) {
                throw new C90618b((Throwable) e);
            } catch (Throwable th) {
                synchronized (dVar.f253321f) {
                    dVar.f253323h.remove(obj);
                    throw th;
                }
            }
        } catch (C90618b e2) {
            C59104x c2 = C91758d.f255894j.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "RemindersApiClient");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(11928)).mo56389s("ARP call %s failed.", str);
            ((C89911f) dVar.f255895k.mo27525b()).mo83756b(new C90452a(e2, 211, num.intValue())).mo83721a();
            return null;
        }
    }

    /* renamed from: a */
    public final C58833ax mo86243a() {
        ArrayList arrayList;
        C61655f fVar;
        C62974ct ctVar;
        C61685az azVar;
        int a;
        int a2;
        C8242v d;
        int a3;
        int a4;
        C58976aa aaVar = C58975e.f156826a;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        Long valueOf = Long.valueOf(timeInMillis - this.f277613k);
        Long valueOf2 = Long.valueOf(timeInMillis + this.f277612j);
        int i = 2;
        C145775d dVar = new C145775d();
        int i2 = 1;
        dVar.f394141h = 1;
        dVar.f394140g = 0;
        dVar.mo121945c(1, 2);
        dVar.f394137d = valueOf2;
        dVar.f394138e = valueOf;
        boolean booleanValue = ((Boolean) this.f277611i.mo17428b()).booleanValue();
        C58485gu guVar = f277604b;
        int i3 = ((C58724pq) guVar).f156474d;
        for (int i4 = 0; i4 < i3; i4++) {
            dVar.mo121944b(((Integer) guVar.get(i4)).intValue());
        }
        if (booleanValue) {
            C58485gu guVar2 = f277605c;
            int i5 = ((C58724pq) guVar2).f156474d;
            for (int i6 = 0; i6 < i5; i6++) {
                dVar.mo121944b(((Integer) guVar2.get(i6)).intValue());
            }
        }
        List<Task> list = (List) m164546j(new C99231j(this, dVar.mo121943a()), "loadReminders", Integer.valueOf(C89885b.REMINDERS_GMS_LOAD_FAILED_VALUE));
        if (list == null) {
            C59104x c = f277603a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GmsRemindersHelper");
            ((C59052c) ((C59052c) c).mo56372aa(31677)).mo56386p("Loading upcoming reminders failed.");
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Task task : list) {
                if (task == null) {
                    fVar = null;
                } else {
                    C61654e eVar = (C61654e) C61655f.f166555v.createBuilder();
                    if (task.mo122077n() != null) {
                        try {
                            TaskId n = task.mo122077n();
                            C61691be beVar = (C61691be) C61692bf.f166671d.createBuilder();
                            if (n.mo122058h() != null) {
                                String h = n.mo122058h();
                                beVar.copyOnWrite();
                                C61692bf bfVar = (C61692bf) beVar.instance;
                                h.getClass();
                                bfVar.f166673a |= i;
                                bfVar.f166674b = h;
                            }
                            if (n.mo122059i() != null) {
                                String i7 = n.mo122059i();
                                beVar.copyOnWrite();
                                C61692bf bfVar2 = (C61692bf) beVar.instance;
                                i7.getClass();
                                bfVar2.f166673a |= 4;
                                bfVar2.f166675c = i7;
                            }
                            C61692bf bfVar3 = (C61692bf) beVar.build();
                            eVar.copyOnWrite();
                            C61655f fVar2 = (C61655f) eVar.instance;
                            bfVar3.getClass();
                            fVar2.f166558b = bfVar3;
                            fVar2.f166557a |= i2;
                        } catch (C62974ct e) {
                            ctVar = e;
                            C59104x c2 = f277603a.mo56225c();
                            c2.mo56378ag(C58975e.f156826a, "GmsRemindersHelper");
                            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(ctVar)).mo56372aa(31676)).mo56386p("Found invalid Task model in loadReminders results.");
                            i = 2;
                            i2 = 1;
                        }
                    }
                    if (task.mo122084z() != null) {
                        int a5 = C61658i.m94425a(task.mo122084z().intValue());
                        if (a5 != 0) {
                            C61656g gVar = (C61656g) C61659j.f166581c.createBuilder();
                            gVar.copyOnWrite();
                            C61659j jVar = (C61659j) gVar.instance;
                            jVar.f166584b = a5;
                            jVar.f166583a |= i2;
                            eVar.copyOnWrite();
                            C61655f fVar3 = (C61655f) eVar.instance;
                            C61659j jVar2 = (C61659j) gVar.build();
                            jVar2.getClass();
                            fVar3.f166559c = jVar2;
                            fVar3.f166557a |= 4;
                        }
                    }
                    if (task.mo122071h() != null) {
                        C61710t b = C147757m.m240823b(task.mo122071h());
                        eVar.copyOnWrite();
                        C61655f fVar4 = (C61655f) eVar.instance;
                        b.getClass();
                        fVar4.f166568l = b;
                        fVar4.f166557a |= 4096;
                    }
                    if (task.mo122072i() != null) {
                        C61710t b2 = C147757m.m240823b(task.mo122072i());
                        eVar.copyOnWrite();
                        C61655f fVar5 = (C61655f) eVar.instance;
                        b2.getClass();
                        fVar5.f166569m = b2;
                        fVar5.f166557a |= 8192;
                    }
                    if (task.mo122067G() != null) {
                        String G = task.mo122067G();
                        eVar.copyOnWrite();
                        C61655f fVar6 = (C61655f) eVar.instance;
                        G.getClass();
                        fVar6.f166557a |= 8;
                        fVar6.f166560d = G;
                    }
                    if (task.mo122062B() != null) {
                        long longValue = task.mo122062B().longValue();
                        eVar.copyOnWrite();
                        C61655f fVar7 = (C61655f) eVar.instance;
                        fVar7.f166557a |= 16;
                        fVar7.f166561e = longValue;
                    }
                    if (task.mo122078o() != null) {
                        boolean booleanValue2 = task.mo122078o().booleanValue();
                        eVar.copyOnWrite();
                        C61655f fVar8 = (C61655f) eVar.instance;
                        fVar8.f166557a |= 64;
                        fVar8.f166563g = booleanValue2;
                    }
                    if (task.mo122061A() != null) {
                        long longValue2 = task.mo122061A().longValue();
                        eVar.copyOnWrite();
                        C61655f fVar9 = (C61655f) eVar.instance;
                        fVar9.f166557a |= 32;
                        fVar9.f166562f = longValue2;
                    }
                    if (task.mo122079p() != null) {
                        boolean booleanValue3 = task.mo122079p().booleanValue();
                        eVar.copyOnWrite();
                        C61655f fVar10 = (C61655f) eVar.instance;
                        fVar10.f166557a |= 128;
                        fVar10.f166564h = booleanValue3;
                    }
                    try {
                        if (task.mo122080q() != null) {
                            boolean booleanValue4 = task.mo122080q().booleanValue();
                            eVar.copyOnWrite();
                            C61655f fVar11 = (C61655f) eVar.instance;
                            fVar11.f166557a |= 256;
                            fVar11.f166565i = booleanValue4;
                        }
                        if (task.mo122082x() != null) {
                            boolean booleanValue5 = task.mo122082x().booleanValue();
                            eVar.copyOnWrite();
                            C61655f fVar12 = (C61655f) eVar.instance;
                            fVar12.f166557a |= 512;
                            fVar12.f166566j = booleanValue5;
                        }
                        if (task.mo122064D() != null) {
                            long longValue3 = task.mo122064D().longValue();
                            eVar.copyOnWrite();
                            C61655f fVar13 = (C61655f) eVar.instance;
                            fVar13.f166557a |= 4194304;
                            fVar13.f166577u = longValue3;
                        }
                        if (task.mo122066F() != null) {
                            long longValue4 = task.mo122066F().longValue();
                            eVar.copyOnWrite();
                            C61655f fVar14 = (C61655f) eVar.instance;
                            fVar14.f166557a |= 2048;
                            fVar14.f166567k = longValue4;
                        }
                        if (task.mo122065E() != null) {
                            long longValue5 = task.mo122065E().longValue();
                            eVar.copyOnWrite();
                            C61655f fVar15 = (C61655f) eVar.instance;
                            fVar15.f166557a |= 65536;
                            fVar15.f166572p = longValue5;
                        }
                        if (task.mo122074k() != null) {
                            Location k = task.mo122074k();
                            C61711u uVar = (C61711u) C61714x.f166722k.createBuilder();
                            if (k.mo122019j() != null) {
                                double doubleValue = k.mo122019j().doubleValue();
                                uVar.copyOnWrite();
                                C61714x xVar = (C61714x) uVar.instance;
                                xVar.f166724a |= i2;
                                xVar.f166725b = doubleValue;
                            }
                            if (k.mo122020k() != null) {
                                double doubleValue2 = k.mo122020k().doubleValue();
                                uVar.copyOnWrite();
                                C61714x xVar2 = (C61714x) uVar.instance;
                                xVar2.f166724a |= i;
                                xVar2.f166726c = doubleValue2;
                            }
                            if (k.mo122025p() != null) {
                                String p = k.mo122025p();
                                uVar.copyOnWrite();
                                C61714x xVar3 = (C61714x) uVar.instance;
                                p.getClass();
                                xVar3.f166724a |= 4;
                                xVar3.f166727d = p;
                            }
                            if (k.mo122022m() != null) {
                                int intValue = k.mo122022m().intValue();
                                uVar.copyOnWrite();
                                C61714x xVar4 = (C61714x) uVar.instance;
                                xVar4.f166724a |= 8;
                                xVar4.f166728e = intValue;
                            }
                            if (!(k.mo122021l() == null || (a4 = C61713w.m94436a(k.mo122021l().intValue())) == 0)) {
                                uVar.copyOnWrite();
                                C61714x xVar5 = (C61714x) uVar.instance;
                                xVar5.f166729f = a4;
                                xVar5.f166724a |= 16;
                            }
                            if (k.mo122023n() != null) {
                                String n2 = k.mo122023n();
                                uVar.copyOnWrite();
                                C61714x xVar6 = (C61714x) uVar.instance;
                                n2.getClass();
                                xVar6.f166724a |= 64;
                                xVar6.f166731h = n2;
                            }
                            if (k.mo122017h() != null) {
                                Address h2 = k.mo122017h();
                                C61649a aVar = (C61649a) C61686b.f166649j.createBuilder();
                                if (h2.mo121968h() != null) {
                                    String h3 = h2.mo121968h();
                                    aVar.copyOnWrite();
                                    C61686b bVar = (C61686b) aVar.instance;
                                    h3.getClass();
                                    bVar.f166651a |= i2;
                                    bVar.f166652b = h3;
                                }
                                if (h2.mo121969i() != null) {
                                    String i8 = h2.mo121969i();
                                    aVar.copyOnWrite();
                                    C61686b bVar2 = (C61686b) aVar.instance;
                                    i8.getClass();
                                    bVar2.f166651a |= i;
                                    bVar2.f166653c = i8;
                                }
                                if (h2.mo121972l() != null) {
                                    String l = h2.mo121972l();
                                    aVar.copyOnWrite();
                                    C61686b bVar3 = (C61686b) aVar.instance;
                                    l.getClass();
                                    bVar3.f166651a |= 4;
                                    bVar3.f166654d = l;
                                }
                                if (h2.mo121973m() != null) {
                                    String m = h2.mo121973m();
                                    aVar.copyOnWrite();
                                    C61686b bVar4 = (C61686b) aVar.instance;
                                    m.getClass();
                                    bVar4.f166651a |= 8;
                                    bVar4.f166655e = m;
                                }
                                if (h2.mo121975o() != null) {
                                    String o = h2.mo121975o();
                                    aVar.copyOnWrite();
                                    C61686b bVar5 = (C61686b) aVar.instance;
                                    o.getClass();
                                    bVar5.f166651a |= 16;
                                    bVar5.f166656f = o;
                                }
                                if (h2.mo121974n() != null) {
                                    String n3 = h2.mo121974n();
                                    aVar.copyOnWrite();
                                    C61686b bVar6 = (C61686b) aVar.instance;
                                    n3.getClass();
                                    bVar6.f166651a |= 32;
                                    bVar6.f166657g = n3;
                                }
                                if (h2.mo121971k() != null) {
                                    String k2 = h2.mo121971k();
                                    aVar.copyOnWrite();
                                    C61686b bVar7 = (C61686b) aVar.instance;
                                    k2.getClass();
                                    bVar7.f166651a |= 64;
                                    bVar7.f166658h = k2;
                                }
                                if (h2.mo121970j() != null) {
                                    String j = h2.mo121970j();
                                    aVar.copyOnWrite();
                                    C61686b bVar8 = (C61686b) aVar.instance;
                                    j.getClass();
                                    bVar8.f166651a |= 128;
                                    bVar8.f166659i = j;
                                }
                                C61686b bVar9 = (C61686b) aVar.build();
                                uVar.copyOnWrite();
                                C61714x xVar7 = (C61714x) uVar.instance;
                                bVar9.getClass();
                                xVar7.f166732i = bVar9;
                                xVar7.f166724a |= 128;
                            }
                            C8242v d2 = C147757m.m240825d(k.mo122018i());
                            if (d2 != null) {
                                uVar.copyOnWrite();
                                C61714x xVar8 = (C61714x) uVar.instance;
                                xVar8.f166730g = d2;
                                xVar8.f166724a |= 32;
                            }
                            if (!TextUtils.isEmpty(k.mo122024o())) {
                                C61715y yVar = (C61715y) C61716z.f166735c.createBuilder();
                                String o2 = k.mo122024o();
                                yVar.copyOnWrite();
                                C61716z zVar = (C61716z) yVar.instance;
                                o2.getClass();
                                zVar.f166737a |= i2;
                                zVar.f166738b = o2;
                                uVar.copyOnWrite();
                                C61714x xVar9 = (C61714x) uVar.instance;
                                C61716z zVar2 = (C61716z) yVar.build();
                                zVar2.getClass();
                                xVar9.f166733j = zVar2;
                                xVar9.f166724a |= 256;
                            }
                            C61714x xVar10 = (C61714x) uVar.build();
                            eVar.copyOnWrite();
                            C61655f fVar16 = (C61655f) eVar.instance;
                            xVar10.getClass();
                            fVar16.f166570n = xVar10;
                            fVar16.f166557a |= 16384;
                        }
                        if (task.mo122075l() != null) {
                            LocationGroup l2 = task.mo122075l();
                            C61660aa aaVar2 = (C61660aa) C61663ad.f166586f.createBuilder();
                            if (l2.mo122014k() != null) {
                                String k3 = l2.mo122014k();
                                aaVar2.copyOnWrite();
                                C61663ad adVar = (C61663ad) aaVar2.instance;
                                k3.getClass();
                                adVar.f166588a |= i2;
                                adVar.f166589b = k3;
                            }
                            if (!(l2.mo122013j() == null || (a3 = C61662ac.m94426a(l2.mo122013j().intValue())) == 0)) {
                                aaVar2.copyOnWrite();
                                C61663ad adVar2 = (C61663ad) aaVar2.instance;
                                adVar2.f166590c = a3;
                                adVar2.f166588a |= i;
                            }
                            if (l2.mo122012i() != null) {
                                ChainInfo i9 = l2.mo122012i();
                                C61699i iVar = (C61699i) C61700j.f166688d.createBuilder();
                                if (i9.mo121984i() != null) {
                                    String i10 = i9.mo121984i();
                                    iVar.copyOnWrite();
                                    C61700j jVar3 = (C61700j) iVar.instance;
                                    i10.getClass();
                                    jVar3.f166690a |= i;
                                    jVar3.f166691b = i10;
                                }
                                if (!(i9.mo121983h() == null || (d = C147757m.m240825d(i9.mo121983h())) == null)) {
                                    C61697g gVar2 = (C61697g) C61698h.f166683c.createBuilder();
                                    gVar2.copyOnWrite();
                                    C61698h hVar = (C61698h) gVar2.instance;
                                    hVar.f166686b = d;
                                    hVar.f166685a |= i2;
                                    iVar.copyOnWrite();
                                    C61700j jVar4 = (C61700j) iVar.instance;
                                    C61698h hVar2 = (C61698h) gVar2.build();
                                    hVar2.getClass();
                                    jVar4.f166692c = hVar2;
                                    jVar4.f166690a |= 4;
                                }
                                C61700j jVar5 = (C61700j) iVar.build();
                                aaVar2.copyOnWrite();
                                C61663ad adVar3 = (C61663ad) aaVar2.instance;
                                jVar5.getClass();
                                adVar3.f166591d = jVar5;
                                adVar3.f166588a |= 4;
                            }
                            if (l2.mo122011h() != null) {
                                CategoryInfo h4 = l2.mo122011h();
                                C61695e eVar2 = (C61695e) C61696f.f166678d.createBuilder();
                                if (h4.mo121978h() != null) {
                                    String h5 = h4.mo121978h();
                                    eVar2.copyOnWrite();
                                    C61696f fVar17 = (C61696f) eVar2.instance;
                                    h5.getClass();
                                    fVar17.f166680a |= i2;
                                    fVar17.f166681b = h5;
                                }
                                if (h4.mo121979i() != null) {
                                    String i11 = h4.mo121979i();
                                    eVar2.copyOnWrite();
                                    C61696f fVar18 = (C61696f) eVar2.instance;
                                    i11.getClass();
                                    fVar18.f166680a |= i;
                                    fVar18.f166682c = i11;
                                }
                                C61696f fVar19 = (C61696f) eVar2.build();
                                aaVar2.copyOnWrite();
                                C61663ad adVar4 = (C61663ad) aaVar2.instance;
                                fVar19.getClass();
                                adVar4.f166592e = fVar19;
                                adVar4.f166588a |= 8;
                            }
                            C61663ad adVar5 = (C61663ad) aaVar2.build();
                            eVar.copyOnWrite();
                            C61655f fVar20 = (C61655f) eVar.instance;
                            adVar5.getClass();
                            fVar20.f166571o = adVar5;
                            fVar20.f166557a |= 32768;
                        }
                        if (task.mo122076m() != null) {
                            RecurrenceInfo m2 = task.mo122076m();
                            C61687ba baVar = (C61687ba) C61688bb.f166660f.createBuilder();
                            if (m2.mo122039h() != null) {
                                Recurrence h6 = m2.mo122039h();
                                C61664ae aeVar = (C61664ae) C61683ax.f166633j.createBuilder();
                                if (!(h6.mo122052o() == null || (a2 = C61668ai.m94427a(h6.mo122052o().intValue())) == 0)) {
                                    aeVar.copyOnWrite();
                                    C61683ax axVar = (C61683ax) aeVar.instance;
                                    axVar.f166636b = a2 - 1;
                                    axVar.f166635a |= i2;
                                }
                                if (h6.mo122051n() != null) {
                                    int intValue2 = h6.mo122051n().intValue();
                                    aeVar.copyOnWrite();
                                    C61683ax axVar2 = (C61683ax) aeVar.instance;
                                    axVar2.f166635a |= i;
                                    axVar2.f166637c = intValue2;
                                }
                                if (h6.mo122048k() != null) {
                                    RecurrenceStart k4 = h6.mo122048k();
                                    C61675ap apVar = (C61675ap) C61676aq.f166619c.createBuilder();
                                    if (k4.mo122055h() != null) {
                                        C61710t b3 = C147757m.m240823b(k4.mo122055h());
                                        apVar.copyOnWrite();
                                        C61676aq aqVar = (C61676aq) apVar.instance;
                                        b3.getClass();
                                        aqVar.f166622b = b3;
                                        aqVar.f166621a |= i2;
                                    }
                                    C61676aq aqVar2 = (C61676aq) apVar.build();
                                    aeVar.copyOnWrite();
                                    C61683ax axVar3 = (C61683ax) aeVar.instance;
                                    aqVar2.getClass();
                                    axVar3.f166638d = aqVar2;
                                    axVar3.f166635a |= 4;
                                }
                                if (h6.mo122047j() != null) {
                                    RecurrenceEnd j2 = h6.mo122047j();
                                    C61673an anVar = (C61673an) C61674ao.f166610g.createBuilder();
                                    if (j2.mo122034i() != null) {
                                        C61710t b4 = C147757m.m240823b(j2.mo122034i());
                                        anVar.copyOnWrite();
                                        C61674ao aoVar = (C61674ao) anVar.instance;
                                        b4.getClass();
                                        aoVar.f166613b = b4;
                                        aoVar.f166612a |= i2;
                                    }
                                    if (j2.mo122036k() != null) {
                                        int intValue3 = j2.mo122036k().intValue();
                                        anVar.copyOnWrite();
                                        C61674ao aoVar2 = (C61674ao) anVar.instance;
                                        aoVar2.f166612a |= 4;
                                        aoVar2.f166615d = intValue3;
                                    }
                                    if (j2.mo122035j() != null) {
                                        boolean booleanValue6 = j2.mo122035j().booleanValue();
                                        anVar.copyOnWrite();
                                        C61674ao aoVar3 = (C61674ao) anVar.instance;
                                        aoVar3.f166612a |= 8;
                                        aoVar3.f166616e = booleanValue6;
                                    }
                                    if (j2.mo122033h() != null) {
                                        C61710t b5 = C147757m.m240823b(j2.mo122033h());
                                        anVar.copyOnWrite();
                                        C61674ao aoVar4 = (C61674ao) anVar.instance;
                                        b5.getClass();
                                        aoVar4.f166617f = b5;
                                        aoVar4.f166612a |= 16;
                                    }
                                    C61674ao aoVar5 = (C61674ao) anVar.build();
                                    aeVar.copyOnWrite();
                                    C61683ax axVar4 = (C61683ax) aeVar.instance;
                                    aoVar5.getClass();
                                    axVar4.f166639e = aoVar5;
                                    axVar4.f166635a |= 8;
                                }
                                if (h6.mo122045h() != null) {
                                    DailyPattern h7 = h6.mo122045h();
                                    C61665af afVar = (C61665af) C61666ag.f166594e.createBuilder();
                                    if (h7.mo121987h() != null) {
                                        C61709s a6 = C147757m.m240822a(h7.mo121987h());
                                        afVar.copyOnWrite();
                                        C61666ag agVar = (C61666ag) afVar.instance;
                                        a6.getClass();
                                        agVar.f166597b = a6;
                                        agVar.f166596a |= 1;
                                    }
                                    if (!(h7.mo121989j() == null || (a = C61707q.m94435a(h7.mo121989j().intValue())) == 0)) {
                                        afVar.copyOnWrite();
                                        C61666ag agVar2 = (C61666ag) afVar.instance;
                                        agVar2.f166598c = a;
                                        agVar2.f166596a |= 2;
                                    }
                                    if (h7.mo121988i() != null) {
                                        boolean booleanValue7 = h7.mo121988i().booleanValue();
                                        afVar.copyOnWrite();
                                        C61666ag agVar3 = (C61666ag) afVar.instance;
                                        agVar3.f166596a |= 4;
                                        agVar3.f166599d = booleanValue7;
                                    }
                                    C61666ag agVar4 = (C61666ag) afVar.build();
                                    aeVar.copyOnWrite();
                                    C61683ax axVar5 = (C61683ax) aeVar.instance;
                                    agVar4.getClass();
                                    axVar5.f166640f = agVar4;
                                    axVar5.f166635a |= 16;
                                }
                                if (h6.mo122049l() != null) {
                                    WeeklyPattern l3 = h6.mo122049l();
                                    C61679at atVar = (C61679at) C61680au.f166625b.createBuilder();
                                    if (l3.mo122091h() != null) {
                                        for (Integer intValue4 : l3.mo122091h()) {
                                            int a7 = C61678as.m94431a(intValue4.intValue());
                                            if (a7 != 0) {
                                                atVar.mo58169a(a7);
                                            }
                                        }
                                    }
                                    C61680au auVar = (C61680au) atVar.build();
                                    aeVar.copyOnWrite();
                                    C61683ax axVar6 = (C61683ax) aeVar.instance;
                                    auVar.getClass();
                                    axVar6.f166641g = auVar;
                                    axVar6.f166635a |= 32;
                                }
                                if (h6.mo122046i() != null) {
                                    C61672am c3 = C147757m.m240824c(h6.mo122046i());
                                    aeVar.copyOnWrite();
                                    C61683ax axVar7 = (C61683ax) aeVar.instance;
                                    c3.getClass();
                                    axVar7.f166642h = c3;
                                    axVar7.f166635a |= 64;
                                }
                                if (h6.mo122050m() != null) {
                                    YearlyPattern m3 = h6.mo122050m();
                                    C61681av avVar = (C61681av) C61682aw.f166628d.createBuilder();
                                    if (m3.mo122094h() != null) {
                                        C61672am c4 = C147757m.m240824c(m3.mo122094h());
                                        avVar.copyOnWrite();
                                        C61682aw awVar = (C61682aw) avVar.instance;
                                        c4.getClass();
                                        awVar.f166631b = c4;
                                        awVar.f166630a |= 1;
                                    }
                                    if (m3.mo122095i() != null) {
                                        for (Integer intValue5 : m3.mo122095i()) {
                                            int a8 = C61670ak.m94428a(intValue5.intValue());
                                            if (a8 != 0) {
                                                avVar.mo58170a(a8);
                                            }
                                        }
                                    }
                                    C61682aw awVar2 = (C61682aw) avVar.build();
                                    aeVar.copyOnWrite();
                                    C61683ax axVar8 = (C61683ax) aeVar.instance;
                                    awVar2.getClass();
                                    axVar8.f166643i = awVar2;
                                    axVar8.f166635a |= 128;
                                }
                                C61683ax axVar9 = (C61683ax) aeVar.build();
                                baVar.copyOnWrite();
                                C61688bb bbVar = (C61688bb) baVar.instance;
                                axVar9.getClass();
                                bbVar.f166663b = axVar9;
                                bbVar.f166662a |= 1;
                            }
                            String k5 = m2.mo122042k();
                            if (TextUtils.isEmpty(k5)) {
                                azVar = null;
                            } else {
                                C61684ay ayVar = (C61684ay) C61685az.f166645c.createBuilder();
                                ayVar.copyOnWrite();
                                C61685az azVar2 = (C61685az) ayVar.instance;
                                k5.getClass();
                                azVar2.f166647a |= 1;
                                azVar2.f166648b = k5;
                                azVar = (C61685az) ayVar.build();
                            }
                            if (azVar != null) {
                                baVar.copyOnWrite();
                                C61688bb bbVar2 = (C61688bb) baVar.instance;
                                bbVar2.f166664c = azVar;
                                bbVar2.f166662a |= 2;
                            }
                            if (m2.mo122041j() != null) {
                                boolean booleanValue8 = m2.mo122041j().booleanValue();
                                baVar.copyOnWrite();
                                C61688bb bbVar3 = (C61688bb) baVar.instance;
                                bbVar3.f166662a |= 4;
                                bbVar3.f166665d = booleanValue8;
                            }
                            if (m2.mo122040i() != null) {
                                boolean booleanValue9 = m2.mo122040i().booleanValue();
                                baVar.copyOnWrite();
                                C61688bb bbVar4 = (C61688bb) baVar.instance;
                                bbVar4.f166662a |= 8;
                                bbVar4.f166666e = booleanValue9;
                            }
                            C61688bb bbVar5 = (C61688bb) baVar.build();
                            eVar.copyOnWrite();
                            C61655f fVar21 = (C61655f) eVar.instance;
                            bbVar5.getClass();
                            fVar21.f166574r = bbVar5;
                            fVar21.f166557a |= C89885b.HTTP_VALUE;
                        }
                        if (task.mo122068H() != null) {
                            C61694d dVar2 = (C61694d) ((C61693c) ((C61693c) C61694d.f166676a.createBuilder()).mergeFrom(task.mo122068H())).build();
                            eVar.copyOnWrite();
                            C61655f fVar22 = (C61655f) eVar.instance;
                            dVar2.getClass();
                            fVar22.f166575s = dVar2;
                            fVar22.f166557a |= 524288;
                        }
                        if (task.mo122069I() != null) {
                            eVar.copyOnWrite();
                            C61655f fVar23 = (C61655f) eVar.instance;
                            C61690bd bdVar = (C61690bd) ((C61689bc) ((C61689bc) C61690bd.f166668a.createBuilder()).mergeFrom(task.mo122069I())).build();
                            bdVar.getClass();
                            fVar23.f166573q = bdVar;
                            fVar23.f166557a |= C89885b.S3REQUEST_VALUE;
                        }
                        if (task.mo122073j() != null) {
                            ExternalApplicationLink j3 = task.mo122073j();
                            C61652c cVar = (C61652c) C61653d.f166550d.createBuilder();
                            if (j3.mo122003h() != null) {
                                int a9 = C61651b.m94424a(j3.mo122003h().intValue());
                                if (a9 != 0) {
                                    cVar.copyOnWrite();
                                    C61653d dVar3 = (C61653d) cVar.instance;
                                    dVar3.f166553b = a9;
                                    dVar3.f166552a |= 1;
                                }
                            }
                            if (j3.mo122004i() != null) {
                                String i12 = j3.mo122004i();
                                cVar.copyOnWrite();
                                C61653d dVar4 = (C61653d) cVar.instance;
                                i12.getClass();
                                try {
                                    dVar4.f166552a |= 2;
                                    dVar4.f166554c = i12;
                                } catch (C62974ct e2) {
                                    e = e2;
                                    ctVar = e;
                                    C59104x c22 = f277603a.mo56225c();
                                    c22.mo56378ag(C58975e.f156826a, "GmsRemindersHelper");
                                    ((C59052c) ((C59052c) ((C59052c) c22).mo56382g(ctVar)).mo56372aa(31676)).mo56386p("Found invalid Task model in loadReminders results.");
                                    i = 2;
                                    i2 = 1;
                                }
                            }
                            C61653d dVar5 = (C61653d) cVar.build();
                            eVar.copyOnWrite();
                            C61655f fVar24 = (C61655f) eVar.instance;
                            dVar5.getClass();
                            fVar24.f166576t = dVar5;
                            fVar24.f166557a |= C89885b.NOW_VALUE;
                        }
                        fVar = (C61655f) eVar.build();
                    } catch (C62974ct e3) {
                        e = e3;
                        ctVar = e;
                        C59104x c222 = f277603a.mo56225c();
                        c222.mo56378ag(C58975e.f156826a, "GmsRemindersHelper");
                        ((C59052c) ((C59052c) ((C59052c) c222).mo56382g(ctVar)).mo56372aa(31676)).mo56386p("Found invalid Task model in loadReminders results.");
                        i = 2;
                        i2 = 1;
                    }
                }
                arrayList2.add(fVar);
                i = 2;
                i2 = 1;
            }
            arrayList = arrayList2;
        }
        if (arrayList == null) {
            return C58836b.f156633a;
        }
        C7948px pxVar = (C7948px) C7949py.f27908d.createBuilder();
        boolean isEmpty = arrayList.isEmpty();
        pxVar.copyOnWrite();
        C7949py pyVar = (C7949py) pxVar.instance;
        pyVar.f27911a |= 1;
        pyVar.f27912b = !isEmpty;
        if (!arrayList.isEmpty()) {
            pxVar.copyOnWrite();
            C7949py pyVar2 = (C7949py) pxVar.instance;
            C62971cq cqVar = pyVar2.f27913c;
            if (!cqVar.mo58948c()) {
                pyVar2.f27913c = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) arrayList, (List) pyVar2.f27913c);
        }
        C7703gv gvVar = (C7703gv) C7704gw.f26884c.createBuilder();
        gvVar.mo58885m(C7949py.f27909e, (C7949py) pxVar.build());
        long a10 = C90734ar.m148198a(((C7704gw) gvVar.build()).toByteArray());
        gvVar.copyOnWrite();
        C7704gw gwVar = (C7704gw) gvVar.instance;
        gwVar.f26886a |= 1;
        gwVar.f26887b = a10;
        return C58833ax.m90834k((C7704gw) gvVar.build());
    }

    /* renamed from: b */
    public final String mo86244b(String str, TimeOfDayArgument timeOfDayArgument, RecurrenceArgument recurrenceArgument, LocationArgument locationArgument) {
        C58976aa aaVar = C58975e.f156826a;
        if (timeOfDayArgument == null && locationArgument == null) {
            C59104x c = f277603a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GmsRemindersHelper");
            ((C59052c) ((C59052c) c).mo56372aa(31671)).mo56386p("Cannot snooze reminder to neither time nor location");
            return null;
        } else if (timeOfDayArgument != null && locationArgument != null) {
            C59104x c2 = f277603a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "GmsRemindersHelper");
            ((C59052c) ((C59052c) c2).mo56372aa(31670)).mo56386p("Cannot snooze reminder to both time and location");
            return null;
        } else if (recurrenceArgument == null || timeOfDayArgument != null) {
            C145822ab a = C99222a.m164535a(timeOfDayArgument, recurrenceArgument, locationArgument);
            a.mo122174f(new TaskIdEntity(C147756l.m240820b(), (String) null));
            a.mo122175g(3);
            a.f394341a = str;
            a.f394346f = true;
            a.mo122169a();
            return (String) m164546j(new C99230i(a.mo122169a()), "createReminderOrRecurrence", Integer.valueOf(C89885b.REMINDERS_GMS_CREATE_FAILED_VALUE));
        } else {
            C59104x c3 = f277603a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "GmsRemindersHelper");
            ((C59052c) ((C59052c) c3).mo56372aa(31669)).mo56386p("Cannot snooze recurring reminder without time");
            return null;
        }
    }

    /* renamed from: c */
    public final String mo86245c(String str, TimeOfDayArgument timeOfDayArgument, RecurrenceArgument recurrenceArgument, LocationArgument locationArgument, String str2) {
        C58976aa aaVar = C58975e.f156826a;
        if (timeOfDayArgument != null && locationArgument != null) {
            C59104x c = f277603a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GmsRemindersHelper");
            ((C59052c) ((C59052c) c).mo56372aa(31675)).mo56386p("Cannot update reminder to both time and location");
            return null;
        } else if (TextUtils.isEmpty(str2)) {
            C59104x c2 = f277603a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "GmsRemindersHelper");
            ((C59052c) ((C59052c) c2).mo56372aa(31674)).mo56386p("Cannot update reminder without client assigned id");
            return null;
        } else {
            C145822ab a = C99222a.m164535a(timeOfDayArgument, recurrenceArgument, locationArgument);
            a.mo122174f(new TaskIdEntity(str2, (String) null));
            a.f394341a = str;
            a.f394346f = true;
            a.mo122169a();
            return (String) m164546j(new C99226e(this, str2, a.mo122169a()), "updateReminder", Integer.valueOf(C89885b.REMINDERS_GMS_UPDATE_FAILED_VALUE));
        }
    }

    /* renamed from: d */
    public final List mo86246d(Collection collection) {
        List list = (List) m164546j(new C99232k(this, collection), "loadRemindersByIds", Integer.valueOf(C89885b.REMINDERS_GMS_LOAD_FAILED_VALUE));
        return list == null ? new ArrayList() : list;
    }

    /* renamed from: e */
    public final void mo86247e(long j) {
        this.f277612j = j;
    }

    /* renamed from: f */
    public final void mo86248f(long j) {
        this.f277613k = j;
    }

    /* renamed from: g */
    public final boolean mo86249g(String str) {
        C58976aa aaVar = C58975e.f156826a;
        if (!TextUtils.isEmpty(str)) {
            return Boolean.TRUE.equals(m164546j(new C99228g(this, str), "deleteReminder", Integer.valueOf(C89885b.REMINDERS_GMS_DELETE_FAILED_VALUE)));
        }
        C59104x c = f277603a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GmsRemindersHelper");
        ((C59052c) ((C59052c) c).mo56372aa(31680)).mo56386p("Cannot delete reminder without client assigned id");
        return false;
    }

    /* renamed from: h */
    public final boolean mo86250h(Collection collection, int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (collection.isEmpty()) {
            return true;
        }
        if (i == 1) {
            return Boolean.TRUE.equals(m164546j(new C99225d(this, collection), "archiveReminders", Integer.valueOf(C89885b.REMINDERS_GMS_UPDATE_FAILED_VALUE)));
        }
        if (i == 2) {
            return mo86251i(collection);
        }
        if (i != 3) {
            return true;
        }
        return Boolean.TRUE.equals(m164546j(new C99227f(collection), "bumpReminders", Integer.valueOf(C89885b.REMINDERS_GMS_UPDATE_FAILED_VALUE)));
    }

    /* renamed from: i */
    public final boolean mo86251i(Collection collection) {
        return Boolean.TRUE.equals(m164546j(new C99229h(this, collection), "snoozeReminders", Integer.valueOf(C89885b.REMINDERS_GMS_UPDATE_FAILED_VALUE)));
    }
}
