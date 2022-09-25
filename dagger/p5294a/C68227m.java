package dagger.p5294a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p5460g.p5461a.C69464a;

/* renamed from: dagger.a.m */
/* compiled from: PG */
public final class C68227m implements C68220f {

    /* renamed from: a */
    public static final C68220f f184586a = C68221g.m98521a(Collections.emptySet());

    /* renamed from: b */
    private final List f184587b;

    /* renamed from: c */
    private final List f184588c;

    public C68227m(List list, List list2) {
        this.f184587b = list;
        this.f184588c = list2;
    }

    /* renamed from: a */
    public static C68220f m98535a() {
        return f184586a;
    }

    /* renamed from: c */
    public final Set mo17428b() {
        int size = this.f184587b.size();
        ArrayList arrayList = new ArrayList(this.f184588c.size());
        int size2 = this.f184588c.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((C69464a) this.f184588c.get(i)).mo17428b();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(C68217c.m98513a(size));
        int size3 = this.f184587b.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object b = ((C69464a) this.f184587b.get(i2)).mo17428b();
            b.getClass();
            hashSet.add(b);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object next : (Collection) arrayList.get(i3)) {
                next.getClass();
                hashSet.add(next);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
