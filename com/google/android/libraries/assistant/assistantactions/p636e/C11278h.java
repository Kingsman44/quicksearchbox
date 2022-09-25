package com.google.android.libraries.assistant.assistantactions.p636e;

import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q;
import com.google.assistant.p3897e.p3902c.p3907c.C51015df;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52153he;
import com.google.assistant.p3897e.p3921j.C52154hf;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.C52535vi;
import com.google.assistant.p3897e.p3921j.C52537vk;
import com.google.assistant.p3897e.p3921j.C52541vo;
import com.google.assistant.p3897e.p3921j.C52621yn;
import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.assistant.p3897e.p3921j.add;
import com.google.assistant.p3897e.p3921j.ade;
import com.google.assistant.p3897e.p3921j.adm;
import com.google.assistant.p3897e.p3921j.p3926e.C51937eq;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51943ew;
import com.google.assistant.p3897e.p3921j.p3926e.C51948fa;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4535g.C59218l;
import com.google.knowledge.p4661a.p4662a.C61747i;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61762x;
import com.google.p381aj.p382a.p383a.p384a.C8212aa;
import com.google.p381aj.p382a.p383a.p384a.C8213ab;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63088z;
import com.google.protos.p4850an.C63348as;
import com.google.protos.p4850an.C63349at;
import com.google.protos.p4850an.C63388bf;
import com.google.protos.p4850an.C63389bg;
import com.google.protos.p4850an.C63633q;
import com.google.protos.p4850an.C63634r;
import com.google.protos.p4850an.C63639w;
import com.google.protos.p4850an.C63640x;
import com.google.protos.p4850an.C63641y;
import com.google.protos.p4850an.C63642z;
import com.google.protos.p4850an.p4853b.C63357a;
import com.google.protos.p4850an.p4853b.C63358b;
import com.google.protos.p4850an.p4853b.C63359c;
import com.google.protos.p4850an.p4853b.C63360d;
import com.google.protos.p4850an.p4853b.C63371o;
import com.google.protos.p4850an.p4853b.C63378v;
import com.google.protos.p4850an.p4854c.C63401ab;
import com.google.protos.p4850an.p4854c.C63402ac;
import com.google.protos.p4850an.p4854c.C63407ah;
import com.google.protos.p4850an.p4854c.C63408ai;
import com.google.protos.p4850an.p4854c.C63409aj;
import com.google.protos.p4850an.p4854c.C63410ak;
import com.google.protos.p4850an.p4855d.p4862g.C63565b;
import com.google.protos.p4985f.p5023n.p5024a.p5025a.p5026a.C64963h;
import com.google.protos.p4985f.p5023n.p5024a.p5025a.p5026a.C64964i;
import com.google.protos.p4985f.p5023n.p5024a.p5025a.p5026a.C64965j;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.assistantactions.e.h */
/* compiled from: PG */
public final class C11278h {

    /* renamed from: a */
    private static final C59071e f36698a = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.e.h");

