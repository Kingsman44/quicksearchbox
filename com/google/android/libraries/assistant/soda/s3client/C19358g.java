package com.google.android.libraries.assistant.soda.s3client;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.frameworks.client.data.android.p4638e.C61409d;
import com.google.frameworks.client.data.android.p4638e.C61412g;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5208h.C66652ds;
import com.google.speech.p5208h.C66653dt;
import java.util.ArrayDeque;
import p5488io.grpc.C70888j;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70868g;
import p5488io.grpc.p5533i.C70869h;
import p5488io.grpc.p5533i.C70877p;

/* renamed from: com.google.android.libraries.assistant.soda.s3client.g */
/* compiled from: PG */
public final class C19358g implements C19361j, C70877p {

    /* renamed from: d */
    private static final C59071e f54169d = C59071e.m91332i("com.google.android.libraries.assistant.soda.s3client.g");

    /* renamed from: a */
    public final Object f54170a = new Object();

    /* renamed from: b */
    public ArrayDeque f54171b;

    /* renamed from: c */
    public SodaTransportSession f54172c;

    /* renamed from: e */
    private final C70888j f54173e;

    /* renamed from: f */
    private C70868g f54174f;

    /* renamed from: g */
    private C66652ds f54175g;

    public C19358g(C70888j jVar) {
        this.f54173e = jVar;
    }

    /* renamed from: i */
    private final void m36864i(String str) {
        ((C59052c) ((C59052c) f54169d.mo56225c()).mo56372aa(47735)).mo56389s("handleError(): %s", str);
        synchronized (this.f54170a) {
            SodaTransportSession sodaTransportSession = this.f54172c;
            if (sodaTransportSession != null) {
                long j = sodaTransportSession.f54158a;
                if (j != 0) {
                    sodaTransportSession.nativeHandleError(j, str);
                } else {
                    throw new IllegalStateException("No native delegate. Was start/stop called?");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo20121a() {
        mo24496g();
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        Status d = Status.m102100d(th);
        ((C59052c) ((C59052c) ((C59052c) f54169d.mo56225c()).mo56382g(th)).mo56372aa(47740)).mo56389s("onError() %s", d);
        m36864i(d.getCode().name());
        mo24496g();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C66611ci ciVar = (C66611ci) obj;
        synchronized (this.f54170a) {
            SodaTransportSession sodaTransportSession = this.f54172c;
            if (sodaTransportSession != null) {
                long j = sodaTransportSession.f54158a;
                if (j != 0) {
                    sodaTransportSession.nativeHandleResponse(j, ciVar.toByteArray());
                } else {
                    throw new IllegalStateException("No native delegate. Was start/stop called?");
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo22390d(C70868g gVar) {
        gVar.mo62578d(new C19357f(this));
    }

    /* renamed from: e */
    public final void mo24494e(C66607ce ceVar) {
        C70868g gVar = this.f54174f;
        if (gVar != null) {
            if (!((C70869h) gVar).f189042b.mo62058i()) {
                ((C59052c) ((C59052c) f54169d.mo56226d()).mo56372aa(47734)).mo56386p("Enqueuing request before stream is ready");
            }
            this.f54174f.mo20123c(ceVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24495f(com.google.speech.p5208h.C66607ce r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f54170a
            monitor-enter(r0)
            io.grpc.i.g r1 = r3.f54174f     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x0050
            io.grpc.i.h r1 = (p5488io.grpc.p5533i.C70869h) r1     // Catch:{ all -> 0x0052 }
            io.grpc.m r1 = r1.f189042b     // Catch:{ all -> 0x0052 }
            boolean r1 = r1.mo62058i()     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x0020
            java.util.ArrayDeque r1 = r3.f54171b     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x001c
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0052 }
            if (r1 != 0) goto L_0x001c
            goto L_0x0020
        L_0x001c:
            r3.mo24494e(r4)     // Catch:{ all -> 0x0052 }
            goto L_0x004e
        L_0x0020:
            java.util.ArrayDeque r1 = r3.f54171b     // Catch:{ all -> 0x0052 }
            int r1 = r1.size()     // Catch:{ all -> 0x0052 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 >= r2) goto L_0x0030
            java.util.ArrayDeque r1 = r3.f54171b     // Catch:{ all -> 0x0052 }
            r1.addLast(r4)     // Catch:{ all -> 0x0052 }
            goto L_0x004e
        L_0x0030:
            com.google.common.f.e r4 = f54169d     // Catch:{ all -> 0x0052 }
            com.google.common.f.x r4 = r4.mo56226d()     // Catch:{ all -> 0x0052 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x0052 }
            r1 = 47742(0xba7e, float:6.6901E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r1)     // Catch:{ all -> 0x0052 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x0052 }
            java.lang.String r1 = "Pending request size limit exceeded."
            r4.mo56386p(r1)     // Catch:{ all -> 0x0052 }
            java.lang.String r4 = "REQ_LIMIT_EXCEEDED"
            r3.m36864i(r4)     // Catch:{ all -> 0x0052 }
            r3.mo24496g()     // Catch:{ all -> 0x0052 }
        L_0x004e:
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            return
        L_0x0050:
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            return
        L_0x0052:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.soda.s3client.C19358g.mo24495f(com.google.speech.h.ce):void");
    }

    /* renamed from: g */
    public final void mo24496g() {
        synchronized (this.f54170a) {
            C70868g gVar = this.f54174f;
            if (gVar != null) {
                gVar.mo20121a();
                this.f54174f = null;
            }
            SodaTransportSession sodaTransportSession = this.f54172c;
            if (sodaTransportSession != null) {
                sodaTransportSession.mo24485a(3);
                this.f54172c = null;
            }
        }
    }

    /* renamed from: h */
    public final boolean mo24497h(SodaTransportSession sodaTransportSession) {
        synchronized (this.f54170a) {
            if (this.f54174f != null) {
                ((C59052c) ((C59052c) f54169d.mo56226d()).mo56372aa(47746)).mo56386p("Already started.");
                return false;
            }
            this.f54171b = new ArrayDeque();
            this.f54172c = sodaTransportSession;
            C66652ds dsVar = (C66652ds) C66653dt.m97297a(this.f54173e).mo62577p(C61409d.f166071a, new C61412g());
            this.f54175g = dsVar;
            this.f54174f = (C70868g) dsVar.mo59701b(this);
            return true;
        }
    }
}
