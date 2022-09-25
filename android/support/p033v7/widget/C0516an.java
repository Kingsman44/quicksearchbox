package android.support.p033v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.core.widget.C2114ab;
import androidx.p111g.p112a.C2253a;
import androidx.p111g.p113b.C2267j;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.widget.an */
/* compiled from: PG */
public class C0516an extends RadioButton implements C2114ab {

    /* renamed from: a */
    private final C0504ab f2067a;

    /* renamed from: b */
    private final C0779y f2068b;

    /* renamed from: c */
    private final C0543bm f2069c;

    /* renamed from: d */
    private C0510ah f2070d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0516an(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        C0732im.m2470a(context);
        C0730ik.m2467d(this, getContext());
        C0504ab abVar = new C0504ab(this);
        this.f2067a = abVar;
        abVar.mo2474b(attributeSet, R.attr.radioButtonStyle);
        C0779y yVar = new C0779y(this);
        this.f2068b = yVar;
        yVar.mo3307d(attributeSet, R.attr.radioButtonStyle);
        C0543bm bmVar = new C0543bm(this);
        this.f2069c = bmVar;
        bmVar.mo2570b(attributeSet, R.attr.radioButtonStyle);
        m1915d().mo2496a(attributeSet, R.attr.radioButtonStyle);
    }

    /* renamed from: d */
    private final C0510ah m1915d() {
        if (this.f2070d == null) {
            this.f2070d = new C0510ah(this);
        }
        return this.f2070d;
    }

    /* renamed from: a */
    public final ColorStateList mo1930a() {
        throw null;
    }

    /* renamed from: c */
    public final void mo1931c() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0779y yVar = this.f2068b;
        if (yVar != null) {
            yVar.mo3306c();
        }
        C0543bm bmVar = this.f2069c;
        if (bmVar != null) {
            bmVar.mo2569a();
        }
    }

    public final int getCompoundPaddingLeft() {
        return super.getCompoundPaddingLeft();
    }

    /* renamed from: lj */
    public final void mo1934lj(PorterDuff.Mode mode) {
        throw null;
    }

    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        C2267j jVar = m1915d().f2055a;
        C2253a aVar = C2253a.f6344b;
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0779y yVar = this.f2068b;
        if (yVar != null) {
            yVar.mo3312i();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0779y yVar = this.f2068b;
        if (yVar != null) {
            yVar.mo3308e(i);
        }
    }

    public final void setButtonDrawable(int i) {
        setButtonDrawable(C0678gm.m2375e().mo3100c(getContext(), i));
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0543bm bmVar = this.f2069c;
        if (bmVar != null) {
            bmVar.mo2569a();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0543bm bmVar = this.f2069c;
        if (bmVar != null) {
            bmVar.mo2569a();
        }
    }

    public final void setFilters(InputFilter[] inputFilterArr) {
        C2267j jVar = m1915d().f2055a;
        C2253a aVar = C2253a.f6344b;
        super.setFilters(inputFilterArr);
    }

    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0504ab abVar = this.f2067a;
        if (abVar != null) {
            abVar.mo2475c();
        }
    }
}
