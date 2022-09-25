package com.google.android.libraries.assistant.auto.ondevice.p708b;

import com.google.android.apps.gsa.g.b.a;
import com.google.android.apps.gsa.p496a.p500c.C9309a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.ondevice.utils.SemanticsBuilderUtil;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15670b;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15671c;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15674f;
import com.google.assistant.p3897e.p3910e.p3911a.C51190e;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52110fp;
import com.google.assistant.p3897e.p3921j.C52115fu;
import com.google.assistant.p3897e.p3921j.C52155hg;
import com.google.assistant.p3897e.p3921j.C52159hk;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4535g.C59203do;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.p4242bp.p4243a.p4245b.C56152k;
import com.google.protos.p4850an.C63595f;
import com.google.protos.p4850an.p4855d.p4857b.C63477c;
import com.google.protos.p4850an.p4855d.p4857b.C63479e;
import com.google.protos.p4850an.p4855d.p4857b.C63481g;
import com.google.protos.p4850an.p4855d.p4857b.C63483i;
import com.google.protos.p4850an.p4855d.p4857b.C63484j;
import com.google.protos.p4850an.p4855d.p4857b.C63488n;
import com.google.protos.p4850an.p4855d.p4857b.C63490p;
import com.google.protos.p4850an.p4865e.C63591e;
import com.google.protos.p4850an.p4865e.C63593g;
import com.google.protos.p4850an.p4865e.C63594h;
import com.google.speech.grammar.pumpkin.C66525q;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.b.m */
/* compiled from: PG */
public final class C11856m implements a {

    /* renamed from: b */
    private static final C58974d f38167b = C58974d.m91134h("DeviceBuilder");

    /* renamed from: a */
    public final C9309a f38168a;

    /* renamed from: c */
    private final SemanticsBuilderUtil f38169c;

    /* renamed from: d */
    private final C86124t f38170d;

    public C11856m(SemanticsBuilderUtil semanticsBuilderUtil, C86124t tVar, C9309a aVar) {
        this.f38169c = semanticsBuilderUtil;
        this.f38170d = tVar;
        this.f38168a = aVar;
    }

    /* renamed from: d */
    public static C51195j m27584d(String str, int i, int i2, Double d, String str2) {
        C52110fp fpVar = (C52110fp) C52115fu.f136753n.createBuilder();
        fpVar.copyOnWrite();
        C52115fu fuVar = (C52115fu) fpVar.instance;
        str.getClass();
        fuVar.f136755a |= 16;
        fuVar.f136760f = str;
        fpVar.copyOnWrite();
        C52115fu fuVar2 = (C52115fu) fpVar.instance;
        fuVar2.f136757c = i - 1;
        fuVar2.f136755a |= 2;
        if (C15674f.f46797a.containsKey(str)) {
            String str3 = (String) C15674f.f46797a.get(str);
            fpVar.copyOnWrite();
            C52115fu fuVar3 = (C52115fu) fpVar.instance;
            str3.getClass();
            fuVar3.f136755a |= 64;
            fuVar3.f136762h = str3;
        }
        if (i2 != 0) {
            fpVar.copyOnWrite();
            C52115fu fuVar4 = (C52115fu) fpVar.instance;
            fuVar4.f136759e = i2 - 1;
            fuVar4.f136755a |= 8;
        }
        if (d != null) {
            double doubleValue = d.doubleValue();
            fpVar.copyOnWrite();
            C52115fu fuVar5 = (C52115fu) fpVar.instance;
            fuVar5.f136755a |= 4;
            fuVar5.f136758d = doubleValue;
        }
        C51809dy a = C15670b.m32466a("device.MODIFY_SETTING", "modify_setting_args", "assistant.api.client_op.ModifySettingArgs", fpVar.build());
        C51809dy a2 = C15669a.m32462a(str2);
        C51190e eVar = (C51190e) C51195j.f133264n.createBuilder();
        C52081en b = C15669a.m32463b(C58485gu.m89847o(a, a2), Arrays.asList(new Integer[]{36973}));
        eVar.copyOnWrite();
        C51195j jVar = (C51195j) eVar.instance;
        b.getClass();
        jVar.f133275j = b;
        jVar.f133266a |= 128;
        return (C51195j) eVar.build();
    }

