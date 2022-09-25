package com.android.datetimepicker.date;

import java.util.Calendar;

/* renamed from: com.android.datetimepicker.date.t */
/* compiled from: PG */
public final class C5097t implements Comparable {

    /* renamed from: a */
    int f16263a;

    /* renamed from: b */
    int f16264b;

    /* renamed from: c */
    int f16265c;

    /* renamed from: d */
    private Calendar f16266d;

    public C5097t() {
        m13971c(System.currentTimeMillis());
    }

    public C5097t(int i, int i2, int i3) {
        this.f16263a = i;
        this.f16264b = i2;
        this.f16265c = i3;
    }

    /* renamed from: c */
    private final void m13971c(long j) {
        if (this.f16266d == null) {
            this.f16266d = Calendar.getInstance();
        }
        this.f16266d.setTimeInMillis(j);
        this.f16264b = this.f16266d.get(2);
        this.f16263a = this.f16266d.get(1);
        this.f16265c = this.f16266d.get(5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = com.android.datetimepicker.date.C5096s.m13970a(r2.f16264b, r3.f16264b);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compareTo(com.android.datetimepicker.date.C5097t r3) {
        /*
            r2 = this;
            int r0 = r2.f16263a
            int r1 = r3.f16263a
            int r0 = com.android.datetimepicker.date.C5096s.m13970a(r0, r1)
            if (r0 != 0) goto L_0x001e
            int r0 = r2.f16264b
            int r1 = r3.f16264b
            int r0 = com.android.datetimepicker.date.C5096s.m13970a(r0, r1)
            if (r0 == 0) goto L_0x0015
            goto L_0x001e
        L_0x0015:
            int r0 = r2.f16265c
            int r3 = r3.f16265c
            int r3 = com.android.datetimepicker.date.C5096s.m13970a(r0, r3)
            return r3
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.datetimepicker.date.C5097t.compareTo(com.android.datetimepicker.date.t):int");
    }

    /* renamed from: b */
    public final void mo10111b(C5097t tVar) {
        this.f16263a = tVar.f16263a;
        this.f16264b = tVar.f16264b;
        this.f16265c = tVar.f16265c;
    }

    public C5097t(long j) {
        m13971c(j);
    }

    public C5097t(Calendar calendar) {
        this.f16263a = calendar.get(1);
        this.f16264b = calendar.get(2);
        this.f16265c = calendar.get(5);
    }
}
