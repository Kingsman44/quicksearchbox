package com.google.p370af;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.af.e */
/* compiled from: PG */
public class C7492e {

    /* renamed from: a */
    public int f24703a;

    /* renamed from: b */
    public ByteBuffer f24704b;

    /* renamed from: c */
    final C7494g f24705c = C7494g.m22760d();

    /* renamed from: d */
    private int f24706d;

    /* renamed from: e */
    private int f24707e;

    /* renamed from: a */
    public final int mo16913a(int i) {
        if (i < this.f24707e) {
            return this.f24704b.getShort(this.f24706d + i);
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo16914b(int i) {
        int i2 = i + this.f24703a;
        return i2 + this.f24704b.getInt(i2) + 4;
    }

    /* renamed from: c */
    public final int mo16915c(int i) {
        int i2 = i + this.f24703a;
        return this.f24704b.getInt(i2 + this.f24704b.getInt(i2));
    }

    /* renamed from: d */
    public final String mo16916d(int i) {
        ByteBuffer byteBuffer = this.f24704b;
        C7494g gVar = this.f24705c;
        int i2 = i + byteBuffer.getInt(i);
        return gVar.mo16920b(byteBuffer, i2 + 4, byteBuffer.getInt(i2));
    }

    /* renamed from: e */
    public final void mo16917e(int i, ByteBuffer byteBuffer) {
        short s;
        this.f24704b = byteBuffer;
        if (byteBuffer != null) {
            this.f24703a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f24706d = i2;
            s = this.f24704b.getShort(i2);
        } else {
            s = 0;
            this.f24703a = 0;
            this.f24706d = 0;
        }
        this.f24707e = s;
    }

    /* renamed from: f */
    public final ByteBuffer mo16918f(int i) {
        int a = mo16913a(i);
        if (a == 0) {
            return null;
        }
        ByteBuffer order = this.f24704b.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int b = mo16914b(a);
        ByteBuffer byteBuffer = (ByteBuffer) order.position(b);
        ByteBuffer byteBuffer2 = (ByteBuffer) order.limit(b + mo16915c(a));
        return order;
    }
}
