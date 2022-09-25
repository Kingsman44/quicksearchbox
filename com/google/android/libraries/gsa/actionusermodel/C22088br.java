package com.google.android.libraries.gsa.actionusermodel;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p4985f.p4986a.C64655ai;
import com.google.protos.p4985f.p4986a.C64666at;
import com.google.protos.p4985f.p4986a.C64667au;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.br */
/* compiled from: PG */
public final /* synthetic */ class C22088br implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C22094bx f60889a;

    /* renamed from: b */
    public final /* synthetic */ boolean f60890b;

    /* renamed from: c */
    public final /* synthetic */ List f60891c;

    public /* synthetic */ C22088br(C22094bx bxVar, boolean z, List list) {
        this.f60889a = bxVar;
        this.f60890b = z;
        this.f60891c = list;
    }

    public final C60870cx apply(Object obj) {
        C22094bx bxVar = this.f60889a;
        boolean z = this.f60890b;
        List list = this.f60891c;
        C64666at atVar = (C64666at) ((C64667au) obj).toBuilder();
        if (z) {
            atVar.copyOnWrite();
            ((C64667au) atVar.instance).f175284c = C64667au.emptyProtobufList();
            Stream limit = Collection.EL.stream(list).sorted(Comparator.EL.reversed(Comparator.CC.comparingLong(C22091bu.f60894a))).limit((long) bxVar.f60898b);
            Objects.requireNonNull(atVar);
            limit.forEach(new C22092bv(atVar));
        } else {
            C64655ai aiVar = (C64655ai) list.get(0);
            atVar.copyOnWrite();
            C64667au auVar = (C64667au) atVar.instance;
            aiVar.getClass();
            auVar.mo59290a();
            auVar.f175284c.add(0, aiVar);
        }
        while (((C64667au) atVar.instance).f175284c.size() > bxVar.f60898b) {
            int i = bxVar.f60898b;
            atVar.copyOnWrite();
            C64667au auVar2 = (C64667au) atVar.instance;
            auVar2.mo59290a();
            auVar2.f175284c.remove(i);
        }
        return C60856cj.m92900i((C64667au) atVar.build());
    }
}
