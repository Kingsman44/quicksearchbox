package com.youtube.p5283a.p5284a;

import com.google.p370af.C7492e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.youtube.a.a.am */
/* compiled from: PG */
public final class C68050am extends C7492e {
    /* renamed from: g */
    public static C68050am m98285g(ByteBuffer byteBuffer) {
        C68050am amVar = new C68050am();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        amVar.mo16917e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return amVar;
    }

    /* renamed from: h */
    public final String mo60121h() {
        int a = mo16913a(4);
        if (a != 0) {
            return mo16916d(a + this.f24703a);
        }
        return null;
    }
}
