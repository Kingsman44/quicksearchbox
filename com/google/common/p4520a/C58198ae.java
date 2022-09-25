package com.google.common.p4520a;

import com.google.common.base.C58838bb;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.a.ae */
/* compiled from: PG */
abstract class C58198ae implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    int f155632a;

    /* renamed from: b */
    int f155633b = -1;

    /* renamed from: c */
    C58210aq f155634c;

    /* renamed from: d */
    AtomicReferenceArray f155635d;

    /* renamed from: e */
    C58241bu f155636e;

    /* renamed from: f */
    C58233bm f155637f;

    /* renamed from: g */
    C58233bm f155638g;

    /* renamed from: h */
    final /* synthetic */ C58234bn f155639h;

    public C58198ae(C58234bn bnVar) {
        this.f155639h = bnVar;
        this.f155632a = bnVar.f155737f.length - 1;
        mo54692b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C58233bm mo54691a() {
        C58233bm bmVar = this.f155637f;
        if (bmVar != null) {
            this.f155638g = bmVar;
            mo54692b();
            return this.f155638g;
        }
        throw new NoSuchElementException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo54692b() {
        this.f155637f = null;
        if (!mo54694d() && !mo54695e()) {
            while (true) {
                int i = this.f155632a;
                if (i >= 0) {
                    C58210aq[] aqVarArr = this.f155639h.f155737f;
                    this.f155632a = i - 1;
                    C58210aq aqVar = aqVarArr[i];
                    this.f155634c = aqVar;
                    if (aqVar.f155669b != 0) {
                        AtomicReferenceArray atomicReferenceArray = this.f155634c.f155673f;
                        this.f155635d = atomicReferenceArray;
                        this.f155633b = atomicReferenceArray.length() - 1;
                        if (mo54695e()) {
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
    public final boolean mo54693c(C58241bu buVar) {
        try {
            long a = this.f155639h.f155749r.mo26884a();
            Object j = buVar.mo54726j();
            C58234bn bnVar = this.f155639h;
            Object obj = null;
            if (buVar.mo54726j() != null) {
                Object obj2 = buVar.mo54720d().get();
                if (obj2 != null) {
                    if (!bnVar.mo54798q(buVar, a)) {
                        obj = obj2;
                    }
                }
            }
            if (obj != null) {
                this.f155637f = new C58233bm(this.f155639h, j, obj);
                this.f155634c.mo54753q();
                return true;
            }
            this.f155634c.mo54753q();
            return false;
        } catch (Throwable th) {
            this.f155634c.mo54753q();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo54694d() {
        C58241bu buVar = this.f155636e;
        if (buVar == null) {
            return false;
        }
        while (true) {
            this.f155636e = buVar.mo54721e();
            C58241bu buVar2 = this.f155636e;
            if (buVar2 == null) {
                return false;
            }
            if (mo54693c(buVar2)) {
                return true;
            }
            buVar = this.f155636e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo54695e() {
        while (true) {
            int i = this.f155633b;
            if (i < 0) {
                return false;
            }
            AtomicReferenceArray atomicReferenceArray = this.f155635d;
            this.f155633b = i - 1;
            C58241bu buVar = (C58241bu) atomicReferenceArray.get(i);
            this.f155636e = buVar;
            if (buVar != null && (mo54693c(buVar) || mo54694d())) {
                return true;
            }
        }
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f155637f != null;
    }

    public final void remove() {
        C58838bb.m90883r(this.f155638g != null);
        this.f155639h.remove(this.f155638g.f155728a);
        this.f155638g = null;
    }
}
