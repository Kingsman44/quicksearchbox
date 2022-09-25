package com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.libraries.search.assistant.f.a.a.f */
/* compiled from: PG */
public final class C32601f {

    /* renamed from: a */
    public final Set f87295a = new HashSet();

    /* renamed from: b */
    public final Object f87296b = new Object();

    /* renamed from: a */
    public final void mo38178a() {
        ArrayList arrayList;
        synchronized (this.f87296b) {
            arrayList = new ArrayList(this.f87295a);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Runnable) arrayList.get(i)).run();
        }
    }
}
