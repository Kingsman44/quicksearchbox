package android.support.p033v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import androidx.p111g.p112a.C2253a;
import androidx.p111g.p113b.C2267j;

/* renamed from: android.support.v7.widget.br */
/* compiled from: PG */
public final class C0548br extends ToggleButton {

    /* renamed from: a */
    private final C0779y f2136a;

    /* renamed from: b */
    private final C0543bm f2137b;

    /* renamed from: c */
    private C0510ah f2138c;

    public C0548br(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        C0730ik.m2467d(this, getContext());
        C0779y yVar = new C0779y(this);
        this.f2136a = yVar;
        yVar.mo3307d(attributeSet, 16842827);
        C0543bm bmVar = new C0543bm(this);
        this.f2137b = bmVar;
        bmVar.mo2570b(attributeSet, 16842827);
        m2023a().mo2496a(attributeSet, 16842827);
    }

    /* renamed from: a */
    private final C0510ah m2023a() {
        if (this.f2138c == null) {
            this.f2138c = new C0510ah(this);
        }
        return this.f2138c;
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0779y yVar = this.f2136a;
        if (yVar != null) {
            yVar.mo3306c();
        }
        C0543bm bmVar = this.f2137b;
        if (bmVar != null) {
            bmVar.mo2569a();
        }
    }

    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        C2267j jVar = m2023a().f2055a;
        C2253a aVar = C2253a.f6344b;
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0779y yVar = this.f2136a;
        if (yVar != null) {
            yVar.mo3312i();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0779y yVar = this.f2136a;
        if (yVar != null) {
            yVar.mo3308e(i);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0543bm bmVar = this.f2137b;
        if (bmVar != null) {
            bmVar.mo2569a();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0543bm bmVar = this.f2137b;
        if (bmVar != null) {
            bmVar.mo2569a();
        }
    }

    public final void setFilters(InputFilter[] inputFilterArr) {
        C2267j jVar = m2023a().f2055a;
        C2253a aVar = C2253a.f6344b;
        super.setFilters(inputFilterArr);
    }
}
