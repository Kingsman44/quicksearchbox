package com.google.android.libraries.lens.sdk.intent;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import com.google.android.libraries.p1623at.p1632e.C19557e;

/* renamed from: com.google.android.libraries.lens.sdk.intent.g */
/* compiled from: PG */
public final class C24945g {
    /* renamed from: a */
    public static Intent m46174a(C24943e eVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("google://lens"));
        boolean z = false;
        if ("userdebug".equals(Build.TYPE) && C19557e.m37301c()) {
            z = true;
        }
        intent.setPackage(true != z ? "com.google.android.googlequicksearchbox" : "com.google.android.apps.search.lens.standalone");
        eVar.f68071a.putLong("start_activity_time_nanos", SystemClock.elapsedRealtimeNanos());
        intent.putExtra("lens_activity_params", eVar.f68071a);
        if (eVar.f68071a.containsKey("handover_session_id") && eVar.mo30165a() != 0) {
            intent.putExtra("handover-session-id", eVar.mo30165a());
        }
        return intent;
    }

    /* renamed from: b */
    public static final void m46175b(Context context, C24943e eVar) {
        eVar.mo30175k(new C24942d(context));
        Intent a = m46174a(eVar);
        a.addFlags(268435456);
        a.addFlags(32768);
        context.startActivity(a);
    }
}
