package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d;

import android.util.LruCache;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.assistant.p3897e.p3917i.p3918a.C51347ei;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62912at;
import com.google.protobuf.C62963cj;
import java.util.concurrent.ExecutorService;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.d.aj */
/* compiled from: PG */
final class C127999aj extends C128023u {

    /* renamed from: a */
    public static final C58974d f352260a = C58974d.m91134h("MSService");

    /* renamed from: b */
    public final ExecutorService f352261b;

    /* renamed from: c */
    public final C58495hd f352262c;

    /* renamed from: d */
    private final LruCache f352263d = new C127991ab(this);

    /* renamed from: e */
    private final C127997ah f352264e = new C127997ah(this);

    public C127999aj(ExecutorService executorService, C58495hd hdVar) {
        this.f352262c = hdVar;
        this.f352261b = executorService;
    }

    /* renamed from: d */
    private final synchronized C127992ac m209129d(C34053bp bpVar) {
        C127998ai aiVar;
        aiVar = (C127998ai) this.f352263d.get(bpVar);
        aiVar.getClass();
        return aiVar;
    }

    /* renamed from: b */
    public final void mo108300b(C128005c cVar, C70862aj ajVar) {
        C127992ac acVar;
        if ((cVar.f352275a & 1) != 0) {
            C34053bp bpVar = cVar.f352277d;
            if (bpVar == null) {
                bpVar = C34053bp.f90753a;
            }
            acVar = m209129d(bpVar);
        } else {
            acVar = this.f352264e;
        }
        Stream stream = Collection.EL.stream(new C62963cj(cVar.f352276b, C128005c.f352272c));
        Objects.requireNonNull(acVar);
        C60870cx o = C60856cj.m92906o((Iterable) stream.map(new C128028z(acVar)).collect(C58370cn.f155946a));
        o.mo4106b(new C127990aa(ajVar, o), this.f352261b);
    }

    /* renamed from: c */
    public final void mo108301c(C128003an anVar, C70862aj ajVar) {
        C127992ac acVar;
        if ((anVar.f352268a & 1) != 0) {
            C34053bp bpVar = anVar.f352270d;
            if (bpVar == null) {
                bpVar = C34053bp.f90753a;
            }
            acVar = m209129d(bpVar);
        } else {
            acVar = this.f352264e;
        }
        for (C51347ei b : new C62963cj(anVar.f352269b, C128003an.f352265c)) {
            acVar.mo108299b(b);
        }
        ajVar.mo20123c(C62912at.f169862a);
        ajVar.mo20121a();
    }
}
