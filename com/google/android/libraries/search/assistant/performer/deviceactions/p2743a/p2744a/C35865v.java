package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.v */
/* compiled from: PG */
public final /* synthetic */ class C35865v implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f93966a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f93967b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f93968c;

    /* renamed from: d */
    public final /* synthetic */ C35862s f93969d;

    /* renamed from: e */
    public final /* synthetic */ double f93970e;

    /* renamed from: f */
    public final /* synthetic */ int f93971f;

    /* renamed from: g */
    public final /* synthetic */ int f93972g;

    public /* synthetic */ C35865v(C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C35862s sVar, int i, int i2, double d) {
        this.f93966a = cxVar;
        this.f93967b = cxVar2;
        this.f93968c = cxVar3;
        this.f93969d = sVar;
        this.f93971f = i;
        this.f93972g = i2;
        this.f93970e = d;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar = this.f93966a;
        C60870cx cxVar2 = this.f93967b;
        C60870cx cxVar3 = this.f93968c;
        C35862s sVar = this.f93969d;
        int i = this.f93971f;
        int i2 = this.f93972g;
        double d = this.f93970e;
        try {
            Integer num = (Integer) C60856cj.m92909r(cxVar);
            Integer num2 = (Integer) C60856cj.m92909r(cxVar2);
            Integer num3 = (Integer) C60856cj.m92909r(cxVar3);
            if (!sVar.f93959g) {
                return C60856cj.m92900i(false);
            }
            if (!(num3.intValue() == -1 || num.intValue() == -1)) {
                if (num2.intValue() != -1) {
                    int intValue = num3.intValue();
                    int intValue2 = num.intValue();
                    int intValue3 = num2.intValue();
                    int f = C35864u.m64264f(i, i2, C35864u.m64263e(i, i2, d, intValue, intValue2, intValue3), intValue, intValue2, intValue3);
                    if (f == -1) {
                        return C60856cj.m92900i(false);
                    }
                    return sVar.mo39870c(Integer.toString(f));
                }
            }
            return C60856cj.m92900i(false);
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) C35866w.f93973a.mo56225c()).mo56382g(e)).mo56372aa(51911)).mo56386p("could not retrieve range setting values.");
            return C60856cj.m92900i(false);
        }
    }
}
