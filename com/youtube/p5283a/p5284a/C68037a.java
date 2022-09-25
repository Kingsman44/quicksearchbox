package com.youtube.p5283a.p5284a;

import com.google.p370af.C7492e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.youtube.a.a.a */
/* compiled from: PG */
public final class C68037a extends C7492e {
    /* renamed from: i */
    public static void m98237i(ByteBuffer byteBuffer, C68037a aVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        aVar.mo16917e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* renamed from: g */
    public final String mo60081g() {
        int a = mo16913a(10);
        if (a != 0) {
            return mo16916d(a + this.f24703a);
        }
        return null;
    }

    /* renamed from: h */
    public final boolean mo60082h() {
        int a = mo16913a(14);
        return (a == 0 || this.f24704b.get(a + this.f24703a) == 0) ? false : true;
    }
}
