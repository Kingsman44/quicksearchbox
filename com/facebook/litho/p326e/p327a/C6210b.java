package com.facebook.litho.p326e.p327a;

import com.google.common.p4535g.C59203do;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.facebook.litho.e.a.b */
/* compiled from: PG */
public final class C6210b {

    /* renamed from: i */
    private static int f18358i;

    /* renamed from: a */
    public C6211c f18359a;

    /* renamed from: b */
    public final C6209a f18360b = new C6209a();

    /* renamed from: c */
    public final C6209a f18361c = new C6209a();

    /* renamed from: d */
    public final C6209a f18362d = new C6209a();

    /* renamed from: e */
    public double f18363e;

    /* renamed from: f */
    public boolean f18364f = true;

    /* renamed from: g */
    public double f18365g = C59203do.f157270a;

    /* renamed from: h */
    public final CopyOnWriteArraySet f18366h = new CopyOnWriteArraySet();

    public C6210b() {
        f18358i++;
        this.f18359a = C6211c.f18367a;
    }

    /* renamed from: a */
    public final boolean mo13171a() {
        if (Math.abs(this.f18360b.f18357b) > 0.005d) {
            return false;
        }
        if (Math.abs(this.f18363e - this.f18360b.f18356a) <= 0.005d) {
            return true;
        }
        double d = this.f18359a.f18369c;
        return false;
    }

    /* renamed from: b */
    public final void mo13172b(double d) {
        if (this.f18363e != d || !mo13171a()) {
            this.f18363e = d;
            Iterator it = this.f18366h.iterator();
            while (it.hasNext()) {
                ((C6212d) it.next()).mo13175c();
            }
        }
    }
}
