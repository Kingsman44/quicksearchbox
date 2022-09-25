package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a;

import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3897e.p3921j.C52583xc;
import com.google.assistant.p3897e.p3921j.C52591xk;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Collection;
import p5285d.p5290b.p5291a.p5292a.C68185bu;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.f.a.ab */
/* compiled from: PG */
public final /* synthetic */ class C115424ab implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f320246a;

    /* renamed from: b */
    public final /* synthetic */ C52174hz f320247b;

    public /* synthetic */ C115424ab(C60870cx cxVar, C52174hz hzVar) {
        this.f320246a = cxVar;
        this.f320247b = hzVar;
    }

    public final Object call() {
        C52583xc xcVar;
        C60870cx cxVar = this.f320246a;
        C52174hz hzVar = this.f320247b;
        try {
            String str = (String) C60856cj.m92909r(cxVar);
            C52568wo woVar = hzVar.f136897d;
            if (woVar == null) {
                woVar = C52568wo.f137992v;
            }
            if (woVar.f137996c == 26) {
                xcVar = (C52583xc) woVar.f137997d;
            } else {
                xcVar = C52583xc.f138063o;
            }
            C52591xk xkVar = xcVar.f138078n;
            if (xkVar == null) {
                xkVar = C52591xk.f138094b;
            }
            return C58833ax.m90833j((C68185bu) Collection.EL.stream(xkVar.f138096a).filter(new C115429ag(str)).map(C115430ah.f320255a).findFirst().orElse(null));
        } catch (ExecutionException unused) {
            return C58836b.f156633a;
        }
    }
}
