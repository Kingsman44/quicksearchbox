package com.google.common.p4522b;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.google.common.b.ln */
/* compiled from: PG */
class C58613ln extends ReentrantLock {

    /* renamed from: a */
    final C58635mi f156323a;

    /* renamed from: b */
    volatile int f156324b;

    /* renamed from: c */
    int f156325c;

    /* renamed from: d */
    int f156326d;

    /* renamed from: e */
    volatile AtomicReferenceArray f156327e;

    /* renamed from: f */
    final int f156328f;

    /* renamed from: g */
    final AtomicInteger f156329g = new AtomicInteger();

    public C58613ln(C58635mi miVar, int i) {
        this.f156323a = miVar;
        this.f156328f = -1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i);
        int length = (atomicReferenceArray.length() * 3) / 4;
        this.f156326d = length;
        if (length == -1) {
            this.f156326d = length + 1;
        }
        this.f156327e = atomicReferenceArray;
    }

    /* renamed from: m */
    static boolean m90256m(C58608li liVar) {
        return liVar.mo55636d() == null;
    }

    /* renamed from: n */
    static final void m90257n(ReferenceQueue referenceQueue) {
        do {
        } while (referenceQueue.poll() != null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C58608li mo55662a(C58608li liVar, C58608li liVar2) {
        return this.f156323a.f156358g.mo55648a(this, liVar, liVar2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C58608li mo55663b(Object obj, int i) {
        if (this.f156324b == 0) {
            return null;
        }
        AtomicReferenceArray atomicReferenceArray = this.f156327e;
        for (C58608li liVar = (C58608li) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); liVar != null; liVar = liVar.mo55634b()) {
            if (liVar.mo55633a() == i) {
                Object c = liVar.mo55635c();
                if (c == null) {
                    mo55673l();
                } else if (this.f156323a.f156357f.mo56077d(obj, c)) {
                    return liVar;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C58608li mo55664c(C58608li liVar, C58608li liVar2) {
        int i = this.f156324b;
        C58608li b = liVar2.mo55634b();
        while (liVar != liVar2) {
            C58608li a = mo55662a(liVar, b);
            if (a == null) {
                i--;
            } else {
                b = a;
            }
            liVar = liVar.mo55634b();
        }
        this.f156324b = i;
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Object mo55665d(Object obj, int i, Object obj2, boolean z) {
        Object obj3 = obj;
        int i2 = i;
        Object obj4 = obj2;
        lock();
        try {
            mo55671j();
            int i3 = this.f156324b + 1;
            if (i3 > this.f156326d) {
                AtomicReferenceArray atomicReferenceArray = this.f156327e;
                int length = atomicReferenceArray.length();
                if (length < 1073741824) {
                    int i4 = this.f156324b;
                    AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length + length);
                    this.f156326d = (atomicReferenceArray2.length() * 3) / 4;
                    int length2 = atomicReferenceArray2.length() - 1;
                    for (int i5 = 0; i5 < length; i5++) {
                        C58608li liVar = (C58608li) atomicReferenceArray.get(i5);
                        if (liVar != null) {
                            C58608li b = liVar.mo55634b();
                            int a = liVar.mo55633a() & length2;
                            if (b == null) {
                                atomicReferenceArray2.set(a, liVar);
                            } else {
                                C58608li liVar2 = liVar;
                                while (b != null) {
                                    int a2 = b.mo55633a() & length2;
                                    int i6 = a2 != a ? a2 : a;
                                    if (a2 != a) {
                                        liVar2 = b;
                                    }
                                    b = b.mo55634b();
                                    a = i6;
                                }
                                atomicReferenceArray2.set(a, liVar2);
                                while (liVar != liVar2) {
                                    int a3 = liVar.mo55633a() & length2;
                                    C58608li a4 = mo55662a(liVar, (C58608li) atomicReferenceArray2.get(a3));
                                    if (a4 != null) {
                                        atomicReferenceArray2.set(a3, a4);
                                    } else {
                                        i4--;
                                    }
                                    liVar = liVar.mo55634b();
                                }
                            }
                        }
                    }
                    this.f156327e = atomicReferenceArray2;
                    this.f156324b = i4;
                }
                i3 = this.f156324b + 1;
            }
            AtomicReferenceArray atomicReferenceArray3 = this.f156327e;
            int length3 = (atomicReferenceArray3.length() - 1) & i2;
            C58608li liVar3 = (C58608li) atomicReferenceArray3.get(length3);
            C58608li liVar4 = liVar3;
            while (liVar4 != null) {
                Object c = liVar4.mo55635c();
                if (liVar4.mo55633a() != i2 || c == null || !this.f156323a.f156357f.mo56077d(obj3, c)) {
                    liVar4 = liVar4.mo55634b();
                } else {
                    Object d = liVar4.mo55636d();
                    if (d == null) {
                        this.f156325c++;
                        mo55672k(liVar4, obj4);
                        this.f156324b = this.f156324b;
                        return null;
                    } else if (z) {
                        unlock();
                        return d;
                    } else {
                        this.f156325c++;
                        mo55672k(liVar4, obj4);
                        unlock();
                        return d;
                    }
                }
            }
            this.f156325c++;
            C58608li b2 = this.f156323a.f156358g.mo55649b(this, obj3, i2, liVar3);
            mo55672k(b2, obj4);
            atomicReferenceArray3.set(length3, b2);
            this.f156324b = i3;
            unlock();
            return null;
        } finally {
            unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo55666e(ReferenceQueue referenceQueue) {
        int i = 0;
        do {
            Reference poll = referenceQueue.poll();
            if (poll != null) {
                C58608li liVar = (C58608li) poll;
                C58635mi miVar = this.f156323a;
                int a = liVar.mo55633a();
                C58613ln c = miVar.mo55689c(a);
                c.lock();
                try {
                    int i2 = c.f156324b;
                    AtomicReferenceArray atomicReferenceArray = c.f156327e;
                    int length = a & (atomicReferenceArray.length() - 1);
                    C58608li liVar2 = (C58608li) atomicReferenceArray.get(length);
                    C58608li liVar3 = liVar2;
                    while (true) {
                        if (liVar3 == null) {
                            break;
                        } else if (liVar3 == liVar) {
                            c.f156325c++;
                            atomicReferenceArray.set(length, c.mo55664c(liVar2, liVar3));
                            c.f156324b--;
                            break;
                        } else {
                            liVar3 = liVar3.mo55634b();
                        }
                    }
                    c.unlock();
                    i++;
                } catch (Throwable th) {
                    c.unlock();
                    throw th;
                }
            } else {
                return;
            }
        } while (i != 16);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo55667f(ReferenceQueue referenceQueue) {
        int i = 0;
        do {
            Reference poll = referenceQueue.poll();
            if (poll != null) {
                C58632mf mfVar = (C58632mf) poll;
                C58635mi miVar = this.f156323a;
                C58608li a = mfVar.mo55629a();
                int a2 = a.mo55633a();
                C58613ln c = miVar.mo55689c(a2);
                Object c2 = a.mo55635c();
                c.lock();
                try {
                    int i2 = c.f156324b;
                    AtomicReferenceArray atomicReferenceArray = c.f156327e;
                    int length = (atomicReferenceArray.length() - 1) & a2;
                    C58608li liVar = (C58608li) atomicReferenceArray.get(length);
                    C58608li liVar2 = liVar;
                    while (true) {
                        if (liVar2 == null) {
                            break;
                        }
                        Object c3 = liVar2.mo55635c();
                        if (liVar2.mo55633a() != a2 || c3 == null || !c.f156323a.f156357f.mo56077d(c2, c3)) {
                            liVar2 = liVar2.mo55634b();
                        } else if (((C58631me) liVar2).mo55675e() == mfVar) {
                            c.f156325c++;
                            atomicReferenceArray.set(length, c.mo55664c(liVar, liVar2));
                            c.f156324b--;
                        }
                    }
                    c.unlock();
                    i++;
                } catch (Throwable th) {
                    c.unlock();
                    throw th;
                }
            } else {
                return;
            }
        } while (i != 16);
    }

    /* renamed from: g */
    public void mo55668g() {
    }

    /* renamed from: h */
    public void mo55669h() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo55670i() {
        if ((this.f156329g.incrementAndGet() & 63) == 0) {
            mo55671j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo55671j() {
        if (tryLock()) {
            try {
                mo55669h();
                this.f156329g.set(0);
            } finally {
                unlock();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo55672k(C58608li liVar, Object obj) {
        this.f156323a.f156358g.mo55652e(this, liVar, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo55673l() {
        if (tryLock()) {
            try {
                mo55669h();
            } finally {
                unlock();
            }
        }
    }
}
