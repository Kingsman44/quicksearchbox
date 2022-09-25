package com.google.android.libraries.search.assistant.fluidactions.p2535a.p2537b;

import com.google.assistant.p3897e.p3921j.C52153he;
import com.google.assistant.p3897e.p3921j.C52154hf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.knowledge.p4661a.p4662a.C61747i;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61762x;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import com.google.protos.p4850an.C63348as;
import com.google.protos.p4850an.C63349at;
import com.google.protos.p4850an.C63633q;
import com.google.protos.p4850an.C63634r;
import com.google.protos.p4850an.C63639w;
import com.google.protos.p4850an.C63640x;
import com.google.protos.p4850an.C63641y;
import com.google.protos.p4850an.C63642z;
import com.google.protos.p4985f.p5023n.p5024a.p5025a.p5026a.C64963h;
import com.google.protos.p4985f.p5023n.p5024a.p5025a.p5026a.C64964i;
import com.google.protos.p4985f.p5023n.p5024a.p5025a.p5026a.C64965j;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.a.b.a */
/* compiled from: PG */
public final class C32945a {

    /* renamed from: a */
    public static final C59071e f88262a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.a.b.a");

    /* renamed from: a */
    public static Optional m60962a(C52154hf hfVar, C61748j jVar) {
        try {
            C63642z zVar = (C63642z) C62942bv.parseFrom((C62942bv) C63642z.f172112e, hfVar.f136857b, C62921ba.m95368a());
            if (zVar.f172117d.size() == 0) {
                ((C59052c) ((C59052c) f88262a.mo56226d()).mo56372aa(50655)).mo56386p("IntentUpdate doesn't have any ArgumentUpdate.");
                return Optional.empty();
            }
            C63641y yVar = (C63641y) zVar.toBuilder();
            int i = 0;
            while (true) {
                if (i >= zVar.f172117d.size()) {
                    break;
                }
                Optional b = m60963b((C63634r) zVar.f172117d.get(i), jVar);
                if (b.isPresent()) {
                    yVar.mo59227d(i, (C63634r) b.get());
                    break;
                }
                i++;
            }
            C52153he heVar = (C52153he) hfVar.toBuilder();
            C63088z byteString = ((C63642z) yVar.build()).toByteString();
            heVar.copyOnWrite();
            C52154hf hfVar2 = (C52154hf) heVar.instance;
            byteString.getClass();
            hfVar2.f136856a |= 1;
            hfVar2.f136857b = byteString;
            return Optional.m71637of((C52154hf) heVar.build());
        } catch (C62974ct unused) {
            ((C59052c) ((C59052c) f88262a.mo56226d()).mo56372aa(50656)).mo56386p("The IntentUpdateInput has malformed IntentUpdate");
            return Optional.empty();
        }
    }

