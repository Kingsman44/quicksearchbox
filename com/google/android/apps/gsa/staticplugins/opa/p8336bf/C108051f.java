package com.google.android.apps.gsa.staticplugins.opa.p8336bf;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8292e.C107299b;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8292e.C107304g;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109248v;
import com.google.android.apps.gsa.staticplugins.opa.p8408q.C109951a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.search.p3003h.p3004a.C38400d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58880cq;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62971cq;
import com.google.protos.p4985f.p5042u.C65342d;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bf.f */
/* compiled from: PG */
public final class C108051f {

    /* renamed from: a */
    public static final C59071e f300560a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.bf.f");

    /* renamed from: b */
    public final C86124t f300561b;

    /* renamed from: c */
    public final C91097g f300562c;

    /* renamed from: d */
    public final C58833ax f300563d;

    /* renamed from: e */
    public final C68214a f300564e;

    /* renamed from: f */
    public final C68214a f300565f;

    /* renamed from: g */
    public final Activity f300566g;

    /* renamed from: h */
    public final Context f300567h;

    /* renamed from: i */
    public final C39141kp f300568i;

    /* renamed from: j */
    private final C58833ax f300569j;

    /* renamed from: k */
    private final C58833ax f300570k;

    /* renamed from: l */
    private final C107698i f300571l;

    /* renamed from: m */
    private final C58833ax f300572m;

    /* renamed from: n */
    private final C68214a f300573n;

    /* renamed from: o */
    private final C38400d f300574o;

    /* renamed from: p */
    private final C109248v f300575p;

    /* renamed from: q */
    private final boolean f300576q;

    /* renamed from: r */
    private final C58833ax f300577r;

    /* renamed from: s */
    private final C58833ax f300578s;

    /* renamed from: t */
    private final C68214a f300579t;

    /* renamed from: u */
    private final C22871g f300580u;

    /* renamed from: v */
    private final C107299b f300581v;

    /* renamed from: w */
    private final C107304g f300582w;

    /* renamed from: x */
    private final C109951a f300583x;

    public C108051f(C58833ax axVar, C58833ax axVar2, C91097g gVar, C58833ax axVar3, C58833ax axVar4, C58833ax axVar5, C68214a aVar, C68214a aVar2, C68214a aVar3, C107698i iVar, C109248v vVar, Activity activity, C109951a aVar4, C86124t tVar, C22871g gVar2, boolean z, C38400d dVar, C58833ax axVar6, C68214a aVar5, C39141kp kpVar) {
        C86124t tVar2 = tVar;
        this.f300561b = tVar2;
        this.f300573n = aVar;
        this.f300569j = axVar;
        this.f300570k = axVar2;
        this.f300562c = gVar;
        this.f300571l = iVar;
        this.f300563d = axVar3;
        this.f300572m = axVar4;
        this.f300575p = vVar;
        this.f300566g = activity;
        this.f300565f = aVar3;
        this.f300583x = aVar4;
        Context applicationContext = activity.getApplicationContext();
        this.f300567h = applicationContext;
        this.f300576q = z;
        this.f300577r = axVar5;
        this.f300580u = gVar2;
        this.f300564e = aVar2;
        this.f300574o = dVar;
        this.f300578s = axVar6;
        this.f300579t = aVar5;
        this.f300581v = new C107299b(iVar, tVar2);
        this.f300582w = new C107304g(applicationContext);
        this.f300568i = kpVar;
    }

    /* renamed from: a */
    public static String m179381a(List list) {
        Iterator it = list.iterator();
        String str = BuildConfig.FLAVOR;
        while (it.hasNext()) {
            C65342d dVar = (C65342d) it.next();
            C62971cq cqVar = dVar.f176705d;
            Object[] objArr = new Object[5];
            objArr[0] = "style=\"padding-left:2em\"";
            objArr[1] = true != dVar.f176703b ? BuildConfig.FLAVOR : " open";
            objArr[2] = TextUtils.htmlEncode(dVar.f176702a);
            objArr[3] = TextUtils.htmlEncode(dVar.f176704c);
            objArr[4] = m179381a(cqVar);
            str = str.concat(String.valueOf(String.format("<details %s%s><summary><b>%s: </b></summary>%s<br>%s</details>", objArr)));
        }
        return str;
    }

