package com.google.android.libraries.assistant.auto.tng.gmm.p990b.p991a;

import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58872ci;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.MessageLite;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.auto.tng.gmm.b.a.b */
/* compiled from: PG */
public final /* synthetic */ class C13577b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58872ci f41574a;

    public /* synthetic */ C13577b(C58872ci ciVar) {
        this.f41574a = ciVar;
    }

    public final Object apply(Object obj) {
        long millis = Duration.ofNanos(this.f41574a.mo56159b()).toMillis();
        C59104x b = C13580e.f41580a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GmmOffroadExecutor");
        ((C59052c) ((C59052c) b).mo56372aa(45146)).mo56388r("Offroad search took ms: %d", millis);
        return C58833ax.m90833j((MessageLite) obj);
    }
}
