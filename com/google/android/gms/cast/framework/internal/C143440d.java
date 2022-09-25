package com.google.android.gms.cast.framework.internal;

import android.os.Bundle;
import com.google.common.p4522b.C58729pv;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.cast.framework.internal.d */
/* compiled from: PG */
public final class C143440d {
    /* renamed from: a */
    public static Map m232822a(Bundle bundle, String str) {
        Map map = (Map) bundle.getSerializable(str);
        if (map == null) {
            return C58729pv.f156485a;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!(entry == null || entry.getKey() == null || entry.getValue() == null)) {
                hashMap.put((Integer) entry.getKey(), (Integer) entry.getValue());
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
