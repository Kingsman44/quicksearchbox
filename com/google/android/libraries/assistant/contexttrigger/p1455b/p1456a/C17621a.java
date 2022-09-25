package com.google.android.libraries.assistant.contexttrigger.p1455b.p1456a;

import com.google.android.libraries.assistant.contexttrigger.C17810l;
import com.google.android.libraries.assistant.contexttrigger.p1457c.C17648l;
import com.google.android.libraries.assistant.contexttrigger.p1457c.C17651o;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62963cj;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C17621a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C17625e f50739a;

    public /* synthetic */ C17621a(C17625e eVar) {
        this.f50739a = eVar;
    }

    public final C60870cx apply(Object obj) {
        C17625e eVar = this.f50739a;
        ArrayList arrayList = new ArrayList();
        for (C17651o oVar : new C62963cj(((C17648l) obj).f50772a, C17648l.f50769b)) {
            if (eVar.f50743a.containsKey(oVar)) {
                arrayList.add(((C17810l) eVar.f50743a.get(oVar)).mo23422a());
            }
        }
        return C60856cj.m92896e(arrayList);
    }
}
