package com.google.android.apps.gsa.shared.p7148ui.header;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.shared.p6975af.C89102a;

/* renamed from: com.google.android.apps.gsa.shared.ui.header.b */
/* compiled from: PG */
public final /* synthetic */ class C90689b implements C89102a {

    /* renamed from: a */
    public final /* synthetic */ FrameLayout f253662a;

    public /* synthetic */ C90689b(FrameLayout frameLayout) {
        this.f253662a = frameLayout;
    }

    /* renamed from: a */
    public final void mo83072a(int i) {
        FrameLayout frameLayout = this.f253662a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        marginLayoutParams.height = i;
        frameLayout.setLayoutParams(marginLayoutParams);
    }
}
