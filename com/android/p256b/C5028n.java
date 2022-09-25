package com.android.p256b;

/* renamed from: com.android.b.n */
/* compiled from: PG */
final class C5028n extends C5032r {
    /* renamed from: a */
    public final int mo9969a(String str, C5033s sVar) {
        Integer num = (Integer) C5033s.f15885a.get(str);
        if (num != null) {
            sVar.f15889d = num.intValue();
            return 1;
        }
        throw new C5017c("Invalid FREQ value: ".concat(String.valueOf(str)));
    }
}
