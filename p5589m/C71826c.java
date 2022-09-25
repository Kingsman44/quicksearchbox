package p5589m;

import java.io.IOException;

/* renamed from: m.c */
/* compiled from: PG */
public final class C71826c implements C71847x {

    /* renamed from: a */
    final /* synthetic */ C71847x f191353a;

    public C71826c(C71847x xVar) {
        this.f191353a = xVar;
    }

    /* renamed from: a */
    public final long mo62472a(C71828e eVar, long j) {
        try {
            return this.f191353a.mo62472a(eVar, j);
        } catch (IOException e) {
            throw e;
        } finally {
            C71819a.m105120a();
        }
    }

    public final void close() {
        try {
            ((C71833j) this.f191353a).f191361a.close();
        } catch (IOException e) {
            throw e;
        } finally {
            C71819a.m105120a();
        }
    }

    public final String toString() {
        C71847x xVar = this.f191353a;
        return "AsyncTimeout.source(" + xVar + ")";
    }
}
