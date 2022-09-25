package com.google.android.libraries.assistant.pcp.p1554e;

import com.google.assistant.p3803ag.p3809c.C49099gk;
import com.google.assistant.p3803ag.p3809c.C49144n;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58528ij;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.assistant.pcp.e.ab */
/* compiled from: PG */
public final /* synthetic */ class C18632ab implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C18650at f52656a;

    /* renamed from: b */
    public final /* synthetic */ C53306j f52657b;

    public /* synthetic */ C18632ab(C18650at atVar, C53306j jVar) {
        this.f52656a = atVar;
        this.f52657b = jVar;
    }

    public final Object apply(Object obj) {
        C18650at atVar = this.f52656a;
        C53306j jVar = this.f52657b;
        C49099gk gkVar = (C49099gk) obj;
        C58528ij ijVar = atVar.f52679c;
        C49144n nVar = (C49144n) Collection.EL.stream(gkVar.f126986b).filter(new C18659j(jVar)).findFirst().orElseThrow(new C18660k(jVar));
        Set set = (Set) Collection.EL.stream(nVar.f127088b).map(C18654e.f52685a).map(C18663n.f52695a).collect(Collectors.toCollection(C18673x.f52706a));
        Collection.EL.stream(nVar.f127090d).filter(new C18633ac(ijVar)).forEach(new C18640aj(set));
        return C18650at.m36107c(gkVar, ijVar, C58528ij.m90006F(set));
    }
}
