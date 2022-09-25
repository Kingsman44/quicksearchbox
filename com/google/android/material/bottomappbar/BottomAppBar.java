package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.p033v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.C1769b;
import androidx.coordinatorlayout.widget.C1770c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;

/* compiled from: PG */
public final class BottomAppBar extends Toolbar implements C1769b {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C1770c mo4952a() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        throw null;
    }

    /* renamed from: s */
    public final void mo2418s(Drawable drawable) {
        throw null;
    }

    public final void setElevation(float f) {
        throw null;
    }

    /* renamed from: v */
    public final void mo2421v(CharSequence charSequence) {
        throw null;
    }

    /* renamed from: x */
    public final void mo2423x(CharSequence charSequence) {
        throw null;
    }

    /* compiled from: PG */
    public class Behavior extends HideBottomViewOnScrollBehavior {
        public Behavior() {
            new Rect();
        }

        /* renamed from: g */
        public final /* bridge */ /* synthetic */ boolean mo4959g(CoordinatorLayout coordinatorLayout, View view, int i) {
            new WeakReference((BottomAppBar) view);
            throw null;
        }

        /* renamed from: j */
        public final /* bridge */ /* synthetic */ boolean mo4962j(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            throw null;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            new Rect();
        }
    }
}
