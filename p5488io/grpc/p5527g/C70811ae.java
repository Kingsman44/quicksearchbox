package p5488io.grpc.p5527g;

import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5525e.C70492f;
import p5488io.grpc.p5525e.C70580ig;
import p5589m.C71824ab;
import p5589m.C71828e;
import p5589m.C71842s;
import p5589m.C71843t;

/* renamed from: io.grpc.g.ae */
/* compiled from: PG */
final class C70811ae extends C70492f {

    /* renamed from: a */
    private final C71828e f188861a;

    public C70811ae(C71828e eVar) {
        this.f188861a = eVar;
    }

    public final void close() {
        C71828e eVar = this.f188861a;
        eVar.mo63078o(eVar.f191356b);
    }

    /* renamed from: f */
    public final int mo62098f() {
        try {
            return this.f188861a.mo63062c() & 255;
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }

    /* renamed from: g */
    public final int mo62099g() {
        return (int) this.f188861a.f191356b;
    }

    /* renamed from: h */
    public final C70580ig mo62100h(int i) {
        C71828e eVar = new C71828e();
        eVar.mo62538mq(this.f188861a, (long) i);
        return new C70811ae(eVar);
    }

    /* renamed from: j */
    public final void mo62102j(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: k */
    public final void mo62103k(OutputStream outputStream, int i) {
        C71828e eVar = this.f188861a;
        long j = (long) i;
        C69664n.m101061g(outputStream, "out");
        C71824ab.m105127a(eVar.f191356b, 0, j);
        C71842s sVar = eVar.f191355a;
        while (j > 0) {
            C69664n.m101058d(sVar);
            int min = (int) Math.min(j, (long) (sVar.f191375c - sVar.f191374b));
            outputStream.write(sVar.f191373a, sVar.f191374b, min);
            int i2 = sVar.f191374b + min;
            sVar.f191374b = i2;
            long j2 = (long) min;
            eVar.f191356b -= j2;
            j -= j2;
            if (i2 == sVar.f191375c) {
                C71842s a = sVar.mo63123a();
                eVar.f191355a = a;
                C71843t.m105211b(sVar);
                sVar = a;
            }
        }
    }

    /* renamed from: l */
    public final void mo62104l(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int d = this.f188861a.mo63064d(bArr, i, i2);
            if (d != -1) {
                i2 -= d;
                i += d;
            } else {
                throw new IndexOutOfBoundsException("EOF trying to read " + i2 + " bytes");
            }
        }
    }

    /* renamed from: m */
    public final void mo62105m(int i) {
        try {
            this.f188861a.mo63078o((long) i);
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }
}
