package com.google.android.libraries.accountlinking.p10980c;

import android.content.Context;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60895di;
import java.util.concurrent.Executors;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import p5488io.grpc.C70286co;
import p5488io.grpc.p5523c.C70261e;

/* renamed from: com.google.android.libraries.accountlinking.c.a */
/* compiled from: PG */
public final class C147416a implements C147417b {

    /* renamed from: c */
    private static final C58974d f397938c = C58974d.m91134h("GAL");

    /* renamed from: a */
    public final C70286co f397939a;

    /* renamed from: b */
    public final C60887da f397940b;

    /* renamed from: d */
    private final CronetEngine f397941d;

    public C147416a(Context context, String str, int i) {
        CronetEngine cronetEngine;
        context.getClass();
        str.getClass();
        C58838bb.m90868c(i > 0);
        try {
            cronetEngine = new CronetEngine.Builder(context).build();
        } catch (Throwable th) {
            for (CronetProvider cronetProvider : CronetProvider.getAllProviders(context)) {
                if (cronetProvider.getName().equals(CronetProvider.PROVIDER_NAME_FALLBACK) && cronetProvider.isEnabled()) {
                    cronetEngine = cronetProvider.createBuilder().build();
                }
            }
            ((C58970a) ((C58970a) f397938c.mo56226d()).mo56372aa(42242)).mo56386p("Unable to create CronetEngine. No implementation is available.");
            throw new IllegalStateException("There is no implementation of CronetEngine on this device", th);
        }
        this.f397941d = cronetEngine;
        this.f397939a = C70261e.m102411b(str, i, cronetEngine).f187275c.mo57963c();
        this.f397940b = C60895di.m92995a(Executors.newFixedThreadPool(4));
    }

    /* renamed from: a */
    public final void mo124160a() {
        this.f397941d.shutdown();
        this.f397939a.mo61974f();
        this.f397940b.shutdown();
    }
}
