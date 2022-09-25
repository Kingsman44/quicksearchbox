package com.google.android.apps.search.podcasts.explore.p10564a;

import android.text.TextUtils;
import com.google.apps.tiktok.dataservice.C46788de;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.p4017at.p4082j.p4083a.C54362bo;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.explore.a.h */
/* compiled from: PG */
final class C140255h implements C60930r {

    /* renamed from: a */
    final /* synthetic */ C60870cx f381027a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f381028b;

    /* renamed from: c */
    final /* synthetic */ C60870cx f381029c;

    /* renamed from: d */
    final /* synthetic */ C140261n f381030d;

    public C140255h(C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C140261n nVar) {
        this.f381027a = cxVar;
        this.f381028b = cxVar2;
        this.f381029c = cxVar3;
        this.f381030d = nVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        Object r = C60856cj.m92909r(this.f381027a);
        C69664n.m101060f(r, "getDone(loadDiscoverFeedsFuture)");
        C58833ax axVar = (C58833ax) r;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty((CharSequence) C60856cj.m92909r(this.f381028b));
        if (C60856cj.m92909r(this.f381029c) != C54362bo.ENABLE_PERSONALIZATION) {
            z = false;
        }
        return this.f381030d.f381043b.mo50715b(axVar, C46788de.SAME_DAY).mo50738e(new C140254g(this.f381030d, z2, z), C60826bg.f164896a);
    }
}
