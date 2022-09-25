package com.google.firebase.components;

import com.google.firebase.analytics.connector.C61119c;
import com.google.firebase.p4609b.C61124b;
import com.google.firebase.p4609b.C61125c;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.firebase.components.x */
/* compiled from: PG */
final class C61170x implements C61125c, C61124b {

    /* renamed from: a */
    public Queue f165509a = new ArrayDeque();

    /* renamed from: b */
    private final Map f165510b = new HashMap();

    /* renamed from: a */
    public final synchronized void mo57689a(Class cls, Executor executor, C61119c cVar) {
        if (!this.f165510b.containsKey(cls)) {
            this.f165510b.put(cls, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.f165510b.get(cls)).put(cVar, executor);
    }

    /* renamed from: b */
    public final synchronized Set mo57733b() {
        throw null;
    }
}
