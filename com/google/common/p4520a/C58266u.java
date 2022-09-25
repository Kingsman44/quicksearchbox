package com.google.common.p4520a;

import java.util.AbstractQueue;
import java.util.Iterator;

/* renamed from: com.google.common.a.u */
/* compiled from: PG */
final class C58266u extends AbstractQueue {

    /* renamed from: a */
    final C58241bu f155807a = new C58264s();

    /* renamed from: a */
    public final C58241bu peek() {
        C58241bu buVar = this.f155807a;
        C58241bu buVar2 = ((C58264s) buVar).f155804a;
        if (buVar2 == buVar) {
            return null;
        }
        return buVar2;
    }

    public final void clear() {
        C58241bu buVar = ((C58264s) this.f155807a).f155804a;
        while (true) {
            C58241bu buVar2 = this.f155807a;
            if (buVar != buVar2) {
                C58241bu f = buVar.mo54722f();
                C58234bn.m89131j(buVar);
                buVar = f;
            } else {
                C58264s sVar = (C58264s) buVar2;
                sVar.f155804a = buVar2;
                sVar.f155805b = buVar2;
                return;
            }
        }
    }

    public final boolean contains(Object obj) {
        return ((C58241bu) obj).mo54722f() != C58208ao.f155661a;
    }

    public final boolean isEmpty() {
        C58241bu buVar = this.f155807a;
        return ((C58264s) buVar).f155804a == buVar;
    }

    public final Iterator iterator() {
        return new C58265t(this, peek());
    }

    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        C58241bu buVar = (C58241bu) obj;
        C58234bn.m89129h(buVar.mo54724h(), buVar.mo54722f());
        C58234bn.m89129h(((C58264s) this.f155807a).f155805b, buVar);
        C58234bn.m89129h(buVar, this.f155807a);
        return true;
    }

    public final /* bridge */ /* synthetic */ Object poll() {
        C58241bu buVar = this.f155807a;
        C58241bu buVar2 = ((C58264s) buVar).f155804a;
        if (buVar2 == buVar) {
            return null;
        }
        remove(buVar2);
        return buVar2;
    }

    public final boolean remove(Object obj) {
        C58241bu buVar = (C58241bu) obj;
        C58241bu h = buVar.mo54724h();
        C58241bu f = buVar.mo54722f();
        C58234bn.m89129h(h, f);
        C58234bn.m89131j(buVar);
        return f != C58208ao.f155661a;
    }

    public final int size() {
        int i = 0;
        for (C58241bu buVar = ((C58264s) this.f155807a).f155804a; buVar != this.f155807a; buVar = buVar.mo54722f()) {
            i++;
        }
        return i;
    }
}
