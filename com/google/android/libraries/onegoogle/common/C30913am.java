package com.google.android.libraries.onegoogle.common;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.chip.C44596f;
import com.google.android.material.chip.Chip;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;

/* renamed from: com.google.android.libraries.onegoogle.common.am */
/* compiled from: PG */
public final class C30913am {

    /* renamed from: a */
    private final TextView f83339a;

    /* renamed from: b */
    private C58833ax f83340b = C58836b.f156633a;

    /* renamed from: c */
    private Iterable f83341c = C58485gu.m89845m();

    public C30913am(TextView textView) {
        this.f83339a = textView;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m57703c(float r5) {
        /*
            r4 = this;
            android.widget.TextView r0 = r4.f83339a
            java.lang.Iterable r1 = r4.f83341c
            r2 = 0
            java.lang.Object r1 = com.google.common.p4522b.C58557jl.m90132m(r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0038
            java.lang.Iterable r2 = r4.f83341c
            int r2 = com.google.common.p4522b.C58557jl.m90121b(r2)
            r3 = 1
            if (r2 > r3) goto L_0x001a
            goto L_0x0038
        L_0x001a:
            android.text.TextPaint r0 = r0.getPaint()
            java.lang.Iterable r2 = r4.f83341c
            com.google.android.libraries.onegoogle.common.al r3 = new com.google.android.libraries.onegoogle.common.al
            r3.<init>(r0, r5)
            com.google.common.base.ax r5 = com.google.common.p4522b.C58557jl.m90122c(r2, r3)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r1)
            com.google.common.base.ax r5 = r5.mo56105a(r0)
            java.lang.Object r5 = r5.mo56111f()
            r1 = r5
            java.lang.String r1 = (java.lang.String) r1
        L_0x0038:
            if (r1 == 0) goto L_0x0048
            android.widget.TextView r5 = r4.f83339a
            java.lang.CharSequence r5 = r5.getText()
            boolean r5 = r1.contentEquals(r5)
            if (r5 != 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            return
        L_0x0048:
            android.widget.TextView r5 = r4.f83339a
            r5.setText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.common.C30913am.m57703c(float):void");
    }

    /* renamed from: a */
    public final void mo36593a(C58485gu guVar) {
        this.f83341c = C58557jl.m90124e(guVar, C30911ak.f83336a);
        if (this.f83340b.mo56113h()) {
            m57703c(((Float) this.f83340b.mo56107c()).floatValue());
        }
    }

    /* renamed from: b */
    public final void mo36594b(int i) {
        float f = (float) i;
        TextView textView = this.f83339a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        View view = (View) textView.getParent();
        float paddingLeft = (float) (view.getPaddingLeft() + view.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + textView.getPaddingLeft() + textView.getPaddingRight());
        if (textView instanceof Chip) {
            C44596f fVar = ((Chip) textView).f116093d;
            float f2 = 0.0f;
            float f3 = fVar != null ? fVar.f116171q : 0.0f;
            if (fVar != null) {
                f2 = fVar.f116172r;
            }
            paddingLeft += f3 + f2;
        }
        float f4 = f - paddingLeft;
        if (!this.f83340b.mo56113h() || f4 != ((Float) this.f83340b.mo56107c()).floatValue()) {
            this.f83340b = C58833ax.m90834k(Float.valueOf(f4));
            m57703c(f4);
        }
    }
}
