package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.p033v7.view.menu.C0453ag;
import android.support.p033v7.view.menu.C0480t;
import android.support.p033v7.widget.C0596dl;
import android.support.p033v7.widget.C0751je;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.core.content.p091b.C1874w;
import androidx.core.graphics.drawable.C1929b;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2061c;
import androidx.core.widget.C2134u;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class NavigationMenuItemView extends C44755o implements C0453ag {

    /* renamed from: k */
    private static final int[] f116515k = {16842912};

    /* renamed from: c */
    public int f116516c;

    /* renamed from: d */
    public boolean f116517d;

    /* renamed from: e */
    boolean f116518e;

    /* renamed from: f */
    public final CheckedTextView f116519f;

    /* renamed from: g */
    public FrameLayout f116520g;

    /* renamed from: h */
    public C0480t f116521h;

    /* renamed from: i */
    public ColorStateList f116522i;

    /* renamed from: j */
    public boolean f116523j;

    /* renamed from: l */
    private Drawable f116524l;

    /* renamed from: m */
    private final C2061c f116525m;

    public NavigationMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final C0480t mo1441a() {
        return this.f116521h;
    }

    /* renamed from: b */
    public final void mo48010b(Drawable drawable) {
        if (drawable != null) {
            if (this.f116523j) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                C1929b.m5226g(drawable, this.f116522i);
            }
            int i = this.f116516c;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f116517d) {
            if (this.f116524l == null) {
                Drawable f = C1874w.m5109f(getResources(), R.drawable.navigation_empty_icon, getContext().getTheme());
                this.f116524l = f;
                if (f != null) {
                    int i2 = this.f116516c;
                    f.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f116524l;
        }
        C2134u.m5912d(this.f116519f, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* renamed from: e */
    public final boolean mo1445e() {
        return false;
    }

    /* renamed from: f */
    public final void mo1446f(C0480t tVar) {
        StateListDrawable stateListDrawable;
        this.f116521h = tVar;
        int i = tVar.f1682a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(true != tVar.isVisible() ? 8 : 0);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f116515k, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            C2043bi.m5530X(this, stateListDrawable);
        }
        boolean isCheckable = tVar.isCheckable();
        refreshDrawableState();
        if (this.f116518e != isCheckable) {
            this.f116518e = isCheckable;
            this.f116525m.mOriginalDelegate.sendAccessibilityEvent(this.f116519f, 2048);
        }
        boolean isChecked = tVar.isChecked();
        refreshDrawableState();
        this.f116519f.setChecked(isChecked);
        setEnabled(tVar.isEnabled());
        this.f116519f.setText(tVar.f1685d);
        mo48010b(tVar.getIcon());
        View actionView = tVar.getActionView();
        if (actionView != null) {
            if (this.f116520g == null) {
                this.f116520g = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f116520g.removeAllViews();
            this.f116520g.addView(actionView);
        }
        setContentDescription(tVar.f1692k);
        C0751je.m2535a(this, tVar.f1693l);
        C0480t tVar2 = this.f116521h;
        if (tVar2.f1685d == null && tVar2.getIcon() == null && this.f116521h.getActionView() != null) {
            this.f116519f.setVisibility(8);
            FrameLayout frameLayout = this.f116520g;
            if (frameLayout != null) {
                C0596dl dlVar = (C0596dl) frameLayout.getLayoutParams();
                dlVar.width = -1;
                this.f116520g.setLayoutParams(dlVar);
                return;
            }
            return;
        }
        this.f116519f.setVisibility(0);
        FrameLayout frameLayout2 = this.f116520g;
        if (frameLayout2 != null) {
            C0596dl dlVar2 = (C0596dl) frameLayout2.getLayoutParams();
            dlVar2.width = -2;
            this.f116520g.setLayoutParams(dlVar2);
        }
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0480t tVar = this.f116521h;
        if (tVar != null && tVar.isCheckable() && tVar.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f116515k);
        }
        return onCreateDrawableState;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C44765y yVar = new C44765y(this);
        this.f116525m = yVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, this, true);
        this.f116516c = context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.f116519f = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C2043bi.m5526T(checkedTextView, yVar);
    }
}
