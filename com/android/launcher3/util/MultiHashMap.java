package com.android.launcher3.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
public final class MultiHashMap extends HashMap {
    public MultiHashMap() {
    }

    public final void addToList(Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) get(obj);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(obj2);
            put(obj, arrayList2);
            return;
        }
        arrayList.add(obj2);
    }

    public final MultiHashMap clone() {
        MultiHashMap multiHashMap = new MultiHashMap(size());
        for (Map.Entry entry : entrySet()) {
            multiHashMap.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        return multiHashMap;
    }

    public MultiHashMap(int i) {
        super(i);
    }
}
