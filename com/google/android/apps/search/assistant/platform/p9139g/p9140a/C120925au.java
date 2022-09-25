package com.google.android.apps.search.assistant.platform.p9139g.p9140a;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.google.android.apps.search.assistant.platform.g.a.au */
/* compiled from: PG */
final class C120925au extends ViewOutlineProvider {

    /* renamed from: a */
    final /* synthetic */ C120926av f336211a;

    public C120925au(C120926av avVar) {
        this.f336211a = avVar;
    }

    public final void getOutline(View view, Outline outline) {
        if (!this.f336211a.f336214b.isEmpty()) {
            C120926av avVar = this.f336211a;
            float f = avVar.f336213a;
            if (f > 0.0f) {
                outline.setRoundRect(avVar.f336214b, f);
                return;
            }
        }
        outline.setEmpty();
    }
}
