package com.google.android.apps.search.googleapp.urlhandler.optimizer;

import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135465k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.googleapp.urlhandler.optimizer.c */
/* compiled from: PG */
public final /* synthetic */ class C139843c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C139846f f380110a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f380111b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f380112c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f380113d;

    public /* synthetic */ C139843c(C139846f fVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f380110a = fVar;
        this.f380111b = cxVar;
        this.f380112c = cxVar2;
        this.f380113d = cxVar3;
    }

    public final Object call() {
        C139846f fVar = this.f380110a;
        C60870cx cxVar = this.f380111b;
        C60870cx cxVar2 = this.f380112c;
        C60870cx cxVar3 = this.f380113d;
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar)).booleanValue();
        String str = (String) C60856cj.m92909r(cxVar2);
        C135465k kVar = (C135465k) C60856cj.m92909r(cxVar3);
        if (booleanValue) {
            if (str != null && !kVar.f369076b) {
                return fVar.f380118b;
            }
            if (kVar.f369076b) {
                return fVar.f380119c;
            }
        }
        return fVar.f380120d;
    }
}
