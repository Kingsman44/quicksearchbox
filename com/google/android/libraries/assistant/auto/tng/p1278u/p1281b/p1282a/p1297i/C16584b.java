package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1297i;

import com.google.android.libraries.assistant.auto.tng.common.p909f.p913b.p915b.C13263c;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.i.b */
/* compiled from: PG */
public final /* synthetic */ class C16584b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C15481g f48629a;

    public /* synthetic */ C16584b(C15481g gVar) {
        this.f48629a = gVar;
    }

    public final Object apply(Object obj) {
        C15481g gVar = this.f48629a;
        C58495hd hdVar = (C58495hd) obj;
        ArrayList arrayList = new ArrayList();
        C16587e.m33635a(arrayList, "logtop-aggregate", (C58485gu) hdVar.getOrDefault(C13263c.TYPE_AGGREGATE, C58485gu.m89845m()), gVar, C37179a.f97499bR.mo40779c());
        C16587e.m33635a(arrayList, "logtop-call", (C58485gu) hdVar.getOrDefault(C13263c.TYPE_CALL, C58485gu.m89845m()), gVar, C37179a.f97500bS.mo40779c());
        C16587e.m33635a(arrayList, "logtop-text", (C58485gu) hdVar.getOrDefault(C13263c.TYPE_TEXT, C58485gu.m89845m()), gVar, C37179a.f97501bT.mo40779c());
        if (arrayList.isEmpty()) {
            gVar.mo22352b(C37179a.f97502bU.mo40805c(C62722b.NOT_FOUND));
        } else {
            gVar.mo22352b(C37179a.f97502bU.mo40805c(C62722b.OK));
        }
        return arrayList;
    }
}
