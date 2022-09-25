package com.google.android.apps.gsa.staticplugins.p7714cv.p7723g;

import com.google.common.base.C58838bb;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.g.q */
/* compiled from: PG */
public final class C98770q {

    /* renamed from: a */
    public final List f275909a;

    public C98770q(List list) {
        C58838bb.m90869d(list.size() <= 2, "More than two recognition engines are not currently supported.");
        this.f275909a = list;
    }

    /* renamed from: a */
    public final int mo91296a(int i) {
        if (this.f275909a.isEmpty() || ((Integer) this.f275909a.get(0)).intValue() != i) {
            this.f275909a.remove(Integer.valueOf(i));
            return 2;
        }
        this.f275909a.remove(Integer.valueOf(i));
        if (this.f275909a.isEmpty()) {
            return 0;
        }
        return 1;
    }
}
