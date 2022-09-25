package android.support.p033v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.core.widget.C2114ab;
import androidx.p111g.p112a.C2253a;
import androidx.p111g.p113b.C2267j;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.widget.AppCompatCheckBox */
/* compiled from: PG */
public class AppCompatCheckBox extends CheckBox implements C2114ab {

    /* renamed from: a */
    private final C0504ab f1800a;

    /* renamed from: b */
    private final C0779y f1801b;

    /* renamed from: c */
    private final C0543bm f1802c;

    /* renamed from: d */
    private C0510ah f1803d;

    public AppCompatCheckBox(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: d */
    private final C0510ah m1728d() {
        if (this.f1803d == null) {
            this.f1803d = new C0510ah(this);
        }
        return this.f1803d;
    }

    /* renamed from: a */
    public final ColorStateList mo1930a() {
        return null;
    }

    /* renamed from: c */
    public final void mo1931c() {
        C0504ab abVar = this.f1800a;
        if (abVar != null) {
            abVar.f2034b = true;
            abVar.mo2473a();
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0779y yVar = this.f1801b;
        if (yVar != null) {
            yVar.mo3306c();
        }
        C0543bm bmVar = this.f1802c;
        if (bmVar != null) {
            bmVar.mo2569a();
        }
    }

    public final int getCompoundPaddingLeft() {
        return super.getCompoundPaddingLeft();
    }

    /* renamed from: lj */
    public final void mo1934lj(PorterDuff.Mode mode) {
        C0504ab abVar = this.f1800a;
        if (abVar != null) {
            abVar.f2033a = mode;
            abVar.f2035c = true;
            abVar.mo2473a();
        }
    }

    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        C2267j jVar = m1728d().f2055a;
        C2253a aVar = C2253a.f6344b;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0779y yVar = this.f1801b;
        if (yVar != null) {
            yVar.mo3312i();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0779y yVar = this.f1801b;
        if (yVar != null) {
            yVar.mo3308e(i);
        }
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C0678gm.m2375e().mo3100c(getContext(), i));
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0543bm bmVar = this.f1802c;
        if (bmVar != null) {
            bmVar.mo2569a();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0543bm bmVar = this.f1802c;
        if (bmVar != null) {
            bmVar.mo2569a();
        }
    }

    public final void setFilters(InputFilter[] inputFilterArr) {
        C2267j jVar = m1728d().f2055a;
        C2253a aVar = C2253a.f6344b;
        super.setFilters(inputFilterArr);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0732im.m2470a(context);
        C0730ik.m2467d(this, getContext());
        C0504ab abVar = new C0504ab(this);
        this.f1800a = abVar;
        abVar.mo2474b(attributeSet, i);
        C0779y yVar = new C0779y(this);
        this.f1801b = yVar;
        yVar.mo3307d(attributeSet, i);
        C0543bm bmVar = new C0543bm(this);
        this.f1802c = bmVar;
        bmVar.mo2570b(attributeSet, i);
        m1728d().mo2496a(attributeSet, i);
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0504ab abVar = this.f1800a;
        if (abVar != null) {
            abVar.mo2475c();
        }
    }
}
