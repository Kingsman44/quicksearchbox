package com.google.common.p4537i;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.common.i.g */
/* compiled from: PG */
abstract class C59282g extends C59278c {

    /* renamed from: a */
    private final ByteBuffer f157407a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);

    protected C59282g() {
    }

    /* renamed from: m */
    private final void m92076m() {
        this.f157407a.flip();
        while (this.f157407a.remaining() >= 16) {
            mo56752k(this.f157407a);
        }
        this.f157407a.compact();
    }

    /* renamed from: n */
    private final void m92077n() {
        if (this.f157407a.remaining() < 8) {
            m92076m();
        }
    }

    /* renamed from: b */
    public final void mo56741b(byte b) {
        this.f157407a.put(b);
        m92077n();
    }

    /* renamed from: c */
    public final void mo56742c(char c) {
        this.f157407a.putChar(c);
        m92077n();
    }

    /* renamed from: d */
    public final void mo56743d(byte[] bArr, int i) {
        ByteBuffer order = ByteBuffer.wrap(bArr, 0, i).order(ByteOrder.LITTLE_ENDIAN);
        if (order.remaining() <= this.f157407a.remaining()) {
            this.f157407a.put(order);
            m92077n();
            return;
        }
        int position = 16 - this.f157407a.position();
        for (int i2 = 0; i2 < position; i2++) {
            this.f157407a.put(order.get());
        }
        m92076m();
        while (order.remaining() >= 16) {
            mo56752k(order);
        }
        this.f157407a.put(order);
    }

    /* renamed from: e */
    public final void mo56744e(int i) {
        this.f157407a.putInt(i);
        m92077n();
    }

    /* renamed from: f */
    public final void mo56745f(long j) {
        this.f157407a.putLong(j);
        m92077n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract C59289n mo56751h();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract void mo56752k(ByteBuffer byteBuffer);

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo56753l(ByteBuffer byteBuffer) {
        throw null;
    }

    /* renamed from: p */
    public final C59289n mo56758p() {
        m92076m();
        this.f157407a.flip();
        if (this.f157407a.remaining() > 0) {
            mo56753l(this.f157407a);
            ByteBuffer byteBuffer = this.f157407a;
            byteBuffer.position(byteBuffer.limit());
        }
        return mo56751h();
    }
}
