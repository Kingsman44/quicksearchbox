package androidx.mediarouter.p175a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.mediarouter.a.w */
/* compiled from: PG */
public final class C3750w {

    /* renamed from: a */
    public boolean f12037a = false;

    /* renamed from: b */
    private List f12038b;

    /* renamed from: a */
    public final C3751x mo7917a() {
        return new C3751x(this.f12038b, this.f12037a);
    }

    /* renamed from: b */
    public final void mo7918b(C3739l lVar) {
        if (lVar != null) {
            List list = this.f12038b;
            if (list == null) {
                this.f12038b = new ArrayList();
            } else if (list.contains(lVar)) {
                throw new IllegalArgumentException("route descriptor already added");
            }
            this.f12038b.add(lVar);
            return;
        }
        throw new IllegalArgumentException("route must not be null");
    }
}
