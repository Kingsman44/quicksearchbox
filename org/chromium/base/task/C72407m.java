package org.chromium.base.task;

import java.util.Arrays;

/* renamed from: org.chromium.base.task.m */
/* compiled from: PG */
public final class C72407m {

    /* renamed from: a */
    public static final C72407m f192571a;

    /* renamed from: b */
    public static final C72407m f192572b;

    /* renamed from: c */
    public static final C72407m f192573c;

    /* renamed from: d */
    public static final C72407m f192574d;

    /* renamed from: e */
    public static final C72407m f192575e;

    /* renamed from: f */
    public int f192576f;

    /* renamed from: g */
    public boolean f192577g;

    /* renamed from: h */
    public boolean f192578h;

    /* renamed from: i */
    public byte f192579i;

    /* renamed from: j */
    public byte[] f192580j;

    /* renamed from: k */
    public boolean f192581k;

    static {
        C72407m a = new C72407m().mo63867a(0);
        f192571a = a;
        a.mo63870d();
        C72407m a2 = new C72407m().mo63867a(1);
        f192572b = a2;
        a2.mo63870d();
        C72407m a3 = new C72407m().mo63867a(2);
        f192573c = a3;
        a3.mo63870d();
        C72407m mVar = new C72407m();
        f192574d = mVar;
        mVar.f192581k = true;
        C72407m a4 = new C72407m().mo63868b().mo63867a(2);
        f192575e = a4;
        a4.mo63867a(2);
        a4.mo63867a(1);
        a4.mo63867a(0);
    }

    private C72407m() {
        this.f192576f = 2;
    }

    private C72407m(C72407m mVar) {
        this.f192576f = mVar.f192576f;
        this.f192577g = mVar.f192577g;
        this.f192578h = mVar.f192578h;
        this.f192579i = 0;
        this.f192580j = null;
    }

    /* renamed from: a */
    public final C72407m mo63867a(int i) {
        C72407m mVar = new C72407m(this);
        mVar.f192576f = i;
        return mVar;
    }

    /* renamed from: b */
    public final C72407m mo63868b() {
        C72407m mVar = new C72407m(this);
        mVar.f192578h = true;
        return mVar;
    }

    /* renamed from: c */
    public final C72407m mo63869c() {
        return !this.f192578h ? mo63868b() : this;
    }

    /* renamed from: d */
    public final void mo63870d() {
        new C72407m(this).f192577g = true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C72407m) {
            C72407m mVar = (C72407m) obj;
            if (this.f192576f == mVar.f192576f && this.f192577g == mVar.f192577g && this.f192578h == mVar.f192578h) {
                byte b = mVar.f192579i;
                byte[] bArr = mVar.f192580j;
                return Arrays.equals((byte[]) null, (byte[]) null) && this.f192581k == mVar.f192581k;
            }
        }
    }

    public final int hashCode() {
        return ((((((((this.f192576f + 1147) * 37) + (this.f192577g ^ true ? 1 : 0)) * 37) + (this.f192578h ^ true ? 1 : 0)) * 1369) + Arrays.hashCode((byte[]) null)) * 37) + (this.f192581k ^ true ? 1 : 0);
    }
}