    /* renamed from: a */
    public static C51805du m26771a(C51805du duVar, C61748j jVar) {
        Optional h = m26778h(duVar);
        if (!h.isPresent()) {
            return duVar;
        }
        Optional g = m26777g((C52154hf) h.get());
        if (!g.isPresent()) {
            return duVar;
        }
        if (((C63642z) g.get()).f172117d.size() == 0) {
            ((C59052c) ((C59052c) f36698a.mo56226d()).mo56372aa(43307)).mo56386p("IntentUpdate doesn't have any ArgumentUpdate.");
            return duVar;
        }
        C63641y yVar = (C63641y) ((C63642z) g.get()).toBuilder();
        int i = 0;
        while (true) {
            if (i >= ((C63642z) g.get()).f172117d.size()) {
                break;
            }
            Optional k = m26781k((C63634r) ((C63642z) g.get()).f172117d.get(i), jVar);
            if (k.isPresent()) {
                yVar.mo59227d(i, (C63634r) k.get());
                break;
            }
            i++;
        }
        C52153he heVar = (C52153he) ((C52154hf) h.get()).toBuilder();
        C63088z byteString = ((C63642z) yVar.build()).toByteString();
        heVar.copyOnWrite();
        C52154hf hfVar = (C52154hf) heVar.instance;
        byteString.getClass();
        hfVar.f136856a |= 1;
        hfVar.f136857b = byteString;
        C51803ds dsVar = (C51803ds) duVar.toBuilder();
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.IntentUpdateInput";
        C63088z byteString2 = ((C52154hf) heVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString2.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString2;
        dsVar.mo53729a("intent_update_input", (C52230ka) jzVar.build());
        return (C51805du) dsVar.build();
    }

    /* renamed from: b */
    public static C51805du m26772b(C51805du duVar, C52541vo voVar) {
        C63409aj ajVar = (C63409aj) C63410ak.f171362e.createBuilder();
        ajVar.copyOnWrite();
        C63410ak akVar = (C63410ak) ajVar.instance;
        akVar.f171366c = 0;
        akVar.f171364a |= 2048;
        String l = m26782l(voVar);
        ajVar.copyOnWrite();
        C63410ak akVar2 = (C63410ak) ajVar.instance;
        akVar2.f171364a |= 1024;
        akVar2.f171365b = l;
        if ((voVar.f137910a & 8) != 0) {
            C52535vi viVar = voVar.f137913d;
            if (viVar == null) {
                viVar = C52535vi.f137898d;
            }
            C59218l b = C59218l.m91868b(viVar.f137901b);
            C52535vi viVar2 = voVar.f137913d;
            if (viVar2 == null) {
                viVar2 = C52535vi.f137898d;
            }
            C59218l b2 = C59218l.m91868b(viVar2.f137902c);
            C63388bf bfVar = (C63388bf) C63389bg.f171305d.createBuilder();
            C8212aa aaVar = (C8212aa) C8213ab.f28837d.createBuilder();
            int a = b.mo56611a();
            aaVar.copyOnWrite();
            C8213ab abVar = (C8213ab) aaVar.instance;
            abVar.f28839a |= 1;
            abVar.f28840b = a;
            int a2 = b2.mo56611a();
            aaVar.copyOnWrite();
            C8213ab abVar2 = (C8213ab) aaVar.instance;
            abVar2.f28839a |= 2;
            abVar2.f28841c = a2;
            bfVar.copyOnWrite();
            C63389bg bgVar = (C63389bg) bfVar.instance;
            C8213ab abVar3 = (C8213ab) aaVar.build();
            abVar3.getClass();
            bgVar.f171309c = abVar3;
            bgVar.f171307a |= 512;
            ajVar.copyOnWrite();
            C63410ak akVar3 = (C63410ak) ajVar.instance;
            C63389bg bgVar2 = (C63389bg) bfVar.build();
            bgVar2.getClass();
            akVar3.f171367d = bgVar2;
            akVar3.f171364a |= 4096;
        }
        C63407ah ahVar = (C63407ah) C63408ai.f171351e.createBuilder();
        String l2 = m26782l(voVar);
        ahVar.copyOnWrite();
        C63408ai aiVar = (C63408ai) ahVar.instance;
        aiVar.f171353a |= 16;
        aiVar.f171356d = l2;
        C63401ab abVar4 = (C63401ab) C63402ac.f171336b.createBuilder();
        abVar4.mo59211a(ajVar);
        C63402ac acVar = (C63402ac) abVar4.build();
        ahVar.copyOnWrite();
        C63408ai aiVar2 = (C63408ai) ahVar.instance;
        acVar.getClass();
        aiVar2.f171354b = acVar;
        aiVar2.f171353a |= 1;
        return m26771a(duVar, C11271a.m26760d((C63408ai) ahVar.build()));
    }

    /* renamed from: c */
    public static C51805du m26773c(C51805du duVar, adm adm) {
        C52623yp ypVar = adm.f134892b;
        if (ypVar == null) {
            ypVar = C52623yp.f138162g;
        }
        if (ypVar.f138166c.isEmpty()) {
            ((C59052c) ((C59052c) f36698a.mo56226d()).mo56372aa(43308)).mo56386p("no name for selected person");
            return duVar;
        }
        C61747i iVar = (C61747i) C61748j.f166800d.createBuilder();
        C52623yp ypVar2 = adm.f134892b;
        if (ypVar2 == null) {
            ypVar2 = C52623yp.f138162g;
        }
        C62971cq cqVar = ypVar2.f138166c;
        add add = (add) ade.f134877h.createBuilder();
        String str = ((C52621yn) cqVar.get(0)).f138158c;
        add.copyOnWrite();
        ade ade = (ade) add.instance;
        str.getClass();
        ade.f134879a |= 8;
        ade.f134883e = str;
        String str2 = ((C52621yn) cqVar.get(0)).f138158c;
        add.copyOnWrite();
        ade ade2 = (ade) add.instance;
        str2.getClass();
        ade2.f134879a |= 1;
        ade2.f134880b = str2;
        add.mo53673a(adm);
        C63565b e = C11277g.m26770e((ade) add.build());
        iVar.copyOnWrite();
        C61748j jVar = (C61748j) iVar.instance;
        e.getClass();
        jVar.f166803b = e;
        jVar.f166802a = 9;
        return m26771a(duVar, (C61748j) iVar.build());
    }

    /* renamed from: d */
    public static C51805du m26774d(C51805du duVar, C52403ql qlVar) {
        C63359c cVar = (C63359c) C63360d.f171230f.createBuilder();
        C63357a aVar = (C63357a) C63358b.f171216l.createBuilder();
        int i = qlVar.f137515b;
        aVar.copyOnWrite();
        C63358b bVar = (C63358b) aVar.instance;
        bVar.f171218a |= 16;
        bVar.f171222e = i;
        int i2 = qlVar.f137516c;
        aVar.copyOnWrite();
        C63358b bVar2 = (C63358b) aVar.instance;
        bVar2.f171218a |= 32;
        bVar2.f171223f = i2;
        int i3 = qlVar.f137517d;
        aVar.copyOnWrite();
        C63358b bVar3 = (C63358b) aVar.instance;
        bVar3.f171218a |= 64;
        bVar3.f171224g = i3;
        cVar.mo59207b((C63358b) aVar.build());
        cVar.copyOnWrite();
        C63360d dVar = (C63360d) cVar.instance;
        dVar.f171236e = 1;
        dVar.f171232a |= 64;
        return m26771a(duVar, C11271a.m26757a((C63360d) cVar.build()));
    }

    /* renamed from: e */
    public static C51953ff m26775e(C51953ff ffVar, C52507uh uhVar) {
        C51016dg dgVar;
        C51016dg dgVar2;
        C51016dg dgVar3;
        if (uhVar.f137840a.size() == 1) {
            int i = ((C52490tr) C58557jl.m90133n(uhVar.f137840a)).f137798b;
            if (i != 3 && i != 16) {
                return ffVar;
            }
            for (C51948fa faVar : ffVar.f136319c) {
                for (C51943ew ewVar : faVar.f136299d) {
                    for (C51941eu euVar : ewVar.f136288b) {
                        if (euVar.f136275c == 1) {
                            dgVar = (C51016dg) euVar.f136276d;
                        } else {
                            dgVar = C51016dg.f132827g;
                        }
                        C51805du duVar = dgVar.f132833e;
                        if (duVar == null) {
                            duVar = C51805du.f135924e;
                        }
                        if (duVar.f135927b.equals("asst_input.INTENT_UPDATE")) {
                            if (euVar.f136275c == 1) {
                                dgVar2 = (C51016dg) euVar.f136276d;
                            } else {
                                dgVar2 = C51016dg.f132827g;
                            }
                            C51805du duVar2 = dgVar2.f132833e;
                            if (duVar2 == null) {
                                duVar2 = C51805du.f135924e;
                            }
                            Optional h = m26778h(duVar2);
                            if (h.isPresent()) {
                                Optional g = m26777g((C52154hf) h.get());
                                if (g.isPresent()) {
                                    C63641y yVar = (C63641y) ((C63642z) g.get()).toBuilder();
                                    for (int i2 = 0; i2 < ((C63642z) g.get()).f172117d.size(); i2++) {
                                        yVar.mo59227d(i2, m26779i((C63634r) ((C63642z) g.get()).f172117d.get(i2), ffVar));
                                    }
                                    C52153he heVar = (C52153he) ((C52154hf) h.get()).toBuilder();
                                    C63088z byteString = ((C63642z) yVar.build()).toByteString();
                                    heVar.copyOnWrite();
                                    C52154hf hfVar = (C52154hf) heVar.instance;
                                    byteString.getClass();
                                    hfVar.f136856a |= 1;
                                    hfVar.f136857b = byteString;
                                    C51803ds dsVar = (C51803ds) duVar2.toBuilder();
                                    C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
                                    jzVar.copyOnWrite();
                                    C52230ka kaVar = (C52230ka) jzVar.instance;
                                    kaVar.f137059a |= 1;
                                    kaVar.f137060b = "assistant.api.client_input.IntentUpdateInput";
                                    C63088z byteString2 = ((C52154hf) heVar.build()).toByteString();
                                    jzVar.copyOnWrite();
                                    C52230ka kaVar2 = (C52230ka) jzVar.instance;
                                    byteString2.getClass();
                                    kaVar2.f137059a |= 2;
                                    kaVar2.f137061c = byteString2;
                                    dsVar.mo53729a("intent_update_input", (C52230ka) jzVar.build());
                                    duVar2 = (C51805du) dsVar.build();
                                }
                            }
                            if (euVar.f136275c == 1) {
                                dgVar3 = (C51016dg) euVar.f136276d;
                            } else {
                                dgVar3 = C51016dg.f132827g;
                            }
                            C51015df dfVar = (C51015df) dgVar3.toBuilder();
                            dfVar.copyOnWrite();
                            C51016dg dgVar4 = (C51016dg) dfVar.instance;
                            duVar2.getClass();
                            dgVar4.f132833e = duVar2;
                            dgVar4.f132829a |= 8;
                            C51016dg dgVar5 = (C51016dg) dfVar.build();
                            C51937eq eqVar = (C51937eq) euVar.toBuilder();
                            eqVar.copyOnWrite();
                            C51941eu euVar2 = (C51941eu) eqVar.instance;
                            dgVar5.getClass();
                            euVar2.f136276d = dgVar5;
                            euVar2.f136275c = 1;
                            ffVar = C11222q.m26609f((C51941eu) eqVar.build(), C58836b.f156633a, ffVar);
                        }
                    }
                }
            }
            return ffVar;
        }
        ((C59052c) ((C59052c) f36698a.mo56224b()).mo56372aa(43309)).mo56386p("progressCallDialog, multiple form field content present");
        return ffVar;
    }

    /* renamed from: f */
    public static C63360d m26776f(Optional optional, Optional optional2, Optional optional3) {
        C63359c cVar = (C63359c) C63360d.f171230f.createBuilder();
        if (optional.isPresent() || optional2.isPresent()) {
            C63357a aVar = (C63357a) C63358b.f171216l.createBuilder();
            if (optional.isPresent()) {
                int i = ((C52393qb) optional.get()).f137482b;
                aVar.copyOnWrite();
                C63358b bVar = (C63358b) aVar.instance;
                bVar.f171218a |= 1;
                bVar.f171219b = i;
                int a = C63378v.m96231a(((C52393qb) optional.get()).f137483c);
                aVar.copyOnWrite();
                C63358b bVar2 = (C63358b) aVar.instance;
                int i2 = a - 1;
                if (a != 0) {
                    bVar2.f171220c = i2;
                    bVar2.f171218a |= 2;
                    int i3 = ((C52393qb) optional.get()).f137484d;
                    aVar.copyOnWrite();
                    C63358b bVar3 = (C63358b) aVar.instance;
                    bVar3.f171218a |= 4;
                    bVar3.f171221d = i3;
                } else {
                    throw null;
                }
            }
            if (optional2.isPresent()) {
                int i4 = ((C52403ql) optional2.get()).f137515b;
                aVar.copyOnWrite();
                C63358b bVar4 = (C63358b) aVar.instance;
                bVar4.f171218a |= 16;
                bVar4.f171222e = i4;
                int i5 = ((C52403ql) optional2.get()).f137516c;
                aVar.copyOnWrite();
                C63358b bVar5 = (C63358b) aVar.instance;
                bVar5.f171218a |= 32;
                bVar5.f171223f = i5;
                int i6 = ((C52403ql) optional2.get()).f137517d;
                aVar.copyOnWrite();
                C63358b bVar6 = (C63358b) aVar.instance;
                bVar6.f171218a |= 64;
                bVar6.f171224g = i6;
            }
            cVar.mo59206a(aVar);
            cVar.copyOnWrite();
            C63360d dVar = (C63360d) cVar.instance;
            dVar.f171236e = 1;
            dVar.f171232a |= 64;
        }
        if (optional3.isPresent()) {
            cVar.copyOnWrite();
            C63360d dVar2 = (C63360d) cVar.instance;
            dVar2.f171236e = 1;
            dVar2.f171232a |= 64;
            C63371o g = C11271a.m26763g((C52397qf) optional3.get());
            cVar.copyOnWrite();
            C63360d dVar3 = (C63360d) cVar.instance;
            g.getClass();
            dVar3.f171235d = g;
            dVar3.f171232a |= 2;
        }
        return (C63360d) cVar.build();
    }

    /* renamed from: g */
    public static Optional m26777g(C52154hf hfVar) {
        try {
            return Optional.m71637of((C63642z) C62942bv.parseFrom((C62942bv) C63642z.f172112e, hfVar.f136857b, C62921ba.m95368a()));
        } catch (C62974ct unused) {
            ((C59052c) ((C59052c) f36698a.mo56226d()).mo56372aa(43311)).mo56386p("The ClientInput has malformed IntentUpdate");
            return Optional.empty();
        }
    }

    /* renamed from: h */
    public static Optional m26778h(C51805du duVar) {
        if (!duVar.f135927b.equals("asst_input.INTENT_UPDATE")) {
            ((C59052c) ((C59052c) f36698a.mo56226d()).mo56372aa(43313)).mo56354G("Expected ClientInput name: %s, actual: %s.", "asst_input.INTENT_UPDATE", duVar.f135927b);
            return Optional.empty();
        }
        try {
            C62995dn dnVar = duVar.f135929d;
            if (dnVar.containsKey("intent_update_input")) {
                return Optional.m71637of((C52154hf) C62942bv.parseFrom((C62942bv) C52154hf.f136854c, ((C52230ka) dnVar.get("intent_update_input")).f137061c, C62921ba.m95368a()));
            }
            throw new IllegalArgumentException();
        } catch (C62974ct | IllegalArgumentException unused) {
            ((C59052c) ((C59052c) f36698a.mo56226d()).mo56372aa(43312)).mo56386p("The ClientInput has invalid param.");
            return Optional.empty();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0286 A[RETURN] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.protos.p4850an.C63634r m26779i(com.google.protos.p4850an.C63634r r10, com.google.assistant.p3897e.p3921j.p3926e.C51953ff r11) {
        /*
            boolean r0 = m26783m(r10)
            if (r0 == 0) goto L_0x022d
            boolean r0 = m26783m(r10)
            if (r0 != 0) goto L_0x000e
            goto L_0x022d
        L_0x000e:
            com.google.knowledge.a.a.x r0 = r10.f172102e
            if (r0 != 0) goto L_0x0014
            com.google.knowledge.a.a.x r0 = com.google.knowledge.p4661a.p4662a.C61762x.f166835e
        L_0x0014:
            com.google.protobuf.bt r1 = com.google.protos.p4985f.p5023n.p5024a.p5025a.p5026a.C64965j.f175943d
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r0.mo58887l(r1)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r2 = r1.f169971d
            java.lang.Object r0 = r0.mo58854l(r2)
            if (r0 != 0) goto L_0x002a
            java.lang.Object r0 = r1.f169969b
            goto L_0x002e
        L_0x002a:
            java.lang.Object r0 = r1.mo58889c(r0)
        L_0x002e:
            com.google.protos.f.n.a.a.a.j r0 = (com.google.protos.p4985f.p5023n.p5024a.p5025a.p5026a.C64965j) r0
            com.google.protos.f.n.a.a.a.i r0 = r0.f175946b
            if (r0 != 0) goto L_0x0036
            com.google.protos.f.n.a.a.a.i r0 = com.google.protos.p4985f.p5023n.p5024a.p5025a.p5026a.C64964i.f175937d
        L_0x0036:
            int r0 = r0.f175939a
            r0 = r0 & 2
            if (r0 == 0) goto L_0x022d
            com.google.knowledge.a.a.x r0 = r10.f172102e
            if (r0 != 0) goto L_0x0042
            com.google.knowledge.a.a.x r0 = com.google.knowledge.p4661a.p4662a.C61762x.f166835e
        L_0x0042:
            com.google.protobuf.bt r1 = com.google.protos.p4985f.p5023n.p5024a.p5025a.p5026a.C64965j.f175943d
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r0.mo58887l(r1)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r2 = r1.f169971d
            java.lang.Object r0 = r0.mo58854l(r2)
            if (r0 != 0) goto L_0x0058
            java.lang.Object r0 = r1.f169969b
            goto L_0x005c
        L_0x0058:
            java.lang.Object r0 = r1.mo58889c(r0)
        L_0x005c:
            com.google.protos.f.n.a.a.a.j r0 = (com.google.protos.p4985f.p5023n.p5024a.p5025a.p5026a.C64965j) r0
            com.google.protos.f.n.a.a.a.i r0 = r0.f175946b
            if (r0 != 0) goto L_0x0064
            com.google.protos.f.n.a.a.a.i r0 = com.google.protos.p4985f.p5023n.p5024a.p5025a.p5026a.C64964i.f175937d
        L_0x0064:
            com.google.protos.f.n.a.a.a.e r0 = r0.f175941c
            if (r0 != 0) goto L_0x006a
            com.google.protos.f.n.a.a.a.e r0 = com.google.protos.p4985f.p5023n.p5024a.p5025a.p5026a.C64960e.f175922c
        L_0x006a:
            int r1 = r0.f175924a
            r2 = 4
            r3 = 1
            if (r1 != r3) goto L_0x00a1
            java.lang.Object r1 = r0.f175925b
            java.lang.String r1 = (java.lang.String) r1
            com.google.common.base.ax r1 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26610g(r1, r11)
            boolean r4 = r1.mo56113h()
            if (r4 == 0) goto L_0x00a1
            java.lang.Object r0 = r1.mo56107c()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            int r1 = r0.f136277e
            if (r1 != r2) goto L_0x008d
            java.lang.Object r0 = r0.f136278f
            com.google.assistant.e.c.c.co r0 = (com.google.assistant.p3897e.p3902c.p3907c.C50997co) r0
            goto L_0x008f
        L_0x008d:
            com.google.assistant.e.c.c.co r0 = com.google.assistant.p3897e.p3902c.p3907c.C50997co.f132759h
        L_0x008f:
            java.lang.String r0 = r0.f132764d
            com.google.knowledge.a.a.j r0 = com.google.android.libraries.assistant.assistantactions.p636e.C11271a.m26762f(r0)
            j$.util.Optional r0 = m26780j(r10, r0)
            java.lang.Object r0 = r0.orElse(r10)
            com.google.protos.an.r r0 = (com.google.protos.p4850an.C63634r) r0
            goto L_0x022e
        L_0x00a1:
            int r1 = r0.f175924a
            r4 = 3
            if (r1 != r4) goto L_0x022d
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
            j$.util.Optional r5 = p3186j$.util.Optional.empty()
            j$.util.Optional r6 = p3186j$.util.Optional.empty()
            int r7 = r0.f175924a
            if (r7 != r4) goto L_0x00bb
            java.lang.Object r7 = r0.f175925b
            com.google.protos.f.n.a.a.a.d r7 = (com.google.protos.p4985f.p5023n.p5024a.p5025a.p5026a.C64959d) r7
            goto L_0x00bd
        L_0x00bb:
            com.google.protos.f.n.a.a.a.d r7 = com.google.protos.p4985f.p5023n.p5024a.p5025a.p5026a.C64959d.f175916e
        L_0x00bd:
            int r7 = r7.f175918a
            r3 = r3 & r7
            r7 = 33
            if (r3 == 0) goto L_0x012c
            int r1 = r0.f175924a
            if (r1 != r4) goto L_0x00cd
            java.lang.Object r1 = r0.f175925b
            com.google.protos.f.n.a.a.a.d r1 = (com.google.protos.p4985f.p5023n.p5024a.p5025a.p5026a.C64959d) r1
            goto L_0x00cf
        L_0x00cd:
            com.google.protos.f.n.a.a.a.d r1 = com.google.protos.p4985f.p5023n.p5024a.p5025a.p5026a.C64959d.f175916e
        L_0x00cf:
            java.lang.String r1 = r1.f175919b
            com.google.common.base.ax r1 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26610g(r1, r11)
            boolean r3 = r1.mo56113h()
            if (r3 != 0) goto L_0x00e0
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
            goto L_0x012c
        L_0x00e0:
            java.lang.Object r3 = r1.mo56107c()
            com.google.assistant.e.j.e.eu r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r3
            int r3 = r3.f136277e
            if (r3 != r7) goto L_0x0128
            java.lang.Object r1 = r1.mo56107c()
            com.google.assistant.e.j.e.eu r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r1
            int r3 = r1.f136277e
            if (r3 != r7) goto L_0x00f9
            java.lang.Object r1 = r1.f136278f
            com.google.assistant.e.c.c.bd r1 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r1
            goto L_0x00fb
        L_0x00f9:
            com.google.assistant.e.c.c.bd r1 = com.google.assistant.p3897e.p3902c.p3907c.C50959bd.f132657e
        L_0x00fb:
            com.google.protobuf.cq r1 = r1.f132660b
            java.util.Iterator r1 = r1.iterator()
        L_0x0101:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0128
            java.lang.Object r3 = r1.next()
            com.google.assistant.e.c.c.az r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r3
            int r8 = r3.f132649i
            com.google.assistant.e.c.c.aw r8 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.m85988a(r8)
            if (r8 != 0) goto L_0x0117
            com.google.assistant.e.c.c.aw r8 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
        L_0x0117:
            com.google.assistant.e.c.c.aw r9 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.HIGHLIGHT
            if (r8 != r9) goto L_0x0101
            int r8 = r3.f132642b
            if (r8 != r4) goto L_0x0101
            java.lang.Object r1 = r3.f132643c
            com.google.assistant.e.j.qb r1 = (com.google.assistant.p3897e.p3921j.C52393qb) r1
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
            goto L_0x012c
        L_0x0128:
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
        L_0x012c:
            int r3 = r0.f175924a
            if (r3 != r4) goto L_0x0135
            java.lang.Object r8 = r0.f175925b
            com.google.protos.f.n.a.a.a.d r8 = (com.google.protos.p4985f.p5023n.p5024a.p5025a.p5026a.C64959d) r8
            goto L_0x0137
        L_0x0135:
            com.google.protos.f.n.a.a.a.d r8 = com.google.protos.p4985f.p5023n.p5024a.p5025a.p5026a.C64959d.f175916e
        L_0x0137:
            int r8 = r8.f175918a
            r8 = r8 & 2
            if (r8 == 0) goto L_0x01a3
            if (r3 != r4) goto L_0x0144
            java.lang.Object r3 = r0.f175925b
            com.google.protos.f.n.a.a.a.d r3 = (com.google.protos.p4985f.p5023n.p5024a.p5025a.p5026a.C64959d) r3
            goto L_0x0146
        L_0x0144:
            com.google.protos.f.n.a.a.a.d r3 = com.google.protos.p4985f.p5023n.p5024a.p5025a.p5026a.C64959d.f175916e
        L_0x0146:
            java.lang.String r3 = r3.f175920c
            com.google.common.base.ax r3 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26610g(r3, r11)
            boolean r5 = r3.mo56113h()
            if (r5 != 0) goto L_0x0157
            j$.util.Optional r5 = p3186j$.util.Optional.empty()
            goto L_0x01a3
        L_0x0157:
            java.lang.Object r5 = r3.mo56107c()
            com.google.assistant.e.j.e.eu r5 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r5
            int r5 = r5.f136277e
            if (r5 != r7) goto L_0x019f
            java.lang.Object r3 = r3.mo56107c()
            com.google.assistant.e.j.e.eu r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r3
            int r5 = r3.f136277e
            if (r5 != r7) goto L_0x0170
            java.lang.Object r3 = r3.f136278f
            com.google.assistant.e.c.c.bd r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r3
            goto L_0x0172
        L_0x0170:
            com.google.assistant.e.c.c.bd r3 = com.google.assistant.p3897e.p3902c.p3907c.C50959bd.f132657e
        L_0x0172:
            com.google.protobuf.cq r3 = r3.f132660b
            java.util.Iterator r3 = r3.iterator()
        L_0x0178:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x019f
            java.lang.Object r5 = r3.next()
            com.google.assistant.e.c.c.az r5 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r5
            int r8 = r5.f132649i
            com.google.assistant.e.c.c.aw r8 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.m85988a(r8)
            if (r8 != 0) goto L_0x018e
            com.google.assistant.e.c.c.aw r8 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
        L_0x018e:
            com.google.assistant.e.c.c.aw r9 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.HIGHLIGHT
            if (r8 != r9) goto L_0x0178
            int r8 = r5.f132642b
            if (r8 != r2) goto L_0x0178
            java.lang.Object r3 = r5.f132643c
            com.google.assistant.e.j.ql r3 = (com.google.assistant.p3897e.p3921j.C52403ql) r3
            j$.util.Optional r5 = p3186j$.util.Optional.m71637of(r3)
            goto L_0x01a3
        L_0x019f:
            j$.util.Optional r5 = p3186j$.util.Optional.empty()
        L_0x01a3:
            int r3 = r0.f175924a
            if (r3 != r4) goto L_0x01ac
            java.lang.Object r8 = r0.f175925b
            com.google.protos.f.n.a.a.a.d r8 = (com.google.protos.p4985f.p5023n.p5024a.p5025a.p5026a.C64959d) r8
            goto L_0x01ae
        L_0x01ac:
            com.google.protos.f.n.a.a.a.d r8 = com.google.protos.p4985f.p5023n.p5024a.p5025a.p5026a.C64959d.f175916e
        L_0x01ae:
            int r8 = r8.f175918a
            r2 = r2 & r8
            if (r2 == 0) goto L_0x021a
            if (r3 != r4) goto L_0x01ba
            java.lang.Object r0 = r0.f175925b
            com.google.protos.f.n.a.a.a.d r0 = (com.google.protos.p4985f.p5023n.p5024a.p5025a.p5026a.C64959d) r0
            goto L_0x01bc
        L_0x01ba:
            com.google.protos.f.n.a.a.a.d r0 = com.google.protos.p4985f.p5023n.p5024a.p5025a.p5026a.C64959d.f175916e
        L_0x01bc:
            java.lang.String r0 = r0.f175921d
            com.google.common.base.ax r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26610g(r0, r11)
            boolean r2 = r0.mo56113h()
            if (r2 != 0) goto L_0x01cd
            j$.util.Optional r6 = p3186j$.util.Optional.empty()
            goto L_0x021a
        L_0x01cd:
            java.lang.Object r2 = r0.mo56107c()
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            int r2 = r2.f136277e
            if (r2 != r7) goto L_0x0216
            java.lang.Object r0 = r0.mo56107c()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            int r2 = r0.f136277e
            if (r2 != r7) goto L_0x01e6
            java.lang.Object r0 = r0.f136278f
            com.google.assistant.e.c.c.bd r0 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r0
            goto L_0x01e8
        L_0x01e6:
            com.google.assistant.e.c.c.bd r0 = com.google.assistant.p3897e.p3902c.p3907c.C50959bd.f132657e
        L_0x01e8:
            com.google.protobuf.cq r0 = r0.f132660b
            java.util.Iterator r0 = r0.iterator()
        L_0x01ee:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0216
            java.lang.Object r2 = r0.next()
            com.google.assistant.e.c.c.az r2 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r2
            int r3 = r2.f132649i
            com.google.assistant.e.c.c.aw r3 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.m85988a(r3)
            if (r3 != 0) goto L_0x0204
            com.google.assistant.e.c.c.aw r3 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
        L_0x0204:
            com.google.assistant.e.c.c.aw r4 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.HIGHLIGHT
            if (r3 != r4) goto L_0x01ee
            int r3 = r2.f132642b
            r4 = 6
            if (r3 != r4) goto L_0x01ee
            java.lang.Object r0 = r2.f132643c
            com.google.assistant.e.j.qf r0 = (com.google.assistant.p3897e.p3921j.C52397qf) r0
            j$.util.Optional r6 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x021a
        L_0x0216:
            j$.util.Optional r6 = p3186j$.util.Optional.empty()
        L_0x021a:
            com.google.protos.an.b.d r0 = m26776f(r1, r5, r6)
            com.google.knowledge.a.a.j r0 = com.google.android.libraries.assistant.assistantactions.p636e.C11271a.m26757a(r0)
            j$.util.Optional r0 = m26780j(r10, r0)
            java.lang.Object r0 = r0.orElse(r10)
            com.google.protos.an.r r0 = (com.google.protos.p4850an.C63634r) r0
            goto L_0x022e
        L_0x022d:
            r0 = r10
        L_0x022e:
            int r1 = r10.f172099b
            r2 = 15
            if (r1 != r2) goto L_0x0239
            java.lang.Object r10 = r10.f172100c
            com.google.protos.an.x r10 = (com.google.protos.p4850an.C63640x) r10
            goto L_0x023b
        L_0x0239:
            com.google.protos.an.x r10 = com.google.protos.p4850an.C63640x.f172108b
        L_0x023b:
            com.google.protobuf.cq r1 = r10.f172110a
            int r1 = r1.size()
            if (r1 == 0) goto L_0x0286
            r1 = 0
            r3 = r10
        L_0x0245:
            com.google.protobuf.cq r4 = r10.f172110a
            int r4 = r4.size()
            if (r1 >= r4) goto L_0x026b
            com.google.protobuf.cq r4 = r10.f172110a
            java.lang.Object r4 = r4.get(r1)
            com.google.protos.an.r r4 = (com.google.protos.p4850an.C63634r) r4
            com.google.protos.an.r r4 = m26779i(r4, r11)
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.protos.an.w r3 = (com.google.protos.p4850an.C63639w) r3
            r3.mo59223a(r1, r4)
            com.google.protobuf.bv r3 = r3.build()
            com.google.protos.an.x r3 = (com.google.protos.p4850an.C63640x) r3
            int r1 = r1 + 1
            goto L_0x0245
        L_0x026b:
            com.google.protobuf.bn r10 = r0.toBuilder()
            com.google.protos.an.q r10 = (com.google.protos.p4850an.C63633q) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.protos.an.r r11 = (com.google.protos.p4850an.C63634r) r11
            r3.getClass()
            r11.f172100c = r3
            r11.f172099b = r2
            com.google.protobuf.bv r10 = r10.build()
            com.google.protos.an.r r10 = (com.google.protos.p4850an.C63634r) r10
            return r10
        L_0x0286:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.p636e.C11278h.m26779i(com.google.protos.an.r, com.google.assistant.e.j.e.ff):com.google.protos.an.r");
    }

    /* renamed from: j */
    private static Optional m26780j(C63634r rVar, C61748j jVar) {
        Object obj;
        C63349at atVar;
        C63349at atVar2;
        C61762x xVar = rVar.f172102e;
        if (xVar == null) {
            xVar = C61762x.f166835e;
        }
        C62940bt r1 = C62942bv.checkIsLite(C64965j.f175943d);
        xVar.mo58887l(r1);
        Object l = xVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        C64965j jVar2 = (C64965j) obj;
        C64964i iVar = jVar2.f175946b;
        if (iVar == null) {
            iVar = C64964i.f175937d;
        }
        C64963h a = C64963h.m96486a(iVar.f175940b);
        if (a == null) {
            a = C64963h.UNSPECIFIED;
        }
        if (!a.equals(C64963h.SET_FIELD)) {
            C59052c cVar = (C59052c) ((C59052c) f36698a.mo56226d()).mo56372aa(43310);
            C64964i iVar2 = jVar2.f175946b;
            if (iVar2 == null) {
                iVar2 = C64964i.f175937d;
            }
            C64963h a2 = C64963h.m96486a(iVar2.f175940b);
            if (a2 == null) {
                a2 = C64963h.UNSPECIFIED;
            }
            cVar.mo56389s("Unsupported operation: %s", a2);
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

    /* renamed from: k */
    private static Optional m26781k(C63634r rVar, C61748j jVar) {
        C63640x xVar;
        if (m26783m(rVar)) {
            return m26780j(rVar, jVar);
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
            Optional k = m26781k((C63634r) xVar.f172110a.get(i), jVar);
            if (k.isPresent()) {
                C63639w wVar = (C63639w) xVar.toBuilder();
                wVar.mo59223a(i, (C63634r) k.get());
                C63640x xVar2 = (C63640x) wVar.build();
                C63633q qVar = (C63633q) rVar.toBuilder();
                qVar.copyOnWrite();
                C63634r rVar2 = (C63634r) qVar.instance;
                xVar2.getClass();
                rVar2.f172100c = xVar2;
                rVar2.f172099b = 15;
                return Optional.m71637of((C63634r) qVar.build());
            }
        }
        return Optional.empty();
    }

    /* renamed from: l */
    private static final String m26782l(C52541vo voVar) {
        C52537vk vkVar = voVar.f137912c;
        if (vkVar == null) {
            vkVar = C52537vk.f137903c;
        }
        String str = vkVar.f137906b;
        String str2 = voVar.f137911b;
        return str + " " + str2;
    }

    /* renamed from: m */
    private static boolean m26783m(C63634r rVar) {
        Object obj;
        if ((rVar.f172098a & 65536) != 0) {
            C61762x xVar = rVar.f172102e;
            if (xVar == null) {
                xVar = C61762x.f166835e;
            }
            C62940bt r2 = C62942bv.checkIsLite(C64965j.f175943d);
            xVar.mo58887l(r2);
            if (xVar.f169962ag.mo58857o(r2.f169971d)) {
                C61762x xVar2 = rVar.f172102e;
                if (xVar2 == null) {
                    xVar2 = C61762x.f166835e;
                }
                C62940bt r0 = C62942bv.checkIsLite(C64965j.f175943d);
                xVar2.mo58887l(r0);
                Object l = xVar2.f169962ag.mo58854l(r0.f169971d);
                if (l == null) {
                    obj = r0.f169969b;
                } else {
                    obj = r0.mo58889c(l);
                }
                if ((((C64965j) obj).f175945a & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
