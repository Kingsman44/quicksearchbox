package com.google.common.p4577t;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.common.t.b */
/* compiled from: PG */
public final class C60786b implements Comparable {

    /* renamed from: a */
    public final Object f164840a;

    /* renamed from: b */
    final int f164841b;

    /* renamed from: c */
    public final List f164842c = new ArrayList();

    /* renamed from: d */
    public int f164843d;

    public C60786b(Object obj, int i) {
        this.f164840a = obj;
        this.f164841b = i;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = this.f164841b;
        int i2 = ((C60786b) obj).f164841b;
        if (i == i2) {
            return 0;
        }
        return i >= i2 ? 1 : -1;
    }
}
