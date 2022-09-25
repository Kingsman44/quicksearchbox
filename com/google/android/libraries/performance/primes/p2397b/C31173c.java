package com.google.android.libraries.performance.primes.p2397b;

import android.util.Log;
import com.evernote.android.state.BuildConfig;
import com.google.common.p4526f.p4528b.C59031f;
import com.google.common.p4526f.p4528b.p4529a.C58982a;
import java.util.logging.Level;

/* renamed from: com.google.android.libraries.performance.primes.b.c */
/* compiled from: PG */
public final class C31173c extends C58982a {

    /* renamed from: a */
    private final C31180j f84042a;

    public C31173c(C31180j jVar) {
        super(BuildConfig.FLAVOR);
        this.f84042a = jVar;
    }

    /* renamed from: a */
    public final void mo36921a(C59031f fVar) {
        int i;
        C31180j jVar = this.f84042a;
        C31171a aVar = new C31171a(fVar.mo56304e().mo56239b(), fVar.mo56304e().mo56241d(), fVar.mo56304e().mo56238a(), fVar.mo56303d());
        C31181k kVar = (C31181k) jVar.f84050a.get();
        int i2 = kVar.f84053b;
        kVar.f84052a.set(i2 % 20, aVar);
        if (i2 == Integer.MAX_VALUE) {
            int i3 = kVar.f84055d;
            i = 28;
        } else {
            i = i2 + 1;
        }
        kVar.f84053b = i;
        kVar.f84054c = i;
    }

    /* renamed from: b */
    public final boolean mo36922b(Level level) {
        return true;
    }

    /* renamed from: c */
    public final void mo36923c(RuntimeException runtimeException, C59031f fVar) {
        Log.e("PrimesFloggerBackend", "Internal logging error", runtimeException);
    }
}
