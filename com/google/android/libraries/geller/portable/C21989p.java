package com.google.android.libraries.geller.portable;

import com.google.protos.p4985f.p5030q.p5032b.C65071r;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.geller.portable.p */
/* compiled from: PG */
public final /* synthetic */ class C21989p implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Geller f60654a;

    /* renamed from: b */
    public final /* synthetic */ String f60655b;

    /* renamed from: c */
    public final /* synthetic */ C65753ak f60656c;

    /* renamed from: d */
    public final /* synthetic */ C65071r f60657d;

    public /* synthetic */ C21989p(Geller geller, String str, C65753ak akVar, C65071r rVar) {
        this.f60654a = geller;
        this.f60655b = str;
        this.f60656c = akVar;
        this.f60657d = rVar;
    }

    public final Object call() {
        Geller geller = this.f60654a;
        String str = this.f60655b;
        C65753ak akVar = this.f60656c;
        C65071r rVar = this.f60657d;
        return Long.valueOf(geller.nativeDelete(geller.f60381c, geller.mo27174a(str), akVar.name(), rVar.toByteArray()));
    }
}
