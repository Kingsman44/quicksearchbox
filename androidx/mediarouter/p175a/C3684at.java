package androidx.mediarouter.p175a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.mediarouter.a.at */
/* compiled from: PG */
public final class C3684at {

    /* renamed from: a */
    final C3749v f11857a;

    /* renamed from: b */
    final List f11858b = new ArrayList();

    /* renamed from: c */
    public final C3747t f11859c;

    /* renamed from: d */
    public C3751x f11860d;

    public C3684at(C3749v vVar) {
        this.f11857a = vVar;
        this.f11859c = vVar.f12030f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C3685au mo7752a(String str) {
        int size = this.f11858b.size();
        for (int i = 0; i < size; i++) {
            if (((C3685au) this.f11858b.get(i)).f11862b.equals(str)) {
                return (C3685au) this.f11858b.get(i);
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + this.f11859c.f12028a.getPackageName() + " }";
    }
}
