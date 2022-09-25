package com.google.android.apps.gsa.nga.shared.p6309ag;

import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.shared.ag.b */
/* compiled from: PG */
public final /* synthetic */ class C80607b implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C80617l f221282a;

    /* renamed from: b */
    public final /* synthetic */ String f221283b;

    public /* synthetic */ C80607b(C80617l lVar, String str) {
        this.f221282a = lVar;
        this.f221283b = str;
    }

    public final Object get() {
        C80617l lVar = this.f221282a;
        String str = this.f221283b;
        return (Optional) Optional.ofNullable((C80627v) lVar.f221295b.get(str)).map(C80609d.f221285a).orElseGet(new C80611f(str));
    }
}
