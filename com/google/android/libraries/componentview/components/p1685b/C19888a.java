package com.google.android.libraries.componentview.components.p1685b;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.componentview.components.b.a */
/* compiled from: PG */
final class C19888a extends ArrayAdapter {

    /* renamed from: a */
    final /* synthetic */ C19893b f55623a;

    /* renamed from: b */
    private final int f55624b;

    /* renamed from: c */
    private final int f55625c;

    /* renamed from: d */
    private final int f55626d;

    /* renamed from: e */
    private final float f55627e;

    /* renamed from: f */
    private final Typeface f55628f;

    /* renamed from: g */
    private final int f55629g;

    /* renamed from: h */
    private final int f55630h;

    /* renamed from: i */
    private final int f55631i;

    /* renamed from: j */
    private final int f55632j;

    /* renamed from: k */
    private final int f55633k;

    /* renamed from: l */
    private final boolean f55634l;

    /* renamed from: m */
    private final float f55635m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19888a(C19893b bVar, Context context, ArrayList arrayList, int i, int i2, int i3, float f, Typeface typeface, int i4, boolean z, float f2, int i5, int i6, int i7, int i8) {
        super(context, 17367049, arrayList);
        this.f55623a = bVar;
        this.f55624b = i;
        this.f55625c = i2;
        this.f55626d = i3;
        this.f55627e = f;
        this.f55628f = typeface;
        this.f55629g = i4;
        this.f55630h = i5;
        this.f55631i = i6;
        this.f55632j = i7;
        this.f55633k = i8;
        this.f55634l = z;
        this.f55635m = f2;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        C19896e eVar;
        if (this.f55624b == 1) {
            return super.getDropDownView(i, view, viewGroup);
        }
        if (view instanceof C19896e) {
            eVar = (C19896e) view;
        } else {
            eVar = new C19896e(this.f55623a.f56304o);
        }
        eVar.f55661a.setText((CharSequence) getItem(i));
        eVar.f55662b.setVisibility(i == getCount() + -1 ? 8 : 0);
        return eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            r0 = 0
            if (r8 != 0) goto L_0x007e
            android.widget.TextView r8 = new android.widget.TextView
            android.content.Context r1 = r6.getContext()
            r8.<init>(r1)
            int r1 = r6.f55625c
            r8.setTextColor(r1)
            float r1 = r6.f55627e
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x001b
            r8.setTextSize(r1)
        L_0x001b:
            android.graphics.Typeface r1 = r6.f55628f
            if (r1 == 0) goto L_0x0022
            r8.setTypeface(r1)
        L_0x0022:
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            r8.setEllipsize(r1)
            int r1 = r6.f55629g
            r8.setGravity(r1)
            com.google.android.libraries.componentview.components.b.b r1 = r6.f55623a
            android.view.View r1 = r1.f56305p
            android.widget.Spinner r1 = (android.widget.Spinner) r1
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            if (r1 == 0) goto L_0x0043
            r8.setLayoutParams(r1)
            int r1 = r1.width
            r3 = -2
            if (r1 == r3) goto L_0x0043
            r1 = 50
            goto L_0x0044
        L_0x0043:
            r1 = 0
        L_0x0044:
            int r3 = r6.f55630h
            int r4 = r6.f55631i
            int r5 = r6.f55632j
            int r5 = r5 + r1
            int r1 = r6.f55633k
            androidx.core.p098j.C2043bi.m5556aj(r8, r3, r4, r5, r1)
            r1 = 1
            r8.setLines(r1)
            boolean r1 = r6.f55634l
            if (r1 != 0) goto L_0x005c
            int r3 = r6.f55626d
            if (r3 == 0) goto L_0x0080
        L_0x005c:
            int r3 = r6.f55626d
            float r4 = r6.f55635m
            android.graphics.drawable.GradientDrawable r5 = new android.graphics.drawable.GradientDrawable
            r5.<init>()
            if (r3 <= 0) goto L_0x006a
            r5.setColor(r3)
        L_0x006a:
            if (r1 == 0) goto L_0x007a
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0073
            r5.setCornerRadius(r4)
        L_0x0073:
            r1 = 2
            r2 = -3355444(0xffffffffffcccccc, float:NaN)
            r5.setStroke(r1, r2)
        L_0x007a:
            r8.setBackground(r5)
            goto L_0x0080
        L_0x007e:
            android.widget.TextView r8 = (android.widget.TextView) r8
        L_0x0080:
            boolean r1 = r9 instanceof android.widget.AdapterView
            if (r1 == 0) goto L_0x008d
            android.widget.AdapterView r9 = (android.widget.AdapterView) r9
            int r7 = r9.getSelectedItemPosition()
            if (r7 >= 0) goto L_0x008d
            r7 = 0
        L_0x008d:
            java.lang.Object r7 = r6.getItem(r7)
            java.lang.String r7 = (java.lang.String) r7
            r8.setText(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.componentview.components.p1685b.C19888a.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
