package androidx.coordinatorlayout.widget;

import androidx.core.p097i.C1971f;
import androidx.core.p097i.C1972g;
import androidx.p060c.C0984n;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: androidx.coordinatorlayout.widget.j */
/* compiled from: PG */
public final class C1777j {

    /* renamed from: a */
    public final C1971f f5541a = new C1972g(10);

    /* renamed from: b */
    public final C0984n f5542b = new C0984n(0);

    /* renamed from: c */
    public final ArrayList f5543c = new ArrayList();

    /* renamed from: d */
    public final HashSet f5544d = new HashSet();

    /* renamed from: a */
    public final ArrayList mo4982a(Object obj) {
        return (ArrayList) this.f5542b.get(obj);
    }

    /* renamed from: b */
    public final void mo4983b(Object obj) {
        if (!this.f5542b.containsKey(obj)) {
            this.f5542b.put(obj, (Object) null);
        }
    }

    /* renamed from: c */
    public final void mo4984c(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (!hashSet.contains(obj)) {
                hashSet.add(obj);
                ArrayList arrayList2 = (ArrayList) this.f5542b.get(obj);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        mo4984c(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(obj);
                arrayList.add(obj);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }
}
