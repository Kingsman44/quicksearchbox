package com.google.android.apps.search.podcasts;

import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.view.View;
import androidx.activity.OnBackPressedDispatcher;
import com.google.android.apps.search.podcasts.playerpanel.C140879aj;
import com.google.android.apps.search.podcasts.playerpanel.C140929o;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.bottomsheet.C44555f;

/* renamed from: com.google.android.apps.search.podcasts.r */
/* compiled from: PG */
final class C140953r extends C44555f {

    /* renamed from: a */
    final /* synthetic */ C141182w f382710a;

    public C140953r(C141182w wVar) {
        this.f382710a = wVar;
    }

    /* renamed from: a */
    public final void mo32311a(View view, float f) {
        if (this.f382710a.f383288b.getView() != null) {
            this.f382710a.mo116214e(view, f);
        }
    }

    /* renamed from: b */
    public final void mo32312b(View view, int i) {
        Fragment b;
        Runnable runnable;
        OnBackPressedDispatcher onBackPressedDispatcher;
        if (this.f382710a.f383288b.getActivity() != null && (b = this.f382710a.f383288b.getChildFragmentManager().f634a.mo670b(R.id.podcasts_expanded_player_panel_container)) != null) {
            C140879aj a = ((C140929o) b).mo17754z();
            a.f382563p.mo3351b();
            if (i == 3) {
                C0167am activity = a.f382548a.getActivity();
                if (!(activity == null || (onBackPressedDispatcher = activity.f2707h) == null)) {
                    onBackPressedDispatcher.mo3339b(a.f382548a.getViewLifecycleOwner(), a.f382563p);
                }
            } else if (i == 4) {
                a.mo115979b(false);
            }
            if (i == 4 && (runnable = this.f382710a.f383305s) != null) {
                runnable.run();
                this.f382710a.f383305s = null;
            }
        }
    }
}
