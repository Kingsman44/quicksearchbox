package com.google.android.libraries.onegoogle.owners.p2387b;

import com.google.android.libraries.onegoogle.owners.C31012n;
import com.google.android.libraries.onegoogle.p2380c.p2381a.C30847m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.onegoogle.owners.b.c */
/* compiled from: PG */
final class C30964c {

    /* renamed from: a */
    public final C30847m f83438a;

    /* renamed from: b */
    public final String f83439b;

    /* renamed from: c */
    public final int f83440c;

    /* renamed from: d */
    private final C31012n f83441d;

    public C30964c(C31012n nVar, int i, C30847m mVar, String str) {
        this.f83441d = nVar;
        this.f83438a = mVar;
        this.f83440c = i;
        this.f83439b = str;
    }

    /* renamed from: a */
    public final C60870cx mo36665a(boolean z, String str, int i) {
        C60870cx cxVar;
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            cxVar = this.f83441d.mo36640d(str, i);
        } else {
            cxVar = this.f83441d.mo36641e(str, i);
        }
        C30963b bVar = new C30963b(this, i, z, currentTimeMillis);
        C60856cj.m92911t(cxVar, C47810es.m84974n(bVar), C60826bg.f164896a);
        return cxVar;
    }
}
