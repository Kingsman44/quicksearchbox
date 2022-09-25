package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewStub;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106734a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106740b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid.view.MeasuringViewSwitcher;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid.h */
/* compiled from: PG */
public final /* synthetic */ class C106783h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C106791p f297569a;

    /* renamed from: b */
    public final /* synthetic */ Context f297570b;

    public /* synthetic */ C106783h(C106791p pVar, Context context) {
        this.f297569a = pVar;
        this.f297570b = context;
    }

    public final C60870cx apply(Object obj) {
        C106791p pVar = this.f297569a;
        Context context = this.f297570b;
        C58485gu guVar = (C58485gu) obj;
        ((C58970a) ((C58970a) pVar.f297585a.mo56224b()).mo56372aa(23198)).mo56387q("processing %d childrenderers", guVar.size());
        ArrayList arrayList = new ArrayList();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C106740b bVar = (C106740b) guVar.get(i);
            ArrayList arrayList2 = new ArrayList(bVar.mo95632a());
            Collections.sort(arrayList2);
            ViewStub viewStub = new ViewStub(context);
            C106791p.m177536e(viewStub, (C106734a) C58557jl.m90130k(arrayList2, C106734a.MINI));
            pVar.mo95653d(viewStub);
            pVar.f297587c.addView(viewStub);
            if (arrayList2.size() != 2) {
                C106734a aVar = arrayList2.isEmpty() ? C106734a.MINI : (C106734a) arrayList2.get(0);
                Class<RuntimeException> cls = RuntimeException.class;
                C60856cj.m92911t(C60922j.m93044g(C60846c.m92878g(bVar.mo95633b(), cls, C47810es.m84963c(new C106777b(pVar, bVar)), pVar.f297586b), C47810es.m84963c(new C106778c(aVar)), pVar.f297586b), C47810es.m84974n(new C106790o(pVar, viewStub)), pVar.f297586b);
            } else {
                List list = (List) Collection.EL.stream(arrayList2).map(new C106786k(pVar, bVar)).collect(Collectors.toList());
                C60856cj.m92911t(C47638k.m84750a(list).mo51520a(new C106787l(pVar, list, (MeasuringViewSwitcher) LayoutInflater.from(context).inflate(R.layout.aa_measuring_view_switcher, pVar.f297587c, false)), pVar.f297586b), C47810es.m84974n(new C106789n(pVar, viewStub)), pVar.f297586b);
            }
        }
        arrayList.size();
        return C60856cj.m92900i(pVar.f297587c);
    }
}
