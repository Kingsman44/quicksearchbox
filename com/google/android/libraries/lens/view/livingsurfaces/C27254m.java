package com.google.android.libraries.lens.view.livingsurfaces;

import android.view.View;
import com.google.android.libraries.lens.view.livingsurfaces.p2150ui.LivingSurfaceAudioButton;

/* renamed from: com.google.android.libraries.lens.view.livingsurfaces.m */
/* compiled from: PG */
public final /* synthetic */ class C27254m implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C27256o f74552a;

    /* renamed from: b */
    public final /* synthetic */ LivingSurfaceAudioButton f74553b;

    public /* synthetic */ C27254m(C27256o oVar, LivingSurfaceAudioButton livingSurfaceAudioButton) {
        this.f74552a = oVar;
        this.f74553b = livingSurfaceAudioButton;
    }

    public final void onClick(View view) {
        C27256o oVar = this.f74552a;
        LivingSurfaceAudioButton livingSurfaceAudioButton = this.f74553b;
        if (livingSurfaceAudioButton != null) {
            oVar.mo32783h(!livingSurfaceAudioButton.f74565a);
        }
    }
}
