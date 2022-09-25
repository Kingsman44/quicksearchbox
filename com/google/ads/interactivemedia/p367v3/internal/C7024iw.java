package com.google.ads.interactivemedia.p367v3.internal;

import java.nio.ByteBuffer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.iw */
/* compiled from: PG */
public class C7024iw extends C7019ir {

    /* renamed from: a */
    public final C7021it f22514a;

    /* renamed from: b */
    public ByteBuffer f22515b;

    /* renamed from: c */
    public boolean f22516c;

    /* renamed from: d */
    public long f22517d;

    /* renamed from: e */
    public ByteBuffer f22518e;

    /* renamed from: f */
    private final int f22519f;

    public C7024iw() {
        this(1);
    }

    /* renamed from: m */
    private final ByteBuffer mo16287m(int i) {
        int i2;
        int i3 = this.f22519f;
        if (i3 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i3 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f22515b;
        if (byteBuffer == null) {
            i2 = 0;
        } else {
            i2 = byteBuffer.capacity();
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(i2);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public void mo16030a() {
        super.mo16030a();
        ByteBuffer byteBuffer = this.f22515b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f22518e;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f22516c = false;
    }

    /* renamed from: i */
    public final void mo16042i(int i) {
        ByteBuffer byteBuffer = this.f22515b;
        if (byteBuffer == null) {
            this.f22515b = mo16287m(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.f22515b = byteBuffer;
            return;
        }
        ByteBuffer m = mo16287m(i2);
        m.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            m.put(byteBuffer);
        }
        this.f22515b = m;
    }

    /* renamed from: j */
    public final boolean mo16043j() {
        return this.f22515b == null && this.f22519f == 0;
    }

    /* renamed from: k */
    public final boolean mo16044k() {
        return mo16037h(1073741824);
    }

    /* renamed from: l */
    public final void mo16045l() {
        ByteBuffer byteBuffer = this.f22515b;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f22518e;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public C7024iw(int i) {
        this.f22514a = new C7021it();
        this.f22519f = i;
    }
}
