package com.google.android.libraries.search.silk.web.amp;

import com.google.android.apps.search.googleapp.amp.silk.C133470f;
import com.google.android.libraries.search.silk.web.core.C40759m;
import com.google.android.libraries.silk.p3205a.p3206a.C41709a;
import com.google.android.libraries.silk.p3238b.p3239a.C41746d;
import com.google.android.libraries.web.shared.contrib.C44083a;
import com.google.android.libraries.web.shared.contrib.C44085c;
import com.google.android.libraries.web.shared.contrib.WebFeature;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.common.p4522b.C58528ij;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
public abstract class SilkAmpFeature implements WebFeature, C41746d {
    /* renamed from: e */
    public static WebFeature m70435e(C133470f fVar) {
        C44085c cVar = new C44085c();
        cVar.mo47058c(new AutoValue_SilkAmpPostMessageConfig());
        cVar.f114767d.add(SilkAmpMessageHandler.class);
        cVar.mo47057b(C41709a.class, fVar.getClass());
        return new AutoValue_SilkAmpFeature(cVar.mo47056a(), C40759m.m70631a(1, (Integer[]) ((Object[]) new Integer[0])));
    }

    /* renamed from: a */
    public abstract WebFeatureConfig mo41576a();

    /* renamed from: b */
    public final /* synthetic */ C58528ij mo41577b() {
        return C44083a.m77834a();
    }

    /* renamed from: c */
    public final Class mo41578c() {
        return SilkAmpFeature.class;
    }

    /* renamed from: d */
    public abstract ProtoParsers.ParcelableProto mo42586d();
}
