package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3793ae.p3794a.C48771c;
import com.google.assistant.p3793ae.p3794a.C48774f;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.bh */
/* compiled from: PG */
public final /* synthetic */ class C103935bh implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C103935bh f289267a = new C103935bh();

    private /* synthetic */ C103935bh() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C58974d dVar = C103943bp.f289282a;
        C48771c cVar = (C48771c) C48774f.f126206b.createBuilder();
        Stream map = Collection.EL.stream((List) obj).map(C103937bj.f289269a);
        Objects.requireNonNull(cVar);
        map.forEach(new C103938bk(cVar));
        return (C48774f) cVar.build();
    }
}
