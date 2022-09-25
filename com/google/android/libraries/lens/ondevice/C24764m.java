package com.google.android.libraries.lens.ondevice;

import com.google.android.libraries.lens.ondevice.p2018b.C24268a;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24440ab;
import com.google.android.libraries.lens.ondevice.p2026f.p2029b.C24473a;
import com.google.android.libraries.lens.ondevice.p2037n.C24799j;
import com.google.android.libraries.lens.ondevice.p2037n.C24803n;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.lens.ondevice.m */
/* compiled from: PG */
public final /* synthetic */ class C24764m implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f67668a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f67669b;

    public /* synthetic */ C24764m(C60870cx cxVar, C60870cx cxVar2) {
        this.f67668a = cxVar;
        this.f67669b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f67668a;
        C60870cx cxVar2 = this.f67669b;
        if (!((Boolean) C60856cj.m92909r(cxVar)).booleanValue()) {
            return new C24268a(false, C58836b.f156633a);
        }
        C24803n nVar = (C24803n) C60856cj.m92909r(cxVar2);
        C24799j jVar = nVar.f67773b;
        if (jVar == null) {
            jVar = C24799j.f67763b;
        }
        if (jVar.f67765a.size() == 0) {
            return new C24268a(true, C58833ax.m90834k(nVar));
        }
        C24799j jVar2 = nVar.f67773b;
        if (jVar2 == null) {
            jVar2 = C24799j.f67763b;
        }
        for (C24440ab h : jVar2.f67765a) {
            if (!C24473a.m45549h(h)) {
                return new C24268a(false, C58836b.f156633a);
            }
        }
        return new C24268a(true, C58833ax.m90834k(nVar));
    }
}
