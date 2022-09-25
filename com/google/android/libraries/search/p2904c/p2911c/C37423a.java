package com.google.android.libraries.search.p2904c.p2911c;

import com.google.android.libraries.search.p2904c.C37321a;
import com.google.android.libraries.search.p2904c.C37566eg;
import com.google.android.libraries.search.p2904c.C37567eh;
import com.google.android.libraries.search.p2904c.C37589fa;
import com.google.android.libraries.search.p2904c.C37593fe;
import com.google.android.libraries.search.p2904c.C37595fg;
import com.google.android.libraries.search.p2904c.p2906aa.C37331f;
import com.google.android.libraries.search.p2904c.p2907ab.C37335b;
import com.google.android.libraries.search.p2904c.p2911c.p2912a.C37424a;
import com.google.android.libraries.search.p2904c.p2911c.p2912a.C37427d;
import com.google.android.libraries.search.p2904c.p2911c.p2912a.C37430g;
import com.google.android.libraries.search.p2904c.p2951n.C37900b;
import com.google.android.libraries.search.p2904c.p2951n.C37901c;
import com.google.android.libraries.search.p2904c.p2964r.C37966b;
import com.google.android.libraries.search.p2904c.p2985y.p2986a.C38281b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.google.android.libraries.search.c.c.a */
/* compiled from: PG */
public final class C37423a implements C37335b, C37321a, C37424a {

    /* renamed from: b */
    private static final C59071e f99357b = C59071e.m91332i("com.google.android.libraries.search.c.c.a");

    /* renamed from: a */
    int f99358a;

    /* renamed from: c */
    private final AtomicBoolean f99359c = new AtomicBoolean(false);

    /* renamed from: d */
    private final Lock f99360d;

    /* renamed from: e */
    private final Condition f99361e;

    /* renamed from: f */
    private final byte[] f99362f;

    /* renamed from: g */
    private final C37966b f99363g;

    /* renamed from: h */
    private final C38281b f99364h;

    /* renamed from: i */
    private int f99365i;

    /* renamed from: j */
    private boolean f99366j;

    /* renamed from: k */
    private final List f99367k;

