package com.google.android.apps.search.assistant.surfaces.voice.growth.p9628a.p9629a;

import com.google.android.apps.gsa.assistant.shared.d.l;
import com.google.assistant.p4008y.p4009a.C53593bz;
import com.google.assistant.p4008y.p4009a.C53606o;
import com.google.assistant.p4008y.p4009a.C53615x;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.a.a.d */
/* compiled from: PG */
public final /* synthetic */ class C127688d implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C127688d f351547a = new C127688d();

    private /* synthetic */ C127688d() {
    }

    public final Object apply(Object obj) {
        C58480gp e = C58485gu.m89837e();
        C53606o oVar = ((l) obj).c;
        if (oVar == null) {
            oVar = C53606o.f140698f;
        }
        C53615x xVar = oVar.f140701b;
        if (xVar == null) {
            xVar = C53615x.f140722d;
        }
        for (C53593bz bzVar : xVar.f140724a) {
            if (!bzVar.f140661b.isEmpty()) {
                e.mo55395g(bzVar);
            }
        }
        return new C127677a(Locale.forLanguageTag(oVar.f140704e), e.mo55394f());
    }
}
