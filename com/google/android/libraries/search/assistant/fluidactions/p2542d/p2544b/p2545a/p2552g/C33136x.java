package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g;

import com.google.assistant.p3897e.p3902c.p3907c.C50929aa;
import com.google.assistant.p3897e.p3902c.p3907c.C50936ah;
import com.google.assistant.p3897e.p3902c.p3907c.C51011db;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51015df;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3902c.p3907c.C51021dl;
import com.google.assistant.p3897e.p3902c.p3907c.C51024do;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;
import com.google.assistant.p3897e.p3902c.p3907c.C51030du;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52512um;
import com.google.assistant.p3897e.p3921j.C52513un;
import com.google.assistant.p3897e.p3921j.p3926e.C51934en;
import com.google.assistant.p3897e.p3921j.p3926e.C51937eq;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51942ev;
import com.google.assistant.p3897e.p3921j.p3926e.C51943ew;
import com.google.assistant.p3897e.p3921j.p3926e.C51944ex;
import com.google.assistant.p3897e.p3921j.p3926e.C51948fa;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.protobuf.C62971cq;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.g.x */
/* compiled from: PG */
public final class C33136x {
    /* renamed from: a */
    public static C50936ah m61484a(C50936ah ahVar, String str) {
        C50929aa aaVar = (C50929aa) ahVar.toBuilder();
        C51011db dbVar = (C51011db) C51012dc.f132813k.createBuilder();
        dbVar.copyOnWrite();
        C51012dc dcVar = (C51012dc) dbVar.instance;
        str.getClass();
        dcVar.f132815a |= 32;
        dcVar.f132821g = str;
        aaVar.copyOnWrite();
        C50936ah ahVar2 = (C50936ah) aaVar.instance;
        C51012dc dcVar2 = (C51012dc) dbVar.build();
        dcVar2.getClass();
        ahVar2.f132601g = dcVar2;
        ahVar2.f132595a |= 32;
        return (C50936ah) aaVar.build();
    }

    /* renamed from: b */
    public static C51941eu m61485b(C51941eu euVar) {
        C51030du duVar;
        C51030du duVar2;
        if (euVar.f136277e == 6) {
            duVar = (C51030du) euVar.f136278f;
        } else {
            duVar = C51030du.f132868g;
        }
        C51021dl dlVar = (C51021dl) duVar.toBuilder();
        dlVar.copyOnWrite();
        C51030du duVar3 = (C51030du) dlVar.instance;
        duVar3.f132874e = null;
        duVar3.f132870a &= -17;
        dlVar.copyOnWrite();
        ((C51030du) dlVar.instance).f132875f = C51030du.emptyProtobufList();
        if (euVar.f136277e == 6) {
            duVar2 = (C51030du) euVar.f136278f;
        } else {
            duVar2 = C51030du.f132868g;
        }
        for (C51027dr builder : duVar2.f132875f) {
            C51024do doVar = (C51024do) builder.toBuilder();
            doVar.copyOnWrite();
            C51027dr drVar = (C51027dr) doVar.instance;
            drVar.f132854a |= 1;
            drVar.f132859f = false;
            dlVar.mo53503d(doVar);
        }
        C51937eq eqVar = (C51937eq) euVar.toBuilder();
        eqVar.copyOnWrite();
        C51941eu euVar2 = (C51941eu) eqVar.instance;
        C51030du duVar4 = (C51030du) dlVar.build();
        duVar4.getClass();
        euVar2.f136278f = duVar4;
        euVar2.f136277e = 6;
        return (C51941eu) eqVar.build();
    }

    /* renamed from: c */
    public static C51941eu m61486c(C51941eu euVar, C51805du duVar) {
        C50936ah ahVar;
        if (euVar.f136277e != 17) {
            return euVar;
        }
        C51937eq eqVar = (C51937eq) euVar.toBuilder();
        if (euVar.f136277e == 17) {
            ahVar = (C50936ah) euVar.f136278f;
        } else {
            ahVar = C50936ah.f132593m;
        }
        C50929aa aaVar = (C50929aa) ahVar.toBuilder();
        C51015df dfVar = (C51015df) C51016dg.f132827g.createBuilder();
        dfVar.copyOnWrite();
        C51016dg dgVar = (C51016dg) dfVar.instance;
        duVar.getClass();
        dgVar.f132833e = duVar;
        dgVar.f132829a |= 8;
        aaVar.copyOnWrite();
        C50936ah ahVar2 = (C50936ah) aaVar.instance;
        C51016dg dgVar2 = (C51016dg) dfVar.build();
        dgVar2.getClass();
        ahVar2.f132599e = dgVar2;
        ahVar2.f132598d = 3;
        aaVar.copyOnWrite();
        C50936ah ahVar3 = (C50936ah) aaVar.instance;
        ahVar3.f132595a |= 4;
        ahVar3.f132600f = true;
        eqVar.copyOnWrite();
        C51941eu euVar2 = (C51941eu) eqVar.instance;
        C50936ah ahVar4 = (C50936ah) aaVar.build();
        ahVar4.getClass();
        euVar2.f136278f = ahVar4;
        euVar2.f136277e = 17;
        return (C51941eu) eqVar.build();
    }

