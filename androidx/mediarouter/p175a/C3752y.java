package androidx.mediarouter.p175a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: androidx.mediarouter.a.y */
/* compiled from: PG */
public final class C3752y {

    /* renamed from: a */
    private ArrayList f12041a;

    public C3752y() {
    }

    public C3752y(C3753z zVar) {
        if (zVar != null) {
            zVar.mo7926c();
            if (!zVar.f12044c.isEmpty()) {
                this.f12041a = new ArrayList(zVar.f12044c);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    /* renamed from: a */
    public final C3753z mo7921a() {
        if (this.f12041a == null) {
            return C3753z.f12042a;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.f12041a);
        return new C3753z(bundle, this.f12041a);
    }

    /* renamed from: b */
    public final void mo7922b(Collection collection) {
        if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                mo7923c((String) it.next());
            }
        }
    }

    /* renamed from: c */
    public final void mo7923c(String str) {
        if (str != null) {
            if (this.f12041a == null) {
                this.f12041a = new ArrayList();
            }
            if (!this.f12041a.contains(str)) {
                this.f12041a.add(str);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("category must not be null");
    }

    /* renamed from: d */
    public final void mo7924d(C3753z zVar) {
        if (zVar != null) {
            mo7922b(zVar.mo7925b());
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }
}
