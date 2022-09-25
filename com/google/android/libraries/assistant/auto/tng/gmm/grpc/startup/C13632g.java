package com.google.android.libraries.assistant.auto.tng.gmm.grpc.startup;

import android.content.Context;
import com.google.android.gms.common.C143701ac;
import com.google.android.libraries.assistant.auto.tng.gmm.p996d.C13587a;
import com.google.common.p4522b.C58528ij;
import com.google.frameworks.client.data.android.p4634b.C61383b;
import com.google.frameworks.client.data.android.server.C61560h;
import java.util.HashMap;
import p5488io.grpc.binder.C70229i;
import p5488io.grpc.binder.C70236p;

/* renamed from: com.google.android.libraries.assistant.auto.tng.gmm.grpc.startup.g */
/* compiled from: PG */
public final class C13632g {

    /* renamed from: b */
    private static final C58528ij f41669b = C58528ij.m90006F(C13587a.f41597a);

    /* renamed from: a */
    public final C61560h f41670a;

    public C13632g(Context context, C61560h hVar) {
        this.f41670a = hVar;
        HashMap hashMap = new HashMap();
        hashMap.put("java.com.google.android.libraries.assistant.gmm.grpc.gmmstartup.proto.AssistantStateService", new C61383b(context.getPackageManager(), f41669b, C143701ac.m233450a(context)));
        hVar.mo58122b(C70236p.m102388a(hashMap), C70229i.f187211a);
    }
}
