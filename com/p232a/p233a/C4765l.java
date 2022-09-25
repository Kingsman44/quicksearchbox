package com.p232a.p233a;

/* renamed from: com.a.a.l */
/* compiled from: PG */
public final class C4765l {

    /* renamed from: a */
    public static final C4765l f15097a = new C4765l(C4764k.None, 0);

    /* renamed from: b */
    public static final C4765l f15098b = new C4765l(C4764k.XMidYMid, 1);

    /* renamed from: c */
    public final C4764k f15099c;

    /* renamed from: d */
    public final int f15100d;

    public C4765l(C4764k kVar, int i) {
        this.f15099c = kVar;
        this.f15100d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4765l lVar = (C4765l) obj;
        return this.f15099c == lVar.f15099c && this.f15100d == lVar.f15100d;
    }
}
