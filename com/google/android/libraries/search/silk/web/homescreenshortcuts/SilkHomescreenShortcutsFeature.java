package com.google.android.libraries.search.silk.web.homescreenshortcuts;

import com.google.android.libraries.search.silk.web.core.C40759m;
import com.google.android.libraries.silk.p3205a.p3224m.C41727a;
import com.google.android.libraries.silk.p3238b.p3239a.C41746d;
import com.google.android.libraries.web.shared.contrib.C44083a;
import com.google.android.libraries.web.shared.contrib.C44085c;
import com.google.android.libraries.web.shared.contrib.WebFeature;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.common.p4522b.C58528ij;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
public abstract class SilkHomescreenShortcutsFeature implements WebFeature, C41746d {
    /* renamed from: e */
    public static WebFeature m70740e(C40801c cVar) {
        C44085c cVar2 = new C44085c();
        cVar2.mo47058c(new AutoValue_SilkHomescreenShortcutsPostMessageConfig());
        cVar2.f114767d.add(SilkHomescreenShortcutsMessageHandler.class);
        cVar2.mo47057b(C41727a.class, cVar.getClass());
        return new AutoValue_SilkHomescreenShortcutsFeature(cVar2.mo47056a(), C40759m.m70631a(22, new Integer[0]));
    }

    /* renamed from: a */
    public abstract WebFeatureConfig mo41576a();

    /* renamed from: b */
    public final /* synthetic */ C58528ij mo41577b() {
        return C44083a.m77834a();
    }

    /* renamed from: c */
    public final Class mo41578c() {
        return SilkHomescreenShortcutsFeature.class;
    }

    /* renamed from: d */
    public abstract ProtoParsers.ParcelableProto mo42586d();
}
