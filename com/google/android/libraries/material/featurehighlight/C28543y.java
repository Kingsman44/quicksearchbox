package com.google.android.libraries.material.featurehighlight;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import androidx.core.p098j.p099a.C1991k;
import androidx.customview.p103b.C2144b;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import java.util.List;

/* renamed from: com.google.android.libraries.material.featurehighlight.y */
/* compiled from: PG */
final class C28543y extends C2144b {

    /* renamed from: a */
    private final C28512ac f77579a;

    /* renamed from: b */
    private final View f77580b;

    /* renamed from: c */
    private final Rect f77581c = new Rect();

    /* renamed from: d */
    private final String f77582d;

    public C28543y(C28512ac acVar, View view) {
        super(acVar);
        this.f77579a = acVar;
        this.f77580b = view;
        this.f77582d = acVar.getResources().getString(R.string.libraries_material_featurehighlight_dismiss);
    }

    /* access modifiers changed from: protected */
    public final int getVirtualViewAt(float f, float f2) {
        C28512ac acVar = this.f77579a;
        int i = C28512ac.f77390I;
        if (acVar.f77414g.mo33992z() && this.f77579a.f77409b.contains((int) f, (int) f2)) {
            return 1;
        }
        if (this.f77579a.f77414g.mo33990x() && this.f77579a.f77410c.contains((int) f, (int) f2)) {
            return 2;
        }
        if (this.f77579a.f77414g.mo33991y() && this.f77579a.f77411d.contains((int) f, (int) f2)) {
            return 3;
        }
        if (this.f77579a.f77408a.contains((int) f, (int) f2)) {
            return 4;
        }
        return (!this.f77579a.mo34016n(f, f2) || !this.f77579a.f77412e.mo34053e(f, f2)) ? 5 : -1;
    }

    /* access modifiers changed from: protected */
    public final void getVisibleVirtualViews(List list) {
        C28512ac acVar = this.f77579a;
        int i = C28512ac.f77390I;
        if (acVar.f77414g.mo33992z()) {
            list.add(1);
        }
        if (this.f77579a.f77414g.mo33990x()) {
            list.add(2);
        }
        if (this.f77579a.f77414g.mo33991y()) {
            list.add(3);
        }
        list.add(4);
        list.add(5);
    }

    /* access modifiers changed from: protected */
    public final boolean onPerformActionForVirtualView$ar$ds(int i, int i2) {
        if (i2 != 16) {
            return false;
        }
        if (i == 4) {
            C28512ac acVar = this.f77579a;
            int i3 = C28512ac.f77390I;
            acVar.mo34002d();
            return true;
        } else if (i != 5 && i != 3) {
            return false;
        } else {
            C28512ac acVar2 = this.f77579a;
            int i4 = C28512ac.f77390I;
            acVar2.mo34025q();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
        if (i == 1) {
            C28512ac acVar = this.f77579a;
            int i2 = C28512ac.f77390I;
            accessibilityEvent.setContentDescription(acVar.f77414g.mo33972g());
        } else if (i == 2) {
            C28512ac acVar2 = this.f77579a;
            int i3 = C28512ac.f77390I;
            accessibilityEvent.setContentDescription(acVar2.f77414g.mo33970e());
        } else if (i == 3) {
            C28512ac acVar3 = this.f77579a;
            int i4 = C28512ac.f77390I;
            accessibilityEvent.setContentDescription(acVar3.f77414g.mo33971f());
        } else if (i == 4) {
            accessibilityEvent.setContentDescription(this.f77580b.getContentDescription());
            accessibilityEvent.setClassName(this.f77580b.getAccessibilityClassName());
        } else if (i == 5) {
            accessibilityEvent.setContentDescription(this.f77582d);
        }
    }

    /* access modifiers changed from: protected */
    public final void onPopulateNodeForVirtualView(int i, C1991k kVar) {
        if (i == 1) {
            Rect rect = this.f77581c;
            C28512ac acVar = this.f77579a;
            int i2 = C28512ac.f77390I;
            rect.set(acVar.f77409b);
            kVar.f5921a.setText(this.f77579a.f77414g.mo33972g());
            kVar.f5921a.setClassName("android.widget.TextView");
        } else if (i == 2) {
            Rect rect2 = this.f77581c;
            C28512ac acVar2 = this.f77579a;
            int i3 = C28512ac.f77390I;
            rect2.set(acVar2.f77410c);
            kVar.f5921a.setText(this.f77579a.f77414g.mo33970e());
            kVar.f5921a.setClassName("android.widget.TextView");
        } else if (i != 3) {
            CharSequence charSequence = BuildConfig.FLAVOR;
            if (i == 4) {
                Rect rect3 = this.f77581c;
                C28512ac acVar3 = this.f77579a;
                int i4 = C28512ac.f77390I;
                rect3.set(acVar3.f77408a);
                View view = this.f77580b;
                if (view instanceof TextView) {
                    kVar.f5921a.setText(((TextView) view).getText());
                } else {
                    CharSequence contentDescription = view.getContentDescription();
                    if (contentDescription != null) {
                        charSequence = contentDescription;
                    }
                    kVar.f5921a.setContentDescription(charSequence);
                }
                kVar.f5921a.setClassName(this.f77580b.getAccessibilityClassName());
                kVar.f5921a.setClickable(this.f77580b.isClickable());
                kVar.f5921a.addAction(16);
            } else if (i != 5) {
                this.f77581c.setEmpty();
                kVar.f5921a.setContentDescription(charSequence);
            } else {
                this.f77581c.set(0, 0, this.f77579a.getWidth(), this.f77579a.getHeight());
                kVar.f5921a.setContentDescription(this.f77582d);
                kVar.f5921a.addAction(16);
            }
        } else {
            Rect rect4 = this.f77581c;
            C28512ac acVar4 = this.f77579a;
            int i5 = C28512ac.f77390I;
            rect4.set(acVar4.f77411d);
            kVar.f5921a.setText(this.f77579a.f77414g.mo33971f());
            kVar.f5921a.addAction(16);
        }
        kVar.f5921a.setBoundsInParent(this.f77581c);
    }
}
