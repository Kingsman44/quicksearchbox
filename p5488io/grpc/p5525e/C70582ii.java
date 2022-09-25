package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* renamed from: io.grpc.e.ii */
/* compiled from: PG */
final class C70582ii extends C70492f {

    /* renamed from: a */
    int f188155a;

    /* renamed from: b */
    final int f188156b;

    /* renamed from: c */
    final byte[] f188157c;

    /* renamed from: d */
    int f188158d = -1;

    public C70582ii(byte[] bArr, int i, int i2) {
        boolean z = true;
        C58838bb.m90869d(i >= 0, "offset must be >= 0");
        C58838bb.m90869d(i2 >= 0, "length must be >= 0");
        int i3 = i2 + i;
        C58838bb.m90869d(i3 > 0 ? false : z, "offset + length exceeds array boundary");
        this.f188157c = bArr;
        this.f188155a = i;
        this.f188156b = i3;
    }

    /* renamed from: b */
    public final void mo62093b() {
        this.f188158d = this.f188155a;
    }

    /* renamed from: c */
    public final void mo62094c() {
        int i = this.f188158d;
        if (i != -1) {
            this.f188155a = i;
            return;
        }
        throw new InvalidMarkException();
    }

    /* renamed from: d */
    public final boolean mo62096d() {
        return true;
    }

    /* renamed from: f */
    public final int mo62098f() {
        mo62209a(1);
        byte[] bArr = this.f188157c;
        int i = this.f188155a;
        this.f188155a = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: g */
    public final int mo62099g() {
        return this.f188156b - this.f188155a;
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C70580ig mo62100h(int i) {
        mo62209a(i);
        int i2 = this.f188155a;
        this.f188155a = i2 + i;
        return new C70582ii(this.f188157c, i2, i);
    }

    /* renamed from: j */
    public final void mo62102j(ByteBuffer byteBuffer) {
        C58838bb.m90866a(byteBuffer, "dest");
        int remaining = byteBuffer.remaining();
        mo62209a(remaining);
        byteBuffer.put(this.f188157c, this.f188155a, remaining);
        this.f188155a += remaining;
    }

    /* renamed from: k */
    public final void mo62103k(OutputStream outputStream, int i) {
        mo62209a(i);
        outputStream.write(this.f188157c, this.f188155a, i);
        this.f188155a += i;
    }

    /* renamed from: l */
    public final void mo62104l(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f188157c, this.f188155a, bArr, i, i2);
        this.f188155a += i2;
    }

    /* renamed from: m */
    public final void mo62105m(int i) {
        mo62209a(i);
        this.f188155a += i;
    }
}
