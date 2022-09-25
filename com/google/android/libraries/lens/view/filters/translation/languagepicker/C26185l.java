package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import p3186j$.util.function.ToIntFunction;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.l */
/* compiled from: PG */
public final /* synthetic */ class C26185l implements ToIntFunction {

    /* renamed from: a */
    public final /* synthetic */ int f71154a;

    public /* synthetic */ C26185l(int i) {
        this.f71154a = i;
    }

    public final int applyAsInt(Object obj) {
        int i = this.f71154a;
        Integer num = (Integer) obj;
        int i2 = DownloadStateImageView.f70998b;
        int intValue = num.intValue();
        int intValue2 = num.intValue();
        return intValue == i ? intValue2 : -intValue2;
    }
}
