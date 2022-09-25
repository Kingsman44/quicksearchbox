package com.google.android.apps.search.googleapp.promomanager.p10372b;

import com.google.android.apps.search.googleapp.promomanager.p10374c.C137046o;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63042fg;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63896aj;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63899am;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63905as;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63909aw;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63910ax;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63915bb;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63916bc;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63917bd;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63919bf;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63929bp;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63938by;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63958v;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63959w;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.cv */
/* compiled from: PG */
public final /* synthetic */ class C136994cv implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C137003dd f372816a;

    /* renamed from: b */
    public final /* synthetic */ C137046o f372817b;

    /* renamed from: c */
    public final /* synthetic */ C137007dh f372818c;

    public /* synthetic */ C136994cv(C137003dd ddVar, C137046o oVar, C137007dh dhVar) {
        this.f372816a = ddVar;
        this.f372817b = oVar;
        this.f372818c = dhVar;
    }

    public final Object apply(Object obj) {
        C63959w wVar;
        C63959w wVar2;
        C137003dd ddVar = this.f372816a;
        C137046o oVar = this.f372817b;
        C137007dh dhVar = this.f372818c;
        C63915bb bbVar = (C63915bb) obj;
        ddVar.f372849l.mo19974a(C37182a.f97892cR.mo40779c());
        C63909aw awVar = dhVar.f372875e;
        if (awVar == null) {
            awVar = C63909aw.f172816e;
        }
        int i = awVar.f172820c;
        if (dhVar.f372872b == 2) {
            wVar = (C63959w) dhVar.f372873c;
        } else {
            wVar = C63959w.f172981b;
        }
        C63958v a = C63958v.m96327a(wVar.f172983a);
        if (a == null) {
            a = C63958v.TYPE_UNSPECIFIED;
        }
        C63926bm a2 = C63926bm.m96318a(dhVar.f372874d);
        if (a2 == null) {
            a2 = C63926bm.UNSPECIFIED;
        }
        C63919bf k = ddVar.mo113476k(i, a, a2, oVar);
        if (C63919bf.f172845g.equals(k)) {
            ddVar.mo113477x(C37182a.f98156hQ.mo40806d(), dhVar, C63042fg.f170152c);
        } else {
            C63910ax axVar = (C63910ax) bbVar.toBuilder();
            C63916bc d = C137004de.m222697d(i, axVar);
            C63899am amVar = ((C63917bd) d.instance).f172838c;
            if (amVar == null) {
                amVar = C63899am.f172780h;
            }
            C63896aj ajVar = (C63896aj) amVar.toBuilder();
            C63899am amVar2 = ((C63917bd) d.instance).f172840e;
            if (amVar2 == null) {
                amVar2 = C63899am.f172780h;
            }
            C63896aj ajVar2 = (C63896aj) amVar2.toBuilder();
            Instant ofEpochMilli = Instant.ofEpochMilli(ddVar.f372846i.mo26870b());
            C63938by byVar = k.f172849c;
            if (byVar == null) {
                byVar = C63938by.f172910d;
            }
            C63929bp bpVar = byVar.f172913b;
            if (bpVar == null) {
                bpVar = C63929bp.f172876i;
            }
            boolean z = (bpVar.f172878a & 4) != 0;
            if (dhVar.f372876f) {
                int i2 = ((C63917bd) d.instance).f172839d;
                d.copyOnWrite();
                C63917bd bdVar = (C63917bd) d.instance;
                bdVar.f172836a |= 4;
                bdVar.f172839d = i2 + 1;
                C63899am b = C137004de.m222695b(ajVar2, ofEpochMilli, z);
                d.copyOnWrite();
                C63917bd bdVar2 = (C63917bd) d.instance;
                b.getClass();
                bdVar2.f172840e = b;
                bdVar2.f172836a |= 8;
            } else {
                int i3 = ((C63917bd) d.instance).f172837b;
                d.copyOnWrite();
                C63917bd bdVar3 = (C63917bd) d.instance;
                bdVar3.f172836a |= 1;
                bdVar3.f172837b = i3 + 1;
                C63899am b2 = C137004de.m222695b(ajVar, ofEpochMilli, z);
                d.copyOnWrite();
                C63917bd bdVar4 = (C63917bd) d.instance;
                b2.getClass();
                bdVar4.f172838c = b2;
                bdVar4.f172836a |= 2;
            }
            C63909aw awVar2 = dhVar.f372875e;
            if (awVar2 == null) {
                awVar2 = C63909aw.f172816e;
            }
            int i4 = awVar2.f172819b;
            C63899am amVar3 = C63899am.f172780h;
            C62995dn dnVar = bbVar.f172831d;
            Integer valueOf = Integer.valueOf(i4);
            if (dnVar.containsKey(valueOf)) {
                amVar3 = (C63899am) dnVar.get(valueOf);
            }
            C63899am b3 = C137004de.m222695b((C63896aj) amVar3.toBuilder(), ofEpochMilli, true);
            b3.getClass();
            axVar.copyOnWrite();
            C63915bb bbVar2 = (C63915bb) axVar.instance;
            C62995dn dnVar2 = bbVar2.f172831d;
            if (!dnVar2.f170058b) {
                bbVar2.f172831d = dnVar2.mo58980a();
            }
            bbVar2.f172831d.put(valueOf, b3);
            C63905as asVar = k.f172852f;
            if (asVar == null) {
                asVar = C63905as.f172804c;
            }
            if (!asVar.f172806a) {
                if (dhVar.f372872b == 2) {
                    wVar2 = (C63959w) dhVar.f372873c;
                } else {
                    wVar2 = C63959w.f172981b;
                }
                C63958v a3 = C63958v.m96327a(wVar2.f172983a);
                if (a3 == null) {
                    a3 = C63958v.TYPE_UNSPECIFIED;
                }
                int i5 = a3.f172980h;
                C63899am amVar4 = C63899am.f172780h;
                C62995dn dnVar3 = bbVar.f172830c;
                Integer valueOf2 = Integer.valueOf(i5);
                if (dnVar3.containsKey(valueOf2)) {
                    amVar4 = (C63899am) dnVar3.get(valueOf2);
                }
                C63899am b4 = C137004de.m222695b((C63896aj) amVar4.toBuilder(), ofEpochMilli, true);
                b4.getClass();
                axVar.copyOnWrite();
                C63915bb bbVar3 = (C63915bb) axVar.instance;
                C62995dn dnVar4 = bbVar3.f172830c;
                if (!dnVar4.f170058b) {
                    bbVar3.f172830c = dnVar4.mo58980a();
                }
                bbVar3.f172830c.put(valueOf2, b4);
                C63899am amVar5 = bbVar.f172829b;
                if (amVar5 == null) {
                    amVar5 = C63899am.f172780h;
                }
                C63899am b5 = C137004de.m222695b((C63896aj) amVar5.toBuilder(), ofEpochMilli, true);
                axVar.copyOnWrite();
                C63915bb bbVar4 = (C63915bb) axVar.instance;
                b5.getClass();
                bbVar4.f172829b = b5;
                bbVar4.f172828a |= 1;
            }
            bbVar = C137004de.m222696c(k, axVar, d);
            C37259h d2 = C37182a.f97893cS.mo40806d();
            C63042fg fgVar = oVar.f372965b;
            if (fgVar == null) {
                fgVar = C63042fg.f170152c;
            }
            ddVar.mo113477x(d2, dhVar, fgVar);
        }
        return bbVar;
    }
}
