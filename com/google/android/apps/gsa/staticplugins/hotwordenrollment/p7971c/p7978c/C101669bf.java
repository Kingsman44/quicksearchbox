package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c;

import android.view.View;
import com.google.android.apps.gsa.assistant.settings.features.av.ar;
import com.google.android.apps.gsa.assistant.settings.features.av.bz;
import com.google.android.apps.gsa.assistant.settings.features.av.cj;
import com.google.android.apps.gsa.assistant.settings.features.av.dn;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101783w;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.assistant.p3861at.acx;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bf */
/* compiled from: PG */
public final /* synthetic */ class C101669bf implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C101671bh f283689a;

    public /* synthetic */ C101669bf(C101671bh bhVar) {
        this.f283689a = bhVar;
    }

    public final void onClick(View view) {
        C101671bh bhVar = this.f283689a;
        dn dnVar = bhVar.f283694d;
        String str = bhVar.f283692b;
        ar a = bhVar.mo92479a();
        dnVar.l(str);
        C58485gu n = C58485gu.m89846n(str);
        List list = (List) Collection.EL.stream(dnVar.c.f129690a).filter(new cj(str)).map(bz.a).collect(Collectors.toList());
        acx e = dn.e(new acx[]{dnVar.c(list, true), dnVar.A(n, 4)});
        dnVar.G(n, 4);
        dnVar.n(list, true);
        dnVar.h(e, a);
        C47393f.m84236g(new C101783w(), bhVar.f283691a);
    }
}
