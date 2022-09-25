package androidx.work;

import android.util.Log;

/* renamed from: androidx.work.ac */
/* compiled from: PG */
public final class C4379ac extends C4380ad {

    /* renamed from: a */
    public final int f14003a;

    public C4379ac(int i) {
        this.f14003a = i;
    }

    /* renamed from: a */
    public final void mo9309a(String str, String str2) {
        if (this.f14003a <= 3) {
            Log.d(str, str2);
        }
    }

    /* renamed from: b */
    public final void mo9310b(String str, String str2, Throwable th) {
        if (this.f14003a <= 3) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: c */
    public final void mo9311c(String str, String str2) {
        if (this.f14003a <= 6) {
            Log.e(str, str2);
        }
    }

    /* renamed from: d */
    public final void mo9312d(String str, String str2, Throwable th) {
        if (this.f14003a <= 6) {
            Log.e(str, str2, th);
        }
    }

    /* renamed from: e */
    public final void mo9313e(String str, String str2) {
        if (this.f14003a <= 4) {
            Log.i(str, str2);
        }
    }

    /* renamed from: f */
    public final void mo9314f(String str, String str2) {
        if (this.f14003a <= 5) {
            Log.w(str, str2);
        }
    }

    /* renamed from: g */
    public final void mo9315g(String str, String str2, Throwable th) {
        if (this.f14003a <= 5) {
            Log.w(str, str2, th);
        }
    }
}
