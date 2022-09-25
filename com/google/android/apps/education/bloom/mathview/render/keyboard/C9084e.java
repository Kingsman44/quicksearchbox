package com.google.android.apps.education.bloom.mathview.render.keyboard;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.p3545q.p3546a.C45203a;
import com.google.android.p3545q.p3546a.C45206d;
import p5462h.p5473f.p5475b.C69649af;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69669s;
import p5462h.p5478h.C69684c;
import p5462h.p5481k.C69713k;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.keyboard.e */
/* compiled from: PG */
public final class C9084e extends C9082c {

    /* renamed from: f */
    static final /* synthetic */ C69713k[] f31331f;

    /* renamed from: g */
    private final C45203a f31332g;

    /* renamed from: h */
    private final C69684c f31333h = new C9083d(this);

    static {
        C69669s sVar = new C69669s(C9084e.class, "typeface", "getTypeface()Landroid/graphics/Typeface;");
        int i = C69649af.f186028a;
        f31331f = new C69713k[]{sVar};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9084e(float f, Context context) {
        super(f);
        C69664n.m101061g(context, "context");
        this.f31332g = new C45203a(40.0f, true, C1878d.m5128a(context, R.color.keyboard_button_primary_text_color), 16);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        if (r0 != null) goto L_0x005f;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Float mo17395b(android.view.View r6) {
        /*
            r5 = this;
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            java.lang.String r0 = "view"
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r0)
            int r0 = r6.getWidth()
            r1 = 0
            if (r0 == 0) goto L_0x009b
            int r0 = r6.getHeight()
            if (r0 != 0) goto L_0x0016
            goto L_0x009b
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r6.getDrawable()
            boolean r2 = r0 instanceof com.google.android.p3545q.p3546a.C45206d
            if (r2 == 0) goto L_0x0021
            com.google.android.q.a.d r0 = (com.google.android.p3545q.p3546a.C45206d) r0
            goto L_0x0022
        L_0x0021:
            r0 = r1
        L_0x0022:
            if (r0 != 0) goto L_0x0058
            h.h.c r0 = r5.f31333h
            h.k.k[] r2 = f31331f
            r3 = 0
            r2 = r2[r3]
            java.lang.Object r0 = r0.mo42046c(r2)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x009b
            r2 = 2131432628(0x7f0b14b4, float:1.8487019E38)
            java.lang.Object r2 = r6.getTag(r2)
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L_0x0041
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0042
        L_0x0041:
            r2 = r1
        L_0x0042:
            if (r2 == 0) goto L_0x009b
            com.google.android.q.a.a r3 = r5.f31332g
            com.google.android.p3545q.p3546a.C45204b.m80490a(r6, r2, r0, r3)
            android.graphics.drawable.Drawable r0 = r6.getDrawable()
            boolean r2 = r0 instanceof com.google.android.p3545q.p3546a.C45206d
            if (r2 == 0) goto L_0x0054
            com.google.android.q.a.d r0 = (com.google.android.p3545q.p3546a.C45206d) r0
            goto L_0x0055
        L_0x0054:
            r0 = r1
        L_0x0055:
            if (r0 == 0) goto L_0x009b
            goto L_0x005f
        L_0x0058:
            com.google.android.q.a.a r2 = r5.f31332g
            float r2 = r2.f117959a
            r0.mo49046k(r2)
        L_0x005f:
            int r2 = r6.getWidth()
            int r3 = r6.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r6.getPaddingRight()
            int r2 = r2 - r3
            float r2 = (float) r2
            int r3 = r0.getIntrinsicWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            int r3 = r6.getHeight()
            int r4 = r6.getPaddingTop()
            int r3 = r3 - r4
            int r6 = r6.getPaddingBottom()
            int r3 = r3 - r6
            float r6 = (float) r3
            int r0 = r0.getIntrinsicHeight()
            float r0 = (float) r0
            float r6 = r6 / r0
            float r6 = java.lang.Math.min(r2, r6)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            float r0 = r6.floatValue()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x009b
            return r6
        L_0x009b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.education.bloom.mathview.render.keyboard.C9084e.mo17395b(android.view.View):java.lang.Float");
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo17396d(View view, float f) {
        ImageView imageView = (ImageView) view;
        C69664n.m101061g(imageView, "view");
        Drawable drawable = imageView.getDrawable();
        C45206d dVar = drawable instanceof C45206d ? (C45206d) drawable : null;
        if (dVar != null) {
            dVar.mo49046k(this.f31332g.f117959a * f);
            dVar.setBounds(0, 0, dVar.getIntrinsicWidth(), dVar.getIntrinsicHeight());
            imageView.invalidate();
        }
    }

    /* renamed from: f */
    public final void mo17404f(Typeface typeface) {
        this.f31333h.mo42045b(f31331f[0], typeface);
    }
}
