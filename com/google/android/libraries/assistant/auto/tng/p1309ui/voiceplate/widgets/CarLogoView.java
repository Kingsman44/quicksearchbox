package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.widgets;

import android.animation.TimeAnimator;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.libraries.gsa.logoview.LogoView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.widgets.CarLogoView */
/* compiled from: PG */
public final class CarLogoView extends LogoView {

    /* renamed from: a */
    public List f49279a;

    public CarLogoView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final TimeAnimator mo23051a() {
        if (this.f49279a == null) {
            this.f49279a = new ArrayList();
        }
        C16830b bVar = new C16830b();
        this.f49279a.add(bVar);
        return bVar;
    }

    public CarLogoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
