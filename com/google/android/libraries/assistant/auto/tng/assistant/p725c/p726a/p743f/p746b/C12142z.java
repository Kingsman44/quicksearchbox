package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p746b;

import android.media.MediaCodec;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p747c.p753d.C12151a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60904dr;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.f.b.z */
/* compiled from: PG */
final class C12142z {

    /* renamed from: a */
    public static final byte[] f38812a = {4};

    /* renamed from: b */
    public final Deque f38813b = new ArrayDeque();

    /* renamed from: c */
    public final Deque f38814c = new ArrayDeque();

    /* renamed from: d */
    public final C12133q f38815d;

    /* renamed from: e */
    public final Executor f38816e;

    /* renamed from: f */
    public MediaCodec f38817f = null;

    /* renamed from: g */
    public final C12126j f38818g;

    public C12142z(C12133q qVar, C12126j jVar, Executor executor) {
        this.f38815d = qVar;
        this.f38818g = jVar;
        this.f38816e = new C60904dr(executor);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20452a() {
        MediaCodec mediaCodec = this.f38817f;
        if (mediaCodec != null) {
            mediaCodec.release();
        }
        Deque deque = this.f38813b;
        Objects.requireNonNull(deque);
        C12138v vVar = new C12138v(deque);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(vVar), this.f38816e), "Error clearing BufferIds.", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo20453b(byte[] bArr, boolean z) {
        C12137u uVar = new C12137u(this, bArr, z);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(uVar), this.f38816e), "Error encoding data", new Object[0]);
    }

    /* renamed from: c */
    public final void mo20454c(Throwable th) {
        this.f38818g.mo20439c(th);
        mo20452a();
    }

    /* renamed from: d */
    public final void mo20455d(int i, byte[] bArr, boolean z) {
        MediaCodec mediaCodec;
        ByteBuffer byteBuffer = null;
        if (i >= 0 && (mediaCodec = this.f38817f) != null) {
            byteBuffer = mediaCodec.getInputBuffer(i);
        }
        if (byteBuffer != null && this.f38817f != null) {
            int length = bArr.length;
            if (length > byteBuffer.capacity()) {
                byteBuffer.put(bArr, 0, byteBuffer.capacity());
                this.f38814c.addFirst(Arrays.copyOfRange(bArr, byteBuffer.capacity(), length));
            } else {
                byteBuffer.put(bArr);
            }
            this.f38817f.queueInputBuffer(i, 0, byteBuffer.position(), 0, true != z ? 0 : 4);
        } else if (byteBuffer == null) {
            mo20454c(new C12151a("Codec buffer is null.", 4));
        } else {
            mo20454c(new C12151a("Codec is null.", 3));
        }
    }

    /* renamed from: e */
    public final void mo20456e() {
        C12139w wVar = new C12139w(this);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(wVar), this.f38816e), "Error trying to flush frames", new Object[0]);
    }
}
