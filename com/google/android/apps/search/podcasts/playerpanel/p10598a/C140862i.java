package com.google.android.apps.search.podcasts.playerpanel.p10598a;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.search.podcasts.p10601r.C140979f;
import com.google.android.apps.search.podcasts.player.C140752a;
import com.google.android.apps.search.podcasts.player.C140787e;
import com.google.android.apps.search.podcasts.player.C140788f;
import com.google.android.apps.search.podcasts.player.C140789g;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.a.i */
/* compiled from: PG */
final class C140862i implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C140866m f382513a;

    public C140862i(C140866m mVar) {
        this.f382513a = mVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        C140788f fVar;
        Instant instant;
        C140788f fVar2;
        Optional optional = (Optional) obj;
        if (optional.isPresent() && ((C140787e) optional.get()).f382284e != null) {
            this.f382513a.f382524h = (C140787e) optional.get();
            C140866m mVar = this.f382513a;
            View requireView = mVar.f382517a.requireView();
            C69664n.m101060f(requireView, "fragment.requireView()");
            Resources resources = mVar.f382517a.getResources();
            C69664n.m101060f(resources, "fragment.getResources()");
            C140789g gVar = null;
            ((TextView) requireView.findViewById(R.id.podcasts_sleep_timer_remaining_time)).setText(C140979f.m228937c(resources, (long) C140752a.m228542b(mVar.f382524h, mVar.f382521e, (Long) null)));
            C140787e eVar = mVar.f382524h;
            if (!(eVar == null || (fVar2 = eVar.f382284e) == null)) {
                gVar = fVar2.f382287a;
            }
            boolean z = false;
            if (gVar != C140789g.END_OF_EPISODE) {
                requireView.findViewById(R.id.podcasts_minus_five).setVisibility(0);
                requireView.findViewById(R.id.podcasts_add_five).setVisibility(0);
                requireView.findViewById(R.id.podcasts_to_episode_completion_text).setVisibility(8);
                View findViewById = requireView.findViewById(R.id.podcasts_minus_five);
                C140787e eVar2 = mVar.f382524h;
                if (!(eVar2 == null || (fVar = eVar2.f382284e) == null || (instant = fVar.f382288b) == null)) {
                    z = instant.isAfter(Instant.ofEpochMilli(mVar.f382521e.mo26870b()).plus(Duration.ofMinutes(5)));
                }
                findViewById.setEnabled(z);
                return;
            }
            requireView.findViewById(R.id.podcasts_minus_five).setVisibility(4);
            requireView.findViewById(R.id.podcasts_add_five).setVisibility(4);
            requireView.findViewById(R.id.podcasts_to_episode_completion_text).setVisibility(0);
        }
    }
}
