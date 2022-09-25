package com.google.android.libraries.geller.portable;

import com.google.common.base.C58872ci;
import com.google.common.p4522b.C58528ij;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65819cw;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.geller.portable.j */
/* compiled from: PG */
public final /* synthetic */ class C21983j implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Geller f60634a;

    /* renamed from: b */
    public final /* synthetic */ String f60635b;

    /* renamed from: c */
    public final /* synthetic */ C65819cw f60636c;

    /* renamed from: d */
    public final /* synthetic */ C58872ci f60637d;

    /* renamed from: e */
    public final /* synthetic */ C65753ak f60638e;

    public /* synthetic */ C21983j(Geller geller, String str, C65819cw cwVar, C58872ci ciVar, C65753ak akVar) {
        this.f60634a = geller;
        this.f60635b = str;
        this.f60636c = cwVar;
        this.f60637d = ciVar;
        this.f60638e = akVar;
    }

    public final Object call() {
        boolean z;
        Geller geller = this.f60634a;
        String str = this.f60635b;
        C65819cw cwVar = this.f60636c;
        C58872ci ciVar = this.f60637d;
        C65753ak akVar = this.f60638e;
        try {
            long j = geller.f60381c;
            long a = geller.mo27174a(str);
            byte[] byteArray = cwVar.toByteArray();
            z = true;
            try {
                C58528ij H = C58528ij.m90008H(geller.nativeUpdate(j, a, byteArray));
                geller.mo27175b(akVar).mo27238f(akVar, true, Long.valueOf(ciVar.mo56158a(TimeUnit.MILLISECONDS)).longValue());
                return H;
            } catch (Throwable th) {
                th = th;
                geller.mo27175b(akVar).mo27238f(akVar, z, Long.valueOf(ciVar.mo56158a(TimeUnit.MILLISECONDS)).longValue());
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
            geller.mo27175b(akVar).mo27238f(akVar, z, Long.valueOf(ciVar.mo56158a(TimeUnit.MILLISECONDS)).longValue());
            throw th;
        }
    }
}
