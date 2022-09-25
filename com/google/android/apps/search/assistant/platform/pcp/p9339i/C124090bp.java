package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import com.google.android.apps.search.assistant.platform.pcp.validity.C124152a;
import com.google.android.apps.search.assistant.platform.pcp.validity.C124167p;
import com.google.assistant.p3803ag.p3807b.p3808a.C48904f;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.bp */
/* compiled from: PG */
public final /* synthetic */ class C124090bp implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124091bq f342728a;

    /* renamed from: b */
    public final /* synthetic */ Optional f342729b;

    /* renamed from: c */
    public final /* synthetic */ String f342730c;

    /* renamed from: d */
    public final /* synthetic */ int f342731d;

    /* renamed from: e */
    public final /* synthetic */ C53306j f342732e;

    public /* synthetic */ C124090bp(C124091bq bqVar, Optional optional, String str, int i, C53306j jVar) {
        this.f342728a = bqVar;
        this.f342729b = optional;
        this.f342730c = str;
        this.f342731d = i;
        this.f342732e = jVar;
    }

    public final C60870cx apply(Object obj) {
        C124091bq bqVar = this.f342728a;
        Optional optional = this.f342729b;
        String str = this.f342730c;
        int i = this.f342731d;
        C53306j jVar = this.f342732e;
        Optional optional2 = (Optional) obj;
        if (optional2.isPresent()) {
            ((C58970a) ((C58970a) bqVar.f342736d.mo56224b()).mo56372aa(35403)).mo56386p("Triggering condition exists");
            C124152a aVar = new C124152a(optional, str, C124089bo.m203513a(Integer.valueOf(i)).intValue(), jVar.f139793X, (C48952az) optional2.get(), true, C48904f.f126552a);
            ((C58970a) ((C58970a) bqVar.f342736d.mo56224b()).mo56372aa(35404)).mo56361N("ValidityEntity includes: accountId exists: %s, dataId: %s, dataType: %s, clientType: %s, triggerCondition: %s", Boolean.valueOf(aVar.f342849a.isPresent()), aVar.f342850b, Integer.valueOf(aVar.f342851c), Integer.valueOf(aVar.f342852d), aVar.f342853e);
            if (bqVar.f342734b.isPresent()) {
                C58480gp e = C58485gu.m89837e();
                e.mo55395g(aVar);
                return ((C124167p) bqVar.f342734b.get()).mo106310d(e.mo55394f());
            }
        } else {
            ((C58970a) ((C58970a) bqVar.f342736d.mo56226d()).mo56372aa(35401)).mo56386p("Triggering condition does not exist");
        }
        ((C58970a) ((C58970a) bqVar.f342736d.mo56224b()).mo56372aa(35402)).mo56359L("#handleDismissalSignal input: ClientType: %s, proactiveDataType: %s, dataId: %s", jVar, Integer.valueOf(i), str);
        return C60866ct.f164955a;
    }
}
