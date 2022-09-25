package com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a.p2810a;

import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.assistant.u.b.a.a.e */
/* compiled from: PG */
public final /* synthetic */ class C36662e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f95533a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f95534b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f95535c;

    public /* synthetic */ C36662e(C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f95533a = cxVar;
        this.f95534b = cxVar2;
        this.f95535c = cxVar3;
    }

    public final Object call() {
        C60870cx cxVar = this.f95533a;
        C60870cx cxVar2 = this.f95534b;
        C60870cx cxVar3 = this.f95535c;
        int intValue = ((Integer) C60856cj.m92909r(cxVar)).intValue();
        boolean equals = ((C9855w) C60856cj.m92909r(cxVar2)).equals(C9855w.STANDBY);
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar3)).booleanValue();
        boolean z = false;
        if ((equals || booleanValue) && intValue <= 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
