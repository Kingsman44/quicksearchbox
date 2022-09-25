package com.youtube.p5283a.p5284a;

import com.google.p370af.C7492e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.youtube.a.a.ad */
/* compiled from: PG */
public final class C68041ad extends C7492e {
    /* renamed from: i */
    public static C68041ad m98263i(ByteBuffer byteBuffer) {
        C68041ad adVar = new C68041ad();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        adVar.mo16917e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return adVar;
    }

    /* renamed from: g */
    public final int mo60103g() {
        int a = mo16913a(4);
        if (a != 0) {
            return this.f24704b.getInt(a + this.f24703a);
        }
        return 0;
    }

    /* renamed from: h */
    public final int mo60104h() {
        int a = mo16913a(6);
        if (a != 0) {
            return this.f24704b.getInt(a + this.f24703a);
        }
        return 0;
    }
}
