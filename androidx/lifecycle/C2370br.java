package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.lifecycle.br */
/* compiled from: PG */
public final class C2370br {

    /* renamed from: a */
    public final HashMap f6590a = new HashMap();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C2358bf mo5772a(String str) {
        return (C2358bf) this.f6590a.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Set mo5773b() {
        return new HashSet(this.f6590a.keySet());
    }

    /* renamed from: c */
    public final void mo5774c() {
        for (C2358bf bfVar : this.f6590a.values()) {
            bfVar.f6575y = true;
            synchronized (bfVar.f6573w) {
                for (Object t : bfVar.f6573w.values()) {
                    C2358bf.m6351t(t);
                }
            }
            synchronized (bfVar.f6574x) {
                for (Closeable t2 : bfVar.f6574x) {
                    C2358bf.m6351t(t2);
                }
            }
            bfVar.mo639d();
        }
        this.f6590a.clear();
    }
}
