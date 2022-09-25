package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import java.util.Calendar;

/* renamed from: com.google.android.material.datepicker.k */
/* compiled from: PG */
final class C44638k extends BaseAdapter {

    /* renamed from: a */
    private final Calendar f116298a;

    /* renamed from: b */
    private final int f116299b;

    /* renamed from: c */
    private final int f116300c;

    public C44638k() {
        Calendar g = C44625au.m79086g((Calendar) null);
        this.f116298a = g;
        this.f116299b = g.getMaximum(7);
        this.f116300c = g.getFirstDayOfWeek();
    }

    /* renamed from: a */
    private final int m79096a(int i) {
        int i2 = i + this.f116300c;
        int i3 = this.f116299b;
        return i2 > i3 ? i2 - i3 : i2;
    }

    public final int getCount() {
        return this.f116299b;
    }

    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        if (i >= this.f116299b) {
            return null;
        }
        return Integer.valueOf(m79096a(i));
    }

    public final long getItemId(int i) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x0018
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r0 = 2131626037(0x7f0e0835, float:1.8879299E38)
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0018:
            java.util.Calendar r7 = r5.f116298a
            int r6 = r5.m79096a(r6)
            r2 = 7
            r7.set(r2, r6)
            android.content.res.Resources r6 = r0.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            java.util.Locale r6 = r6.locale
            java.util.Calendar r7 = r5.f116298a
            r3 = 4
            java.lang.String r6 = r7.getDisplayName(r2, r3, r6)
            r0.setText(r6)
            android.content.Context r6 = r8.getContext()
            r7 = 2132089533(0x7f151abd, float:1.981938E38)
            java.lang.String r6 = r6.getString(r7)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.util.Calendar r8 = r5.f116298a
            r3 = 2
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r8 = r8.getDisplayName(r2, r3, r4)
            r7[r1] = r8
            java.lang.String r6 = java.lang.String.format(r6, r7)
            r0.setContentDescription(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C44638k.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public C44638k(int i) {
        Calendar g = C44625au.m79086g((Calendar) null);
        this.f116298a = g;
        this.f116299b = g.getMaximum(7);
        this.f116300c = i;
    }
}
