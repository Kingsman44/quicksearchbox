package com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1248b.p1250b;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16143co;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16335ai;
import com.google.assistant.p3803ag.p3809c.C48949aw;
import com.google.assistant.p3803ag.p3809c.C48951ay;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.assistant.p3803ag.p3809c.C48960bg;
import com.google.assistant.p3803ag.p3809c.C48971br;
import com.google.assistant.p3897e.p3902c.p3907c.C51011db;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3994s.p3995a.C53307ja;
import com.google.assistant.p3994s.p3995a.C53308jb;
import com.google.assistant.p3994s.p3995a.C53433ns;
import com.google.assistant.p3994s.p3995a.C53435nu;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protos.p4816ai.p4818b.C63204j;
import java.util.Set;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.h.b.b.b */
/* compiled from: PG */
public final class C16246b {
    /* renamed from: a */
    public static C51012dc m33287a(C16335ai aiVar) {
        C51011db dbVar = (C51011db) C51012dc.f132813k.createBuilder();
        String str = aiVar.f48095d;
        dbVar.copyOnWrite();
        C51012dc dcVar = (C51012dc) dbVar.instance;
        str.getClass();
        dcVar.f132815a |= 2;
        dcVar.f132817c = str;
        return (C51012dc) dbVar.build();
    }

    /* renamed from: b */
    public static C53308jb m33288b(C16335ai aiVar) {
        C53307ja jaVar = (C53307ja) C53308jb.f139794f.createBuilder();
        C63204j jVar = aiVar.f48093b;
        if (jVar == null) {
            jVar = C63204j.f170749e;
        }
        jaVar.copyOnWrite();
        C53308jb jbVar = (C53308jb) jaVar.instance;
        jVar.getClass();
        jbVar.f139797b = jVar;
        jbVar.f139796a |= 1;
        boolean z = aiVar.f48096e;
        jaVar.copyOnWrite();
        C53308jb jbVar2 = (C53308jb) jaVar.instance;
        jbVar2.f139796a |= 2;
        jbVar2.f139798c = z;
        int i = aiVar.f48094c;
        jaVar.copyOnWrite();
        C53308jb jbVar3 = (C53308jb) jaVar.instance;
        jbVar3.f139796a |= 4;
        jbVar3.f139799d = i;
        return (C53308jb) jaVar.build();
    }

