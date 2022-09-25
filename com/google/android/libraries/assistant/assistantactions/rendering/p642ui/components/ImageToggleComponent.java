package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components;

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
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.C11409p;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageToggleComponent */
/* compiled from: PG */
public class ImageToggleComponent extends AppCompatImageView implements Checkable {

    /* renamed from: a */
    public final C11336c f36864a = new C11336c();

    /* renamed from: b */
    public final C11336c f36865b = new C11336c();

    /* renamed from: c */
    public C11409p f36866c;

    /* renamed from: d */
    private C11335b f36867d;

    /* renamed from: e */
    private boolean f36868e;

    public ImageToggleComponent(Context context) {
        super(context);
        m26964c();
    }

    /* renamed from: c */
    private final void m26964c() {
        setClickable(true);
        this.f36867d = new C11335b();
    }

    /* renamed from: a */
    public final void mo19790a() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable = this.f36864a.f36875a;
        Drawable drawable2 = this.f36865b.f36875a;
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
    public final void mo19791b(C51012dc dcVar, C11336c cVar) {
        C6007z a = this.f36867d.mo19806a(getContext(), dcVar, false, (Drawable) null);
        a.mo12455s(new C11337d(this, cVar), (C5592i) null, a, C5622i.f16959a);
    }

    public final CharSequence getAccessibilityClassName() {
        return CheckBox.class.getName();
    }

    public final boolean isChecked() {
        return this.f36868e;
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f36868e) {
            mergeDrawableStates(onCreateDrawableState, new int[]{16842912});
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setChecked(this.f36868e);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f36868e);
    }

    public final boolean performClick() {
        toggle();
        if (!super.performClick()) {
            playSoundEffect(0);
        }
        return super.performClick();
    }

    public final void setChecked(boolean z) {
        C11409p pVar;
        boolean z2 = this.f36868e;
        this.f36868e = z;
        refreshDrawableState();
        if (z != z2 && (pVar = this.f36866c) != null) {
            pVar.f37162a.mo19817a(z);
            sendAccessibilityEvent(2048);
        }
    }

    public final void toggle() {
        setChecked(!this.f36868e);
    }

    public ImageToggleComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26964c();
    }

    public ImageToggleComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m26964c();
    }
}
