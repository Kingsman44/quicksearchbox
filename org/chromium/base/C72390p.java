package org.chromium.base;

import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: org.chromium.base.p */
/* compiled from: PG */
public final class C72390p implements Iterable {

    /* renamed from: a */
    public final List f192538a = new ArrayList();

    /* renamed from: b */
    public int f192539b;

    /* renamed from: c */
    public boolean f192540c;

    /* renamed from: d */
    private int f192541d;

    public C72390p() {
        Process.myTid();
    }

    /* renamed from: a */
    public final Object mo63849a(int i) {
        return this.f192538a.get(i);
    }

    /* renamed from: b */
    public final boolean mo63850b() {
        return this.f192541d == 0;
    }

    /* renamed from: c */
    public final boolean mo63851c(Object obj) {
        int indexOf;
        if (obj == null || (indexOf = this.f192538a.indexOf(obj)) == -1) {
            return false;
        }
        if (this.f192539b == 0) {
            this.f192538a.remove(indexOf);
        } else {
            this.f192540c = true;
            this.f192538a.set(indexOf, (Object) null);
        }
        this.f192541d--;
        return true;
    }

    /* renamed from: d */
    public final void mo63852d(Object obj) {
        if (obj != null && !this.f192538a.contains(obj)) {
            this.f192538a.add(obj);
            this.f192541d++;
        }
    }

    public final Iterator iterator() {
        return new C72389o(this);
    }
}
