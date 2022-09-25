package com.google.apps.tiktok.tracing.contrib.grpc;

import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.grpc.MetadataTracePropagation;
import com.google.frameworks.client.data.android.p4642i.C61511e;
import java.util.WeakHashMap;
import p5488io.grpc.C70160ax;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70897l;
import p5488io.grpc.C70898m;

/* renamed from: com.google.apps.tiktok.tracing.contrib.grpc.g */
/* compiled from: PG */
final class C47682g extends C70160ax {

    /* renamed from: a */
    private final boolean f123635a;

    public C47682g(C70898m mVar, boolean z) {
        super(mVar);
        this.f123635a = z;
    }

    /* renamed from: a */
    public final void mo27478a(C70897l lVar, C70334de deVar) {
        WeakHashMap weakHashMap = C47831fm.f123851a;
        if (this.f123635a) {
            deVar.mo62033h(MetadataTracePropagation.f123628a, new MetadataTracePropagation.TraceReferencingDummyParcelable(C47816ey.m84990e()));
        }
        this.f187014c.mo27478a(new C61511e(lVar), deVar);
    }
}
