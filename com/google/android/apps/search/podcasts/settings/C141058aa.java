package com.google.android.apps.search.podcasts.settings;

import android.view.View;
import com.google.android.apps.search.podcasts.settings.p10612a.C141050c;
import com.google.android.apps.search.podcasts.settings.p10612a.C141051d;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.settings.aa */
/* compiled from: PG */
final class C141058aa implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C141098t f382973a;

    public C141058aa(C141098t tVar) {
        this.f382973a = tVar;
    }

    public final void onClick(View view) {
        C58485gu guVar;
        C141098t tVar = this.f382973a;
        String string = tVar.f383071d.getString(R.string.podcasts_remove_completed_episodes);
        C69664n.m101060f(string, "fragment.getString(R.str…emove_completed_episodes)");
        if (this.f382973a.f383080m) {
            guVar = C58485gu.m89849q(C141051d.MILLIS_24HOURS, C141051d.MILLIS_7DAYS, C141051d.MILLIS_30DAYS, C141051d.MILLIS_90DAYS);
            C69664n.m101060f(guVar, "{\n      ImmutableList.of…LLIS_90DAYS\n      )\n    }");
        } else {
            guVar = C58485gu.m89848p(C141051d.MILLIS_24HOURS, C141051d.MILLIS_7DAYS, C141051d.MILLIS_NEVER);
            C69664n.m101060f(guVar, "{\n      ImmutableList.of…ption.MILLIS_NEVER)\n    }");
        }
        C141050c cVar = this.f382973a.f383081n;
        C69664n.m101058d(cVar);
        tVar.mo116152b(string, guVar, cVar.f382933b, new C141106z(this.f382973a));
    }
}
