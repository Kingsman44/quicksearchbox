package com.google.android.libraries.geller.portable;

import com.google.common.base.C58872ci;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.geller.portable.v */
/* compiled from: PG */
public final /* synthetic */ class C21995v implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ Geller f60681a;

    /* renamed from: b */
    public final /* synthetic */ boolean f60682b;

    /* renamed from: c */
    public final /* synthetic */ C65753ak f60683c;

    /* renamed from: d */
    public final /* synthetic */ C58872ci f60684d;

    public /* synthetic */ C21995v(Geller geller, boolean z, C65753ak akVar, C58872ci ciVar) {
        this.f60681a = geller;
        this.f60682b = z;
        this.f60683c = akVar;
        this.f60684d = ciVar;
    }

    public final C60870cx apply(Object obj) {
        Geller geller = this.f60681a;
        boolean z = this.f60682b;
        C65753ak akVar = this.f60683c;
        C58872ci ciVar = this.f60684d;
        GellerException gellerException = (GellerException) obj;
        if (z) {
            geller.mo27175b(akVar).mo27233a(akVar, gellerException.f60397a.name(), ciVar.mo56158a(TimeUnit.MILLISECONDS));
        }
        return C60856cj.m92899h(gellerException);
    }
}
