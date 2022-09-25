package com.google.android.apps.search.googleapp.discover.channels;

import com.google.apps.tiktok.cache.C46370ah;
import com.google.apps.tiktok.dataservice.C46688af;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.googleapp.discover.channels.l */
/* compiled from: PG */
public final /* synthetic */ class C134180l implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C134183o f365502a;

    public /* synthetic */ C134180l(C134183o oVar) {
        this.f365502a = oVar;
    }

    public final Object apply(Object obj) {
        C134183o oVar = this.f365502a;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return C46688af.f121976a;
        }
        C46370ah ahVar = (C46370ah) axVar.mo56107c();
        if (Duration.between(Instant.ofEpochMilli(ahVar.f121385b), oVar.f365506b.mo57444a()).compareTo(C134183o.f365505a) >= 0) {
            return C46688af.f121976a;
        }
        return C46688af.m83205b((C134144bf) ahVar.f121384a, ahVar.f121385b);
    }
}
