package com.google.common.util.concurrent;

import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.common.util.concurrent.cm */
/* compiled from: PG */
enum C60859cm implements C60858cl {
    ;
    

    /* renamed from: b */
    private static final Set f164949b = null;

    static {
        f164949b = new CopyOnWriteArraySet();
    }

    private C60859cm() {
    }

    /* renamed from: a */
    public final void mo57339a(Class cls) {
        for (WeakReference weakReference : f164949b) {
            if (cls.equals(weakReference.get())) {
                return;
            }
        }
        C60861co.m92918d(cls);
        Set set = f164949b;
        if (set.size() > 1000) {
            set.clear();
        }
        set.add(new WeakReference(cls));
    }
}
