package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d;

import com.google.android.libraries.assistant.portable.p1584a.p1585a.C19045c;
import com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x;
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

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.ao */
/* compiled from: PG */
public final class C33070ao {

    /* renamed from: a */
    public static final /* synthetic */ int f88535a = 0;

    /* renamed from: b */
    private static final C59071e f88536b = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.ao");

    /* renamed from: c */
    private static final C58485gu f88537c = C58485gu.m89848p("datetime.date", "datetime.time", "recurrence");

    /* renamed from: a */
    public static C51953ff m61336a(C51953ff ffVar, C58485gu guVar) {
        C50959bd bdVar;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            Optional g = C33136x.m61490g((String) guVar.get(i2), ffVar);
            if (g.isPresent() && ((C51941eu) g.get()).f136277e == 33) {
                C51941eu euVar = (C51941eu) g.get();
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
                C51937eq eqVar = (C51937eq) ((C51941eu) g.get()).toBuilder();
                eqVar.copyOnWrite();
                C51941eu euVar2 = (C51941eu) eqVar.instance;
                C50959bd bdVar2 = (C50959bd) baVar.build();
                bdVar2.getClass();
                euVar2.f136278f = bdVar2;
                euVar2.f136277e = 33;
                ffVar = C33136x.m61489f((C51941eu) eqVar.build(), ffVar, Optional.empty());
            }
        }
        return ffVar;
    }

    /* renamed from: b */
    public static C51953ff m61337b(String str, C51953ff ffVar) {
        C51030du duVar;
        C51016dg dgVar;
        Optional g = C33136x.m61490g("trigger_field", ffVar);
        if (!g.isPresent()) {
            return ffVar;
        }
        C51941eu euVar = (C51941eu) g.get();
        if (euVar.f136277e == 6) {
            duVar = (C51030du) euVar.f136278f;
        } else {
            duVar = C51030du.f132868g;
        }
        C51021dl dlVar = (C51021dl) duVar.toBuilder();
        if (Collection.EL.stream(Collections.unmodifiableList(((C51030du) dlVar.instance).f132875f)).noneMatch(new C33069an(str))) {
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
        C51937eq eqVar = (C51937eq) ((C51941eu) g.get()).toBuilder();
        eqVar.copyOnWrite();
        C51941eu euVar2 = (C51941eu) eqVar.instance;
        C51030du duVar2 = (C51030du) dlVar.build();
        duVar2.getClass();
        euVar2.f136278f = duVar2;
        euVar2.f136277e = 6;
        return C33136x.m61489f((C51941eu) eqVar.build(), ffVar, Optional.empty());
    }

    /* renamed from: c */
    public static C51953ff m61338c(C51953ff ffVar, C68015e eVar, boolean z) {
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
    public static C51953ff m61339d(C51953ff ffVar) {
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
        return C33136x.m61487d((C52513un) ukVar.build(), ffVar);
    }

    /* renamed from: e */
    public static C51953ff m61340e(String str, boolean z, C51953ff ffVar) {
        C50936ah ahVar;
        Optional g = C33136x.m61490g(str, ffVar);
        if (!g.isPresent()) {
            return ffVar;
        }
        C51937eq eqVar = (C51937eq) ((C51941eu) g.get()).toBuilder();
        C51941eu euVar = (C51941eu) g.get();
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
        return C33136x.m61489f((C51941eu) eqVar.build(), ffVar, Optional.empty());
    }

    /* JADX WARNING: Removed duplicated region for block: B:194:0x065c  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0662  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0684  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0687 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x06a2  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x06cc  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.assistant.p3897e.p3921j.p3926e.C51953ff m61341f(com.google.assistant.p3897e.p3921j.p3926e.C51953ff r30, com.google.assistant.p3897e.p3921j.C52490tr r31, com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33096r r32) {
        /*
            r0 = r30
            r1 = r31
            r2 = r32
            boolean r3 = r1.f137802f
            if (r3 != 0) goto L_0x000b
            return r0
        L_0x000b:
            java.lang.String r3 = "sub_cancel_field"
            boolean r3 = m61349n(r3, r0, r1)
            if (r3 != 0) goto L_0x0a3d
            p3186j$.util.Optional.empty()
            java.lang.String r3 = "main_chips"
            j$.util.Optional r4 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r3, r0)
            com.google.assistant.e.c.c.bd r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33073ar.m61358a(r30)
            int r6 = r1.f137798b
            r7 = 16
            if (r6 != r7) goto L_0x002b
            java.lang.Object r6 = r1.f137799c
            com.google.assistant.e.j.te r6 = (com.google.assistant.p3897e.p3921j.C52477te) r6
            goto L_0x002d
        L_0x002b:
            com.google.assistant.e.j.te r6 = com.google.assistant.p3897e.p3921j.C52477te.f137748h
        L_0x002d:
            boolean r6 = r6.f137755f
            java.lang.String r8 = "recurrence"
            java.lang.String r9 = "datetime.time"
            r10 = 3
            java.lang.String r11 = "datetime.date"
            r12 = 4
            r13 = 2
            r14 = 33
            if (r6 == 0) goto L_0x0116
            int r6 = r1.f137798b
            if (r6 != r7) goto L_0x0045
            java.lang.Object r1 = r1.f137799c
            com.google.assistant.e.j.te r1 = (com.google.assistant.p3897e.p3921j.C52477te) r1
            goto L_0x0047
        L_0x0045:
            com.google.assistant.e.j.te r1 = com.google.assistant.p3897e.p3921j.C52477te.f137748h
        L_0x0047:
            long r6 = r1.f137753d
            int r1 = com.google.common.p4575r.C60757n.m92740a(r6)
            com.google.assistant.e.c.c.bd r6 = com.google.assistant.p3897e.p3902c.p3907c.C50959bd.f132657e
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0115
            int r1 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33073ar.m61363f(r1, r5)
            if (r1 != r13) goto L_0x006c
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89847o(r11, r9)
            com.google.assistant.e.j.e.ff r0 = m61336a(r0, r1)
            com.google.assistant.e.j.e.ff r0 = r2.mo38521a(r0)
            com.google.assistant.e.j.e.ff r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33073ar.m61360c(r0)
            r1 = 2
        L_0x006c:
            if (r1 == r10) goto L_0x0070
            if (r1 != r13) goto L_0x007c
        L_0x0070:
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89846n(r8)
            com.google.assistant.e.j.e.ff r0 = m61336a(r0, r5)
            com.google.assistant.e.j.e.ff r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33073ar.m61359b(r0)
        L_0x007c:
            if (r1 != r12) goto L_0x00e9
            com.google.assistant.e.j.e.ff r0 = r2.mo38521a(r0)
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89848p(r11, r9, r8)
            com.google.assistant.e.j.e.ff r0 = m61336a(r0, r1)
            com.google.assistant.e.c.c.bd r1 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33073ar.m61358a(r0)
            j$.util.Optional r2 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r3, r0)
            com.google.assistant.e.c.c.bd r3 = com.google.assistant.p3897e.p3902c.p3907c.C50959bd.f132657e
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00e9
            boolean r3 = r2.isPresent()
            if (r3 == 0) goto L_0x00e9
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.assistant.e.c.c.ba r1 = (com.google.assistant.p3897e.p3902c.p3907c.C50956ba) r1
            java.lang.String r3 = "location_select_complete"
            com.google.assistant.e.c.c.aw r5 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.HIDDEN
            com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33073ar.m61361d(r1, r3, r5)
            java.lang.String r3 = "select_time"
            com.google.assistant.e.c.c.aw r5 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
            com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33073ar.m61361d(r1, r3, r5)
            java.lang.String r3 = "select_location"
            com.google.assistant.e.c.c.aw r5 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
            com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33073ar.m61361d(r1, r3, r5)
            java.lang.Object r2 = r2.get()
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            com.google.protobuf.bn r2 = r2.toBuilder()
            com.google.assistant.e.j.e.eq r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.e.j.e.eu r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r3
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.c.c.bd r1 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r1
            r1.getClass()
            r3.f136278f = r1
            r3.f136277e = r14
            com.google.protobuf.bv r1 = r2.build()
            com.google.assistant.e.j.e.eu r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r1
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
            com.google.assistant.e.j.e.ff r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61489f(r1, r0, r2)
        L_0x00e9:
            java.lang.Object r1 = r4.get()
            com.google.assistant.e.j.e.eu r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r1
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.assistant.e.j.e.eq r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r1
            com.google.assistant.e.c.c.bd r2 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33073ar.m61358a(r0)
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.e.j.e.eu r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r3
            r2.getClass()
            r3.f136278f = r2
            r3.f136277e = r14
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.j.e.eu r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r1
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
            com.google.assistant.e.j.e.ff r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61489f(r1, r0, r2)
        L_0x0115:
            return r0
        L_0x0116:
            java.lang.String r2 = r1.f137800d
            java.lang.String r4 = "trigger_field"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x012e
            com.google.common.b.gu r2 = f88537c
            com.google.assistant.e.j.e.ff r0 = m61336a(r0, r2)
            com.google.assistant.e.j.e.ff r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33073ar.m61360c(r0)
            com.google.assistant.e.j.e.ff r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33073ar.m61359b(r0)
        L_0x012e:
            int r2 = r1.f137798b
            if (r2 != r7) goto L_0x0a3c
            java.lang.Object r2 = r1.f137799c
            com.google.assistant.e.j.te r2 = (com.google.assistant.p3897e.p3921j.C52477te) r2
            boolean r2 = r2.f137754e
            if (r2 != 0) goto L_0x013c
            goto L_0x0a3c
        L_0x013c:
            boolean r2 = m61350o(r0)
            r15 = 1
            if (r2 == 0) goto L_0x05b3
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89846n(r3)
            r3 = r2
            com.google.common.b.pq r3 = (com.google.common.p4522b.C58724pq) r3
            int r3 = r3.f156474d
            r10 = 0
        L_0x014d:
            if (r10 >= r3) goto L_0x05b3
            java.lang.Object r17 = r2.get(r10)
            r13 = r17
            java.lang.String r13 = (java.lang.String) r13
            j$.util.Optional r17 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r13, r0)
            boolean r19 = r17.isPresent()
            if (r19 == 0) goto L_0x0594
            java.lang.Object r19 = r17.get()
            r4 = r19
            com.google.assistant.e.j.e.eu r4 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r4
            int r4 = r4.f136277e
            if (r4 != r14) goto L_0x0594
            java.lang.String r4 = r1.f137800d
            boolean r4 = r4.equals(r13)
            if (r4 != 0) goto L_0x0177
            goto L_0x0594
        L_0x0177:
            java.lang.Object r4 = r17.get()
            com.google.assistant.e.j.e.eu r4 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r4
            int r13 = r4.f136277e
            if (r13 != r14) goto L_0x0186
            java.lang.Object r4 = r4.f136278f
            com.google.assistant.e.c.c.bd r4 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r4
            goto L_0x0188
        L_0x0186:
            com.google.assistant.e.c.c.bd r4 = com.google.assistant.p3897e.p3902c.p3907c.C50959bd.f132657e
        L_0x0188:
            com.google.protobuf.bn r4 = r4.toBuilder()
            com.google.assistant.e.c.c.ba r4 = (com.google.assistant.p3897e.p3902c.p3907c.C50956ba) r4
            int r13 = r1.f137798b
            if (r13 != r7) goto L_0x0197
            java.lang.Object r13 = r1.f137799c
            com.google.assistant.e.j.te r13 = (com.google.assistant.p3897e.p3921j.C52477te) r13
            goto L_0x0199
        L_0x0197:
            com.google.assistant.e.j.te r13 = com.google.assistant.p3897e.p3921j.C52477te.f137748h
        L_0x0199:
            r7 = 0
        L_0x019a:
            com.google.protobuf.bv r6 = r4.instance
            com.google.assistant.e.c.c.bd r6 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r6
            com.google.protobuf.cq r6 = r6.f132660b
            int r6 = r6.size()
            if (r7 >= r6) goto L_0x0559
            com.google.assistant.e.c.c.az r6 = r4.mo53491a(r7)
            com.google.protobuf.bn r6 = r6.toBuilder()
            com.google.assistant.e.c.c.as r6 = (com.google.assistant.p3897e.p3902c.p3907c.C50947as) r6
            int r12 = r13.f137750a
            r12 = r12 & r15
            if (r12 == 0) goto L_0x0539
            r21 = r6
            long r5 = r13.f137753d
            r22 = r13
            long r12 = (long) r7
            int r23 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r23 != 0) goto L_0x052e
            com.google.assistant.e.c.c.az r5 = r4.mo53491a(r7)
            java.lang.String r5 = r5.f132652l
            java.lang.String r6 = "default_time"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x052e
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89846n(r11)
            r6 = r5
            com.google.common.b.pq r6 = (com.google.common.p4522b.C58724pq) r6
            int r6 = r6.f156474d
            r13 = r0
            r0 = 0
        L_0x01d9:
            if (r0 >= r6) goto L_0x035c
            java.lang.Object r12 = r5.get(r0)
            java.lang.String r12 = (java.lang.String) r12
            j$.util.Optional r22 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r12, r13)
            boolean r12 = r22.isPresent()
            if (r12 == 0) goto L_0x0341
            java.lang.Object r12 = r22.get()
            com.google.assistant.e.j.e.eu r12 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r12
            int r12 = r12.f136277e
            if (r12 != r14) goto L_0x0341
            r12 = r21
            com.google.protobuf.bv r15 = r12.instance
            com.google.assistant.e.c.c.az r15 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r15
            int r14 = r15.f132642b
            r24 = r2
            r2 = 5
            if (r14 != r2) goto L_0x0208
            r2 = r12
            java.lang.Object r14 = r15.f132643c
            com.google.assistant.e.j.qd r14 = (com.google.assistant.p3897e.p3921j.C52395qd) r14
            goto L_0x020b
        L_0x0208:
            r2 = r12
            com.google.assistant.e.j.qd r14 = com.google.assistant.p3897e.p3921j.C52395qd.f137485e
        L_0x020b:
            com.google.assistant.e.j.qb r14 = r14.f137488b
            if (r14 != 0) goto L_0x0211
            com.google.assistant.e.j.qb r14 = com.google.assistant.p3897e.p3921j.C52393qb.f137479e
        L_0x0211:
            com.google.common.v.g r15 = com.google.common.p4580v.C60948g.f165068a
            j$.time.ZoneId r12 = p3186j$.time.ZoneId.systemDefault()
            j$.time.LocalDate r12 = com.google.common.p4580v.C60949h.m93107a(r15, r12)
            int r15 = r14.f137482b
            r25 = r3
            int r3 = r12.getYear()
            if (r15 != r3) goto L_0x0237
            int r3 = r14.f137483c
            int r15 = r12.getMonthValue()
            if (r3 != r15) goto L_0x0237
            int r3 = r14.f137484d
            int r12 = r12.getDayOfMonth()
            if (r3 != r12) goto L_0x0237
            r3 = 1
            goto L_0x0238
        L_0x0237:
            r3 = 0
        L_0x0238:
            java.lang.Object r12 = r22.get()
            com.google.assistant.e.j.e.eu r12 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r12
            int r14 = r12.f136277e
            r15 = 33
            if (r14 != r15) goto L_0x0249
            java.lang.Object r12 = r12.f136278f
            com.google.assistant.e.c.c.bd r12 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r12
            goto L_0x024b
        L_0x0249:
            com.google.assistant.e.c.c.bd r12 = com.google.assistant.p3897e.p3902c.p3907c.C50959bd.f132657e
        L_0x024b:
            com.google.protobuf.bn r12 = r12.toBuilder()
            com.google.assistant.e.c.c.ba r12 = (com.google.assistant.p3897e.p3902c.p3907c.C50956ba) r12
            r14 = 1
        L_0x0252:
            com.google.protobuf.bv r15 = r12.instance
            com.google.assistant.e.c.c.bd r15 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r15
            com.google.protobuf.cq r15 = r15.f132660b
            int r15 = r15.size()
            if (r14 >= r15) goto L_0x030b
            com.google.assistant.e.c.c.az r15 = r12.mo53491a(r14)
            com.google.protobuf.bn r15 = r15.toBuilder()
            com.google.assistant.e.c.c.as r15 = (com.google.assistant.p3897e.p3902c.p3907c.C50947as) r15
            r26 = r5
            java.lang.String r5 = "tomorrow_chip"
            r27 = r6
            java.lang.String r6 = "today_chip"
            if (r3 == 0) goto L_0x02ba
            r28 = r3
            com.google.protobuf.bv r3 = r15.instance
            com.google.assistant.e.c.c.az r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r3
            java.lang.String r3 = r3.f132652l
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x0297
            com.google.assistant.e.c.c.aw r3 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.HIGHLIGHT
            r15.copyOnWrite()
            com.google.protobuf.bv r5 = r15.instance
            com.google.assistant.e.c.c.az r5 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r5
            int r3 = r3.f132637f
            r5.f132649i = r3
            int r3 = r5.f132641a
            r3 = r3 | 1024(0x400, float:1.435E-42)
            r5.f132641a = r3
            r12.mo53492b(r14, r15)
            goto L_0x0301
        L_0x0297:
            com.google.protobuf.bv r3 = r15.instance
            com.google.assistant.e.c.c.az r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r3
            java.lang.String r3 = r3.f132652l
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0301
            com.google.assistant.e.c.c.aw r3 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
            r15.copyOnWrite()
            com.google.protobuf.bv r5 = r15.instance
            com.google.assistant.e.c.c.az r5 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r5
            int r3 = r3.f132637f
            r5.f132649i = r3
            int r3 = r5.f132641a
            r3 = r3 | 1024(0x400, float:1.435E-42)
            r5.f132641a = r3
            r12.mo53492b(r14, r15)
            goto L_0x0301
        L_0x02ba:
            r28 = r3
            com.google.protobuf.bv r3 = r15.instance
            com.google.assistant.e.c.c.az r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r3
            java.lang.String r3 = r3.f132652l
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x02df
            com.google.assistant.e.c.c.aw r3 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
            r15.copyOnWrite()
            com.google.protobuf.bv r5 = r15.instance
            com.google.assistant.e.c.c.az r5 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r5
            int r3 = r3.f132637f
            r5.f132649i = r3
            int r3 = r5.f132641a
            r3 = r3 | 1024(0x400, float:1.435E-42)
            r5.f132641a = r3
            r12.mo53492b(r14, r15)
            goto L_0x0301
        L_0x02df:
            com.google.protobuf.bv r3 = r15.instance
            com.google.assistant.e.c.c.az r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r3
            java.lang.String r3 = r3.f132652l
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0301
            com.google.assistant.e.c.c.aw r3 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.HIGHLIGHT
            r15.copyOnWrite()
            com.google.protobuf.bv r5 = r15.instance
            com.google.assistant.e.c.c.az r5 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r5
            int r3 = r3.f132637f
            r5.f132649i = r3
            int r3 = r5.f132641a
            r3 = r3 | 1024(0x400, float:1.435E-42)
            r5.f132641a = r3
            r12.mo53492b(r14, r15)
        L_0x0301:
            int r14 = r14 + 1
            r5 = r26
            r6 = r27
            r3 = r28
            goto L_0x0252
        L_0x030b:
            r26 = r5
            r27 = r6
            java.lang.Object r3 = r22.get()
            com.google.assistant.e.j.e.eu r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r3
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.assistant.e.j.e.eq r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.assistant.e.j.e.eu r5 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r5
            com.google.protobuf.bv r6 = r12.build()
            com.google.assistant.e.c.c.bd r6 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r6
            r6.getClass()
            r5.f136278f = r6
            r6 = 33
            r5.f136277e = r6
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.e.j.e.eu r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r3
            j$.util.Optional r5 = p3186j$.util.Optional.empty()
            com.google.assistant.e.j.e.ff r3 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61489f(r3, r13, r5)
            r13 = r3
            goto L_0x034b
        L_0x0341:
            r24 = r2
            r25 = r3
            r26 = r5
            r27 = r6
            r2 = r21
        L_0x034b:
            int r0 = r0 + 1
            r21 = r2
            r2 = r24
            r3 = r25
            r5 = r26
            r6 = r27
            r14 = 33
            r15 = 1
            goto L_0x01d9
        L_0x035c:
            r24 = r2
            r25 = r3
            r2 = r21
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89846n(r9)
            r3 = r0
            com.google.common.b.pq r3 = (com.google.common.p4522b.C58724pq) r3
            int r3 = r3.f156474d
            r5 = 0
        L_0x036c:
            if (r5 >= r3) goto L_0x0510
            java.lang.Object r6 = r0.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            j$.util.Optional r6 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r6, r13)
            boolean r12 = r6.isPresent()
            if (r12 == 0) goto L_0x04f8
            java.lang.Object r12 = r6.get()
            com.google.assistant.e.j.e.eu r12 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r12
            int r12 = r12.f136277e
            r14 = 33
            if (r12 != r14) goto L_0x04f8
            com.google.protobuf.bv r12 = r2.instance
            r14 = r12
            com.google.assistant.e.c.c.az r14 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r14
            int r12 = r14.f132642b
            r15 = 5
            if (r12 != r15) goto L_0x0399
            java.lang.Object r14 = r14.f132643c
            com.google.assistant.e.j.qd r14 = (com.google.assistant.p3897e.p3921j.C52395qd) r14
            goto L_0x039b
        L_0x0399:
            com.google.assistant.e.j.qd r14 = com.google.assistant.p3897e.p3921j.C52395qd.f137485e
        L_0x039b:
            com.google.assistant.e.j.ql r14 = r14.f137489c
            if (r14 != 0) goto L_0x03a1
            com.google.assistant.e.j.ql r14 = com.google.assistant.p3897e.p3921j.C52403ql.f137512f
        L_0x03a1:
            java.lang.Object r15 = r6.get()
            com.google.assistant.e.j.e.eu r15 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r15
            int r12 = r15.f136277e
            r22 = r0
            r0 = 33
            if (r12 != r0) goto L_0x03b4
            java.lang.Object r0 = r15.f136278f
            com.google.assistant.e.c.c.bd r0 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r0
            goto L_0x03b6
        L_0x03b4:
            com.google.assistant.e.c.c.bd r0 = com.google.assistant.p3897e.p3902c.p3907c.C50959bd.f132657e
        L_0x03b6:
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.assistant.e.c.c.ba r0 = (com.google.assistant.p3897e.p3902c.p3907c.C50956ba) r0
            r12 = 1
        L_0x03bd:
            com.google.protobuf.bv r15 = r0.instance
            com.google.assistant.e.c.c.bd r15 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r15
            com.google.protobuf.cq r15 = r15.f132660b
            int r15 = r15.size()
            if (r12 >= r15) goto L_0x0424
            com.google.assistant.e.c.c.az r15 = r0.mo53491a(r12)
            com.google.protobuf.bn r15 = r15.toBuilder()
            com.google.assistant.e.c.c.as r15 = (com.google.assistant.p3897e.p3902c.p3907c.C50947as) r15
            r26 = r3
            int r3 = r14.f137515b
            r27 = r8
            com.google.protobuf.bv r8 = r15.instance
            com.google.assistant.e.c.c.az r8 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r8
            r28 = r9
            int r9 = r8.f132642b
            r29 = r11
            r11 = 4
            if (r9 != r11) goto L_0x03eb
            java.lang.Object r11 = r8.f132643c
            com.google.assistant.e.j.ql r11 = (com.google.assistant.p3897e.p3921j.C52403ql) r11
            goto L_0x03ed
        L_0x03eb:
            com.google.assistant.e.j.ql r11 = com.google.assistant.p3897e.p3921j.C52403ql.f137512f
        L_0x03ed:
            int r11 = r11.f137515b
            if (r3 != r11) goto L_0x0419
            int r3 = r14.f137516c
            r11 = 4
            if (r9 != r11) goto L_0x03fb
            java.lang.Object r8 = r8.f132643c
            com.google.assistant.e.j.ql r8 = (com.google.assistant.p3897e.p3921j.C52403ql) r8
            goto L_0x03fd
        L_0x03fb:
            com.google.assistant.e.j.ql r8 = com.google.assistant.p3897e.p3921j.C52403ql.f137512f
        L_0x03fd:
            int r8 = r8.f137516c
            if (r3 != r8) goto L_0x0419
            com.google.assistant.e.c.c.aw r3 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.HIGHLIGHT
            r15.copyOnWrite()
            com.google.protobuf.bv r8 = r15.instance
            com.google.assistant.e.c.c.az r8 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r8
            int r3 = r3.f132637f
            r8.f132649i = r3
            int r3 = r8.f132641a
            r3 = r3 | 1024(0x400, float:1.435E-42)
            r8.f132641a = r3
            r0.mo53492b(r12, r15)
            goto L_0x04c7
        L_0x0419:
            int r12 = r12 + 1
            r3 = r26
            r8 = r27
            r9 = r28
            r11 = r29
            goto L_0x03bd
        L_0x0424:
            r26 = r3
            r27 = r8
            r28 = r9
            r29 = r11
            r3 = 0
            com.google.assistant.e.c.c.az r8 = r0.mo53491a(r3)
            com.google.protobuf.bn r3 = r8.toBuilder()
            com.google.assistant.e.c.c.as r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50947as) r3
            com.google.protobuf.bv r8 = r2.instance
            com.google.assistant.e.c.c.az r8 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r8
            java.lang.String r8 = r8.f132645e
            java.lang.String r9 = " • "
            r11 = -1
            java.lang.String[] r8 = r8.split(r9, r11)
            int r9 = r8.length
            r12 = 2
            if (r9 != r12) goto L_0x04c7
            com.google.assistant.e.j.ql r9 = com.google.assistant.p3897e.p3921j.C52403ql.f137512f
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.e.j.qk r9 = (com.google.assistant.p3897e.p3921j.C52402qk) r9
            int r12 = r14.f137515b
            r9.copyOnWrite()
            com.google.protobuf.bv r15 = r9.instance
            com.google.assistant.e.j.ql r15 = (com.google.assistant.p3897e.p3921j.C52403ql) r15
            int r11 = r15.f137514a
            r21 = 1
            r11 = r11 | 1
            r15.f137514a = r11
            r15.f137515b = r12
            int r11 = r14.f137516c
            r9.copyOnWrite()
            com.google.protobuf.bv r12 = r9.instance
            com.google.assistant.e.j.ql r12 = (com.google.assistant.p3897e.p3921j.C52403ql) r12
            int r15 = r12.f137514a
            r18 = 2
            r15 = r15 | 2
            r12.f137514a = r15
            r12.f137516c = r11
            int r11 = r14.f137517d
            r9.copyOnWrite()
            com.google.protobuf.bv r12 = r9.instance
            com.google.assistant.e.j.ql r12 = (com.google.assistant.p3897e.p3921j.C52403ql) r12
            int r14 = r12.f137514a
            r15 = 4
            r14 = r14 | r15
            r12.f137514a = r14
            r12.f137517d = r11
            r3.copyOnWrite()
            com.google.protobuf.bv r11 = r3.instance
            com.google.assistant.e.c.c.az r11 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r11
            com.google.protobuf.bv r9 = r9.build()
            com.google.assistant.e.j.ql r9 = (com.google.assistant.p3897e.p3921j.C52403ql) r9
            r9.getClass()
            r11.f132643c = r9
            r11.f132642b = r15
            r9 = 1
            r8 = r8[r9]
            r3.copyOnWrite()
            com.google.protobuf.bv r9 = r3.instance
            com.google.assistant.e.c.c.az r9 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r9
            r8.getClass()
            int r11 = r9.f132641a
            r12 = 2
            r11 = r11 | r12
            r9.f132641a = r11
            r9.f132645e = r8
            com.google.assistant.e.c.c.aw r8 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.HIGHLIGHT
            r3.copyOnWrite()
            com.google.protobuf.bv r9 = r3.instance
            com.google.assistant.e.c.c.az r9 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r9
            int r8 = r8.f132637f
            r9.f132649i = r8
            int r8 = r9.f132641a
            r8 = r8 | 1024(0x400, float:1.435E-42)
            r9.f132641a = r8
            r8 = 0
            r0.mo53492b(r8, r3)
        L_0x04c7:
            java.lang.Object r3 = r6.get()
            com.google.assistant.e.j.e.eu r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r3
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.assistant.e.j.e.eq r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.assistant.e.j.e.eu r6 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r6
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.c.c.bd r0 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r0
            r0.getClass()
            r6.f136278f = r0
            r0 = 33
            r6.f136277e = r0
            com.google.protobuf.bv r0 = r3.build()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
            com.google.assistant.e.j.e.ff r13 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61489f(r0, r13, r3)
            goto L_0x0502
        L_0x04f8:
            r22 = r0
            r26 = r3
            r27 = r8
            r28 = r9
            r29 = r11
        L_0x0502:
            int r5 = r5 + 1
            r0 = r22
            r3 = r26
            r8 = r27
            r9 = r28
            r11 = r29
            goto L_0x036c
        L_0x0510:
            r27 = r8
            r28 = r9
            r29 = r11
            com.google.assistant.e.c.c.aw r0 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.HIGHLIGHT
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.e.c.c.az r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r3
            int r0 = r0.f132637f
            r3.f132649i = r0
            int r0 = r3.f132641a
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r3.f132641a = r0
            r4.mo53492b(r7, r2)
            r0 = r13
            goto L_0x0563
        L_0x052e:
            r24 = r2
            r25 = r3
            r27 = r8
            r28 = r9
            r29 = r11
            goto L_0x0545
        L_0x0539:
            r24 = r2
            r25 = r3
            r27 = r8
            r28 = r9
            r29 = r11
            r22 = r13
        L_0x0545:
            int r7 = r7 + 1
            r13 = r22
            r2 = r24
            r3 = r25
            r8 = r27
            r9 = r28
            r11 = r29
            r12 = 4
            r14 = 33
            r15 = 1
            goto L_0x019a
        L_0x0559:
            r24 = r2
            r25 = r3
            r27 = r8
            r28 = r9
            r29 = r11
        L_0x0563:
            java.lang.Object r2 = r17.get()
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
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
            com.google.assistant.e.j.e.ff r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61489f(r2, r0, r3)
            goto L_0x059e
        L_0x0594:
            r24 = r2
            r25 = r3
            r27 = r8
            r28 = r9
            r29 = r11
        L_0x059e:
            int r10 = r10 + 1
            r2 = r24
            r3 = r25
            r8 = r27
            r9 = r28
            r11 = r29
            r7 = 16
            r12 = 4
            r13 = 2
            r14 = 33
            r15 = 1
            goto L_0x014d
        L_0x05b3:
            r27 = r8
            r28 = r9
            r29 = r11
            com.google.common.b.gu r2 = f88537c
            r3 = r2
            com.google.common.b.pq r3 = (com.google.common.p4522b.C58724pq) r3
            int r3 = r3.f156474d
            r4 = 0
        L_0x05c1:
            r5 = 6
            if (r4 >= r3) goto L_0x08a3
            java.lang.Object r6 = r2.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            j$.util.Optional r7 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r6, r0)
            boolean r8 = r7.isPresent()
            if (r8 == 0) goto L_0x088d
            java.lang.Object r8 = r7.get()
            com.google.assistant.e.j.e.eu r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r8
            int r8 = r8.f136277e
            r9 = 33
            if (r8 != r9) goto L_0x088d
            java.lang.String r8 = r1.f137800d
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L_0x05ea
            goto L_0x088d
        L_0x05ea:
            java.lang.Object r8 = r7.get()
            com.google.assistant.e.j.e.eu r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r8
            int r10 = r8.f136277e
            if (r10 != r9) goto L_0x05f9
            java.lang.Object r8 = r8.f136278f
            com.google.assistant.e.c.c.bd r8 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r8
            goto L_0x05fb
        L_0x05f9:
            com.google.assistant.e.c.c.bd r8 = com.google.assistant.p3897e.p3902c.p3907c.C50959bd.f132657e
        L_0x05fb:
            com.google.protobuf.bn r8 = r8.toBuilder()
            com.google.assistant.e.c.c.ba r8 = (com.google.assistant.p3897e.p3902c.p3907c.C50956ba) r8
            int r9 = r1.f137798b
            r10 = 16
            if (r9 != r10) goto L_0x060c
            java.lang.Object r9 = r1.f137799c
            com.google.assistant.e.j.te r9 = (com.google.assistant.p3897e.p3921j.C52477te) r9
            goto L_0x060e
        L_0x060c:
            com.google.assistant.e.j.te r9 = com.google.assistant.p3897e.p3921j.C52477te.f137748h
        L_0x060e:
            int r11 = r9.f137751b
            r12 = 4
            if (r11 != r12) goto L_0x0615
        L_0x0613:
            r11 = 1
            goto L_0x061d
        L_0x0615:
            r12 = 5
            if (r11 != r12) goto L_0x0619
            goto L_0x0613
        L_0x0619:
            if (r11 != r5) goto L_0x061c
            goto L_0x0613
        L_0x061c:
            r11 = 0
        L_0x061d:
            r13 = 0
            r14 = 0
            r15 = -1
        L_0x0620:
            com.google.protobuf.bv r10 = r8.instance
            com.google.assistant.e.c.c.bd r10 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r10
            com.google.protobuf.cq r10 = r10.f132660b
            int r10 = r10.size()
            if (r13 >= r10) goto L_0x06da
            com.google.assistant.e.c.c.az r10 = r8.mo53491a(r13)
            com.google.protobuf.bn r10 = r10.toBuilder()
            com.google.assistant.e.c.c.as r10 = (com.google.assistant.p3897e.p3902c.p3907c.C50947as) r10
            int r12 = r9.f137750a
            r17 = 1
            r12 = r12 & 1
            if (r12 == 0) goto L_0x064b
            r22 = r6
            long r5 = r9.f137753d
            r24 = r2
            long r1 = (long) r13
            int r12 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r12 != 0) goto L_0x064f
            r1 = 1
            goto L_0x0650
        L_0x064b:
            r24 = r2
            r22 = r6
        L_0x064f:
            r1 = 0
        L_0x0650:
            com.google.protobuf.bv r2 = r10.instance
            com.google.assistant.e.c.c.az r2 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r2
            int r2 = r2.f132649i
            com.google.assistant.e.c.c.aw r2 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.m85988a(r2)
            if (r2 != 0) goto L_0x065e
            com.google.assistant.e.c.c.aw r2 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
        L_0x065e:
            com.google.assistant.e.c.c.aw r5 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.HIGHLIGHT
            if (r2 == r5) goto L_0x0677
            com.google.protobuf.bv r2 = r10.instance
            com.google.assistant.e.c.c.az r2 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r2
            int r2 = r2.f132649i
            com.google.assistant.e.c.c.aw r2 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.m85988a(r2)
            if (r2 != 0) goto L_0x0670
            com.google.assistant.e.c.c.aw r2 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
        L_0x0670:
            com.google.assistant.e.c.c.aw r5 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.ERROR
            if (r2 != r5) goto L_0x0675
            goto L_0x0677
        L_0x0675:
            r2 = 0
            goto L_0x0678
        L_0x0677:
            r2 = 1
        L_0x0678:
            com.google.protobuf.bv r5 = r10.instance
            com.google.assistant.e.c.c.az r5 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r5
            int r6 = r5.f132650j
            int r6 = com.google.assistant.p3897e.p3902c.p3907c.C50949au.m85987a(r6)
            if (r6 != 0) goto L_0x0685
            r6 = 1
        L_0x0685:
            if (r1 == 0) goto L_0x06a0
            if (r2 == 0) goto L_0x06a0
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
            goto L_0x06de
        L_0x06a0:
            if (r1 == 0) goto L_0x06cc
            r1 = 1
            if (r6 == r1) goto L_0x06a7
        L_0x06a5:
            r14 = 1
            goto L_0x06cf
        L_0x06a7:
            int r1 = r5.f132649i
            com.google.assistant.e.c.c.aw r1 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.m85988a(r1)
            if (r1 != 0) goto L_0x06b1
            com.google.assistant.e.c.c.aw r1 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
        L_0x06b1:
            com.google.assistant.e.c.c.aw r2 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
            if (r1 != r2) goto L_0x06cf
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
            goto L_0x06a5
        L_0x06cc:
            if (r2 == 0) goto L_0x06cf
            r15 = r13
        L_0x06cf:
            int r13 = r13 + 1
            r1 = r31
            r6 = r22
            r2 = r24
            r5 = 6
            goto L_0x0620
        L_0x06da:
            r24 = r2
            r22 = r6
        L_0x06de:
            if (r14 == 0) goto L_0x0708
            if (r15 < 0) goto L_0x0708
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
        L_0x0708:
            if (r11 == 0) goto L_0x0856
            int r1 = r9.f137750a
            r1 = r1 & 64
            if (r1 == 0) goto L_0x0856
            r1 = 0
        L_0x0711:
            com.google.protobuf.bv r2 = r8.instance
            com.google.assistant.e.c.c.bd r2 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r2
            com.google.protobuf.cq r2 = r2.f132660b
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x0856
            com.google.assistant.e.c.c.az r2 = r8.mo53491a(r1)
            com.google.protobuf.bn r2 = r2.toBuilder()
            com.google.assistant.e.c.c.as r2 = (com.google.assistant.p3897e.p3902c.p3907c.C50947as) r2
            com.google.protobuf.bv r5 = r2.instance
            com.google.assistant.e.c.c.az r5 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r5
            java.lang.String r5 = r5.f132652l
            java.lang.String r6 = "custom_date"
            boolean r5 = r5.equals(r6)
            r6 = r22
            if (r5 == 0) goto L_0x0786
            r5 = r29
            boolean r10 = r6.equals(r5)
            if (r10 == 0) goto L_0x0788
            int r10 = r9.f137751b
            r11 = 4
            if (r10 != r11) goto L_0x0788
            java.lang.String r10 = r9.f137756g
            r2.copyOnWrite()
            com.google.protobuf.bv r12 = r2.instance
            com.google.assistant.e.c.c.az r12 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r12
            r10.getClass()
            int r13 = r12.f132641a
            r14 = 2
            r13 = r13 | r14
            r12.f132641a = r13
            r12.f132645e = r10
            int r10 = r9.f137751b
            if (r10 != r11) goto L_0x0761
            java.lang.Object r10 = r9.f137752c
            com.google.assistant.e.j.qb r10 = (com.google.assistant.p3897e.p3921j.C52393qb) r10
            goto L_0x0763
        L_0x0761:
            com.google.assistant.e.j.qb r10 = com.google.assistant.p3897e.p3921j.C52393qb.f137479e
        L_0x0763:
            r2.copyOnWrite()
            com.google.protobuf.bv r11 = r2.instance
            com.google.assistant.e.c.c.az r11 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r11
            r10.getClass()
            r11.f132643c = r10
            r10 = 3
            r11.f132642b = r10
            com.google.assistant.e.c.c.aw r10 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.HIGHLIGHT
            r2.copyOnWrite()
            com.google.protobuf.bv r11 = r2.instance
            com.google.assistant.e.c.c.az r11 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r11
            int r10 = r10.f132637f
            r11.f132649i = r10
            int r10 = r11.f132641a
            r10 = r10 | 1024(0x400, float:1.435E-42)
            r11.f132641a = r10
            goto L_0x0788
        L_0x0786:
            r5 = r29
        L_0x0788:
            com.google.protobuf.bv r10 = r2.instance
            com.google.assistant.e.c.c.az r10 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r10
            java.lang.String r10 = r10.f132652l
            java.lang.String r11 = "custom_time"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x07e5
            r10 = r28
            boolean r11 = r6.equals(r10)
            if (r11 == 0) goto L_0x07e7
            int r11 = r9.f137751b
            r12 = 5
            if (r11 != r12) goto L_0x07e7
            java.lang.String r11 = r9.f137756g
            r2.copyOnWrite()
            com.google.protobuf.bv r13 = r2.instance
            com.google.assistant.e.c.c.az r13 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r13
            r11.getClass()
            int r14 = r13.f132641a
            r15 = 2
            r14 = r14 | r15
            r13.f132641a = r14
            r13.f132645e = r11
            int r11 = r9.f137751b
            if (r11 != r12) goto L_0x07c0
            java.lang.Object r11 = r9.f137752c
            com.google.assistant.e.j.ql r11 = (com.google.assistant.p3897e.p3921j.C52403ql) r11
            goto L_0x07c2
        L_0x07c0:
            com.google.assistant.e.j.ql r11 = com.google.assistant.p3897e.p3921j.C52403ql.f137512f
        L_0x07c2:
            r2.copyOnWrite()
            com.google.protobuf.bv r13 = r2.instance
            com.google.assistant.e.c.c.az r13 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r13
            r11.getClass()
            r13.f132643c = r11
            r11 = 4
            r13.f132642b = r11
            com.google.assistant.e.c.c.aw r11 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.HIGHLIGHT
            r2.copyOnWrite()
            com.google.protobuf.bv r13 = r2.instance
            com.google.assistant.e.c.c.az r13 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r13
            int r11 = r11.f132637f
            r13.f132649i = r11
            int r11 = r13.f132641a
            r11 = r11 | 1024(0x400, float:1.435E-42)
            r13.f132641a = r11
            goto L_0x07e7
        L_0x07e5:
            r10 = r28
        L_0x07e7:
            com.google.protobuf.bv r11 = r2.instance
            com.google.assistant.e.c.c.az r11 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r11
            java.lang.String r11 = r11.f132652l
            java.lang.String r13 = "custom_recurrence"
            boolean r11 = r11.equals(r13)
            if (r11 == 0) goto L_0x0845
            r11 = r27
            boolean r13 = r6.equals(r11)
            if (r13 == 0) goto L_0x0847
            int r13 = r9.f137751b
            r14 = 6
            if (r13 != r14) goto L_0x0847
            java.lang.String r13 = r9.f137756g
            r2.copyOnWrite()
            com.google.protobuf.bv r15 = r2.instance
            com.google.assistant.e.c.c.az r15 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r15
            r13.getClass()
            int r12 = r15.f132641a
            r17 = 2
            r12 = r12 | 2
            r15.f132641a = r12
            r15.f132645e = r13
            int r12 = r9.f137751b
            if (r12 != r14) goto L_0x0821
            java.lang.Object r12 = r9.f137752c
            com.google.assistant.e.j.qf r12 = (com.google.assistant.p3897e.p3921j.C52397qf) r12
            goto L_0x0823
        L_0x0821:
            com.google.assistant.e.j.qf r12 = com.google.assistant.p3897e.p3921j.C52397qf.f137491j
        L_0x0823:
            r2.copyOnWrite()
            com.google.protobuf.bv r13 = r2.instance
            com.google.assistant.e.c.c.az r13 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r13
            r12.getClass()
            r13.f132643c = r12
            r13.f132642b = r14
            com.google.assistant.e.c.c.aw r12 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.HIGHLIGHT
            r2.copyOnWrite()
            com.google.protobuf.bv r13 = r2.instance
            com.google.assistant.e.c.c.az r13 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r13
            int r12 = r12.f132637f
            r13.f132649i = r12
            int r12 = r13.f132641a
            r12 = r12 | 1024(0x400, float:1.435E-42)
            r13.f132641a = r12
            goto L_0x0847
        L_0x0845:
            r11 = r27
        L_0x0847:
            r8.mo53492b(r1, r2)
            int r1 = r1 + 1
            r29 = r5
            r22 = r6
            r28 = r10
            r27 = r11
            goto L_0x0711
        L_0x0856:
            r11 = r27
            r10 = r28
            r5 = r29
            java.lang.Object r1 = r7.get()
            com.google.assistant.e.j.e.eu r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r1
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.assistant.e.j.e.eq r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            com.google.protobuf.bv r6 = r8.build()
            com.google.assistant.e.c.c.bd r6 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r6
            r6.getClass()
            r2.f136278f = r6
            r6 = 33
            r2.f136277e = r6
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.j.e.eu r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r1
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
            com.google.assistant.e.j.e.ff r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61489f(r1, r0, r2)
            goto L_0x0895
        L_0x088d:
            r24 = r2
            r11 = r27
            r10 = r28
            r5 = r29
        L_0x0895:
            int r4 = r4 + 1
            r1 = r31
            r29 = r5
            r28 = r10
            r27 = r11
            r2 = r24
            goto L_0x05c1
        L_0x08a3:
            r11 = r27
            r5 = r29
            j$.util.Optional r1 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r5, r0)
            j$.util.Optional r1 = m61356u(r1)
            boolean r2 = r1.isPresent()
            if (r2 == 0) goto L_0x0a3c
            java.lang.Object r2 = r1.get()
            com.google.assistant.e.c.c.az r2 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r2
            int r2 = r2.f132642b
            r3 = 3
            if (r2 != r3) goto L_0x0a3c
            java.lang.Object r1 = r1.get()
            com.google.assistant.e.c.c.az r1 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r1
            int r2 = r1.f132642b
            if (r2 != r3) goto L_0x08cf
            java.lang.Object r1 = r1.f132643c
            com.google.assistant.e.j.qb r1 = (com.google.assistant.p3897e.p3921j.C52393qb) r1
            goto L_0x08d1
        L_0x08cf:
            com.google.assistant.e.j.qb r1 = com.google.assistant.p3897e.p3921j.C52393qb.f137479e
        L_0x08d1:
            j$.util.Optional r2 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r11, r0)
            boolean r3 = r2.isPresent()
            if (r3 == 0) goto L_0x0a3c
            java.lang.Object r3 = r2.get()
            com.google.assistant.e.j.e.eu r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r3
            int r3 = r3.f136277e
            r4 = 33
            if (r3 != r4) goto L_0x0a3c
            java.lang.Object r3 = r2.get()
            com.google.assistant.e.j.e.eu r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r3
            int r5 = r3.f136277e
            if (r5 != r4) goto L_0x08f6
            java.lang.Object r3 = r3.f136278f
            com.google.assistant.e.c.c.bd r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r3
            goto L_0x08f8
        L_0x08f6:
            com.google.assistant.e.c.c.bd r3 = com.google.assistant.p3897e.p3902c.p3907c.C50959bd.f132657e
        L_0x08f8:
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.assistant.e.c.c.ba r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50956ba) r3
            int r4 = r1.f137482b
            int r5 = r1.f137483c
            int r1 = r1.f137484d
            j$.time.LocalDate r1 = p3186j$.time.LocalDate.m71157of(r4, r5, r1)
            r4 = 0
        L_0x0909:
            com.google.protobuf.bv r5 = r3.instance
            com.google.assistant.e.c.c.bd r5 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r5
            com.google.protobuf.cq r5 = r5.f132660b
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0a0c
            com.google.assistant.e.c.c.az r5 = r3.mo53491a(r4)
            com.google.assistant.e.j.qf r6 = com.google.assistant.p3897e.p3921j.C52397qf.f137491j
            java.lang.String r7 = r5.f132652l
            java.lang.String r8 = "recurrence_daily"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0967
            com.google.assistant.e.j.qf r6 = com.google.assistant.p3897e.p3921j.C52397qf.f137491j
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.e.j.qe r6 = (com.google.assistant.p3897e.p3921j.C52396qe) r6
            r7 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r15 = 1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r15)
            r18 = 2
            java.lang.Integer r10 = java.lang.Integer.valueOf(r18)
            r16 = 3
            java.lang.Integer r11 = java.lang.Integer.valueOf(r16)
            r19 = 4
            java.lang.Integer r12 = java.lang.Integer.valueOf(r19)
            r20 = 5
            java.lang.Integer r13 = java.lang.Integer.valueOf(r20)
            java.lang.Integer[] r14 = new java.lang.Integer[r15]
            r17 = 6
            java.lang.Integer r21 = java.lang.Integer.valueOf(r17)
            r14[r7] = r21
            com.google.common.b.ij r8 = com.google.common.p4522b.C58528ij.m90015O(r8, r9, r10, r11, r12, r13, r14)
            r6.mo53850a(r8)
            com.google.protobuf.bv r6 = r6.build()
            com.google.assistant.e.j.qf r6 = (com.google.assistant.p3897e.p3921j.C52397qf) r6
            goto L_0x0971
        L_0x0967:
            r7 = 0
            r15 = 1
            r16 = 3
            r18 = 2
            r19 = 4
            r20 = 5
        L_0x0971:
            java.lang.String r8 = r5.f132652l
            java.lang.String r9 = "recurrence_weekly"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x09a1
            com.google.assistant.e.j.qf r6 = com.google.assistant.p3897e.p3921j.C52397qf.f137491j
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.e.j.qe r6 = (com.google.assistant.p3897e.p3921j.C52396qe) r6
            j$.time.DayOfWeek r8 = r1.getDayOfWeek()
            int r8 = r8.getValue()
            r9 = 7
            if (r8 != r9) goto L_0x0990
            r8 = 0
            goto L_0x0998
        L_0x0990:
            j$.time.DayOfWeek r8 = r1.getDayOfWeek()
            int r8 = r8.getValue()
        L_0x0998:
            r6.mo53852c(r8)
            com.google.protobuf.bv r6 = r6.build()
            com.google.assistant.e.j.qf r6 = (com.google.assistant.p3897e.p3921j.C52397qf) r6
        L_0x09a1:
            java.lang.String r8 = r5.f132652l
            java.lang.String r9 = "recurrence_monthly"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x09c0
            com.google.assistant.e.j.qf r6 = com.google.assistant.p3897e.p3921j.C52397qf.f137491j
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.e.j.qe r6 = (com.google.assistant.p3897e.p3921j.C52396qe) r6
            int r8 = r1.getDayOfMonth()
            r6.mo53851b(r8)
            com.google.protobuf.bv r6 = r6.build()
            com.google.assistant.e.j.qf r6 = (com.google.assistant.p3897e.p3921j.C52397qf) r6
        L_0x09c0:
            java.lang.String r8 = r5.f132652l
            java.lang.String r9 = "recurrence_yearly"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x09e6
            com.google.assistant.e.j.qf r6 = com.google.assistant.p3897e.p3921j.C52397qf.f137491j
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.e.j.qe r6 = (com.google.assistant.p3897e.p3921j.C52396qe) r6
            int r8 = r1.getDayOfMonth()
            r6.mo53851b(r8)
            int r8 = r1.getMonthValue()
            r6.mo53853d(r8)
            com.google.protobuf.bv r6 = r6.build()
            com.google.assistant.e.j.qf r6 = (com.google.assistant.p3897e.p3921j.C52397qf) r6
        L_0x09e6:
            com.google.assistant.e.j.qf r8 = com.google.assistant.p3897e.p3921j.C52397qf.f137491j
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L_0x0a07
            com.google.protobuf.bn r5 = r5.toBuilder()
            com.google.assistant.e.c.c.as r5 = (com.google.assistant.p3897e.p3902c.p3907c.C50947as) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.assistant.e.c.c.az r8 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r8
            r6.getClass()
            r8.f132643c = r6
            r6 = 6
            r8.f132642b = r6
            r3.mo53492b(r4, r5)
            goto L_0x0a08
        L_0x0a07:
            r6 = 6
        L_0x0a08:
            int r4 = r4 + 1
            goto L_0x0909
        L_0x0a0c:
            java.lang.Object r1 = r2.get()
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
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
            com.google.assistant.e.j.e.ff r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61489f(r1, r0, r2)
        L_0x0a3c:
            return r0
        L_0x0a3d:
            com.google.common.b.gu r1 = f88537c
            com.google.assistant.e.j.e.ff r0 = m61336a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33070ao.m61341f(com.google.assistant.e.j.e.ff, com.google.assistant.e.j.tr, com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.r):com.google.assistant.e.j.e.ff");
    }

    /* renamed from: g */
    public static C51953ff m61342g(String str, boolean z, C51953ff ffVar) {
        C50959bd bdVar;
        Optional g = C33136x.m61490g(str, ffVar);
        if (!g.isPresent()) {
            return ffVar;
        }
        C51937eq eqVar = (C51937eq) ((C51941eu) g.get()).toBuilder();
        eqVar.copyOnWrite();
        C51941eu euVar = (C51941eu) eqVar.instance;
        euVar.f136273a |= 64;
        euVar.f136282j = !z;
        C51941eu euVar2 = (C51941eu) g.get();
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
        if (((C51941eu) g.get()).f136277e == 33) {
            eqVar.copyOnWrite();
            C51941eu euVar3 = (C51941eu) eqVar.instance;
            C50959bd bdVar3 = (C50959bd) baVar.build();
            bdVar3.getClass();
            euVar3.f136278f = bdVar3;
            euVar3.f136277e = 33;
        }
        return C33136x.m61489f((C51941eu) eqVar.build(), ffVar, Optional.empty());
    }

    /* renamed from: h */
    public static Optional m61343h(Optional optional) {
        C50959bd bdVar;
        if (!optional.isPresent()) {
            return Optional.empty();
        }
        C51941eu euVar = (C51941eu) optional.get();
        if (euVar.f136277e == 33) {
            bdVar = (C50959bd) euVar.f136278f;
        } else {
            bdVar = C50959bd.f132657e;
        }
        return Collection.EL.stream(bdVar.f132660b).filter(C33068am.f88533a).findFirst();
    }

    /* renamed from: i */
    public static Optional m61344i(Optional optional) {
        C50959bd bdVar;
        if (!optional.isPresent()) {
            return Optional.empty();
        }
        C51941eu euVar = (C51941eu) optional.get();
        if (euVar.f136277e == 33) {
            bdVar = (C50959bd) euVar.f136278f;
        } else {
            bdVar = C50959bd.f132657e;
        }
        return Collection.EL.stream(bdVar.f132660b).filter(C33066ak.f88531a).findFirst();
    }

    /* renamed from: j */
    public static Optional m61345j(String str, C50959bd bdVar) {
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

    /* renamed from: k */
    public static void m61346k(C51953ff ffVar, C19045c cVar) {
        C68013c cVar2 = (C68013c) cVar.mo24271c().toBuilder();
        C61752n nVar = ((C68014d) cVar2.instance).f184280c;
        if (nVar == null) {
            nVar = C61752n.f166808f;
        }
        C61751m mVar = (C61751m) nVar.toBuilder();
        List<C63642z> e = cVar.mo24273e();
        Optional g = C33136x.m61490g("datetime.date", ffVar);
        Optional g2 = C33136x.m61490g("datetime.time", ffVar);
        Optional g3 = C33136x.m61490g("recurrence", ffVar);
        boolean z = !m61356u(g).isPresent() && !m61356u(g2).isPresent() && !(m61350o(ffVar) && m61356u(C33136x.m61490g("main_chips", ffVar)).isPresent());
        boolean z2 = !m61356u(g3).isPresent();
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
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m61347l(com.google.android.libraries.assistant.portable.p1584a.p1585a.C19045c r10, java.lang.String r11, boolean r12, boolean r13, boolean r14, boolean r15) {
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
            com.google.common.f.e r4 = f88536b
            com.google.common.f.x r4 = r4.mo56225c()
            java.lang.String r5 = "Only one ArgumentUpdate is expected for each intentUpdate."
            r6 = 50898(0xc6d2, float:7.1323E-41)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33070ao.m61347l(com.google.android.libraries.assistant.portable.a.a.c, java.lang.String, boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: m */
    public static void m61348m(C68015e eVar, C33102x xVar, boolean z) {
        C33104z zVar = (C33104z) xVar;
        if (zVar.f88621a.isPresent()) {
            eVar.mo60077b("title", C19046d.m36501g(2));
        }
        if (zVar.f88622b.isPresent()) {
            eVar.mo60077b("datetime", C19046d.m36501g(2));
        }
        if (zVar.f88623c.isPresent()) {
            eVar.mo60077b("location", C19046d.m36501g(2));
        }
        if (z) {
            if (!xVar.mo38528f()) {
                eVar.mo60077b("title", C19046d.m36501g(3));
            } else if (!xVar.mo38525c()) {
                eVar.mo60077b("location", C19046d.m36501g(3));
            }
            eVar.mo60077b("datetime", C19046d.m36501g(2));
            return;
        }
        if (!xVar.mo38528f() && xVar.mo38524b() == xVar.mo38526d()) {
            eVar.mo60077b("title", C19046d.m36501g(3));
        } else if ((xVar.mo38524b() ^ xVar.mo38526d()) || (xVar.mo38528f() && !xVar.mo38524b())) {
            eVar.mo60077b("datetime", C19046d.m36501g(3));
        }
        eVar.mo60077b("location", C19046d.m36501g(2));
    }

    /* renamed from: n */
    public static boolean m61349n(String str, C51953ff ffVar, C52490tr trVar) {
        C50936ah ahVar;
        if (trVar.f137798b == 9 && ((C52475tc) trVar.f137799c).f137747b && trVar.f137800d.equals(str)) {
            Optional g = C33136x.m61490g(trVar.f137800d, ffVar);
            if (g.isPresent() && ((C51941eu) g.get()).f136277e == 17) {
                C51941eu euVar = (C51941eu) g.get();
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

    /* renamed from: o */
    public static boolean m61350o(C51953ff ffVar) {
        return m61343h(C33136x.m61490g("main_chips", ffVar)).isPresent();
    }

    /* renamed from: p */
    public static boolean m61351p(C51953ff ffVar) {
        if (C33136x.m61491h(ffVar)) {
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
        Optional findFirst = Collection.EL.stream(C33073ar.m61358a(ffVar).f132660b).filter(new C33071ap()).map(C33072aq.f88539a).findFirst();
        if (!findFirst.isPresent() || findFirst.get() == C50951aw.HIDDEN) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public static boolean m61352q(C51953ff ffVar, C19045c cVar) {
        return ffVar.f136321e.equals("UpdateReminder") && !Collection.EL.stream(cVar.mo24273e()).flatMap(C33063ah.f88528a).map(C33064ai.f88529a).anyMatch(C33065aj.f88530a) && !m61351p(ffVar);
    }

    /* renamed from: r */
    public static boolean m61353r(C33102x xVar, boolean z) {
        return xVar.mo38528f() && m61354s(xVar, z);
    }

    /* renamed from: s */
    public static boolean m61354s(C33102x xVar, boolean z) {
        return (!z && xVar.mo38524b() && xVar.mo38526d()) || (z && xVar.mo38525c());
    }

    /* renamed from: t */
    public static Optional m61355t(C50959bd bdVar) {
        for (int i = 0; i < bdVar.f132660b.size(); i++) {
            if (((C50954az) bdVar.f132660b.get(i)).f132652l.equals("default_time")) {
                return Optional.m71637of(Integer.valueOf(i));
            }
        }
        return Optional.empty();
    }

    /* renamed from: u */
    private static Optional m61356u(Optional optional) {
        C50959bd bdVar;
        if (!optional.isPresent()) {
            return Optional.empty();
        }
        C51941eu euVar = (C51941eu) optional.get();
        if (euVar.f136277e == 33) {
            bdVar = (C50959bd) euVar.f136278f;
        } else {
            bdVar = C50959bd.f132657e;
        }
        return Collection.EL.stream(bdVar.f132660b).filter(C33067al.f88532a).findFirst();
    }
}
