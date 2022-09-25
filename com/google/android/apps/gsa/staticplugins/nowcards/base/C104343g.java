package com.google.android.apps.gsa.staticplugins.nowcards.base;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.apps.gsa.now.shared.p6421ui.C83413b;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.g */
/* compiled from: PG */
final class C104343g extends ViewOutlineProvider {

    /* renamed from: a */
    final /* synthetic */ C104348l f290290a;

    public C104343g(C104348l lVar) {
        this.f290290a = lVar;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(view.getBackground().getBounds(), (float) C83413b.m132808a(this.f290290a.f290307b));
    }
}
