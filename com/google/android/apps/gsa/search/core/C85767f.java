package com.google.android.apps.gsa.search.core;

import android.content.Context;
import android.content.Intent;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.f */
/* compiled from: PG */
public final class C85767f {

    /* renamed from: a */
    private static final C59071e f231923a = C59071e.m91332i("com.google.android.apps.gsa.search.core.f");

    /* renamed from: a */
    public static void m137817a(Context context) {
        C58976aa aaVar = C58975e.f156826a;
        Intent intent = new Intent("com.google.android.apps.gsa.search.core.BroadcastListenerService.action.START");
        intent.setClassName(context, "com.google.android.apps.gsa.search.core.BroadcastListenerService");
        try {
            context.startService(intent);
        } catch (Exception e) {
            String obj = intent.toString();
            C59104x c = f231923a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BroadcastListenerHlp");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(7369)).mo56389s("%s", "Attempting to start service when the app is in background is not allowed on Android O+. Intent: ".concat(obj));
        }
    }
}
