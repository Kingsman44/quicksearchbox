package com.google.ads.interactivemedia.p367v3.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.mc */
/* compiled from: PG */
final class C7112mc extends C7114me {

    /* renamed from: a */
    public final long f22907a;

    /* renamed from: b */
    public final List f22908b = new ArrayList();

    /* renamed from: c */
    public final List f22909c = new ArrayList();

    public C7112mc(int i, long j) {
        super(i);
        this.f22907a = j;
    }

    /* renamed from: a */
    public final void mo16167a(C7113md mdVar) {
        this.f22908b.add(mdVar);
    }

    /* renamed from: b */
    public final void mo16168b(C7112mc mcVar) {
        this.f22909c.add(mcVar);
    }

    /* renamed from: c */
    public final C7113md mo16169c(int i) {
        int size = this.f22908b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C7113md mdVar = (C7113md) this.f22908b.get(i2);
            if (mdVar.f22911d == i) {
                return mdVar;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final C7112mc mo16170d(int i) {
        int size = this.f22909c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C7112mc mcVar = (C7112mc) this.f22909c.get(i2);
            if (mcVar.f22911d == i) {
                return mcVar;
            }
        }
        return null;
    }

    public final String toString() {
        String g = m21132g(this.f22911d);
        String arrays = Arrays.toString(this.f22908b.toArray());
        String arrays2 = Arrays.toString(this.f22909c.toArray());
        int length = String.valueOf(g).length();
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
        sb.append(g);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
