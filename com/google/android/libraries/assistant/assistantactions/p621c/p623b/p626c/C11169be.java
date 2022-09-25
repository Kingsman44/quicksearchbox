package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c;

import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q;
import com.google.android.libraries.assistant.portable.p1584a.p1585a.C19045c;
import com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d;
import com.google.assistant.p3897e.p3902c.p3907c.C50929aa;
import com.google.assistant.p3897e.p3902c.p3907c.C50931ac;
import com.google.assistant.p3897e.p3902c.p3907c.C50936ah;
import com.google.assistant.p3897e.p3902c.p3907c.C50947as;
import com.google.assistant.p3897e.p3902c.p3907c.C50951aw;
import com.google.assistant.p3897e.p3902c.p3907c.C50954az;
import com.google.assistant.p3897e.p3902c.p3907c.C50956ba;
import com.google.assistant.p3897e.p3902c.p3907c.C50959bd;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3902c.p3907c.C51021dl;
import com.google.assistant.p3897e.p3902c.p3907c.C51024do;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;
import com.google.assistant.p3897e.p3902c.p3907c.C51030du;
import com.google.assistant.p3897e.p3921j.C52475tc;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52510uk;
import com.google.assistant.p3897e.p3921j.C52511ul;
import com.google.assistant.p3897e.p3921j.C52512um;
import com.google.assistant.p3897e.p3921j.C52513un;
import com.google.assistant.p3897e.p3921j.p3926e.C51934en;
import com.google.assistant.p3897e.p3921j.p3926e.C51937eq;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51948fa;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C59071e;
import com.google.knowledge.p4661a.p4662a.C61745g;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61751m;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.p5277z.p5282c.C68013c;
import com.google.p5277z.p5282c.C68014d;
import com.google.p5277z.p5282c.C68015e;
import com.google.p5277z.p5282c.C68018h;
import com.google.p5277z.p5282c.C68021k;
import com.google.protos.p4850an.C63634r;
import com.google.protos.p4850an.C63641y;
import com.google.protos.p4850an.C63642z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.c.be */
/* compiled from: PG */
public final class C11169be {

    /* renamed from: a */
    public static final /* synthetic */ int f36543a = 0;

    /* renamed from: b */
    private static final C59071e f36544b = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.c.b.c.be");

    /* renamed from: c */
    private static final C58485gu f36545c = C58485gu.m89848p("datetime.date", "datetime.time", "recurrence");

