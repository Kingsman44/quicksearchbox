package com.google.android.libraries.assistant.pcp.p1555f.p1556a;

import com.google.android.libraries.assistant.pcp.p1570j.p1571a.C18797e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3803ag.p3809c.C49019dl;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.libraries.assistant.pcp.f.a.g */
/* compiled from: PG */
public final /* synthetic */ class C18684g implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C18700w f52721a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f52722b;

    /* renamed from: c */
    public final /* synthetic */ List f52723c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f52724d;

    public /* synthetic */ C18684g(C18700w wVar, C58485gu guVar, List list, C60870cx cxVar) {
        this.f52721a = wVar;
        this.f52722b = guVar;
        this.f52723c = list;
        this.f52724d = cxVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C18700w wVar = this.f52721a;
        C58485gu guVar = this.f52722b;
        List list = this.f52723c;
        C60870cx cxVar = this.f52724d;
        C58480gp e = C58485gu.m89837e();
        for (int i = 0; i < guVar.size(); i++) {
            try {
                e.mo55395g(((C18797e) C60856cj.m92909r((C60870cx) guVar.get(i))).mo24138a());
            } catch (ExecutionException unused) {
                String str = ((C49019dl) list.get(i)).f126796c;
            }
        }
        return C47638k.m84751b(cxVar).mo51520a(new C18680c(e.mo55394f()), wVar.f52764e);
    }
}
