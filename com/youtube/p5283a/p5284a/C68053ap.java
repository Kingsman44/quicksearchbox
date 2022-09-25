package com.youtube.p5283a.p5284a;

import com.google.p370af.C7492e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.youtube.a.a.ap */
/* compiled from: PG */
public final class C68053ap extends C7492e {
    /* renamed from: j */
    public static C68053ap m98290j(ByteBuffer byteBuffer) {
        C68053ap apVar = new C68053ap();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        apVar.mo16917e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return apVar;
    }

    /* renamed from: g */
    public final C68051an mo60125g() {
        C68051an anVar = new C68051an();
        int a = mo16913a(6);
        if (a == 0) {
            return null;
        }
        int i = a + this.f24703a;
        anVar.mo16917e(i + this.f24704b.getInt(i), this.f24704b);
        return anVar;
    }

    /* renamed from: h */
    public final C68051an mo60126h() {
        C68051an anVar = new C68051an();
        int a = mo16913a(8);
        if (a == 0) {
            return null;
        }
        int i = a + this.f24703a;
        anVar.mo16917e(i + this.f24704b.getInt(i), this.f24704b);
        return anVar;
    }

    /* renamed from: i */
    public final C68051an mo60127i() {
        C68051an anVar = new C68051an();
        int a = mo16913a(4);
        if (a == 0) {
            return null;
        }
        int i = a + this.f24703a;
        anVar.mo16917e(i + this.f24704b.getInt(i), this.f24704b);
        return anVar;
    }
}
