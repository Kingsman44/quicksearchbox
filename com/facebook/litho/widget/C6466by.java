package com.facebook.litho.widget;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.facebook.litho.widget.by */
/* compiled from: PG */
final class C6466by implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    private final boolean f19163a;

    /* renamed from: b */
    private final List f19164b;

    /* renamed from: c */
    private int f19165c;

    /* renamed from: d */
    private int f19166d;

    public C6466by(List list, int i, int i2, boolean z) {
        this.f19164b = new ArrayList(list);
        this.f19165c = z ? i - 1 : i + 1;
        this.f19166d = i2;
        this.f19163a = z;
    }

    /* renamed from: b */
    private final void m17483b() {
        this.f19165c = this.f19163a ? this.f19165c - 1 : this.f19165c + 1;
    }

    /* renamed from: a */
    public final synchronized C6548m next() {
        if (!hasNext()) {
            return null;
        }
        C6548m mVar = (C6548m) this.f19164b.get(this.f19165c);
        m17483b();
        this.f19166d--;
        return mVar;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        while (this.f19166d > 0 && (r0 = this.f19165c) >= 0 && r0 < this.f19164b.size()) {
            C6548m mVar = (C6548m) this.f19164b.get(this.f19165c);
            if (mVar.mo13632d().mo13532n() && !mVar.mo13641m()) {
                return true;
            }
            m17483b();
        }
        return false;
    }

    public final void remove() {
    }
}
