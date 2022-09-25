package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.android.apps.gsa.nga.shared.p6364s3.p6365a.C81480o;
import com.google.android.apps.gsa.nga.shared.p6364s3.p6365a.C81482q;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.p7127q.p7128a.C90454b;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import java.util.List;
import java.util.concurrent.CancellationException;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.ch */
/* compiled from: PG */
public final /* synthetic */ class C103572ch implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C103578cn f288537a;

    public /* synthetic */ C103572ch(C103578cn cnVar) {
        this.f288537a = cnVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        Iterable iterable;
        C103578cn cnVar = this.f288537a;
        Exception exc = (Exception) obj;
        C81480o oVar = (C81480o) C81482q.f222910d.createBuilder();
        int i = true != (exc instanceof CancellationException) ? 3 : 4;
        oVar.copyOnWrite();
        ((C81482q) oVar.instance).f222912a = i - 2;
        String exc2 = exc.toString();
        oVar.copyOnWrite();
        exc2.getClass();
        ((C81482q) oVar.instance).f222913b = exc2;
        if (exc instanceof C90456c) {
            iterable = (List) Collection.EL.stream(C90454b.m147154d((C90456c) exc)).map(C103575ck.f288540a).collect(Collectors.toList());
        } else {
            iterable = C58485gu.m89846n(0);
        }
        oVar.copyOnWrite();
        C81482q qVar = (C81482q) oVar.instance;
        C62961ch chVar = qVar.f222914c;
        if (!chVar.mo58948c()) {
            qVar.f222914c = C62942bv.mutableCopy(chVar);
        }
        C62947c.addAll(iterable, (List) qVar.f222914c);
        cnVar.mo93817e((C81482q) oVar.build());
    }
}
