package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0613eb;
import android.support.p033v7.widget.C0778x;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.internal.C44733be;
import com.google.android.material.internal.C44756p;
import com.google.android.material.p3512i.C44694d;
import com.google.android.material.theme.p3518a.C44965a;

/* renamed from: com.google.android.material.textfield.ag */
/* compiled from: PG */
public final class C44926ag extends C0778x {

    /* renamed from: a */
    public final C0613eb f117370a;

    /* renamed from: b */
    public final float f117371b;

    /* renamed from: c */
    public final int f117372c;

    /* renamed from: d */
    public final ColorStateList f117373d;

    /* renamed from: e */
    private final AccessibilityManager f117374e;

    /* renamed from: f */
    private final Rect f117375f = new Rect();

    /* renamed from: g */
    private final int f117376g;

    public C44926ag(Context context, AttributeSet attributeSet) {
        super(C44965a.m79936a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, R.attr.autoCompleteTextViewStyle);
        Context context2 = getContext();
        TypedArray a = C44733be.m79295a(context2, attributeSet, C44930ak.f117381a, R.attr.autoCompleteTextViewStyle, 2132151177, new int[0]);
        if (a.hasValue(0) && a.getInt(0, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        int resourceId = a.getResourceId(2, R.layout.mtrl_auto_complete_simple_item);
        this.f117376g = resourceId;
        this.f117371b = (float) a.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        this.f117372c = a.getColor(3, 0);
        this.f117373d = C44694d.m79230b(context2, a, 4);
        this.f117374e = (AccessibilityManager) context2.getSystemService("accessibility");
        C0613eb ebVar = new C0613eb(context2, (AttributeSet) null, R.attr.listPopupWindowStyle);
        this.f117370a = ebVar;
        ebVar.mo2829w();
        ebVar.f2360k = this;
        ebVar.mo2828u();
        ebVar.mo2532e(getAdapter());
        ebVar.f2361l = new C44924ae(this);
        if (a.hasValue(5)) {
            setAdapter(new C44925af(this, getContext(), resourceId, getResources().getStringArray(a.getResourceId(5, 0))));
        }
        a.recycle();
    }

    /* renamed from: b */
    private final TextInputLayout m79825b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo48521a(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    public final CharSequence getHint() {
        TextInputLayout b = m79825b();
        if (b == null || !b.f117317k) {
            return super.getHint();
        }
        return b.mo48464c();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b = m79825b();
        if (b != null && b.f117317k && super.getHint() == null && C44756p.m79361a()) {
            setHint(BuildConfig.FLAVOR);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b = m79825b();
            int i3 = 0;
            if (!(adapter == null || b == null)) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                int min = Math.min(adapter.getCount(), Math.max(0, this.f117370a.mo2822o()) + 15);
                int max = Math.max(0, min - 15);
                View view = null;
                int i4 = 0;
                while (max < min) {
                    int itemViewType = adapter.getItemViewType(max);
                    int i5 = itemViewType != i3 ? itemViewType : i3;
                    if (itemViewType != i3) {
                        view = null;
                    }
                    view = adapter.getView(max, view, b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                    max++;
                    i3 = i5;
                }
                Drawable background = this.f117370a.f2366q.getBackground();
                if (background != null) {
                    background.getPadding(this.f117375f);
                    i4 += this.f117375f.left + this.f117375f.right;
                }
                i3 = i4 + b.f117308b.f117445d.getMeasuredWidth();
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public final void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        this.f117370a.mo2532e(getAdapter());
    }

    public final void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f117370a.f2362m = getOnItemSelectedListener();
    }

    public final void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout b = m79825b();
        if (b != null) {
            b.mo48493t();
        }
    }

    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.f117374e;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f117370a.mo1576v();
        }
    }
}
