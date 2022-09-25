package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.endpoint;

import android.content.Context;
import com.google.android.gms.common.C143701ac;
import com.google.common.p4522b.C58759qy;
import com.google.frameworks.client.data.android.p4634b.C61383b;
import com.google.frameworks.client.data.android.server.C61560h;
import java.util.HashMap;
import p5488io.grpc.binder.C70229i;
import p5488io.grpc.binder.C70236p;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.endpoint.n */
/* compiled from: PG */
public final class C11743n {

    /* renamed from: a */
    public final C61560h f37811a;

    public C11743n(Context context, C61560h hVar) {
        this.f37811a = hVar;
        HashMap hashMap = new HashMap();
        hashMap.put("java.com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.proto.CarAssistantService", new C61383b(context.getPackageManager(), new C58759qy("com.google.android.projection.gearhead"), C143701ac.m233450a(context)));
        hVar.mo58122b(C70236p.m102388a(hashMap), new C70229i(true, C70229i.f187211a.f187213c));
    }
}
