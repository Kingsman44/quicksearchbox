package com.google.android.apps.gsa.nga.engine.screen.annotations.impl;

import com.google.android.apps.gsa.assist.C9418h;
import com.google.android.apps.gsa.nga.d.a.b;
import com.google.android.apps.gsa.nga.d.a.k;
import com.google.android.apps.gsa.nga.d.a.l;
import com.google.android.apps.gsa.nga.d.a.m;
import com.google.android.apps.gsa.nga.d.a.p;
import com.google.android.apps.gsa.nga.d.a.r;
import com.google.android.apps.gsa.nga.d.a.s;
import com.google.android.apps.gsa.nga.d.a.y;
import com.google.android.apps.gsa.nga.engine.screen.annotations.impl.ScreenAnnotationEngineImpl;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.screen.annotations.impl.c */
/* compiled from: PG */
public final /* synthetic */ class C77923c implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ ScreenAnnotationEngineImpl f214658a;

    /* renamed from: b */
    public final /* synthetic */ C77939s f214659b;

    /* renamed from: c */
    public final /* synthetic */ Optional f214660c;

    /* renamed from: d */
    public final /* synthetic */ C58485gu f214661d;

    public /* synthetic */ C77923c(ScreenAnnotationEngineImpl screenAnnotationEngineImpl, C77939s sVar, Optional optional, C58485gu guVar) {
        this.f214658a = screenAnnotationEngineImpl;
        this.f214659b = sVar;
        this.f214660c = optional;
        this.f214661d = guVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        ScreenAnnotationEngineImpl screenAnnotationEngineImpl = this.f214658a;
        C77939s sVar = this.f214659b;
        Optional optional = this.f214660c;
        C58485gu guVar = this.f214661d;
        C58485gu guVar2 = (C58485gu) obj;
        y yVar = (y) sVar.mo72906c().get();
        boolean contains = guVar.contains(s.c);
        k createBuilder = p.g.createBuilder();
        C9418h hVar = yVar.a;
        if (hVar == null) {
            hVar = C9418h.f32714k;
        }
        createBuilder.copyOnWrite();
        hVar.getClass();
        createBuilder.instance.a = hVar;
        createBuilder.copyOnWrite();
        createBuilder.instance.b = 32;
        l createBuilder2 = m.b.createBuilder();
        createBuilder2.copyOnWrite();
        m mVar = createBuilder2.instance;
        C62961ch chVar = mVar.a;
        if (!chVar.mo58948c()) {
            mVar.a = C62942bv.mutableCopy(chVar);
        }
        C58801sm G = guVar.listIterator(0);
        while (G.hasNext()) {
            mVar.a.mo58916g(((s) G.next()).getNumber());
        }
        createBuilder.copyOnWrite();
        m build = createBuilder2.build();
        build.getClass();
        createBuilder.instance.d = build;
        b bVar = yVar.b;
        if (bVar == null) {
            bVar = b.f;
        }
        createBuilder.copyOnWrite();
        bVar.getClass();
        createBuilder.instance.c = bVar;
        createBuilder.copyOnWrite();
        createBuilder.instance.e = contains;
        createBuilder.copyOnWrite();
        p pVar = createBuilder.instance;
        C62971cq cqVar = pVar.f;
        if (!cqVar.mo58948c()) {
            pVar.f = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar2, (List) pVar.f);
        p build2 = createBuilder.build();
        r b = screenAnnotationEngineImpl.f214634f.mo72896b(build2, ((ScreenAnnotationEngineImpl.NativeScreenContent) sVar.mo72905b().get()).f214639a);
        screenAnnotationEngineImpl.mo72898b(Optional.m71637of(build2), Optional.m71637of(b), Optional.empty(), optional);
        return b;
    }
}
