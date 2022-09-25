package com.youtube.p5283a.p5284a;

import com.google.p370af.C7492e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.youtube.a.a.ak */
/* compiled from: PG */
public final class C68048ak extends C7492e {
    /* renamed from: o */
    public static C68048ak m98276o(ByteBuffer byteBuffer) {
        C68048ak akVar = new C68048ak();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        akVar.mo16917e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return akVar;
    }

    /* renamed from: g */
    public final float mo60113g() {
        int a = mo16913a(10);
        if (a != 0) {
            return this.f24704b.getFloat(a + this.f24703a);
        }
        return 0.0f;
    }

    /* renamed from: h */
    public final float mo60114h() {
        int a = mo16913a(18);
        if (a != 0) {
            return this.f24704b.getFloat(a + this.f24703a);
        }
        return 0.0f;
    }

    /* renamed from: i */
    public final float mo60115i() {
        int a = mo16913a(12);
        if (a != 0) {
            return this.f24704b.getFloat(a + this.f24703a);
        }
        return 0.0f;
    }

    /* renamed from: j */
    public final float mo60116j() {
        int a = mo16913a(14);
        if (a != 0) {
            return this.f24704b.getFloat(a + this.f24703a);
        }
        return 0.0f;
    }

    /* renamed from: k */
    public final float mo60117k() {
        int a = mo16913a(16);
        if (a != 0) {
            return this.f24704b.getFloat(a + this.f24703a);
        }
        return 0.0f;
    }

    /* renamed from: l */
    public final long mo60118l() {
        int a = mo16913a(8);
        if (a != 0) {
            return ((long) this.f24704b.getInt(a + this.f24703a)) & 4294967295L;
        }
        return 0;
    }

    /* renamed from: m */
    public final long mo60119m() {
        int a = mo16913a(6);
        if (a != 0) {
            return ((long) this.f24704b.getInt(a + this.f24703a)) & 4294967295L;
        }
        return 0;
    }

    /* renamed from: n */
    public final long mo60120n() {
        int a = mo16913a(4);
        if (a != 0) {
            return ((long) this.f24704b.getInt(a + this.f24703a)) & 4294967295L;
        }
        return 0;
    }
}
