package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c;

import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13543s;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p976c.C13488g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61886aw;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.c.g */
/* compiled from: PG */
public final /* synthetic */ class C13492g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C13496k f41390a;

    /* renamed from: b */
    public final /* synthetic */ C13543s f41391b;

    public /* synthetic */ C13492g(C13496k kVar, C13543s sVar) {
        this.f41390a = kVar;
        this.f41391b = sVar;
    }

    public final C60870cx apply(Object obj) {
        C13496k kVar = this.f41390a;
        C13543s sVar = this.f41391b;
        C13495j jVar = (C13495j) obj;
        if (jVar.mo21107d() != 3) {
            return C60856cj.m92900i(jVar);
        }
        try {
            C61886aw c = ((TextClassifierLib) jVar.mo21106c().mo56107c()).mo58302c(C13488g.m29746c(sVar));
            if (c.mo58327c()) {
                C59104x c2 = C13496k.f41395a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "TcLibSmartActionGen");
                ((C59052c) ((C59052c) c2).mo56372aa(44824)).mo56386p("Aborted smart action generation on sensitive message.");
                return C60856cj.m92900i(C13496k.m29755b(kVar.f41397c, 5));
            }
            C13494i e = C13495j.m29750e();
            C58836b bVar = C58836b.f156633a;
            C13462a aVar = (C13462a) e;
            aVar.f41314a = bVar;
            aVar.f41317d = 3;
            aVar.f41315b = bVar;
            aVar.f41316c = C58833ax.m90834k(c);
            return C60856cj.m92900i(e.mo21100a());
        } catch (IllegalArgumentException e2) {
            C59104x c3 = C13496k.f41395a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "TcLibSmartActionGen");
            ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e2)).mo56372aa(44825)).mo56386p("Failed to convert request.");
            return C60856cj.m92900i(C13496k.m29755b(kVar.f41397c, 6));
        }
    }
}
