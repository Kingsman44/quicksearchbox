package android.support.p033v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.C2139z;
import androidx.p111g.p112a.C2253a;
import androidx.p111g.p113b.C2267j;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.widget.z */
/* compiled from: PG */
public final class C0780z extends CheckedTextView {

    /* renamed from: a */
    private final C0503aa f2688a;

    /* renamed from: b */
    private final C0779y f2689b;

    /* renamed from: c */
    private final C0543bm f2690c;

    /* renamed from: d */
    private C0510ah f2691d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0780z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        C0732im.m2470a(context);
        C0730ik.m2467d(this, getContext());
        C0543bm bmVar = new C0543bm(this);
        this.f2690c = bmVar;
        bmVar.mo2570b(attributeSet, R.attr.checkedTextViewStyle);
        bmVar.mo2569a();
        C0779y yVar = new C0779y(this);
        this.f2689b = yVar;
        yVar.mo3307d(attributeSet, R.attr.checkedTextViewStyle);
        C0503aa aaVar = new C0503aa(this);
        this.f2688a = aaVar;
        aaVar.mo2472a(attributeSet);
        m2610a().mo2496a(attributeSet, R.attr.checkedTextViewStyle);
    }

    /* renamed from: a */
    private final C0510ah m2610a() {
        if (this.f2691d == null) {
            this.f2691d = new C0510ah(this);
        }
        return this.f2691d;
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0543bm bmVar = this.f2690c;
        if (bmVar != null) {
            bmVar.mo2569a();
        }
        C0779y yVar = this.f2689b;
        if (yVar != null) {
            yVar.mo3306c();
        }
        C0503aa aaVar = this.f2688a;
        if (aaVar != null) {
            aaVar.f2031a.getCheckMarkDrawable();
        }
    }

    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        C2139z.m5937b(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0511ai.m1907a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        C2267j jVar = m2610a().f2055a;
        C2253a aVar = C2253a.f6344b;
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0779y yVar = this.f2689b;
        if (yVar != null) {
            yVar.mo3312i();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0779y yVar = this.f2689b;
        if (yVar != null) {
            yVar.mo3308e(i);
        }
    }

    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0678gm.m2375e().mo3100c(getContext(), i));
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0543bm bmVar = this.f2690c;
        if (bmVar != null) {
            bmVar.mo2569a();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0543bm bmVar = this.f2690c;
        if (bmVar != null) {
            bmVar.mo2569a();
        }
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0543bm bmVar = this.f2690c;
        if (bmVar != null) {
            bmVar.mo2571c(context, i);
        }
    }

    public final void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0503aa aaVar = this.f2688a;
        if (aaVar == null) {
            return;
        }
        if (aaVar.f2032b) {
            aaVar.f2032b = false;
            return;
        }
        aaVar.f2032b = true;
        aaVar.f2031a.getCheckMarkDrawable();
    }
}
