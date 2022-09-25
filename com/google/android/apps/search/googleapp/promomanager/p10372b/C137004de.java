package com.google.android.apps.search.googleapp.promomanager.p10372b;

import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63896aj;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63897ak;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63898al;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63899am;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63900an;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63901ao;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63909aw;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63910ax;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63915bb;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63916bc;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63917bd;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63919bf;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63929bp;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63938by;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.de */
/* compiled from: PG */
final class C137004de {

    /* renamed from: a */
    private static final Duration f372864a = Duration.ofDays(1);

    /* renamed from: b */
    private static final Duration f372865b = Duration.ofDays(7);

    /* renamed from: c */
    private static final Duration f372866c = Duration.ofDays(28);

    /* renamed from: d */
    private static final Duration f372867d = Duration.ofDays(92);

    /* renamed from: e */
    private static final Duration f372868e = Duration.ofDays(365);

    /* renamed from: a */
    public static C63898al m222694a(C63898al alVar, Duration duration, Instant instant) {
        C63897ak akVar = (C63897ak) alVar.toBuilder();
        C63042fg fgVar = alVar.f172779c;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        Instant e = C62950b.m95474e(fgVar);
        if ((alVar.f172777a & 2) == 0 || instant.isAfter(e)) {
            C63042fg c = C62950b.m95472c(instant.plus(duration));
            akVar.copyOnWrite();
            C63898al alVar2 = (C63898al) akVar.instance;
            c.getClass();
            alVar2.f172779c = c;
            alVar2.f172777a |= 2;
            akVar.copyOnWrite();
            C63898al alVar3 = (C63898al) akVar.instance;
            alVar3.f172777a |= 1;
            alVar3.f172778b = 0;
        }
        int i = ((C63898al) akVar.instance).f172778b;
        akVar.copyOnWrite();
        C63898al alVar4 = (C63898al) akVar.instance;
        alVar4.f172777a |= 1;
        alVar4.f172778b = i + 1;
        return (C63898al) akVar.build();
    }

    /* renamed from: b */
    public static C63899am m222695b(C63896aj ajVar, Instant instant, boolean z) {
        C63899am amVar = (C63899am) ajVar.build();
        C63042fg c = C62950b.m95472c(instant);
        ajVar.copyOnWrite();
        C63899am amVar2 = (C63899am) ajVar.instance;
        C63899am amVar3 = C63899am.f172780h;
        c.getClass();
        amVar2.f172783b = c;
        amVar2.f172782a |= 1;
        if (z) {
            C63898al alVar = amVar.f172784c;
            if (alVar == null) {
                alVar = C63898al.f172775d;
            }
            C63898al a = m222694a(alVar, f372864a, instant);
            ajVar.copyOnWrite();
            C63899am amVar4 = (C63899am) ajVar.instance;
            a.getClass();
            amVar4.f172784c = a;
            amVar4.f172782a |= 2;
            C63898al alVar2 = amVar.f172785d;
            if (alVar2 == null) {
                alVar2 = C63898al.f172775d;
            }
            C63898al a2 = m222694a(alVar2, f372865b, instant);
            ajVar.copyOnWrite();
            C63899am amVar5 = (C63899am) ajVar.instance;
            a2.getClass();
            amVar5.f172785d = a2;
            amVar5.f172782a |= 4;
            C63898al alVar3 = amVar.f172786e;
            if (alVar3 == null) {
                alVar3 = C63898al.f172775d;
            }
            C63898al a3 = m222694a(alVar3, f372866c, instant);
            ajVar.copyOnWrite();
            C63899am amVar6 = (C63899am) ajVar.instance;
            a3.getClass();
            amVar6.f172786e = a3;
            amVar6.f172782a |= 8;
            C63898al alVar4 = amVar.f172787f;
            if (alVar4 == null) {
                alVar4 = C63898al.f172775d;
            }
            C63898al a4 = m222694a(alVar4, f372867d, instant);
            ajVar.copyOnWrite();
            C63899am amVar7 = (C63899am) ajVar.instance;
            a4.getClass();
            amVar7.f172787f = a4;
            amVar7.f172782a |= 16;
            C63898al alVar5 = amVar.f172788g;
            if (alVar5 == null) {
                alVar5 = C63898al.f172775d;
            }
            C63898al a5 = m222694a(alVar5, f372868e, instant);
            ajVar.copyOnWrite();
            C63899am amVar8 = (C63899am) ajVar.instance;
            a5.getClass();
            amVar8.f172788g = a5;
            amVar8.f172782a |= 32;
        }
        return (C63899am) ajVar.build();
    }

