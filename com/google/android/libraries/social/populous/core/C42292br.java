package com.google.android.libraries.social.populous.core;

import com.google.common.base.C58881cr;

/* renamed from: com.google.android.libraries.social.populous.core.br */
/* compiled from: PG */
public final /* synthetic */ class C42292br implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ Experiments f110918a;

    public /* synthetic */ C42292br(Experiments experiments) {
        this.f110918a = experiments;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C42265ar arVar = this.f110918a.f110773a;
        int cardinality = arVar.f110851a.cardinality();
        int[] iArr = new int[cardinality];
        int nextSetBit = arVar.f110851a.nextSetBit(0);
        for (int i = 0; i < cardinality; i++) {
            if (nextSetBit != -1) {
                iArr[i] = nextSetBit;
            }
            nextSetBit = arVar.f110851a.nextSetBit(nextSetBit + 1);
        }
        C42295bu[] buVarArr = (C42295bu[]) C42295bu.f110920a.toArray(new C42295bu[0]);
        String[] strArr = new String[cardinality];
        for (int i2 = 0; i2 < cardinality; i2++) {
            strArr[i2] = buVarArr[iArr[i2]].f110924e;
        }
        return strArr;
    }
}
