package com.google.android.libraries.p10923ac.p10925b.p10942i;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147268c;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10970k.C147322b;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68220f;
import java.util.concurrent.ThreadFactory;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.i.ad */
/* compiled from: PG */
public final class C147059ad implements C68220f {

    /* renamed from: a */
    private final C69464a f397078a;

    /* renamed from: b */
    private final C69464a f397079b;

    /* renamed from: c */
    private final C69464a f397080c;

    /* renamed from: d */
    private final C69464a f397081d;

    /* renamed from: e */
    private final C69464a f397082e;

    public C147059ad(C69464a aVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5) {
        this.f397078a = aVar;
        this.f397079b = aVar2;
        this.f397080c = aVar3;
        this.f397081d = aVar4;
        this.f397082e = aVar5;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo17428b() {
        C68214a a = C68219e.m98518a(this.f397078a);
        C147091n nVar = (C147091n) this.f397079b.mo17428b();
        ThreadFactory threadFactory = ((C147322b) this.f397080c).f397617a.f397616a;
        C147266a a2 = ((C147268c) this.f397081d).f397506a.mo124074a();
        C68214a a3 = C68219e.m98518a(this.f397082e);
        return new C147058ac((C147058ac) null, "/kv", BuildConfig.FLAVOR, a, nVar, new C147073ar(a, nVar, threadFactory, a3), a2, a3);
    }
}
