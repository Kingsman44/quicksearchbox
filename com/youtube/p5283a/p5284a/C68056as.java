package com.youtube.p5283a.p5284a;

import com.google.p370af.C7492e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.youtube.a.a.as */
/* compiled from: PG */
public final class C68056as extends C7492e {
    /* renamed from: n */
    public static void m98294n(ByteBuffer byteBuffer, C68056as asVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        asVar.mo16917e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* renamed from: g */
    public final float mo60128g() {
        int a = mo16913a(40);
        if (a != 0) {
            return this.f24704b.getFloat(a + this.f24703a);
        }
        return 0.0f;
    }

    /* renamed from: h */
    public final float mo60129h() {
        int a = mo16913a(30);
        if (a != 0) {
            return this.f24704b.getFloat(a + this.f24703a);
        }
        return 0.0f;
    }

    /* renamed from: i */
    public final float mo60130i() {
        int a = mo16913a(32);
        if (a != 0) {
            return this.f24704b.getFloat(a + this.f24703a);
        }
        return 1.0f;
    }

    /* renamed from: j */
    public final int mo60131j() {
        int a = mo16913a(22);
        if (a != 0) {
            return this.f24704b.getInt(a + this.f24703a);
        }
        return 0;
    }

    /* renamed from: k */
    public final C68101w mo60132k() {
        C68101w wVar = new C68101w();
        int a = mo16913a(6);
        if (a == 0) {
            return null;
        }
        wVar.mo16912a(a + this.f24703a, this.f24704b);
        return wVar;
    }

    /* renamed from: l */
    public final C68101w mo60133l() {
        C68101w wVar = new C68101w();
        int a = mo16913a(8);
        if (a == 0) {
            return null;
        }
        wVar.mo16912a(a + this.f24703a, this.f24704b);
        return wVar;
    }

    /* renamed from: m */
    public final C68102x mo60134m() {
        C68102x xVar = new C68102x();
        int a = mo16913a(18);
        if (a == 0) {
            return null;
        }
        int i = a + this.f24703a;
        xVar.mo16917e(i + this.f24704b.getInt(i), this.f24704b);
        return xVar;
    }
}
