package com.google.apps.tiktok.dataservice;

import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;

/* renamed from: com.google.apps.tiktok.dataservice.bd */
/* compiled from: PG */
public final /* synthetic */ class C46720bd implements C60804al {

    /* renamed from: a */
    public final /* synthetic */ boolean f122037a;

    /* renamed from: b */
    public final /* synthetic */ C46688af f122038b;

    /* renamed from: c */
    public final /* synthetic */ C46688af f122039c;

    public /* synthetic */ C46720bd(boolean z, C46688af afVar, C46688af afVar2) {
        this.f122037a = z;
        this.f122038b = afVar;
        this.f122039c = afVar2;
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        boolean z = this.f122037a;
        C46688af afVar = this.f122038b;
        C46688af afVar2 = this.f122039c;
        if (z) {
            return C46688af.m83205b(obj, Math.min(afVar.mo50736a(), afVar2.mo50736a()));
        }
        return C46688af.m83206c(obj);
    }
}
