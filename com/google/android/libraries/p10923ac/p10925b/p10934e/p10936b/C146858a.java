package com.google.android.libraries.p10923ac.p10925b.p10934e.p10936b;

import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146812i;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146820q;
import com.google.common.base.C58817ah;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62912at;
import com.google.protobuf.C63088z;
import com.google.protos.p4895aw.p4902b.C63964aa;
import com.google.protos.p4895aw.p4902b.C63965ab;
import com.google.protos.p4895aw.p4902b.C63966ac;
import com.google.protos.p4895aw.p4902b.C63967ad;
import com.google.protos.p4895aw.p4902b.C63968ae;
import com.google.protos.p4895aw.p4902b.C63969af;
import com.google.protos.p4895aw.p4902b.C63970ag;
import com.google.protos.p4895aw.p4902b.C63971ah;
import com.google.protos.p4895aw.p4902b.C64044d;
import com.google.protos.p4895aw.p4902b.C64089g;

/* renamed from: com.google.android.libraries.ac.b.e.b.a */
/* compiled from: PG */
public final /* synthetic */ class C146858a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C146874c f396429a;

    public /* synthetic */ C146858a(C146874c cVar) {
        this.f396429a = cVar;
    }

    public final Object apply(Object obj) {
        C63970ag agVar;
        long j;
        C146874c cVar = this.f396429a;
        C146812i iVar = (C146812i) obj;
        C146820q a = iVar.mo123705a();
        C146873b bVar = cVar.f396471a;
        int d = iVar.mo123708d();
        Long a2 = a.mo123712a();
        Long b = iVar.mo123706b();
        int i = d - 1;
        if (d != 0) {
            boolean z = false;
            if (i == 0 || i == 1) {
                if (a2 != null) {
                    z = true;
                }
                C58838bb.m90869d(z, "Absolute timestamp must be set for Override and TrustedTime modes!");
                C63967ad adVar = (C63967ad) C63970ag.f172999c.createBuilder();
                C63965ab abVar = (C63965ab) C63966ac.f172991c.createBuilder();
                long longValue = a2.longValue();
                abVar.copyOnWrite();
                C63966ac acVar = (C63966ac) abVar.instance;
                acVar.f172993a |= 1;
                acVar.f172994b = longValue;
                adVar.copyOnWrite();
                C63970ag agVar2 = (C63970ag) adVar.instance;
                C63966ac acVar2 = (C63966ac) abVar.build();
                acVar2.getClass();
                agVar2.f173002b = acVar2;
                agVar2.f173001a = 1;
                agVar = (C63970ag) adVar.build();
            } else if (i == 2) {
                if (a2 == null) {
                    z = true;
                }
                C58838bb.m90869d(z, "Absolute timestamp must be unset for ServerPolicyTime mode!");
                C63967ad adVar2 = (C63967ad) C63970ag.f172999c.createBuilder();
                C62912at atVar = C62912at.f169862a;
                adVar2.copyOnWrite();
                C63970ag agVar3 = (C63970ag) adVar2.instance;
                atVar.getClass();
                agVar3.f173002b = atVar;
                agVar3.f173001a = 3;
                agVar = (C63970ag) adVar2.build();
            } else if (i != 3) {
                throw new AssertionError("Unsupported timestamp mode " + (d != 1 ? d != 2 ? d != 3 ? "BEST_TIME" : "SERVER_POLICY_TIME" : "TRUSTED_TIME" : "OVERRIDE") + "!");
            } else {
                if (b == null) {
                    bVar.f396470b++;
                }
                if (b != null) {
                    j = bVar.f396469a - (b.longValue() * 1000);
                } else {
                    j = bVar.f396469a + ((long) bVar.f396470b);
                }
                C63967ad adVar3 = (C63967ad) C63970ag.f172999c.createBuilder();
                C63968ae aeVar = (C63968ae) C63969af.f172995c.createBuilder();
                aeVar.copyOnWrite();
                C63969af afVar = (C63969af) aeVar.instance;
                afVar.f172997a |= 1;
                afVar.f172998b = -j;
                adVar3.copyOnWrite();
                C63970ag agVar4 = (C63970ag) adVar3.instance;
                C63969af afVar2 = (C63969af) aeVar.build();
                afVar2.getClass();
                agVar4.f173002b = afVar2;
                agVar4.f173001a = 2;
                agVar = (C63970ag) adVar3.build();
            }
            C63964aa aaVar = (C63964aa) C63971ah.f173003f.createBuilder();
            aaVar.copyOnWrite();
            C63971ah ahVar = (C63971ah) aaVar.instance;
            agVar.getClass();
            ahVar.f173009e = agVar;
            ahVar.f173005a |= 8;
            if (a.mo123714c() != null) {
                C63088z A = C63088z.m96139A(a.mo123714c());
                aaVar.copyOnWrite();
                C63971ah ahVar2 = (C63971ah) aaVar.instance;
                ahVar2.f173005a |= 2;
                ahVar2.f173007c = A;
            }
            if (a.mo123713b() != null) {
                C63088z A2 = C63088z.m96139A(a.mo123713b());
                aaVar.copyOnWrite();
                C63971ah ahVar3 = (C63971ah) aaVar.instance;
                ahVar3.f173005a |= 4;
                ahVar3.f173008d = A2;
            }
            C64044d dVar = (C64044d) C64089g.f173264e.createBuilder();
            int c = iVar.mo123707c();
            int i2 = c - 1;
            if (c == 0) {
                throw null;
            } else if (i2 == 0) {
                dVar.copyOnWrite();
                C64089g gVar = (C64089g) dVar.instance;
                gVar.f173269d = 2;
                gVar.f173266a |= 1;
                dVar.copyOnWrite();
                C64089g gVar2 = (C64089g) dVar.instance;
                C63971ah ahVar4 = (C63971ah) aaVar.build();
                ahVar4.getClass();
                gVar2.f173268c = ahVar4;
                gVar2.f173267b = 4;
                return (C64089g) dVar.build();
            } else {
                throw new AssertionError("Unknown local Footprints change type WRITE!");
            }
        } else {
            throw null;
        }
    }
}
