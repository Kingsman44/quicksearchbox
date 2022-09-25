package com.google.android.enterprise.connectedapps;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.enterprise.connectedapps.i */
/* compiled from: PG */
public final /* synthetic */ class C142575i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C142543ac f386867a;

    /* renamed from: b */
    public final /* synthetic */ Object f386868b;

    /* renamed from: c */
    public final /* synthetic */ Object f386869c;

    public /* synthetic */ C142575i(C142543ac acVar, Object obj, Object obj2) {
        this.f386867a = acVar;
        this.f386868b = obj;
        this.f386869c = obj2;
    }

    public final void run() {
        C142543ac acVar = this.f386867a;
        Object obj = this.f386868b;
        Object obj2 = this.f386869c;
        Set set = (Set) acVar.f386817l.get(obj);
        if (set == null) {
            set = Collections.newSetFromMap(new WeakHashMap());
        }
        set.add(obj2);
        acVar.f386817l.put(obj, set);
    }
}
