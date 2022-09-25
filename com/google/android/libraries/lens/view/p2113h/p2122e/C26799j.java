package com.google.android.libraries.lens.view.p2113h.p2122e;

import android.view.Surface;
import com.google.android.libraries.lens.view.p2056af.C25050av;
import com.google.android.libraries.lens.view.p2113h.p2114a.C26651l;
import com.google.android.libraries.lens.view.p2113h.p2114a.C26658s;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26749ar;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26878u;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60697zm;
import com.google.common.p4552o.aak;
import com.google.common.p4552o.aan;
import com.google.common.p4552o.aao;
import com.google.common.p4552o.aap;
import com.google.common.p4552o.aaq;
import com.google.common.p4552o.aar;
import com.google.common.p4552o.aas;
import com.google.common.p4552o.ack;
import com.google.lens.p4711m.C62632i;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.h.e.j */
/* compiled from: PG */
public final /* synthetic */ class C26799j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26784ai f73063a;

    public /* synthetic */ C26799j(C26784ai aiVar) {
        this.f73063a = aiVar;
    }

    public final void run() {
        C26784ai aiVar = this.f73063a;
        boolean z = false;
        aiVar.mo32156z(false);
        aiVar.mo32148A(false);
        aiVar.f73031w.mo31982l((C26778ac) null);
        aiVar.f72974B.mo33604t();
        aiVar.f72999aa = null;
        aiVar.f73014f = true;
        synchronized (aiVar.f73016h) {
            aiVar.f72987O = null;
            C26878u uVar = aiVar.f73017i;
            if (uVar != null) {
                boolean z2 = uVar.f73245g;
                uVar.f73244f.set(false);
                C26878u uVar2 = aiVar.f73017i;
                uVar2.getClass();
                uVar2.mo32245b();
                aiVar.f73017i = null;
                z = z2;
            } else {
                C26749ar arVar = aiVar.f73018j;
                if (arVar != null) {
                    for (Surface release : arVar.mo32081a()) {
                        release.release();
                    }
                }
            }
        }
        aiVar.f73018j = null;
        aiVar.f73031w.mo31985o(2);
        aiVar.f72989Q.mo33207b();
        aiVar.f73034z.mo31949a(aiVar.f73033y.mo31955a());
        C26651l lVar = aiVar.f73034z;
        List list = aiVar.f73032x.f72676l;
        ack d = aiVar.f72974B.mo33583d();
        aap aap = (aap) aaq.f158137g.createBuilder();
        long j = aiVar.f72992T;
        aap.copyOnWrite();
        aaq aaq = (aaq) aap.instance;
        aaq.f158139a |= 1;
        aaq.f158140b = j / 1000;
        long j2 = aiVar.f72993U;
        aap.copyOnWrite();
        aaq aaq2 = (aaq) aap.instance;
        aaq2.f158139a |= 8;
        aaq2.f158143e = j2 / 1000;
        long j3 = aiVar.f72994V;
        aap.copyOnWrite();
        aaq aaq3 = (aaq) aap.instance;
        aaq3.f158139a |= 16;
        aaq3.f158144f = j3 / 1000;
        long j4 = aiVar.f72995W;
        aap.copyOnWrite();
        aaq aaq4 = (aaq) aap.instance;
        aaq4.f158139a |= 2;
        aaq4.f158141c = j4 / 1000;
        long j5 = aiVar.f72996X;
        aap.copyOnWrite();
        aaq aaq5 = (aaq) aap.instance;
        aaq5.f158139a |= 4;
        aaq5.f158142d = j5 / 1000;
        aaq aaq6 = (aaq) aap.build();
        aan aan = (aan) aao.f158126j.createBuilder();
        aak aak = lVar.f72661e;
        if (aak != null) {
            aan.copyOnWrite();
            aao aao = (aao) aan.instance;
            aao.f158129b = aak;
            aao.f158128a = 1 | aao.f158128a;
        }
        aan.copyOnWrite();
        aao aao2 = (aao) aan.instance;
        d.getClass();
        aao2.f158132e = d;
        aao2.f158128a |= 2;
        List list2 = lVar.f72657a;
        aan.copyOnWrite();
        aao aao3 = (aao) aan.instance;
        C62971cq cqVar = aao3.f158130c;
        if (!cqVar.mo58948c()) {
            aao3.f158130c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list2, (List) aao3.f158130c);
        List list3 = lVar.f72658b;
        aan.copyOnWrite();
        aao aao4 = (aao) aan.instance;
        C62971cq cqVar2 = aao4.f158131d;
        if (!cqVar2.mo58948c()) {
            aao4.f158131d = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) list3, (List) aao4.f158131d);
        aan.copyOnWrite();
        aao aao5 = (aao) aan.instance;
        C62971cq cqVar3 = aao5.f158133f;
        if (!cqVar3.mo58948c()) {
            aao5.f158133f = C62942bv.mutableCopy(cqVar3);
        }
        C62947c.addAll((Iterable) list, (List) aao5.f158133f);
        aan.copyOnWrite();
        aao aao6 = (aao) aan.instance;
        aao6.f158134g = ((C60697zm) lVar.f72659c.mo17428b()).f164687e;
        aao6.f158128a |= 4;
        aan.copyOnWrite();
        aao aao7 = (aao) aan.instance;
        aaq6.getClass();
        aao7.f158135h = aaq6;
        aao7.f158128a |= 8;
        int number = C62632i.m94816a((String) lVar.f72660d.mo32701h().mo56111f()).getNumber();
        aan.copyOnWrite();
        aao aao8 = (aao) aan.instance;
        aao8.f158128a |= 16;
        aao8.f158136i = number;
        C26658s sVar = lVar.f72662f;
        aao aao9 = (aao) aan.build();
        C25050av avVar = sVar.f72688a;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a = 2 | ufVar.f164093a;
        ufVar.f164258m = 1357;
        aar aar = (aar) aas.f158145p.createBuilder();
        aar.copyOnWrite();
        aas aas = (aas) aar.instance;
        aao9.getClass();
        aas.f158154h = aao9;
        aas.f158147a |= 8192;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        aas aas2 = (aas) aar.build();
        aas2.getClass();
        ufVar2.f164197by = aas2;
        ufVar2.f164253h |= 8;
        avVar.mo30241a((C60555uf) tzVar.build());
        C26784ai.m49585w(aiVar.f72980H, new C26775a(aiVar, z));
    }
}
