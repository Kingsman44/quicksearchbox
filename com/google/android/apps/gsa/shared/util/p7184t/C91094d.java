package com.google.android.apps.gsa.shared.util.p7184t;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: com.google.android.apps.gsa.shared.util.t.d */
/* compiled from: PG */
public final /* synthetic */ class C91094d {
    /* renamed from: a */
    public static void m148838a(C91097g gVar, Intent intent, Bundle bundle) {
        if (bundle != null) {
            intent.putExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.CUSTOM_TRANSITION", bundle);
            intent.putExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.USE_TRANSITION", 3);
        }
        gVar.mo65089a(intent);
    }
}
