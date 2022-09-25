package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.Locale;

/* renamed from: com.google.ads.interactivemedia.v3.internal.abd */
/* compiled from: PG */
public class abd {

    /* renamed from: a */
    arn f20174a = arn.m19402i();

    /* renamed from: b */
    arn f20175b = arn.m19402i();

    /* renamed from: c */
    int f20176c = 0;

    /* renamed from: b */
    public void mo14358b(Context context) {
        CaptioningManager captioningManager;
        if (aeu.f20466a < 19) {
            return;
        }
        if ((aeu.f20466a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.f20176c = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f20175b = arn.m19403j(aeu.m18551u(locale));
            }
        }
    }
}
