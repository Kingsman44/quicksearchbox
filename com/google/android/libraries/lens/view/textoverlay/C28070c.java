package com.google.android.libraries.lens.view.textoverlay;

import com.google.android.gms.clearcut.C143673z;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.lens.view.textoverlay.c */
/* compiled from: PG */
public final /* synthetic */ class C28070c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f76397a;

    /* renamed from: b */
    public final /* synthetic */ int f76398b;

    public /* synthetic */ C28070c(int i, int i2) {
        this.f76397a = i;
        this.f76398b = i2;
    }

    public final void accept(Object obj) {
        int i = this.f76397a;
        int i2 = this.f76398b;
        C143673z zVar = (C143673z) obj;
        zVar.mo119018b("LENS_INSTANT_TEXT_SELECTION_MISMATCH").mo119008b(true);
        zVar.mo119020d("LENS_INSTANT_TEXT_SELECTION_MISMATCH_CHARACTERS").mo119015b(i);
        zVar.mo119020d("LENS_INSTANT_TEXT_SELECTION_MISMATCH_WORDS").mo119015b(i2);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
