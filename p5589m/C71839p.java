package p5589m;

import java.nio.ByteBuffer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: m.p */
/* compiled from: PG */
public final class C71839p implements C71829f {

    /* renamed from: a */
    public final C71845v f191366a;

    /* renamed from: b */
    public final C71828e f191367b = new C71828e();

    /* renamed from: c */
    public boolean f191368c;

    public C71839p(C71845v vVar) {
        C69664n.m101061g(vVar, "sink");
        this.f191366a = vVar;
    }

    /* renamed from: b */
    public final void mo63111b() {
        if (!this.f191368c) {
            long f = this.f191367b.mo63067f();
            if (f > 0) {
                this.f191366a.mo62538mq(this.f191367b, f);
                return;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final void close() {
        Throwable th;
        if (!this.f191368c) {
            try {
                C71828e eVar = this.f191367b;
                long j = eVar.f191356b;
                th = null;
                if (j > 0) {
                    this.f191366a.mo62538mq(eVar, j);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f191366a.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f191368c = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public final void flush() {
        if (!this.f191368c) {
            C71828e eVar = this.f191367b;
            long j = eVar.f191356b;
            if (j > 0) {
                this.f191366a.mo62538mq(eVar, j);
            }
            this.f191366a.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final boolean isOpen() {
        return !this.f191368c;
    }

    public final String toString() {
        C71845v vVar = this.f191366a;
        return "buffer(" + vVar + ")";
    }

    /* renamed from: B */
    public final void mo63060B(String str) {
        C69664n.m101061g(str, "string");
        if (!this.f191368c) {
            this.f191367b.mo63059A(str);
            mo63111b();
            return;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: mq */
    public final void mo62538mq(C71828e eVar, long j) {
        C69664n.m101061g(eVar, "source");
        if (!this.f191368c) {
            this.f191367b.mo62538mq(eVar, j);
            mo63111b();
            return;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: w */
    public final void mo63088w(int i) {
        if (!this.f191368c) {
            this.f191367b.mo63087v(i);
            mo63111b();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final int write(ByteBuffer byteBuffer) {
        C69664n.m101061g(byteBuffer, "source");
        if (!this.f191368c) {
            int write = this.f191367b.write(byteBuffer);
            mo63111b();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: y */
    public final void mo63091y(int i) {
        if (!this.f191368c) {
            this.f191367b.mo63090x(i);
            mo63111b();
            return;
        }
        throw new IllegalStateException("closed");
    }
}
