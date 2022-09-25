package com.google.android.apps.search.podcasts.playerpanel;

import android.view.View;
import com.google.android.apps.search.podcasts.p10565f.C140288ai;
import com.google.android.apps.search.podcasts.p10565f.C140289aj;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.v */
/* compiled from: PG */
final class C140936v implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f382691a;

    public C140936v(View view) {
        this.f382691a = view;
    }

    public final void run() {
        C47393f.m84237h(new C140289aj(C140288ai.CURRENT, Integer.valueOf(R.id.podcasts_action_to_queue), 4), this.f382691a);
    }
}