    /* renamed from: e */
    private static C58833ax m27585e(C58833ax axVar, boolean z) {
        if (axVar.mo56113h()) {
            return axVar;
        }
        return z ? C58833ax.m90834k(Double.valueOf(2.0d)) : C58836b.f156633a;
    }

    /* renamed from: f */
    private static C58833ax m27586f(C63484j jVar, boolean z) {
        C63488n nVar = jVar.f171553e;
        if (nVar == null) {
            nVar = C63488n.f171563d;
        }
        if ((nVar.f171565a & 2) != 0) {
            C63488n nVar2 = jVar.f171553e;
            double d = (nVar2 == null ? C63488n.f171563d : nVar2).f171566b;
            if (nVar2 == null) {
                nVar2 = C63488n.f171563d;
            }
            if (nVar2.f171567c) {
                return m27585e(C58833ax.m90834k(Double.valueOf(d / 100.0d)), z);
            }
        }
        return m27585e(C58836b.f156633a, z);
    }

    /* renamed from: g */
    private static C58833ax m27587g(C58833ax axVar, boolean z) {
        if (axVar.mo56113h() && (((C63594h) axVar.mo56107c()).f172010a & 2) != 0) {
            try {
                return m27585e(C58833ax.m90834k(Double.valueOf(Double.parseDouble(((C63594h) axVar.mo56107c()).f172012c))), z);
            } catch (NumberFormatException e) {
                ((C58970a) ((C58970a) ((C58970a) f38167b.mo56225c()).mo56382g(e)).mo56372aa(43574)).mo56386p("DeviceSetting normalizedValue could not be parsed as a double");
            }
        }
        return m27585e(C58836b.f156633a, z);
    }

    /* renamed from: h */
    private final C58833ax m27588h() {
        C9309a aVar = this.f38168a;
        C51809dy a = C15669a.m32462a(aVar.mo17491a(aVar.f32300b).getString(R.string.okay_notification));
        if (a == null) {
            return C58836b.f156633a;
        }
        C52155hg hgVar = (C52155hg) C52159hk.f136860e.createBuilder();
        hgVar.copyOnWrite();
        C52159hk hkVar = (C52159hk) hgVar.instance;
        hkVar.f136864c = 2;
        hkVar.f136862a |= 4;
        C58485gu o = C58485gu.m89847o(a, C15670b.m32466a("media.STOP", "common_media_control_args", "assistant.api.client_op.CommonMediaControlArgs", hgVar.build()));
        C51190e eVar = (C51190e) C51195j.f133264n.createBuilder();
        C52081en b = C15669a.m32463b(o, Arrays.asList(new Integer[]{49025}));
        eVar.copyOnWrite();
        C51195j jVar = (C51195j) eVar.instance;
        b.getClass();
        jVar.f133275j = b;
        jVar.f133266a |= 128;
        return C58833ax.m90834k((C51195j) eVar.build());
    }

    /* renamed from: i */
    private static int m27589i(C63484j jVar) {
        C63488n nVar = jVar.f171553e;
        if (nVar == null) {
            nVar = C63488n.f171563d;
        }
        return nVar.f171567c ? 3 : 2;
    }

    /* renamed from: j */
    private static int m27590j(C58833ax axVar) {
        int a;
        if (!axVar.mo56113h()) {
            return 2;
        }
        int a2 = C63593g.m96257a(((C63594h) axVar.mo56107c()).f172011b);
        if ((a2 != 0 && a2 == 5) || ((a = C63593g.m96257a(((C63594h) axVar.mo56107c()).f172011b)) != 0 && a == 3)) {
            return 3;
        }
        return 2;
    }

    /* renamed from: k */
    private final C58833ax m27591k(String str, int i) {
        if (!str.equals(C63490p.WIFI.name()) && !str.equals(C63490p.BLUETOOTH.name())) {
            return C58836b.f156633a;
        }
        if (i - 1 != 1) {
            C9309a aVar = this.f38168a;
            return C58833ax.m90834k(m27584d(str, i, 0, (Double) null, aVar.mo17491a(aVar.f32300b).getString(R.string.toggle_off_setting, new Object[]{str})));
        }
        C9309a aVar2 = this.f38168a;
        return C58833ax.m90834k(m27584d(str, i, 0, (Double) null, aVar2.mo17491a(aVar2.f32300b).getString(R.string.toggle_on_setting, new Object[]{str})));
    }

