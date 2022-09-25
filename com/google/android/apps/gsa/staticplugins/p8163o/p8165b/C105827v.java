package com.google.android.apps.gsa.staticplugins.p8163o.p8165b;

import android.os.Bundle;
import androidx.media3.p132b.C2504h;
import androidx.media3.p132b.C2505i;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85346o;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.b.v */
/* compiled from: PG */
public final /* synthetic */ class C105827v implements C2504h {

    /* renamed from: a */
    public final /* synthetic */ C105830y f295224a;

    public /* synthetic */ C105827v(C105830y yVar) {
        this.f295224a = yVar;
    }

    /* renamed from: a */
    public final C2505i mo5878a() {
        C105830y yVar = this.f295224a;
        C105824s sVar = yVar.f295231d;
        C85346o oVar = (C85346o) C60856cj.m92910s(yVar.f295228a);
        int i = yVar.f295229b;
        Bundle bundle = sVar.f295218a;
        int i2 = C105826u.f295220a;
        if (bundle.containsKey("com.google.android.apps.gsa.search.core.work.audioplayer.SpeakrUseOnDeviceTts")) {
            return new C105812g(oVar, i);
        }
        return new C105809d(oVar, i);
    }
}
