package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.b.lh */
/* compiled from: PG */
abstract class C58607lh implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    int f156314a;

    /* renamed from: b */
    int f156315b = -1;

    /* renamed from: c */
    C58613ln f156316c;

    /* renamed from: d */
    AtomicReferenceArray f156317d;

    /* renamed from: e */
    C58608li f156318e;

    /* renamed from: f */
    C58634mh f156319f;

    /* renamed from: g */
    C58634mh f156320g;

    /* renamed from: h */
    final /* synthetic */ C58635mi f156321h;

    public C58607lh(C58635mi miVar) {
        this.f156321h = miVar;
        this.f156314a = miVar.f156355d.length - 1;
        mo55644b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C58634mh mo55643a() {
        C58634mh mhVar = this.f156319f;
        if (mhVar != null) {
            this.f156320g = mhVar;
            mo55644b();
            return this.f156320g;
        }
        throw new NoSuchElementException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo55644b() {
        this.f156319f = null;
        if (!mo55646d() && !mo55647e()) {
            while (true) {
                int i = this.f156314a;
                if (i >= 0) {
                    C58613ln[] lnVarArr = this.f156321h.f156355d;
                    this.f156314a = i - 1;
                    C58613ln lnVar = lnVarArr[i];
                    this.f156316c = lnVar;
                    if (lnVar.f156324b != 0) {
                        AtomicReferenceArray atomicReferenceArray = this.f156316c.f156327e;
                        this.f156317d = atomicReferenceArray;
                        this.f156315b = atomicReferenceArray.length() - 1;
                        if (mo55647e()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo55645c(C58608li liVar) {
        Object obj;
        try {
            Object c = liVar.mo55635c();
            if (liVar.mo55635c() == null) {
                obj = null;
            } else {
                obj = liVar.mo55636d();
            }
            if (obj != null) {
                this.f156319f = new C58634mh(this.f156321h, c, obj);
                this.f156316c.mo55670i();
                return true;
            }
            this.f156316c.mo55670i();
            return false;
        } catch (Throwable th) {
            this.f156316c.mo55670i();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo55646d() {
        C58608li liVar = this.f156318e;
        if (liVar == null) {
            return false;
        }
        while (true) {
            this.f156318e = liVar.mo55634b();
            C58608li liVar2 = this.f156318e;
            if (liVar2 == null) {
                return false;
            }
            if (mo55645c(liVar2)) {
                return true;
            }
            liVar = this.f156318e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo55647e() {
        while (true) {
            int i = this.f156315b;
            if (i < 0) {
                return false;
            }
            AtomicReferenceArray atomicReferenceArray = this.f156317d;
            this.f156315b = i - 1;
            C58608li liVar = (C58608li) atomicReferenceArray.get(i);
            this.f156318e = liVar;
            if (liVar != null && (mo55645c(liVar) || mo55646d())) {
                return true;
            }
        }
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f156319f != null;
    }

    public final void remove() {
        C58838bb.m90884s(this.f156320g != null, "no calls to next() since the last call to remove()");
        this.f156321h.remove(this.f156320g.f156348a);
        this.f156320g = null;
    }
}
