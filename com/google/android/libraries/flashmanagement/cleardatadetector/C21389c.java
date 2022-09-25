package com.google.android.libraries.flashmanagement.cleardatadetector;

import android.util.Log;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.flashmanagement.cleardatadetector.c */
/* compiled from: PG */
public final /* synthetic */ class C21389c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C21390d f59782a;

    public /* synthetic */ C21389c(C21390d dVar) {
        this.f59782a = dVar;
    }

    public final Object apply(Object obj) {
        C21390d dVar = this.f59782a;
        C21391e eVar = (C21391e) obj;
        int componentEnabledSetting = dVar.f59783a.getComponentEnabledSetting(dVar.f59786d);
        int i = 2;
        if (componentEnabledSetting == 0) {
            Log.i("FirstRunClassifier", String.format("First run of %s on this device detected", new Object[]{dVar.f59784b}));
            dVar.f59783a.setComponentEnabledSetting(dVar.f59786d, 2, 1);
            componentEnabledSetting = 0;
        }
        if (!eVar.f59791b) {
            C21392f fVar = dVar.f59789g;
            C21391e eVar2 = new C21391e(true, dVar.f59787e);
            fVar.f59793a.edit().putBoolean(fVar.f59794b, eVar2.f59791b).putLong(fVar.f59795c, eVar2.f59792c).apply();
            dVar.f59788f = 0;
            if (componentEnabledSetting != 0) {
                Log.i("FirstRunClassifier", String.format("Clear data detected for %s!", new Object[]{dVar.f59784b}));
            } else {
                i = 1;
            }
        } else {
            long j = eVar.f59792c;
            if (j != C21391e.f59790a.f59792c) {
                dVar.f59788f = dVar.f59787e - j;
            } else {
                dVar.f59788f = -1;
            }
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
