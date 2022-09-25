package com.google.android.apps.gsa.nga.engine.p6260x;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82863df;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82864dg;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.common.p4552o.aeq;
import com.google.common.p4552o.aer;
import com.google.common.p4552o.aes;
import com.google.common.p4552o.aet;
import com.google.common.p4552o.aeu;
import com.google.common.p4552o.aew;
import com.google.common.p4552o.agx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C62971cq;
import com.google.speech.p5218j.p5219a.C66722az;
import com.google.speech.p5218j.p5220b.p5221a.C66810n;
import com.google.speech.p5218j.p5220b.p5221a.C66812p;
import com.google.speech.p5218j.p5220b.p5221a.C66814r;
import com.google.speech.p5218j.p5220b.p5221a.C66818v;
import com.google.speech.p5218j.p5220b.p5221a.C66820x;
import com.google.speech.p5218j.p5220b.p5221a.C66821y;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.u */
/* compiled from: PG */
public final /* synthetic */ class C79873u implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C66821y f218939a;

    /* renamed from: b */
    public final /* synthetic */ C66722az f218940b;

    public /* synthetic */ C79873u(C66821y yVar, C66722az azVar) {
        this.f218939a = yVar;
        this.f218940b = azVar;
    }

    public final Object get() {
        C66821y yVar = this.f218939a;
        C66722az azVar = this.f218940b;
        C79877y yVar2 = C79878z.f218943a;
        aeq aeq = (aeq) aew.f158493e.createBuilder();
        for (C66818v vVar : yVar.f181711a) {
            aer aer = (aer) aes.f158479g.createBuilder();
            String str = vVar.f181698a;
            aer.copyOnWrite();
            aes aes = (aes) aer.instance;
            str.getClass();
            aes.f158481a |= 1;
            aes.f158482b = str;
            int a = C66812p.m97353a(vVar.f181699b);
            if (a == 0) {
                a = 1;
            }
            aer.copyOnWrite();
            aes aes2 = (aes) aer.instance;
            aes2.f158483c = a - 1;
            aes2.f158481a |= 4;
            int i = vVar.f181700c;
            aer.copyOnWrite();
            aes aes3 = (aes) aer.instance;
            aes3.f158481a |= 8;
            aes3.f158484d = i;
            C62963cj<C66814r> cjVar = new C62963cj(vVar.f181701d, C66818v.f181695e);
            aer.copyOnWrite();
            aes aes4 = (aes) aer.instance;
            C62961ch chVar = aes4.f158485e;
            if (!chVar.mo58948c()) {
                aes4.f158485e = C62942bv.mutableCopy(chVar);
            }
            for (C66814r rVar : cjVar) {
                aes4.f158485e.mo58916g(rVar.f181694m);
            }
            for (C66820x xVar : vVar.f181702f) {
                aet aet = (aet) aeu.f158487d.createBuilder();
                int a2 = C66810n.m97352a(xVar.f181706a);
                if (a2 == 0) {
                    a2 = 1;
                }
                aet.copyOnWrite();
                aeu aeu = (aeu) aet.instance;
                aeu.f158490b = a2 - 1;
                aeu.f158489a |= 2;
                double d = xVar.f181707b;
                aet.copyOnWrite();
                aeu aeu2 = (aeu) aet.instance;
                aeu2.f158489a |= 4;
                aeu2.f158491c = d;
                aeu aeu3 = (aeu) aet.build();
                aer.copyOnWrite();
                aes aes5 = (aes) aer.instance;
                aeu3.getClass();
                C62971cq cqVar = aes5.f158486f;
                if (!cqVar.mo58948c()) {
                    aes5.f158486f = C62942bv.mutableCopy(cqVar);
                }
                aes5.f158486f.add(aeu3);
            }
            aeq.mo56982a((aes) aer.build());
        }
        agx d2 = C79878z.m128029d(azVar);
        aeq.copyOnWrite();
        aew aew = (aew) aeq.instance;
        d2.getClass();
        aew.f158498d = d2;
        aew.f158495a |= 2;
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        C82863df dfVar = (C82863df) C82864dg.f225947c.createBuilder();
        aew aew2 = (aew) aeq.build();
        dfVar.copyOnWrite();
        C82864dg dgVar = (C82864dg) dfVar.instance;
        aew2.getClass();
        dgVar.f225950b = aew2;
        dgVar.f225949a |= 1;
        C82864dg dgVar2 = (C82864dg) dfVar.build();
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        dgVar2.getClass();
        eaVar.f225980b = dgVar2;
        eaVar.f225979a = 15;
        return (C82885ea) dzVar.build();
    }
}
