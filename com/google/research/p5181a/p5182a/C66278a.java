package com.google.research.p5181a.p5182a;

import java.util.LinkedList;

/* renamed from: com.google.research.a.a.a */
/* compiled from: PG */
public final class C66278a {

    /* renamed from: a */
    public int f180247a = -1;

    /* renamed from: b */
    public int f180248b = 0;

    /* renamed from: c */
    public Object[] f180249c;

    /* renamed from: d */
    public LinkedList f180250d;

    /* renamed from: e */
    public int f180251e = -1;

    public C66278a(int i, boolean z) {
        if (i > 0) {
            this.f180249c = new Object[i];
            if (z) {
                this.f180250d = new LinkedList();
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    /* renamed from: a */
    public final Object mo59448a(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f180248b)) {
            return null;
        }
        int i3 = this.f180247a - ((i2 - i) - 1);
        if (i3 < 0) {
            i3 += this.f180249c.length;
        }
        return this.f180249c[i3];
    }

    /* renamed from: b */
    public final Object mo59449b() {
        if (this.f180248b == 0) {
            return null;
        }
        return this.f180249c[this.f180247a];
    }

    /* renamed from: c */
    public final void mo59450c() {
        this.f180247a = -1;
        this.f180251e = -1;
        this.f180248b = 0;
    }

    /* renamed from: d */
    public final boolean mo59451d() {
        LinkedList linkedList = this.f180250d;
        return linkedList != null && linkedList.size() < this.f180249c.length;
    }

    /* renamed from: e */
    public final void mo59452e(Object obj) {
        int i = this.f180247a + 1;
        this.f180247a = i;
        Object[] objArr = this.f180249c;
        if (i == objArr.length) {
            i = 0;
            this.f180247a = 0;
        }
        if (objArr[i] != null && mo59451d()) {
            this.f180250d.add(this.f180249c[this.f180247a]);
        }
        Object[] objArr2 = this.f180249c;
        objArr2[this.f180247a] = obj;
        int i2 = this.f180248b;
        if (i2 < objArr2.length) {
            this.f180248b = i2 + 1;
        }
        this.f180251e++;
    }
}
