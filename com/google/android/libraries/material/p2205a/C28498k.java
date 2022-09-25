package com.google.android.libraries.material.p2205a;

import com.google.common.p4535g.C59203do;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.libraries.material.a.k */
/* compiled from: PG */
public final class C28498k {

    /* renamed from: a */
    public final double f77332a = 100.0d;

    /* renamed from: b */
    public final double f77333b = 18.0d;

    /* renamed from: c */
    public final CopyOnWriteArrayList f77334c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public double f77335d;

    /* renamed from: e */
    public double f77336e;

    /* renamed from: f */
    public double f77337f;

    /* renamed from: g */
    public double f77338g;

    /* renamed from: h */
    public double f77339h;

    /* renamed from: i */
    public double f77340i;

    /* renamed from: j */
    public double f77341j;

    /* renamed from: k */
    public boolean f77342k = true;

    /* renamed from: l */
    public boolean f77343l = false;

    /* renamed from: m */
    public double f77344m = C59203do.f157270a;

    /* renamed from: d */
    public static boolean m53271d(double d, double d2, double d3) {
        return d2 < d3 ? d > d3 : d < d3;
    }

    /* renamed from: a */
    public final boolean mo33954a() {
        if (Math.abs(this.f77338g) > 0.005d || Math.abs(this.f77341j - this.f77337f) > 0.005d) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo33955b(double d) {
        if (d != this.f77341j) {
            this.f77341j = d;
            this.f77340i = this.f77337f;
            Iterator it = this.f77334c.iterator();
            while (it.hasNext()) {
                ((C28502o) it.next()).mo33957a(this);
            }
        }
    }

    /* renamed from: c */
    public final void mo33956c(double d) {
        if (d != this.f77337f) {
            this.f77337f = d;
            this.f77340i = d;
            Iterator it = this.f77334c.iterator();
            while (it.hasNext()) {
                C28502o oVar = (C28502o) it.next();
                oVar.mo33957a(this);
                oVar.mo33961b(d);
            }
        }
    }
}
