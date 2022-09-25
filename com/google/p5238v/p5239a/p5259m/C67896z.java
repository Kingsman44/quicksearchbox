package com.google.p5238v.p5239a.p5259m;

/* renamed from: com.google.v.a.m.z */
/* compiled from: PG */
final class C67896z extends C67895y {

    /* renamed from: d */
    private final long[] f184073d;

    C67896z() {
        super(new long[10], new long[10], new long[10]);
        this.f184073d = new long[10];
    }

    /* renamed from: b */
    public final void mo60030b(long[] jArr, long[] jArr2) {
        C67848au.m98029b(jArr, jArr2, this.f184073d);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67896z(C67830ac acVar) {
        super(new long[10], new long[10], new long[10]);
        long[] jArr = new long[10];
        this.f184073d = jArr;
        long[] jArr2 = this.f184070a;
        C67829ab abVar = acVar.f183927a;
        C67848au.m98037j(jArr2, abVar.f183925b, abVar.f183924a);
        long[] jArr3 = this.f184071b;
        C67829ab abVar2 = acVar.f183927a;
        C67848au.m98036i(jArr3, abVar2.f183925b, abVar2.f183924a);
        System.arraycopy(acVar.f183927a.f183926c, 0, jArr, 0, 10);
        C67848au.m98029b(this.f184072c, acVar.f183928b, C67833af.f183935b);
    }
}
