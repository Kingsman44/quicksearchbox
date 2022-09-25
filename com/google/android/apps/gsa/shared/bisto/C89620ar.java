package com.google.android.apps.gsa.shared.bisto;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.bisto.ar */
/* compiled from: PG */
public final class C89620ar {

    /* renamed from: a */
    private static final C59071e f242694a = C59071e.m91332i("com.google.android.apps.gsa.shared.bisto.ar");

    /* renamed from: b */
    private final Context f242695b;

    public C89620ar(Context context) {
        this.f242695b = context;
    }

    /* renamed from: a */
    public final boolean mo83485a() {
        if (Build.VERSION.SDK_INT < 31) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f242695b.getSystemService("appops");
        if (appOpsManager == null) {
            C59104x d = f242694a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MicPermManager");
            ((C59052c) ((C59052c) d).mo56372aa(10277)).mo56386p("Unable to get access to app ops manager");
            return true;
        } else if (appOpsManager.unsafeCheckOpNoThrow("android:record_audio", Process.myUid(), this.f242695b.getPackageName()) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
