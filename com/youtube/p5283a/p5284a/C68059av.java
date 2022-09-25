package com.youtube.p5283a.p5284a;

import com.google.p370af.C7492e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.youtube.a.a.av */
/* compiled from: PG */
public final class C68059av extends C7492e {
    /* renamed from: i */
    public static C68059av m98306i(ByteBuffer byteBuffer) {
        C68059av avVar = new C68059av();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        avVar.mo16917e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return avVar;
    }

    /* renamed from: g */
    public final int mo60139g() {
        int a = mo16913a(4);
        if (a != 0) {
            return mo16915c(a);
        }
        return 0;
    }

    /* renamed from: h */
    public final int mo60140h() {
        int a = mo16913a(6);
        if (a != 0) {
            return this.f24704b.getInt(a + this.f24703a);
        }
        return 0;
    }

    /* renamed from: j */
    public final void mo60141j(C68060aw awVar, int i) {
        int a = mo16913a(4);
        if (a != 0) {
            int b = mo16914b(a) + (i * 4);
            awVar.mo16917e(b + this.f24704b.getInt(b), this.f24704b);
        }
    }
}
