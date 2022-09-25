package p5589m;

import java.io.IOException;
import java.io.InputStream;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: m.j */
/* compiled from: PG */
final class C71833j implements C71847x {

    /* renamed from: a */
    public final InputStream f191361a;

    public C71833j(InputStream inputStream) {
        C69664n.m101061g(inputStream, "input");
        this.f191361a = inputStream;
    }

    /* renamed from: a */
    public final long mo62472a(C71828e eVar, long j) {
        try {
            C71848y.m105225a();
            C71842s m = eVar.mo63076m(1);
            int read = this.f191361a.read(m.f191373a, m.f191375c, (int) Math.min(j, (long) (8192 - m.f191375c)));
            if (read != -1) {
                m.f191375c += read;
                long j2 = (long) read;
                eVar.f191356b += j2;
                return j2;
            } else if (m.f191374b != m.f191375c) {
                return -1;
            } else {
                eVar.f191355a = m.mo63123a();
                C71843t.m105211b(m);
                return -1;
            }
        } catch (AssertionError e) {
            if (C71834k.m105187d(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    public final void close() {
        this.f191361a.close();
    }

    public final String toString() {
        InputStream inputStream = this.f191361a;
        return "source(" + inputStream + ")";
    }
}
