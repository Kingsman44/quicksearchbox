package com.google.apps.tiktok.coroutines;

import com.google.android.libraries.p1963i.C23828ac;
import com.google.apps.tiktok.concurrent.C46427an;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60895di;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.util.concurrent.Executor;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.coroutines.o */
/* compiled from: PG */
public final class C46662o implements C68220f {
    /* renamed from: a */
    public static C69585o m83134a(Executor executor, C60888db dbVar) {
        C69664n.m101061g(executor, "uiThreadExecutor");
        C69664n.m101061g(dbVar, "lightweightExecutor");
        C69585o a = C46652e.m83128a(new C23828ac(C60895di.m92995a(new C46427an(executor, true)), dbVar));
        C68225k.m98532d(a);
        return a;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
