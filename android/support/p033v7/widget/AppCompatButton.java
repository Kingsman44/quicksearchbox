package android.support.p033v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.C2139z;
import androidx.p111g.p112a.C2253a;
import androidx.p111g.p113b.C2267j;
import com.google.android.googlequicksearchbox.R;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.AppCompatButton */
/* compiled from: PG */
public class AppCompatButton extends Button {

    /* renamed from: a */
    public final C0779y f1797a;

    /* renamed from: b */
    private final C0543bm f1798b;

    /* renamed from: c */
    private C0510ah f1799c;

    public AppCompatButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private final C0510ah mo4952a() {
        if (this.f1799c == null) {
            this.f1799c = new C0510ah(this);
        }
        return this.f1799c;
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0779y yVar = this.f1797a;
        if (yVar != null) {
            yVar.mo3306c();
        }
        C0543bm bmVar = this.f1798b;
        if (bmVar != null) {
            bmVar.mo2569a();
        }
    }

    public final int getAutoSizeMaxTextSize() {
        Method method = C0763jq.f2653a;
        return super.getAutoSizeMaxTextSize();
    }

    public final int getAutoSizeMinTextSize() {
        Method method = C0763jq.f2653a;
        return super.getAutoSizeMinTextSize();
    }

    public final int getAutoSizeStepGranularity() {
        Method method = C0763jq.f2653a;
        return super.getAutoSizeStepGranularity();
    }

    public final int[] getAutoSizeTextAvailableSizes() {
        Method method = C0763jq.f2653a;
        return super.getAutoSizeTextAvailableSizes();
    }

    public final int getAutoSizeTextType() {
        Method method = C0763jq.f2653a;
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        C2139z.m5937b(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f1798b != null) {
            Method method = C0763jq.f2653a;
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f1798b != null) {
            Method method = C0763jq.f2653a;
        }
    }

    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        C2267j jVar = mo4952a().f2055a;
        C2253a aVar = C2253a.f6344b;
    }

    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        Method method = C0763jq.f2653a;
        super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        Method method = C0763jq.f2653a;
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public final void setAutoSizeTextTypeWithDefaults(int i) {
        Method method = C0763jq.f2653a;
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0779y yVar = this.f1797a;
        if (yVar != null) {
            yVar.mo3312i();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0779y yVar = this.f1797a;
        if (yVar != null) {
            yVar.mo3308e(i);
        }
    }

    public final void setFilters(InputFilter[] inputFilterArr) {
        C2267j jVar = mo4952a().f2055a;
        C2253a aVar = C2253a.f6344b;
        super.setFilters(inputFilterArr);
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0543bm bmVar = this.f1798b;
        if (bmVar != null) {
            bmVar.mo2571c(context, i);
        }
    }

    public final void setTextSize(int i, float f) {
        Method method = C0763jq.f2653a;
        super.setTextSize(i, f);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0732im.m2470a(context);
        C0730ik.m2467d(this, getContext());
        C0779y yVar = new C0779y(this);
        this.f1797a = yVar;
        yVar.mo3307d(attributeSet, i);
        C0543bm bmVar = new C0543bm(this);
        this.f1798b = bmVar;
        bmVar.mo2570b(attributeSet, i);
        bmVar.mo2569a();
        mo4952a().mo2496a(attributeSet, i);
    }
}
