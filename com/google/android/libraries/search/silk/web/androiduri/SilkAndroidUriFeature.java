package com.google.android.libraries.search.silk.web.androiduri;

import com.google.android.libraries.search.silk.web.core.C40759m;
import com.google.android.libraries.silk.p3205a.p3213b.C41716a;
import com.google.android.libraries.silk.p3238b.p3239a.C41746d;
import com.google.android.libraries.web.shared.contrib.C44083a;
import com.google.android.libraries.web.shared.contrib.C44085c;
import com.google.android.libraries.web.shared.contrib.WebFeature;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.common.p4522b.C58528ij;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
public abstract class SilkAndroidUriFeature implements WebFeature, C41746d {
    /* renamed from: e */
    public static WebFeature m70461e(C40672c cVar) {
        C44085c cVar2 = new C44085c();
        cVar2.mo47058c(new AutoValue_SilkAndroidUriPostMessageConfig());
        cVar2.f114767d.add(SilkAndroidUriMessageHandler.class);
        cVar2.mo47057b(C41716a.class, cVar.getClass());
        return new AutoValue_SilkAndroidUriFeature(cVar2.mo47056a(), C40759m.m70631a(2, new Integer[0]));
    }

    /* renamed from: a */
    public abstract WebFeatureConfig mo41576a();

    /* renamed from: b */
    public final /* synthetic */ C58528ij mo41577b() {
        return C44083a.m77834a();
    }

    /* renamed from: c */
    public final Class mo41578c() {
        return SilkAndroidUriFeature.class;
    }

    /* renamed from: d */
    public abstract ProtoParsers.ParcelableProto mo42586d();
}
