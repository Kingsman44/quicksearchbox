package com.facebook.litho;

/* renamed from: com.facebook.litho.cb */
/* compiled from: PG */
public class C6154cb implements C6142bw {

    /* renamed from: b */
    public C6168cp f18197b;

    /* renamed from: c */
    public final int f18198c;

    /* renamed from: d */
    public final Object[] f18199d;

    public C6154cb(C6168cp cpVar, int i, Object[] objArr) {
        this.f18197b = cpVar;
        this.f18198c = i;
        this.f18199d = objArr;
    }

    /* renamed from: c */
    public boolean mo13057a(C6154cb cbVar) {
        if (this == cbVar) {
            return true;
        }
        if (cbVar == null || cbVar.getClass() != getClass() || this.f18198c != cbVar.f18198c) {
            return false;
        }
        Object[] objArr = this.f18199d;
        Object[] objArr2 = cbVar.f18199d;
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int i = 1;
        while (true) {
            Object[] objArr3 = this.f18199d;
            if (i >= objArr3.length) {
                return true;
            }
            Object obj = objArr3[i];
            Object obj2 = cbVar.f18199d[i];
            if (obj == null) {
                if (obj2 != null) {
                    break;
                }
                i++;
            } else if (!obj.equals(obj2)) {
                break;
            } else {
                i++;
            }
        }
        return false;
    }

    /* renamed from: fD */
    public void mo13111fD(Object obj) {
        this.f18197b.mo13127l().mo12795N(this, obj);
    }

    public final String toString() {
        C6168cp cpVar = this.f18197b;
        if (cpVar == null || cpVar == this) {
            return super.toString();
        }
        return cpVar.toString();
    }
}
