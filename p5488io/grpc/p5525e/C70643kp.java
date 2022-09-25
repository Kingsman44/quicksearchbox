package p5488io.grpc.p5525e;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.kp */
/* compiled from: PG */
final class C70643kp implements C70659le {
    /* renamed from: a */
    public final void mo62381a(Status status) {
    }

    /* renamed from: b */
    public final void mo62382b() {
    }

    /* renamed from: d */
    public final void mo62083d(C70672lr lrVar) {
        while (true) {
            InputStream g = lrVar.mo61868g();
            if (g != null) {
                try {
                    g.close();
                } catch (IOException e) {
                    while (true) {
                        InputStream g2 = lrVar.mo61868g();
                        if (g2 != null) {
                            try {
                                g2.close();
                            } catch (IOException e2) {
                                C70652ky.f188339b.logp(Level.WARNING, "io.grpc.internal.ServerImpl$NoopListener", "messagesAvailable", "Exception closing stream", e2);
                            }
                        } else {
                            throw new RuntimeException(e);
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public final void mo62084e() {
    }
}
