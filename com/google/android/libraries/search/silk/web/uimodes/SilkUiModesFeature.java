package com.google.android.libraries.search.silk.web.uimodes;

import com.google.android.libraries.silk.p3238b.p3239a.C41746d;
import com.google.android.libraries.web.shared.contrib.C44083a;
import com.google.android.libraries.web.shared.contrib.C44085c;
import com.google.android.libraries.web.shared.contrib.WebFeature;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.common.p4522b.C58528ij;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56851g;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56852h;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.Arrays;

/* compiled from: PG */
public abstract class SilkUiModesFeature implements WebFeature, C41746d {
    /* renamed from: e */
    public static WebFeature m71065e(C56852h hVar) {
        C44085c cVar = new C44085c();
        cVar.mo47058c(new AutoValue_SilkUiModesPostMessageConfig());
        cVar.f114767d.add(SilkUiModesMessageHandler.class);
        return new AutoValue_SilkUiModesFeature(cVar.mo47056a(), new ProtoParsers.InternalDontUse((byte[]) null, hVar));
    }

    /* renamed from: f */
    public static C56852h m71066f() {
        C56851g gVar = (C56851g) C56852h.f151675d.createBuilder();
        gVar.copyOnWrite();
        C56852h hVar = (C56852h) gVar.instance;
        hVar.f151677a |= 2;
        hVar.f151679c = 44;
        gVar.mo54436a(Arrays.asList(new Integer[0]));
        return (C56852h) gVar.build();
    }

    /* renamed from: a */
    public abstract WebFeatureConfig mo41576a();

    /* renamed from: b */
    public final /* synthetic */ C58528ij mo41577b() {
        return C44083a.m77834a();
    }

    /* renamed from: c */
    public final Class mo41578c() {
        return SilkUiModesFeature.class;
    }

    /* renamed from: d */
    public abstract ProtoParsers.ParcelableProto mo42586d();
}
