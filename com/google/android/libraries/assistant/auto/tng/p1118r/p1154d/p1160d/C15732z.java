package com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1160d;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p797c.p798a.C12393a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p797c.p798a.p799a.C12395b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.d.d.z */
/* compiled from: PG */
public final /* synthetic */ class C15732z implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C15706an f46911a;

    /* renamed from: b */
    public final /* synthetic */ C12393a f46912b;

    public /* synthetic */ C15732z(C15706an anVar, C12393a aVar) {
        this.f46911a = anVar;
        this.f46912b = aVar;
    }

    public final C60870cx apply(Object obj) {
        C15706an anVar = this.f46911a;
        C12393a aVar = this.f46912b;
        C12395b bVar = (C12395b) obj;
        C70862aj ajVar = anVar.f46865n;
        if (ajVar != null) {
            C15708b bVar2 = new C15708b(bVar, ajVar, anVar.f46859h);
            ((C59052c) ((C59052c) C15706an.f46852a.mo56224b()).mo56372aa(46300)).mo56386p("#startPushAudioLoop");
            return C47633f.m84733g(aVar.mo20574d()).mo51516i(new C15730x(anVar, bVar2), anVar.f46859h);
        }
        throw new IllegalStateException("Request Stream Observer is null. Cannot stream audio.");
    }
}
