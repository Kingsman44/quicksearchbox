package androidx.lifecycle;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.lifecycle.aq */
/* compiled from: PG */
public final class C2342aq {
    /* renamed from: a */
    public static final C2344as m6328a(Bundle bundle, Bundle bundle2) {
        if (bundle != null) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = parcelableArrayList.get(i);
                C69664n.m101059e(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
            }
            return new C2344as(linkedHashMap);
        } else if (bundle2 == null) {
            return new C2344as();
        } else {
            HashMap hashMap = new HashMap();
            for (String str : bundle2.keySet()) {
                C69664n.m101060f(str, "key");
                hashMap.put(str, bundle2.get(str));
            }
            return new C2344as(hashMap);
        }
    }
}
