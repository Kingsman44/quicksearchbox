package com.google.android.libraries.social.populous.p3296e.p3302f;

import com.google.android.libraries.social.populous.core.C42266as;
import com.google.android.libraries.social.populous.p3296e.C42549n;
import com.google.android.libraries.social.populous.p3296e.C42554s;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60934v;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.social.populous.e.f.g */
/* compiled from: PG */
public final class C42526g implements C42554s {

    /* renamed from: a */
    public final C42520a f111525a;

    /* renamed from: b */
    private final Executor f111526b;

    /* renamed from: c */
    private final C42554s f111527c;

    /* renamed from: d */
    private final C42554s f111528d;

    public C42526g(Executor executor, C42520a aVar, C42554s sVar, C42554s sVar2) {
        this.f111526b = executor;
        this.f111525a = aVar;
        this.f111527c = sVar;
        this.f111528d = sVar2;
    }

    /* renamed from: a */
    public final C60870cx mo45370a(C42549n nVar) {
        C60870cx a = this.f111527c.mo45370a(nVar);
        C60870cx a2 = this.f111528d.mo45370a(nVar);
        return C60856cj.m92895d(a, a2).mo57334a(new C42525f(this, a, a2, nVar), this.f111526b);
    }

    /* renamed from: b */
    public final C60870cx mo45371b() {
        return C60856cj.m92895d(this.f111527c.mo45371b(), C60866ct.f164955a).mo57334a(new C60934v((Object) null), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final void mo45372c(C42266as asVar) {
    }

    /* renamed from: d */
    public final int mo45373d() {
        return 13;
    }
}
