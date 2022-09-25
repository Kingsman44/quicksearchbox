package p3186j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;
import p3186j$.sun.misc.C40953c;

/* renamed from: j$.util.concurrent.q */
final class C41080q extends C41074k {

    /* renamed from: h */
    private static final C40953c f107621h;

    /* renamed from: i */
    private static final long f107622i;

    /* renamed from: e */
    C41081r f107623e;

    /* renamed from: f */
    volatile C41081r f107624f;

    /* renamed from: g */
    volatile Thread f107625g;
    volatile int lockState;

    static {
        C40953c h = C40953c.m71114h();
        f107621h = h;
        f107622i = h.mo42987j(C41080q.class, "lockState");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r6 = p3186j$.util.concurrent.ConcurrentHashMap.m71676c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        r8 = p3186j$.util.concurrent.ConcurrentHashMap.m71677d(r6, r3, r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C41080q(p3186j$.util.concurrent.C41081r r10) {
        /*
            r9 = this;
            r0 = -2
            r1 = 0
            r9.<init>(r0, r1, r1)
            r9.f107624f = r10
            r0 = r1
        L_0x0008:
            if (r10 == 0) goto L_0x005c
            j$.util.concurrent.k r2 = r10.f107608d
            j$.util.concurrent.r r2 = (p3186j$.util.concurrent.C41081r) r2
            r10.f107628g = r1
            r10.f107627f = r1
            if (r0 != 0) goto L_0x001b
            r10.f107626e = r1
            r0 = 0
            r10.f107630i = r0
        L_0x0019:
            r0 = r10
            goto L_0x0058
        L_0x001b:
            java.lang.Object r3 = r10.f107606b
            int r4 = r10.f107605a
            r5 = r0
            r6 = r1
        L_0x0021:
            java.lang.Object r7 = r5.f107606b
            int r8 = r5.f107605a
            if (r8 <= r4) goto L_0x0029
            r7 = -1
            goto L_0x0041
        L_0x0029:
            if (r8 >= r4) goto L_0x002d
            r7 = 1
            goto L_0x0041
        L_0x002d:
            if (r6 != 0) goto L_0x0035
            java.lang.Class r6 = p3186j$.util.concurrent.ConcurrentHashMap.m71676c(r3)
            if (r6 == 0) goto L_0x003b
        L_0x0035:
            int r8 = p3186j$.util.concurrent.ConcurrentHashMap.m71677d(r6, r3, r7)
            if (r8 != 0) goto L_0x0040
        L_0x003b:
            int r7 = m71708i(r3, r7)
            goto L_0x0041
        L_0x0040:
            r7 = r8
        L_0x0041:
            if (r7 > 0) goto L_0x0046
            j$.util.concurrent.r r8 = r5.f107627f
            goto L_0x0048
        L_0x0046:
            j$.util.concurrent.r r8 = r5.f107628g
        L_0x0048:
            if (r8 != 0) goto L_0x005a
            r10.f107626e = r5
            if (r7 > 0) goto L_0x0051
            r5.f107627f = r10
            goto L_0x0053
        L_0x0051:
            r5.f107628g = r10
        L_0x0053:
            j$.util.concurrent.r r10 = m71704c(r0, r10)
            goto L_0x0019
        L_0x0058:
            r10 = r2
            goto L_0x0008
        L_0x005a:
            r5 = r8
            goto L_0x0021
        L_0x005c:
            r9.f107623e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.util.concurrent.C41080q.<init>(j$.util.concurrent.r):void");
    }

    /* renamed from: b */
    static C41081r m71703b(C41081r rVar, C41081r rVar2) {
        C41081r rVar3;
        while (rVar2 != null && rVar2 != rVar) {
            C41081r rVar4 = rVar2.f107626e;
            if (rVar4 == null) {
                rVar2.f107630i = false;
                return rVar2;
            } else if (rVar2.f107630i) {
                rVar2.f107630i = false;
                return rVar;
            } else {
                C41081r rVar5 = rVar4.f107627f;
                C41081r rVar6 = null;
                if (rVar5 == rVar2) {
                    rVar3 = rVar4.f107628g;
                    if (rVar3 != null && rVar3.f107630i) {
                        rVar3.f107630i = false;
                        rVar4.f107630i = true;
                        rVar = m71706g(rVar, rVar4);
                        rVar4 = rVar2.f107626e;
                        rVar3 = rVar4 == null ? null : rVar4.f107628g;
                    }
                    if (rVar3 != null) {
                        C41081r rVar7 = rVar3.f107627f;
                        C41081r rVar8 = rVar3.f107628g;
                        if ((rVar8 != null && rVar8.f107630i) || (rVar7 != null && rVar7.f107630i)) {
                            if (rVar8 == null || !rVar8.f107630i) {
                                if (rVar7 != null) {
                                    rVar7.f107630i = false;
                                }
                                rVar3.f107630i = true;
                                rVar = m71707h(rVar, rVar3);
                                rVar4 = rVar2.f107626e;
                                if (rVar4 != null) {
                                    rVar6 = rVar4.f107628g;
                                }
                                rVar3 = rVar6;
                            }
                            if (rVar3 != null) {
                                rVar3.f107630i = rVar4 == null ? false : rVar4.f107630i;
                                C41081r rVar9 = rVar3.f107628g;
                                if (rVar9 != null) {
                                    rVar9.f107630i = false;
                                }
                            }
                            if (rVar4 != null) {
                                rVar4.f107630i = false;
                                rVar = m71706g(rVar, rVar4);
                            }
                            rVar2 = rVar;
                            rVar = rVar2;
                        }
                        rVar3.f107630i = true;
                    }
                } else {
                    if (rVar5 != null && rVar5.f107630i) {
                        rVar5.f107630i = false;
                        rVar4.f107630i = true;
                        rVar = m71707h(rVar, rVar4);
                        rVar4 = rVar2.f107626e;
                        rVar5 = rVar4 == null ? null : rVar4.f107627f;
                    }
                    if (rVar3 != null) {
                        C41081r rVar10 = rVar3.f107627f;
                        C41081r rVar11 = rVar3.f107628g;
                        if ((rVar10 != null && rVar10.f107630i) || (rVar11 != null && rVar11.f107630i)) {
                            if (rVar10 == null || !rVar10.f107630i) {
                                if (rVar11 != null) {
                                    rVar11.f107630i = false;
                                }
                                rVar3.f107630i = true;
                                rVar = m71706g(rVar, rVar3);
                                rVar4 = rVar2.f107626e;
                                if (rVar4 != null) {
                                    rVar6 = rVar4.f107627f;
                                }
                                rVar3 = rVar6;
                            }
                            if (rVar3 != null) {
                                rVar3.f107630i = rVar4 == null ? false : rVar4.f107630i;
                                C41081r rVar12 = rVar3.f107627f;
                                if (rVar12 != null) {
                                    rVar12.f107630i = false;
                                }
                            }
                            if (rVar4 != null) {
                                rVar4.f107630i = false;
                                rVar = m71707h(rVar, rVar4);
                            }
                            rVar2 = rVar;
                            rVar = rVar2;
                        }
                        rVar3.f107630i = true;
                    }
                }
                rVar2 = rVar4;
            }
        }
        return rVar;
    }

    /* renamed from: c */
    static C41081r m71704c(C41081r rVar, C41081r rVar2) {
        C41081r rVar3;
        rVar2.f107630i = true;
        while (true) {
            C41081r rVar4 = rVar2.f107626e;
            if (rVar4 == null) {
                rVar2.f107630i = false;
                return rVar2;
            } else if (!rVar4.f107630i || (rVar3 = rVar4.f107626e) == null) {
                return rVar;
            } else {
                C41081r rVar5 = rVar3.f107627f;
                if (rVar4 == rVar5) {
                    rVar5 = rVar3.f107628g;
                    if (rVar5 == null || !rVar5.f107630i) {
                        if (rVar2 == rVar4.f107628g) {
                            rVar = m71706g(rVar, rVar4);
                            C41081r rVar6 = rVar4.f107626e;
                            rVar3 = rVar6 == null ? null : rVar6.f107626e;
                            C41081r rVar7 = rVar4;
                            rVar4 = rVar6;
                            rVar2 = rVar7;
                        }
                        if (rVar4 != null) {
                            rVar4.f107630i = false;
                            if (rVar3 != null) {
                                rVar3.f107630i = true;
                                rVar = m71707h(rVar, rVar3);
                            }
                        }
                    }
                } else if (rVar5 == null || !rVar5.f107630i) {
                    if (rVar2 == rVar4.f107627f) {
                        rVar = m71707h(rVar, rVar4);
                        C41081r rVar8 = rVar4.f107626e;
                        rVar3 = rVar8 == null ? null : rVar8.f107626e;
                        C41081r rVar9 = rVar4;
                        rVar4 = rVar8;
                        rVar2 = rVar9;
                    }
                    if (rVar4 != null) {
                        rVar4.f107630i = false;
                        if (rVar3 != null) {
                            rVar3.f107630i = true;
                            rVar = m71706g(rVar, rVar3);
                        }
                    }
                }
                rVar5.f107630i = false;
                rVar4.f107630i = false;
                rVar3.f107630i = true;
                rVar2 = rVar3;
            }
        }
        return rVar;
    }

    /* renamed from: d */
    private final void m71705d() {
        if (!f107621h.mo42982c(this, f107622i, 0, 1)) {
            boolean z = false;
            while (true) {
                int i = this.lockState;
                if ((i & -3) == 0) {
                    if (f107621h.mo42982c(this, f107622i, i, 1)) {
                        break;
                    }
                } else if ((i & 2) == 0) {
                    if (f107621h.mo42982c(this, f107622i, i, i | 2)) {
                        this.f107625g = Thread.currentThread();
                        z = true;
                    }
                } else if (z) {
                    LockSupport.park(this);
                }
            }
            if (z) {
                this.f107625g = null;
            }
        }
    }

    /* renamed from: g */
    static C41081r m71706g(C41081r rVar, C41081r rVar2) {
        C41081r rVar3 = rVar2.f107628g;
        if (rVar3 != null) {
            C41081r rVar4 = rVar3.f107627f;
            rVar2.f107628g = rVar4;
            if (rVar4 != null) {
                rVar4.f107626e = rVar2;
            }
            C41081r rVar5 = rVar2.f107626e;
            rVar3.f107626e = rVar5;
            if (rVar5 == null) {
                rVar3.f107630i = false;
                rVar = rVar3;
            } else if (rVar5.f107627f == rVar2) {
                rVar5.f107627f = rVar3;
            } else {
                rVar5.f107628g = rVar3;
            }
            rVar3.f107627f = rVar2;
            rVar2.f107626e = rVar3;
        }
        return rVar;
    }

    /* renamed from: h */
    static C41081r m71707h(C41081r rVar, C41081r rVar2) {
        C41081r rVar3 = rVar2.f107627f;
        if (rVar3 != null) {
            C41081r rVar4 = rVar3.f107628g;
            rVar2.f107627f = rVar4;
            if (rVar4 != null) {
                rVar4.f107626e = rVar2;
            }
            C41081r rVar5 = rVar2.f107626e;
            rVar3.f107626e = rVar5;
            if (rVar5 == null) {
                rVar3.f107630i = false;
                rVar = rVar3;
            } else if (rVar5.f107628g == rVar2) {
                rVar5.f107628g = rVar3;
            } else {
                rVar5.f107627f = rVar3;
            }
            rVar3.f107628g = rVar2;
            rVar2.f107626e = rVar3;
        }
        return rVar;
    }

    /* renamed from: i */
    static int m71708i(Object obj, Object obj2) {
        int compareTo;
        return (obj == null || obj2 == null || (compareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) ? System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1 : compareTo;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C41074k mo43558a(int i, Object obj) {
        Thread thread;
        Thread thread2;
        Object obj2;
        C41081r rVar = null;
        if (obj != null) {
            C41074k kVar = this.f107624f;
            while (kVar != null) {
                int i2 = this.lockState;
                if ((i2 & 3) == 0) {
                    C40953c cVar = f107621h;
                    long j = f107622i;
                    if (cVar.mo42982c(this, j, i2, i2 + 4)) {
                        try {
                            C41081r rVar2 = this.f107623e;
                            if (rVar2 != null) {
                                rVar = rVar2.mo43575b(i, obj, (Class) null);
                            }
                            if (cVar.mo42985f(this, j) == 6 && (thread2 = this.f107625g) != null) {
                                LockSupport.unpark(thread2);
                            }
                            return rVar;
                        } catch (Throwable th) {
                            if (f107621h.mo42985f(this, f107622i) == 6 && (thread = this.f107625g) != null) {
                                LockSupport.unpark(thread);
                            }
                            throw th;
                        }
                    }
                } else if (kVar.f107605a == i && ((obj2 = kVar.f107606b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return kVar;
                } else {
                    kVar = kVar.f107608d;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a3, code lost:
        return null;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p3186j$.util.concurrent.C41081r mo43573e(int r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r4 = r17
            j$.util.concurrent.r r2 = r1.f107623e
            r8 = 0
            r9 = 0
            r10 = r2
            r2 = r8
            r3 = 0
        L_0x000c:
            if (r10 != 0) goto L_0x0022
            j$.util.concurrent.r r9 = new j$.util.concurrent.r
            r6 = 0
            r7 = 0
            r2 = r9
            r3 = r16
            r4 = r17
            r5 = r18
            r2.<init>(r3, r4, r5, r6, r7)
            r1.f107623e = r9
            r1.f107624f = r9
            goto L_0x00a3
        L_0x0022:
            int r5 = r10.f107605a
            r11 = 1
            if (r5 <= r0) goto L_0x002a
            r5 = -1
            r12 = -1
            goto L_0x0069
        L_0x002a:
            if (r5 >= r0) goto L_0x002e
            r12 = 1
            goto L_0x0069
        L_0x002e:
            java.lang.Object r5 = r10.f107606b
            if (r5 == r4) goto L_0x00ab
            if (r5 == 0) goto L_0x003c
            boolean r6 = r4.equals(r5)
            if (r6 == 0) goto L_0x003c
            goto L_0x00ab
        L_0x003c:
            if (r2 != 0) goto L_0x0044
            java.lang.Class r2 = p3186j$.util.concurrent.ConcurrentHashMap.m71676c(r17)
            if (r2 == 0) goto L_0x004a
        L_0x0044:
            int r6 = p3186j$.util.concurrent.ConcurrentHashMap.m71677d(r2, r4, r5)
            if (r6 != 0) goto L_0x0068
        L_0x004a:
            if (r3 != 0) goto L_0x0062
            j$.util.concurrent.r r3 = r10.f107627f
            if (r3 == 0) goto L_0x0056
            j$.util.concurrent.r r3 = r3.mo43575b(r0, r4, r2)
            if (r3 != 0) goto L_0x0060
        L_0x0056:
            j$.util.concurrent.r r3 = r10.f107628g
            if (r3 == 0) goto L_0x0061
            j$.util.concurrent.r r3 = r3.mo43575b(r0, r4, r2)
            if (r3 == 0) goto L_0x0061
        L_0x0060:
            return r3
        L_0x0061:
            r3 = 1
        L_0x0062:
            int r5 = m71708i(r4, r5)
            r12 = r5
            goto L_0x0069
        L_0x0068:
            r12 = r6
        L_0x0069:
            if (r12 > 0) goto L_0x006e
            j$.util.concurrent.r r5 = r10.f107627f
            goto L_0x0070
        L_0x006e:
            j$.util.concurrent.r r5 = r10.f107628g
        L_0x0070:
            if (r5 != 0) goto L_0x00a8
            j$.util.concurrent.r r13 = r1.f107624f
            j$.util.concurrent.r r14 = new j$.util.concurrent.r
            r2 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r13
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r1.f107624f = r14
            if (r13 == 0) goto L_0x0088
            r13.f107629h = r14
        L_0x0088:
            if (r12 > 0) goto L_0x008d
            r10.f107627f = r14
            goto L_0x008f
        L_0x008d:
            r10.f107628g = r14
        L_0x008f:
            boolean r0 = r10.f107630i
            if (r0 != 0) goto L_0x0096
            r14.f107630i = r11
            goto L_0x00a3
        L_0x0096:
            r15.m71705d()
            j$.util.concurrent.r r0 = r1.f107623e     // Catch:{ all -> 0x00a4 }
            j$.util.concurrent.r r0 = m71704c(r0, r14)     // Catch:{ all -> 0x00a4 }
            r1.f107623e = r0     // Catch:{ all -> 0x00a4 }
            r1.lockState = r9
        L_0x00a3:
            return r8
        L_0x00a4:
            r0 = move-exception
            r1.lockState = r9
            throw r0
        L_0x00a8:
            r10 = r5
            goto L_0x000c
        L_0x00ab:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.util.concurrent.C41080q.mo43573e(int, java.lang.Object, java.lang.Object):j$.util.concurrent.r");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x008e A[Catch:{ all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00a9 A[Catch:{ all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00aa A[Catch:{ all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00ba A[Catch:{ all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00bd A[Catch:{ all -> 0x00c8 }] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo43574f(p3186j$.util.concurrent.C41081r r11) {
        /*
            r10 = this;
            j$.util.concurrent.k r0 = r11.f107608d
            j$.util.concurrent.r r0 = (p3186j$.util.concurrent.C41081r) r0
            j$.util.concurrent.r r1 = r11.f107629h
            if (r1 != 0) goto L_0x000b
            r10.f107624f = r0
            goto L_0x000d
        L_0x000b:
            r1.f107608d = r0
        L_0x000d:
            if (r0 == 0) goto L_0x0011
            r0.f107629h = r1
        L_0x0011:
            j$.util.concurrent.r r0 = r10.f107624f
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001a
            r10.f107623e = r2
            return r1
        L_0x001a:
            j$.util.concurrent.r r0 = r10.f107623e
            if (r0 == 0) goto L_0x00cc
            j$.util.concurrent.r r3 = r0.f107628g
            if (r3 == 0) goto L_0x00cc
            j$.util.concurrent.r r3 = r0.f107627f
            if (r3 == 0) goto L_0x00cc
            j$.util.concurrent.r r3 = r3.f107627f
            if (r3 != 0) goto L_0x002c
            goto L_0x00cc
        L_0x002c:
            r10.m71705d()
            r1 = 0
            j$.util.concurrent.r r3 = r11.f107627f     // Catch:{ all -> 0x00c8 }
            j$.util.concurrent.r r4 = r11.f107628g     // Catch:{ all -> 0x00c8 }
            if (r3 == 0) goto L_0x0084
            if (r4 == 0) goto L_0x0084
            r5 = r4
        L_0x0039:
            j$.util.concurrent.r r6 = r5.f107627f     // Catch:{ all -> 0x00c8 }
            if (r6 == 0) goto L_0x003f
            r5 = r6
            goto L_0x0039
        L_0x003f:
            boolean r6 = r5.f107630i     // Catch:{ all -> 0x00c8 }
            boolean r7 = r11.f107630i     // Catch:{ all -> 0x00c8 }
            r5.f107630i = r7     // Catch:{ all -> 0x00c8 }
            r11.f107630i = r6     // Catch:{ all -> 0x00c8 }
            j$.util.concurrent.r r6 = r5.f107628g     // Catch:{ all -> 0x00c8 }
            j$.util.concurrent.r r7 = r11.f107626e     // Catch:{ all -> 0x00c8 }
            if (r5 != r4) goto L_0x0052
            r11.f107626e = r5     // Catch:{ all -> 0x00c8 }
            r5.f107628g = r11     // Catch:{ all -> 0x00c8 }
            goto L_0x0065
        L_0x0052:
            j$.util.concurrent.r r8 = r5.f107626e     // Catch:{ all -> 0x00c8 }
            r11.f107626e = r8     // Catch:{ all -> 0x00c8 }
            if (r8 == 0) goto L_0x0061
            j$.util.concurrent.r r9 = r8.f107627f     // Catch:{ all -> 0x00c8 }
            if (r5 != r9) goto L_0x005f
            r8.f107627f = r11     // Catch:{ all -> 0x00c8 }
            goto L_0x0061
        L_0x005f:
            r8.f107628g = r11     // Catch:{ all -> 0x00c8 }
        L_0x0061:
            r5.f107628g = r4     // Catch:{ all -> 0x00c8 }
            r4.f107626e = r5     // Catch:{ all -> 0x00c8 }
        L_0x0065:
            r11.f107627f = r2     // Catch:{ all -> 0x00c8 }
            r11.f107628g = r6     // Catch:{ all -> 0x00c8 }
            if (r6 == 0) goto L_0x006d
            r6.f107626e = r11     // Catch:{ all -> 0x00c8 }
        L_0x006d:
            r5.f107627f = r3     // Catch:{ all -> 0x00c8 }
            r3.f107626e = r5     // Catch:{ all -> 0x00c8 }
            r5.f107626e = r7     // Catch:{ all -> 0x00c8 }
            if (r7 != 0) goto L_0x0077
            r0 = r5
            goto L_0x0080
        L_0x0077:
            j$.util.concurrent.r r3 = r7.f107627f     // Catch:{ all -> 0x00c8 }
            if (r11 != r3) goto L_0x007e
            r7.f107627f = r5     // Catch:{ all -> 0x00c8 }
            goto L_0x0080
        L_0x007e:
            r7.f107628g = r5     // Catch:{ all -> 0x00c8 }
        L_0x0080:
            if (r6 == 0) goto L_0x008b
            r3 = r6
            goto L_0x008c
        L_0x0084:
            if (r3 == 0) goto L_0x0087
            goto L_0x008c
        L_0x0087:
            if (r4 == 0) goto L_0x008b
            r3 = r4
            goto L_0x008c
        L_0x008b:
            r3 = r11
        L_0x008c:
            if (r3 == r11) goto L_0x00a5
            j$.util.concurrent.r r4 = r11.f107626e     // Catch:{ all -> 0x00c8 }
            r3.f107626e = r4     // Catch:{ all -> 0x00c8 }
            if (r4 != 0) goto L_0x0096
            r0 = r3
            goto L_0x009f
        L_0x0096:
            j$.util.concurrent.r r5 = r4.f107627f     // Catch:{ all -> 0x00c8 }
            if (r11 != r5) goto L_0x009d
            r4.f107627f = r3     // Catch:{ all -> 0x00c8 }
            goto L_0x009f
        L_0x009d:
            r4.f107628g = r3     // Catch:{ all -> 0x00c8 }
        L_0x009f:
            r11.f107626e = r2     // Catch:{ all -> 0x00c8 }
            r11.f107628g = r2     // Catch:{ all -> 0x00c8 }
            r11.f107627f = r2     // Catch:{ all -> 0x00c8 }
        L_0x00a5:
            boolean r4 = r11.f107630i     // Catch:{ all -> 0x00c8 }
            if (r4 == 0) goto L_0x00aa
            goto L_0x00ae
        L_0x00aa:
            j$.util.concurrent.r r0 = m71703b(r0, r3)     // Catch:{ all -> 0x00c8 }
        L_0x00ae:
            r10.f107623e = r0     // Catch:{ all -> 0x00c8 }
            if (r11 != r3) goto L_0x00c5
            j$.util.concurrent.r r0 = r11.f107626e     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x00c5
            j$.util.concurrent.r r3 = r0.f107627f     // Catch:{ all -> 0x00c8 }
            if (r11 != r3) goto L_0x00bd
            r0.f107627f = r2     // Catch:{ all -> 0x00c8 }
            goto L_0x00c3
        L_0x00bd:
            j$.util.concurrent.r r3 = r0.f107628g     // Catch:{ all -> 0x00c8 }
            if (r11 != r3) goto L_0x00c3
            r0.f107628g = r2     // Catch:{ all -> 0x00c8 }
        L_0x00c3:
            r11.f107626e = r2     // Catch:{ all -> 0x00c8 }
        L_0x00c5:
            r10.lockState = r1
            return r1
        L_0x00c8:
            r11 = move-exception
            r10.lockState = r1
            throw r11
        L_0x00cc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.util.concurrent.C41080q.mo43574f(j$.util.concurrent.r):boolean");
    }
}
