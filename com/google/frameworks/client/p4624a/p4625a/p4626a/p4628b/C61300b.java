package com.google.frameworks.client.p4624a.p4625a.p4626a.p4628b;

import android.os.Process;
import com.google.android.libraries.p11012aj.C147607f;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.p4528b.p4529a.C58985d;
import com.google.common.p4526f.p4528b.p4529a.C58999p;
import com.google.common.p4526f.p4531c.C59055c;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.frameworks.client.a.a.a.b.b */
/* compiled from: PG */
public final class C61300b implements C147607f {

    /* renamed from: a */
    private static final AtomicBoolean f165793a = new AtomicBoolean(false);

    /* renamed from: b */
    private final C61299a f165794b;

    public C61300b(C61299a aVar) {
        this.f165794b = aVar;
    }

    /* renamed from: a */
    public final void mo41448a() {
        if (!Process.isIsolated() && !f165793a.getAndSet(true)) {
            C47558bi a = C47831fm.m85006a("AndroidLoggerConfig");
            try {
                C61299a aVar = this.f165794b;
                C58985d.m91159c();
                C58985d.m91158b(aVar);
                C58999p.f156865a.f156866b.set(C59055c.f156977a);
                a.close();
                return;
            } catch (Throwable th) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
                } catch (Exception unused) {
                }
            }
        } else {
            return;
        }
        throw th;
    }
}
