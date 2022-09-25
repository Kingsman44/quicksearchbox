package com.google.android.apps.gsa.staticplugins.searchwidget.p8755b;

import com.google.common.p4552o.C60514ss;
import com.google.common.p4552o.C60516su;
import com.google.common.p4552o.C60519sx;
import com.google.common.p4552o.C60520sy;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.b.m */
/* compiled from: PG */
public final /* synthetic */ class C117225m {
    /* renamed from: a */
    public static C60520sy m194791a(C117226n nVar) {
        C60514ss ssVar = (C60514ss) C60520sy.f163836e.createBuilder();
        ssVar.copyOnWrite();
        C60520sy syVar = (C60520sy) ssVar.instance;
        syVar.f163839b = 0;
        syVar.f163838a |= 1;
        if (nVar.mo103200d()) {
            ssVar.copyOnWrite();
            C60520sy syVar2 = (C60520sy) ssVar.instance;
            syVar2.f163839b = 1;
            syVar2.f163838a |= 1;
            List<C60516su> a = nVar.mo103197a();
            ssVar.copyOnWrite();
            C60520sy syVar3 = (C60520sy) ssVar.instance;
            C62961ch chVar = syVar3.f163840c;
            if (!chVar.mo58948c()) {
                syVar3.f163840c = C62942bv.mutableCopy(chVar);
            }
            for (C60516su suVar : a) {
                syVar3.f163840c.mo58916g(suVar.f163823f);
            }
        } else if (nVar.mo103199c()) {
            ssVar.copyOnWrite();
            C60520sy syVar4 = (C60520sy) ssVar.instance;
            syVar4.f163839b = 2;
            syVar4.f163838a |= 1;
        } else if (nVar.mo103201e()) {
            ssVar.copyOnWrite();
            C60520sy syVar5 = (C60520sy) ssVar.instance;
            syVar5.f163839b = 3;
            syVar5.f163838a |= 1;
            List<C60519sx> b = nVar.mo103198b();
            ssVar.copyOnWrite();
            C60520sy syVar6 = (C60520sy) ssVar.instance;
            C62961ch chVar2 = syVar6.f163841d;
            if (!chVar2.mo58948c()) {
                syVar6.f163841d = C62942bv.mutableCopy(chVar2);
            }
            for (C60519sx sxVar : b) {
                syVar6.f163841d.mo58916g(sxVar.f163835i);
            }
        }
        return (C60520sy) ssVar.build();
    }
}
