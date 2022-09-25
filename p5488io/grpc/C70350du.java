package p5488io.grpc;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;

/* renamed from: io.grpc.du */
/* compiled from: PG */
abstract class C70350du extends C70898m {
    /* renamed from: b */
    public C70256c mo62057b() {
        return mo61735c().mo62057b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C70898m mo61735c();

    /* renamed from: d */
    public void mo27480d(String str, Throwable th) {
        mo61735c().mo27480d(str, th);
    }

    /* renamed from: f */
    public void mo27481f() {
        mo61735c().mo27481f();
    }

    /* renamed from: g */
    public void mo27482g(int i) {
        mo61735c().mo27482g(i);
    }

    /* renamed from: i */
    public boolean mo62058i() {
        return mo61735c().mo62058i();
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("delegate", mo61735c());
        return b.toString();
    }
}
