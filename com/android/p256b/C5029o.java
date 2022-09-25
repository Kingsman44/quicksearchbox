package com.android.p256b;

import android.support.p033v7.widget.LinearLayoutManager;
import android.util.Log;

/* renamed from: com.android.b.o */
/* compiled from: PG */
final class C5029o extends C5032r {
    /* renamed from: a */
    public final int mo9969a(String str, C5033s sVar) {
        int b = m13823b(str, LinearLayoutManager.INVALID_OFFSET, Integer.MAX_VALUE, true);
        sVar.f15892g = b;
        if (b > 0) {
            return 8;
        }
        Log.d("EventRecur", "Invalid Interval. Forcing INTERVAL to 1 from ".concat(String.valueOf(str)));
        sVar.f15892g = 1;
        return 8;
    }
}
