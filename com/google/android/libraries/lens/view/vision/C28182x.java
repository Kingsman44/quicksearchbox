package com.google.android.libraries.lens.view.vision;

import com.google.android.libraries.p1730f.C21370a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.lens.view.vision.x */
/* compiled from: PG */
public final class C28182x {

    /* renamed from: a */
    public final Object f76695a = new Object();

    /* renamed from: b */
    public final Map f76696b = new LinkedHashMap();

    /* renamed from: c */
    public boolean f76697c;

    /* renamed from: d */
    public final C28176r f76698d = new C28176r();

    /* renamed from: e */
    private final C21370a f76699e;

    /* renamed from: f */
    private final boolean f76700f;

    public C28182x(C21370a aVar, boolean z) {
        this.f76699e = aVar;
        this.f76700f = z;
        this.f76697c = z;
    }

    /* renamed from: a */
    public final void mo33699a(long j) {
        if (this.f76697c) {
            this.f76698d.mo33694c();
            long c = this.f76699e.mo26871c();
            double d = (double) j;
            Double.isNaN(d);
            long round = Math.round(d / 1000000.0d);
            synchronized (this.f76695a) {
                this.f76696b.put(Long.valueOf(c), Long.valueOf(round));
                long j2 = c - 1000;
                Iterator it = this.f76696b.keySet().iterator();
                while (it.hasNext() && ((Long) it.next()).longValue() < j2) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo33700b(boolean z) {
        if (!this.f76700f) {
            this.f76697c = z;
        }
    }
}