    /* renamed from: b */
    protected static String m179382b(C65342d dVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar);
        return m179383d(arrayList, 0);
    }

    /* renamed from: d */
    private static String m179383d(List list, int i) {
        String b = C58880cq.m90966b("  ", i);
        Iterator it = list.iterator();
        String str = BuildConfig.FLAVOR;
        while (it.hasNext()) {
            C65342d dVar = (C65342d) it.next();
            str = str.concat(String.valueOf(String.format("%s%s: %s\n%s", new Object[]{b, dVar.f176702a, dVar.f176704c, m179383d(dVar.f176705d, 1 + i)})));
        }
        return str;
    }

    /* JADX WARNING: type inference failed for: r4v69, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96383c(com.google.android.apps.gsa.staticplugins.opa.chatui.C108430ik r17) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            com.google.common.base.ax r0 = r1.f300570k
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0017
            com.google.common.base.ax r0 = r1.f300570k
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.oh r0 = (com.google.android.apps.gsa.staticplugins.opa.C109762oh) r0
            r0.mo98097d()
        L_0x0017:
            dagger.a r0 = r1.f300573n
            java.lang.Object r0 = r0.mo27525b()
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            com.google.android.apps.gsa.search.core.i.t r3 = r1.f300561b
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C89978aq.f246612k
            boolean r3 = r3.mo79746e(r4)
            if (r3 == 0) goto L_0x0054
            boolean r3 = r0.mo56113h()
            if (r3 == 0) goto L_0x0054
            com.google.android.libraries.logging.j r3 = r2.f301597d
            com.google.common.o.l.m r3 = r3.f76973a
            com.google.protobuf.bv r3 = r3.instance
            com.google.common.o.l.n r3 = (com.google.common.p4552o.p4566l.C60214n) r3
            int r3 = r3.f162918c
            r4 = 149769(0x24909, float:2.09871E-40)
            if (r3 != r4) goto L_0x0054
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.q.a.h r0 = (com.google.android.apps.gsa.p6482q.p6483a.C84235h) r0
            r3 = 7001(0x1b59, float:9.81E-42)
            com.google.common.util.concurrent.cx r0 = r0.mo77720j(r3)
            com.google.android.apps.gsa.staticplugins.opa.bf.d r3 = new com.google.android.apps.gsa.staticplugins.opa.bf.d
            r3.<init>()
            com.google.common.util.concurrent.bg r4 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.C60856cj.m92911t(r0, r3, r4)
        L_0x0054:
            com.google.android.libraries.f.a r0 = r2.f301599f
            if (r0 == 0) goto L_0x0079
            com.google.android.apps.gsa.search.core.i.t r3 = r2.f301600g
            if (r3 != 0) goto L_0x005d
            goto L_0x0079
        L_0x005d:
            long r3 = r0.mo26871c()
            long r5 = r2.f301603j
            com.google.android.apps.gsa.search.core.i.t r0 = r2.f301600g
            r0.getClass()
            com.google.android.apps.gsa.shared.m.f r7 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247725ma
            long r7 = r0.mo79743a(r7)
            int r0 = (int) r7
            long r7 = (long) r0
            long r5 = r5 + r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0078
            r2.f301603j = r3
            goto L_0x0079
        L_0x0078:
            return
        L_0x0079:
            boolean r0 = r2 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108390gy
            java.lang.String r3 = "This instance of SuggestionTapController does not support text queries."
            r5 = 0
            r6 = 2
            r8 = 1
            if (r0 == 0) goto L_0x0138
            java.lang.String r0 = r17.mo96708f()
            if (r0 == 0) goto L_0x0427
            com.google.common.base.ax r9 = r1.f300578s
            boolean r9 = r9.mo56113h()
            if (r9 == 0) goto L_0x00bd
            com.google.common.base.ax r9 = r1.f300578s
            java.lang.Object r9 = r9.mo56107c()
            com.google.android.apps.gsa.nga.api.bp r9 = (com.google.android.apps.gsa.nga.api.C74715bp) r9
            boolean r9 = r9.mo71084e()
            if (r9 == 0) goto L_0x00bd
            com.google.android.apps.gsa.search.core.i.t r9 = r1.f300561b
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247330fC
            boolean r9 = r9.mo79746e(r10)
            if (r9 != 0) goto L_0x00a9
            goto L_0x00bd
        L_0x00a9:
            dagger.a r3 = r1.f300579t
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.bb.c.j r3 = (com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8322c.C107759j) r3
            com.google.android.apps.gsa.assistant.shared.l.e r4 = r2.f301604k
            com.google.android.libraries.logging.j r2 = r2.f301597d
            java.lang.String r2 = com.google.android.apps.gsa.staticplugins.opa.util.C113861cp.m188491a(r2)
            r3.mo96273i(r0, r4, r2)
            return
        L_0x00bd:
            com.google.common.base.ax r9 = r1.f300569j
            boolean r9 = r9.mo56113h()
            if (r9 == 0) goto L_0x012b
            com.google.common.base.ax r3 = r1.f300569j
            java.lang.Object r3 = r3.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.fm r3 = (com.google.android.apps.gsa.staticplugins.opa.C109043fm) r3
            r3.mo97550w(r2)
            com.google.common.base.ax r3 = r1.f300570k
            boolean r3 = r3.mo56113h()
            if (r3 == 0) goto L_0x0128
            com.google.common.base.ax r3 = r1.f300570k
            java.lang.Object r3 = r3.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.oh r3 = (com.google.android.apps.gsa.staticplugins.opa.C109762oh) r3
            java.util.List r3 = r3.mo98095a()
            if (r3 == 0) goto L_0x0128
            com.google.common.base.ax r3 = r1.f300570k
            java.lang.Object r3 = r3.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.oh r3 = (com.google.android.apps.gsa.staticplugins.opa.C109762oh) r3
            java.util.List r3 = r3.mo98095a()
            boolean r3 = r3.contains(r2)
            if (r3 == 0) goto L_0x0128
            com.google.common.o.uf r3 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.common.o.tz r3 = (com.google.common.p4552o.C60548tz) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r8 = r3.instance
            com.google.common.o.uf r8 = (com.google.common.p4552o.C60555uf) r8
            int r9 = r8.f164093a
            r6 = r6 | r9
            r8.f164093a = r6
            r6 = 821(0x335, float:1.15E-42)
            r8.f164258m = r6
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.common.o.uf r6 = (com.google.common.p4552o.C60555uf) r6
            int r8 = r6.f164249d
            r8 = r8 | 64
            r6.f164249d = r8
            r6.f164133an = r0
            com.google.protobuf.bv r0 = r3.build()
            com.google.common.o.uf r0 = (com.google.common.p4552o.C60555uf) r0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r0, r5, r5, r5)
        L_0x0128:
            r8 = 0
            goto L_0x0427
        L_0x012b:
            com.google.common.f.e r0 = f300560a
            com.google.common.f.x r0 = r0.mo56226d()
            r6 = 27037(0x699d, float:3.7887E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r6)).mo56386p(r3)
            goto L_0x0427
        L_0x0138:
            boolean r0 = r2 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108229b
            if (r0 == 0) goto L_0x042c
            com.google.common.base.ax r0 = r1.f300578s
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0175
            com.google.common.base.ax r0 = r1.f300578s
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.nga.api.bp r0 = (com.google.android.apps.gsa.nga.api.C74715bp) r0
            boolean r0 = r0.mo71084e()
            if (r0 == 0) goto L_0x0175
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f300561b
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247330fC
            boolean r0 = r0.mo79746e(r3)
            if (r0 != 0) goto L_0x015d
            goto L_0x0175
        L_0x015d:
            dagger.a r0 = r1.f300579t
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.bb.c.j r0 = (com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8322c.C107759j) r0
            java.lang.String r3 = r17.mo96708f()
            com.google.android.apps.gsa.assistant.shared.l.e r4 = r2.f301604k
            com.google.android.libraries.logging.j r2 = r2.f301597d
            java.lang.String r2 = com.google.android.apps.gsa.staticplugins.opa.util.C113861cp.m188491a(r2)
            r0.mo96273i(r3, r4, r2)
            return
        L_0x0175:
            boolean r0 = r2 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108245bp
            r3 = 3
            if (r0 == 0) goto L_0x0397
            r0 = r2
            com.google.android.apps.gsa.staticplugins.opa.chatui.bp r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108245bp) r0
            com.google.assistant.e.j.e.gr r0 = r0.f301106a
            int r9 = r0.f136447a
            r9 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r9 == 0) goto L_0x0190
            com.google.assistant.e.j.e.ib r0 = r0.f136461o
            if (r0 != 0) goto L_0x018b
            com.google.assistant.e.j.e.ib r0 = com.google.assistant.p3897e.p3921j.p3926e.C52030ib.f136561a
        L_0x018b:
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x0192
        L_0x0190:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x0192:
            r9 = r0
            boolean r0 = r9.mo56113h()
            if (r0 == 0) goto L_0x0397
            com.google.android.apps.gsa.staticplugins.opa.appactions.e.b r10 = r1.f300581v
            java.lang.Object r0 = r9.mo56107c()
            com.google.assistant.e.j.e.ib r0 = (com.google.assistant.p3897e.p3921j.p3926e.C52030ib) r0
            r11 = r2
            com.google.android.apps.gsa.staticplugins.opa.chatui.b r11 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108229b) r11
            java.lang.String r11 = r11.mo96697b()
            java.lang.String r12 = r17.mo96708f()
            com.google.android.apps.gsa.search.core.i.t r13 = r10.f298621b
            com.google.android.apps.gsa.shared.m.d r14 = com.google.android.apps.gsa.shared.p7066m.C90019by.f248090x
            boolean r13 = r13.mo79746e(r14)
            if (r13 != 0) goto L_0x01b8
            goto L_0x030b
        L_0x01b8:
            com.google.protobuf.ba r13 = new com.google.protobuf.ba
            r13.<init>()
            com.google.protobuf.bt r14 = com.google.assistant.p3825an.p3830c.p3831a.C49299br.f127414i
            r13.mo58832e(r14)
            byte[] r0 = r0.toByteArray()     // Catch:{ ct -> 0x01eb }
            com.google.assistant.e.j.e.ib r14 = com.google.assistant.p3897e.p3921j.p3926e.C52030ib.f136561a     // Catch:{ ct -> 0x01eb }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r14, (byte[]) r0, (com.google.protobuf.C62921ba) r13)     // Catch:{ ct -> 0x01eb }
            com.google.assistant.e.j.e.ib r0 = (com.google.assistant.p3897e.p3921j.p3926e.C52030ib) r0     // Catch:{ ct -> 0x01eb }
            com.google.protobuf.bt r13 = com.google.assistant.p3825an.p3830c.p3831a.C49299br.f127414i     // Catch:{ ct -> 0x01eb }
            com.google.protobuf.bt r13 = com.google.protobuf.C62942bv.checkIsLite(r13)     // Catch:{ ct -> 0x01eb }
            r0.mo58887l(r13)     // Catch:{ ct -> 0x01eb }
            com.google.protobuf.bf r0 = r0.f169962ag     // Catch:{ ct -> 0x01eb }
            com.google.protobuf.bs r14 = r13.f169971d     // Catch:{ ct -> 0x01eb }
            java.lang.Object r0 = r0.mo58854l(r14)     // Catch:{ ct -> 0x01eb }
            if (r0 != 0) goto L_0x01e4
            java.lang.Object r0 = r13.f169969b     // Catch:{ ct -> 0x01eb }
            goto L_0x01e8
        L_0x01e4:
            java.lang.Object r0 = r13.mo58889c(r0)     // Catch:{ ct -> 0x01eb }
        L_0x01e8:
            com.google.assistant.an.c.a.br r0 = (com.google.assistant.p3825an.p3830c.p3831a.C49299br) r0     // Catch:{ ct -> 0x01eb }
            goto L_0x0202
        L_0x01eb:
            r0 = move-exception
            com.google.common.f.e r13 = com.google.android.apps.gsa.staticplugins.opa.appactions.p8292e.C107299b.f298620a
            com.google.common.f.x r13 = r13.mo56226d()
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r15 = "AASuggestionHandler"
            r13.mo56378ag(r14, r15)
            java.lang.String r14 = "Fail to parse NotificationData"
            r15 = 23562(0x5c0a, float:3.3017E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56382g(r0)).mo56372aa(r15)).mo56386p(r14)
            com.google.assistant.an.c.a.br r0 = com.google.assistant.p3825an.p3830c.p3831a.C49299br.f127413h
        L_0x0202:
            int r13 = r0.f127417b
            int r13 = com.google.assistant.p3825an.p3830c.p3831a.C49298bq.m85410a(r13)
            if (r13 != 0) goto L_0x020b
            r13 = 1
        L_0x020b:
            int r13 = r13 + -1
            r14 = 4
            if (r13 == r8) goto L_0x022c
            if (r13 == r6) goto L_0x0221
            if (r13 == r3) goto L_0x0216
            goto L_0x030b
        L_0x0216:
            com.google.assistant.an.c.a.bn r0 = r0.f127420e
            if (r0 != 0) goto L_0x021c
            com.google.assistant.an.c.a.bn r0 = com.google.assistant.p3825an.p3830c.p3831a.C49295bn.f127404f
        L_0x021c:
            r10.mo95898b(r14, r0)
            goto L_0x030b
        L_0x0221:
            com.google.assistant.an.c.a.bn r0 = r0.f127420e
            if (r0 != 0) goto L_0x0227
            com.google.assistant.an.c.a.bn r0 = com.google.assistant.p3825an.p3830c.p3831a.C49295bn.f127404f
        L_0x0227:
            r10.mo95898b(r3, r0)
            goto L_0x030b
        L_0x022c:
            com.google.android.apps.gsa.search.core.i.t r13 = r10.f298621b
            com.google.android.apps.gsa.shared.m.d r15 = com.google.android.apps.gsa.shared.p7066m.C90019by.f248077k
            boolean r13 = r13.mo79746e(r15)
            if (r13 == 0) goto L_0x030b
            com.google.android.apps.gsa.search.shared.service.b.aa r13 = com.google.android.apps.gsa.search.shared.service.p6935b.C87692aa.f237046e
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.z r13 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88366z) r13
            int r15 = r0.f127416a
            r15 = r15 & 16
            if (r15 == 0) goto L_0x0257
            java.lang.String r15 = r0.f127421f
            r13.copyOnWrite()
            com.google.protobuf.bv r5 = r13.instance
            com.google.android.apps.gsa.search.shared.service.b.aa r5 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87692aa) r5
            r15.getClass()
            int r7 = r5.f237048a
            r7 = r7 | r8
            r5.f237048a = r7
            r5.f237049b = r15
        L_0x0257:
            com.google.android.apps.gsa.search.shared.service.b.ab r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C87693ab.f237115j
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.w r5 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88285w) r5
            com.google.assistant.at.ak r7 = r0.f127418c
            if (r7 != 0) goto L_0x0265
            com.google.assistant.at.ak r7 = com.google.assistant.p3861at.C49826ak.f129462q
        L_0x0265:
            java.lang.String r15 = r7.f129471h
            boolean r15 = r15.isEmpty()
            if (r15 == 0) goto L_0x028c
            com.google.protobuf.bn r7 = r7.toBuilder()
            com.google.assistant.at.ah r7 = (com.google.assistant.p3861at.C49823ah) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r15 = r7.instance
            com.google.assistant.at.ak r15 = (com.google.assistant.p3861at.C49826ak) r15
            r12.getClass()
            int r4 = r15.f129464a
            r4 = r4 | 32
            r15.f129464a = r4
            r15.f129471h = r12
            com.google.protobuf.bv r4 = r7.build()
            r7 = r4
            com.google.assistant.at.ak r7 = (com.google.assistant.p3861at.C49826ak) r7
        L_0x028c:
            r5.copyOnWrite()
            com.google.protobuf.bv r4 = r5.instance
            com.google.android.apps.gsa.search.shared.service.b.ab r4 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87693ab) r4
            r7.getClass()
            r4.f237119c = r7
            int r7 = r4.f237117a
            r7 = r7 | r6
            r4.f237117a = r7
            com.google.assistant.at.aw r4 = r0.f127419d
            if (r4 != 0) goto L_0x02a3
            com.google.assistant.at.aw r4 = com.google.assistant.p3861at.C49838aw.f129504g
        L_0x02a3:
            java.lang.String r4 = r4.f129507b
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.android.apps.gsa.search.shared.service.b.ab r7 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87693ab) r7
            r4.getClass()
            int r12 = r7.f237117a
            r12 = r12 | r14
            r7.f237117a = r12
            r7.f237120d = r4
            r5.copyOnWrite()
            com.google.protobuf.bv r4 = r5.instance
            com.google.android.apps.gsa.search.shared.service.b.ab r4 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87693ab) r4
            r4.f237122f = r8
            int r7 = r4.f237117a
            r7 = r7 | 16
            r4.f237117a = r7
            com.google.assistant.at.aw r0 = r0.f127419d
            if (r0 != 0) goto L_0x02cb
            com.google.assistant.at.aw r0 = com.google.assistant.p3861at.C49838aw.f129504g
        L_0x02cb:
            java.lang.String r4 = r0.f129509d
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x02d8
            java.lang.String r0 = com.google.common.base.C58837ba.m90858g(r11)
            goto L_0x02da
        L_0x02d8:
            java.lang.String r0 = r0.f129509d
        L_0x02da:
            r13.copyOnWrite()
            com.google.protobuf.bv r4 = r13.instance
            com.google.android.apps.gsa.search.shared.service.b.aa r4 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87692aa) r4
            r0.getClass()
            int r7 = r4.f237048a
            r6 = r6 | r7
            r4.f237048a = r6
            r4.f237050c = r0
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.android.apps.gsa.search.shared.service.b.ab r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87693ab) r0
            com.google.protobuf.bv r4 = r13.build()
            com.google.android.apps.gsa.search.shared.service.b.aa r4 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87692aa) r4
            r4.getClass()
            r0.f237118b = r4
            int r4 = r0.f237117a
            r4 = r4 | r8
            r0.f237117a = r4
            com.google.protobuf.bv r0 = r5.build()
            com.google.android.apps.gsa.search.shared.service.b.ab r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87693ab) r0
            r10.mo95897a(r0)
        L_0x030b:
            java.lang.Object r0 = r9.mo56107c()
            com.google.assistant.e.j.e.ib r0 = (com.google.assistant.p3897e.p3921j.p3926e.C52030ib) r0
            com.google.protobuf.bt r4 = com.google.protos.p4985f.p5042u.C65358t.f177747d
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r0.mo58887l(r4)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r4 = r4.f169971d
            boolean r0 = r0.mo58857o(r4)
            if (r0 == 0) goto L_0x0397
            com.google.android.apps.gsa.staticplugins.opa.appactions.e.g r2 = r1.f300582w
            java.lang.Object r0 = r9.mo56107c()
            com.google.assistant.e.j.e.ib r0 = (com.google.assistant.p3897e.p3921j.p3926e.C52030ib) r0
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()
            byte[] r0 = r0.toByteArray()     // Catch:{ ct -> 0x0359 }
            com.google.assistant.e.j.e.ib r4 = com.google.assistant.p3897e.p3921j.p3926e.C52030ib.f136561a     // Catch:{ ct -> 0x0359 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (byte[]) r0, (com.google.protobuf.C62921ba) r3)     // Catch:{ ct -> 0x0359 }
            com.google.assistant.e.j.e.ib r0 = (com.google.assistant.p3897e.p3921j.p3926e.C52030ib) r0     // Catch:{ ct -> 0x0359 }
            com.google.protobuf.bt r3 = com.google.protos.p4985f.p5042u.C65358t.f177747d     // Catch:{ ct -> 0x0359 }
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)     // Catch:{ ct -> 0x0359 }
            r0.mo58887l(r3)     // Catch:{ ct -> 0x0359 }
            com.google.protobuf.bf r0 = r0.f169962ag     // Catch:{ ct -> 0x0359 }
            com.google.protobuf.bs r4 = r3.f169971d     // Catch:{ ct -> 0x0359 }
            java.lang.Object r0 = r0.mo58854l(r4)     // Catch:{ ct -> 0x0359 }
            if (r0 != 0) goto L_0x0352
            java.lang.Object r0 = r3.f169969b     // Catch:{ ct -> 0x0359 }
            goto L_0x0356
        L_0x0352:
            java.lang.Object r0 = r3.mo58889c(r0)     // Catch:{ ct -> 0x0359 }
        L_0x0356:
            com.google.protos.f.u.t r0 = (com.google.protos.p4985f.p5042u.C65358t) r0     // Catch:{ ct -> 0x0359 }
            goto L_0x0369
        L_0x0359:
            r0 = move-exception
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.opa.appactions.p8292e.C107304g.f298633a
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r4 = "Failed to parse WidgetData."
            r5 = 23567(0x5c0f, float:3.3024E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r5)).mo56386p(r4)
            com.google.protos.f.u.t r0 = com.google.protos.p4985f.p5042u.C65358t.f177746c
        L_0x0369:
            java.lang.String r3 = r0.f177749a
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0376
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92898g()
            goto L_0x038c
        L_0x0376:
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "com.google.android.assistant.appactions.widgets.PIN_APP_WIDGET"
            r4.<init>(r5)
            android.content.Intent r4 = r4.setPackage(r3)
            com.google.android.apps.gsa.staticplugins.opa.appactions.e.d r5 = new com.google.android.apps.gsa.staticplugins.opa.appactions.e.d
            r5.<init>(r2, r0, r3, r4)
            com.google.common.util.concurrent.bg r0 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92905n(r5, r0)
        L_0x038c:
            com.google.android.apps.gsa.staticplugins.opa.appactions.e.c r3 = new com.google.android.apps.gsa.staticplugins.opa.appactions.e.c
            r3.<init>(r2, r0)
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            r0.mo4106b(r3, r2)
            return
        L_0x0397:
            r0 = r2
            com.google.android.apps.gsa.staticplugins.opa.chatui.b r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108229b) r0
            android.content.Intent r0 = r0.mo96600a()
            java.lang.String r4 = "com.google.android.googlequicksearchbox.GOOGLE_SEARCH"
            java.lang.String r5 = r0.getAction()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x03f4
            com.google.android.libraries.search.h.a.h r3 = com.google.android.libraries.search.p3003h.p3004a.C38404h.f101652g
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.libraries.search.h.a.f r3 = (com.google.android.libraries.search.p3003h.p3004a.C38402f) r3
            java.lang.String r4 = "query"
            java.lang.String r4 = r0.getStringExtra(r4)
            if (r4 == 0) goto L_0x03c8
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.android.libraries.search.h.a.h r5 = (com.google.android.libraries.search.p3003h.p3004a.C38404h) r5
            int r6 = r5.f101654a
            r6 = r6 | r8
            r5.f101654a = r6
            r5.f101655b = r4
        L_0x03c8:
            java.lang.String r4 = "ved"
            java.lang.String r5 = r0.getStringExtra(r4)
            if (r5 != 0) goto L_0x03e3
            com.google.android.libraries.logging.j r5 = r2.f301597d
            com.google.common.o.l.n r5 = com.google.android.libraries.logging.C28285c.m52880g(r5)
            if (r5 == 0) goto L_0x03e3
            java.lang.String r5 = com.google.android.libraries.logging.C28294l.m52913c(r5)
            r0.putExtra(r4, r5)
            r3.mo41412a(r4, r5)
            r8 = 0
        L_0x03e3:
            com.google.android.libraries.search.h.a.d r4 = r1.f300574o
            com.google.protobuf.bv r3 = r3.build()
            com.google.android.libraries.search.h.a.h r3 = (com.google.android.libraries.search.p3003h.p3004a.C38404h) r3
            android.content.Intent r3 = r4.mo41411a(r0, r3)
            if (r3 != 0) goto L_0x03f2
            goto L_0x0422
        L_0x03f2:
            r0 = r3
            goto L_0x0422
        L_0x03f4:
            java.lang.String r4 = "com.google.assistant.SHARE_CARD"
            java.lang.String r5 = r0.getAction()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0422
            boolean r4 = r1.f300576q
            if (r4 == 0) goto L_0x0422
            android.content.Context r4 = r1.f300567h
            r5 = 2130772185(0x7f0100d9, float:1.7147481E38)
            r6 = 2130772167(0x7f0100c7, float:1.7147445E38)
            androidx.core.app.j r4 = androidx.core.app.C1823j.m4996a(r4, r5, r6)
            java.lang.String r5 = "com.google.android.apps.gsa.shared.util.starter.IntentStarter.USE_TRANSITION"
            r0.putExtra(r5, r3)
            androidx.core.app.h r4 = (androidx.core.app.C1821h) r4
            android.app.ActivityOptions r3 = r4.f5645a
            android.os.Bundle r3 = r3.toBundle()
            java.lang.String r4 = "com.google.android.apps.gsa.shared.util.starter.IntentStarter.CUSTOM_TRANSITION"
            r0.putExtra(r4, r3)
        L_0x0422:
            com.google.android.apps.gsa.shared.util.t.g r3 = r1.f300562c
            r3.mo65089a(r0)
        L_0x0427:
            if (r8 == 0) goto L_0x042b
            goto L_0x0825
        L_0x042b:
            return
        L_0x042c:
            boolean r0 = r2 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108249bt
            if (r0 == 0) goto L_0x06ec
            com.google.android.apps.gsa.staticplugins.opa.chatui.bs r0 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108248bs.FEEDBACK
            r0 = r2
            com.google.android.apps.gsa.staticplugins.opa.chatui.bt r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108249bt) r0
            com.google.android.apps.gsa.staticplugins.opa.chatui.bs r4 = r0.f301136a
            int r4 = r4.ordinal()
            java.lang.String r5 = "This instance of SuggestionTapController does not have ChatUiController."
            switch(r4) {
                case 0: goto L_0x06b7;
                case 1: goto L_0x0693;
                case 2: goto L_0x0664;
                case 3: goto L_0x0664;
                case 4: goto L_0x0664;
                case 5: goto L_0x0642;
                case 6: goto L_0x0620;
                case 7: goto L_0x0595;
                case 8: goto L_0x0557;
                case 9: goto L_0x0542;
                case 10: goto L_0x0440;
                case 11: goto L_0x0440;
                case 12: goto L_0x0440;
                case 13: goto L_0x0440;
                case 14: goto L_0x0522;
                case 15: goto L_0x04b0;
                case 16: goto L_0x0522;
                case 17: goto L_0x0469;
                case 18: goto L_0x0440;
                case 19: goto L_0x0449;
                case 20: goto L_0x0449;
                default: goto L_0x0440;
            }
        L_0x0440:
            com.google.android.apps.gsa.staticplugins.opa.chatui.br r0 = r0.f301138c
            if (r0 == 0) goto L_0x0825
            r0.mo95794a()
            goto L_0x0825
        L_0x0449:
            com.google.common.base.ax r0 = r1.f300569j
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0825
            com.google.common.base.ax r0 = r1.f300569j
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.fm r0 = (com.google.android.apps.gsa.staticplugins.opa.C109043fm) r0
            r0.mo97464aZ()
            com.google.common.base.ax r0 = r1.f300569j
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.fm r0 = (com.google.android.apps.gsa.staticplugins.opa.C109043fm) r0
            r0.mo97425M()
            goto L_0x0825
        L_0x0469:
            com.google.common.base.ax r0 = r1.f300569j
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x04a3
            com.google.common.base.ax r0 = r1.f300569j
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.fm r0 = (com.google.android.apps.gsa.staticplugins.opa.C109043fm) r0
            r0.mo97509ba()
            com.google.android.apps.gsa.staticplugins.opa.util.cj r0 = com.google.android.apps.gsa.staticplugins.opa.util.C113858cm.m188476k()
            java.lang.String r3 = r17.mo96877h()
            r0.mo100705c(r3)
            com.google.android.apps.gsa.shared.search.QueryTriggerType r3 = r2.f301605l
            r0.mo100706d(r3)
            r0.mo100707e(r8)
            r0.mo100704b(r8)
            com.google.android.apps.gsa.staticplugins.opa.util.cm r0 = r0.mo100703a()
            com.google.common.base.ax r3 = r1.f300569j
            java.lang.Object r3 = r3.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.fm r3 = (com.google.android.apps.gsa.staticplugins.opa.C109043fm) r3
            r3.mo97548u(r0)
            goto L_0x0825
        L_0x04a3:
            com.google.common.f.e r0 = f300560a
            com.google.common.f.x r0 = r0.mo56226d()
            r3 = 27034(0x699a, float:3.7883E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r5)
            goto L_0x0825
        L_0x04b0:
            android.app.Activity r0 = r1.f300566g
            com.google.android.apps.gsa.staticplugins.opa.q.a r3 = r1.f300583x
            java.util.List r3 = r3.f306381a
            android.app.AlertDialog$Builder r4 = new android.app.AlertDialog$Builder
            r4.<init>(r0)
            r0 = 2132090510(0x7f151e8e, float:1.9821362E38)
            android.app.AlertDialog$Builder r0 = r4.setTitle(r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
            r5 = 0
            r7 = r5
        L_0x04ce:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x0511
            java.lang.Object r9 = r3.next()
            com.google.android.apps.gsa.staticplugins.opa.b.c r9 = (com.google.android.apps.gsa.staticplugins.opa.p8316b.C107714c) r9
            java.lang.String r10 = "\n"
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 == 0) goto L_0x04fd
            long r11 = r9.mo96247a()
            java.lang.String r13 = "+ "
            r4.append(r13)
            long r11 = r11 - r7
            r4.append(r11)
            java.lang.String r7 = "ms "
            r4.append(r7)
            java.lang.String r7 = r9.mo96248b()
            r4.append(r7)
            r4.append(r10)
            goto L_0x050c
        L_0x04fd:
            java.lang.String r7 = "0ms "
            r4.append(r7)
            java.lang.String r7 = r9.mo96248b()
            r4.append(r7)
            r4.append(r10)
        L_0x050c:
            long r7 = r9.mo96247a()
            goto L_0x04ce
        L_0x0511:
            java.lang.String r3 = r4.toString()
            android.app.AlertDialog$Builder r0 = r0.setMessage(r3)
            android.app.AlertDialog r0 = r0.create()
            r0.show()
            goto L_0x0825
        L_0x0522:
            com.google.common.base.ax r0 = r1.f300569j
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0536
            com.google.common.base.ax r0 = r1.f300569j
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.fm r0 = (com.google.android.apps.gsa.staticplugins.opa.C109043fm) r0
            r0.mo97550w(r2)
            return
        L_0x0536:
            com.google.common.f.e r0 = f300560a
            com.google.common.f.x r0 = r0.mo56226d()
            r2 = 27029(0x6995, float:3.7876E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r3)
            return
        L_0x0542:
            com.google.common.base.ax r0 = r1.f300572m
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0825
            com.google.common.base.ax r0 = r1.f300572m
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.ju r0 = (com.google.android.apps.gsa.staticplugins.opa.C109330ju) r0
            r0.mo97764a()
            goto L_0x0825
        L_0x0557:
            com.google.common.base.ax r0 = r1.f300569j
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0588
            com.google.android.apps.gsa.shared.util.t.g r0 = r1.f300562c
            com.google.android.apps.gsa.h.s.t r3 = com.google.android.apps.gsa.p5855h.p5861s.C74555u.m120572i()
            com.google.android.apps.gsa.assistant.b.a.b r4 = com.google.android.apps.gsa.assistant.p510b.p511a.C9439b.OPA_DEFERRED_VOICE_MATCH_SUGGESTION_CHIP
            r3.mo70869c(r4)
            android.content.Intent r3 = r3.mo70882h()
            r0.mo65089a(r3)
            dagger.a r0 = r1.f300565f
            java.lang.Object r0 = r0.mo27525b()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r3 = "voice_onboarding_completed"
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r3, r8)
            r0.apply()
            goto L_0x0825
        L_0x0588:
            com.google.common.f.e r0 = f300560a
            com.google.common.f.x r0 = r0.mo56226d()
            r3 = 27031(0x6997, float:3.7878E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r5)
            goto L_0x0825
        L_0x0595:
            com.google.common.base.ax r0 = r1.f300569j
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0613
            com.google.android.libraries.logging.j r0 = new com.google.android.libraries.logging.j
            r3 = 77353(0x12e29, float:1.08395E-40)
            r0.<init>(r3)
            r3 = 5
            r0.mo33795i(r3)
            com.google.android.libraries.logging.j r4 = new com.google.android.libraries.logging.j
            r5 = 77354(0x12e2a, float:1.08396E-40)
            r4.<init>(r5)
            r4.mo33795i(r3)
            com.google.android.libraries.logging.j r3 = new com.google.android.libraries.logging.j
            r5 = 77657(0x12f59, float:1.0882E-40)
            r3.<init>(r5)
            com.google.android.libraries.logging.k[] r5 = new com.google.android.libraries.logging.C28293k[r6]
            r6 = 0
            com.google.android.libraries.logging.k[] r7 = new com.google.android.libraries.logging.C28293k[r6]
            com.google.android.libraries.logging.k r7 = com.google.android.libraries.logging.C28293k.m52908e(r0, r7)
            r5[r6] = r7
            com.google.android.libraries.logging.k[] r7 = new com.google.android.libraries.logging.C28293k[r6]
            com.google.android.libraries.logging.k r7 = com.google.android.libraries.logging.C28293k.m52908e(r4, r7)
            r5[r8] = r7
            com.google.android.libraries.logging.k r3 = com.google.android.libraries.logging.C28293k.m52908e(r3, r5)
            r5 = 77671(0x12f67, float:1.0884E-40)
            com.google.common.o.oe r3 = com.google.android.libraries.logging.C28285c.m52875b(r3, r5)
            com.google.android.apps.gsa.shared.logger.C89949q.m146521e(r3, r6)
            android.app.AlertDialog$Builder r3 = new android.app.AlertDialog$Builder
            android.app.Activity r5 = r1.f300566g
            r3.<init>(r5)
            r5 = 2132090792(0x7f151fa8, float:1.9821934E38)
            android.app.AlertDialog$Builder r3 = r3.setTitle(r5)
            r5 = 2132090791(0x7f151fa7, float:1.9821932E38)
            android.app.AlertDialog$Builder r3 = r3.setMessage(r5)
            com.google.android.apps.gsa.staticplugins.opa.bf.a r5 = new com.google.android.apps.gsa.staticplugins.opa.bf.a
            r5.<init>(r1, r0)
            r0 = 2132090789(0x7f151fa5, float:1.9821928E38)
            android.app.AlertDialog$Builder r0 = r3.setPositiveButton(r0, r5)
            com.google.android.apps.gsa.staticplugins.opa.bf.b r3 = new com.google.android.apps.gsa.staticplugins.opa.bf.b
            r3.<init>(r4)
            r4 = 2132090790(0x7f151fa6, float:1.982193E38)
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r4, r3)
            android.app.AlertDialog$Builder r0 = r0.setCancelable(r8)
            r0.show()
            goto L_0x0825
        L_0x0613:
            com.google.common.f.e r0 = f300560a
            com.google.common.f.x r0 = r0.mo56226d()
            r3 = 27030(0x6996, float:3.7877E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r5)
            goto L_0x0825
        L_0x0620:
            com.google.common.base.ax r0 = r1.f300569j
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0635
            com.google.common.base.ax r0 = r1.f300569j
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.fm r0 = (com.google.android.apps.gsa.staticplugins.opa.C109043fm) r0
            r0.mo97547t()
            goto L_0x0825
        L_0x0635:
            com.google.common.f.e r0 = f300560a
            com.google.common.f.x r0 = r0.mo56226d()
            r3 = 27032(0x6998, float:3.788E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r5)
            goto L_0x0825
        L_0x0642:
            com.google.common.base.ax r0 = r1.f300569j
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0657
            com.google.common.base.ax r0 = r1.f300569j
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.fm r0 = (com.google.android.apps.gsa.staticplugins.opa.C109043fm) r0
            r0.mo97478an()
            goto L_0x0825
        L_0x0657:
            com.google.common.f.e r0 = f300560a
            com.google.common.f.x r0 = r0.mo56226d()
            r3 = 27033(0x6999, float:3.7881E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r5)
            goto L_0x0825
        L_0x0664:
            com.google.common.base.ax r0 = r1.f300569j
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x067a
            com.google.common.base.ax r0 = r1.f300569j
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.fm r0 = (com.google.android.apps.gsa.staticplugins.opa.C109043fm) r0
            r3 = 0
            r0.mo97432T(r3)
            goto L_0x0825
        L_0x067a:
            r3 = 0
            com.google.android.apps.gsa.shared.util.t.g r0 = r1.f300562c
            com.google.android.apps.gsa.staticplugins.opa.hq.v r4 = r1.f300575p
            com.google.android.apps.gsa.staticplugins.opa.hq.s r5 = com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109246t.m181811j()
            r5.mo97671b(r3)
            com.google.android.apps.gsa.staticplugins.opa.hq.t r3 = r5.mo97670a()
            android.content.Intent r3 = r4.mo97704a(r3)
            r0.mo65089a(r3)
            goto L_0x0825
        L_0x0693:
            com.google.common.base.ax r0 = r1.f300569j
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x06a8
            com.google.common.base.ax r0 = r1.f300569j
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.fm r0 = (com.google.android.apps.gsa.staticplugins.opa.C109043fm) r0
            r0.mo97428P()
            goto L_0x0825
        L_0x06a8:
            com.google.common.f.e r0 = f300560a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r3 = "This instance of SuggestionTapController does not support CONTEXTUAL_SCREENSHOT."
            r4 = 27028(0x6994, float:3.7874E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r3)
            goto L_0x0825
        L_0x06b7:
            com.google.android.apps.gsa.staticplugins.opa.az.i r0 = r1.f300571l
            com.google.android.apps.gsa.search.shared.service.j r3 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.OPA_CANCEL_CONVERSATION
            r3.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r4)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r3 = r3.mo82013a()
            r0.mo96219b(r3)
            com.google.android.apps.gsa.staticplugins.opa.az.i r0 = r1.f300571l
            com.google.android.apps.gsa.search.shared.service.j r3 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.STOP_SPEAKING
            r3.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r4)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r3 = r3.mo82013a()
            r0.mo96219b(r3)
            com.google.common.base.ax r0 = r1.f300563d
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0825
            com.google.common.base.ax r0 = r1.f300563d
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.x.a r0 = (com.google.android.apps.gsa.staticplugins.opa.p8621x.C114513a) r0
            r0.mo101361a()
            goto L_0x0825
        L_0x06ec:
            boolean r0 = r2 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108309dz
            if (r0 == 0) goto L_0x0734
            r0 = r2
            com.google.android.apps.gsa.staticplugins.opa.chatui.dz r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108309dz) r0
            java.lang.String r0 = r0.f301305a
            com.google.assistant.e.j.du r0 = com.google.android.apps.gsa.staticplugins.opa.p8378m.C109459e.m182156a(r0)
            byte[] r0 = r0.toByteArray()
            com.google.android.apps.gsa.search.shared.service.b.oy r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy.f238174g
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.ox r3 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88093ox) r3
            com.google.protobuf.z r0 = com.google.protobuf.C63088z.m96139A(r0)
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.apps.gsa.search.shared.service.b.oy r4 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy) r4
            int r5 = r4.f238176a
            r5 = r5 | r8
            r4.f238176a = r5
            r4.f238177b = r0
            com.google.protobuf.bv r0 = r3.build()
            com.google.android.apps.gsa.search.shared.service.b.oy r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy) r0
            com.google.android.apps.gsa.search.shared.service.j r3 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.OPA_CLIENT_INPUT
            r3.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r4)
            com.google.protobuf.bt r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C88092ow.f238173a
            r3.mo82014b(r4, r0)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r0 = r3.mo82013a()
            com.google.android.apps.gsa.staticplugins.opa.az.i r3 = r1.f300571l
            r3.mo96219b(r0)
            goto L_0x0825
        L_0x0734:
            boolean r0 = r2 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108408hp
            if (r0 == 0) goto L_0x0804
            com.google.common.base.ax r0 = r1.f300577r
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x074c
            com.google.common.base.ax r0 = r1.f300577r
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.fl r0 = (com.google.android.apps.gsa.staticplugins.opa.C109042fl) r0
            r0.mo95151b()
            goto L_0x0759
        L_0x074c:
            com.google.common.f.e r0 = f300560a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r3 = "Unable to dismiss OPA for ShareResultSuggestion click since ChatUiListener is absent."
            r4 = 27026(0x6992, float:3.7871E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r3)
        L_0x0759:
            r0 = r2
            com.google.android.apps.gsa.staticplugins.opa.chatui.hp r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108408hp) r0
            com.google.assistant.e.c.c.gh r3 = r0.f301524b
            int r4 = r3.f133012b
            if (r4 != r8) goto L_0x0767
            java.lang.Object r3 = r3.f133013c
            com.google.assistant.e.c.c.ev r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r3
            goto L_0x0769
        L_0x0767:
            com.google.assistant.e.c.c.ev r3 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x0769:
            java.lang.String r3 = r3.f132944b
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0780
            com.google.common.f.e r0 = f300560a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r3 = "Client package name not set in ShareResultSuggestionItem."
            r4 = 27041(0x69a1, float:3.7893E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r3)
            goto L_0x0825
        L_0x0780:
            com.google.protos.f.u.f r0 = r0.f301523a
            java.lang.String r4 = r0.f176713d
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0799
            com.google.common.f.e r0 = f300560a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r3 = "Session Id not set in ShareResultSuggestionItem."
            r4 = 27040(0x69a0, float:3.7891E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r3)
            goto L_0x0825
        L_0x0799:
            com.google.android.libraries.assistant.d.b.m r4 = com.google.android.libraries.assistant.p1467d.p1471b.C17827m.f51151d
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.libraries.assistant.d.b.l r4 = (com.google.android.libraries.assistant.p1467d.p1471b.C17826l) r4
            com.google.protobuf.cq r5 = r0.f176712c
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.android.libraries.assistant.d.b.m r6 = (com.google.android.libraries.assistant.p1467d.p1471b.C17827m) r6
            com.google.protobuf.cq r7 = r6.f51155c
            boolean r9 = r7.mo58948c()
            if (r9 != 0) goto L_0x07b8
            com.google.protobuf.cq r7 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r7)
            r6.f51155c = r7
        L_0x07b8:
            com.google.protobuf.cq r6 = r6.f51155c
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r5, (java.util.List) r6)
            int r5 = r0.f176710a
            r5 = r5 & r8
            if (r5 == 0) goto L_0x07d5
            java.lang.String r5 = r0.f176711b
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.android.libraries.assistant.d.b.m r6 = (com.google.android.libraries.assistant.p1467d.p1471b.C17827m) r6
            r5.getClass()
            int r7 = r6.f51153a
            r7 = r7 | r8
            r6.f51153a = r7
            r6.f51154b = r5
        L_0x07d5:
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r6 = "com.google.android.apps.gsa.opa.action.SHARE_ASSISTANT_RESULT"
            r5.<init>(r6)
            java.lang.String r6 = "com.google.android.apps.gsa.opa.extra.SHAREABLE_ASSISTANT_RESULT_SESSION_ID"
            java.lang.String r0 = r0.f176713d
            r5.putExtra(r6, r0)
            com.google.protobuf.bv r0 = r4.build()
            com.google.android.libraries.assistant.d.b.m r0 = (com.google.android.libraries.assistant.p1467d.p1471b.C17827m) r0
            byte[] r0 = r0.toByteArray()
            java.lang.String r4 = "com.google.android.apps.gsa.opa.extra.SHAREABLE_ASSISTANT_RESULT_DATA"
            r5.putExtra(r4, r0)
            r5.setPackage(r3)
            com.google.android.libraries.gsa.k.g r0 = r1.f300580u
            com.google.android.apps.gsa.staticplugins.opa.bf.c r3 = new com.google.android.apps.gsa.staticplugins.opa.bf.c
            r3.<init>(r1, r5)
            java.lang.String r4 = "broadcast-share-assistant-result-intent"
            r5 = 500(0x1f4, double:2.47E-321)
            r0.mo28213m(r4, r5, r3)
            goto L_0x0825
        L_0x0804:
            boolean r0 = r2 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108344ff
            if (r0 == 0) goto L_0x0818
            r0 = r2
            com.google.android.apps.gsa.staticplugins.opa.chatui.ff r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108344ff) r0
            android.content.Intent r0 = r0.f301379a
            com.google.android.apps.gsa.shared.util.t.g r3 = r1.f300562c
            r3.mo65089a(r0)
            android.app.Activity r0 = r1.f300566g
            r0.finish()
            goto L_0x0825
        L_0x0818:
            com.google.common.f.e r0 = f300560a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r3 = "#handleSuggestionTap - unknown suggestion: %s"
            r4 = 27025(0x6991, float:3.787E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56389s(r3, r2)
        L_0x0825:
            com.google.android.libraries.logging.j r0 = r2.f301597d
            r2 = 5
            r3 = 0
            com.google.common.o.oe r0 = com.google.android.libraries.logging.C28285c.m52883j(r0, r2, r3)
            r2 = 0
            com.google.android.apps.gsa.shared.logger.C89949q.m146521e(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8336bf.C108051f.mo96383c(com.google.android.apps.gsa.staticplugins.opa.chatui.ik):void");
    }
}
