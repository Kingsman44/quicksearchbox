package com.bumptech.glide.load.data;

import com.bumptech.glide.load.p293a.p294a.C5640b;
import com.bumptech.glide.load.p299c.p300a.C5835an;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.p */
/* compiled from: PG */
public final class C5941p implements C5932g {

    /* renamed from: a */
    public final C5835an f17598a;

    public C5941p(InputStream inputStream, C5640b bVar) {
        C5835an anVar = new C5835an(inputStream, bVar);
        this.f17598a = anVar;
        anVar.mark(5242880);
    }

    /* renamed from: b */
    public final void mo12339b() {
        this.f17598a.mo12304b();
    }

    /* renamed from: c */
    public final InputStream mo12338a() {
        this.f17598a.reset();
        return this.f17598a;
    }
}
