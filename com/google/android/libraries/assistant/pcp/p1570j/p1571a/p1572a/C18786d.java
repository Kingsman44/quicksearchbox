package com.google.android.libraries.assistant.pcp.p1570j.p1571a.p1572a;

import com.google.android.libraries.assistant.pcp.C18781j;
import com.google.android.libraries.assistant.pcp.p1544c.C18553a;
import com.google.android.libraries.assistant.pcp.p1544c.p1545a.C18571r;
import com.google.android.libraries.assistant.pcp.p1578m.C18984n;
import com.google.android.libraries.assistant.pcp.p1578m.C18985o;
import com.google.android.libraries.assistant.pcp.p1583o.C19041r;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.j.a.a.d */
/* compiled from: PG */
public final /* synthetic */ class C18786d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C18793k f52910a;

    /* renamed from: b */
    public final /* synthetic */ C18792j f52911b;

    /* renamed from: c */
    public final /* synthetic */ Optional f52912c;

    public /* synthetic */ C18786d(C18793k kVar, C18792j jVar, Optional optional) {
        this.f52910a = kVar;
        this.f52911b = jVar;
        this.f52912c = optional;
    }

    public final C60870cx apply(Object obj) {
        C18781j jVar;
        C18793k kVar = this.f52910a;
        C18792j jVar2 = this.f52911b;
        Optional optional = this.f52912c;
        C58800sl lA = ((C58528ij) obj).iterator();
        while (lA.hasNext()) {
            C53306j jVar3 = (C53306j) lA.next();
            if (!optional.equals(Optional.m71637of(jVar3))) {
                if (!jVar2.mo24129c().mo54902c(jVar3).isEmpty() && (jVar = (C18781j) ((Map) ((C18571r) kVar.f52923a).f52588a.mo27525b()).get(jVar3)) != null) {
                    jVar.mo24118a();
                }
                C58485gu d = C19041r.m36461d(jVar2.mo24127a(), jVar3, jVar2.mo24128b());
                if (!d.isEmpty()) {
                    C18553a aVar = kVar.f52923a;
                    C18984n nVar = (C18984n) C18985o.f53347b.createBuilder();
                    nVar.mo24234a(d);
                    C18985o oVar = (C18985o) nVar.build();
                    C18781j jVar4 = (C18781j) ((Map) ((C18571r) aVar).f52588a.mo27525b()).get(jVar3);
                    if (jVar4 != null) {
                        jVar4.mo24119b();
                    }
                }
            }
        }
        return C60866ct.f164955a;
    }
}
