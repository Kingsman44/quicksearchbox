package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1981aa;
import androidx.core.p098j.p099a.C1988h;
import androidx.core.p098j.p099a.C1991k;

/* renamed from: com.google.android.material.timepicker.b */
/* compiled from: PG */
class C44978b extends C2061c {

    /* renamed from: a */
    private final C1988h f117545a;

    public C44978b(Context context, int i) {
        super(C2061c.DEFAULT_DELEGATE);
        this.f117545a = new C1988h((Object) null, 16, context.getString(i), (C1981aa) null, (Class) null);
    }

    public void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        super.onInitializeAccessibilityNodeInfo(view, kVar);
        kVar.mo5153b(this.f117545a);
    }
}
