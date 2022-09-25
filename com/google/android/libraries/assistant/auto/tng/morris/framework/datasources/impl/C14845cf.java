package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.content.ComponentName;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14782b;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.assistant.p3745ab.C48258bo;
import com.google.assistant.p3745ab.C48260bq;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.C59710cy;
import com.google.common.p4552o.C59711cz;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62940bt;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.cf */
/* compiled from: PG */
public final /* synthetic */ class C14845cf implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C14856cq f44702a;

    public /* synthetic */ C14845cf(C14856cq cqVar) {
        this.f44702a = cqVar;
    }

    public final Object call() {
        C14856cq cqVar = this.f44702a;
        cqVar.f44719e.mo19974a(C37182a.f97782aN);
        ArrayList arrayList = new ArrayList();
        for (ComponentName componentName : cqVar.f44718d.mo22269a()) {
            arrayList.add(cqVar.mo21776f(componentName.getPackageName(), componentName.getClassName()));
        }
        cqVar.f44724j = C58485gu.m89842j(arrayList);
        C37215b bVar = cqVar.f44719e;
        C37259h d = C37182a.f97783aO.mo40806d();
        int size = cqVar.f44724j.size();
        C62722b bVar2 = C62722b.OK;
        C62940bt btVar = C59711cz.f160208s;
        C59710cy cyVar = (C59710cy) C59711cz.f160207r.createBuilder();
        C48258bo boVar = (C48258bo) C48260bq.f124825o.createBuilder();
        boVar.copyOnWrite();
        C48260bq bqVar = (C48260bq) boVar.instance;
        bqVar.f124827a |= 16;
        bqVar.f124832f = size;
        cyVar.copyOnWrite();
        C59711cz czVar = (C59711cz) cyVar.instance;
        C48260bq bqVar2 = (C48260bq) boVar.build();
        bqVar2.getClass();
        czVar.f160214e = bqVar2;
        czVar.f160210a |= 32;
        ((C37253b) d.f99012a).mo40792p(btVar, (C59711cz) cyVar.build());
        bVar.mo19974a(d.mo40781e(bVar2));
        return C14782b.SUCCESS;
    }
}
