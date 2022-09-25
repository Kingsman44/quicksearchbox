package com.google.android.libraries.gsa.monet.shared;

/* renamed from: com.google.android.libraries.gsa.monet.shared.w */
/* compiled from: PG */
public final class C23127w {

    /* renamed from: a */
    public final long f63474a;

    /* renamed from: b */
    public final long f63475b;

    public C23127w(long j, long j2) {
        this.f63474a = j;
        this.f63475b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C23127w wVar = (C23127w) obj;
            if (this.f63474a == wVar.f63474a && this.f63475b == wVar.f63475b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f63474a;
        long j2 = this.f63475b;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }
}
