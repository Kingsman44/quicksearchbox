package com.google.android.setupcompat.internal;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.ArrayMap;
import com.google.android.setupcompat.p3550b.C45245b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.google.android.setupcompat.internal.f */
/* compiled from: PG */
public final class C45258f {

    /* renamed from: a */
    private static final C45245b f118221a = new C45245b("PersistableBundles");

    /* renamed from: a */
    public static Bundle m80626a(PersistableBundle persistableBundle) {
        Bundle bundle = new Bundle();
        bundle.putAll(persistableBundle);
        return bundle;
    }

    /* renamed from: b */
    public static PersistableBundle m80627b(PersistableBundle persistableBundle, PersistableBundle persistableBundle2, PersistableBundle... persistableBundleArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(new PersistableBundle[]{persistableBundle, persistableBundle2}));
        Collections.addAll(arrayList, persistableBundleArr);
        PersistableBundle persistableBundle3 = new PersistableBundle();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            PersistableBundle persistableBundle4 = (PersistableBundle) arrayList.get(i);
            for (String str : persistableBundle4.keySet()) {
                C45259g.m80632a(!persistableBundle3.containsKey(str), String.format("Found duplicate key [%s] while attempting to merge bundles.", new Object[]{str}));
            }
            persistableBundle3.putAll(persistableBundle4);
        }
        return persistableBundle3;
    }

    /* renamed from: c */
    public static boolean m80628c(PersistableBundle persistableBundle, PersistableBundle persistableBundle2) {
        return persistableBundle == persistableBundle2 || m80630e(persistableBundle).equals(m80630e(persistableBundle2));
    }

    /* renamed from: d */
    public static void m80629d(PersistableBundle persistableBundle) {
        C45259g.m80634c(persistableBundle, "PersistableBundle cannot be null!");
        for (String str : persistableBundle.keySet()) {
            Object obj = persistableBundle.get(str);
            C45259g.m80632a(m80631f(obj), String.format("Unknown/unsupported data type [%s] for key %s", new Object[]{obj, str}));
        }
    }

    /* renamed from: e */
    private static ArrayMap m80630e(BaseBundle baseBundle) {
        if (baseBundle.isEmpty()) {
            return new ArrayMap(0);
        }
        ArrayMap arrayMap = new ArrayMap(baseBundle.size());
        for (String next : baseBundle.keySet()) {
            Object obj = baseBundle.get(next);
            if (!m80631f(obj)) {
                f118221a.mo49115e(String.format("Unknown/unsupported data type [%s] for key %s", new Object[]{obj, next}));
            } else {
                arrayMap.put(next, baseBundle.get(next));
            }
        }
        return arrayMap;
    }

    /* renamed from: f */
    private static boolean m80631f(Object obj) {
        return (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof String) || (obj instanceof Boolean);
    }
}
