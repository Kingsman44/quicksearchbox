package p5589m;

import java.io.IOException;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: m.b */
/* compiled from: PG */
public final class C71825b implements C71845v {

    /* renamed from: a */
    final /* synthetic */ C71845v f191352a;

    public C71825b(C71845v vVar) {
        this.f191352a = vVar;
    }

    public final void close() {
        try {
            ((C71838o) this.f191352a).f191365a.close();
        } catch (IOException e) {
            throw e;
        } finally {
            C71819a.m105120a();
        }
    }

    public final void flush() {
        try {
            ((C71838o) this.f191352a).f191365a.flush();
        } catch (IOException e) {
            throw e;
        } finally {
            C71819a.m105120a();
        }
    }

    /* renamed from: mq */
    public final void mo62538mq(C71828e eVar, long j) {
        C71824ab.m105127a(eVar.f191356b, 0, j);
        while (true) {
            long j2 = 0;
            if (j > 0) {
                C71842s sVar = eVar.f191355a;
                C69664n.m101058d(sVar);
                while (true) {
                    if (j2 >= 65536) {
                        break;
                    }
                    j2 += (long) (sVar.f191375c - sVar.f191374b);
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    } else {
                        sVar = sVar.f191378f;
                        C69664n.m101058d(sVar);
                    }
                }
                try {
                    this.f191352a.mo62538mq(eVar, j2);
                    j -= j2;
                } catch (IOException e) {
                    throw e;
                } finally {
                    C71819a.m105120a();
                }
            } else {
                return;
            }
        }
    }

    public final String toString() {
        C71845v vVar = this.f191352a;
        return "AsyncTimeout.sink(" + vVar + ")";
    }
}
