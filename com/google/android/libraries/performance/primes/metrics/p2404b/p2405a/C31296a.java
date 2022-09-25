package com.google.android.libraries.performance.primes.metrics.p2404b.p2405a;

import com.google.common.base.C58817ah;
import java.io.IOException;

/* renamed from: com.google.android.libraries.performance.primes.metrics.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C31296a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C31297b f84278a;

    public /* synthetic */ C31296a(C31297b bVar) {
        this.f84278a = bVar;
    }

    public final Object apply(Object obj) {
        try {
            return new ProcessBuilder(new String[]{"/system/bin/trigger_perfetto", (String) obj}).start();
        } catch (IOException unused) {
            this.f84278a.f84281c = true;
            return null;
        }
    }
}
