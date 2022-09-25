package android.support.p033v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.widget.ak */
/* compiled from: PG */
public final class C0513ak extends MultiAutoCompleteTextView {

    /* renamed from: a */
    private static final int[] f2060a = {16843126};

    /* renamed from: b */
    private final C0779y f2061b;

    /* renamed from: c */
    private final C0543bm f2062c;

    /* renamed from: d */
    private final C0509ag f2063d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0513ak(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        C0732im.m2470a(context);
        C0730ik.m2467d(this, getContext());
        C0735ip f = C0735ip.m2473f(getContext(), attributeSet, f2060a, R.attr.autoCompleteTextViewStyle, 0);
        if (f.f2596b.hasValue(0)) {
            setDropDownBackgroundDrawable(f.mo3246b(0));
        }
        f.f2596b.recycle();
        C0779y yVar = new C0779y(this);
        this.f2061b = yVar;
        yVar.mo3307d(attributeSet, R.attr.autoCompleteTextViewStyle);
        C0543bm bmVar = new C0543bm(this);
        this.f2062c = bmVar;
        bmVar.mo2570b(attributeSet, R.attr.autoCompleteTextViewStyle);
        bmVar.mo2569a();
        C0509ag agVar = new C0509ag(this);
        this.f2063d = agVar;
        agVar.mo2495a(attributeSet, R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (C0509ag.m1903b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener c = C0509ag.m1904c(keyListener);
            if (c != keyListener) {
                super.setKeyListener(c);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0779y yVar = this.f2061b;
        if (yVar != null) {
            yVar.mo3306c();
        }
        C0543bm bmVar = this.f2062c;
        if (bmVar != null) {
            bmVar.mo2569a();
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0511ai.m1907a(onCreateInputConnection, editorInfo, this);
        return this.f2063d.f2053a.mo5622a(onCreateInputConnection);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0779y yVar = this.f2061b;
        if (yVar != null) {
            yVar.mo3312i();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0779y yVar = this.f2061b;
        if (yVar != null) {
            yVar.mo3308e(i);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0543bm bmVar = this.f2062c;
        if (bmVar != null) {
            bmVar.mo2569a();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0543bm bmVar = this.f2062c;
        if (bmVar != null) {
            bmVar.mo2569a();
        }
    }

    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0678gm.m2375e().mo3100c(getContext(), i));
    }

    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(C0509ag.m1904c(keyListener));
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0543bm bmVar = this.f2062c;
        if (bmVar != null) {
            bmVar.mo2571c(context, i);
        }
    }
}
