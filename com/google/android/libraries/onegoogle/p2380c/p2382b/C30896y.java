package com.google.android.libraries.onegoogle.p2380c.p2382b;

import com.google.android.libraries.logging.p2185ve.C28441k;
import com.google.common.p4552o.aic;
import com.google.common.p4552o.aid;
import com.google.common.p4552o.aii;
import com.google.common.p4552o.aij;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.libraries.onegoogle.c.b.y */
/* compiled from: PG */
public final class C30896y {
    /* renamed from: a */
    public static C28441k m57669a(int i) {
        C62940bt btVar = C30891t.f83296b;
        C30892u uVar = (C30892u) C30893v.f83297c.createBuilder();
        aii aii = (aii) aij.f158815c.createBuilder();
        aic aic = (aic) aid.f158801c.createBuilder();
        aic.copyOnWrite();
        aid aid = (aid) aic.instance;
        int i2 = i - 1;
        if (i != 0) {
            aid.f158804b = i2;
            aid.f158803a |= 2;
            aii.copyOnWrite();
            aij aij = (aij) aii.instance;
            aid aid2 = (aid) aic.build();
            aid2.getClass();
            aij.f158819b = aid2;
            aij.f158818a |= 1;
            uVar.copyOnWrite();
            C30893v vVar = (C30893v) uVar.instance;
            aij aij2 = (aij) aii.build();
            aij2.getClass();
            vVar.f83300b = aij2;
            vVar.f83299a |= 1;
            return new C28441k(btVar, (C30893v) uVar.build());
        }
        throw null;
    }
}
