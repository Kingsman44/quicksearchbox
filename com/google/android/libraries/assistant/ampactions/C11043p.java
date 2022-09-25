package com.google.android.libraries.assistant.ampactions;

import android.view.View;
import androidx.core.graphics.C1924a;
import androidx.customview.p103b.C2149g;

/* renamed from: com.google.android.libraries.assistant.ampactions.p */
/* compiled from: PG */
final class C11043p extends C2149g {

    /* renamed from: a */
    final /* synthetic */ C11044q f36275a;

    public C11043p(C11044q qVar) {
        this.f36275a = qVar;
    }

    /* renamed from: a */
    public final int mo5392a(View view, int i, int i2) {
        float f;
        float f2;
        if (((float) view.getTop()) > this.f36275a.f36277b) {
            f2 = (float) i2;
            f = 3.0f;
        } else {
            f2 = (float) i2;
            f = 1.75f;
        }
        return Math.min(Math.max(view.getTop() + ((int) (f2 / f)), this.f36275a.f36278c.getPaddingTop()), this.f36275a.f36278c.getHeight());
    }

    /* renamed from: b */
    public final int mo5393b(int i) {
        return i;
    }

    /* renamed from: c */
    public final int mo5394c(View view) {
        return 0;
    }

    /* renamed from: d */
    public final int mo5395d(View view) {
        return this.f36275a.f36278c.getHeight();
    }

    /* renamed from: h */
    public final void mo5399h(View view, float f, float f2) {
        C11044q qVar = this.f36275a;
        int top = view.getTop();
        if ((f2 <= 0.0f || ((float) top) <= qVar.f36276a) && (f2 <= 1750.0f || ((float) top) <= qVar.f36276a / 3.0f)) {
            if (f2 > 0.0f) {
                this.f36275a.f36279d.mo5411h(view.getLeft(), this.f36275a.f36278c.getHeight() - view.getHeight());
            } else {
                this.f36275a.f36279d.mo5411h(view.getLeft(), 0);
            }
            this.f36275a.f36278c.invalidate();
            return;
        }
        this.f36275a.f36282g.f36251a.mo19503b();
    }

    /* renamed from: i */
    public final boolean mo5400i(View view, int i) {
        C11036i iVar = this.f36275a.f36282g;
        C11039l lVar = iVar.f36251a;
        if (view != lVar.f36254a || lVar.f36268o < ((float) lVar.f36258e.getTop())) {
            return false;
        }
        C11039l lVar2 = iVar.f36251a;
        return lVar2.f36268o <= ((float) lVar2.f36258e.getBottom());
    }

    /* renamed from: j */
    public final int mo5401j(View view, int i) {
        return 0;
    }

    /* renamed from: m */
    public final void mo5404m(View view, int i, int i2) {
        C11044q qVar = this.f36275a;
        qVar.f36280e = view;
        qVar.f36281f = i2;
        this.f36275a.f36282g.f36251a.f36267n.setColor(C1924a.m5189h(-16777216, Math.round((1.0f - (((float) i2) / ((float) qVar.f36278c.getHeight()))) * 150.0f)));
    }
}
