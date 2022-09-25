package com.google.android.apps.search.googleapp.customtabs.features.buttons;

import com.google.apps.tiktok.account.data.C46108a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.buttons.a */
/* compiled from: PG */
public final /* synthetic */ class C133815a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f364484a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f364485b;

    public /* synthetic */ C133815a(C60870cx cxVar, C60870cx cxVar2) {
        this.f364484a = cxVar;
        this.f364485b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f364484a;
        C60870cx cxVar2 = this.f364485b;
        String str = ((C46108a) C60856cj.m92909r(cxVar)).mo50210b().f121165j;
        boolean z = false;
        if (!str.equals("pseudonymous") && !str.equals("incognito") && ((String) C60856cj.m92909r(cxVar2)).equals("en-US")) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
