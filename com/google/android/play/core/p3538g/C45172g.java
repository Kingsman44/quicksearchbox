package com.google.android.play.core.p3538g;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.play.core.g.g */
/* compiled from: PG */
public final class C45172g {

    /* renamed from: a */
    private final Map f117911a;

    public C45172g(Map map) {
        this.f117911a = map;
    }

    /* renamed from: a */
    public final Map mo49011a(Collection collection) {
        Set set;
        HashMap hashMap = new HashMap();
        for (String str : this.f117911a.keySet()) {
            if (!this.f117911a.containsKey(str)) {
                set = Collections.emptySet();
            } else {
                HashSet hashSet = new HashSet();
                for (Map.Entry entry : ((Map) this.f117911a.get(str)).entrySet()) {
                    if (collection.contains(entry.getKey())) {
                        hashSet.add((String) entry.getValue());
                    }
                }
                set = Collections.unmodifiableSet(hashSet);
            }
            hashMap.put(str, set);
        }
        return hashMap;
    }
}
