package com.google.android.play.core.common;

import android.os.Bundle;
import com.google.android.play.core.p3529c.C45053a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: com.google.android.play.core.common.b */
/* compiled from: PG */
public final class C45057b {

    /* renamed from: a */
    private static final Map f117700a = new HashMap();

    static {
        new HashSet(Arrays.asList(new String[]{"app_update", "review"}));
        new HashSet(Arrays.asList(new String[]{"native", "unity"}));
        new C45053a("PlayCoreVersion");
    }

    /* renamed from: a */
    public static Bundle m80219a() {
        Bundle bundle = new Bundle();
        Map b = m80220b();
        bundle.putInt("playcore_version_code", ((Integer) b.get("java")).intValue());
        if (b.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) b.get("native")).intValue());
        }
        if (b.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) b.get("unity")).intValue());
        }
        return bundle;
    }

    /* renamed from: b */
    public static synchronized Map m80220b() {
        Map map;
        synchronized (C45057b.class) {
            Map map2 = f117700a;
            if (!map2.containsKey("app_update")) {
                HashMap hashMap = new HashMap();
                hashMap.put("java", 11004);
                map2.put("app_update", hashMap);
            }
            map = (Map) map2.get("app_update");
        }
        return map;
    }
}
