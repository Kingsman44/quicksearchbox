package com.google.common.p4522b;

import com.google.common.base.C58832aw;
import com.google.common.base.C58839bc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.common.b.mz */
/* compiled from: PG */
final class C58652mz extends C58660ng {

    /* renamed from: a */
    final Map f156379a;

    /* renamed from: b */
    final C58839bc f156380b;

    public C58652mz(Map map, Map map2, C58839bc bcVar) {
        super(map);
        this.f156379a = map2;
        this.f156380b = bcVar;
    }

    public final boolean remove(Object obj) {
        Iterator it = this.f156379a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (this.f156380b.mo5941a(entry) && C58832aw.m90831a(entry.getValue(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public final boolean removeAll(Collection collection) {
        Iterator it = this.f156379a.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (this.f156380b.mo5941a(entry) && collection.contains(entry.getValue())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        Iterator it = this.f156379a.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (this.f156380b.mo5941a(entry) && !collection.contains(entry.getValue())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        C58570jy.m90163o(arrayList, it);
        return arrayList.toArray();
    }

    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        C58570jy.m90163o(arrayList, it);
        return arrayList.toArray(objArr);
    }
}
