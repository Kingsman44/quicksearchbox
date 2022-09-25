package org.chromium.net.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.chromium.net.UrlResponseInfo;

/* renamed from: org.chromium.net.impl.cr */
/* compiled from: PG */
public final class C72512cr extends UrlResponseInfo.HeaderBlock {

    /* renamed from: a */
    public final List f192949a;

    /* renamed from: b */
    private Map f192950b;

    public C72512cr(List list) {
        this.f192949a = list;
    }

    public final List getAsList() {
        return this.f192949a;
    }

    public final Map getAsMap() {
        Map map = this.f192950b;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry entry : this.f192949a) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add((String) entry.getValue());
            treeMap.put((String) entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        Map unmodifiableMap = Collections.unmodifiableMap(treeMap);
        this.f192950b = unmodifiableMap;
        return unmodifiableMap;
    }
}
