package com.android.p256b;

/* renamed from: com.android.b.q */
/* compiled from: PG */
final class C5031q extends C5032r {
    /* renamed from: a */
    public final int mo9969a(String str, C5033s sVar) {
        Integer num = (Integer) C5033s.f15886b.get(str);
        if (num != null) {
            sVar.f15893h = num.intValue();
            return 8192;
        }
        throw new C5017c("Invalid WKST value: ".concat(String.valueOf(str)));
    }
}
