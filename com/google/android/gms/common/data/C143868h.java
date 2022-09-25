package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.C143919bh;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.data.h */
/* compiled from: PG */
public abstract class C143868h extends C143861a {

    /* renamed from: b */
    private boolean f389978b = false;

    /* renamed from: c */
    private ArrayList f389979c;

    protected C143868h(DataHolder dataHolder) {
        super(dataHolder);
    }

    /* renamed from: a */
    private final void mo117629a() {
        synchronized (this) {
            if (!this.f389978b) {
                DataHolder dataHolder = this.f389971a;
                C143919bh.m233958a(dataHolder);
                int i = dataHolder.f389968h;
                ArrayList arrayList = new ArrayList();
                this.f389979c = arrayList;
                if (i > 0) {
                    arrayList.add(0);
                    String g = mo119344g();
                    String b = this.f389971a.mo119317b(g, 0, this.f389971a.mo119316a(0));
                    int i2 = 1;
                    while (i2 < i) {
                        int a = this.f389971a.mo119316a(i2);
                        String b2 = this.f389971a.mo119317b(g, i2, a);
                        if (b2 != null) {
                            if (!b2.equals(b)) {
                                this.f389979c.add(Integer.valueOf(i2));
                                b = b2;
                            }
                            i2++;
                        } else {
                            throw new NullPointerException("Missing value for markerColumn: " + g + ", at row: " + i2 + ", for window: " + a);
                        }
                    }
                }
                this.f389978b = true;
            }
        }
    }

    /* renamed from: c */
    public final int mo119324c() {
        mo117629a();
        return this.f389979c.size();
    }

    /* renamed from: d */
    public final Object mo119329d(int i) {
        int i2;
        int i3;
        mo117629a();
        int e = mo119342e(i);
        int i4 = 0;
        if (i >= 0 && i != this.f389979c.size()) {
            if (i == this.f389979c.size() - 1) {
                DataHolder dataHolder = this.f389971a;
                C143919bh.m233958a(dataHolder);
                i3 = dataHolder.f389968h;
                i2 = ((Integer) this.f389979c.get(i)).intValue();
            } else {
                i3 = ((Integer) this.f389979c.get(i + 1)).intValue();
                i2 = ((Integer) this.f389979c.get(i)).intValue();
            }
            i4 = i3 - i2;
            if (i4 == 1) {
                int e2 = mo119342e(i);
                DataHolder dataHolder2 = this.f389971a;
                C143919bh.m233958a(dataHolder2);
                dataHolder2.mo119316a(e2);
                i4 = 1;
            }
        }
        return mo119343f(e, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo119342e(int i) {
        if (i >= 0 && i < this.f389979c.size()) {
            return ((Integer) this.f389979c.get(i)).intValue();
        }
        throw new IllegalArgumentException("Position " + i + " is out of bounds for this buffer");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract Object mo119343f(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract String mo119344g();
}