    /* renamed from: c */
    public static C63915bb m222696c(C63919bf bfVar, C63910ax axVar, C63916bc bcVar) {
        C63909aw awVar = bfVar.f172848b;
        if (awVar == null) {
            awVar = C63909aw.f172816e;
        }
        int i = awVar.f172820c;
        C63917bd bdVar = (C63917bd) bcVar.build();
        bdVar.getClass();
        axVar.copyOnWrite();
        C63915bb bbVar = C63915bb.f172826g;
        C62995dn a = ((C63915bb) axVar.instance).mo59240a();
        Integer valueOf = Integer.valueOf(i);
        a.put(valueOf, bdVar);
        C63938by byVar = bfVar.f172849c;
        if (byVar == null) {
            byVar = C63938by.f172910d;
        }
        C63929bp bpVar = byVar.f172913b;
        if (bpVar == null) {
            bpVar = C63929bp.f172876i;
        }
        C63901ao aoVar = ((C63915bb) axVar.instance).f172833f;
        if (aoVar == null) {
            aoVar = C63901ao.f172789b;
        }
        C62971cq cqVar = aoVar.f172791a;
        C63909aw awVar2 = bfVar.f172848b;
        if (awVar2 == null) {
            awVar2 = C63909aw.f172816e;
        }
        if (cqVar.contains(awVar2)) {
            return (C63915bb) axVar.build();
        }
        int i2 = bpVar.f172878a;
        boolean z = true;
        boolean z2 = (i2 & 1) != 0 && bdVar.f172837b >= bpVar.f172879b;
        boolean z3 = (i2 & 8) != 0 && bdVar.f172841f >= bpVar.f172882e;
        if ((i2 & 32) == 0 || bdVar.f172843h < bpVar.f172884g) {
            z = false;
        }
        if (z2 || z3 || z) {
            C63901ao aoVar2 = ((C63915bb) axVar.instance).f172833f;
            if (aoVar2 == null) {
                aoVar2 = C63901ao.f172789b;
            }
            C63900an anVar = (C63900an) aoVar2.toBuilder();
            C63909aw awVar3 = bfVar.f172848b;
            if (awVar3 == null) {
                awVar3 = C63909aw.f172816e;
            }
            anVar.copyOnWrite();
            C63901ao aoVar3 = (C63901ao) anVar.instance;
            awVar3.getClass();
            C62971cq cqVar2 = aoVar3.f172791a;
            if (!cqVar2.mo58948c()) {
                aoVar3.f172791a = C62942bv.mutableCopy(cqVar2);
            }
            aoVar3.f172791a.add(awVar3);
            axVar.copyOnWrite();
            C63915bb bbVar2 = (C63915bb) axVar.instance;
            C63901ao aoVar4 = (C63901ao) anVar.build();
            aoVar4.getClass();
            bbVar2.f172833f = aoVar4;
            bbVar2.f172828a |= 2;
            axVar.copyOnWrite();
            ((C63915bb) axVar.instance).mo59240a().remove(valueOf);
        }
        return (C63915bb) axVar.build();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.protos.aw.a.a.a.bd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63916bc m222697d(int r2, com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63910ax r3) {
        /*
            com.google.protos.aw.a.a.a.bd r0 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63917bd.f172834j
            com.google.protobuf.bv r3 = r3.instance
            com.google.protos.aw.a.a.a.bb r3 = (com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63915bb) r3
            com.google.protobuf.dn r3 = r3.f172832e
            java.util.Map r3 = java.util.Collections.unmodifiableMap(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r1 = r3.containsKey(r2)
            if (r1 == 0) goto L_0x001d
            java.lang.Object r2 = r3.get(r2)
            r0 = r2
            com.google.protos.aw.a.a.a.bd r0 = (com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63917bd) r0
        L_0x001d:
            com.google.protobuf.bn r2 = r0.toBuilder()
            com.google.protos.aw.a.a.a.bc r2 = (com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63916bc) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.promomanager.p10372b.C137004de.m222697d(int, com.google.protos.aw.a.a.a.ax):com.google.protos.aw.a.a.a.bc");
    }
}
