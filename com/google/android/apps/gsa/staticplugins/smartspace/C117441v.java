package com.google.android.apps.gsa.staticplugins.smartspace;

import com.google.android.apps.gsa.opa.smartspace.C83738aj;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.smartspace.C92035ae;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123624c;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124086bm;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124114cm;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3994s.p3995a.C53245gt;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.v */
/* compiled from: PG */
public final /* synthetic */ class C117441v implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C117350ai f325976a;

    /* renamed from: b */
    public final /* synthetic */ C92035ae f325977b;

    public /* synthetic */ C117441v(C117350ai aiVar, C92035ae aeVar) {
        this.f325976a = aiVar;
        this.f325977b = aeVar;
    }

    public final C60870cx apply(Object obj) {
        C53245gt gtVar;
        C117350ai aiVar = this.f325976a;
        C92035ae aeVar = this.f325977b;
        AccountId accountId = (AccountId) obj;
        ArrayList arrayList = new ArrayList();
        C58480gp e = C58485gu.m89837e();
        C58485gu b = C124086bm.m203508a(aiVar.f325755c, accountId).mo106279b(1);
        if (aiVar.f325758h.mo79746e(C90017bw.f247871M)) {
            C124114cm a = C124114cm.m203535a(aiVar.f325755c, accountId);
            C83738aj ajVar = aiVar.mo103270i(aeVar).f228233b;
            if (ajVar == null) {
                ajVar = C83738aj.f228226c;
            }
            if (ajVar.f228228a == 3) {
                gtVar = (C53245gt) ajVar.f228229b;
            } else {
                gtVar = C53245gt.f139564n;
            }
            arrayList.add(a.mo106291b(gtVar, aeVar.mo86688a(), e));
        } else {
            arrayList.add(C123624c.m202992a(aiVar.f325755c, accountId).f341550b.mo45938b(new C117343ab(aiVar, aeVar, aiVar.f325756f.mo26870b(), accountId, e)));
        }
        return C47638k.m84752c(arrayList).mo51521b(new C117344ac(aiVar, e, b), C60826bg.f164896a);
    }
}