    /* renamed from: d */
    public static C51953ff m61487d(C52513un unVar, C51953ff ffVar) {
        HashMap hashMap = new HashMap();
        for (C52512um umVar : unVar.f137852a) {
            hashMap.put(umVar.f137848b, Boolean.valueOf(umVar.f137849c));
        }
        C51934en enVar = (C51934en) ffVar.toBuilder();
        C62971cq cqVar = ffVar.f136319c;
        for (int i = 0; i < cqVar.size(); i++) {
            C51944ex exVar = (C51944ex) ((C51948fa) cqVar.get(i)).toBuilder();
            if (hashMap.containsKey(((C51948fa) exVar.instance).f136297b)) {
                Boolean bool = (Boolean) hashMap.get(((C51948fa) exVar.instance).f136297b);
                bool.getClass();
                boolean booleanValue = bool.booleanValue();
                exVar.copyOnWrite();
                C51948fa faVar = (C51948fa) exVar.instance;
                faVar.f136296a |= 4;
                faVar.f136298c = booleanValue;
                enVar.mo53756c(i, exVar);
            }
            List unmodifiableList = Collections.unmodifiableList(((C51948fa) exVar.instance).f136299d);
            for (int i2 = 0; i2 < unmodifiableList.size(); i2++) {
                C51942ev evVar = (C51942ev) ((C51943ew) unmodifiableList.get(i2)).toBuilder();
                if (hashMap.containsKey(((C51943ew) evVar.instance).f136289c)) {
                    Boolean bool2 = (Boolean) hashMap.get(((C51943ew) evVar.instance).f136289c);
                    bool2.getClass();
                    boolean booleanValue2 = bool2.booleanValue();
                    evVar.copyOnWrite();
                    C51943ew ewVar = (C51943ew) evVar.instance;
                    ewVar.f136287a |= 2;
                    ewVar.f136290d = booleanValue2;
                    exVar.mo53764c(i2, evVar);
                    enVar.mo53756c(i, exVar);
                }
                List unmodifiableList2 = Collections.unmodifiableList(((C51943ew) evVar.instance).f136288b);
                for (int i3 = 0; i3 < unmodifiableList2.size(); i3++) {
                    C51941eu euVar = (C51941eu) unmodifiableList2.get(i3);
                    if (hashMap.containsKey(euVar.f136279g)) {
                        C51937eq eqVar = (C51937eq) euVar.toBuilder();
                        Boolean bool3 = (Boolean) hashMap.get(euVar.f136279g);
                        bool3.getClass();
                        boolean booleanValue3 = bool3.booleanValue();
                        eqVar.copyOnWrite();
                        C51941eu euVar2 = (C51941eu) eqVar.instance;
                        euVar2.f136273a |= 32;
                        euVar2.f136281i = booleanValue3;
                        evVar.mo53760c(i3, eqVar);
                        exVar.mo53764c(i2, evVar);
                        enVar.mo53756c(i, exVar);
                    }
                }
            }
        }
        return (C51953ff) enVar.build();
    }

    /* renamed from: e */
    public static C51953ff m61488e(String str, boolean z, C51953ff ffVar) {
        Optional g = m61490g(str, ffVar);
        if (!g.isPresent()) {
            return ffVar;
        }
        C51937eq eqVar = (C51937eq) ((C51941eu) g.get()).toBuilder();
        eqVar.copyOnWrite();
        C51941eu euVar = (C51941eu) eqVar.instance;
        euVar.f136273a |= 32;
        euVar.f136281i = !z;
        return m61489f((C51941eu) eqVar.build(), ffVar, Optional.empty());
    }

