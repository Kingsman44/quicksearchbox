package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1144b;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.ondevice.p705a.C11836c;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.C15593a;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15658j;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15666r;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15668t;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15670b;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15671c;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15674f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52110fp;
import com.google.assistant.p3897e.p3921j.C52115fu;
import com.google.assistant.p3897e.p3921j.C52155hg;
import com.google.assistant.p3897e.p3921j.C52159hk;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4850an.p4855d.p4857b.C63484j;
import com.google.protos.p4850an.p4855d.p4857b.C63488n;
import com.google.protos.p4850an.p4855d.p4857b.C63490p;
import com.google.protos.p4850an.p4865e.C63594h;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.a.b.f */
/* compiled from: PG */
public final class C15602f implements C15593a {

    /* renamed from: a */
    public static final C59071e f46648a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.r.c.a.b.f");

    /* renamed from: b */
    public final C69464a f46649b;

    /* renamed from: c */
    public final C69464a f46650c;

    /* renamed from: d */
    private final C69464a f46651d;

    /* renamed from: e */
    private final Executor f46652e;

    /* renamed from: f */
    private final C11836c f46653f;

    public C15602f(C69464a aVar, C69464a aVar2, C69464a aVar3, C11836c cVar, Executor executor) {
        this.f46649b = aVar;
        this.f46650c = aVar2;
        this.f46651d = aVar3;
        this.f46653f = cVar;
        this.f46652e = executor;
    }

    /* renamed from: b */
    public static C58833ax m32337b(C58833ax axVar, boolean z) {
        if (axVar.mo56113h()) {
            return axVar;
        }
        return z ? C58833ax.m90834k(Double.valueOf(-1.0d)) : C58836b.f156633a;
    }

