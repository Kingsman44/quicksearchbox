package com.google.assistant.p3838ao.p3839a;

import com.google.assistant.p3838ao.p3839a.p3840a.C49403f;
import com.google.assistant.p3838ao.p3839a.p3845e.C49528al;
import com.google.assistant.p3838ao.p3839a.p3845e.C49585co;
import com.google.assistant.p3838ao.p3839a.p3845e.C49601dd;
import com.google.assistant.p3838ao.p3839a.p3845e.C49621l;
import com.google.assistant.p3838ao.p3839a.p3845e.C49626q;
import com.google.assistant.p3838ao.p3839a.p3845e.C49632w;
import com.google.assistant.p3838ao.p3839a.p3849i.C49674e;
import com.google.assistant.p3838ao.p3839a.p3849i.C49679j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C62963cj;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;

/* renamed from: com.google.assistant.ao.a.o */
/* compiled from: PG */
final class C49689o implements C49645h {

    /* renamed from: a */
    public static final C58974d f128250a = C58974d.m91136j();

    /* renamed from: b */
    public final C49403f f128251b;

    /* renamed from: c */
    public final C58485gu f128252c;

    /* renamed from: d */
    public final C49674e f128253d;

    /* renamed from: e */
    public final Map f128254e;

    /* renamed from: f */
    private final C49636f f128255f;

    /* renamed from: g */
    private final C49674e f128256g;

