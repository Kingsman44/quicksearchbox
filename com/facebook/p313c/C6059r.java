package com.facebook.p313c;

import com.facebook.litho.C6201du;

/* renamed from: com.facebook.c.r */
/* compiled from: PG */
public final class C6059r {

    /* renamed from: a */
    public final C6060s f17823a;

    /* renamed from: b */
    public final C6060s[] f17824b;

    /* renamed from: c */
    public Object f17825c;

    public C6059r(C6060s sVar, C6060s[] sVarArr) {
        this.f17823a = sVar;
        this.f17824b = sVarArr;
    }

    /* renamed from: a */
    public final int mo12650a(long j) {
        int i = 0;
        while (true) {
            C6060s[] sVarArr = this.f17824b;
            if (i >= sVarArr.length) {
                return -1;
            }
            if (((C6201du) sVarArr[i].f17827b).f18345a.f18263m == j) {
                return i;
            }
            i++;
        }
    }
}
