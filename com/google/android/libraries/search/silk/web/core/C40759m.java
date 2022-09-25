package com.google.android.libraries.search.silk.web.core;

import com.google.p4283bv.p4287b.p4288a.p4322b.C56851g;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56852h;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.search.silk.web.core.m */
/* compiled from: PG */
public final class C40759m {
    /* renamed from: a */
    public static ProtoParsers.ParcelableProto m70631a(int i, Integer[] numArr) {
        C56851g gVar = (C56851g) C56852h.f151675d.createBuilder();
        gVar.copyOnWrite();
        C56852h hVar = (C56852h) gVar.instance;
        hVar.f151677a |= 2;
        hVar.f151679c = i;
        gVar.mo54436a(Arrays.asList(numArr));
        return new ProtoParsers.InternalDontUse((byte[]) null, (C56852h) gVar.build());
    }
}
