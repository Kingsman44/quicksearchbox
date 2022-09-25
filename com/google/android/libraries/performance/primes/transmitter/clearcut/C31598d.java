package com.google.android.libraries.performance.primes.transmitter.clearcut;

import android.content.Context;
import com.google.android.libraries.performance.primes.transmitter.C31594c;
import com.google.android.libraries.performance.primes.transmitter.C31613e;
import com.google.android.libraries.performance.primes.transmitter.C31614f;
import com.google.android.libraries.performance.primes.transmitter.C31623o;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.performance.primes.transmitter.clearcut.d */
/* compiled from: PG */
public final class C31598d {

    /* renamed from: a */
    public final String f85056a;

    /* renamed from: b */
    public final String f85057b = "ANDROID_GSA_ANDROID_PRIMES";

    /* renamed from: c */
    public final boolean f85058c;

    /* renamed from: d */
    public final boolean f85059d;

    /* renamed from: e */
    private final C31594c f85060e;

    /* renamed from: f */
    private final C31614f f85061f;

    /* renamed from: g */
    private final C31623o f85062g;

    public C31598d(Context context, C58833ax axVar, C58833ax axVar2) {
        String packageName = context.getPackageName();
        C31594c cVar = (C31594c) axVar.mo56109e(C31594c.f85033b);
        C31614f fVar = C31614f.f85084b;
        C58838bb.m90866a(fVar, "use Optional.orNull() instead of Optional.or(null)");
        C31623o oVar = (C31623o) axVar2.mo56109e(C31623o.f85093b);
        Boolean bool = false;
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = bool.booleanValue();
        cVar.getClass();
        this.f85060e = cVar;
        fVar.getClass();
        this.f85061f = fVar;
        oVar.getClass();
        this.f85062g = oVar;
        this.f85058c = booleanValue;
        this.f85059d = booleanValue2;
        this.f85056a = "com.google.android.libraries.performance.primes#".concat(String.valueOf(packageName));
    }

    /* renamed from: a */
    public final C60870cx mo37274a() {
        C60870cx a = this.f85060e.mo37267a();
        int i = C31613e.f85083a;
        C60870cx i2 = C60856cj.m92900i(C58485gu.m89845m());
        C60870cx a2 = this.f85062g.mo37279a();
        return C60856cj.m92893b(a, i2, a2).mo57334a(new C31597c(this, a, i2, a2), C60826bg.f164896a);
    }
}