    /* renamed from: c */
    public static C58833ax m32338c(C63484j jVar, boolean z) {
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
                return m32337b(C58833ax.m90834k(Double.valueOf(d / 100.0d)), z);
            }
        }
        return m32337b(C58836b.f156633a, z);
    }

    /* renamed from: d */
    public static C58833ax m32339d(C58833ax axVar, boolean z) {
        if (axVar.mo56113h() && (((C63594h) axVar.mo56107c()).f172010a & 2) != 0) {
            try {
                return m32337b(C58833ax.m90834k(Double.valueOf(Double.parseDouble(((C63594h) axVar.mo56107c()).f172012c))), z);
            } catch (NumberFormatException e) {
                C59104x c = f46648a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "DeviceActionFulfiller");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(46180)).mo56386p("DeviceSetting normalizedValue could not be parsed as a double");
            }
        }
        return m32337b(C58836b.f156633a, z);
    }

    /* renamed from: f */
    public static boolean m32340f(String str, C15671c cVar) {
        C58833ax d = cVar.mo22499d("absolute_value");
        if (d.mo56113h() && ((String) d.mo56107c()).equals(str)) {
            return true;
        }
        C58833ax d2 = cVar.mo22496a("absolute_value").mo22499d("scale_enum_value");
        if (!d2.mo56113h() || !((String) d2.mo56107c()).equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static int m32341g(C63484j jVar) {
        C63488n nVar = jVar.f171553e;
        if (nVar == null) {
            nVar = C63488n.f171563d;
        }
        return nVar.f171567c ? 3 : 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = com.google.protos.p4850an.p4865e.C63593g.m96257a(((com.google.protos.p4850an.p4865e.C63594h) r1.mo56107c()).f172011b);
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m32342h(com.google.common.base.C58833ax r1) {
        /*
            boolean r0 = r1.mo56113h()
            if (r0 == 0) goto L_0x001a
            java.lang.Object r1 = r1.mo56107c()
            com.google.protos.an.e.h r1 = (com.google.protos.p4850an.p4865e.C63594h) r1
            int r1 = r1.f172011b
            int r1 = com.google.protos.p4850an.p4865e.C63593g.m96257a(r1)
            if (r1 != 0) goto L_0x0015
            goto L_0x001a
        L_0x0015:
            r0 = 5
            if (r1 != r0) goto L_0x001a
            r1 = 3
            return r1
        L_0x001a:
            r1 = 2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1144b.C15602f.m32342h(com.google.common.base.ax):int");
    }

    /* renamed from: k */
    private final C60870cx m32343k(String str, int i, int i2, Double d, C60870cx cxVar) {
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
            String str2 = (String) C15674f.f46797a.get(str);
            fpVar.copyOnWrite();
            C52115fu fuVar3 = (C52115fu) fpVar.instance;
            str2.getClass();
            fuVar3.f136755a |= 64;
            fuVar3.f136762h = str2;
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
        return C60922j.m93044g(cxVar, C47810es.m84963c(new C15599c(C15670b.m32466a("device.MODIFY_SETTING", "modify_setting_args", "assistant.api.client_op.ModifySettingArgs", fpVar.build()))), this.f46652e);
    }

    /* renamed from: a */
    public final C15668t mo22414a(C15666r rVar) {
        C15598b bVar = new C15598b(this, rVar);
        C60870cx n = C60856cj.m92905n(C47810es.m84965e(bVar), this.f46652e);
        C15658j jVar = new C15658j();
        jVar.f46787a = n;
        return jVar.mo22491a();
    }

    /* renamed from: e */
    public final C60870cx mo22416e() {
        C52155hg hgVar = (C52155hg) C52159hk.f136860e.createBuilder();
        hgVar.copyOnWrite();
        C52159hk hkVar = (C52159hk) hgVar.instance;
        hkVar.f136864c = 2;
        hkVar.f136862a |= 4;
        C51809dy a = C15670b.m32466a("media.STOP", "common_media_control_args", "assistant.api.client_op.CommonMediaControlArgs", hgVar.build());
        return C60922j.m93044g(this.f46653f.mo20177a(R.string.notification_okay), C47810es.m84963c(new C15597a(a)), this.f46652e);
    }

    /* renamed from: i */
    public final C60870cx mo22417i(String str, int i) {
        if (!str.equals(C63490p.WIFI.name()) && !str.equals(C63490p.BLUETOOTH.name())) {
            return C60856cj.m92900i(C58833ax.m90834k(C51195j.f133264n));
        }
        if (i - 1 != 1) {
            return m32343k(str, i, 0, (Double) null, this.f46653f.mo20178b(R.string.setting_toggle_off, str));
        }
        return m32343k(str, i, 0, (Double) null, this.f46653f.mo20178b(R.string.setting_toggle_on, str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007f, code lost:
        if (r2 <= (r4 / 100.0d)) goto L_0x00a4;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo22418j(java.lang.String r9, int r10, int r11, com.google.common.base.C58833ax r12) {
        /*
            r8 = this;
            com.google.protos.an.d.b.p r0 = com.google.protos.p4850an.p4855d.p4857b.C63490p.VOLUME_LEVEL
            java.lang.String r0 = r0.name()
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 3
            if (r11 == r0) goto L_0x0042
            boolean r0 = r12.mo56113h()
            if (r0 == 0) goto L_0x002c
            boolean r0 = r12.mo56113h()
            if (r0 == 0) goto L_0x0042
            java.lang.Object r0 = r12.mo56107c()
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x002c
            goto L_0x0042
        L_0x002c:
            com.google.android.libraries.assistant.auto.ondevice.a.c r9 = r8.f46653f
            r10 = 2132091729(0x7f152351, float:1.9823834E38)
            com.google.common.util.concurrent.cx r9 = r9.mo20177a(r10)
            com.google.android.libraries.assistant.auto.tng.r.c.a.b.d r10 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1144b.C15600d.f46646a
            java.util.concurrent.Executor r11 = r8.f46652e
            com.google.common.base.ah r10 = com.google.apps.tiktok.tracing.C47810es.m84963c(r10)
            com.google.common.util.concurrent.cx r9 = com.google.common.util.concurrent.C60922j.m93044g(r9, r10, r11)
            return r9
        L_0x0042:
            r0 = 7
            r1 = 5
            if (r10 == r0) goto L_0x0048
            if (r10 != r1) goto L_0x00a4
        L_0x0048:
            boolean r0 = r12.mo56113h()
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r0 = r12.mo56107c()
            java.lang.Double r0 = (java.lang.Double) r0
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0082
            java.lang.Object r0 = r12.mo56107c()
            java.lang.Double r0 = (java.lang.Double) r0
            double r2 = r0.doubleValue()
            g.a.a r0 = r8.f46651d
            java.lang.Object r0 = r0.mo17428b()
            java.lang.Long r0 = (java.lang.Long) r0
            long r4 = r0.longValue()
            double r4 = (double) r4
            r6 = 4636737291354636288(0x4059000000000000, double:100.0)
            java.lang.Double.isNaN(r4)
            double r4 = r4 / r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0082
            goto L_0x00a4
        L_0x0082:
            com.google.android.libraries.assistant.auto.ondevice.a.c r9 = r8.f46653f
            r10 = 1
            java.lang.Object[] r10 = new java.lang.Object[r10]
            g.a.a r11 = r8.f46651d
            java.lang.Object r11 = r11.mo17428b()
            r12 = 0
            r10[r12] = r11
            r11 = 2132091734(0x7f152356, float:1.9823845E38)
            com.google.common.util.concurrent.cx r9 = r9.mo20178b(r11, r10)
            com.google.android.libraries.assistant.auto.tng.r.c.a.b.e r10 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1144b.C15601e.f46647a
            java.util.concurrent.Executor r11 = r8.f46652e
            com.google.common.base.ah r10 = com.google.apps.tiktok.tracing.C47810es.m84963c(r10)
            com.google.common.util.concurrent.cx r9 = com.google.common.util.concurrent.C60922j.m93044g(r9, r10, r11)
            return r9
        L_0x00a4:
            r0 = 2
            if (r11 != r0) goto L_0x00ca
            if (r10 == r1) goto L_0x00ac
            r0 = 6
            if (r10 != r0) goto L_0x00ca
        L_0x00ac:
            java.lang.Object r0 = r12.mo56107c()
            java.lang.Double r0 = (java.lang.Double) r0
            r1 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.Double r3 = java.lang.Double.valueOf(r1)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00ca
            double r0 = java.lang.Math.abs(r1)
            java.lang.Double r12 = java.lang.Double.valueOf(r0)
            com.google.common.base.ax r12 = com.google.common.base.C58833ax.m90834k(r12)
        L_0x00ca:
            java.lang.Object r12 = r12.mo56111f()
            r4 = r12
            java.lang.Double r4 = (java.lang.Double) r4
            com.google.android.libraries.assistant.auto.ondevice.a.c r12 = r8.f46653f
            r0 = 2132090203(0x7f151d5b, float:1.982074E38)
            com.google.common.util.concurrent.cx r5 = r12.mo20177a(r0)
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            com.google.common.util.concurrent.cx r9 = r0.m32343k(r1, r2, r3, r4, r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1144b.C15602f.mo22418j(java.lang.String, int, int, com.google.common.base.ax):com.google.common.util.concurrent.cx");
    }
}
