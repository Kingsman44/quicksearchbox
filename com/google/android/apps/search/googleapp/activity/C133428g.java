package com.google.android.apps.search.googleapp.activity;

import android.app.Activity;
import android.content.Intent;
import com.google.android.apps.gsa.h.g.e;
import com.google.android.apps.search.googleapp.p10310h.C136126g;
import com.google.android.apps.search.googleapp.p10310h.C136127h;
import com.google.android.apps.search.googleapp.p10310h.C136128i;
import com.google.android.apps.search.googleapp.p10310h.C136129j;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.apps.tiktok.tracing.C47810es;

/* renamed from: com.google.android.apps.search.googleapp.activity.g */
/* compiled from: PG */
public final class C133428g {
    /* renamed from: a */
    public static final boolean m216566a(Activity activity, Intent intent) {
        if (intent.getComponent() != null && intent.getSelector() == null) {
            String className = intent.getComponent().getClassName();
            if (className.equals("com.google.android.googlequicksearchbox.InternalGoogleAppActivityEntrypoint") || className.equals("com.google.android.googlequicksearchbox.HomescreenIconEntrypoint") || className.equals("com.google.android.apps.search.googleapp.activity.StandaloneGoogleAppActivityEntrypoint")) {
                activity.setIntent(intent);
                return true;
            }
        }
        if (C136126g.m221193g(intent)) {
            Intent addCategory = new Intent().setAction("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER");
            C136128i l = C136129j.m221208l();
            l.mo112776k(C139779t.HOME_SCREEN);
            C136127h.m221196a(addCategory, l.mo112766a());
            activity.setIntent(addCategory);
            return true;
        }
        intent.setClassName("com.google.android.googlequicksearchbox", e.b()).putExtra("SKIP_EXIT_ANIMATION", true);
        intent.addFlags(268435456);
        intent.addFlags(32768);
        C47810es.m84979s(activity, intent);
        activity.finishAndRemoveTask();
        return false;
    }
}
