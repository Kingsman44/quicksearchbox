package com.google.android.libraries.gsa.logoview.p1882b;

import com.google.android.libraries.gsa.logoview.p1881a.C22886a;
import com.google.android.libraries.gsa.logoview.p1881a.C22887b;

/* renamed from: com.google.android.libraries.gsa.logoview.b.c */
/* compiled from: PG */
public final class C22905c {

    /* renamed from: a */
    public final C22886a f63088a;

    /* renamed from: b */
    public final C22887b f63089b;

    /* renamed from: c */
    public boolean f63090c;

    public C22905c(C22886a aVar, C22887b bVar) {
        this.f63088a = aVar;
        this.f63089b = bVar;
    }

    /* renamed from: a */
    public final void mo28270a() {
        C22886a aVar = this.f63088a;
        float f = this.f63089b.f63013c;
        if (f != aVar.f63014d) {
            aVar.f63014d = f;
            aVar.f63015e = false;
        }
        aVar.mo28235c(0.0f);
        this.f63089b.mo28237e(0.0f);
        this.f63090c = false;
    }

    /* renamed from: b */
    public final void mo28271b(float f) {
        this.f63089b.mo28235c(f);
        this.f63090c = true;
    }
}
