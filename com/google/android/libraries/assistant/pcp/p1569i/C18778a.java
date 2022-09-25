package com.google.android.libraries.assistant.pcp.p1569i;

import com.google.android.libraries.assistant.pcp.p1546d.C18575c;
import com.google.android.libraries.assistant.pcp.p1555f.C18677a;
import com.google.android.libraries.assistant.pcp.p1578m.C18989s;
import com.google.android.libraries.assistant.pcp.p1578m.C18991u;
import com.google.android.libraries.assistant.pcp.p1578m.C18995y;
import com.google.assistant.p3803ag.p3809c.C49019dl;
import com.google.assistant.p3803ag.p3809c.C49116ha;
import com.google.assistant.p3803ag.p3809c.C49118hc;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;
import p3186j$.util.StringJoiner;

/* renamed from: com.google.android.libraries.assistant.pcp.i.a */
/* compiled from: PG */
public final /* synthetic */ class C18778a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C18779b f52892a;

    /* renamed from: b */
    public final /* synthetic */ C18991u f52893b;

    public /* synthetic */ C18778a(C18779b bVar, C18991u uVar) {
        this.f52892a = bVar;
        this.f52893b = uVar;
    }

    public final C60870cx apply(Object obj) {
        C18779b bVar = this.f52892a;
        C18991u uVar = this.f52893b;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            C49019dl dlVar = ((C18995y) optional.get()).f53369b;
            if (dlVar == null) {
                dlVar = C49019dl.f126792f;
            }
            C49116ha haVar = dlVar.f126797d;
            if (haVar == null) {
                haVar = C49116ha.f127027d;
            }
            if (haVar.f127030b == null) {
                C49118hc hcVar = C49118hc.f127034a;
            }
            C18677a aVar = bVar.f52895b;
            if (uVar.f53362a == null) {
                C18989s sVar = C18989s.f53353f;
            }
            return aVar.mo24102b();
        }
        C59104x c = C18779b.f52894a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "PCP.v2CtfListener");
        C59052c cVar = (C59052c) ((C59052c) c).mo56372aa(47351);
        C18989s sVar2 = uVar.f53362a;
        if (sVar2 == null) {
            sVar2 = C18989s.f53353f;
        }
        StringJoiner add = new StringJoiner(";").add(new C18575c(sVar2.f53356b).mo24074d()).add(sVar2.f53357c);
        C53306j a = C53306j.m86809a(sVar2.f53358d);
        if (a == null) {
            a = C53306j.UNKNOWNN;
        }
        cVar.mo56389s("Failed to obtain stored element for: %s", add.add(a.name()).add(sVar2.f53359e).toString());
        return C60866ct.f164955a;
    }
}
