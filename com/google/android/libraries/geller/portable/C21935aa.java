package com.google.android.libraries.geller.portable;

import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.geller.portable.aa */
/* compiled from: PG */
public final /* synthetic */ class C21935aa implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Geller f60511a;

    /* renamed from: b */
    public final /* synthetic */ String f60512b;

    /* renamed from: c */
    public final /* synthetic */ C65753ak f60513c;

    /* renamed from: d */
    public final /* synthetic */ String f60514d = "_version_info";

    /* renamed from: e */
    public final /* synthetic */ String f60515e;

    public /* synthetic */ C21935aa(Geller geller, String str, C65753ak akVar, String str2) {
        this.f60511a = geller;
        this.f60512b = str;
        this.f60513c = akVar;
        this.f60515e = str2;
    }

    public final Object call() {
        Geller geller = this.f60511a;
        String str = this.f60512b;
        C65753ak akVar = this.f60513c;
        String str2 = this.f60514d;
        String str3 = this.f60515e;
        long j = geller.f60381c;
        long a = geller.mo27174a(str);
        geller.nativeWriteMetadata(j, a, akVar.name(), str2, str3);
        return null;
    }
}
