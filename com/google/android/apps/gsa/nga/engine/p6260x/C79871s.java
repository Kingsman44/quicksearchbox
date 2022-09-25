package com.google.android.apps.gsa.nga.engine.p6260x;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82863df;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82864dg;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.common.p4552o.aeq;
import com.google.common.p4552o.aer;
import com.google.common.p4552o.aes;
import com.google.common.p4552o.aew;
import com.google.common.p4552o.agx;
import com.google.speech.p5218j.p5219a.C66722az;
import java.util.List;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.s */
/* compiled from: PG */
public final /* synthetic */ class C79871s implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ List f218936a;

    /* renamed from: b */
    public final /* synthetic */ C66722az f218937b;

    public /* synthetic */ C79871s(List list, C66722az azVar) {
        this.f218936a = list;
        this.f218937b = azVar;
    }

    public final Object get() {
        List list = this.f218936a;
        C66722az azVar = this.f218937b;
        C79877y yVar = C79878z.f218943a;
        aeq aeq = (aeq) aew.f158493e.createBuilder();
        int i = 0;
        while (true) {
            int i2 = 2;
            if (i < list.size()) {
                aer aer = (aer) aes.f158479g.createBuilder();
                String str = (String) list.get(i);
                aer.copyOnWrite();
                aes aes = (aes) aer.instance;
                str.getClass();
                aes.f158481a |= 1;
                aes.f158482b = str;
                if (i == 0) {
                    i = 0;
                } else {
                    i2 = 3;
                }
                aer.copyOnWrite();
                aes aes2 = (aes) aer.instance;
                aes2.f158483c = i2 - 1;
                aes2.f158481a |= 4;
                i++;
                aer.copyOnWrite();
                aes aes3 = (aes) aer.instance;
                aes3.f158481a |= 8;
                aes3.f158484d = i;
                aeq.mo56982a((aes) aer.build());
            } else {
                agx d = C79878z.m128029d(azVar);
                aeq.copyOnWrite();
                aew aew = (aew) aeq.instance;
                d.getClass();
                aew.f158498d = d;
                aew.f158495a |= 2;
                aeq.copyOnWrite();
                aew aew2 = (aew) aeq.instance;
                aew2.f158497c = 1;
                aew2.f158495a |= 1;
                C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
                C82863df dfVar = (C82863df) C82864dg.f225947c.createBuilder();
                aew aew3 = (aew) aeq.build();
                dfVar.copyOnWrite();
                C82864dg dgVar = (C82864dg) dfVar.instance;
                aew3.getClass();
                dgVar.f225950b = aew3;
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
    }
}
