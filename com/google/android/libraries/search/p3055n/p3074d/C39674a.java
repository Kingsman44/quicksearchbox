package com.google.android.libraries.search.p3055n.p3074d;

import com.google.common.base.C58872ci;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Callable;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.n.d.a */
/* compiled from: PG */
public final /* synthetic */ class C39674a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C39675b f104432a;

    public /* synthetic */ C39674a(C39675b bVar) {
        this.f104432a = bVar;
    }

    public final Object call() {
        C39675b bVar = this.f104432a;
        C58872ci ciVar = bVar.f104435c;
        if (ciVar.f156708a) {
            ciVar.mo56162g();
            ciVar.mo56160e();
        }
        C58872ci ciVar2 = bVar.f104435c;
        ciVar2.mo56161f();
        bVar.f104434b = Duration.ofNanos(ciVar2.mo56159b());
        C59104x b = C39675b.f104433a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "NearMissLogger");
        ((C59052c) ((C59052c) b).mo56372aa(53794)).mo56389s("This is hotwordRejectionEventTimestamp: %s", bVar.f104434b);
        return null;
    }
}
