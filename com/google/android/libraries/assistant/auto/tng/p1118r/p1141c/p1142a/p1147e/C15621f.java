package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1147e;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15678j;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.a.e.f */
/* compiled from: PG */
public final /* synthetic */ class C15621f implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C15626k f46696a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f46697b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f46698c;

    /* renamed from: d */
    public final /* synthetic */ String f46699d;

    public /* synthetic */ C15621f(C15626k kVar, C60870cx cxVar, C60870cx cxVar2, String str) {
        this.f46696a = kVar;
        this.f46697b = cxVar;
        this.f46698c = cxVar2;
        this.f46699d = str;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        int i;
        C15626k kVar = this.f46696a;
        C60870cx cxVar = this.f46697b;
        C60870cx cxVar2 = this.f46698c;
        String str = this.f46699d;
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar)).booleanValue();
        C15678j jVar = (C15678j) C60856cj.m92909r(cxVar2);
        if (booleanValue) {
            C59104x b = C15626k.f46713a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "LocalFulfillerImpl");
            ((C59052c) ((C59052c) b).mo56372aa(46217)).mo56389s("Alias is not set so punt for destination: %s.", str);
            if (jVar == C15678j.HOME) {
                i = R.string.punt_home_alias_unset;
            } else if (jVar == C15678j.WORK) {
                i = R.string.punt_work_alias_unset;
            }
            return kVar.mo22428d(i);
        }
        return C60856cj.m92900i(C58836b.f156633a);
    }
}
