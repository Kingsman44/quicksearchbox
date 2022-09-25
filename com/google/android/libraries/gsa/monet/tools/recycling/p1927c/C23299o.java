package com.google.android.libraries.gsa.monet.tools.recycling.p1927c;

import android.support.p033v7.widget.C0660fv;
import android.support.p033v7.widget.C0673gh;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.libraries.gsa.monet.tools.recycling.c.o */
/* compiled from: PG */
public final class C23299o extends C0660fv {

    /* renamed from: d */
    private final Set f63791d = new HashSet();

    /* renamed from: e */
    private final Set f63792e = new HashSet();

    /* renamed from: c */
    public final C0673gh mo3018c(int i) {
        C0673gh c = super.mo3018c(i);
        if (c != null) {
            this.f63792e.remove(c);
        }
        return c;
    }

    /* renamed from: e */
    public final void mo3020e() {
        super.mo3020e();
        for (C0673gh g : this.f63792e) {
            C23292h.m43691g(g);
        }
        this.f63792e.clear();
    }

    /* renamed from: g */
    public final void mo3022g(C0673gh ghVar) {
        int i = ghVar.mItemViewType;
        Set set = this.f63791d;
        Integer valueOf = Integer.valueOf(i);
        if (!set.contains(valueOf)) {
            mo3023h(i, 25);
            this.f63791d.add(valueOf);
        }
        int a = mo3016a(i);
        super.mo3022g(ghVar);
        if (mo3016a(i) > a) {
            this.f63792e.add(ghVar);
        } else {
            C23292h.m43691g(ghVar);
        }
    }

    /* renamed from: h */
    public final void mo3023h(int i, int i2) {
        C23067b.m43228a(i2 >= 0);
        while (mo3016a(i) > i2) {
            C0673gh c = mo3018c(i);
            c.getClass();
            C23292h.m43691g(c);
        }
        super.mo3023h(i, i2);
    }
}
