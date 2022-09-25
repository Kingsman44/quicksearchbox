package com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1252d;

import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11671ab;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11675af;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16091aq;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.h.d.e */
/* compiled from: PG */
public final /* synthetic */ class C16252e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C16267t f47863a;

    /* renamed from: b */
    public final /* synthetic */ C16091aq f47864b;

    /* renamed from: c */
    public final /* synthetic */ C11675af f47865c;

    public /* synthetic */ C16252e(C16267t tVar, C16091aq aqVar, C11675af afVar) {
        this.f47863a = tVar;
        this.f47864b = aqVar;
        this.f47865c = afVar;
    }

    public final C60870cx apply(Object obj) {
        C16267t tVar = this.f47863a;
        C16091aq aqVar = this.f47864b;
        C11675af afVar = this.f47865c;
        List list = (List) obj;
        if (list.isEmpty()) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        Map map = tVar.f47900m;
        C16090ap g = aqVar.mo22733g();
        C11671ab abVar = afVar.f37667b;
        if (abVar == null) {
            abVar = C11671ab.f37655d;
        }
        map.put(g, abVar.f37658b);
        return tVar.f47892e.mo22660q(list, aqVar);
    }
}
