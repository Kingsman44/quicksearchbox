package com.youtube.p5283a.p5284a;

import com.google.p370af.C7492e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.youtube.a.a.bh */
/* compiled from: PG */
public final class C68072bh extends C7492e {
    /* renamed from: q */
    public static C68072bh m98336q(ByteBuffer byteBuffer) {
        C68072bh bhVar = new C68072bh();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        bhVar.mo16917e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return bhVar;
    }

    /* renamed from: g */
    public final float mo60168g() {
        int a = mo16913a(12);
        if (a != 0) {
            return this.f24704b.getFloat(a + this.f24703a);
        }
        return 0.0f;
    }

    /* renamed from: h */
    public final float mo60169h() {
        int a = mo16913a(10);
        if (a != 0) {
            return this.f24704b.getFloat(a + this.f24703a);
        }
        return 0.0f;
    }

    /* renamed from: i */
    public final float mo60170i() {
        int a = mo16913a(6);
        if (a != 0) {
            return this.f24704b.getFloat(a + this.f24703a);
        }
        return 1.0f;
    }

    /* renamed from: j */
    public final float mo60171j() {
        int a = mo16913a(24);
        if (a != 0) {
            return this.f24704b.getFloat(a + this.f24703a);
        }
        return 0.0f;
    }

    /* renamed from: k */
    public final float mo60172k() {
        int a = mo16913a(22);
        if (a != 0) {
            return this.f24704b.getFloat(a + this.f24703a);
        }
        return 0.0f;
    }

    /* renamed from: l */
    public final long mo60173l() {
        int a = mo16913a(4);
        if (a != 0) {
            return ((long) this.f24704b.getInt(a + this.f24703a)) & 4294967295L;
        }
        return 0;
    }

    /* renamed from: m */
    public final long mo60174m() {
        int a = mo16913a(8);
        if (a != 0) {
            return ((long) this.f24704b.getInt(a + this.f24703a)) & 4294967295L;
        }
        return 0;
    }

    /* renamed from: n */
    public final C68045ah mo60175n() {
        C68045ah ahVar = new C68045ah();
        int a = mo16913a(20);
        if (a == 0) {
            return null;
        }
        int i = a + this.f24703a;
        ahVar.mo16917e(i + this.f24704b.getInt(i), this.f24704b);
        return ahVar;
    }

    /* renamed from: o */
    public final C68063az mo60176o() {
        C68063az azVar = new C68063az();
        int a = mo16913a(26);
        if (a == 0) {
            return null;
        }
        azVar.mo16912a(a + this.f24703a, this.f24704b);
        return azVar;
    }

    /* renamed from: p */
    public final C68067bc mo60177p() {
        C68067bc bcVar = new C68067bc();
        int a = mo16913a(14);
        if (a == 0) {
            return null;
        }
        int i = a + this.f24703a;
        bcVar.mo16917e(i + this.f24704b.getInt(i), this.f24704b);
        return bcVar;
    }

    /* renamed from: r */
    public final boolean mo60178r() {
        int a = mo16913a(16);
        return a == 0 || this.f24704b.get(a + this.f24703a) != 0;
    }
}
