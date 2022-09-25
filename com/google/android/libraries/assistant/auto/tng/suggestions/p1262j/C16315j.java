package com.google.android.libraries.assistant.auto.tng.suggestions.p1262j;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.auto.p450a.p451a.C8856aa;
import com.google.android.apps.auto.p450a.p451a.C8857ab;
import com.google.android.apps.auto.p450a.p451a.C8864ai;
import com.google.android.apps.auto.p450a.p451a.C8865aj;
import com.google.android.apps.auto.p450a.p451a.C8866ak;
import com.google.android.apps.auto.p450a.p451a.C8867al;
import com.google.android.apps.auto.p450a.p451a.C8878aw;
import com.google.android.apps.auto.p450a.p451a.C8879ax;
import com.google.android.apps.auto.p450a.p451a.C8880ay;
import com.google.android.apps.auto.p450a.p451a.C8881az;
import com.google.android.apps.auto.p450a.p451a.C8932y;
import com.google.android.apps.auto.p450a.p451a.C8933z;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11706c;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11707d;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16344ar;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16349aw;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3994s.p3995a.C53435nu;
import com.google.assistant.p3994s.p3995a.C53437nw;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protos.p5124m.p5125a.C65599b;
import java.util.HashMap;
import p3186j$.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.j.j */
/* compiled from: PG */
public final /* synthetic */ class C16315j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C16325t f48003a;

    /* renamed from: b */
    public final /* synthetic */ Consumer f48004b;

    public /* synthetic */ C16315j(C16325t tVar, Consumer consumer) {
        this.f48003a = tVar;
        this.f48004b = consumer;
    }

    public final Object apply(Object obj) {
        String str;
        String str2;
        C16325t tVar = this.f48003a;
        Consumer consumer = this.f48004b;
        C16349aw awVar = (C16349aw) obj;
        if (awVar.f48129b.isEmpty()) {
            return null;
        }
        awVar.f48129b.size();
        C11706c cVar = (C11706c) C11707d.f37728c.createBuilder();
        HashMap hashMap = new HashMap();
        C62961ch chVar = ((C65599b) tVar.f48026f.mo17428b()).f178301a;
        for (C16344ar arVar : awVar.f48129b) {
            int i = arVar.f48116a;
            if ((i & 4) != 0 && arVar.f48119d) {
                C53435nu nuVar = arVar.f48117b;
                if (nuVar == null) {
                    nuVar = C53435nu.f140233n;
                }
                String str3 = nuVar.f140239d;
                cVar.copyOnWrite();
                C11707d dVar = (C11707d) cVar.instance;
                str3.getClass();
                C62971cq cqVar = dVar.f37730a;
                if (!cqVar.mo58948c()) {
                    dVar.f37730a = C62942bv.mutableCopy(cqVar);
                }
                dVar.f37730a.add(str3);
            } else if ((i & 1) != 0) {
                C53435nu nuVar2 = arVar.f48117b;
                if (nuVar2 == null) {
                    nuVar2 = C53435nu.f140233n;
                }
                C53437nw nwVar = nuVar2.f140247l;
                if (nwVar == null) {
                    nwVar = C53437nw.f140250i;
                }
                boolean contains = chVar.contains(Integer.valueOf(nwVar.f140258g));
                C53435nu nuVar3 = arVar.f48117b;
                if (nuVar3 == null) {
                    nuVar3 = C53435nu.f140233n;
                }
                boolean z = (nuVar3.f140236a & 8) != 0 && nuVar3.f140242g.startsWith("IsAction:");
                C8856aa aaVar = (C8856aa) Map.EL.computeIfAbsent(hashMap, z ? nuVar3.f140242g.split("IsAction:", 2)[1] : nuVar3.f140240e, C16311f.f47999a);
                if (z) {
                    C8879ax axVar = ((C8857ab) aaVar.instance).f30770c;
                    if (axVar == null) {
                        axVar = C8879ax.f30820i;
                    }
                    C8878aw awVar2 = (C8878aw) axVar.toBuilder();
                    C8866ak akVar = (C8866ak) C8867al.f30797e.createBuilder();
                    C8932y yVar = (C8932y) C8933z.f30971e.createBuilder();
                    String str4 = nuVar3.f140239d;
                    yVar.copyOnWrite();
                    C8933z zVar = (C8933z) yVar.instance;
                    str4.getClass();
                    zVar.f30973a |= 1;
                    zVar.f30974b = str4;
                    yVar.copyOnWrite();
                    C8933z zVar2 = (C8933z) yVar.instance;
                    zVar2.f30973a |= 2;
                    zVar2.f30975c = contains;
                    boolean z2 = nuVar3.f140237b == 7;
                    yVar.copyOnWrite();
                    C8933z zVar3 = (C8933z) yVar.instance;
                    zVar3.f30973a |= 8;
                    zVar3.f30976d = z2;
                    akVar.copyOnWrite();
                    C8867al alVar = (C8867al) akVar.instance;
                    C8933z zVar4 = (C8933z) yVar.build();
                    zVar4.getClass();
                    alVar.f30802d = zVar4;
                    alVar.f30799a |= 4;
                    if ((nuVar3.f140236a & 2) != 0) {
                        String str5 = nuVar3.f140240e;
                        akVar.copyOnWrite();
                        C8867al alVar2 = (C8867al) akVar.instance;
                        str5.getClass();
                        alVar2.f30799a |= 1;
                        alVar2.f30800b = str5;
                    }
                    C51012dc dcVar = nuVar3.f140244i;
                    if (dcVar == null) {
                        dcVar = C51012dc.f132813k;
                    }
                    if ((dcVar.f132815a & 2) != 0) {
                        C8864ai aiVar = (C8864ai) C8865aj.f30788h.createBuilder();
                        C51012dc dcVar2 = nuVar3.f140244i;
                        if (dcVar2 == null) {
                            dcVar2 = C51012dc.f132813k;
                        }
                        String str6 = dcVar2.f132817c;
                        aiVar.copyOnWrite();
                        C8865aj ajVar = (C8865aj) aiVar.instance;
                        str6.getClass();
                        ajVar.f30790a = 1 | ajVar.f30790a;
                        ajVar.f30791b = str6;
                        akVar.copyOnWrite();
                        C8867al alVar3 = (C8867al) akVar.instance;
                        C8865aj ajVar2 = (C8865aj) aiVar.build();
                        ajVar2.getClass();
                        alVar3.f30801c = ajVar2;
                        alVar3.f30799a |= 2;
                    }
                    C8867al alVar4 = (C8867al) akVar.build();
                    awVar2.copyOnWrite();
                    C8879ax axVar2 = (C8879ax) awVar2.instance;
                    alVar4.getClass();
                    C62971cq cqVar2 = axVar2.f30829h;
                    if (!cqVar2.mo58948c()) {
                        axVar2.f30829h = C62942bv.mutableCopy(cqVar2);
                    }
                    axVar2.f30829h.add(alVar4);
                    aaVar.copyOnWrite();
                    C8857ab abVar = (C8857ab) aaVar.instance;
                    C8879ax axVar3 = (C8879ax) awVar2.build();
                    axVar3.getClass();
                    abVar.f30770c = axVar3;
                    abVar.f30768a |= 4;
                } else {
                    String str7 = nuVar3.f140239d;
                    aaVar.copyOnWrite();
                    C8857ab abVar2 = (C8857ab) aaVar.instance;
                    C8857ab abVar3 = C8857ab.f30766e;
                    str7.getClass();
                    abVar2.f30768a |= 1;
                    abVar2.f30769b = str7;
                    C53437nw nwVar2 = nuVar3.f140247l;
                    if (nwVar2 == null) {
                        nwVar2 = C53437nw.f140250i;
                    }
                    int i2 = nwVar2.f140258g;
                    aaVar.copyOnWrite();
                    C8857ab abVar4 = (C8857ab) aaVar.instance;
                    abVar4.f30768a |= 16;
                    abVar4.f30771d = i2;
                    C8879ax axVar4 = abVar4.f30770c;
                    if (axVar4 == null) {
                        axVar4 = C8879ax.f30820i;
                    }
                    C8878aw awVar3 = (C8878aw) axVar4.toBuilder();
                    if ((nuVar3.f140236a & 2) != 0) {
                        String str8 = nuVar3.f140240e;
                        awVar3.copyOnWrite();
                        C8879ax axVar5 = (C8879ax) awVar3.instance;
                        str8.getClass();
                        axVar5.f30822a |= 1;
                        axVar5.f30823b = str8;
                        C8880ay ayVar = (C8880ay) C8881az.f30830c.createBuilder();
                        ayVar.mo17270a(nuVar3.f140240e);
                        awVar3.copyOnWrite();
                        C8879ax axVar6 = (C8879ax) awVar3.instance;
                        C8881az azVar = (C8881az) ayVar.build();
                        azVar.getClass();
                        axVar6.f30826e = azVar;
                        axVar6.f30822a |= 8;
                    }
                    C8880ay ayVar2 = (C8880ay) C8881az.f30830c.createBuilder();
                    if ((nuVar3.f140236a & 8) != 0) {
                        String str9 = nuVar3.f140242g;
                        awVar3.copyOnWrite();
                        C8879ax axVar7 = (C8879ax) awVar3.instance;
                        str9.getClass();
                        axVar7.f30822a |= 2;
                        axVar7.f30824c = str9;
                        ayVar2.mo17270a(nuVar3.f140242g);
                    }
                    int i3 = nuVar3.f140236a & 64;
                    String str10 = BuildConfig.FLAVOR;
                    if (i3 != 0) {
                        C51012dc dcVar3 = nuVar3.f140245j;
                        if (dcVar3 == null) {
                            dcVar3 = C51012dc.f132813k;
                        }
                        str = dcVar3.f132817c;
                    } else {
                        str = str10;
                    }
                    if (!str.isEmpty()) {
                        C8864ai aiVar2 = (C8864ai) C8865aj.f30788h.createBuilder();
                        aiVar2.copyOnWrite();
                        C8865aj ajVar3 = (C8865aj) aiVar2.instance;
                        str.getClass();
                        ajVar3.f30790a |= 1;
                        ajVar3.f30791b = str;
                        ayVar2.copyOnWrite();
                        C8881az azVar2 = (C8881az) ayVar2.instance;
                        C8865aj ajVar4 = (C8865aj) aiVar2.build();
                        ajVar4.getClass();
                        C62971cq cqVar3 = azVar2.f30833b;
                        if (!cqVar3.mo58948c()) {
                            azVar2.f30833b = C62942bv.mutableCopy(cqVar3);
                        }
                        azVar2.f30833b.add(ajVar4);
                    }
                    awVar3.copyOnWrite();
                    C8879ax axVar8 = (C8879ax) awVar3.instance;
                    C8881az azVar3 = (C8881az) ayVar2.build();
                    azVar3.getClass();
                    axVar8.f30827f = azVar3;
                    axVar8.f30822a |= 16;
                    C51012dc dcVar4 = nuVar3.f140245j;
                    if (dcVar4 == null) {
                        dcVar4 = C51012dc.f132813k;
                    }
                    C51012dc dcVar5 = dcVar4.f132823i;
                    if (dcVar5 == null) {
                        dcVar5 = C51012dc.f132813k;
                    }
                    String str11 = dcVar5.f132821g;
                    if ((nuVar3.f140236a & 32) != 0) {
                        C51012dc dcVar6 = nuVar3.f140244i;
                        if (dcVar6 == null) {
                            dcVar6 = C51012dc.f132813k;
                        }
                        str2 = dcVar6.f132817c;
                    } else {
                        str2 = str10;
                    }
                    if (true == str2.startsWith("<")) {
                        str2 = str10;
                    }
                    if (str2.isEmpty()) {
                        str10 = nuVar3.f140240e;
                    }
                    if (!str2.isEmpty() || !str11.isEmpty()) {
                        C8864ai aiVar3 = (C8864ai) C8865aj.f30788h.createBuilder();
                        aiVar3.copyOnWrite();
                        C8865aj ajVar5 = (C8865aj) aiVar3.instance;
                        str2.getClass();
                        ajVar5.f30790a |= 1;
                        ajVar5.f30791b = str2;
                        boolean contains2 = str2.contains("com.google.android.googlequicksearchbox/drawable/");
                        aiVar3.copyOnWrite();
                        C8865aj ajVar6 = (C8865aj) aiVar3.instance;
                        ajVar6.f30790a |= 16;
                        ajVar6.f30795f = !contains2;
                        aiVar3.copyOnWrite();
                        C8865aj ajVar7 = (C8865aj) aiVar3.instance;
                        str11.getClass();
                        ajVar7.f30790a |= 4;
                        ajVar7.f30793d = str11;
                        aiVar3.copyOnWrite();
                        C8865aj ajVar8 = (C8865aj) aiVar3.instance;
                        str10.getClass();
                        ajVar8.f30790a |= 32;
                        ajVar8.f30796g = str10;
                        awVar3.copyOnWrite();
                        C8879ax axVar9 = (C8879ax) awVar3.instance;
                        C8865aj ajVar9 = (C8865aj) aiVar3.build();
                        ajVar9.getClass();
                        axVar9.f30825d = ajVar9;
                        axVar9.f30822a |= 4;
                    }
                    C8879ax axVar10 = (C8879ax) awVar3.build();
                    aaVar.copyOnWrite();
                    C8857ab abVar5 = (C8857ab) aaVar.instance;
                    axVar10.getClass();
                    abVar5.f30770c = axVar10;
                    abVar5.f30768a |= 4;
                }
            }
        }
        for (C8856aa aaVar2 : hashMap.values()) {
            if (!((C8857ab) aaVar2.instance).f30769b.isEmpty()) {
                C8879ax axVar11 = ((C8857ab) aaVar2.instance).f30770c;
                if (axVar11 == null) {
                    axVar11 = C8879ax.f30820i;
                }
                String str12 = axVar11.f30823b;
                cVar.copyOnWrite();
                C11707d dVar2 = (C11707d) cVar.instance;
                C8857ab abVar6 = (C8857ab) aaVar2.build();
                abVar6.getClass();
                C62971cq cqVar4 = dVar2.f37731b;
                if (!cqVar4.mo58948c()) {
                    dVar2.f37731b = C62942bv.mutableCopy(cqVar4);
                }
                dVar2.f37731b.add(abVar6);
            }
        }
        consumer.accept((C11707d) cVar.build());
        return null;
    }
}
