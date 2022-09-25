package com.google.android.libraries.elements.p1705a.p1706a;

import com.google.android.libraries.elements.interfaces.ClientResourceProxy;
import com.google.android.libraries.elements.interfaces.ImageSourceProxy;
import com.youtube.p5283a.p5284a.C68052ao;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.libraries.elements.a.a.g */
/* compiled from: PG */
final class C20683g extends ImageSourceProxy {

    /* renamed from: a */
    private final C68052ao f57967a;

    /* renamed from: b */
    private byte[] f57968b = new byte[0];

    public C20683g(C68052ao aoVar) {
        this.f57967a = aoVar;
        int a = aoVar.mo16913a(6);
        if (a != 0 && aoVar.mo16915c(a) != 0) {
            ByteBuffer f = aoVar.mo16918f(6);
            byte[] bArr = new byte[f.remaining()];
            this.f57968b = bArr;
            f.get(bArr);
        }
    }

    public final ClientResourceProxy clientResource() {
        if (this.f57967a.mo60124g() != null) {
            return new C20678b(this.f57967a.mo60124g());
        }
        return null;
    }

    public final long height() {
        C68052ao aoVar = this.f57967a;
        int a = aoVar.mo16913a(12);
        if (a != 0) {
            return ((long) aoVar.f24704b.getInt(a + aoVar.f24703a)) & 4294967295L;
        }
        return 0;
    }

    public final byte[] imageData() {
        return this.f57968b;
    }

    public final String url() {
        C68052ao aoVar = this.f57967a;
        int a = aoVar.mo16913a(4);
        if (a != 0) {
            return aoVar.mo16916d(a + aoVar.f24703a);
        }
        return null;
    }

    public final long width() {
        C68052ao aoVar = this.f57967a;
        int a = aoVar.mo16913a(10);
        if (a != 0) {
            return ((long) aoVar.f24704b.getInt(a + aoVar.f24703a)) & 4294967295L;
        }
        return 0;
    }
}
