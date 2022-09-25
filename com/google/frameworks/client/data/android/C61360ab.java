package com.google.frameworks.client.data.android;

import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60887da;
import dagger.p5294a.C68220f;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.frameworks.client.data.android.ab */
/* compiled from: PG */
public final class C61360ab implements C68220f {
    /* renamed from: a */
    public static C61531o m93868a(C60887da daVar, C60887da daVar2, C69464a aVar) {
        C61532p pVar = new C61532p();
        pVar.f166328b = daVar2;
        pVar.f166327a = daVar;
        pVar.f166329c = aVar;
        C58838bb.m90866a(pVar.f166327a, "Must set a lightweightExecutor");
        C58838bb.m90866a(pVar.f166328b, "Must set a backgroundExecutor");
        C58838bb.m90866a(pVar.f166329c, "Must set a cronetEngineProvider");
        return new C61359aa(pVar);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
