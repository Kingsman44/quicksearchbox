package com.google.android.apps.search.googleapp.saves.savefeature.p10398c.p10399a;

import android.content.ComponentName;
import android.content.Context;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.c.a.c */
/* compiled from: PG */
public final class C137287c {

    /* renamed from: a */
    private static final C59071e f373487a = C59071e.m91332i("com.google.android.apps.search.googleapp.saves.savefeature.c.a.c");

    /* renamed from: a */
    public static void m223051a(Context context, boolean z) {
        C59071e eVar = f373487a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SavesShareReceiver");
        ((C59052c) ((C59052c) b).mo56372aa(40957)).mo56389s("AvailabilityUtils.updateAvailability() componentEnabled: %s", Boolean.valueOf(z));
        ComponentName componentName = new ComponentName(context, "com.google.android.apps.search.googleapp.saves.savefeature.sharereceiver.SavesShareReceiver");
        context.getPackageManager().setComponentEnabledSetting(componentName, true != z ? 2 : 1, 1);
        C59104x b2 = eVar.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "SavesShareReceiver");
        ((C59052c) ((C59052c) b2).mo56372aa(40958)).mo56355H("Update complete. %s enabled: %s", componentName, z);
    }
}
