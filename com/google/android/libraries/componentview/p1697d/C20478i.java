package com.google.android.libraries.componentview.p1697d;

import android.view.View;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.componentview.d.i */
/* compiled from: PG */
public final class C20478i {

    /* renamed from: a */
    private static final Map f57593a = new HashMap();

    static {
        new AtomicInteger(1);
    }

    /* renamed from: a */
    public static int m38430a(String str) {
        Map map = f57593a;
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(View.generateViewId()));
        }
        return ((Integer) map.get(str)).intValue();
    }
}
