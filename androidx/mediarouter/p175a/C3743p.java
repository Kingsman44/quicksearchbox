package androidx.mediarouter.p175a;

import java.util.Collection;

/* renamed from: androidx.mediarouter.a.p */
/* compiled from: PG */
final class C3743p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3739l f12016a;

    /* renamed from: b */
    final /* synthetic */ Collection f12017b;

    /* renamed from: c */
    final /* synthetic */ C3745r f12018c;

    /* renamed from: d */
    final /* synthetic */ C3670af f12019d;

    public C3743p(C3745r rVar, C3670af afVar, C3739l lVar, Collection collection) {
        this.f12018c = rVar;
        this.f12019d = afVar;
        this.f12016a = lVar;
        this.f12017b = collection;
    }

    public final void run() {
        this.f12019d.mo7724a(this.f12018c, this.f12016a, this.f12017b);
    }
}
