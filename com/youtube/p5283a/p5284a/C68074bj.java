package com.youtube.p5283a.p5284a;

import com.google.p370af.C7490c;
import com.google.p370af.C7492e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.youtube.a.a.bj */
/* compiled from: PG */
public final class C68074bj extends C7492e {
    /* renamed from: k */
    public static C68074bj m98365k(ByteBuffer byteBuffer) {
        C68074bj bjVar = new C68074bj();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        bjVar.mo16917e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return bjVar;
    }

    /* renamed from: l */
    public static int m98366l(C7490c cVar, int i, long j, int i2, int i3) {
        cVar.mo16906n(5);
        cVar.mo16910s(3, i3);
        cVar.mo16910s(2, i2);
        cVar.mo16909r(1, (int) j);
        cVar.mo16910s(0, i);
        return cVar.mo16895c();
    }

    /* renamed from: g */
    public final long mo60195g() {
        int a = mo16913a(12);
        if (a != 0) {
            return ((long) this.f24704b.getInt(a + this.f24703a)) & 4294967295L;
        }
        return 0;
    }

    /* renamed from: h */
    public final long mo60196h() {
        int a = mo16913a(6);
        if (a != 0) {
            return ((long) this.f24704b.getInt(a + this.f24703a)) & 4294967295L;
        }
        return 0;
    }

    /* renamed from: i */
    public final C68085g mo60197i() {
        C68085g gVar = new C68085g();
        int a = mo16913a(4);
        if (a == 0) {
            return null;
        }
        int i = a + this.f24703a;
        gVar.mo16917e(i + this.f24704b.getInt(i), this.f24704b);
        return gVar;
    }

    /* renamed from: j */
    public final C68085g mo60198j() {
        C68085g gVar = new C68085g();
        int a = mo16913a(8);
        if (a == 0) {
            return null;
        }
        int i = a + this.f24703a;
        gVar.mo16917e(i + this.f24704b.getInt(i), this.f24704b);
        return gVar;
    }
}
