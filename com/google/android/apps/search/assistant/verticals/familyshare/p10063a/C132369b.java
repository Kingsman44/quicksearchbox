package com.google.android.apps.search.assistant.verticals.familyshare.p10063a;

import android.content.Context;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.verticals.familyshare.a.b */
/* compiled from: PG */
public final /* synthetic */ class C132369b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C132370c f361337a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f361338b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f361339c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f361340d;

    public /* synthetic */ C132369b(C132370c cVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f361337a = cVar;
        this.f361338b = cxVar;
        this.f361339c = cxVar2;
        this.f361340d = cxVar3;
    }

    public final Object call() {
        C132370c cVar = this.f361337a;
        C60870cx cxVar = this.f361338b;
        C60870cx cxVar2 = this.f361339c;
        C60870cx cxVar3 = this.f361340d;
        Context context = cVar.f361342a;
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) C60856cj.m92909r(cxVar2)).booleanValue();
        String str = ((C46108a) C60856cj.m92909r(cxVar3)).mo50210b().f121165j;
        boolean z = false;
        if (booleanValue && booleanValue2 && !"incognito".equals(str) && !"pseudonymous".equals(str)) {
            z = true;
        }
        C132370c.m215155a(context, z);
        return Boolean.valueOf(z);
    }
}
