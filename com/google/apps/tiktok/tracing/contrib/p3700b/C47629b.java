package com.google.apps.tiktok.tracing.contrib.p3700b;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120511h;
import com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9126a.p9128b.C120822c;
import com.google.common.util.concurrent.C60813au;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.apps.tiktok.tracing.contrib.b.b */
/* compiled from: PG */
public final class C47629b {
    /* renamed from: a */
    public static /* synthetic */ Object m84723a(C120822c cVar, C60813au auVar) {
        C47630c cVar2 = cVar.f335987a;
        C47630c cVar3 = cVar.f335988b;
        C2164c cVar4 = (C2164c) auVar.mo57269a(cVar2.f123559a);
        try {
            C120511h hVar = (C120511h) auVar.mo57269a(cVar3.f123559a);
            cVar4.mo5437b(hVar);
            return hVar;
        } catch (ExecutionException e) {
            cVar4.mo5439d(e.getCause() == null ? e : e.getCause());
            throw e;
        }
    }
}
