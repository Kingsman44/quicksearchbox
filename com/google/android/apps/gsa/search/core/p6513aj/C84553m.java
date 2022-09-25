package com.google.android.apps.gsa.search.core.p6513aj;

import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.search.core.aj.m */
/* compiled from: PG */
public class C84553m {

    /* renamed from: a */
    private static final C59071e f230092a = C59071e.m91332i("com.google.android.apps.gsa.search.core.aj.m");

    /* renamed from: b */
    private final AtomicInteger f230093b = new AtomicInteger(1);

    /* renamed from: c */
    private C84551k f230094c;

    protected C84553m(C84551k kVar) {
        kVar.getClass();
        this.f230094c = kVar;
    }

    /* renamed from: e */
    public final void mo78283e() {
        if (this.f230093b.compareAndSet(1, 2)) {
            this.f230094c.mo78274d();
        }
    }

    /* renamed from: f */
    public final boolean mo78284f(C84552l lVar) {
        this.f230094c.getClass();
        if (this.f230093b.get() != 1) {
            return false;
        }
        this.f230094c.mo78273c(lVar);
        return true;
    }

    /* renamed from: g */
    public final boolean mo78285g(C90456c cVar) {
        if (this.f230093b.compareAndSet(1, 3)) {
            this.f230094c.mo78275e(cVar);
            return true;
        }
        ((C59052c) ((C59052c) ((C59052c) f230092a.mo56226d()).mo56382g(cVar.mo79845c())).mo56372aa(9417)).mo56389s("#setFailed called when state was %s", this.f230093b);
        return false;
    }
}
