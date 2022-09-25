package com.google.android.libraries.search.logging.p3034a;

import com.google.android.gms.clearcut.C143658k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.logging.a.d */
/* compiled from: PG */
public final /* synthetic */ class C38755d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C38756e f102309a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f102310b;

    /* renamed from: c */
    public final /* synthetic */ String f102311c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f102312d;

    /* renamed from: e */
    public final /* synthetic */ int f102313e;

    public /* synthetic */ C38755d(C38756e eVar, C60870cx cxVar, String str, int i, C60870cx cxVar2) {
        this.f102309a = eVar;
        this.f102310b = cxVar;
        this.f102311c = str;
        this.f102313e = i;
        this.f102312d = cxVar2;
    }

    public final Object call() {
        C38756e eVar = this.f102309a;
        C60870cx cxVar = this.f102310b;
        String str = this.f102311c;
        int i = this.f102313e;
        C60870cx cxVar2 = this.f102312d;
        if (((Boolean) C60856cj.m92909r(cxVar)).booleanValue()) {
            C143658k a = C143658k.m233374c(eVar.f102314a, str).mo118952a();
            a.f389489p = i;
            return a;
        }
        C143658k kVar = new C143658k(eVar.f102314a, str, (String) C60856cj.m92909r(cxVar2));
        kVar.f389489p = i;
        return kVar;
    }
}
