package com.google.common.p4520a;

import java.util.AbstractQueue;
import java.util.Iterator;

/* renamed from: com.google.common.a.bl */
/* compiled from: PG */
final class C58232bl extends AbstractQueue {

    /* renamed from: a */
    final C58241bu f155727a = new C58230bj();

    /* renamed from: a */
    public final C58241bu peek() {
        C58241bu buVar = this.f155727a;
        C58241bu buVar2 = ((C58230bj) buVar).f155724a;
        if (buVar2 == buVar) {
            return null;
        }
        return buVar2;
    }

    public final void clear() {
        C58241bu buVar = ((C58230bj) this.f155727a).f155724a;
        while (true) {
            C58241bu buVar2 = this.f155727a;
            if (buVar != buVar2) {
                C58241bu g = buVar.mo54723g();
                C58234bn.m89132k(buVar);
                buVar = g;
            } else {
                C58230bj bjVar = (C58230bj) buVar2;
                bjVar.f155724a = buVar2;
                bjVar.f155725b = buVar2;
                return;
            }
        }
    }

    public final boolean contains(Object obj) {
        return ((C58241bu) obj).mo54723g() != C58208ao.f155661a;
    }

    public final boolean isEmpty() {
        C58241bu buVar = this.f155727a;
        return ((C58230bj) buVar).f155724a == buVar;
    }

    public final Iterator iterator() {
        return new C58231bk(this, peek());
    }

    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        C58241bu buVar = (C58241bu) obj;
        C58234bn.m89130i(buVar.mo54725i(), buVar.mo54723g());
        C58234bn.m89130i(((C58230bj) this.f155727a).f155725b, buVar);
        C58234bn.m89130i(buVar, this.f155727a);
        return true;
    }

    public final /* bridge */ /* synthetic */ Object poll() {
        C58241bu buVar = this.f155727a;
        C58241bu buVar2 = ((C58230bj) buVar).f155724a;
        if (buVar2 == buVar) {
            return null;
        }
        remove(buVar2);
        return buVar2;
    }

    public final boolean remove(Object obj) {
        C58241bu buVar = (C58241bu) obj;
        C58241bu i = buVar.mo54725i();
        C58241bu g = buVar.mo54723g();
        C58234bn.m89130i(i, g);
        C58234bn.m89132k(buVar);
        return g != C58208ao.f155661a;
    }

    public final int size() {
        int i = 0;
        for (C58241bu buVar = ((C58230bj) this.f155727a).f155724a; buVar != this.f155727a; buVar = buVar.mo54723g()) {
            i++;
        }
        return i;
    }
}
