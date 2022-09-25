package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;

/* compiled from: PG */
public class Group extends C1743b {
    public Group(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo4840k(ConstraintLayout constraintLayout) {
        mo4855j(constraintLayout);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo4854i();
    }

    /* renamed from: q */
    public final void mo4842q() {
        C1745d dVar = (C1745d) getLayoutParams();
        dVar.f5276ar.mo4618D(0);
        dVar.f5276ar.mo4648z(0);
    }

    public final void setElevation(float f) {
        super.setElevation(f);
        mo4854i();
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        mo4854i();
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
