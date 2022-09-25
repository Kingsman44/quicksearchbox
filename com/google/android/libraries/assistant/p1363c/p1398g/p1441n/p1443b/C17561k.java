package com.google.android.libraries.assistant.p1363c.p1398g.p1441n.p1443b;

import com.google.android.libraries.assistant.p1363c.p1398g.p1405d.C17377g;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17487aw;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17495bd;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17496be;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59315ac;
import com.google.common.util.concurrent.C60845bz;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import com.google.protobuf.C63088z;
import java.io.File;
import java.io.IOException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.c.g.n.b.k */
/* compiled from: PG */
final class C17561k implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C17565o f50618a;

    public C17561k(C17565o oVar) {
        this.f50618a = oVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C17565o.f50627a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "TTS.OnDevice");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(42771)).mo56389s("Cancellation/Failure in synthesisStatusFuture for sessionToken %s", C17377g.m34655c(this.f50618a.f50630d));
        this.f50618a.f50633g.f155056f.mo54589f(false);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        if (((C17487aw) obj).f50493a == 1 && ((Optional) this.f50618a.f50631e.mo6453a()).isPresent()) {
            try {
                byte[] a = new C59315ac((File) ((Optional) this.f50618a.f50631e.mo6453a()).get()).mo56803a();
                C57987f fVar = this.f50618a.f50633g;
                C17495bd bdVar = (C17495bd) C17496be.f50505c.createBuilder();
                C63088z A = C63088z.m96139A(a);
                bdVar.copyOnWrite();
                C17496be beVar = (C17496be) bdVar.instance;
                beVar.f50507a = 1 | beVar.f50507a;
                beVar.f50508b = A;
                fVar.f155056f.mo54591h((C17496be) bdVar.build());
            } catch (IOException e) {
                C59104x c = C17565o.f50627a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "TTS.OnDevice");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(42772)).mo56389s("Failed to read audio bytes from file and send to channel for sessionToken %s", C17377g.m34655c(this.f50618a.f50630d));
            }
        }
        this.f50618a.f50633g.f155056f.mo54589f(false);
    }
}
