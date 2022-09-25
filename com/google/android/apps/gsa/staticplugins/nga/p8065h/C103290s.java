package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.android.gms.appdatasearch.C142796al;
import com.google.android.gms.search.p10865b.C145861a;
import com.google.android.gms.search.p10865b.C145864b;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58506ho;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58144b;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58148f;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.nio.ByteBuffer;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.s */
/* compiled from: PG */
public final /* synthetic */ class C103290s implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C58506ho f288090a;

    public /* synthetic */ C103290s(C58506ho hoVar) {
        this.f288090a = hoVar;
    }

    public final void accept(Object obj) {
        Optional optional;
        C58506ho hoVar = this.f288090a;
        C142796al alVar = (C142796al) obj;
        String h = alVar.mo117712h("name");
        String g = alVar.mo117711g();
        if (h != null && g != null) {
            ByteBuffer j = alVar.mo117714j();
            if (j == null || !j.hasRemaining()) {
                optional = Optional.empty();
            } else {
                try {
                    C58148f fVar = (C58148f) C62942bv.parseFrom((C62942bv) C58148f.f155452f, j, C62921ba.m95368a());
                    Stream stream = Collection.EL.stream(fVar.f155457d);
                    C58144b bVar = fVar.f155458e;
                    if (bVar == null) {
                        bVar = C58144b.f155438c;
                    }
                    optional = Stream.CC.concat(stream, Collection.EL.stream(bVar.f155441b)).filter(C103288q.f288088a).map(C103289r.f288089a).findFirst();
                } catch (C62974ct unused) {
                    optional = Optional.empty();
                }
            }
            hoVar.mo55456j(new C103207a(h, optional, ((C145861a) C145864b.m237624b(g, C58837ba.m90858g(alVar.mo117713i()))).f394402a), Double.valueOf(alVar.mo117705a()));
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