    /* JADX WARNING: type inference failed for: r5v7, types: [com.google.protobuf.bn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.assistant.p3897e.p3921j.p3926e.C51953ff m61489f(com.google.assistant.p3897e.p3921j.p3926e.C51941eu r9, com.google.assistant.p3897e.p3921j.p3926e.C51953ff r10, p3186j$.util.Optional r11) {
        /*
            com.google.protobuf.bn r0 = r10.toBuilder()
            com.google.assistant.e.j.e.en r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51934en) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.assistant.e.j.e.ff r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51953ff) r1
            com.google.protobuf.cq r2 = com.google.assistant.p3897e.p3921j.p3926e.C51953ff.emptyProtobufList()
            r1.f136319c = r2
            com.google.protobuf.cq r10 = r10.f136319c
            java.util.Iterator r10 = r10.iterator()
        L_0x0019:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x00be
            java.lang.Object r1 = r10.next()
            com.google.assistant.e.j.e.fa r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51948fa) r1
            com.google.protobuf.bn r2 = r1.toBuilder()
            com.google.assistant.e.j.e.ex r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51944ex) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.e.j.e.fa r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51948fa) r3
            com.google.protobuf.cq r4 = com.google.assistant.p3897e.p3921j.p3926e.C51948fa.emptyProtobufList()
            r3.f136299d = r4
            com.google.protobuf.cq r1 = r1.f136299d
            java.util.Iterator r1 = r1.iterator()
        L_0x003e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00b9
            java.lang.Object r3 = r1.next()
            com.google.assistant.e.j.e.ew r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51943ew) r3
            com.google.protobuf.bn r4 = r3.toBuilder()
            com.google.assistant.e.j.e.ev r4 = (com.google.assistant.p3897e.p3921j.p3926e.C51942ev) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.assistant.e.j.e.ew r5 = (com.google.assistant.p3897e.p3921j.p3926e.C51943ew) r5
            com.google.protobuf.cq r6 = com.google.assistant.p3897e.p3921j.p3926e.C51943ew.emptyProtobufList()
            r5.f136288b = r6
            com.google.protobuf.cq r3 = r3.f136288b
            java.util.Iterator r3 = r3.iterator()
        L_0x0063:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00b5
            java.lang.Object r5 = r3.next()
            com.google.assistant.e.j.e.eu r5 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r5
            com.google.protobuf.bn r6 = r5.toBuilder()
            com.google.assistant.e.j.e.eq r6 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r6
            int r7 = r5.f136273a
            r7 = r7 & 8
            if (r7 == 0) goto L_0x00b1
            int r7 = r9.f136273a
            r7 = r7 & 8
            if (r7 == 0) goto L_0x00b1
            java.lang.String r5 = r5.f136279g
            java.lang.String r7 = r9.f136279g
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x00b1
            com.google.protobuf.bn r5 = r9.toBuilder()
            r6 = r5
            com.google.assistant.e.j.e.eq r6 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r6
            boolean r5 = r11.isPresent()
            if (r5 == 0) goto L_0x00b1
            java.lang.Object r5 = r11.get()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            com.google.assistant.e.j.e.ew r7 = (com.google.assistant.p3897e.p3921j.p3926e.C51943ew) r7
            int r8 = r7.f136287a
            r8 = r8 | 4
            r7.f136287a = r8
            r7.f136291e = r5
        L_0x00b1:
            r4.mo53758a(r6)
            goto L_0x0063
        L_0x00b5:
            r2.mo53762a(r4)
            goto L_0x003e
        L_0x00b9:
            r0.mo53754a(r2)
            goto L_0x0019
        L_0x00be:
            com.google.protobuf.bv r9 = r0.build()
            com.google.assistant.e.j.e.ff r9 = (com.google.assistant.p3897e.p3921j.p3926e.C51953ff) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61489f(com.google.assistant.e.j.e.eu, com.google.assistant.e.j.e.ff, j$.util.Optional):com.google.assistant.e.j.e.ff");
    }

    /* renamed from: g */
    public static Optional m61490g(String str, C51953ff ffVar) {
        for (C51948fa faVar : ffVar.f136319c) {
            Iterator it = faVar.f136299d.iterator();
            while (true) {
                if (it.hasNext()) {
                    Iterator it2 = ((C51943ew) it.next()).f136288b.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            C51941eu euVar = (C51941eu) it2.next();
                            if (!euVar.f136279g.isEmpty() && str.equals(euVar.f136279g)) {
                                return Optional.m71637of(euVar);
                            }
                        }
                    }
                }
            }
        }
        return Optional.empty();
    }

    /* renamed from: h */
    public static boolean m61491h(C51953ff ffVar) {
        for (C51948fa faVar : ffVar.f136319c) {
            if (!faVar.f136298c) {
                for (C51943ew ewVar : faVar.f136299d) {
                    if (!ewVar.f136290d) {
                        for (C51941eu euVar : ewVar.f136288b) {
                            if (euVar.f136280h.equals("location") && !euVar.f136281i) {
                                return true;
                            }
                        }
                        continue;
                    }
                }
                continue;
            }
        }
        return false;
    }
}
