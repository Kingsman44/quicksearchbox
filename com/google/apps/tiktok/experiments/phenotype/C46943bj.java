package com.google.apps.tiktok.experiments.phenotype;

import com.google.apps.tiktok.experiments.C46904p;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.bj */
/* compiled from: PG */
public final class C46943bj implements C46940bg {

    /* renamed from: a */
    private final ReadWriteLock f122431a = new ReentrantReadWriteLock();

    /* renamed from: b */
    private final C47056j f122432b;

    /* renamed from: c */
    private final ConcurrentHashMap f122433c;

    public C46943bj(Map map, C46947bn bnVar) {
        C69664n.m101061g(map, "map");
        C69664n.m101061g(bnVar, "metadata");
        this.f122432b = new C47056j(map, bnVar);
        this.f122433c = new ConcurrentHashMap(20, 0.8f, 2);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final C46904p mo50927a(String str) {
        C69664n.m101061g(str, "experimentId");
        C46904p pVar = (C46904p) this.f122433c.get(str);
        if (pVar != null) {
            return pVar;
        }
        Lock readLock = this.f122431a.readLock();
        C69664n.m101060f(readLock, "lock.readLock()");
        readLock.lock();
        try {
            C46904p a = this.f122432b.mo50927a(str);
            this.f122433c.putIfAbsent(str, a);
            readLock.unlock();
            return a;
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public final C46947bn mo50928b() {
        Lock readLock = this.f122431a.readLock();
        C69664n.m101060f(readLock, "lock.readLock()");
        readLock.lock();
        try {
            return this.f122432b.f122643a;
        } finally {
            readLock.unlock();
        }
    }

    /* renamed from: c */
    public final Map mo50929c() {
        Lock readLock = this.f122431a.readLock();
        C69664n.m101060f(readLock, "lock.readLock()");
        readLock.lock();
        try {
            return this.f122432b.mo50929c();
        } finally {
            readLock.unlock();
        }
    }

    /* renamed from: d */
    public final void mo50930d() {
        throw new UnsupportedOperationException("Can't change observed values");
    }

    /* renamed from: f */
    public final boolean mo50931f() {
        return false;
    }

    /* renamed from: g */
    public final boolean mo50932g(Map map, C46947bn bnVar) {
        C69664n.m101061g(map, "newExperimentValues");
        Lock writeLock = this.f122431a.writeLock();
        C69664n.m101060f(writeLock, "lock.writeLock()");
        writeLock.lock();
        try {
            return this.f122432b.mo50932g(map, bnVar);
        } finally {
            writeLock.unlock();
        }
    }
}
