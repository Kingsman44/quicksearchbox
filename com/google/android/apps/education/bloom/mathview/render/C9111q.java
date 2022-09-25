package com.google.android.apps.education.bloom.mathview.render;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ImageSpan;
import com.google.android.p3545q.p3546a.C45206d;
import com.google.apps.p3589d.p3590a.C45681a;
import com.google.apps.p3589d.p3590a.C45685b;
import com.google.apps.p3589d.p3590a.C45699p;
import com.google.apps.p3589d.p3590a.C45705v;
import com.google.apps.p3589d.p3594e.C45795y;
import com.google.apps.p3589d.p3600k.C45937b;
import com.google.apps.p3589d.p3600k.C45944i;
import com.google.apps.p3589d.p3600k.C45946k;
import com.google.common.p4535g.C59203do;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.q */
/* compiled from: PG */
public final class C9111q extends ImageSpan {

    /* renamed from: a */
    public final C45206d f31380a;

    /* renamed from: b */
    public final C45705v f31381b;

    /* renamed from: c */
    public int f31382c;

    /* renamed from: d */
    private final float f31383d = 0.1f;

    public C9111q(C45206d dVar, C45705v vVar) {
        super(dVar, 0);
        this.f31380a = dVar;
        this.f31381b = vVar;
    }

    /* renamed from: c */
    private final void m23647c(Paint paint) {
        this.f31380a.mo49045j(paint);
        C45206d dVar = this.f31380a;
        dVar.setBounds(0, 0, dVar.getIntrinsicWidth(), this.f31380a.getIntrinsicHeight());
    }

    /* renamed from: a */
    public final C45699p mo17420a(int i) {
        C45206d dVar = this.f31380a;
        C45705v vVar = this.f31381b;
        vVar.mo49801b(new C45685b(i, i));
        C45795y yVar = (C45795y) vVar;
        C45699p k = yVar.mo49916r().mo50016k(yVar.f120412h, C45944i.f120734c);
        C69664n.m101060f(k, "editor.setSelection(Sele…rsorPosition)).cursorData");
        C69664n.m101061g(k, "cursorData");
        C45944i b = k.mo49732b();
        C69664n.m101060f(b, "cursorData.bottomPosition");
        C45937b bVar = new C45937b(dVar.mo49032a(b.mo50042a()), dVar.mo49033b(b.mo50043b()));
        double d = dVar.mo49039g().mo49789d(k.mo49731a());
        float d2 = dVar.mo49035d();
        C45946k c = k.mo49733c();
        C69664n.m101060f(c, "cursorData.selection");
        double d3 = (double) d2;
        Double.isNaN(d3);
        C45699p d4 = C45699p.m81425d(bVar, d / d3, C45946k.m82043h(dVar.mo49032a(c.mo50049c()), dVar.mo49033b(c.mo50050d()), dVar.mo49032a(c.mo50047a()), dVar.mo49033b(c.mo50048b())));
        double d5 = (double) this.f31382c;
        C45681a aVar = (C45681a) d4;
        return new C45681a(aVar.f120165a.mo50055c(C59203do.f157270a, d5), aVar.f120166b, aVar.f120167c.mo50064j(C59203do.f157270a, d5));
    }

    /* renamed from: b */
    public final String mo17421b() {
        String str = ((C45795y) this.f31381b).f120411g;
        C69664n.m101060f(str, "editor.serialized");
        return str;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint paint2 = paint;
        C69664n.m101061g(canvas, "canvas");
        C69664n.m101061g(paint2, "paint");
        this.f31380a.mo49044i(this.f31381b);
        m23647c(paint2);
        int i6 = (i5 - this.f31380a.getBounds().bottom) / 2;
        this.f31382c = i6;
        int i7 = i3 + i6;
        int i8 = i5 - i6;
        super.draw(canvas, charSequence, i, i2, f, i7, i4, i8, paint2);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C69664n.m101061g(paint, "paint");
        m23647c(paint);
        Rect bounds = this.f31380a.getBounds();
        C69664n.m101060f(bounds, "drawable.bounds");
        int textSize = (int) (paint.getTextSize() * this.f31383d);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = (-this.f31380a.mo49037e()) - textSize;
            fontMetricsInt.descent = this.f31380a.mo49038f() + textSize;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = fontMetricsInt.descent;
        }
        return bounds.right;
    }
}
