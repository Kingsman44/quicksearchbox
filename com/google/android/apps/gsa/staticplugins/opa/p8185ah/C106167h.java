package com.google.android.apps.gsa.staticplugins.opa.p8185ah;

import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ah.h */
/* compiled from: PG */
public final /* synthetic */ class C106167h implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C106171l f296291a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f296292b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f296293c;

    /* renamed from: d */
    public final /* synthetic */ int f296294d;

    public /* synthetic */ C106167h(C106171l lVar, C60870cx cxVar, C60870cx cxVar2, int i) {
        this.f296291a = lVar;
        this.f296292b = cxVar;
        this.f296293c = cxVar2;
        this.f296294d = i;
    }

    public final Object call() {
        C106171l lVar = this.f296291a;
        C60870cx cxVar = this.f296292b;
        C60870cx cxVar2 = this.f296293c;
        int i = this.f296294d;
        C9855w wVar = (C9855w) C60856cj.m92909r(cxVar);
        int intValue = ((Integer) C60856cj.m92909r(cxVar2)).intValue();
        if (i == 3) {
            if (wVar == C9855w.STANDBY && ((long) intValue) < lVar.f296307e.mo79743a(C90014bt.f247395gO)) {
                return true;
            }
            i = 3;
        }
        if ((i == 2 || i == 3) && wVar == C9855w.DISABLED && ((long) intValue) <= lVar.f296307e.mo79743a(C90014bt.f247396gP)) {
            return true;
        }
        return false;
    }
}
