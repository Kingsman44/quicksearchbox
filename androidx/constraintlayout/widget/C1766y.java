package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.p079a.p082b.C1646n;

/* renamed from: androidx.constraintlayout.widget.y */
/* compiled from: PG */
public class C1766y extends C1743b {

    /* renamed from: a */
    private boolean f5493a;

    /* renamed from: b */
    private boolean f5494b;

    public C1766y(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4700a(AttributeSet attributeSet) {
        super.mo4700a(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1761t.f5460b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f5493a = true;
                } else if (index == 22) {
                    this.f5494b = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: c */
    public void mo4702c(C1646n nVar, int i, int i2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo4840k(ConstraintLayout constraintLayout) {
        mo4855j(constraintLayout);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5493a || this.f5494b) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f5225d; i++) {
                    View C = constraintLayout.mo4824C(this.f5224c[i]);
                    if (C != null) {
                        if (this.f5493a) {
                            C.setVisibility(visibility);
                        }
                        if (this.f5494b && elevation > 0.0f) {
                            C.setTranslationZ(C.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public final void setElevation(float f) {
        super.setElevation(f);
        mo4854i();
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        mo4854i();
    }

    public C1766y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C1766y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
