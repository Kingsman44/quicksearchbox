package com.google.common.util.concurrent;

import com.google.common.p4522b.C58471gg;
import com.google.common.p4522b.C58597ky;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.common.util.concurrent.bb */
/* compiled from: PG */
abstract class C60821bb extends C60925m {

    /* renamed from: c */
    private List f164888c;

    public C60821bb(C58471gg ggVar, boolean z) {
        super(ggVar, z, true);
        List list;
        if (ggVar.isEmpty()) {
            list = Collections.emptyList();
        } else {
            list = C58597ky.m90213d(ggVar.size());
        }
        for (int i = 0; i < ggVar.size(); i++) {
            list.add((Object) null);
        }
        this.f164888c = list;
    }

    /* renamed from: f */
    public final void mo57284f(int i, Object obj) {
        List list = this.f164888c;
        if (list != null) {
            list.set(i, new C60820ba(obj));
        }
    }

    /* renamed from: i */
    public final void mo57285i() {
        List list = this.f164888c;
        if (list != null) {
            mo57356n(mo57283t(list));
        }
    }

    /* renamed from: s */
    public final void mo57286s(int i) {
        this.f165040a = null;
        this.f164888c = null;
    }

    /* renamed from: t */
    public abstract Object mo57283t(List list);
}
