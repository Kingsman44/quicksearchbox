package com.google.android.libraries.geller.portable;

import com.google.protos.p4985f.p5030q.p5032b.C65037av;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.geller.portable.x */
/* compiled from: PG */
public final /* synthetic */ class C21997x implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Geller f60689a;

    /* renamed from: b */
    public final /* synthetic */ String f60690b;

    /* renamed from: c */
    public final /* synthetic */ C65753ak f60691c;

    /* renamed from: d */
    public final /* synthetic */ String[] f60692d;

    public /* synthetic */ C21997x(Geller geller, String str, C65753ak akVar, String[] strArr) {
        this.f60689a = geller;
        this.f60690b = str;
        this.f60691c = akVar;
        this.f60692d = strArr;
    }

    public final Object call() {
        Geller geller = this.f60689a;
        String str = this.f60690b;
        C65753ak akVar = this.f60691c;
        String[] strArr = this.f60692d;
        long j = geller.f60381c;
        long a = geller.mo27174a(str);
        return (C65037av) C21946al.m41084a(geller.nativeReadAndClearUsage(j, a, akVar.name(), strArr), C65037av.f176123b);
    }
}
