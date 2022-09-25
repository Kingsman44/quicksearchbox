package com.android.p275j.p276a;

import android.content.Context;
import com.android.p275j.C5193e;
import com.android.p275j.C5200l;
import com.android.p275j.C5209u;

/* renamed from: com.android.j.a.p */
/* compiled from: PG */
public final class C5186p {
    /* renamed from: a */
    public static C5209u m14143a(Context context) {
        C5209u uVar = new C5209u(new C5177g(new C5185o(context.getApplicationContext())), new C5172b(new C5181k((byte[]) null)));
        C5193e eVar = uVar.f16532g;
        if (eVar != null) {
            eVar.mo10281a();
        }
        C5200l[] lVarArr = uVar.f16531f;
        for (int i = 0; i < 4; i++) {
            C5200l lVar = lVarArr[i];
            if (lVar != null) {
                lVar.f16500a = true;
                lVar.interrupt();
            }
        }
        uVar.f16532g = new C5193e(uVar.f16528c, uVar.f16529d, uVar.f16530e, uVar.f16534i);
        uVar.f16532g.start();
        for (int i2 = 0; i2 < 4; i2++) {
            C5200l lVar2 = new C5200l(uVar.f16529d, uVar.f16535j, uVar.f16530e, uVar.f16534i);
            uVar.f16531f[i2] = lVar2;
            lVar2.start();
        }
        return uVar;
    }
}
