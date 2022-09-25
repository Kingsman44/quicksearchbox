package org.p5633c.p5634a.p5639e;

/* renamed from: org.c.a.e.ab */
/* compiled from: PG */
final class C72236ab implements C72239ae {

    /* renamed from: a */
    private final C72239ae f192213a;

    /* renamed from: b */
    private final C72239ae f192214b;

    public C72236ab(C72239ae aeVar, C72239ae aeVar2) {
        this.f192213a = aeVar;
        this.f192214b = aeVar2;
    }

    /* renamed from: a */
    public final int mo63586a(int i) {
        return this.f192213a.mo63586a(i) + ((C72241ag) this.f192214b).f192226a.length();
    }

    /* renamed from: b */
    public final int mo63587b(String str, int i) {
        int b = this.f192213a.mo63587b(str, i);
        return b >= 0 ? this.f192214b.mo63587b(str, b) : b;
    }

    /* renamed from: c */
    public final int mo63588c(String str, int i) {
        int c = this.f192213a.mo63588c(str, i);
        return c >= 0 ? this.f192214b.mo63588c(str, c) : i ^ -1;
    }

    /* renamed from: d */
    public final void mo63589d(StringBuffer stringBuffer, int i) {
        this.f192213a.mo63589d(stringBuffer, i);
        stringBuffer.append(((C72241ag) this.f192214b).f192226a);
    }
}
