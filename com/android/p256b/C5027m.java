package com.android.p256b;

import android.support.p033v7.widget.LinearLayoutManager;
import android.util.Log;

/* renamed from: com.android.b.m */
/* compiled from: PG */
final class C5027m extends C5032r {
    /* renamed from: a */
    public final int mo9969a(String str, C5033s sVar) {
        int b = m13823b(str, LinearLayoutManager.INVALID_OFFSET, Integer.MAX_VALUE, true);
        sVar.f15891f = b;
        if (b >= 0) {
            return 4;
        }
        Log.d("EventRecur", "Invalid Count. Forcing COUNT to 1 from ".concat(String.valueOf(str)));
        sVar.f15891f = 1;
        return 4;
    }
}
