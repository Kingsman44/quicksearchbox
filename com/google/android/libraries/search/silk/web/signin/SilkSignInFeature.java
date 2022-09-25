package com.google.android.libraries.search.silk.web.signin;

import com.google.android.libraries.search.silk.web.core.C40759m;
import com.google.android.libraries.silk.p3205a.p3236y.C41740a;
import com.google.android.libraries.silk.p3238b.p3239a.C41746d;
import com.google.android.libraries.web.shared.contrib.C44083a;
import com.google.android.libraries.web.shared.contrib.C44085c;
import com.google.android.libraries.web.shared.contrib.WebFeature;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.common.p4522b.C58528ij;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
public abstract class SilkSignInFeature implements WebFeature, C41746d {
    /* renamed from: e */
    public static WebFeature m71017e(C40925c cVar) {
        C44085c f = m71018f();
        f.mo47057b(C41740a.class, cVar.getClass());
        return new AutoValue_SilkSignInFeature(f.mo47056a(), C40759m.m70631a(41, cVar.mo42938a()));
    }

    /* renamed from: f */
    public static C44085c m71018f() {
        C44085c cVar = new C44085c();
        cVar.mo47058c(new AutoValue_SilkSignInPostMessageConfig());
        cVar.f114767d.add(SilkSignInMessageHandler.class);
        return cVar;
    }

    /* renamed from: a */
    public abstract WebFeatureConfig mo41576a();

    /* renamed from: b */
    public final /* synthetic */ C58528ij mo41577b() {
        return C44083a.m77834a();
    }

    /* renamed from: c */
    public final Class mo41578c() {
        return SilkSignInFeature.class;
    }

    /* renamed from: d */
    public abstract ProtoParsers.ParcelableProto mo42586d();
}
