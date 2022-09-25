package com.google.common.base;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.common.base.cc */
/* compiled from: PG */
public final class C58866cc {
    /* renamed from: a */
    public static final Map m90931a(CharSequence charSequence, C58869cf cfVar, C58869cf cfVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : cfVar.mo56153g(charSequence)) {
            Iterator h = cfVar2.mo56154h(str);
            C58838bb.m90873h(h.hasNext(), "Chunk [%s] is not a valid entry", str);
            String str2 = (String) h.next();
            C58838bb.m90873h(!linkedHashMap.containsKey(str2), "Duplicate key [%s] found.", str2);
            C58838bb.m90873h(h.hasNext(), "Chunk [%s] is not a valid entry", str);
            linkedHashMap.put(str2, (String) h.next());
            C58838bb.m90873h(!h.hasNext(), "Chunk [%s] is not a valid entry", str);
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }
}
