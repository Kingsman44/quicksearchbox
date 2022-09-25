package com.google.android.apps.gsa.assistant.settings.features.p554ak;

import androidx.preference.PreferenceScreen;
import com.google.android.apps.gsa.assistant.settings.base.C9506h;
import com.google.android.apps.gsa.assistant.settings.shared.phone.l;
import com.google.assistant.p3861at.C49842b;
import com.google.assistant.p3861at.C50058j;
import com.google.assistant.p3861at.act;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ak.b */
/* compiled from: PG */
final class C10170b extends C9506h {

    /* renamed from: a */
    final /* synthetic */ C10171c f34574a;

    public C10170b(C10171c cVar) {
        this.f34574a = cVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo17818b(Object obj) {
        act act = (act) obj;
        C49842b bVar = act.f128899f;
        if (bVar == null) {
            bVar = C49842b.f129519l;
        }
        if ((bVar.f129521a & 4096) != 0) {
            C49842b bVar2 = act.f128899f;
            if (bVar2 == null) {
                bVar2 = C49842b.f129519l;
            }
            C50058j jVar = bVar2.f129531k;
            if (jVar == null) {
                jVar = C50058j.f130146f;
            }
            if (jVar.f130152e) {
                this.f34574a.mo17792e().mo8379af(this.f34574a.f34577k);
            } else {
                PreferenceScreen e = this.f34574a.mo17792e();
                e.mo8380ag(this.f34574a.f34577k);
                e.mo8375z();
            }
        }
        l lVar = this.f34574a.f34576j;
        lVar.getClass();
        lVar.b(act);
    }
}
