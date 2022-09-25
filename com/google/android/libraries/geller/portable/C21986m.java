package com.google.android.libraries.geller.portable;

import com.google.common.base.C58872ci;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.geller.portable.m */
/* compiled from: PG */
public final /* synthetic */ class C21986m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ Geller f60645a;

    /* renamed from: b */
    public final /* synthetic */ C65753ak f60646b;

    /* renamed from: c */
    public final /* synthetic */ C58872ci f60647c;

    public /* synthetic */ C21986m(Geller geller, C65753ak akVar, C58872ci ciVar) {
        this.f60645a = geller;
        this.f60646b = akVar;
        this.f60647c = ciVar;
    }

    public final C60870cx apply(Object obj) {
        Geller geller = this.f60645a;
        C65753ak akVar = this.f60646b;
        GellerException gellerException = (GellerException) obj;
        geller.mo27175b(akVar).mo27240h(akVar, gellerException.f60397a.name(), this.f60647c.mo56158a(TimeUnit.MILLISECONDS));
        return C60856cj.m92899h(gellerException);
    }
}
