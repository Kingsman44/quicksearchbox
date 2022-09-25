package com.google.android.libraries.search.location.p3029a.p3032c.p3033a;

import android.content.Context;
import com.google.android.libraries.search.location.C38716v;
import com.google.android.libraries.search.location.p3029a.p3032c.C38636a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.location.a.c.a.k */
/* compiled from: PG */
public final class C38647k implements C38648l {

    /* renamed from: a */
    public static final C59071e f102110a = C59071e.m91332i("com.google.android.libraries.search.location.a.c.a.k");

    /* renamed from: b */
    public final Context f102111b;

    /* renamed from: c */
    public final C38636a f102112c;

    /* renamed from: d */
    private final Executor f102113d;

    /* renamed from: e */
    private final Set f102114e;

    public C38647k(Context context, Executor executor, C38636a aVar, Set set) {
        this.f102111b = context;
        this.f102113d = executor;
        this.f102112c = aVar;
        this.f102114e = set;
    }

    /* renamed from: a */
    public final boolean mo41540a(C38716v vVar) {
        return this.f102114e.contains(vVar);
    }

    /* renamed from: b */
    public final void mo41536b(boolean z) {
        if (!z) {
            for (C38716v iVar : this.f102114e) {
                C38645i iVar2 = new C38645i(this, iVar);
                C60870cx n = C60856cj.m92905n(C47810es.m84965e(iVar2), this.f102113d);
                C38646j jVar = new C38646j();
                C60856cj.m92911t(n, C47810es.m84974n(jVar), C60826bg.f164896a);
            }
        }
    }
}
