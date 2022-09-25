package com.google.android.apps.search.podcasts.playerpanel;

import android.text.TextUtils;
import com.google.android.apps.search.podcasts.p10601r.C140976e;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.apps.search.podcasts.player.C140787e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.p4017at.p4082j.p4083a.C54362bo;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.k */
/* compiled from: PG */
final class C140925k implements C60930r {

    /* renamed from: a */
    final /* synthetic */ C140927m f382666a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f382667b;

    /* renamed from: c */
    final /* synthetic */ C60870cx f382668c;

    /* renamed from: d */
    final /* synthetic */ C60870cx f382669d;

    public C140925k(C140927m mVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f382666a = mVar;
        this.f382667b = cxVar;
        this.f382668c = cxVar2;
        this.f382669d = cxVar3;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        this.f382666a.f382671a.mo115891m();
        C140787e eVar = (C140787e) C60856cj.m92909r(this.f382667b);
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty((CharSequence) C60856cj.m92909r(this.f382668c));
        if (C60856cj.m92909r(this.f382669d) != C54362bo.ENABLE_PERSONALIZATION) {
            z = false;
        }
        if (eVar == null) {
            return C60856cj.m92900i(new C140923i((C140787e) null, z2, this.f382666a.mo116023a((C140787e) null)));
        }
        C140927m mVar = this.f382666a;
        return C140989k.m228944b(mVar.f382674d.mo115361a(C140976e.m228929b(eVar.f382282c)), new C140924j(eVar, z2, z, mVar));
    }
}
