package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.p033v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.Checkable;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p291h.C5622i;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields.C33380n;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2562a.C33235a;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.ImageToggleComponent */
/* compiled from: PG */
public final class ImageToggleComponent extends AppCompatImageView implements Checkable {

    /* renamed from: a */
    public final C33261b f88966a = new C33261b();

    /* renamed from: b */
    public final C33261b f88967b = new C33261b();

    /* renamed from: c */
    public C33380n f88968c = null;

    /* renamed from: d */
    private C33235a f88969d;

    /* renamed from: e */
    private boolean f88970e;

    public ImageToggleComponent(Context context) {
        super(context);
        m61687c();
    }

    /* renamed from: c */
    private final void m61687c() {
        setClickable(true);
        this.f88969d = new C33235a();
    }

    /* renamed from: a */
    public final void mo38652a() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable = this.f88966a.f88977a;
        Drawable drawable2 = this.f88967b.f88977a;
        if (drawable != null) {
            if (drawable2 != null) {
                stateListDrawable.addState(new int[]{16842912}, drawable2);
            }
            stateListDrawable.addState(StateSet.WILD_CARD, drawable);
        } else if (drawable2 != null) {
            stateListDrawable.addState(StateSet.WILD_CARD, drawable2);
        }
        setImageDrawable(stateListDrawable);
    }

    /* renamed from: b */
    public final void mo38653b(C51012dc dcVar, C33261b bVar) {
        C6007z a = this.f88969d.mo38620a(getContext(), dcVar, false, (Drawable) null);
        a.mo12455s(new C33262c(this, bVar), (C5592i) null, a, C5622i.f16959a);
    }

    public final CharSequence getAccessibilityClassName() {
        return CheckBox.class.getName();
    }

    public final boolean isChecked() {
        return this.f88970e;
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f88970e) {
            mergeDrawableStates(onCreateDrawableState, new int[]{16842912});
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setChecked(this.f88970e);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f88970e);
    }

    public final boolean performClick() {
        toggle();
        if (!super.performClick()) {
            playSoundEffect(0);
        }
        return super.performClick();
    }

    public final void setChecked(boolean z) {
        C33380n nVar;
        boolean z2 = this.f88970e;
        this.f88970e = z;
        refreshDrawableState();
        if (z != z2 && (nVar = this.f88968c) != null) {
            nVar.f89438a.mo38680a(z);
            sendAccessibilityEvent(2048);
        }
    }

    public final void toggle() {
        setChecked(!this.f88970e);
    }

    public ImageToggleComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m61687c();
    }

    public ImageToggleComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m61687c();
    }
}