    public C37423a(int i, C38281b bVar, C37966b bVar2) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f99360d = reentrantLock;
        this.f99361e = reentrantLock.newCondition();
        this.f99365i = 0;
        this.f99358a = 0;
        this.f99367k = new ArrayList();
        this.f99362f = new byte[i];
        this.f99364h = bVar;
        this.f99363g = bVar2;
    }

    /* renamed from: f */
    private final int m66444f() {
        return ((this.f99362f.length * this.f99358a) + this.f99365i) - 1;
    }

    /* renamed from: g */
    private final int m66445g() {
        int i = this.f99358a;
        if (i > 0) {
            return (this.f99362f.length * (i - 1)) + this.f99365i;
        }
        return 0;
    }

    /* renamed from: h */
    private final void m66446h(C37589fa faVar, int i) {
        C38281b bVar = this.f99364h;
        C37593fe feVar = (C37593fe) C37595fg.f99904g.createBuilder();
        C37566eg egVar = (C37566eg) C37567eh.f99829f.createBuilder();
        egVar.copyOnWrite();
        C37567eh ehVar = (C37567eh) egVar.instance;
        ehVar.f99832b = faVar.f99887l;
        ehVar.f99831a |= 1;
        String a = C37331f.m66337a(this);
        egVar.copyOnWrite();
        C37567eh ehVar2 = (C37567eh) egVar.instance;
        ehVar2.f99831a |= 2;
        ehVar2.f99833c = a;
        egVar.copyOnWrite();
        C37567eh ehVar3 = (C37567eh) egVar.instance;
        ehVar3.f99831a |= 4;
        ehVar3.f99834d = i;
        C37567eh ehVar4 = (C37567eh) egVar.build();
        feVar.copyOnWrite();
        C37595fg fgVar = (C37595fg) feVar.instance;
        ehVar4.getClass();
        fgVar.f99908c = ehVar4;
        fgVar.f99907b = 3;
        bVar.mo41352f((C37595fg) feVar.build());
    }

    /* renamed from: a */
    public final int mo40879a(byte[] bArr, int i, int i2, int i3) {
        this.f99360d.lock();
        int i4 = -1;
        do {
            try {
                mo40948d(i);
                i4 = m66444f();
                if (i4 < -1) {
                    if (this.f99359c.compareAndSet(false, true)) {
                        m66446h(C37589fa.OUTCOME_BUFFER_COUNTER_OVERFLOW, m66444f() + 1);
                        this.f99363g.mo41171d();
                    }
                    throw new C37901c("Total audio bytes captured exceeded max limit. Buffer: ".concat(C37331f.m66337a(this)));
                } else if (i > i4) {
                    if (this.f99366j) {
                        this.f99360d.unlock();
                        return -1;
                    }
                    this.f99361e.await();
                    mo40948d(i);
                    i4 = m66444f();
                    continue;
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                m66446h(C37589fa.OUTCOME_BUFFER_COPY_INTERRUPTED, i4 + 1);
                C59104x d = f99357b.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ALT.BytesAccessorBuffer");
                ((C59052c) ((C59052c) d).mo56372aa(52668)).mo56389s("#audio# copyFromBuffer interrupted: exception in wait. Buffer: %s", C37331f.m66337a(this));
                String a = C37331f.m66337a(this);
                throw new C37900b("Reading from Audio Accessor interrupted. Buffer: " + a, e);
            } catch (Throwable th) {
                this.f99360d.unlock();
                throw th;
            }
        } while (i > i4);
        int min = Math.min(Math.min(i3, (i4 - i) + 1), bArr.length - i2);
        byte[] bArr2 = this.f99362f;
        int length = bArr2.length;
        int i5 = i % length;
        int i6 = length - i5;
        if (i6 >= min) {
            System.arraycopy(bArr2, i5, bArr, i2, min);
        } else {
            System.arraycopy(bArr2, i5, bArr, i2, i6);
            System.arraycopy(this.f99362f, 0, bArr, i2 + i6, min - i6);
        }
        this.f99360d.unlock();
        return min;
    }

    /* renamed from: b */
    public final void mo40890b(int i, byte[] bArr) {
        Lock lock;
        this.f99360d.lock();
        try {
            if (this.f99366j) {
                lock = this.f99360d;
            } else {
                C58838bb.m90869d(this.f99362f.length >= i, "Read size cannot be larger than the size of the buffer");
                m66444f();
                for (C37430g b : this.f99367k) {
                    b.mo40952b(bArr, i);
                }
                byte[] bArr2 = this.f99362f;
                int length = bArr2.length;
                int i2 = this.f99365i;
                int i3 = length - i2;
                if (i3 > i) {
                    System.arraycopy(bArr, 0, bArr2, i2, i);
                } else {
                    System.arraycopy(bArr, 0, bArr2, i2, i3);
                    System.arraycopy(bArr, i3, this.f99362f, 0, i - i3);
                    C58976aa aaVar = C58975e.f156826a;
                    int length2 = this.f99362f.length;
                    this.f99358a++;
                }
                this.f99365i = (this.f99365i + i) % this.f99362f.length;
                C58976aa aaVar2 = C58975e.f156826a;
                C59081b.m91349a(TimeUnit.MILLISECONDS, "time unit");
                m66444f();
                this.f99361e.signalAll();
                lock = this.f99360d;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.f99360d.unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public final C60870cx mo40947c() {
        this.f99360d.lock();
        try {
            return C60856cj.m92900i(C37427d.m66458b(this.f99367k));
        } finally {
            this.f99360d.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo40948d(int i) {
        this.f99360d.lock();
        try {
            if (i < m66445g()) {
                if (this.f99359c.compareAndSet(false, true)) {
                    m66446h(C37589fa.OUTCOME_BUFFER_OVERFLOW, m66444f() + 1);
                    this.f99363g.mo41171d();
                }
                throw new C37901c();
            }
        } finally {
            this.f99360d.unlock();
        }
    }

    /* renamed from: e */
    public final void mo40949e(C37430g gVar) {
        Lock lock;
        C59071e eVar = f99357b;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.BytesAccessorBuffer");
        ((C59052c) ((C59052c) b).mo56372aa(52669)).mo56354G("#audio# add processor (%s) to buffer (%s)", C37331f.m66337a(gVar), C37331f.m66337a(this));
        this.f99360d.lock();
        try {
            if (this.f99366j) {
                C59104x b2 = eVar.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "ALT.BytesAccessorBuffer");
                ((C59052c) ((C59052c) b2).mo56372aa(52671)).mo56354G("#audio# skip adding processor (%s) as buffer (%s) is closed", C37331f.m66337a(gVar), C37331f.m66337a(this));
                lock = this.f99360d;
            } else {
                m66445g();
                if (this.f99358a > 0) {
                    byte[] bArr = this.f99362f;
                    gVar.mo40953c(bArr, this.f99365i, bArr.length);
                    int length = this.f99362f.length;
                }
                gVar.mo40953c(this.f99362f, 0, this.f99365i);
                this.f99367k.add(gVar);
                m66445g();
                lock = this.f99360d;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.f99360d.unlock();
            throw th;
        }
    }

    /* renamed from: i */
    public final void mo40891i() {
        Condition condition;
        this.f99360d.lock();
        try {
            if (this.f99366j) {
                condition = this.f99361e;
            } else {
                int f = m66444f() + 1;
                C59104x b = f99357b.mo56224b();
                b.mo56378ag(C58975e.f156826a, "ALT.BytesAccessorBuffer");
                ((C59052c) ((C59052c) b).mo56372aa(52672)).mo56352E("#audio# mark buffer(%s) closed, available bytes(%d)", C37331f.m66337a(this), f);
                this.f99366j = true;
                this.f99363g.mo41170c(f);
                m66446h(C37589fa.OUTCOME_BUFFER_CLOSED, f);
                for (C37430g a : this.f99367k) {
                    a.mo40951a();
                }
                condition = this.f99361e;
            }
            condition.signalAll();
            this.f99360d.unlock();
        } catch (Throwable th) {
            this.f99361e.signalAll();
            this.f99360d.unlock();
            throw th;
        }
    }
}
