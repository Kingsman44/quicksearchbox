package androidx.mediarouter.p175a;

import java.util.Collection;

/* renamed from: androidx.mediarouter.a.o */
/* compiled from: PG */
final class C3742o implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3739l f12012a;

    /* renamed from: b */
    final /* synthetic */ Collection f12013b;

    /* renamed from: c */
    final /* synthetic */ C3745r f12014c;

    /* renamed from: d */
    final /* synthetic */ C3670af f12015d;

    public C3742o(C3745r rVar, C3670af afVar, C3739l lVar, Collection collection) {
        this.f12014c = rVar;
        this.f12015d = afVar;
        this.f12012a = lVar;
        this.f12013b = collection;
    }

    public final void run() {
        this.f12015d.mo7724a(this.f12014c, this.f12012a, this.f12013b);
    }
}
