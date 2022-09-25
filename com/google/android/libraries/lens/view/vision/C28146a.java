package com.google.android.libraries.lens.view.vision;

import com.google.android.libraries.lens.view.p2113h.p2114a.C26645f;
import com.google.android.libraries.lens.view.p2113h.p2123f.p2124a.C26819c;
import com.google.android.libraries.lens.view.p2173u.C28097c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.aax;
import com.google.common.p4552o.aay;
import com.google.common.p4552o.aci;
import com.google.common.p4552o.ack;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.lens.view.vision.a */
/* compiled from: PG */
public abstract class C28146a implements C28172n {

    /* renamed from: a */
    public final AtomicReference f76573a = new AtomicReference((Object) null);

    /* renamed from: b */
    public final C28182x f76574b;

    /* renamed from: c */
    public final Map f76575c = new ConcurrentHashMap();

    /* renamed from: d */
    public long f76576d;

    /* renamed from: e */
    public long f76577e;

    /* renamed from: f */
    private final Set f76578f = Collections.synchronizedSet(new HashSet());

    /* renamed from: g */
    private final Set f76579g;

    public C28146a(C28182x xVar, Set set) {
        this.f76574b = xVar;
        this.f76579g = set;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C26645f mo33580a();

    /* renamed from: b */
    public final C28097c mo33581b(long j) {
        C28097c cVar = (C28097c) this.f76575c.get(Long.valueOf(j));
        C58838bb.m90866a(cVar, mo33584e(j));
        return cVar;
    }

    /* renamed from: c */
    public final C58833ax mo33582c() {
        C28182x xVar = this.f76574b;
        if (!xVar.f76697c) {
            return C58836b.f156633a;
        }
        synchronized (xVar.f76695a) {
            if (xVar.f76696b.isEmpty()) {
                C58836b bVar = C58836b.f156633a;
                return bVar;
            }
            long j = 0;
            for (Long longValue : xVar.f76696b.values()) {
                j += longValue.longValue();
            }
            C58833ax k = C58833ax.m90834k(Float.valueOf(((float) j) / ((float) xVar.f76696b.size())));
            return k;
        }
    }

    /* renamed from: d */
    public final ack mo33583d() {
        C26645f a = mo33580a();
        aci aci = (aci) ack.f158305f.createBuilder();
        int m = mo33592m();
        aci.copyOnWrite();
        ack ack = (ack) aci.instance;
        int i = m - 1;
        if (m != 0) {
            ack.f158308b = i;
            ack.f158307a |= 1;
            aax aax = (aax) aay.f158169d.createBuilder();
            float a2 = a.mo31920a();
            aax.copyOnWrite();
            aay aay = (aay) aax.instance;
            aay.f158171a |= 1;
            aay.f158172b = (long) (a2 * 1000.0f);
            float b = a.mo31921b();
            aax.copyOnWrite();
            aay aay2 = (aay) aax.instance;
            aay2.f158171a |= 2;
            aay2.f158173c = (long) (b * 1000.0f);
            aay aay3 = (aay) aax.build();
            aci.copyOnWrite();
            ack ack2 = (ack) aci.instance;
            aay3.getClass();
            ack2.f158309c = aay3;
            ack2.f158307a |= 2;
            long j = this.f76576d;
            aci.copyOnWrite();
            ack ack3 = (ack) aci.instance;
            ack3.f158307a |= 4;
            ack3.f158310d = j;
            long j2 = this.f76577e;
            aci.copyOnWrite();
            ack ack4 = (ack) aci.instance;
            ack4.f158307a |= 8;
            ack4.f158311e = j2;
            return (ack) aci.build();
        }
        throw null;
    }

    /* renamed from: e */
    public final String mo33584e(long j) {
        return String.format("Error: Frame with timestamp %s missing. Currently pending frames: %s", new Object[]{Long.valueOf(j), C58485gu.m89842j(this.f76575c.values())});
    }

    /* renamed from: f */
    public final void mo33585f(C28168j jVar) {
        this.f76578f.add(jVar);
    }

    /* renamed from: g */
    public void mo33586g(C26819c cVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo33587h() {
        for (C28171m o : this.f76579g) {
            o.mo30756o(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo33588i() {
        for (C28171m p : this.f76579g) {
            p.mo30757p();
        }
    }

    /* renamed from: j */
    public final void mo33589j(C28097c cVar) {
        HashSet<C28168j> hashSet;
        synchronized (this.f76578f) {
            hashSet = new HashSet<>(this.f76578f);
        }
        for (C28168j a : hashSet) {
            a.mo30749a(cVar);
        }
    }

    /* renamed from: k */
    public final void mo33590k(C28168j jVar) {
        this.f76578f.remove(jVar);
    }

    /* renamed from: l */
    public final void mo33591l(C28169k kVar) {
        this.f76573a.set(kVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract int mo33592m();
}
