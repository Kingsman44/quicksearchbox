package com.google.android.libraries.gsa.monet.tools.children.shared;

import android.support.p033v7.p040e.C0430l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.gsa.monet.tools.children.shared.e */
/* compiled from: PG */
final class C23236e implements C0430l {

    /* renamed from: a */
    public final List f63685a = new ArrayList();

    /* renamed from: b */
    private final List f63686b;

    public C23236e(List list, List list2) {
        this.f63686b = list;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            List list3 = this.f63685a;
            C23237f fVar = new C23237f();
            fVar.f63687a = (ChildData) it.next();
            fVar.f63689c = -1;
            fVar.f63688b = -1;
            fVar.f63690d = 1;
            list3.add(fVar);
        }
    }

    /* renamed from: a */
    public final void mo1392a(int i, int i2, Object obj) {
        throw new AssertionError();
    }

    /* renamed from: b */
    public final void mo1393b(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            C23237f fVar = new C23237f();
            fVar.f63690d = 2;
            fVar.f63687a = null;
            fVar.f63688b = i3;
            fVar.f63689c = -1;
            this.f63686b.add(fVar);
            if (this.f63685a.size() <= i3) {
                this.f63685a.add(fVar);
            } else {
                this.f63685a.add(i3, fVar);
            }
        }
    }

    /* renamed from: c */
    public final void mo1394c(int i, int i2) {
        C23237f fVar = new C23237f();
        fVar.f63687a = ((C23237f) this.f63685a.remove(i)).f63687a;
        fVar.f63690d = 4;
        fVar.f63688b = i2;
        fVar.f63689c = i;
        this.f63686b.add(fVar);
        if (this.f63685a.size() <= i2) {
            this.f63685a.add(fVar);
        } else {
            this.f63685a.add(i2, fVar);
        }
    }

    /* renamed from: d */
    public final void mo1395d(int i, int i2) {
        for (int i3 = (i2 + i) - 1; i3 >= i; i3--) {
            List list = this.f63686b;
            C23237f fVar = new C23237f();
            fVar.f63687a = ((C23237f) this.f63685a.remove(i3)).f63687a;
            fVar.f63690d = 3;
            fVar.f63688b = -1;
            fVar.f63689c = i3;
            list.add(fVar);
        }
    }
}
