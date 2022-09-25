package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.android.libraries.search.assistant.proactive.C36334o;
import com.google.assistant.p3897e.p3921j.p3926e.C51962fo;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.cf */
/* compiled from: PG */
public final /* synthetic */ class C114441cf implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C114464db f317319a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f317320b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f317321c;

    public /* synthetic */ C114441cf(C114464db dbVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f317319a = dbVar;
        this.f317320b = cxVar;
        this.f317321c = cxVar2;
    }

    public final Object call() {
        C114464db dbVar = this.f317319a;
        C60870cx cxVar = this.f317320b;
        C60870cx cxVar2 = this.f317321c;
        C36334o oVar = (C36334o) C60856cj.m92909r(cxVar);
        int j = dbVar.f317387h.mo40123j(oVar);
        int i = j - 1;
        if (j == 0) {
            throw null;
        } else if (i == 1) {
            throw new C114463da(C51962fo.APP_DISABLED);
        } else if (i == 2 || i == 3) {
            throw new C114463da(C51962fo.CHANNEL_DISABLED, oVar.f94887a);
        } else if (((Boolean) C60856cj.m92909r(cxVar2)).booleanValue()) {
            return oVar;
        } else {
            throw new C114463da(C51962fo.CATEGORY_DISABLED);
        }
    }
}