    /* renamed from: l */
    private final C58833ax m27592l(String str, int i, int i2, C58833ax axVar) {
        if (!str.equals(C63490p.VOLUME_LEVEL.name()) || i != 7 || i2 != 2) {
            return axVar.mo56106b(new C11855l(this, str, i, i2));
        }
        C51190e eVar = (C51190e) C51195j.f133264n.createBuilder();
        C9309a aVar = this.f38168a;
        C52081en b = C15669a.m32463b(C58485gu.m89846n(C15669a.m32462a(aVar.mo17491a(aVar.f32300b).getString(R.string.offline_not_supported_action))), Arrays.asList(new Integer[]{23202}));
        eVar.copyOnWrite();
        C51195j jVar = (C51195j) eVar.instance;
        b.getClass();
        jVar.f133275j = b;
        jVar.f133266a |= 128;
        return C58833ax.m90834k((C51195j) eVar.build());
    }

    /* renamed from: a */
    public final C58833ax mo20230a(C61752n nVar, Query query) {
        C15671c cVar = new C15671c(nVar);
        C58833ax d = cVar.mo22499d("setting");
        char c = 65535;
        if (d.mo56113h()) {
            C58833ax c2 = cVar.mo22498c("relative_value");
            C58833ax c3 = cVar.mo22498c("absolute_value");
            if (!c3.mo56113h()) {
                C58833ax d2 = cVar.mo22499d("absolute_value");
                if (d2.mo56113h() && ((String) d2.mo56107c()).equals("MAXIMUM")) {
                    C63591e eVar = (C63591e) C63594h.f172008d.createBuilder();
                    eVar.copyOnWrite();
                    C63594h hVar = (C63594h) eVar.instance;
                    hVar.f172011b = 4;
                    hVar.f172010a |= 1;
                    eVar.copyOnWrite();
                    C63594h hVar2 = (C63594h) eVar.instance;
                    hVar2.f172010a |= 2;
                    hVar2.f172012c = "1";
                    c3 = C58833ax.m90834k((C63594h) eVar.build());
                }
                if (d2.mo56113h() && ((String) d2.mo56107c()).equals("MINIMUM")) {
                    C63591e eVar2 = (C63591e) C63594h.f172008d.createBuilder();
                    eVar2.copyOnWrite();
                    C63594h hVar3 = (C63594h) eVar2.instance;
                    hVar3.f172011b = 4;
                    hVar3.f172010a |= 1;
                    eVar2.copyOnWrite();
                    C63594h hVar4 = (C63594h) eVar2.instance;
                    hVar4.f172010a |= 2;
                    hVar4.f172012c = "0";
                    c3 = C58833ax.m90834k((C63594h) eVar2.build());
                }
            }
            String str = nVar.f166811b;
            if (true == c3.mo56113h()) {
                str = "SetDeviceSetting";
            }
            switch (str.hashCode()) {
                case -1363629390:
                    if (str.equals("TurnDeviceSettingOff")) {
                        c = 1;
                        break;
                    }
                    break;
                case -330839288:
                    if (str.equals("Decrease_device_setting")) {
                        c = 5;
                        break;
                    }
                    break;
                case -167558404:
                    if (str.equals("DecreaseDeviceSetting")) {
                        c = 4;
                        break;
                    }
                    break;
                case 94559292:
                    if (str.equals("TurnDeviceSettingOn")) {
                        c = 0;
                        break;
                    }
                    break;
                case 435378404:
                    if (str.equals("Increase_device_setting")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1370374648:
                    if (str.equals("SetDeviceSetting")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1504745432:
                    if (str.equals("IncreaseDeviceSetting")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return m27591k((String) d.mo56107c(), 2);
                case 1:
                    return m27591k((String) d.mo56107c(), 3);
                case 2:
                case 3:
                    return m27592l((String) d.mo56107c(), 5, m27590j(c2), m27587g(c2, true));
                case 4:
                case 5:
                    return m27592l((String) d.mo56107c(), 6, m27590j(c2), m27587g(c2, true));
                case 6:
                    return m27592l((String) d.mo56107c(), 7, m27590j(c3), m27587g(c3, false));
                default:
                    return C58836b.f156633a;
            }
        } else {
            String str2 = nVar.f166811b;
            int hashCode = str2.hashCode();
            if (hashCode != -1475640849) {
                if (hashCode != -1183163064) {
                    if (hashCode == 2587682 && str2.equals("Stop")) {
                        c = 0;
                    }
                } else if (str2.equals("UnmuteDevice")) {
                    c = 2;
                }
            } else if (str2.equals("MuteDevice")) {
                c = 1;
            }
            if (c == 0) {
                return m27588h();
            }
            if (c == 1) {
                return m27592l(C63490p.VOLUME_LEVEL.name(), 7, 3, C58833ax.m90834k(Double.valueOf(C59203do.f157270a)));
            }
            if (c != 2) {
                return C58836b.f156633a;
            }
            return m27592l(C63490p.VOLUME_LEVEL.name(), 7, 3, C58833ax.m90834k(Double.valueOf(this.f38170d.mo79747m(C90086ek.f250271W))));
        }
    }

    /* renamed from: b */
    public final C60870cx mo20231b(C66525q qVar, Query query) {
        C63484j jVar;
        Object obj;
        int b;
        int a;
        if (qVar == null) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        C58833ax a2 = this.f38169c.mo20311a(qVar, C56152k.f149611f);
        if (!a2.mo56113h()) {
            jVar = null;
        } else {
            a2.mo56107c();
            jVar = (C63484j) C15669a.m32464c((C63595f) a2.mo56107c(), C63484j.f171547g);
        }
        if (jVar == null) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        int a3 = C63479e.m96246a(jVar.f171550b);
        if (a3 != 0 && a3 == 7 && jVar.f171552d.size() > 0 && (a = C63483i.m96248a(jVar.f171552d.mo58914d(0))) != 0 && a == 6) {
            obj = m27588h();
        } else {
            if (this.f38170d.mo79746e(C90086ek.f250363bi)) {
                int i = jVar.f171549a;
                int b2 = C63477c.m96245b(i);
                int i2 = 1;
                if ((b2 != 0 && b2 == 3) || ((b = C63477c.m96245b(i)) != 0 && b == 2)) {
                    int a4 = C63479e.m96246a(jVar.f171550b);
                    if (a4 == 0) {
                        a4 = 1;
                    }
                    int i3 = a4 - 1;
                    if (i3 == 1) {
                        int b3 = C63477c.m96245b(i);
                        if (b3 != 0) {
                            i2 = b3;
                        }
                        obj = m27591k(C63477c.m96244a(i2), 2);
                    } else if (i3 != 2) {
                        obj = C58836b.f156633a;
                    } else {
                        int b4 = C63477c.m96245b(i);
                        if (b4 != 0) {
                            i2 = b4;
                        }
                        obj = m27591k(C63477c.m96244a(i2), 3);
                    }
                } else {
                    int b5 = C63477c.m96245b(i);
                    if (b5 != 0 && b5 == 8) {
                        C63490p pVar = C63490p.VOLUME_LEVEL;
                        if (jVar.f171552d.size() == 1) {
                            int a5 = C63483i.m96248a(jVar.f171552d.mo58914d(0));
                            if (a5 == 0) {
                                a5 = 1;
                            }
                            int i4 = a5 - 1;
                            if (i4 == 1 || i4 == 10) {
                                pVar = C63490p.RING_VOLUME;
                            } else if (i4 == 3) {
                                pVar = C63490p.MEDIA_VOLUME;
                            } else if (i4 == 4) {
                                pVar = C63490p.ALARM_VOLUME;
                            }
                        }
                        String name = pVar.name();
                        int a6 = C63481g.m96247a(jVar.f171551c);
                        if (a6 == 0) {
                            a6 = 1;
                        }
                        int i5 = a6 - 1;
                        obj = i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? m27592l(name, 7, m27589i(jVar), m27586f(jVar, false)) : m27592l(name, 7, 3, C58833ax.m90834k(Double.valueOf(C59203do.f157270a))) : m27592l(name, 7, 3, C58833ax.m90834k(Double.valueOf(1.0d))) : m27592l(name, 6, m27589i(jVar), m27586f(jVar, true)) : m27592l(name, 5, m27589i(jVar), m27586f(jVar, true));
                    }
                }
            }
            obj = C58836b.f156633a;
        }
        return C60856cj.m92900i(obj);
    }

    /* renamed from: c */
    public final C60870cx mo20232c(C52081en enVar) {
        return C60856cj.m92900i(C58833ax.m90834k(C52081en.f136679i));
    }
}
