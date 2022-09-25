package com.facebook.litho.widget;

import android.util.SparseArray;
import com.facebook.litho.p334j.C6400c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.litho.widget.cx */
/* compiled from: PG */
public final class C6492cx {

    /* renamed from: a */
    final SparseArray f19257a = new SparseArray();

    /* renamed from: b */
    final Map f19258b = new HashMap();

    /* renamed from: c */
    public final int f19259c;

    /* renamed from: d */
    private final boolean f19260d;

    /* renamed from: e */
    private int f19261e;

    public C6492cx(boolean z, int i) {
        this.f19260d = z;
        this.f19259c = i;
        this.f19261e = i + 1;
    }

    /* renamed from: a */
    public final void mo13578a(C6491cw cwVar) {
        int i;
        int i2;
        if (cwVar.mo13533o()) {
            int i3 = C6462bu.f19144a;
            if (!"AdapterProxyRenderInfo".equals(cwVar.mo13577s())) {
                if (this.f19260d && !cwVar.mo13529k()) {
                    throw new IllegalStateException("If you enable custom viewTypes, you must provide a customViewType in ViewRenderInfo.");
                } else if (!this.f19260d && cwVar.mo13529k()) {
                    throw new IllegalStateException("You must enable custom viewTypes to provide customViewType in ViewRenderInfo.");
                } else if (!this.f19260d || this.f19259c != cwVar.mo13520b()) {
                    C6400c f = cwVar.mo13524f();
                    if (this.f19258b.containsKey(f)) {
                        i = ((Integer) this.f19258b.get(f)).intValue();
                    } else {
                        if (cwVar.mo13529k()) {
                            i2 = cwVar.mo13520b();
                        } else {
                            i2 = this.f19261e;
                            this.f19261e = i2 + 1;
                        }
                        this.f19257a.put(i2, f);
                        this.f19258b.put(f, Integer.valueOf(i2));
                        i = i2;
                    }
                    if (!cwVar.mo13529k()) {
                        cwVar.mo13528j(i);
                    }
                } else {
                    throw new IllegalStateException("CustomViewType cannot be the same as ComponentViewType.");
                }
            }
        }
    }
}
