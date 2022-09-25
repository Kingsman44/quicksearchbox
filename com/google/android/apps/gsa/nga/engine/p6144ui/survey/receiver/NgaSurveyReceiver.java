package com.google.android.apps.gsa.nga.engine.p6144ui.survey.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.nga.p5887c.C74745a;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.p4522b.C58729pv;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.survey.receiver.NgaSurveyReceiver */
/* compiled from: PG */
public final class NgaSurveyReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public Map f217130a = C58729pv.f156485a;

    /* renamed from: b */
    public C91142g f217131b;

    public final void onReceive(Context context, Intent intent) {
        String string;
        C91142g gVar;
        C74507e.m120467c(12);
        Bundle extras = intent.getExtras();
        if (extras != null && (string = extras.getString("com.google.android.apps.googlequicksearchbox.nga.EVENT_TYPE")) != null) {
            C78911b bVar = (C78911b) C74745a.m120861a(context);
            if (bVar != null) {
                bVar.mo73680pT(this);
            }
            C78910a aVar = (C78910a) this.f217130a.get(string);
            if (aVar != null && (gVar = this.f217131b) != null && gVar.mo85405j(C90126fx.f251117ck)) {
                aVar.mo73678a(intent);
            }
        }
    }
}
