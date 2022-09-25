package androidx.p191s.p192a.p193a;

import java.nio.ByteBuffer;

/* renamed from: androidx.s.a.a.c */
/* compiled from: PG */
public class C4082c {

    /* renamed from: a */
    public int f13068a;

    /* renamed from: b */
    public ByteBuffer f13069b;

    /* renamed from: c */
    private int f13070c;

    /* renamed from: d */
    private int f13071d;

    public C4082c() {
        if (C4083d.f13072a == null) {
            C4083d.f13072a = new C4084e();
        }
    }

    /* renamed from: e */
    public final int mo8580e(int i) {
        if (i < this.f13071d) {
            return this.f13069b.getShort(this.f13070c + i);
        }
        return 0;
    }

    /* renamed from: f */
    public final int mo8581f(int i) {
        int i2 = i + this.f13068a;
        return i2 + this.f13069b.getInt(i2) + 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo8582g(int i) {
        int i2 = i + this.f13068a;
        return this.f13069b.getInt(i2 + this.f13069b.getInt(i2));
    }

    /* renamed from: h */
    public final void mo8583h(int i, ByteBuffer byteBuffer) {
        short s;
        this.f13069b = byteBuffer;
        if (byteBuffer != null) {
            this.f13068a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f13070c = i2;
            s = this.f13069b.getShort(i2);
        } else {
            s = 0;
            this.f13068a = 0;
            this.f13070c = 0;
        }
        this.f13071d = s;
    }
}
