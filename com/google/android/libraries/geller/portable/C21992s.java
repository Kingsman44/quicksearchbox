package com.google.android.libraries.geller.portable;

import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.libraries.geller.portable.s */
/* compiled from: PG */
public final /* synthetic */ class C21992s implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ Geller f60662a;

    /* renamed from: b */
    public final /* synthetic */ String f60663b;

    /* renamed from: c */
    public final /* synthetic */ C65753ak f60664c;

    /* renamed from: d */
    public final /* synthetic */ String f60665d;

    /* renamed from: e */
    public final /* synthetic */ long f60666e;

    public /* synthetic */ C21992s(Geller geller, String str, C65753ak akVar, String str2, long j) {
        this.f60662a = geller;
        this.f60663b = str;
        this.f60664c = akVar;
        this.f60665d = str2;
        this.f60666e = j;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        Geller geller = this.f60662a;
        String str = this.f60663b;
        C65753ak akVar = this.f60664c;
        String str2 = this.f60665d;
        long j = this.f60666e;
        long j2 = geller.f60381c;
        long a = geller.mo27174a(str);
        geller.nativeIncrementElementUsed(j2, a, akVar.name(), str2, j);
        return C60866ct.f164955a;
    }
}
