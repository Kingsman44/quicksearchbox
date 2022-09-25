package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.view.View;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1991k;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.ba */
/* compiled from: PG */
final class C15019ba extends C2061c {

    /* renamed from: a */
    final /* synthetic */ int f45032a;

    /* renamed from: b */
    final /* synthetic */ C15024bf f45033b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15019ba(C15024bf bfVar, int i) {
        super(C2061c.DEFAULT_DELEGATE);
        this.f45033b = bfVar;
        this.f45032a = i;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        super.onInitializeAccessibilityNodeInfo(view, kVar);
        View view2 = (View) this.f45033b.f45049c.get(this.f45032a - 1);
        view2.getClass();
        kVar.f5921a.setTraversalAfter(view2);
    }
}
