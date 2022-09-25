package com.bumptech.glide.load.p299c.p304e;

import android.graphics.Bitmap;
import com.bumptech.glide.load.p293a.p294a.C5640b;
import com.bumptech.glide.load.p293a.p294a.C5642d;

/* renamed from: com.bumptech.glide.load.c.e.c */
/* compiled from: PG */
public final class C5898c {

    /* renamed from: a */
    public final C5642d f17514a;

    /* renamed from: b */
    public final C5640b f17515b;

    public C5898c(C5642d dVar, C5640b bVar) {
        this.f17514a = dVar;
        this.f17515b = bVar;
    }

    /* renamed from: a */
    public final void mo12344a(Bitmap bitmap) {
        this.f17514a.mo12116d(bitmap);
    }

    /* renamed from: b */
    public final void mo12345b(byte[] bArr) {
        C5640b bVar = this.f17515b;
        if (bVar != null) {
            bVar.mo12107c(bArr);
        }
    }

    /* renamed from: c */
    public final byte[] mo12346c(int i) {
        C5640b bVar = this.f17515b;
        if (bVar == null) {
            return new byte[i];
        }
        return (byte[]) bVar.mo12105a(i, byte[].class);
    }
}
