package com.google.android.libraries.assistant.contexttrigger.p1462f;

import com.google.assistant.p3803ag.p3807b.p3808a.C48915q;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.f.y */
/* compiled from: PG */
public final /* synthetic */ class C17735y implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C17695aa f50957a;

    public /* synthetic */ C17735y(C17695aa aaVar) {
        this.f50957a = aaVar;
    }

    public final C60870cx apply(Object obj) {
        C17695aa aaVar = this.f50957a;
        C58485gu guVar = (C58485gu) obj;
        C58480gp e = C58485gu.m89837e();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            e.mo55395g(aaVar.f50878d.mo23452a((C48915q) guVar.get(i), false));
        }
        return C60856cj.m92896e(e.mo55394f());
    }
}
