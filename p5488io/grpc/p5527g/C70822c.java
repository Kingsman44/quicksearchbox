package p5488io.grpc.p5527g;

import java.io.IOException;
import java.net.Socket;
import p5589m.C71828e;
import p5589m.C71845v;

/* renamed from: io.grpc.g.c */
/* compiled from: PG */
final class C70822c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C70825f f188879a;

    public C70822c(C70825f fVar) {
        this.f188879a = fVar;
    }

    public final void run() {
        try {
            C70825f fVar = this.f188879a;
            C71845v vVar = fVar.f188887f;
            if (vVar != null) {
                C71828e eVar = fVar.f188883b;
                long j = eVar.f191356b;
                if (j > 0) {
                    vVar.mo62538mq(eVar, j);
                }
            }
        } catch (IOException e) {
            this.f188879a.f188884c.mo62539a(e);
        }
        try {
            C71845v vVar2 = this.f188879a.f188887f;
            if (vVar2 != null) {
                vVar2.close();
            }
        } catch (IOException e2) {
            this.f188879a.f188884c.mo62539a(e2);
        }
        try {
            Socket socket = this.f188879a.f188888g;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e3) {
            this.f188879a.f188884c.mo62539a(e3);
        }
    }
}
