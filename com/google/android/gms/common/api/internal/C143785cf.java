package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.C143919bh;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.api.internal.cf */
/* compiled from: PG */
public final class C143785cf {

    /* renamed from: a */
    public final Set f389808a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public static C143782cc m233679a(Object obj, String str) {
        C143919bh.m233971n(obj, "Listener must not be null");
        C143919bh.m233971n(str, "Listener type must not be null");
        C143919bh.m233970m(str, "Listener type must not be empty");
        return new C143782cc(obj, str);
    }

    /* renamed from: b */
    public static C143784ce m233680b(Object obj, Looper looper, String str) {
        C143919bh.m233971n(obj, "Listener must not be null");
        C143919bh.m233971n(looper, "Looper must not be null");
        C143919bh.m233971n(str, "Listener type must not be null");
        return new C143784ce(looper, obj, str);
    }

    /* renamed from: c */
    public static C143784ce m233681c(Object obj, Executor executor, String str) {
        C143919bh.m233971n(executor, "Executor must not be null");
        C143919bh.m233971n(str, "Listener type must not be null");
        return new C143784ce(executor, obj, str);
    }
}
