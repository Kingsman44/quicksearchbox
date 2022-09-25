package com.google.android.libraries.onegoogle.owners.p2387b;

import com.google.android.libraries.onegoogle.owners.C31012n;
import com.google.android.libraries.onegoogle.p2380c.p2381a.C30847m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.onegoogle.owners.b.f */
/* compiled from: PG */
public final class C30967f {

    /* renamed from: a */
    public final C30847m f83448a;

    /* renamed from: b */
    public final String f83449b;

    /* renamed from: c */
    public final int f83450c;

    /* renamed from: d */
    private final C31012n f83451d;

    public C30967f(C31012n nVar, int i, C30847m mVar, String str) {
        this.f83451d = nVar;
        this.f83448a = mVar;
        this.f83450c = i;
        this.f83449b = str;
    }

    /* renamed from: a */
    public final C60870cx mo36666a(String str) {
        C60870cx b = this.f83451d.mo36638b(str);
        C30966e eVar = new C30966e(this);
        C60856cj.m92911t(b, C47810es.m84974n(eVar), C60826bg.f164896a);
        return b;
    }

    /* renamed from: b */
    public final C60870cx mo36667b(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        C60870cx a = z ? this.f83451d.mo36637a() : this.f83451d.mo36639c();
        C60856cj.m92911t(a, C47810es.m84974n(new C30965d(this, z, currentTimeMillis)), C60826bg.f164896a);
        return a;
    }
}
