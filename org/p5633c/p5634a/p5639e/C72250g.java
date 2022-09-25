package org.p5633c.p5634a.p5639e;

/* renamed from: org.c.a.e.g */
/* compiled from: PG */
final class C72250g implements C72261r {

    /* renamed from: a */
    private final C72261r[] f192244a;

    /* renamed from: b */
    private final int f192245b;

    public C72250g(C72261r[] rVarArr) {
        int a;
        this.f192244a = rVarArr;
        int length = rVarArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length >= 0) {
                C72261r rVar = rVarArr[length];
                if (rVar != null && (a = rVar.mo63604a()) > i) {
                    i = a;
                }
            } else {
                this.f192245b = i;
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo63604a() {
        return this.f192245b;
    }

    /* renamed from: c */
    public final int mo63606c(C72264u uVar, String str, int i) {
        int i2;
        int i3;
        C72261r[] rVarArr = this.f192244a;
        int length = rVarArr.length;
        Object b = uVar.mo63638b();
        Object obj = null;
        boolean z = false;
        int i4 = i;
        int i5 = i4;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                break;
            }
            C72261r rVar = rVarArr[i6];
            if (rVar != null) {
                int c = rVar.mo63606c(uVar, str, i);
                if (c >= i) {
                    if (c <= i4) {
                        continue;
                    } else if (c >= str.length() || (i3 = i6 + 1) >= length || rVarArr[i3] == null) {
                        return c;
                    } else {
                        obj = uVar.mo63638b();
                        i4 = c;
                    }
                } else if (c < 0 && (i2 = c ^ -1) > i5) {
                    i5 = i2;
                }
                uVar.mo63642f(b);
                i6++;
            } else if (i4 <= i) {
                return i;
            } else {
                z = true;
            }
        }
        if (i4 <= i && (i4 != i || !z)) {
            return i5 ^ -1;
        }
        if (obj != null) {
            uVar.mo63642f(obj);
        }
        return i4;
    }
}
