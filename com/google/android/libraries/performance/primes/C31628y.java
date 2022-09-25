package com.google.android.libraries.performance.primes;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.base.C58833ax;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.performance.primes.y */
/* compiled from: PG */
public final class C31628y implements C68220f {

    /* renamed from: a */
    private final C69464a f85098a;

    /* renamed from: b */
    private final C69464a f85099b;

    public C31628y(C69464a aVar, C69464a aVar2) {
        this.f85098a = aVar;
        this.f85099b = aVar2;
    }

    /* renamed from: a */
    public static SharedPreferences m58945a(Context context, C58833ax axVar) {
        SharedPreferences a = C31582q.m58882a(context, axVar);
        C68225k.m98532d(a);
        return a;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        SharedPreferences a = C31582q.m58882a((Context) ((C68221g) this.f85098a).f184583a, (C58833ax) ((C68221g) this.f85099b).f184583a);
        C68225k.m98532d(a);
        return a;
    }
}