    public C49689o(C49636f fVar, C49403f fVar2, C49601dd ddVar) {
        this.f128255f = fVar;
        this.f128251b = fVar2;
        this.f128252c = C58485gu.m89842j(ddVar.f127998b);
        this.f128256g = new C49674e(ddVar.f127999c, C49687m.f128248a);
        this.f128253d = new C49674e(ddVar.f128000d, C49688n.f128249a);
        this.f128254e = Collections.unmodifiableMap(ddVar.f128001e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:147:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0166  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m85676c(com.google.assistant.p3838ao.p3839a.C49692r r19, com.google.assistant.p3838ao.p3839a.p3845e.C49585co r20, java.util.List r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            com.google.assistant.ao.a.e.cw r4 = r2.f127954g
            if (r4 != 0) goto L_0x000e
            com.google.assistant.ao.a.e.cw r4 = com.google.assistant.p3838ao.p3839a.p3845e.C49593cw.f127968c
        L_0x000e:
            int r4 = r4.f127970a
            com.google.protos.f.u.h r4 = com.google.protos.p4985f.p5042u.C65346h.m96672b(r4)
            if (r4 != 0) goto L_0x0018
            com.google.protos.f.u.h r4 = com.google.protos.p4985f.p5042u.C65346h.UNRECOGNIZED
        L_0x0018:
            int r5 = r2.f127948a
            r5 = r5 & 16
            if (r5 == 0) goto L_0x0052
            com.google.assistant.ao.a.e.cw r5 = r2.f127954g
            if (r5 != 0) goto L_0x0024
            com.google.assistant.ao.a.e.cw r5 = com.google.assistant.p3838ao.p3839a.p3845e.C49593cw.f127968c
        L_0x0024:
            boolean r5 = r5.f127971b
            com.google.protos.f.u.h r7 = com.google.protos.p4985f.p5042u.C65346h.SUGGEST_EXPERIMENT_UNKNOWN
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L_0x0032
            if (r5 == 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            return
        L_0x0032:
            r7 = r1
            com.google.assistant.ao.a.a r7 = (com.google.assistant.p3838ao.p3839a.C49381a) r7
            com.google.common.b.ij r8 = r7.f127640f
            boolean r8 = r8.contains(r4)
            if (r8 == 0) goto L_0x003e
            goto L_0x0053
        L_0x003e:
            com.google.common.b.ij r7 = r7.f127641g
            boolean r7 = r7.contains(r4)
            if (r7 == 0) goto L_0x0049
            r5 = r5 ^ 1
            goto L_0x0053
        L_0x0049:
            if (r5 == 0) goto L_0x004c
            goto L_0x0052
        L_0x004c:
            r4.name()
            java.lang.String r1 = r2.f127951d
            return
        L_0x0052:
            r5 = 0
        L_0x0053:
            java.lang.String r7 = r2.f127951d
            int r7 = r2.f127949b
            r8 = 4
            r9 = 3
            r10 = 2
            r11 = 1
            if (r7 == 0) goto L_0x0067
            if (r7 == r9) goto L_0x0065
            if (r7 == r8) goto L_0x0063
            r12 = 0
            goto L_0x0068
        L_0x0063:
            r12 = 2
            goto L_0x0068
        L_0x0065:
            r12 = 1
            goto L_0x0068
        L_0x0067:
            r12 = 3
        L_0x0068:
            int r13 = r12 + -1
            if (r12 == 0) goto L_0x01f7
            if (r13 == 0) goto L_0x007f
            if (r13 == r11) goto L_0x0071
            goto L_0x0091
        L_0x0071:
            if (r7 != r8) goto L_0x0078
            java.lang.Object r7 = r2.f127950c
            com.google.assistant.ao.a.e.q r7 = (com.google.assistant.p3838ao.p3839a.p3845e.C49626q) r7
            goto L_0x007a
        L_0x0078:
            com.google.assistant.ao.a.e.q r7 = com.google.assistant.p3838ao.p3839a.p3845e.C49626q.f128069h
        L_0x007a:
            boolean r7 = r0.mo53326b(r1, r7, r10)
            goto L_0x008c
        L_0x007f:
            if (r7 != r9) goto L_0x0086
            java.lang.Object r7 = r2.f127950c
            com.google.assistant.ao.a.e.q r7 = (com.google.assistant.p3838ao.p3839a.p3845e.C49626q) r7
            goto L_0x0088
        L_0x0086:
            com.google.assistant.ao.a.e.q r7 = com.google.assistant.p3838ao.p3839a.p3845e.C49626q.f128069h
        L_0x0088:
            boolean r7 = r0.mo53326b(r1, r7, r11)
        L_0x008c:
            if (r7 != 0) goto L_0x0091
            java.lang.String r1 = r2.f127951d
            return
        L_0x0091:
            int r7 = r21.size()
            com.google.protobuf.cq r12 = r2.f127953f
            java.util.Iterator r12 = r12.iterator()
        L_0x009b:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0160
            java.lang.Object r13 = r12.next()
            com.google.assistant.ao.a.e.cn r13 = (com.google.assistant.p3838ao.p3839a.p3845e.C49584cn) r13
            int r15 = r13.f127943a
            if (r15 == 0) goto L_0x00bd
            if (r15 == r11) goto L_0x00ba
            if (r15 == r10) goto L_0x00b7
            if (r15 == r9) goto L_0x00b4
            r16 = 0
            goto L_0x00bf
        L_0x00b4:
            r16 = 3
            goto L_0x00bf
        L_0x00b7:
            r16 = 2
            goto L_0x00bf
        L_0x00ba:
            r16 = 1
            goto L_0x00bf
        L_0x00bd:
            r16 = 4
        L_0x00bf:
            int r6 = r16 + -1
            if (r16 == 0) goto L_0x015e
            if (r6 == 0) goto L_0x014e
            if (r6 == r11) goto L_0x0141
            if (r6 == r10) goto L_0x00db
            if (r6 == r9) goto L_0x00cc
            goto L_0x009b
        L_0x00cc:
            com.google.common.f.a.d r6 = f128250a
            com.google.common.f.x r6 = r6.mo56226d()
            java.lang.String r13 = "Unsupported/empty action"
            r15 = 54817(0xd621, float:7.6815E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r6).mo56372aa(r15)).mo56386p(r13)
            goto L_0x009b
        L_0x00db:
            if (r15 != r9) goto L_0x00e2
            java.lang.Object r6 = r13.f127944b
            com.google.assistant.ao.a.e.ad r6 = (com.google.assistant.p3838ao.p3839a.p3845e.C49520ad) r6
            goto L_0x00e4
        L_0x00e2:
            com.google.assistant.ao.a.e.ad r6 = com.google.assistant.p3838ao.p3839a.p3845e.C49520ad.f127756b
        L_0x00e4:
            com.google.assistant.ao.a.f r13 = r0.f128255f
            int r15 = r6.f127758a
            int r15 = com.google.assistant.p3838ao.p3839a.p3845e.C49522af.m85575c(r15)
            if (r15 != 0) goto L_0x00ef
            r15 = 2
        L_0x00ef:
            com.google.assistant.ao.a.c.i r13 = r13.mo53279a(r15)
            if (r13 != 0) goto L_0x0119
            com.google.common.f.a.d r13 = f128250a
            com.google.common.f.x r13 = r13.mo56226d()
            com.google.common.f.a.a r13 = (com.google.common.p4526f.p4527a.C58970a) r13
            r15 = 54813(0xd61d, float:7.681E-41)
            com.google.common.f.x r13 = r13.mo56372aa(r15)
            com.google.common.f.a.a r13 = (com.google.common.p4526f.p4527a.C58970a) r13
            int r6 = r6.f127758a
            int r6 = com.google.assistant.p3838ao.p3839a.p3845e.C49522af.m85575c(r6)
            if (r6 != 0) goto L_0x010f
            r6 = 2
        L_0x010f:
            java.lang.String r15 = "Generator not found: %s"
            java.lang.String r6 = com.google.assistant.p3838ao.p3839a.p3845e.C49522af.m85573a(r6)
            r13.mo56389s(r15, r6)
            goto L_0x009b
        L_0x0119:
            int r15 = r6.f127758a
            com.google.common.b.gu r13 = r13.mo53272a(r1, r6)
            int r15 = r13.size()
            r8 = 0
        L_0x0124:
            if (r8 >= r15) goto L_0x013d
            java.lang.Object r17 = r13.get(r8)
            r9 = r17
            com.google.assistant.ao.a.d r9 = (com.google.assistant.p3838ao.p3839a.C49503d) r9
            int r14 = r6.f127758a
            int r14 = com.google.assistant.p3838ao.p3839a.p3845e.C49522af.m85575c(r14)
            if (r14 != 0) goto L_0x0137
            r14 = 2
        L_0x0137:
            r9.f127728i = r14
            int r8 = r8 + 1
            r9 = 3
            goto L_0x0124
        L_0x013d:
            r3.addAll(r13)
            goto L_0x015a
        L_0x0141:
            if (r15 != r10) goto L_0x0148
            java.lang.Object r6 = r13.f127944b
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x014a
        L_0x0148:
            java.lang.String r6 = ""
        L_0x014a:
            r0.mo53325a(r1, r6, r3)
            goto L_0x015a
        L_0x014e:
            if (r15 != r11) goto L_0x0155
            java.lang.Object r6 = r13.f127944b
            com.google.assistant.ao.a.e.co r6 = (com.google.assistant.p3838ao.p3839a.p3845e.C49585co) r6
            goto L_0x0157
        L_0x0155:
            com.google.assistant.ao.a.e.co r6 = com.google.assistant.p3838ao.p3839a.p3845e.C49585co.f127946j
        L_0x0157:
            r0.m85676c(r1, r6, r3)
        L_0x015a:
            r8 = 4
            r9 = 3
            goto L_0x009b
        L_0x015e:
            r6 = 0
            throw r6
        L_0x0160:
            int r6 = r21.size()
            if (r7 >= r6) goto L_0x01f6
            java.lang.Object r6 = r3.get(r7)
            com.google.assistant.ao.a.d r6 = (com.google.assistant.p3838ao.p3839a.C49503d) r6
            int r8 = r6.mo53267a()
            if (r8 == r11) goto L_0x0176
        L_0x0172:
            r9 = 0
            r13 = 3
            goto L_0x01f2
        L_0x0176:
            com.google.assistant.ao.a.s r6 = (com.google.assistant.p3838ao.p3839a.C49693s) r6
            int r8 = r2.f127952e
            if (r8 == 0) goto L_0x0184
            int r9 = r6.f127724e
            if (r9 == 0) goto L_0x0182
            if (r8 <= r9) goto L_0x0184
        L_0x0182:
            r6.f127724e = r8
        L_0x0184:
            int r8 = r2.f127948a
            r9 = r8 & 16
            if (r9 == 0) goto L_0x018e
            r6.f127726g = r4
            r6.f127727h = r5
        L_0x018e:
            r8 = r8 & 32
            if (r8 == 0) goto L_0x019b
            com.google.assistant.ao.a.e.av r8 = r2.f127955h
            if (r8 != 0) goto L_0x0198
            com.google.assistant.ao.a.e.av r8 = com.google.assistant.p3838ao.p3839a.p3845e.C49538av.f127818f
        L_0x0198:
            r6.mo53334b(r8)
        L_0x019b:
            com.google.protobuf.cq r8 = r2.f127956i
            java.util.Iterator r8 = r8.iterator()
        L_0x01a1:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0172
            java.lang.Object r9 = r8.next()
            com.google.assistant.ao.a.e.s r9 = (com.google.assistant.p3838ao.p3839a.p3845e.C49628s) r9
            int r12 = r9.f128080a
            if (r12 == 0) goto L_0x01bc
            if (r12 == r10) goto L_0x01ba
            r13 = 3
            if (r12 == r13) goto L_0x01b8
            r13 = 0
            goto L_0x01bd
        L_0x01b8:
            r13 = 2
            goto L_0x01bd
        L_0x01ba:
            r13 = 1
            goto L_0x01bd
        L_0x01bc:
            r13 = 3
        L_0x01bd:
            int r14 = r13 + -1
            if (r13 == 0) goto L_0x01f0
            if (r14 == 0) goto L_0x01d6
            if (r14 == r11) goto L_0x01c7
            r13 = 3
            goto L_0x01e6
        L_0x01c7:
            r13 = 3
            if (r12 != r13) goto L_0x01cf
            java.lang.Object r12 = r9.f128081b
            com.google.assistant.ao.a.e.q r12 = (com.google.assistant.p3838ao.p3839a.p3845e.C49626q) r12
            goto L_0x01d1
        L_0x01cf:
            com.google.assistant.ao.a.e.q r12 = com.google.assistant.p3838ao.p3839a.p3845e.C49626q.f128069h
        L_0x01d1:
            boolean r12 = r0.mo53326b(r1, r12, r10)
            goto L_0x01e4
        L_0x01d6:
            r13 = 3
            if (r12 != r10) goto L_0x01de
            java.lang.Object r12 = r9.f128081b
            com.google.assistant.ao.a.e.q r12 = (com.google.assistant.p3838ao.p3839a.p3845e.C49626q) r12
            goto L_0x01e0
        L_0x01de:
            com.google.assistant.ao.a.e.q r12 = com.google.assistant.p3838ao.p3839a.p3845e.C49626q.f128069h
        L_0x01e0:
            boolean r12 = r0.mo53326b(r1, r12, r11)
        L_0x01e4:
            if (r12 == 0) goto L_0x01a1
        L_0x01e6:
            com.google.assistant.ao.a.e.av r9 = r9.f128082c
            if (r9 != 0) goto L_0x01ec
            com.google.assistant.ao.a.e.av r9 = com.google.assistant.p3838ao.p3839a.p3845e.C49538av.f127818f
        L_0x01ec:
            r6.mo53334b(r9)
            goto L_0x01a1
        L_0x01f0:
            r9 = 0
            throw r9
        L_0x01f2:
            int r7 = r7 + 1
            goto L_0x0160
        L_0x01f6:
            return
        L_0x01f7:
            r9 = 0
            goto L_0x01fa
        L_0x01f9:
            throw r9
        L_0x01fa:
            goto L_0x01f9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.assistant.p3838ao.p3839a.C49689o.m85676c(com.google.assistant.ao.a.r, com.google.assistant.ao.a.e.co, java.util.List):void");
    }

    /* renamed from: a */
    public final void mo53325a(C49692r rVar, String str, List list) {
        C49585co coVar = (C49585co) this.f128256g.mo53324a(str);
        if (coVar == null) {
            ((C58970a) ((C58970a) f128250a.mo56226d()).mo56372aa(54818)).mo56389s("Rule not found: %s", str);
        } else {
            m85676c(rVar, coVar, list);
        }
    }

    /* renamed from: b */
    public final boolean mo53326b(C49692r rVar, C49626q qVar, int i) {
        C58485gu guVar;
        boolean z = i + -1 == 0;
        for (C49626q b : qVar.f128071a) {
            if (mo53326b(rVar, b, 1) != z) {
                return !z;
            }
        }
        for (C49626q b2 : qVar.f128072b) {
            if (mo53326b(rVar, b2, 2) != z) {
                return !z;
            }
        }
        for (C49626q b3 : qVar.f128073c) {
            if (mo53326b(rVar, b3, 1) == z) {
                return !z;
            }
        }
        C49684j jVar = new C49684j(this, rVar);
        for (String apply : qVar.f128075e) {
            if (((Boolean) jVar.apply(apply)).booleanValue() != z) {
                return !z;
            }
        }
        C49685k kVar = new C49685k(this, rVar);
        for (C49621l apply2 : qVar.f128074d) {
            if (((Boolean) kVar.apply(apply2)).booleanValue() != z) {
                return !z;
            }
        }
        for (C49632w wVar : new C62963cj(qVar.f128076f, C49626q.f128068g)) {
            C49381a aVar = (C49381a) rVar;
            if (aVar.f127636b.isPresent()) {
                guVar = (C58485gu) Collection.EL.stream(((C49528al) aVar.f127636b.get()).f127795c).map(C49691q.f128263a).collect(C49679j.m85667a());
            } else {
                guVar = C58485gu.m89845m();
            }
            if (guVar.contains(wVar) != z) {
                return !z;
            }
        }
        return z;
    }
}
