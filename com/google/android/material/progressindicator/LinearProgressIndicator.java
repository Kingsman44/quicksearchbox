package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public final class LinearProgressIndicator extends C44848f {
    public LinearProgressIndicator(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final /* synthetic */ C44849g mo48253a(Context context, AttributeSet attributeSet) {
        return new C44842af(context, attributeSet);
    }

    /* renamed from: h */
    public final void mo48254h(int i, boolean z) {
        C44849g gVar = this.f117002a;
        if (gVar == null || ((C44842af) gVar).f116992g != 0 || !isIndeterminate()) {
            super.mo48254h(i, z);
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C44842af afVar = (C44842af) this.f117002a;
        boolean z2 = true;
        if (!(afVar.f116993h == 1 || ((C2043bi.m5577f(this) == 1 && ((C44842af) this.f117002a).f116993h == 2) || (C2043bi.m5577f(this) == 0 && ((C44842af) this.f117002a).f116993h == 3)))) {
            z2 = false;
        }
        afVar.f116994i = z2;
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
        C44865w c = mo48270c();
        if (c != null) {
            c.setBounds(0, 0, paddingLeft, paddingTop);
        }
        C44858p b = mo48269b();
        if (b != null) {
            b.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 2132151771);
        C44864v vVar;
        Context context2 = getContext();
        C44842af afVar = (C44842af) this.f117002a;
        C44866x xVar = new C44866x(afVar);
        if (afVar.f116992g == 0) {
            vVar = new C44837aa(afVar);
        } else {
            vVar = new C44841ae(context2, afVar);
        }
        setIndeterminateDrawable(new C44865w(context2, afVar, xVar, vVar));
        Context context3 = getContext();
        C44842af afVar2 = (C44842af) this.f117002a;
        setProgressDrawable(new C44858p(context3, afVar2, new C44866x(afVar2)));
    }
}
