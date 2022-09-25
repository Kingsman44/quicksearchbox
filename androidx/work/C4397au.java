package androidx.work;

import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.au */
/* compiled from: PG */
public final class C4397au {

    /* renamed from: a */
    final List f14032a = new ArrayList();

    /* renamed from: b */
    public final List f14033b = new ArrayList();

    /* renamed from: c */
    final List f14034c = new ArrayList();

    /* renamed from: d */
    final List f14035d = new ArrayList();

    /* renamed from: a */
    public static C4397au m12584a(List list) {
        C4397au auVar = new C4397au();
        auVar.f14034c.addAll(list);
        return auVar;
    }

    /* renamed from: b */
    public final C4398av mo9336b() {
        if (!this.f14032a.isEmpty() || !this.f14033b.isEmpty() || !this.f14034c.isEmpty() || !this.f14035d.isEmpty()) {
            return new C4398av(this);
        }
        throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
    }
}
