package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public final class CircularProgressIndicator extends C44848f {
    public CircularProgressIndicator(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final /* synthetic */ C44849g mo48253a(Context context, AttributeSet attributeSet) {
        return new C44856n(context, attributeSet);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 2132151759);
        setIndeterminateDrawable(C44865w.m79636j(getContext(), (C44856n) this.f117002a));
        Context context2 = getContext();
        C44856n nVar = (C44856n) this.f117002a;
        setProgressDrawable(new C44858p(context2, nVar, new C44850h(nVar)));
    }
}
