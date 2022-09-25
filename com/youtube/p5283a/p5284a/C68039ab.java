package com.youtube.p5283a.p5284a;

import com.google.p370af.C7490c;
import com.google.p370af.C7492e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.youtube.a.a.ab */
/* compiled from: PG */
public final class C68039ab extends C7492e {
    /* renamed from: h */
    public static int m98252h(C7490c cVar, int i, int i2, int i3, int i4) {
        cVar.mo16906n(4);
        cVar.mo16910s(3, i4);
        cVar.mo16910s(2, i3);
        cVar.mo16910s(1, i2);
        cVar.mo16910s(0, i);
        return cVar.mo16895c();
    }

    /* renamed from: j */
    public static C68039ab m98253j(ByteBuffer byteBuffer) {
        C68039ab abVar = new C68039ab();
        m98254o(byteBuffer, abVar);
        return abVar;
    }

    /* renamed from: o */
    public static void m98254o(ByteBuffer byteBuffer, C68039ab abVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        abVar.mo16917e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* renamed from: g */
    public final int mo60095g() {
        int a = mo16913a(8);
        if (a != 0) {
            return mo16915c(a);
        }
        return 0;
    }

    /* renamed from: i */
    public final C68039ab mo60096i(int i) {
        C68039ab abVar = new C68039ab();
        int a = mo16913a(8);
        if (a == 0) {
            return null;
        }
        int b = mo16914b(a) + (i * 4);
        abVar.mo16917e(b + this.f24704b.getInt(b), this.f24704b);
        return abVar;
    }

    /* renamed from: k */
    public final C68044ag mo60097k() {
        return mo60098l(new C68044ag());
    }

    /* renamed from: l */
    public final C68044ag mo60098l(C68044ag agVar) {
        int a = mo16913a(4);
        if (a == 0) {
            return null;
        }
        int i = a + this.f24703a;
        agVar.mo16917e(i + this.f24704b.getInt(i), this.f24704b);
        return agVar;
    }

    /* renamed from: m */
    public final C68045ah mo60099m() {
        C68045ah ahVar = new C68045ah();
        int a = mo16913a(6);
        if (a == 0) {
            return null;
        }
        int i = a + this.f24703a;
        ahVar.mo16917e(i + this.f24704b.getInt(i), this.f24704b);
        return ahVar;
    }

    /* renamed from: n */
    public final String mo60100n() {
        int a = mo16913a(10);
        if (a != 0) {
            return mo16916d(a + this.f24703a);
        }
        return null;
    }
}
