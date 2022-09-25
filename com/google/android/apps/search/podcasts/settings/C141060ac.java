package com.google.android.apps.search.podcasts.settings;

import android.view.View;
import com.google.android.apps.search.podcasts.settings.p10612a.C141050c;
import com.google.android.apps.search.podcasts.settings.p10612a.C141051d;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.settings.ac */
/* compiled from: PG */
final class C141060ac implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C141098t f382975a;

    public C141060ac(C141098t tVar) {
        this.f382975a = tVar;
    }

    public final void onClick(View view) {
        C58485gu guVar;
        C141098t tVar = this.f382975a;
        String string = tVar.f383071d.getString(R.string.podcasts_remove_unfinished_episodes);
        C69664n.m101060f(string, "fragment.getString(R.str…move_unfinished_episodes)");
        if (this.f382975a.f383080m) {
            guVar = C58485gu.m89847o(C141051d.MILLIS_30DAYS, C141051d.MILLIS_90DAYS);
            C69664n.m101060f(guVar, "{\n      ImmutableList.of…tion.MILLIS_90DAYS)\n    }");
        } else {
            guVar = C58485gu.m89848p(C141051d.MILLIS_30DAYS, C141051d.MILLIS_90DAYS, C141051d.MILLIS_NEVER);
            C69664n.m101060f(guVar, "{\n      ImmutableList.of…ption.MILLIS_NEVER)\n    }");
        }
        C141050c cVar = this.f382975a.f383081n;
        C69664n.m101058d(cVar);
        tVar.mo116152b(string, guVar, cVar.f382934c, new C141059ab(this.f382975a));
    }
}
