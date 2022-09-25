package com.bumptech.glide.load.p299c.p300a;

import android.graphics.Bitmap;
import com.bumptech.glide.load.p293a.p294a.C5642d;
import com.bumptech.glide.p291h.C5619f;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.c.a.aq */
/* compiled from: PG */
final class C5838aq implements C5875x {

    /* renamed from: a */
    private final C5835an f17436a;

    /* renamed from: b */
    private final C5619f f17437b;

    public C5838aq(C5835an anVar, C5619f fVar) {
        this.f17436a = anVar;
        this.f17437b = fVar;
    }

    /* renamed from: a */
    public final void mo12312a(C5642d dVar, Bitmap bitmap) {
        IOException iOException = this.f17437b.f16958c;
        if (iOException != null) {
            if (bitmap != null) {
                dVar.mo12116d(bitmap);
            }
            throw iOException;
        }
    }

    /* renamed from: b */
    public final void mo12313b() {
        this.f17436a.mo12302a();
    }
}