    /* renamed from: b */
    private static Optional m60963b(C63634r rVar, C61748j jVar) {
        C63640x xVar;
        Object obj;
        Object obj2;
        C63349at atVar;
        C63349at atVar2;
        if ((rVar.f172098a & 65536) != 0) {
            C61762x xVar2 = rVar.f172102e;
            if (xVar2 == null) {
                xVar2 = C61762x.f166835e;
            }
            C62940bt r1 = C62942bv.checkIsLite(C64965j.f175943d);
            xVar2.mo58887l(r1);
            if (xVar2.f169962ag.mo58857o(r1.f169971d)) {
                C61762x xVar3 = rVar.f172102e;
                if (xVar3 == null) {
                    xVar3 = C61762x.f166835e;
                }
                C62940bt r12 = C62942bv.checkIsLite(C64965j.f175943d);
                xVar3.mo58887l(r12);
                Object l = xVar3.f169962ag.mo58854l(r12.f169971d);
                if (l == null) {
                    obj = r12.f169969b;
                } else {
                    obj = r12.mo58889c(l);
                }
                if ((((C64965j) obj).f175945a & 1) != 0) {
                    C61762x xVar4 = rVar.f172102e;
                    if (xVar4 == null) {
                        xVar4 = C61762x.f166835e;
                    }
                    C62940bt r13 = C62942bv.checkIsLite(C64965j.f175943d);
                    xVar4.mo58887l(r13);
                    Object l2 = xVar4.f169962ag.mo58854l(r13.f169971d);
                    if (l2 == null) {
                        obj2 = r13.f169969b;
                    } else {
                        obj2 = r13.mo58889c(l2);
                    }
                    C64965j jVar2 = (C64965j) obj2;
                    C64964i iVar = jVar2.f175946b;
                    if (iVar == null) {
                        iVar = C64964i.f175937d;
                    }
                    C64963h a = C64963h.m96486a(iVar.f175940b);
                    if (a == null) {
                        a = C64963h.UNSPECIFIED;
                    }
                    if (!a.equals(C64963h.SET_FIELD)) {
                        C59052c cVar = (C59052c) ((C59052c) f88262a.mo56226d()).mo56372aa(50651);
                        C64964i iVar2 = jVar2.f175946b;
                        if (iVar2 == null) {
                            iVar2 = C64964i.f175937d;
                        }
                        C64963h a2 = C64963h.m96486a(iVar2.f175940b);
                        if (a2 == null) {
                            a2 = C64963h.UNSPECIFIED;
                        }
                        cVar.mo56387q("Unsupported operation: %d", a2.f175936i);
                        return Optional.empty();
                    }
                    if (rVar.f172099b == 2) {
                        atVar = (C63349at) rVar.f172100c;
                    } else {
                        atVar = C63349at.f171190c;
                    }
                    C61748j jVar3 = atVar.f171193b;
                    if (jVar3 == null) {
                        jVar3 = C61748j.f166800d;
                    }
                    if (rVar.f172099b == 2) {
                        atVar2 = (C63349at) rVar.f172100c;
                    } else {
                        atVar2 = C63349at.f171190c;
                    }
                    C63348as asVar = (C63348as) atVar2.toBuilder();
                    C61747i iVar3 = (C61747i) jVar.toBuilder();
                    iVar3.mo58181a(jVar3.f166804c);
                    asVar.copyOnWrite();
                    C63349at atVar3 = (C63349at) asVar.instance;
                    C61748j jVar4 = (C61748j) iVar3.build();
                    jVar4.getClass();
                    atVar3.f171193b = jVar4;
                    atVar3.f171192a |= 1;
                    C63633q qVar = (C63633q) rVar.toBuilder();
                    qVar.copyOnWrite();
                    C63634r rVar2 = (C63634r) qVar.instance;
                    C63349at atVar4 = (C63349at) asVar.build();
                    atVar4.getClass();
                    rVar2.f172100c = atVar4;
                    rVar2.f172099b = 2;
                    return Optional.m71637of((C63634r) qVar.build());
                }
            }
        }
        if (rVar.f172099b == 15) {
            xVar = (C63640x) rVar.f172100c;
        } else {
            xVar = C63640x.f172108b;
        }
        if (xVar.f172110a.size() == 0) {
            return Optional.empty();
        }
        for (int i = 0; i < xVar.f172110a.size(); i++) {
            Optional b = m60963b((C63634r) xVar.f172110a.get(i), jVar);
            if (b.isPresent()) {
                C63639w wVar = (C63639w) xVar.toBuilder();
                wVar.mo59223a(i, (C63634r) b.get());
                C63640x xVar5 = (C63640x) wVar.build();
                C63633q qVar2 = (C63633q) rVar.toBuilder();
                qVar2.copyOnWrite();
                C63634r rVar3 = (C63634r) qVar2.instance;
                xVar5.getClass();
                rVar3.f172100c = xVar5;
                rVar3.f172099b = 15;
                return Optional.m71637of((C63634r) qVar2.build());
            }
        }
        return Optional.empty();
    }
}
