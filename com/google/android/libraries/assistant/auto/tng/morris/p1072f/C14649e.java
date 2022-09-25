package com.google.android.libraries.assistant.auto.tng.morris.p1072f;

import android.content.Context;
import android.content.Intent;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.view.WindowManager;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.f.e */
/* compiled from: PG */
public final class C14649e {

    /* renamed from: a */
    public static final C58528ij f44256a = C58528ij.m90015O("and.opa.morris.mic", "and.opa.morris.hotword", "and.opa.morris.elmyra", "and.opa.morris.generic_tap", "and.opa.morris.immersive", "and.opa.morris.longpress", "and.opa.morris.routines", "and.opa.morris.media", "and.opa.morris.message", "and.opa.morris.phone", "and.opa.morris.headset", "and.opa.morris.unknown");

    /* renamed from: b */
    private static final C59071e f44257b = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.f.e");

    /* renamed from: a */
    public static Context m30710a(Context context) {
        if (Build.VERSION.SDK_INT < 30) {
            return context;
        }
        try {
            return context.createDisplayContext(((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0)).createWindowContext(2, (Bundle) null);
        } catch (SecurityException unused) {
            C59104x b = f44257b.mo56224b();
            b.mo56378ag(C58975e.f156826a, "Morris.MorrisUtils");
            ((C59052c) ((C59052c) b).mo56372aa(45914)).mo56386p("Falling back to application context due to SecurityException.");
            return context;
        } catch (RuntimeException e) {
            C59104x c = f44257b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.MorrisUtils");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(45915)).mo56386p("RuntimeException while creating window context");
            return context;
        }
    }

    /* renamed from: b */
    public static WindowManager m30711b(Context context) {
        WindowManager windowManager = (WindowManager) m30710a(context).getSystemService("window");
        windowManager.getClass();
        return windowManager;
    }

    /* renamed from: c */
    public static boolean m30712c(Intent intent) {
        if (intent == null || intent.getExtras() == null || !intent.getExtras().getBoolean("com.google.android.apps.gsa.staticplugins.opa.morris.shared.INTENT_EXTRA_IS_IN_CAR_MODE", false)) {
            return false;
        }
        return true;
    }
}
