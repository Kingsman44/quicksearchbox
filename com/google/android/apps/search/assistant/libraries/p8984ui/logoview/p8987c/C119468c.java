package com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8987c;

import android.graphics.Path;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.logoview.c.c */
/* compiled from: PG */
public final class C119468c extends C119469d {
    /* renamed from: a */
    public final void mo104394a(Path path, C119467b bVar, float f, float f2, float f3) {
        path.reset();
        float min = Math.min(f3, 1.0f) * f;
        if (f2 > 0.0f) {
            float f4 = -0.5f + f3;
            min += Math.max(f2 - (((f4 * f4) * f2) * 5.0f), 0.0f);
        }
        float f5 = bVar.f333065e;
        float f6 = (((f5 + 18.849556f) + bVar.f333066f) - f) * f3;
        if (f6 < f5) {
            float min2 = Math.min(f6 + min, f5);
            path.moveTo(0.0f, f6);
            path.lineTo(0.0f, min2);
            min -= min2 - f6;
        }
        float f7 = bVar.f333065e;
        if (f6 < f7 + 18.849556f && min > 0.0f) {
            float max = Math.max(0.0f, f6 - f7);
            float min3 = Math.min(18.849556f, max + min);
            float f8 = (max * 180.0f) / 18.849556f;
            float f9 = (min3 * 180.0f) / 18.849556f;
            if (!bVar.f333067g) {
                f8 = 180.0f - f8;
                f9 = 180.0f - f9;
            }
            float f10 = f9 - f8;
            float f11 = -6.0f;
            this.f333068a.set(-6.0f, -6.0f, 6.0f, 6.0f);
            if (true != bVar.f333067g) {
                f11 = 6.0f;
            }
            this.f333068a.offset(f11, bVar.f333065e);
            path.addArc(this.f333068a, f8, f10);
            min -= min3 - max;
        }
        if (min > 0.0f) {
            float f12 = true != bVar.f333067g ? 12.0f : -12.0f;
            float f13 = bVar.f333065e;
            path.moveTo(f12, f13);
            path.lineTo(f12, f13 - min);
        }
    }
}
