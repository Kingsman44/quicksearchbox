package com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b;

import android.content.Context;
import android.content.Intent;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.a.b.a */
/* compiled from: PG */
public final class C124519a {

    /* renamed from: a */
    private static final C59071e f343588a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.bisto.a.b.a");

    /* renamed from: a */
    public static boolean m203974a(Context context, Intent intent) {
        try {
            context.startService(intent.setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.bisto.BistoRealService"));
            C58976aa aaVar = C58975e.f156826a;
            return true;
        } catch (ExceptionInInitializerError e) {
            C59104x c = f343588a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoIntentUtil");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(36232)).mo56386p("fwd exception");
            return false;
        } catch (IllegalStateException e2) {
            C59104x b = f343588a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoIntentUtil");
            ((C59052c) ((C59052c) ((C59052c) b).mo56382g(e2)).mo56372aa(36233)).mo56386p("fwd exception");
            intent.putExtra("run_in_foreground", true);
            try {
                context.startForegroundService(intent);
                return true;
            } catch (ExceptionInInitializerError | IllegalStateException e3) {
                C59104x c2 = f343588a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "BistoIntentUtil");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e3)).mo56372aa(36235)).mo56386p("Could not forward to BRS.");
                return false;
            }
        }
    }
}
