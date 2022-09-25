package com.google.frameworks.client.data.android.server.tiktok;

import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.contrib.grpc.C47677b;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.frameworks.client.data.android.server.C61564l;
import dagger.p5294a.C68220f;
import java.util.Map;

/* renamed from: com.google.frameworks.client.data.android.server.tiktok.s */
/* compiled from: PG */
public final class C61604s implements C68220f {
    /* renamed from: a */
    public static C61564l m94388a(Map map, C47770dh dhVar) {
        C58490gz gzVar = new C58490gz(4);
        for (Map.Entry entry : ((C58495hd) map).entrySet()) {
            gzVar.mo55429h((String) entry.getKey(), new C47677b(dhVar, entry));
        }
        return new C61564l(gzVar.mo55427f(true));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
