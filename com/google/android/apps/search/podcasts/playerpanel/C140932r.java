package com.google.android.apps.search.podcasts.playerpanel;

import androidx.activity.C0800m;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.r */
/* compiled from: PG */
public final class C140932r extends C0800m {

    /* renamed from: a */
    final /* synthetic */ C140879aj f382687a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140932r(C140879aj ajVar) {
        super(true);
        this.f382687a = ajVar;
    }

    /* renamed from: a */
    public final void mo608a() {
        if (this.f382687a.f382548a.getChildFragmentManager().f634a.mo670b(R.id.podcasts_panel_container) == null) {
            C47393f.m84237h(new C140896b((Runnable) null), this.f382687a.f382548a.requireView());
        } else {
            this.f382687a.mo115979b(true);
        }
    }
}
