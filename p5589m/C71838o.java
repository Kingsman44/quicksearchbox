package p5589m;

import java.io.OutputStream;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: m.o */
/* compiled from: PG */
final class C71838o implements C71845v {

    /* renamed from: a */
    public final OutputStream f191365a;

    public C71838o(OutputStream outputStream) {
        C69664n.m101061g(outputStream, "out");
        this.f191365a = outputStream;
    }

    public final void close() {
        this.f191365a.close();
    }

    public final void flush() {
        this.f191365a.flush();
    }

    /* renamed from: mq */
    public final void mo62538mq(C71828e eVar, long j) {
        C71824ab.m105127a(eVar.f191356b, 0, j);
        while (j > 0) {
            C71848y.m105225a();
            C71842s sVar = eVar.f191355a;
            C69664n.m101058d(sVar);
            int min = (int) Math.min(j, (long) (sVar.f191375c - sVar.f191374b));
            this.f191365a.write(sVar.f191373a, sVar.f191374b, min);
            int i = sVar.f191374b + min;
            sVar.f191374b = i;
            long j2 = (long) min;
            j -= j2;
            eVar.f191356b -= j2;
            if (i == sVar.f191375c) {
                eVar.f191355a = sVar.mo63123a();
                C71843t.m105211b(sVar);
            }
        }
    }

    public final String toString() {
        OutputStream outputStream = this.f191365a;
        return "sink(" + outputStream + ")";
    }
}
