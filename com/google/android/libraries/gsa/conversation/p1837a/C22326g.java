package com.google.android.libraries.gsa.conversation.p1837a;

import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.io.IOException;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.gsa.conversation.a.g */
/* compiled from: PG */
final class C22326g {

    /* renamed from: a */
    public final C22334o f61648a;

    /* renamed from: b */
    public final C22327h f61649b;

    /* renamed from: c */
    public C60870cx f61650c;

    /* renamed from: d */
    private C60870cx f61651d;

    public C22326g(C22334o oVar, C22327h hVar) {
        this.f61648a = oVar;
        this.f61649b = hVar;
    }

    /* renamed from: a */
    public final C60870cx mo27552a(C58833ax axVar) {
        C60870cx cxVar = this.f61651d;
        if (cxVar != null) {
            return cxVar;
        }
        if (!axVar.mo56113h() || (axVar.mo56107c() instanceof CancellationException)) {
            C58976aa aaVar = C58975e.f156826a;
            this.f61648a.mo27546a();
            this.f61649b.mo27553a();
        } else {
            C59104x c = C22329j.f61652a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "CclAudioManager");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Throwable) axVar.mo56107c())).mo56372aa(48233)).mo56389s("Audio %s request execution failed", this.f61648a.mo27546a());
            this.f61649b.mo27555c((Throwable) axVar.mo56107c());
        }
        try {
            this.f61651d = this.f61648a.mo27548c();
        } catch (IOException | RuntimeException e) {
            this.f61651d = C60856cj.m92899h(e);
        }
        return this.f61651d;
    }
}
