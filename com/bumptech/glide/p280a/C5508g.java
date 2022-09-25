package com.bumptech.glide.p280a;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: com.bumptech.glide.a.g */
/* compiled from: PG */
final class C5508g extends ByteArrayOutputStream {

    /* renamed from: a */
    final /* synthetic */ C5509h f16677a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5508g(C5509h hVar, int i) {
        super(i);
        this.f16677a = hVar;
    }

    public final String toString() {
        try {
            return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count + -1] != 13) ? this.count : this.count - 1, this.f16677a.f16678a.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