    /* renamed from: a */
    public static C51953ff m26468a(C51953ff ffVar, C58485gu guVar) {
        C50959bd bdVar;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            C58833ax g = C11222q.m26610g((String) guVar.get(i2), ffVar);
            if (g.mo56113h() && ((C51941eu) g.mo56107c()).f136277e == 33) {
                C51941eu euVar = (C51941eu) g.mo56107c();
                if (euVar.f136277e == 33) {
                    bdVar = (C50959bd) euVar.f136278f;
                } else {
                    bdVar = C50959bd.f132657e;
                }
                C50956ba baVar = (C50956ba) bdVar.toBuilder();
                for (int i3 = 0; i3 < ((C50959bd) baVar.instance).f132660b.size(); i3++) {
                    C50947as asVar = (C50947as) baVar.mo53491a(i3).toBuilder();
                    C50951aw a = C50951aw.m85988a(((C50954az) asVar.instance).f132649i);
                    if (a == null) {
                        a = C50951aw.DEFAULT_STATUS;
                    }
                    if (a != C50951aw.HIGHLIGHT) {
                        C50951aw a2 = C50951aw.m85988a(((C50954az) asVar.instance).f132649i);
                        if (a2 == null) {
                            a2 = C50951aw.DEFAULT_STATUS;
                        }
                        if (a2 != C50951aw.ERROR) {
                        }
                    }
                    C50951aw awVar = C50951aw.DEFAULT_STATUS;
                    asVar.copyOnWrite();
                    C50954az azVar = (C50954az) asVar.instance;
                    azVar.f132649i = awVar.f132637f;
                    azVar.f132641a |= 1024;
                    baVar.mo53492b(i3, asVar);
                }
                C51937eq eqVar = (C51937eq) ((C51941eu) g.mo56107c()).toBuilder();
                eqVar.copyOnWrite();
                C51941eu euVar2 = (C51941eu) eqVar.instance;
                C50959bd bdVar2 = (C50959bd) baVar.build();
                bdVar2.getClass();
                euVar2.f136278f = bdVar2;
                euVar2.f136277e = 33;
                ffVar = C11222q.m26609f((C51941eu) eqVar.build(), C58836b.f156633a, ffVar);
            }
        }
        return ffVar;
    }

    /* renamed from: b */
    public static C51953ff m26469b(String str, C51953ff ffVar) {
        C51030du duVar;
        C51016dg dgVar;
        C58833ax g = C11222q.m26610g("trigger_field", ffVar);
        if (!g.mo56113h()) {
            return ffVar;
        }
        C51941eu euVar = (C51941eu) g.mo56107c();
        if (euVar.f136277e == 6) {
            duVar = (C51030du) euVar.f136278f;
        } else {
            duVar = C51030du.f132868g;
        }
        C51021dl dlVar = (C51021dl) duVar.toBuilder();
        if (Collection.EL.stream(Collections.unmodifiableList(((C51030du) dlVar.instance).f132875f)).noneMatch(new C11161ax(str))) {
            return ffVar;
        }
        for (int i = 0; i < ((C51030du) dlVar.instance).f132875f.size(); i++) {
            C51024do doVar = (C51024do) dlVar.mo53500a(i).toBuilder();
            C51027dr drVar = (C51027dr) doVar.instance;
            if (drVar.f132857d == 4) {
                dgVar = (C51016dg) drVar.f132858e;
            } else {
                dgVar = C51016dg.f132827g;
            }
            boolean equals = dgVar.f132830b.equals(str);
            doVar.copyOnWrite();
            C51027dr drVar2 = (C51027dr) doVar.instance;
            drVar2.f132854a |= 1;
            drVar2.f132859f = equals;
            dlVar.mo53504e(i, doVar);
        }
        C51937eq eqVar = (C51937eq) ((C51941eu) g.mo56107c()).toBuilder();
        eqVar.copyOnWrite();
        C51941eu euVar2 = (C51941eu) eqVar.instance;
        C51030du duVar2 = (C51030du) dlVar.build();
        duVar2.getClass();
        euVar2.f136278f = duVar2;
        euVar2.f136277e = 6;
        return C11222q.m26609f((C51941eu) eqVar.build(), C58836b.f156633a, ffVar);
    }

    /* renamed from: c */
    public static C51953ff m26470c(C51953ff ffVar, C68015e eVar, boolean z) {
        C58485gu q = C58485gu.m89849q("title", "recurrence", "datetime", "location");
        int i = ((C58724pq) q).f156474d;
        int i2 = 0;
        while (i2 < i) {
            String str = (String) q.get(i2);
            int a = C68021k.m98233a(eVar.mo60076a(str, C68018h.f184286c).f184289b);
            if (a == 0) {
                a = 2;
            }
            i2++;
            if (a == 3) {
                if (str.equals("datetime")) {
                    C51934en enVar = (C51934en) ffVar.toBuilder();
                    String str2 = true != z ? "datetime.date" : "datetime.time";
                    enVar.copyOnWrite();
                    C51953ff ffVar2 = (C51953ff) enVar.instance;
                    ffVar2.f136317a |= 2;
                    ffVar2.f136320d = str2;
                    return (C51953ff) enVar.build();
                }
                C51934en enVar2 = (C51934en) ffVar.toBuilder();
                enVar2.copyOnWrite();
                C51953ff ffVar3 = (C51953ff) enVar2.instance;
                str.getClass();
                ffVar3.f136317a |= 2;
                ffVar3.f136320d = str;
                return (C51953ff) enVar2.build();
            }
        }
        return ffVar;
    }

    /* renamed from: d */
    public static C51953ff m26471d(C51953ff ffVar) {
        C52510uk ukVar = (C52510uk) C52513un.f137850b.createBuilder();
        C52511ul ulVar = (C52511ul) C52512um.f137845d.createBuilder();
        ulVar.copyOnWrite();
        C52512um umVar = (C52512um) ulVar.instance;
        umVar.f137847a |= 1;
        umVar.f137848b = "main";
        ulVar.copyOnWrite();
        C52512um umVar2 = (C52512um) ulVar.instance;
        umVar2.f137847a |= 2;
        umVar2.f137849c = false;
        ukVar.mo53878a(ulVar);
        C52511ul ulVar2 = (C52511ul) C52512um.f137845d.createBuilder();
        ulVar2.copyOnWrite();
        C52512um umVar3 = (C52512um) ulVar2.instance;
        umVar3.f137847a |= 1;
        umVar3.f137848b = "type_switcher";
        ulVar2.copyOnWrite();
        C52512um umVar4 = (C52512um) ulVar2.instance;
        umVar4.f137847a |= 2;
        umVar4.f137849c = true;
        ukVar.mo53878a(ulVar2);
        C52511ul ulVar3 = (C52511ul) C52512um.f137845d.createBuilder();
        ulVar3.copyOnWrite();
        C52512um umVar5 = (C52512um) ulVar3.instance;
        umVar5.f137847a |= 1;
        umVar5.f137848b = "time_form";
        ulVar3.copyOnWrite();
        C52512um umVar6 = (C52512um) ulVar3.instance;
        umVar6.f137847a |= 2;
        umVar6.f137849c = true;
        ukVar.mo53878a(ulVar3);
        C52511ul ulVar4 = (C52511ul) C52512um.f137845d.createBuilder();
        ulVar4.copyOnWrite();
        C52512um umVar7 = (C52512um) ulVar4.instance;
        umVar7.f137847a |= 1;
        umVar7.f137848b = "location_form";
        ulVar4.copyOnWrite();
        C52512um umVar8 = (C52512um) ulVar4.instance;
        umVar8.f137847a |= 2;
        umVar8.f137849c = true;
        ukVar.mo53878a(ulVar4);
        return C11222q.m26607d((C52513un) ukVar.build(), ffVar);
    }

    /* renamed from: e */
    public static C51953ff m26472e(String str, boolean z, C51953ff ffVar) {
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

    /* renamed from: f */
    public static C51953ff m26473f(String str, boolean z, C51953ff ffVar) {
        C50959bd bdVar;
        C58833ax g = C11222q.m26610g(str, ffVar);
        if (!g.mo56113h()) {
            return ffVar;
        }
        C51937eq eqVar = (C51937eq) ((C51941eu) g.mo56107c()).toBuilder();
        eqVar.copyOnWrite();
        C51941eu euVar = (C51941eu) eqVar.instance;
        euVar.f136273a |= 64;
        euVar.f136282j = !z;
        C51941eu euVar2 = (C51941eu) g.mo56107c();
        if (euVar2.f136277e == 33) {
            bdVar = (C50959bd) euVar2.f136278f;
        } else {
            bdVar = C50959bd.f132657e;
        }
        C50956ba baVar = (C50956ba) bdVar.toBuilder();
        int i = z ? 1 : 2;
        baVar.copyOnWrite();
        C50959bd bdVar2 = (C50959bd) baVar.instance;
        bdVar2.f132662d = i - 1;
        bdVar2.f132659a = 2 | bdVar2.f132659a;
        for (int i2 = 0; i2 < ((C50959bd) baVar.instance).f132660b.size(); i2++) {
            C50947as asVar = (C50947as) baVar.mo53491a(i2).toBuilder();
            if (z) {
                C50951aw a = C50951aw.m85988a(((C50954az) asVar.instance).f132649i);
                if (a == null) {
                    a = C50951aw.DEFAULT_STATUS;
                }
                if (a.equals(C50951aw.ERROR)) {
                    C50951aw awVar = C50951aw.HIGHLIGHT;
                    asVar.copyOnWrite();
                    C50954az azVar = (C50954az) asVar.instance;
                    azVar.f132649i = awVar.f132637f;
                    azVar.f132641a |= 1024;
                }
            } else {
                C50951aw a2 = C50951aw.m85988a(((C50954az) asVar.instance).f132649i);
                if (a2 == null) {
                    a2 = C50951aw.DEFAULT_STATUS;
                }
                if (a2.equals(C50951aw.HIGHLIGHT)) {
                    C50951aw awVar2 = C50951aw.ERROR;
                    asVar.copyOnWrite();
                    C50954az azVar2 = (C50954az) asVar.instance;
                    azVar2.f132649i = awVar2.f132637f;
                    azVar2.f132641a |= 1024;
                }
            }
            baVar.mo53492b(i2, asVar);
        }
        if (((C51941eu) g.mo56107c()).f136277e == 33) {
            eqVar.copyOnWrite();
            C51941eu euVar3 = (C51941eu) eqVar.instance;
            C50959bd bdVar3 = (C50959bd) baVar.build();
            bdVar3.getClass();
            euVar3.f136278f = bdVar3;
            euVar3.f136277e = 33;
        }
        return C11222q.m26609f((C51941eu) eqVar.build(), C58836b.f156633a, ffVar);
    }

    /* renamed from: g */
    public static Optional m26474g(C58833ax axVar) {
        C50959bd bdVar;
        if (!axVar.mo56113h()) {
            return Optional.empty();
        }
        C51941eu euVar = (C51941eu) axVar.mo56107c();
        if (euVar.f136277e == 33) {
            bdVar = (C50959bd) euVar.f136278f;
        } else {
            bdVar = C50959bd.f132657e;
        }
        return Collection.EL.stream(bdVar.f132660b).filter(C11162ay.f36536a).findFirst();
    }

    /* renamed from: h */
    public static Optional m26475h(C58833ax axVar) {
        C50959bd bdVar;
        if (!axVar.mo56113h()) {
            return Optional.empty();
        }
        C51941eu euVar = (C51941eu) axVar.mo56107c();
        if (euVar.f136277e == 33) {
            bdVar = (C50959bd) euVar.f136278f;
        } else {
            bdVar = C50959bd.f132657e;
        }
        return Collection.EL.stream(bdVar.f132660b).filter(C11165ba.f36539a).findFirst();
    }

    /* renamed from: i */
    public static Optional m26476i(String str, C50959bd bdVar) {
        for (int i = 0; i < bdVar.f132660b.size(); i++) {
            C51016dg dgVar = ((C50954az) bdVar.f132660b.get(i)).f132646f;
            if (dgVar == null) {
                dgVar = C51016dg.f132827g;
            }
            if (dgVar.f132830b.equals(str)) {
                return Optional.m71637of(Integer.valueOf(i));
            }
        }
        return Optional.empty();
    }

    /* renamed from: j */
    public static void m26477j(C51953ff ffVar, C19045c cVar) {
        C68013c cVar2 = (C68013c) cVar.mo24271c().toBuilder();
        C61752n nVar = ((C68014d) cVar2.instance).f184280c;
        if (nVar == null) {
            nVar = C61752n.f166808f;
        }
        C61751m mVar = (C61751m) nVar.toBuilder();
        List<C63642z> e = cVar.mo24273e();
        C58833ax g = C11222q.m26610g("datetime.date", ffVar);
        C58833ax g2 = C11222q.m26610g("datetime.time", ffVar);
        C58833ax g3 = C11222q.m26610g("recurrence", ffVar);
        boolean z = !m26488u(g).isPresent() && !m26488u(g2).isPresent() && !(m26481n(ffVar) && m26488u(C11222q.m26610g("main_chips", ffVar)).isPresent());
        boolean z2 = !m26488u(g3).isPresent();
        for (int i = 0; i < ((C61752n) mVar.instance).f166812c.size(); i++) {
            C61746h a = mVar.mo58182a(i);
            boolean z3 = z && a.f166796d.equals("datetime");
            boolean z4 = z2 && a.f166796d.equals("recurrence");
            if (z3 || z4) {
                C61745g gVar = (C61745g) a.toBuilder();
                gVar.copyOnWrite();
                C61746h hVar = (C61746h) gVar.instance;
                hVar.f166797e = null;
                hVar.f166793a &= -5;
                mVar.mo58187f(i, gVar);
            }
        }
        cVar2.copyOnWrite();
        C68014d dVar = (C68014d) cVar2.instance;
        C61752n nVar2 = (C61752n) mVar.build();
        nVar2.getClass();
        dVar.f184280c = nVar2;
        dVar.f184278a |= 2;
        cVar.mo24277i(cVar2);
        ArrayList arrayList = new ArrayList();
        for (C63642z builder : e) {
            C63641y yVar = (C63641y) builder.toBuilder();
            if (((C63642z) yVar.instance).f172116c.equals(((C61752n) mVar.instance).f166811b)) {
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < ((C63642z) yVar.instance).f172117d.size(); i2++) {
                    C63634r a2 = yVar.mo59224a(i2);
                    boolean z5 = z && a2.f172101d.equals("datetime");
                    boolean z6 = z2 && a2.f172101d.equals("recurrence");
                    if (!z5 && !z6) {
                        arrayList2.add(a2);
                    }
                }
                yVar.copyOnWrite();
                ((C63642z) yVar.instance).f172117d = C63642z.emptyProtobufList();
                yVar.mo59225b(arrayList2);
            }
            arrayList.add((C63642z) yVar.build());
        }
        cVar.mo24279k(arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0091 A[ADDED_TO_REGION] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m26478k(com.google.android.libraries.assistant.portable.p1584a.p1585a.C19045c r10, java.lang.String r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            r0 = 1
            r1 = 0
            if (r15 != 0) goto L_0x000a
            if (r12 != 0) goto L_0x000a
            if (r13 != 0) goto L_0x000a
            r12 = 1
            goto L_0x000b
        L_0x000a:
            r12 = 0
        L_0x000b:
            if (r15 == 0) goto L_0x0011
            if (r14 != 0) goto L_0x0011
            r13 = 1
            goto L_0x0012
        L_0x0011:
            r13 = 0
        L_0x0012:
            java.util.List r14 = r10.mo24273e()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x001f:
            boolean r3 = r14.hasNext()
            java.lang.String r4 = "location"
            java.lang.String r5 = "datetime"
            if (r3 == 0) goto L_0x0099
            java.lang.Object r3 = r14.next()
            com.google.protos.an.z r3 = (com.google.protos.p4850an.C63642z) r3
            java.lang.String r6 = r3.f172116c
            boolean r6 = r6.equals(r11)
            if (r6 != 0) goto L_0x003b
            r2.add(r3)
            goto L_0x001f
        L_0x003b:
            com.google.protobuf.cq r6 = r3.f172117d
            int r6 = r6.size()
            if (r6 == r0) goto L_0x0055
            com.google.common.f.e r4 = f36544b
            com.google.common.f.x r4 = r4.mo56225c()
            java.lang.String r5 = "Only one ArgumentUpdate is expected for each intentUpdate."
            r6 = 43105(0xa861, float:6.0403E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r6)).mo56386p(r5)
            r2.add(r3)
            goto L_0x001f
        L_0x0055:
            r6 = r15 ^ 1
            com.google.protobuf.cq r7 = r3.f172117d
            java.lang.Object r7 = r7.get(r1)
            com.google.protos.an.r r7 = (com.google.protos.p4850an.C63634r) r7
            java.lang.String r7 = r7.f172101d
            int r8 = r7.hashCode()
            r9 = 1793702779(0x6ae9bb7b, float:1.4128253E26)
            if (r8 == r9) goto L_0x0078
            r5 = 1901043637(0x714f9fb5, float:1.0281035E30)
            if (r8 == r5) goto L_0x0070
            goto L_0x0080
        L_0x0070:
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0080
            r4 = 1
            goto L_0x0081
        L_0x0078:
            boolean r4 = r7.equals(r5)
            if (r4 == 0) goto L_0x0080
            r4 = 0
            goto L_0x0081
        L_0x0080:
            r4 = -1
        L_0x0081:
            if (r4 == 0) goto L_0x0091
            if (r4 == r0) goto L_0x0089
            r2.add(r3)
            goto L_0x001f
        L_0x0089:
            if (r15 == 0) goto L_0x001f
            if (r13 != 0) goto L_0x001f
            r2.add(r3)
            goto L_0x001f
        L_0x0091:
            if (r6 == 0) goto L_0x001f
            if (r12 != 0) goto L_0x001f
            r2.add(r3)
            goto L_0x001f
        L_0x0099:
            r10.mo24279k(r2)
            if (r12 == 0) goto L_0x00a6
            com.google.protos.an.r r11 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11206a.m26556c(r5)
            r10.mo24274f(r11)
            return
        L_0x00a6:
            if (r13 == 0) goto L_0x00af
            com.google.protos.an.r r11 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11206a.m26556c(r4)
            r10.mo24274f(r11)
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c.C11169be.m26478k(com.google.android.libraries.assistant.portable.a.a.c, java.lang.String, boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: l */
    public static void m26479l(C68015e eVar, C11192p pVar, boolean z) {
        if (pVar.f36596a.isPresent()) {
            eVar.mo60077b("title", C19046d.m36501g(2));
        }
        if (pVar.f36597b.isPresent()) {
            eVar.mo60077b("datetime", C19046d.m36501g(2));
        }
        if (pVar.f36598c.isPresent()) {
            eVar.mo60077b("location", C19046d.m36501g(2));
        }
        if (z) {
            if (!pVar.mo19621f()) {
                eVar.mo60077b("title", C19046d.m36501g(3));
            } else if (!pVar.mo19618c()) {
                eVar.mo60077b("location", C19046d.m36501g(3));
            }
            eVar.mo60077b("datetime", C19046d.m36501g(2));
            return;
        }
        if (!pVar.mo19621f() && pVar.mo19617b() == pVar.mo19619d()) {
            eVar.mo60077b("title", C19046d.m36501g(3));
        } else if ((pVar.mo19617b() ^ pVar.mo19619d()) || (pVar.mo19621f() && !pVar.mo19617b())) {
            eVar.mo60077b("datetime", C19046d.m36501g(3));
        }
        eVar.mo60077b("location", C19046d.m36501g(2));
    }

    /* renamed from: m */
    public static boolean m26480m(String str, C51953ff ffVar, C52490tr trVar) {
        C50936ah ahVar;
        if (trVar.f137798b == 9 && ((C52475tc) trVar.f137799c).f137747b && trVar.f137800d.equals(str)) {
            C58833ax g = C11222q.m26610g(trVar.f137800d, ffVar);
            if (g.mo56113h() && ((C51941eu) g.mo56107c()).f136277e == 17) {
                C51941eu euVar = (C51941eu) g.mo56107c();
                if (euVar.f136277e == 17) {
                    ahVar = (C50936ah) euVar.f136278f;
                } else {
                    ahVar = C50936ah.f132593m;
                }
                C50931ac a = C50931ac.m85981a(ahVar.f132602h);
                if (a == null) {
                    a = C50931ac.DEFAULT;
                }
                if (a == C50931ac.CANCEL) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: n */
    public static boolean m26481n(C51953ff ffVar) {
        return m26474g(C11222q.m26610g("main_chips", ffVar)).isPresent();
    }

    /* renamed from: o */
    public static boolean m26482o(C51953ff ffVar) {
        if (C11222q.m26611h(ffVar)) {
            return true;
        }
        Iterator it = ffVar.f136319c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C51948fa faVar = (C51948fa) it.next();
            if (faVar.f136297b.equals("time_form")) {
                if (!faVar.f136298c) {
                    return false;
                }
            }
        }
        Optional findFirst = Collection.EL.stream(C11172bh.m26490a(ffVar).f132660b).filter(new C11170bf()).map(C11171bg.f36547a).findFirst();
        if (!findFirst.isPresent() || findFirst.get() == C50951aw.HIDDEN) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public static boolean m26483p(C51953ff ffVar, C19045c cVar) {
        return ffVar.f136321e.equals("UpdateReminder") && !Collection.EL.stream(cVar.mo24273e()).flatMap(C11166bb.f36540a).map(C11167bc.f36541a).anyMatch(C11168bd.f36542a) && !m26482o(ffVar);
    }

    /* renamed from: q */
    public static boolean m26484q(C11192p pVar, boolean z) {
        return pVar.mo19621f() && m26485r(pVar, z);
    }

    /* renamed from: r */
    public static boolean m26485r(C11192p pVar, boolean z) {
        return (!z && pVar.mo19617b() && pVar.mo19619d()) || (z && pVar.mo19618c());
    }

    /* renamed from: s */
    public static Optional m26486s(C50959bd bdVar) {
        for (int i = 0; i < bdVar.f132660b.size(); i++) {
            if (((C50954az) bdVar.f132660b.get(i)).f132652l.equals("default_time")) {
                return Optional.m71637of(Integer.valueOf(i));
            }
        }
        return Optional.empty();
    }

    /* JADX WARNING: Removed duplicated region for block: B:194:0x064a  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0650  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0672  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0675 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0690  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x06ba  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.assistant.p3897e.p3921j.p3926e.C51953ff m26487t(com.google.assistant.p3897e.p3921j.p3926e.C51953ff r30, com.google.assistant.p3897e.p3921j.C52490tr r31) {
        /*
            r0 = r30
            r1 = r31
            boolean r2 = r1.f137802f
            if (r2 != 0) goto L_0x0009
            return r0
        L_0x0009:
            java.lang.String r2 = "sub_cancel_field"
            boolean r2 = m26480m(r2, r0, r1)
            if (r2 != 0) goto L_0x0a1a
            java.lang.String r2 = "main_chips"
            com.google.common.base.ax r3 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26610g(r2, r0)
            com.google.assistant.e.c.c.bd r4 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c.C11172bh.m26490a(r30)
            int r5 = r1.f137798b
            r6 = 16
            if (r5 != r6) goto L_0x0026
            java.lang.Object r5 = r1.f137799c
            com.google.assistant.e.j.te r5 = (com.google.assistant.p3897e.p3921j.C52477te) r5
            goto L_0x0028
        L_0x0026:
            com.google.assistant.e.j.te r5 = com.google.assistant.p3897e.p3921j.C52477te.f137748h
        L_0x0028:
            boolean r5 = r5.f137755f
            java.lang.String r7 = "recurrence"
            java.lang.String r8 = "datetime.time"
            r9 = 3
            java.lang.String r10 = "datetime.date"
            r11 = 4
            r12 = 2
            r13 = 33
            if (r5 == 0) goto L_0x010d
            int r5 = r1.f137798b
            if (r5 != r6) goto L_0x0040
            java.lang.Object r1 = r1.f137799c
            com.google.assistant.e.j.te r1 = (com.google.assistant.p3897e.p3921j.C52477te) r1
            goto L_0x0042
        L_0x0040:
            com.google.assistant.e.j.te r1 = com.google.assistant.p3897e.p3921j.C52477te.f137748h
        L_0x0042:
            long r5 = r1.f137753d
            int r1 = com.google.common.p4575r.C60757n.m92740a(r5)
            com.google.assistant.e.c.c.bd r5 = com.google.assistant.p3897e.p3902c.p3907c.C50959bd.f132657e
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x010c
            int r1 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c.C11172bh.m26495f(r1, r4)
            if (r1 != r12) goto L_0x0067
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89847o(r10, r8)
            com.google.assistant.e.j.e.ff r0 = m26468a(r0, r1)
            com.google.assistant.e.j.e.ff r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c.C11189m.m26517a(r0)
            com.google.assistant.e.j.e.ff r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c.C11172bh.m26492c(r0)
            r1 = 2
        L_0x0067:
            if (r1 == r9) goto L_0x006b
            if (r1 != r12) goto L_0x0077
        L_0x006b:
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89846n(r7)
            com.google.assistant.e.j.e.ff r0 = m26468a(r0, r4)
            com.google.assistant.e.j.e.ff r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c.C11172bh.m26491b(r0)
        L_0x0077:
            if (r1 != r11) goto L_0x00e2
            com.google.assistant.e.j.e.ff r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c.C11189m.m26517a(r0)
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89848p(r10, r8, r7)
            com.google.assistant.e.j.e.ff r0 = m26468a(r0, r1)
            com.google.assistant.e.c.c.bd r1 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c.C11172bh.m26490a(r0)
            com.google.common.base.ax r2 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26610g(r2, r0)
            com.google.assistant.e.c.c.bd r4 = com.google.assistant.p3897e.p3902c.p3907c.C50959bd.f132657e
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00e2
            boolean r4 = r2.mo56113h()
            if (r4 == 0) goto L_0x00e2
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.assistant.e.c.c.ba r1 = (com.google.assistant.p3897e.p3902c.p3907c.C50956ba) r1
            java.lang.String r4 = "location_select_complete"
            com.google.assistant.e.c.c.aw r5 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.HIDDEN
            com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c.C11172bh.m26493d(r1, r4, r5)
            java.lang.String r4 = "select_time"
            com.google.assistant.e.c.c.aw r5 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
            com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c.C11172bh.m26493d(r1, r4, r5)
            java.lang.String r4 = "select_location"
            com.google.assistant.e.c.c.aw r5 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
            com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c.C11172bh.m26493d(r1, r4, r5)
            java.lang.Object r2 = r2.mo56107c()
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            com.google.protobuf.bn r2 = r2.toBuilder()
            com.google.assistant.e.j.e.eq r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.assistant.e.j.e.eu r4 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r4
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.c.c.bd r1 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r1
            r1.getClass()
            r4.f136278f = r1
            r4.f136277e = r13
            com.google.protobuf.bv r1 = r2.build()
            com.google.assistant.e.j.e.eu r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r1
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
            com.google.assistant.e.j.e.ff r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26609f(r1, r2, r0)
        L_0x00e2:
            java.lang.Object r1 = r3.mo56107c()
            com.google.assistant.e.j.e.eu r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r1
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.assistant.e.j.e.eq r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r1
            com.google.assistant.e.c.c.bd r2 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c.C11172bh.m26490a(r0)
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.e.j.e.eu r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r3
            r2.getClass()
            r3.f136278f = r2
            r3.f136277e = r13
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.j.e.eu r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r1
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
            com.google.assistant.e.j.e.ff r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26609f(r1, r2, r0)
        L_0x010c:
            return r0
        L_0x010d:
            java.lang.String r3 = r1.f137800d
            java.lang.String r4 = "trigger_field"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0125
            com.google.common.b.gu r3 = f36545c
            com.google.assistant.e.j.e.ff r0 = m26468a(r0, r3)
            com.google.assistant.e.j.e.ff r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c.C11172bh.m26492c(r0)
            com.google.assistant.e.j.e.ff r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c.C11172bh.m26491b(r0)
        L_0x0125:
            int r3 = r1.f137798b
            if (r3 != r6) goto L_0x0a19
            java.lang.Object r3 = r1.f137799c
            com.google.assistant.e.j.te r3 = (com.google.assistant.p3897e.p3921j.C52477te) r3
            boolean r3 = r3.f137754e
            if (r3 != 0) goto L_0x0133
            goto L_0x0a19
        L_0x0133:
            boolean r3 = m26481n(r0)
            r5 = 5
            r15 = 1
            if (r3 == 0) goto L_0x05a3
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89846n(r2)
            r3 = r2
            com.google.common.b.pq r3 = (com.google.common.p4522b.C58724pq) r3
            int r3 = r3.f156474d
            r9 = 0
        L_0x0145:
            if (r9 >= r3) goto L_0x05a3
            java.lang.Object r17 = r2.get(r9)
            r12 = r17
            java.lang.String r12 = (java.lang.String) r12
            com.google.common.base.ax r17 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26610g(r12, r0)
            boolean r19 = r17.mo56113h()
            if (r19 == 0) goto L_0x0583
            java.lang.Object r19 = r17.mo56107c()
            r4 = r19
            com.google.assistant.e.j.e.eu r4 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r4
            int r4 = r4.f136277e
            if (r4 != r13) goto L_0x0583
            java.lang.String r4 = r1.f137800d
            boolean r4 = r4.equals(r12)
            if (r4 != 0) goto L_0x016f
            goto L_0x0583
        L_0x016f:
            java.lang.Object r4 = r17.mo56107c()
            com.google.assistant.e.j.e.eu r4 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r4
            int r12 = r4.f136277e
            if (r12 != r13) goto L_0x017e
            java.lang.Object r4 = r4.f136278f
            com.google.assistant.e.c.c.bd r4 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r4
            goto L_0x0180
        L_0x017e:
            com.google.assistant.e.c.c.bd r4 = com.google.assistant.p3897e.p3902c.p3907c.C50959bd.f132657e
        L_0x0180:
            com.google.protobuf.bn r4 = r4.toBuilder()
            com.google.assistant.e.c.c.ba r4 = (com.google.assistant.p3897e.p3902c.p3907c.C50956ba) r4
            int r12 = r1.f137798b
            if (r12 != r6) goto L_0x018f
            java.lang.Object r12 = r1.f137799c
            com.google.assistant.e.j.te r12 = (com.google.assistant.p3897e.p3921j.C52477te) r12
            goto L_0x0191
        L_0x018f:
            com.google.assistant.e.j.te r12 = com.google.assistant.p3897e.p3921j.C52477te.f137748h
        L_0x0191:
            r6 = 0
        L_0x0192:
            com.google.protobuf.bv r14 = r4.instance
            com.google.assistant.e.c.c.bd r14 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r14
            com.google.protobuf.cq r14 = r14.f132660b
            int r14 = r14.size()
            if (r6 >= r14) goto L_0x054a
            com.google.assistant.e.c.c.az r14 = r4.mo53491a(r6)
            com.google.protobuf.bn r14 = r14.toBuilder()
            com.google.assistant.e.c.c.as r14 = (com.google.assistant.p3897e.p3902c.p3907c.C50947as) r14
            int r11 = r12.f137750a
            r11 = r11 & r15
            if (r11 == 0) goto L_0x0529
            r20 = r14
            long r13 = r12.f137753d
            r21 = r12
            long r11 = (long) r6
            int r22 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r22 != 0) goto L_0x051e
            com.google.assistant.e.c.c.az r11 = r4.mo53491a(r6)
            java.lang.String r11 = r11.f132652l
            java.lang.String r12 = "default_time"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x051e
            com.google.common.b.gu r12 = com.google.common.p4522b.C58485gu.m89846n(r10)
            r11 = r12
            com.google.common.b.pq r11 = (com.google.common.p4522b.C58724pq) r11
            int r13 = r11.f156474d
            r14 = 0
        L_0x01d0:
            if (r14 >= r13) goto L_0x034e
            java.lang.Object r11 = r12.get(r14)
            java.lang.String r11 = (java.lang.String) r11
            com.google.common.base.ax r21 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26610g(r11, r0)
            boolean r11 = r21.mo56113h()
            if (r11 == 0) goto L_0x0334
            java.lang.Object r11 = r21.mo56107c()
            com.google.assistant.e.j.e.eu r11 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r11
            int r11 = r11.f136277e
            r15 = 33
            if (r11 != r15) goto L_0x0334
            r15 = r20
            com.google.protobuf.bv r11 = r15.instance
            com.google.assistant.e.c.c.az r11 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r11
            r20 = r2
            int r2 = r11.f132642b
            if (r2 != r5) goto L_0x01ff
            java.lang.Object r2 = r11.f132643c
            com.google.assistant.e.j.qd r2 = (com.google.assistant.p3897e.p3921j.C52395qd) r2
            goto L_0x0201
        L_0x01ff:
            com.google.assistant.e.j.qd r2 = com.google.assistant.p3897e.p3921j.C52395qd.f137485e
        L_0x0201:
            com.google.assistant.e.j.qb r2 = r2.f137488b
            if (r2 != 0) goto L_0x0207
            com.google.assistant.e.j.qb r2 = com.google.assistant.p3897e.p3921j.C52393qb.f137479e
        L_0x0207:
            com.google.common.v.g r11 = com.google.common.p4580v.C60948g.f165068a
            j$.time.ZoneId r5 = p3186j$.time.ZoneId.systemDefault()
            j$.time.LocalDate r5 = com.google.common.p4580v.C60949h.m93107a(r11, r5)
            int r11 = r2.f137482b
            r23 = r3
            int r3 = r5.getYear()
            if (r11 != r3) goto L_0x022d
            int r3 = r2.f137483c
            int r11 = r5.getMonthValue()
            if (r3 != r11) goto L_0x022d
            int r2 = r2.f137484d
            int r3 = r5.getDayOfMonth()
            if (r2 != r3) goto L_0x022d
            r2 = 1
            goto L_0x022e
        L_0x022d:
            r2 = 0
        L_0x022e:
            java.lang.Object r3 = r21.mo56107c()
            com.google.assistant.e.j.e.eu r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r3
            int r5 = r3.f136277e
            r11 = 33
            if (r5 != r11) goto L_0x023f
            java.lang.Object r3 = r3.f136278f
            com.google.assistant.e.c.c.bd r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r3
            goto L_0x0241
        L_0x023f:
            com.google.assistant.e.c.c.bd r3 = com.google.assistant.p3897e.p3902c.p3907c.C50959bd.f132657e
        L_0x0241:
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.assistant.e.c.c.ba r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50956ba) r3
            r5 = 1
        L_0x0248:
            com.google.protobuf.bv r11 = r3.instance
            com.google.assistant.e.c.c.bd r11 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r11
            com.google.protobuf.cq r11 = r11.f132660b
            int r11 = r11.size()
            if (r5 >= r11) goto L_0x0301
            com.google.assistant.e.c.c.az r11 = r3.mo53491a(r5)
            com.google.protobuf.bn r11 = r11.toBuilder()
            com.google.assistant.e.c.c.as r11 = (com.google.assistant.p3897e.p3902c.p3907c.C50947as) r11
            r24 = r12
            java.lang.String r12 = "tomorrow_chip"
            r25 = r13
            java.lang.String r13 = "today_chip"
            if (r2 == 0) goto L_0x02b0
            r26 = r2
            com.google.protobuf.bv r2 = r11.instance
            com.google.assistant.e.c.c.az r2 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r2
            java.lang.String r2 = r2.f132652l
            boolean r2 = r2.equals(r13)
            if (r2 == 0) goto L_0x028d
            com.google.assistant.e.c.c.aw r2 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.HIGHLIGHT
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.assistant.e.c.c.az r12 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r12
            int r2 = r2.f132637f
            r12.f132649i = r2
            int r2 = r12.f132641a
            r2 = r2 | 1024(0x400, float:1.435E-42)
            r12.f132641a = r2
            r3.mo53492b(r5, r11)
            goto L_0x02f7
        L_0x028d:
            com.google.protobuf.bv r2 = r11.instance
            com.google.assistant.e.c.c.az r2 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r2
            java.lang.String r2 = r2.f132652l
            boolean r2 = r2.equals(r12)
            if (r2 == 0) goto L_0x02f7
            com.google.assistant.e.c.c.aw r2 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.assistant.e.c.c.az r12 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r12
            int r2 = r2.f132637f
            r12.f132649i = r2
            int r2 = r12.f132641a
            r2 = r2 | 1024(0x400, float:1.435E-42)
            r12.f132641a = r2
            r3.mo53492b(r5, r11)
            goto L_0x02f7
        L_0x02b0:
            r26 = r2
            com.google.protobuf.bv r2 = r11.instance
            com.google.assistant.e.c.c.az r2 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r2
            java.lang.String r2 = r2.f132652l
            boolean r2 = r2.equals(r13)
            if (r2 == 0) goto L_0x02d5
            com.google.assistant.e.c.c.aw r2 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.assistant.e.c.c.az r12 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r12
            int r2 = r2.f132637f
            r12.f132649i = r2
            int r2 = r12.f132641a
            r2 = r2 | 1024(0x400, float:1.435E-42)
            r12.f132641a = r2
            r3.mo53492b(r5, r11)
            goto L_0x02f7
        L_0x02d5:
            com.google.protobuf.bv r2 = r11.instance
            com.google.assistant.e.c.c.az r2 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r2
            java.lang.String r2 = r2.f132652l
            boolean r2 = r2.equals(r12)
            if (r2 == 0) goto L_0x02f7
            com.google.assistant.e.c.c.aw r2 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.HIGHLIGHT
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.assistant.e.c.c.az r12 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r12
            int r2 = r2.f132637f
            r12.f132649i = r2
            int r2 = r12.f132641a
            r2 = r2 | 1024(0x400, float:1.435E-42)
            r12.f132641a = r2
            r3.mo53492b(r5, r11)
        L_0x02f7:
            int r5 = r5 + 1
            r12 = r24
            r13 = r25
            r2 = r26
            goto L_0x0248
        L_0x0301:
            r24 = r12
            r25 = r13
            java.lang.Object r2 = r21.mo56107c()
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            com.google.protobuf.bn r2 = r2.toBuilder()
            com.google.assistant.e.j.e.eq r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.assistant.e.j.e.eu r5 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r5
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.e.c.c.bd r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r3
            r3.getClass()
            r5.f136278f = r3
            r3 = 33
            r5.f136277e = r3
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            com.google.common.base.b r3 = com.google.common.base.C58836b.f156633a
            com.google.assistant.e.j.e.ff r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26609f(r2, r3, r0)
            goto L_0x033e
        L_0x0334:
            r23 = r3
            r24 = r12
            r25 = r13
            r15 = r20
            r20 = r2
        L_0x033e:
            int r14 = r14 + 1
            r2 = r20
            r3 = r23
            r12 = r24
            r13 = r25
            r5 = 5
            r20 = r15
            r15 = 1
            goto L_0x01d0
        L_0x034e:
            r23 = r3
            r15 = r20
            r20 = r2
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89846n(r8)
            r3 = r2
            com.google.common.b.pq r3 = (com.google.common.p4522b.C58724pq) r3
            int r3 = r3.f156474d
            r5 = 0
        L_0x035e:
            if (r5 >= r3) goto L_0x0501
            java.lang.Object r12 = r2.get(r5)
            java.lang.String r12 = (java.lang.String) r12
            com.google.common.base.ax r12 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26610g(r12, r0)
            boolean r13 = r12.mo56113h()
            if (r13 == 0) goto L_0x04e9
            java.lang.Object r13 = r12.mo56107c()
            com.google.assistant.e.j.e.eu r13 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r13
            int r13 = r13.f136277e
            r11 = 33
            if (r13 != r11) goto L_0x04e9
            com.google.protobuf.bv r13 = r15.instance
            com.google.assistant.e.c.c.az r13 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r13
            int r14 = r13.f132642b
            r11 = 5
            if (r14 != r11) goto L_0x038a
            java.lang.Object r11 = r13.f132643c
            com.google.assistant.e.j.qd r11 = (com.google.assistant.p3897e.p3921j.C52395qd) r11
            goto L_0x038c
        L_0x038a:
            com.google.assistant.e.j.qd r11 = com.google.assistant.p3897e.p3921j.C52395qd.f137485e
        L_0x038c:
            com.google.assistant.e.j.ql r11 = r11.f137489c
            if (r11 != 0) goto L_0x0392
            com.google.assistant.e.j.ql r11 = com.google.assistant.p3897e.p3921j.C52403ql.f137512f
        L_0x0392:
            r13 = r11
            java.lang.Object r11 = r12.mo56107c()
            r14 = r11
            com.google.assistant.e.j.e.eu r14 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r14
            int r11 = r14.f136277e
            r21 = r2
            r2 = 33
            if (r11 != r2) goto L_0x03a7
            java.lang.Object r2 = r14.f136278f
            com.google.assistant.e.c.c.bd r2 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r2
            goto L_0x03a9
        L_0x03a7:
            com.google.assistant.e.c.c.bd r2 = com.google.assistant.p3897e.p3902c.p3907c.C50959bd.f132657e
        L_0x03a9:
            com.google.protobuf.bn r2 = r2.toBuilder()
            com.google.assistant.e.c.c.ba r2 = (com.google.assistant.p3897e.p3902c.p3907c.C50956ba) r2
            r14 = 1
        L_0x03b0:
            com.google.protobuf.bv r11 = r2.instance
            com.google.assistant.e.c.c.bd r11 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r11
            com.google.protobuf.cq r11 = r11.f132660b
            int r11 = r11.size()
            if (r14 >= r11) goto L_0x0417
            com.google.assistant.e.c.c.az r11 = r2.mo53491a(r14)
            com.google.protobuf.bn r11 = r11.toBuilder()
            com.google.assistant.e.c.c.as r11 = (com.google.assistant.p3897e.p3902c.p3907c.C50947as) r11
            r24 = r3
            int r3 = r13.f137515b
            r25 = r7
            com.google.protobuf.bv r7 = r11.instance
            com.google.assistant.e.c.c.az r7 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r7
            r26 = r8
            int r8 = r7.f132642b
            r27 = r10
            r10 = 4
            if (r8 != r10) goto L_0x03de
            java.lang.Object r10 = r7.f132643c
            com.google.assistant.e.j.ql r10 = (com.google.assistant.p3897e.p3921j.C52403ql) r10
            goto L_0x03e0
        L_0x03de:
            com.google.assistant.e.j.ql r10 = com.google.assistant.p3897e.p3921j.C52403ql.f137512f
        L_0x03e0:
            int r10 = r10.f137515b
            if (r3 != r10) goto L_0x040c
            int r3 = r13.f137516c
            r10 = 4
            if (r8 != r10) goto L_0x03ee
            java.lang.Object r7 = r7.f132643c
            com.google.assistant.e.j.ql r7 = (com.google.assistant.p3897e.p3921j.C52403ql) r7
            goto L_0x03f0
        L_0x03ee:
            com.google.assistant.e.j.ql r7 = com.google.assistant.p3897e.p3921j.C52403ql.f137512f
        L_0x03f0:
            int r7 = r7.f137516c
            if (r3 != r7) goto L_0x040c
            com.google.assistant.e.c.c.aw r3 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.HIGHLIGHT
            r11.copyOnWrite()
            com.google.protobuf.bv r7 = r11.instance
            com.google.assistant.e.c.c.az r7 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r7
            int r3 = r3.f132637f
            r7.f132649i = r3
            int r3 = r7.f132641a
            r3 = r3 | 1024(0x400, float:1.435E-42)
            r7.f132641a = r3
            r2.mo53492b(r14, r11)
            goto L_0x04ba
        L_0x040c:
            int r14 = r14 + 1
            r3 = r24
            r7 = r25
            r8 = r26
            r10 = r27
            goto L_0x03b0
        L_0x0417:
            r24 = r3
            r25 = r7
            r26 = r8
            r27 = r10
            r3 = 0
            com.google.assistant.e.c.c.az r7 = r2.mo53491a(r3)
            com.google.protobuf.bn r3 = r7.toBuilder()
            com.google.assistant.e.c.c.as r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50947as) r3
            com.google.protobuf.bv r7 = r15.instance
            com.google.assistant.e.c.c.az r7 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r7
            java.lang.String r7 = r7.f132645e
            java.lang.String r8 = " • "
            r10 = -1
            java.lang.String[] r7 = r7.split(r8, r10)
            int r8 = r7.length
            r11 = 2
            if (r8 != r11) goto L_0x04ba
            com.google.assistant.e.j.ql r8 = com.google.assistant.p3897e.p3921j.C52403ql.f137512f
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.e.j.qk r8 = (com.google.assistant.p3897e.p3921j.C52402qk) r8
            int r11 = r13.f137515b
            r8.copyOnWrite()
            com.google.protobuf.bv r14 = r8.instance
            com.google.assistant.e.j.ql r14 = (com.google.assistant.p3897e.p3921j.C52403ql) r14
            int r10 = r14.f137514a
            r22 = 1
            r10 = r10 | 1
            r14.f137514a = r10
            r14.f137515b = r11
            int r10 = r13.f137516c
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.assistant.e.j.ql r11 = (com.google.assistant.p3897e.p3921j.C52403ql) r11
            int r14 = r11.f137514a
            r18 = 2
            r14 = r14 | 2
            r11.f137514a = r14
            r11.f137516c = r10
            int r10 = r13.f137517d
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.assistant.e.j.ql r11 = (com.google.assistant.p3897e.p3921j.C52403ql) r11
            int r13 = r11.f137514a
            r14 = 4
            r13 = r13 | r14
            r11.f137514a = r13
            r11.f137517d = r10
            r3.copyOnWrite()
            com.google.protobuf.bv r10 = r3.instance
            com.google.assistant.e.c.c.az r10 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r10
            com.google.protobuf.bv r8 = r8.build()
            com.google.assistant.e.j.ql r8 = (com.google.assistant.p3897e.p3921j.C52403ql) r8
            r8.getClass()
            r10.f132643c = r8
            r10.f132642b = r14
            r8 = 1
            r7 = r7[r8]
            r3.copyOnWrite()
            com.google.protobuf.bv r8 = r3.instance
            com.google.assistant.e.c.c.az r8 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r8
            r7.getClass()
            int r10 = r8.f132641a
            r11 = 2
            r10 = r10 | r11
            r8.f132641a = r10
            r8.f132645e = r7
            com.google.assistant.e.c.c.aw r7 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.HIGHLIGHT
            r3.copyOnWrite()
            com.google.protobuf.bv r8 = r3.instance
            com.google.assistant.e.c.c.az r8 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r8
            int r7 = r7.f132637f
            r8.f132649i = r7
            int r7 = r8.f132641a
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r8.f132641a = r7
            r7 = 0
            r2.mo53492b(r7, r3)
        L_0x04ba:
            java.lang.Object r3 = r12.mo56107c()
            com.google.assistant.e.j.e.eu r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r3
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.assistant.e.j.e.eq r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r7 = r3.instance
            com.google.assistant.e.j.e.eu r7 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r7
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.c.c.bd r2 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r2
            r2.getClass()
            r7.f136278f = r2
            r2 = 33
            r7.f136277e = r2
            com.google.protobuf.bv r2 = r3.build()
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            com.google.common.base.b r3 = com.google.common.base.C58836b.f156633a
            com.google.assistant.e.j.e.ff r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26609f(r2, r3, r0)
            goto L_0x04f3
        L_0x04e9:
            r21 = r2
            r24 = r3
            r25 = r7
            r26 = r8
            r27 = r10
        L_0x04f3:
            int r5 = r5 + 1
            r2 = r21
            r3 = r24
            r7 = r25
            r8 = r26
            r10 = r27
            goto L_0x035e
        L_0x0501:
            r25 = r7
            r26 = r8
            r27 = r10
            com.google.assistant.e.c.c.aw r2 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.HIGHLIGHT
            r15.copyOnWrite()
            com.google.protobuf.bv r3 = r15.instance
            com.google.assistant.e.c.c.az r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r3
            int r2 = r2.f132637f
            r3.f132649i = r2
            int r2 = r3.f132641a
            r2 = r2 | 1024(0x400, float:1.435E-42)
            r3.f132641a = r2
            r4.mo53492b(r6, r15)
            goto L_0x0554
        L_0x051e:
            r20 = r2
            r23 = r3
            r25 = r7
            r26 = r8
            r27 = r10
            goto L_0x0535
        L_0x0529:
            r20 = r2
            r23 = r3
            r25 = r7
            r26 = r8
            r27 = r10
            r21 = r12
        L_0x0535:
            int r6 = r6 + 1
            r2 = r20
            r12 = r21
            r3 = r23
            r7 = r25
            r8 = r26
            r10 = r27
            r5 = 5
            r11 = 4
            r13 = 33
            r15 = 1
            goto L_0x0192
        L_0x054a:
            r20 = r2
            r23 = r3
            r25 = r7
            r26 = r8
            r27 = r10
        L_0x0554:
            java.lang.Object r2 = r17.mo56107c()
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            com.google.protobuf.bn r2 = r2.toBuilder()
            com.google.assistant.e.j.e.eq r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.e.j.e.eu r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r3
            com.google.protobuf.bv r4 = r4.build()
            com.google.assistant.e.c.c.bd r4 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r4
            r4.getClass()
            r3.f136278f = r4
            r4 = 33
            r3.f136277e = r4
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            com.google.common.base.b r3 = com.google.common.base.C58836b.f156633a
            com.google.assistant.e.j.e.ff r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26609f(r2, r3, r0)
            goto L_0x058d
        L_0x0583:
            r20 = r2
            r23 = r3
            r25 = r7
            r26 = r8
            r27 = r10
        L_0x058d:
            int r9 = r9 + 1
            r2 = r20
            r3 = r23
            r7 = r25
            r8 = r26
            r10 = r27
            r5 = 5
            r6 = 16
            r11 = 4
            r12 = 2
            r13 = 33
            r15 = 1
            goto L_0x0145
        L_0x05a3:
            r25 = r7
            r26 = r8
            r27 = r10
            com.google.common.b.gu r2 = f36545c
            r3 = r2
            com.google.common.b.pq r3 = (com.google.common.p4522b.C58724pq) r3
            int r3 = r3.f156474d
            r4 = 0
        L_0x05b1:
            r5 = 6
            if (r4 >= r3) goto L_0x0889
            java.lang.Object r6 = r2.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            com.google.common.base.ax r7 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26610g(r6, r0)
            boolean r8 = r7.mo56113h()
            if (r8 == 0) goto L_0x0873
            java.lang.Object r8 = r7.mo56107c()
            com.google.assistant.e.j.e.eu r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r8
            int r8 = r8.f136277e
            r9 = 33
            if (r8 != r9) goto L_0x0873
            java.lang.String r8 = r1.f137800d
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L_0x05da
            goto L_0x0873
        L_0x05da:
            java.lang.Object r8 = r7.mo56107c()
            com.google.assistant.e.j.e.eu r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r8
            int r10 = r8.f136277e
            if (r10 != r9) goto L_0x05e9
            java.lang.Object r8 = r8.f136278f
            com.google.assistant.e.c.c.bd r8 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r8
            goto L_0x05eb
        L_0x05e9:
            com.google.assistant.e.c.c.bd r8 = com.google.assistant.p3897e.p3902c.p3907c.C50959bd.f132657e
        L_0x05eb:
            com.google.protobuf.bn r8 = r8.toBuilder()
            com.google.assistant.e.c.c.ba r8 = (com.google.assistant.p3897e.p3902c.p3907c.C50956ba) r8
            int r9 = r1.f137798b
            r10 = 16
            if (r9 != r10) goto L_0x05fc
            java.lang.Object r9 = r1.f137799c
            com.google.assistant.e.j.te r9 = (com.google.assistant.p3897e.p3921j.C52477te) r9
            goto L_0x05fe
        L_0x05fc:
            com.google.assistant.e.j.te r9 = com.google.assistant.p3897e.p3921j.C52477te.f137748h
        L_0x05fe:
            int r12 = r9.f137751b
            r13 = 4
            if (r12 != r13) goto L_0x0605
        L_0x0603:
            r12 = 1
            goto L_0x060d
        L_0x0605:
            r13 = 5
            if (r12 != r13) goto L_0x0609
            goto L_0x0603
        L_0x0609:
            if (r12 != r5) goto L_0x060c
            goto L_0x0603
        L_0x060c:
            r12 = 0
        L_0x060d:
            r13 = 0
            r14 = 0
            r15 = -1
        L_0x0610:
            com.google.protobuf.bv r10 = r8.instance
            com.google.assistant.e.c.c.bd r10 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r10
            com.google.protobuf.cq r10 = r10.f132660b
            int r10 = r10.size()
            if (r13 >= r10) goto L_0x06c7
            com.google.assistant.e.c.c.az r10 = r8.mo53491a(r13)
            com.google.protobuf.bn r10 = r10.toBuilder()
            com.google.assistant.e.c.c.as r10 = (com.google.assistant.p3897e.p3902c.p3907c.C50947as) r10
            int r11 = r9.f137750a
            r17 = 1
            r11 = r11 & 1
            if (r11 == 0) goto L_0x063a
            r11 = r6
            long r5 = r9.f137753d
            r20 = r2
            long r1 = (long) r13
            int r21 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r21 != 0) goto L_0x063d
            r1 = 1
            goto L_0x063e
        L_0x063a:
            r20 = r2
            r11 = r6
        L_0x063d:
            r1 = 0
        L_0x063e:
            com.google.protobuf.bv r2 = r10.instance
            com.google.assistant.e.c.c.az r2 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r2
            int r2 = r2.f132649i
            com.google.assistant.e.c.c.aw r2 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.m85988a(r2)
            if (r2 != 0) goto L_0x064c
            com.google.assistant.e.c.c.aw r2 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
        L_0x064c:
            com.google.assistant.e.c.c.aw r5 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.HIGHLIGHT
            if (r2 == r5) goto L_0x0665
            com.google.protobuf.bv r2 = r10.instance
            com.google.assistant.e.c.c.az r2 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r2
            int r2 = r2.f132649i
            com.google.assistant.e.c.c.aw r2 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.m85988a(r2)
            if (r2 != 0) goto L_0x065e
            com.google.assistant.e.c.c.aw r2 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
        L_0x065e:
            com.google.assistant.e.c.c.aw r5 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.ERROR
            if (r2 != r5) goto L_0x0663
            goto L_0x0665
        L_0x0663:
            r2 = 0
            goto L_0x0666
        L_0x0665:
            r2 = 1
        L_0x0666:
            com.google.protobuf.bv r5 = r10.instance
            com.google.assistant.e.c.c.az r5 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r5
            int r6 = r5.f132650j
            int r6 = com.google.assistant.p3897e.p3902c.p3907c.C50949au.m85987a(r6)
            if (r6 != 0) goto L_0x0673
            r6 = 1
        L_0x0673:
            if (r1 == 0) goto L_0x068e
            if (r2 == 0) goto L_0x068e
            com.google.assistant.e.c.c.aw r1 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
            r10.copyOnWrite()
            com.google.protobuf.bv r2 = r10.instance
            com.google.assistant.e.c.c.az r2 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r2
            int r1 = r1.f132637f
            r2.f132649i = r1
            int r1 = r2.f132641a
            r1 = r1 | 1024(0x400, float:1.435E-42)
            r2.f132641a = r1
            r8.mo53492b(r13, r10)
            goto L_0x06ca
        L_0x068e:
            if (r1 == 0) goto L_0x06ba
            r1 = 1
            if (r6 == r1) goto L_0x0695
        L_0x0693:
            r14 = 1
            goto L_0x06bd
        L_0x0695:
            int r1 = r5.f132649i
            com.google.assistant.e.c.c.aw r1 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.m85988a(r1)
            if (r1 != 0) goto L_0x069f
            com.google.assistant.e.c.c.aw r1 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
        L_0x069f:
            com.google.assistant.e.c.c.aw r2 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
            if (r1 != r2) goto L_0x06bd
            com.google.assistant.e.c.c.aw r1 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.HIGHLIGHT
            r10.copyOnWrite()
            com.google.protobuf.bv r2 = r10.instance
            com.google.assistant.e.c.c.az r2 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r2
            int r1 = r1.f132637f
            r2.f132649i = r1
            int r1 = r2.f132641a
            r1 = r1 | 1024(0x400, float:1.435E-42)
            r2.f132641a = r1
            r8.mo53492b(r13, r10)
            goto L_0x0693
        L_0x06ba:
            if (r2 == 0) goto L_0x06bd
            r15 = r13
        L_0x06bd:
            int r13 = r13 + 1
            r1 = r31
            r6 = r11
            r2 = r20
            r5 = 6
            goto L_0x0610
        L_0x06c7:
            r20 = r2
            r11 = r6
        L_0x06ca:
            if (r14 == 0) goto L_0x06f4
            if (r15 < 0) goto L_0x06f4
            com.google.assistant.e.c.c.az r1 = r8.mo53491a(r15)
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.assistant.e.c.c.as r1 = (com.google.assistant.p3897e.p3902c.p3907c.C50947as) r1
            com.google.assistant.e.c.c.aw r2 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.assistant.e.c.c.az r5 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r5
            int r2 = r2.f132637f
            r5.f132649i = r2
            int r2 = r5.f132641a
            r2 = r2 | 1024(0x400, float:1.435E-42)
            r5.f132641a = r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.c.c.az r1 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r1
            r8.mo53493c(r15, r1)
        L_0x06f4:
            if (r12 == 0) goto L_0x083e
            int r1 = r9.f137750a
            r1 = r1 & 64
            if (r1 == 0) goto L_0x083e
            r1 = 0
        L_0x06fd:
            com.google.protobuf.bv r2 = r8.instance
            com.google.assistant.e.c.c.bd r2 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r2
            com.google.protobuf.cq r2 = r2.f132660b
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x083e
            com.google.assistant.e.c.c.az r2 = r8.mo53491a(r1)
            com.google.protobuf.bn r2 = r2.toBuilder()
            com.google.assistant.e.c.c.as r2 = (com.google.assistant.p3897e.p3902c.p3907c.C50947as) r2
            com.google.protobuf.bv r5 = r2.instance
            com.google.assistant.e.c.c.az r5 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r5
            java.lang.String r5 = r5.f132652l
            java.lang.String r6 = "custom_date"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0770
            r5 = r27
            boolean r6 = r11.equals(r5)
            if (r6 == 0) goto L_0x0772
            int r6 = r9.f137751b
            r10 = 4
            if (r6 != r10) goto L_0x0772
            java.lang.String r6 = r9.f137756g
            r2.copyOnWrite()
            com.google.protobuf.bv r12 = r2.instance
            com.google.assistant.e.c.c.az r12 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r12
            r6.getClass()
            int r13 = r12.f132641a
            r14 = 2
            r13 = r13 | r14
            r12.f132641a = r13
            r12.f132645e = r6
            int r6 = r9.f137751b
            if (r6 != r10) goto L_0x074b
            java.lang.Object r6 = r9.f137752c
            com.google.assistant.e.j.qb r6 = (com.google.assistant.p3897e.p3921j.C52393qb) r6
            goto L_0x074d
        L_0x074b:
            com.google.assistant.e.j.qb r6 = com.google.assistant.p3897e.p3921j.C52393qb.f137479e
        L_0x074d:
            r2.copyOnWrite()
            com.google.protobuf.bv r10 = r2.instance
            com.google.assistant.e.c.c.az r10 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r10
            r6.getClass()
            r10.f132643c = r6
            r6 = 3
            r10.f132642b = r6
            com.google.assistant.e.c.c.aw r6 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.HIGHLIGHT
            r2.copyOnWrite()
            com.google.protobuf.bv r10 = r2.instance
            com.google.assistant.e.c.c.az r10 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r10
            int r6 = r6.f132637f
            r10.f132649i = r6
            int r6 = r10.f132641a
            r6 = r6 | 1024(0x400, float:1.435E-42)
            r10.f132641a = r6
            goto L_0x0772
        L_0x0770:
            r5 = r27
        L_0x0772:
            com.google.protobuf.bv r6 = r2.instance
            com.google.assistant.e.c.c.az r6 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r6
            java.lang.String r6 = r6.f132652l
            java.lang.String r10 = "custom_time"
            boolean r6 = r6.equals(r10)
            if (r6 == 0) goto L_0x07cf
            r6 = r26
            boolean r10 = r11.equals(r6)
            if (r10 == 0) goto L_0x07d1
            int r10 = r9.f137751b
            r12 = 5
            if (r10 != r12) goto L_0x07d1
            java.lang.String r10 = r9.f137756g
            r2.copyOnWrite()
            com.google.protobuf.bv r13 = r2.instance
            com.google.assistant.e.c.c.az r13 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r13
            r10.getClass()
            int r14 = r13.f132641a
            r15 = 2
            r14 = r14 | r15
            r13.f132641a = r14
            r13.f132645e = r10
            int r10 = r9.f137751b
            if (r10 != r12) goto L_0x07aa
            java.lang.Object r10 = r9.f137752c
            com.google.assistant.e.j.ql r10 = (com.google.assistant.p3897e.p3921j.C52403ql) r10
            goto L_0x07ac
        L_0x07aa:
            com.google.assistant.e.j.ql r10 = com.google.assistant.p3897e.p3921j.C52403ql.f137512f
        L_0x07ac:
            r2.copyOnWrite()
            com.google.protobuf.bv r12 = r2.instance
            com.google.assistant.e.c.c.az r12 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r12
            r10.getClass()
            r12.f132643c = r10
            r10 = 4
            r12.f132642b = r10
            com.google.assistant.e.c.c.aw r10 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.HIGHLIGHT
            r2.copyOnWrite()
            com.google.protobuf.bv r12 = r2.instance
            com.google.assistant.e.c.c.az r12 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r12
            int r10 = r10.f132637f
            r12.f132649i = r10
            int r10 = r12.f132641a
            r10 = r10 | 1024(0x400, float:1.435E-42)
            r12.f132641a = r10
            goto L_0x07d1
        L_0x07cf:
            r6 = r26
        L_0x07d1:
            com.google.protobuf.bv r10 = r2.instance
            com.google.assistant.e.c.c.az r10 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r10
            java.lang.String r10 = r10.f132652l
            java.lang.String r12 = "custom_recurrence"
            boolean r10 = r10.equals(r12)
            if (r10 == 0) goto L_0x082f
            r10 = r25
            boolean r12 = r11.equals(r10)
            if (r12 == 0) goto L_0x0831
            int r12 = r9.f137751b
            r13 = 6
            if (r12 != r13) goto L_0x0831
            java.lang.String r12 = r9.f137756g
            r2.copyOnWrite()
            com.google.protobuf.bv r14 = r2.instance
            com.google.assistant.e.c.c.az r14 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r14
            r12.getClass()
            int r15 = r14.f132641a
            r17 = 2
            r15 = r15 | 2
            r14.f132641a = r15
            r14.f132645e = r12
            int r12 = r9.f137751b
            if (r12 != r13) goto L_0x080b
            java.lang.Object r12 = r9.f137752c
            com.google.assistant.e.j.qf r12 = (com.google.assistant.p3897e.p3921j.C52397qf) r12
            goto L_0x080d
        L_0x080b:
            com.google.assistant.e.j.qf r12 = com.google.assistant.p3897e.p3921j.C52397qf.f137491j
        L_0x080d:
            r2.copyOnWrite()
            com.google.protobuf.bv r14 = r2.instance
            com.google.assistant.e.c.c.az r14 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r14
            r12.getClass()
            r14.f132643c = r12
            r14.f132642b = r13
            com.google.assistant.e.c.c.aw r12 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.HIGHLIGHT
            r2.copyOnWrite()
            com.google.protobuf.bv r13 = r2.instance
            com.google.assistant.e.c.c.az r13 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r13
            int r12 = r12.f132637f
            r13.f132649i = r12
            int r12 = r13.f132641a
            r12 = r12 | 1024(0x400, float:1.435E-42)
            r13.f132641a = r12
            goto L_0x0831
        L_0x082f:
            r10 = r25
        L_0x0831:
            r8.mo53492b(r1, r2)
            int r1 = r1 + 1
            r27 = r5
            r26 = r6
            r25 = r10
            goto L_0x06fd
        L_0x083e:
            r10 = r25
            r6 = r26
            r5 = r27
            java.lang.Object r1 = r7.mo56107c()
            com.google.assistant.e.j.e.eu r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r1
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.assistant.e.j.e.eq r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            com.google.protobuf.bv r7 = r8.build()
            com.google.assistant.e.c.c.bd r7 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r7
            r7.getClass()
            r2.f136278f = r7
            r7 = 33
            r2.f136277e = r7
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.j.e.eu r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r1
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
            com.google.assistant.e.j.e.ff r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26609f(r1, r2, r0)
            goto L_0x087b
        L_0x0873:
            r20 = r2
            r10 = r25
            r6 = r26
            r5 = r27
        L_0x087b:
            int r4 = r4 + 1
            r1 = r31
            r27 = r5
            r26 = r6
            r25 = r10
            r2 = r20
            goto L_0x05b1
        L_0x0889:
            r10 = r25
            r5 = r27
            com.google.common.base.ax r1 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26610g(r5, r0)
            j$.util.Optional r1 = m26488u(r1)
            boolean r2 = r1.isPresent()
            if (r2 == 0) goto L_0x0a19
            java.lang.Object r2 = r1.get()
            com.google.assistant.e.c.c.az r2 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r2
            int r2 = r2.f132642b
            r3 = 3
            if (r2 != r3) goto L_0x0a19
            java.lang.Object r1 = r1.get()
            com.google.assistant.e.c.c.az r1 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r1
            int r2 = r1.f132642b
            if (r2 != r3) goto L_0x08b5
            java.lang.Object r1 = r1.f132643c
            com.google.assistant.e.j.qb r1 = (com.google.assistant.p3897e.p3921j.C52393qb) r1
            goto L_0x08b7
        L_0x08b5:
            com.google.assistant.e.j.qb r1 = com.google.assistant.p3897e.p3921j.C52393qb.f137479e
        L_0x08b7:
            com.google.common.base.ax r2 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26610g(r10, r0)
            boolean r3 = r2.mo56113h()
            if (r3 == 0) goto L_0x0a19
            java.lang.Object r3 = r2.mo56107c()
            com.google.assistant.e.j.e.eu r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r3
            int r3 = r3.f136277e
            r4 = 33
            if (r3 != r4) goto L_0x0a19
            java.lang.Object r3 = r2.mo56107c()
            com.google.assistant.e.j.e.eu r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r3
            int r5 = r3.f136277e
            if (r5 != r4) goto L_0x08dc
            java.lang.Object r3 = r3.f136278f
            com.google.assistant.e.c.c.bd r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r3
            goto L_0x08de
        L_0x08dc:
            com.google.assistant.e.c.c.bd r3 = com.google.assistant.p3897e.p3902c.p3907c.C50959bd.f132657e
        L_0x08de:
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.assistant.e.c.c.ba r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50956ba) r3
            int r4 = r1.f137482b
            int r5 = r1.f137483c
            int r1 = r1.f137484d
            j$.time.LocalDate r1 = p3186j$.time.LocalDate.m71157of(r4, r5, r1)
            r4 = 0
        L_0x08ef:
            com.google.protobuf.bv r5 = r3.instance
            com.google.assistant.e.c.c.bd r5 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r5
            com.google.protobuf.cq r5 = r5.f132660b
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x09eb
            com.google.assistant.e.c.c.az r5 = r3.mo53491a(r4)
            com.google.assistant.e.j.qf r6 = com.google.assistant.p3897e.p3921j.C52397qf.f137491j
            java.lang.String r7 = r5.f132652l
            java.lang.String r8 = "recurrence_daily"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x094a
            com.google.assistant.e.j.qf r6 = com.google.assistant.p3897e.p3921j.C52397qf.f137491j
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.e.j.qe r6 = (com.google.assistant.p3897e.p3921j.C52396qe) r6
            r7 = 0
            java.lang.Integer r23 = java.lang.Integer.valueOf(r7)
            r8 = 1
            java.lang.Integer r24 = java.lang.Integer.valueOf(r8)
            r9 = 2
            java.lang.Integer r25 = java.lang.Integer.valueOf(r9)
            r10 = 3
            java.lang.Integer r26 = java.lang.Integer.valueOf(r10)
            r12 = 4
            java.lang.Integer r27 = java.lang.Integer.valueOf(r12)
            r13 = 5
            java.lang.Integer r28 = java.lang.Integer.valueOf(r13)
            java.lang.Integer[] r14 = new java.lang.Integer[r8]
            r15 = 6
            java.lang.Integer r16 = java.lang.Integer.valueOf(r15)
            r14[r7] = r16
            r29 = r14
            com.google.common.b.ij r14 = com.google.common.p4522b.C58528ij.m90015O(r23, r24, r25, r26, r27, r28, r29)
            r6.mo53850a(r14)
            com.google.protobuf.bv r6 = r6.build()
            com.google.assistant.e.j.qf r6 = (com.google.assistant.p3897e.p3921j.C52397qf) r6
            goto L_0x0950
        L_0x094a:
            r7 = 0
            r8 = 1
            r9 = 2
            r10 = 3
            r12 = 4
            r13 = 5
        L_0x0950:
            java.lang.String r14 = r5.f132652l
            java.lang.String r15 = "recurrence_weekly"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0980
            com.google.assistant.e.j.qf r6 = com.google.assistant.p3897e.p3921j.C52397qf.f137491j
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.e.j.qe r6 = (com.google.assistant.p3897e.p3921j.C52396qe) r6
            j$.time.DayOfWeek r14 = r1.getDayOfWeek()
            int r14 = r14.getValue()
            r15 = 7
            if (r14 != r15) goto L_0x096f
            r14 = 0
            goto L_0x0977
        L_0x096f:
            j$.time.DayOfWeek r14 = r1.getDayOfWeek()
            int r14 = r14.getValue()
        L_0x0977:
            r6.mo53852c(r14)
            com.google.protobuf.bv r6 = r6.build()
            com.google.assistant.e.j.qf r6 = (com.google.assistant.p3897e.p3921j.C52397qf) r6
        L_0x0980:
            java.lang.String r14 = r5.f132652l
            java.lang.String r15 = "recurrence_monthly"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x099f
            com.google.assistant.e.j.qf r6 = com.google.assistant.p3897e.p3921j.C52397qf.f137491j
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.e.j.qe r6 = (com.google.assistant.p3897e.p3921j.C52396qe) r6
            int r14 = r1.getDayOfMonth()
            r6.mo53851b(r14)
            com.google.protobuf.bv r6 = r6.build()
            com.google.assistant.e.j.qf r6 = (com.google.assistant.p3897e.p3921j.C52397qf) r6
        L_0x099f:
            java.lang.String r14 = r5.f132652l
            java.lang.String r15 = "recurrence_yearly"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x09c5
            com.google.assistant.e.j.qf r6 = com.google.assistant.p3897e.p3921j.C52397qf.f137491j
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.e.j.qe r6 = (com.google.assistant.p3897e.p3921j.C52396qe) r6
            int r14 = r1.getDayOfMonth()
            r6.mo53851b(r14)
            int r14 = r1.getMonthValue()
            r6.mo53853d(r14)
            com.google.protobuf.bv r6 = r6.build()
            com.google.assistant.e.j.qf r6 = (com.google.assistant.p3897e.p3921j.C52397qf) r6
        L_0x09c5:
            com.google.assistant.e.j.qf r14 = com.google.assistant.p3897e.p3921j.C52397qf.f137491j
            boolean r14 = r14.equals(r6)
            if (r14 != 0) goto L_0x09e6
            com.google.protobuf.bn r5 = r5.toBuilder()
            com.google.assistant.e.c.c.as r5 = (com.google.assistant.p3897e.p3902c.p3907c.C50947as) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r14 = r5.instance
            com.google.assistant.e.c.c.az r14 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r14
            r6.getClass()
            r14.f132643c = r6
            r6 = 6
            r14.f132642b = r6
            r3.mo53492b(r4, r5)
            goto L_0x09e7
        L_0x09e6:
            r6 = 6
        L_0x09e7:
            int r4 = r4 + 1
            goto L_0x08ef
        L_0x09eb:
            java.lang.Object r1 = r2.mo56107c()
            com.google.assistant.e.j.e.eu r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r1
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.assistant.e.j.e.eq r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.e.c.c.bd r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r3
            r3.getClass()
            r2.f136278f = r3
            r3 = 33
            r2.f136277e = r3
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.j.e.eu r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r1
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
            com.google.assistant.e.j.e.ff r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26609f(r1, r2, r0)
        L_0x0a19:
            return r0
        L_0x0a1a:
            com.google.common.b.gu r1 = f36545c
            com.google.assistant.e.j.e.ff r0 = m26468a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c.C11169be.m26487t(com.google.assistant.e.j.e.ff, com.google.assistant.e.j.tr):com.google.assistant.e.j.e.ff");
    }

    /* renamed from: u */
    private static Optional m26488u(C58833ax axVar) {
        C50959bd bdVar;
        if (!axVar.mo56113h()) {
            return Optional.empty();
        }
        C51941eu euVar = (C51941eu) axVar.mo56107c();
        if (euVar.f136277e == 33) {
            bdVar = (C50959bd) euVar.f136278f;
        } else {
            bdVar = C50959bd.f132657e;
        }
        return Collection.EL.stream(bdVar.f132660b).filter(C11163az.f36537a).findFirst();
    }
}
