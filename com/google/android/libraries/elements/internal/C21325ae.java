package com.google.android.libraries.elements.internal;

import com.google.android.libraries.elements.interfaces.PerformOnceCommandController;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.libraries.elements.internal.ae */
/* compiled from: PG */
public final class C21325ae extends PerformOnceCommandController {

    /* renamed from: a */
    public static final Set f59685a = new HashSet();

    public final void clear() {
        Set set = f59685a;
        synchronized (set) {
            set.clear();
        }
    }

    public final boolean contains(String str) {
        boolean contains;
        Set set = f59685a;
        synchronized (set) {
            contains = set.contains(str);
        }
        return contains;
    }

    public final void insert(String str) {
        Set set = f59685a;
        synchronized (set) {
            set.add(str);
        }
    }
}
