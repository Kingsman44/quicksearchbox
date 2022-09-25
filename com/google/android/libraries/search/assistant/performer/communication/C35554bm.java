package com.google.android.libraries.search.assistant.performer.communication;

import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52370pf;
import com.google.assistant.p3897e.p3921j.C52378pn;
import com.google.assistant.p3897e.p3921j.C52621yn;
import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.assistant.p3897e.p3921j.ade;
import com.google.assistant.p3897e.p3921j.adm;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.bm */
/* compiled from: PG */
public final /* synthetic */ class C35554bm implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C35556bo f93361a;

    /* renamed from: b */
    public final /* synthetic */ C52370pf f93362b;

    public /* synthetic */ C35554bm(C35556bo boVar, C52370pf pfVar) {
        this.f93361a = boVar;
        this.f93362b = pfVar;
    }

    public final C60870cx apply(Object obj) {
        Optional optional;
        C35556bo boVar = this.f93361a;
        C52370pf pfVar = this.f93362b;
        if (!((Boolean) obj).booleanValue()) {
            boVar.f93367d.mo19974a(C37176a.f97089ev.mo40805c(C62722b.PERMISSION_DENIED));
            return C60856cj.m92900i(C36180b.m64579c(C52235kf.PERMISSION_DENIED, "READ_CONTACTS permission is not granted"));
        }
        ((C59052c) ((C59052c) C35556bo.f93364a.mo56224b()).mo56372aa(51638)).mo56386p("Start contact lookup.");
        ArrayList arrayList = new ArrayList();
        C52378pn pnVar = pfVar.f137427a;
        if (pnVar == null) {
            pnVar = C52378pn.f137444j;
        }
        if ((pnVar.f137446a & 2) != 0) {
            C52378pn pnVar2 = pfVar.f137427a;
            if (pnVar2 == null) {
                pnVar2 = C52378pn.f137444j;
            }
            arrayList.add(pnVar2.f137450e);
        }
        C52378pn pnVar3 = pfVar.f137427a;
        if (pnVar3 == null) {
            pnVar3 = C52378pn.f137444j;
        }
        ade ade = pnVar3.f137449d;
        if (ade == null) {
            ade = ade.f134877h;
        }
        if ((ade.f134879a & 8) != 0) {
            C52378pn pnVar4 = pfVar.f137427a;
            if (pnVar4 == null) {
                pnVar4 = C52378pn.f137444j;
            }
            ade ade2 = pnVar4.f137449d;
            if (ade2 == null) {
                ade2 = ade.f134877h;
            }
            arrayList.add(ade2.f134883e);
        }
        C52378pn pnVar5 = pfVar.f137427a;
        if (pnVar5 == null) {
            pnVar5 = C52378pn.f137444j;
        }
        ade ade3 = pnVar5.f137449d;
        if (ade3 == null) {
            ade3 = ade.f134877h;
        }
        for (adm adm : ade3.f134885g) {
            C52623yp ypVar = adm.f134892b;
            if (ypVar == null) {
                ypVar = C52623yp.f138162g;
            }
            if (!ypVar.f138166c.isEmpty()) {
                C52623yp ypVar2 = adm.f134892b;
                if (ypVar2 == null) {
                    ypVar2 = C52623yp.f138162g;
                }
                arrayList.add(((C52621yn) ypVar2.f138166c.get(0)).f138158c);
            }
        }
        C52378pn pnVar6 = pfVar.f137427a;
        if (pnVar6 == null) {
            pnVar6 = C52378pn.f137444j;
        }
        ade ade4 = pnVar6.f137449d;
        if (ade4 == null) {
            ade4 = ade.f134877h;
        }
        arrayList.addAll(ade4.f134884f);
        List arrayList2 = new ArrayList();
        C52378pn pnVar7 = pfVar.f137427a;
        if (((pnVar7 == null ? C52378pn.f137444j : pnVar7).f137446a & 16) != 0) {
            if (pnVar7 == null) {
                pnVar7 = C52378pn.f137444j;
            }
            C51098gh ghVar = pnVar7.f137451f;
            if (ghVar == null) {
                ghVar = C51098gh.f133009e;
            }
            arrayList2.add(ghVar);
        } else {
            arrayList2 = pfVar.f137428b;
        }
        C58485gu guVar = (C58485gu) Collection.EL.stream(arrayList2).filter(C35552bk.f93359a).map(C35553bl.f93360a).collect(C58370cn.f155946a);
        C35558bq bqVar = boVar.f93365b;
        C52378pn pnVar8 = pfVar.f137427a;
        if (((pnVar8 == null ? C52378pn.f137444j : pnVar8).f137446a & 32) != 0) {
            if (pnVar8 == null) {
                pnVar8 = C52378pn.f137444j;
            }
            optional = Optional.m71637of(pnVar8.f137452g);
        } else {
            optional = Optional.empty();
        }
        return C60922j.m93044g(bqVar.mo39702a(arrayList, guVar, optional), C47810es.m84963c(new C35551bj(boVar, pfVar)), boVar.f93366c);
    }
}
