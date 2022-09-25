package com.google.android.apps.search.assistant.surfaces.voice.growth.p9628a.p9629a;

import com.google.android.apps.gsa.assistant.shared.d.l;
import com.google.assistant.p4008y.p4009a.C53591bx;
import com.google.assistant.p4008y.p4009a.C53606o;
import com.google.assistant.p4008y.p4009a.C53615x;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C127687c implements C58817ah {
    public final Object apply(Object obj) {
        C53606o oVar = ((l) obj).c;
        if (oVar == null) {
            oVar = C53606o.f140698f;
        }
        C53615x xVar = oVar.f140701b;
        if (xVar == null) {
            xVar = C53615x.f140722d;
        }
        Collection m = C58485gu.m89845m();
        if (Collections.unmodifiableMap(xVar.f140726c).containsKey("LOCKSCREEN") && Collections.unmodifiableMap(xVar.f140726c).get("LOCKSCREEN") != null) {
            m = ((C53591bx) Collections.unmodifiableMap(xVar.f140726c).get("LOCKSCREEN")).f140656a;
        }
        return new C127677a(Locale.forLanguageTag(oVar.f140704e), C58485gu.m89842j(m));
    }
}
