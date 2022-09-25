package com.google.android.libraries.search.p3005i;

import android.content.Context;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46788de;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.search.i.q */
/* compiled from: PG */
public final /* synthetic */ class C38473q implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C38411ab f101815a;

    public /* synthetic */ C38473q(C38411ab abVar) {
        this.f101815a = abVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C38411ab abVar = this.f101815a;
        Context context = abVar.f101670b;
        C46175b bVar = abVar.f101676h;
        C46723bg bgVar = abVar.f101677i;
        C46128f fVar = abVar.f101679k;
        C60887da daVar = abVar.f101678j;
        C60870cx h = C60922j.m93045h(bgVar.mo50750c(bVar.mo50245b(), C46788de.DONT_CARE), C47810es.m84966f(new C38410aa(context, fVar, daVar)), daVar);
        C60870cx e = abVar.f101676h.mo50248e();
        C38477u uVar = new C38477u(abVar);
        C60870cx h2 = C60922j.m93045h(e, C47810es.m84966f(uVar), abVar.f101678j);
        return C47638k.m84753d(h, h2, abVar.f101673e.mo23237a()).mo51520a(new C38478v(abVar, h, h2), abVar.f101671c);
    }
}
