package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.app.PendingIntent;
import androidx.core.app.C1839z;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.base.C58817ah;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.au */
/* compiled from: PG */
public final /* synthetic */ class C96463au implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C96467ay f269860a;

    /* renamed from: b */
    public final /* synthetic */ String f269861b;

    public /* synthetic */ C96463au(C96467ay ayVar, String str) {
        this.f269860a = ayVar;
        this.f269861b = str;
    }

    public final Object apply(Object obj) {
        PendingIntent pendingIntent;
        C96467ay ayVar = this.f269860a;
        String str = this.f269861b;
        C124548d dVar = (C124548d) obj;
        if (dVar == null || dVar.mo106481V() == null) {
            C59104x b = C96467ay.f269867a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "PRNotifHelper");
            ((C59052c) ((C59052c) b).mo56372aa(17175)).mo56386p("No device info");
            return null;
        }
        String V = dVar.mo106481V();
        C58976aa aaVar = C58975e.f156826a;
        if (str.equals("pr_notification")) {
            pendingIntent = ayVar.mo90154d(ayVar.mo90157g(str, dVar, "action_affirmative"), "action_affirmative");
        } else {
            pendingIntent = ayVar.mo90155e();
        }
        PendingIntent d = ayVar.mo90154d(ayVar.mo90157g(str, dVar, "action_negative"), "action_negative");
        PendingIntent d2 = ayVar.mo90154d(ayVar.mo90157g(str, dVar, "action_dismiss"), "action_dismiss");
        PendingIntent d3 = ayVar.mo90154d(ayVar.mo90157g(str, dVar, "action_content_click"), "action_content_click");
        C1839z b2 = C96460ar.m159822b(ayVar.f269869c, ayVar.mo90161k(str), ayVar.mo90160j(str), C96460ar.f269856c, C58836b.f156633a);
        b2.f5687g = d3;
        b2.f5679J.deleteIntent = d2;
        b2.mo5016e(0, ayVar.mo90159i(str), pendingIntent);
        b2.mo5016e(0, ayVar.f269869c.getString(R.string.pr_request_no_thanks_button), d);
        b2.f5671B = -1;
        ayVar.f269872f.notify(1, b2.mo5013a());
        V.getClass();
        ((C39141kp) ayVar.f269873g.mo27525b()).mo41700o(V, str, "system_post");
        return null;
    }
}
