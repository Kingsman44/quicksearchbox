package com.google.android.apps.gsa.shared.util;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.DisplayMetrics;
import com.google.p4495cl.p4497b.p4498a.p4499a.C58134e;
import com.google.p4495cl.p4497b.p4498a.p4499a.C58135f;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.shared.util.w */
/* compiled from: PG */
public final class C91143w {
    /* renamed from: a */
    public static C58135f m148923a(Context context) {
        DisplayMetrics displayMetrics;
        C58134e eVar = (C58134e) C58135f.f155417f.createBuilder();
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            displayMetrics = null;
        } else {
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            displayManager.getDisplay(0).getMetrics(displayMetrics2);
            displayMetrics = displayMetrics2;
        }
        if (displayMetrics != null) {
            int i = displayMetrics.densityDpi;
            eVar.copyOnWrite();
            C58135f fVar = (C58135f) eVar.instance;
            fVar.f155419a |= 1;
            fVar.f155420b = i;
            int i2 = displayMetrics.widthPixels;
            eVar.copyOnWrite();
            C58135f fVar2 = (C58135f) eVar.instance;
            fVar2.f155419a |= 2;
            fVar2.f155421c = i2;
            int i3 = displayMetrics.heightPixels;
            eVar.copyOnWrite();
            C58135f fVar3 = (C58135f) eVar.instance;
            fVar3.f155419a |= 4;
            fVar3.f155422d = i3;
        }
        eVar.mo54677a(Arrays.asList(Build.SUPPORTED_ABIS));
        return (C58135f) eVar.build();
    }
}
