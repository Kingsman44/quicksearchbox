package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.content.web;

import android.view.View;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.content.web.ai */
/* compiled from: PG */
public final /* synthetic */ class C130202ai implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C130204ak f356960a;

    public /* synthetic */ C130202ai(C130204ak akVar) {
        this.f356960a = akVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C130204ak akVar = this.f356960a;
        int i9 = i2 - i4;
        int i10 = i6 - i8;
        if (i3 - i != i7 - i5 || i9 != i10) {
            view.setOutlineProvider(new C130203aj(akVar));
            view.setClipToOutline(true);
        }
    }
}
