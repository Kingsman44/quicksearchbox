package com.google.android.libraries.material.opensearchbar;

import android.animation.AnimatorSet;
import com.google.android.material.internal.ClippableRoundedCornerLayout;

/* renamed from: com.google.android.libraries.material.opensearchbar.t */
/* compiled from: PG */
public final /* synthetic */ class C28565t implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C28571z f77646a;

    public /* synthetic */ C28565t(C28571z zVar) {
        this.f77646a = zVar;
    }

    public final void run() {
        C28571z zVar = this.f77646a;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = zVar.f77654b;
        clippableRoundedCornerLayout.setTranslationY((float) clippableRoundedCornerLayout.getHeight());
        AnimatorSet b = zVar.mo34149b(true);
        b.addListener(new C28568w(zVar));
        b.start();
    }
}
