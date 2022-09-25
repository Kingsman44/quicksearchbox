package androidx.mediarouter.p175a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.mediarouter.a.x */
/* compiled from: PG */
public final class C3751x {

    /* renamed from: a */
    final List f12039a;

    /* renamed from: b */
    final boolean f12040b;

    public C3751x(List list, boolean z) {
        this.f12039a = list == null ? Collections.emptyList() : list;
        this.f12040b = z;
    }

    /* renamed from: a */
    public static C3751x m10876a(Bundle bundle) {
        ArrayList arrayList = null;
        if (bundle == null) {
            return null;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            int size = parcelableArrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList2.add(C3739l.m10837l((Bundle) parcelableArrayList.get(i)));
            }
            arrayList = arrayList2;
        }
        return new C3751x(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    /* renamed from: b */
    public final boolean mo7919b() {
        int size = this.f12039a.size();
        for (int i = 0; i < size; i++) {
            C3739l lVar = (C3739l) this.f12039a.get(i);
            if (lVar == null || !lVar.mo7901t()) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "MediaRouteProviderDescriptor{ routes=" + Arrays.toString(this.f12039a.toArray()) + ", isValid=" + mo7919b() + " }";
    }
}
