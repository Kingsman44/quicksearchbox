package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.content.Context;
import android.view.View;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1981aa;
import androidx.core.p098j.p099a.C1988h;
import androidx.core.p098j.p099a.C1991k;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.e */
/* compiled from: PG */
public final class C102363e extends C2061c {

    /* renamed from: a */
    private final Context f285662a;

    /* renamed from: b */
    private final int f285663b;

    public C102363e(Context context, int i) {
        super(C2061c.DEFAULT_DELEGATE);
        this.f285662a = context;
        this.f285663b = i;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        super.onInitializeAccessibilityNodeInfo(view, kVar);
        kVar.mo5153b(new C1988h((Object) null, 16, this.f285662a.getString(this.f285663b), (C1981aa) null, (Class) null));
    }
}
