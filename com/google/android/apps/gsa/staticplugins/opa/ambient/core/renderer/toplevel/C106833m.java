package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3886c.C50701am;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel.m */
/* compiled from: PG */
public final /* synthetic */ class C106833m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ TopLevelRendererHelper f297706a;

    /* renamed from: b */
    public final /* synthetic */ C50701am f297707b;

    public /* synthetic */ C106833m(TopLevelRendererHelper topLevelRendererHelper, C50701am amVar) {
        this.f297706a = topLevelRendererHelper;
        this.f297707b = amVar;
    }

    public final C60870cx apply(Object obj) {
        TopLevelRendererHelper topLevelRendererHelper = this.f297706a;
        C50701am amVar = this.f297707b;
        C58485gu guVar = (C58485gu) Collection.EL.stream((List) obj).filter(new C106823c(amVar)).collect(C58370cn.f155946a);
        ((C58970a) ((C58970a) topLevelRendererHelper.f297684a.mo56224b()).mo56372aa(23319)).mo56395y("found %d filtered chips for chiptype %s", guVar.size(), amVar.name());
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(guVar).flatMap(C106824d.f297695a).map(new C106825e(topLevelRendererHelper)).collect(C58370cn.f155946a);
        return C47638k.m84750a((Iterable) Collection.EL.stream(guVar2).map(C106826f.f297697a).collect(Collectors.toList())).mo51520a(new C106827g(topLevelRendererHelper, guVar2), topLevelRendererHelper.f297686c);
    }
}