    /* renamed from: c */
    public static C53435nu m33289c(C16143co coVar) {
        C53433ns nsVar = (C53433ns) C53435nu.f140233n.createBuilder();
        String h = coVar.mo22804h();
        nsVar.copyOnWrite();
        C53435nu nuVar = (C53435nu) nsVar.instance;
        h.getClass();
        nuVar.f140236a |= 1;
        nuVar.f140239d = h;
        String g = coVar.mo22803g();
        nsVar.copyOnWrite();
        C53435nu nuVar2 = (C53435nu) nsVar.instance;
        g.getClass();
        nuVar2.f140236a |= 2;
        nuVar2.f140240e = g;
        String g2 = C58837ba.m90858g(coVar.mo22801e());
        nsVar.copyOnWrite();
        C53435nu nuVar3 = (C53435nu) nsVar.instance;
        nuVar3.f140236a |= 8;
        nuVar3.f140242g = g2;
        C51012dc a = m33287a(coVar.mo22799c());
        nsVar.copyOnWrite();
        C53435nu nuVar4 = (C53435nu) nsVar.instance;
        a.getClass();
        nuVar4.f140244i = a;
        nuVar4.f140236a |= 32;
        C51012dc dcVar = coVar.mo22799c().f48098g;
        if (dcVar == null) {
            dcVar = C51012dc.f132813k;
        }
        nsVar.copyOnWrite();
        C53435nu nuVar5 = (C53435nu) nsVar.instance;
        dcVar.getClass();
        nuVar5.f140245j = dcVar;
        nuVar5.f140236a |= 64;
        C53308jb b = m33288b(coVar.mo22799c());
        nsVar.copyOnWrite();
        C53435nu nuVar6 = (C53435nu) nsVar.instance;
        b.getClass();
        nuVar6.f140246k = b;
        nuVar6.f140236a |= 512;
        m33291e(nsVar, coVar.mo22798b());
        return (C53435nu) nsVar.build();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m33291e(com.google.assistant.p3994s.p3995a.C53433ns r6, com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16330ad r7) {
        /*
            int r0 = r7.f48067a
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = r7.f48070d
            r6.copyOnWrite()
            com.google.protobuf.bv r1 = r6.instance
            com.google.assistant.s.a.nu r1 = (com.google.assistant.p3994s.p3995a.C53435nu) r1
            com.google.assistant.s.a.nu r2 = com.google.assistant.p3994s.p3995a.C53435nu.f140233n
            r0.getClass()
            int r2 = r1.f140236a
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r1.f140236a = r2
            r1.f140248m = r0
        L_0x001c:
            int r0 = r7.f48068b
            int r1 = com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16329ac.m33333a(r0)
            int r2 = r1 + -1
            if (r1 == 0) goto L_0x00be
            r1 = 1
            r3 = 4
            if (r2 == 0) goto L_0x00a0
            java.lang.String r4 = ""
            r5 = 2
            if (r2 == r1) goto L_0x0087
            r1 = 3
            if (r2 == r5) goto L_0x006c
            r5 = 7
            if (r2 == r1) goto L_0x0054
            if (r2 == r3) goto L_0x0038
            return
        L_0x0038:
            if (r0 != r5) goto L_0x003f
            java.lang.Object r7 = r7.f48069c
            com.google.assistant.e.j.wg r7 = (com.google.assistant.p3897e.p3921j.C52560wg) r7
            goto L_0x0041
        L_0x003f:
            com.google.assistant.e.j.wg r7 = com.google.assistant.p3897e.p3921j.C52560wg.f137943j
        L_0x0041:
            r6.copyOnWrite()
            com.google.protobuf.bv r6 = r6.instance
            com.google.assistant.s.a.nu r6 = (com.google.assistant.p3994s.p3995a.C53435nu) r6
            com.google.assistant.s.a.nu r0 = com.google.assistant.p3994s.p3995a.C53435nu.f140233n
            r7.getClass()
            r6.f140238c = r7
            r7 = 11
            r6.f140237b = r7
            return
        L_0x0054:
            if (r0 != r3) goto L_0x005b
            java.lang.Object r7 = r7.f48069c
            r4 = r7
            java.lang.String r4 = (java.lang.String) r4
        L_0x005b:
            r6.copyOnWrite()
            com.google.protobuf.bv r6 = r6.instance
            com.google.assistant.s.a.nu r6 = (com.google.assistant.p3994s.p3995a.C53435nu) r6
            com.google.assistant.s.a.nu r7 = com.google.assistant.p3994s.p3995a.C53435nu.f140233n
            r4.getClass()
            r6.f140237b = r5
            r6.f140238c = r4
            return
        L_0x006c:
            if (r0 != r1) goto L_0x0073
            java.lang.Object r7 = r7.f48069c
            com.google.assistant.e.j.du r7 = (com.google.assistant.p3897e.p3921j.C51805du) r7
            goto L_0x0075
        L_0x0073:
            com.google.assistant.e.j.du r7 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
        L_0x0075:
            r6.copyOnWrite()
            com.google.protobuf.bv r6 = r6.instance
            com.google.assistant.s.a.nu r6 = (com.google.assistant.p3994s.p3995a.C53435nu) r6
            com.google.assistant.s.a.nu r0 = com.google.assistant.p3994s.p3995a.C53435nu.f140233n
            r7.getClass()
            r6.f140238c = r7
            r7 = 6
            r6.f140237b = r7
            return
        L_0x0087:
            if (r0 != r5) goto L_0x008e
            java.lang.Object r7 = r7.f48069c
            r4 = r7
            java.lang.String r4 = (java.lang.String) r4
        L_0x008e:
            r6.copyOnWrite()
            com.google.protobuf.bv r6 = r6.instance
            com.google.assistant.s.a.nu r6 = (com.google.assistant.p3994s.p3995a.C53435nu) r6
            com.google.assistant.s.a.nu r7 = com.google.assistant.p3994s.p3995a.C53435nu.f140233n
            r4.getClass()
            r7 = 5
            r6.f140237b = r7
            r6.f140238c = r4
            return
        L_0x00a0:
            if (r0 != r1) goto L_0x00ab
            java.lang.Object r7 = r7.f48069c
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L_0x00ac
        L_0x00ab:
            r7 = 0
        L_0x00ac:
            r6.copyOnWrite()
            com.google.protobuf.bv r6 = r6.instance
            com.google.assistant.s.a.nu r6 = (com.google.assistant.p3994s.p3995a.C53435nu) r6
            com.google.assistant.s.a.nu r0 = com.google.assistant.p3994s.p3995a.C53435nu.f140233n
            r6.f140237b = r3
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r6.f140238c = r7
            return
        L_0x00be:
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1248b.p1250b.C16246b.m33291e(com.google.assistant.s.a.ns, com.google.android.libraries.assistant.auto.tng.suggestions.k.ad):void");
    }

    /* renamed from: f */
    private static void m33292f(C48951ay ayVar, Set set) {
        for (C48952az d : ayVar.f126656a) {
            m33290d(d, set);
        }
    }

    /* renamed from: d */
    public static void m33290d(C48952az azVar, Set set) {
        C48971br brVar;
        C48951ay ayVar;
        C48951ay ayVar2;
        C48952az azVar2;
        int i = azVar.f126659a;
        int b = C48949aw.m85320b(i);
        int i2 = b - 1;
        if (b == 0) {
            throw null;
        } else if (i2 == 0) {
            if (i == 1) {
                brVar = (C48971br) azVar.f126660b;
            } else {
                brVar = C48971br.f126689d;
            }
            if (brVar.f126691a == 12) {
                String str = ((C48960bg) brVar.f126692b).f126669a;
                C58976aa aaVar = C58975e.f156826a;
                try {
                    set.add(Integer.valueOf(Integer.parseInt(str)));
                } catch (NumberFormatException unused) {
                }
            }
        } else if (i2 == 1) {
            if (i == 2) {
                ayVar = (C48951ay) azVar.f126660b;
            } else {
                ayVar = C48951ay.f126654b;
            }
            m33292f(ayVar, set);
        } else if (i2 == 2) {
            if (i == 3) {
                ayVar2 = (C48951ay) azVar.f126660b;
            } else {
                ayVar2 = C48951ay.f126654b;
            }
            m33292f(ayVar2, set);
        } else if (i2 == 3) {
            if (i == 4) {
                azVar2 = (C48952az) azVar.f126660b;
            } else {
                azVar2 = C48952az.f126657c;
            }
            m33290d(azVar2, set);
        }
    }
}
