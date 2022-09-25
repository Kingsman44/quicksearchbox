package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.app.PendingIntent;
import androidx.core.app.C1839z;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.aw */
/* compiled from: PG */
public final /* synthetic */ class C96465aw implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C96467ay f269864a;

    /* renamed from: b */
    public final /* synthetic */ String f269865b;

    public /* synthetic */ C96465aw(C96467ay ayVar, String str) {
        this.f269864a = ayVar;
        this.f269865b = str;
    }

    public final void run() {
        PendingIntent pendingIntent;
        C96467ay ayVar = this.f269864a;
        String str = this.f269865b;
        if (str.equals("pr_notification")) {
            pendingIntent = ayVar.mo90154d(ayVar.mo90158h(str, "action_affirmative"), "action_affirmative");
        } else {
            pendingIntent = ayVar.mo90155e();
        }
        PendingIntent d = ayVar.mo90154d(ayVar.mo90158h(str, "action_negative"), "action_negative");
        PendingIntent d2 = ayVar.mo90154d(ayVar.mo90158h(str, "action_dismiss"), "action_dismiss");
        PendingIntent d3 = ayVar.mo90154d(ayVar.mo90158h(str, "action_content_click"), "action_content_click");
        C1839z b = C96460ar.m159822b(ayVar.f269869c, ayVar.mo90161k(str), ayVar.mo90160j(str), C96460ar.f269856c, C58836b.f156633a);
        b.f5687g = d3;
        b.f5679J.deleteIntent = d2;
        b.mo5016e(0, ayVar.mo90159i(str), pendingIntent);
        b.mo5016e(0, ayVar.f269869c.getString(R.string.pr_request_no_thanks_button), d);
        b.f5671B = -1;
        ayVar.f269872f.notify(1, b.mo5013a());
    }
}
