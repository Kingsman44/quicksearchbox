package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8249d;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88092ow;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88093ox;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.d.e */
/* compiled from: PG */
public final /* synthetic */ class C106754e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C106756g f297488a;

    /* renamed from: b */
    public final /* synthetic */ View f297489b;

    /* renamed from: c */
    public final /* synthetic */ C52560wg f297490c;

    public /* synthetic */ C106754e(C106756g gVar, View view, C52560wg wgVar) {
        this.f297488a = gVar;
        this.f297489b = view;
        this.f297490c = wgVar;
    }

    public final void onClick(View view) {
        C51016dg dgVar;
        C106756g gVar = this.f297488a;
        View view2 = this.f297489b;
        C52560wg wgVar = this.f297490c;
        gVar.f297501i.mo86710o(view2);
        C88093ox oxVar = (C88093ox) C88094oy.f238174g.createBuilder();
        if (wgVar.f137946b == 16) {
            dgVar = (C51016dg) wgVar.f137947c;
        } else {
            dgVar = C51016dg.f132827g;
        }
        C51805du duVar = dgVar.f132833e;
        if (duVar == null) {
            duVar = C51805du.f135924e;
        }
        C63088z byteString = duVar.toByteString();
        oxVar.copyOnWrite();
        C88094oy oyVar = (C88094oy) oxVar.instance;
        byteString.getClass();
        oyVar.f238176a |= 1;
        oyVar.f238177b = byteString;
        Query X = gVar.f297495c.mo84244G(true).mo84302an("android.opa.extra.MINI_PLATE_ENABLED", false).mo84264aA("and.opa.cham", new Bundle()).mo84286aW(QueryTriggerType.OPA_MORRIS_GENERIC).mo84260X(true);
        C88489j jVar = new C88489j(C87739bu.OPA_CLIENT_INPUT);
        jVar.mo82014b(C88092ow.f238173a, (C88094oy) oxVar.build());
        jVar.mo82015c(X);
        gVar.f297494b.mo96219b(jVar.mo82013a());
    }
}
