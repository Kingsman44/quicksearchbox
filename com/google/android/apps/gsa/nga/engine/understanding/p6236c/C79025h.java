package com.google.android.apps.gsa.nga.engine.understanding.p6236c;

import com.google.android.apps.gsa.nga.b.a.f;
import com.google.android.apps.gsa.nga.b.a.i;
import com.google.android.apps.gsa.nga.b.a.j;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80412ad;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80413ae;
import com.google.assistant.p3897e.p3917i.p3918a.C51509ki;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62962ci;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.c.h */
/* compiled from: PG */
public final /* synthetic */ class C79025h implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C51509ki f217317a;

    /* renamed from: b */
    public final /* synthetic */ C80412ad f217318b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f217319c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f217320d;

    /* renamed from: e */
    public final /* synthetic */ j f217321e;

    public /* synthetic */ C79025h(C51509ki kiVar, C80412ad adVar, C60870cx cxVar, C60870cx cxVar2, j jVar) {
        this.f217317a = kiVar;
        this.f217318b = adVar;
        this.f217319c = cxVar;
        this.f217320d = cxVar2;
        this.f217321e = jVar;
    }

    public final Object call() {
        C51509ki kiVar = this.f217317a;
        C80412ad adVar = this.f217318b;
        C60870cx cxVar = this.f217319c;
        C60870cx cxVar2 = this.f217320d;
        j jVar = this.f217321e;
        int i = C79028k.f217326a;
        if ((kiVar.f134190a & 1) != 0) {
            adVar.mo74324a((Iterable) C60856cj.m92909r(cxVar));
        }
        if ((kiVar.f134190a & 16) != 0) {
            C79021d dVar = new C79021d((C58495hd) C60856cj.m92909r(cxVar2));
            i builder = jVar.toBuilder();
            builder.copyOnWrite();
            builder.instance.a = j.emptyProtobufList();
            for (f b : jVar.a) {
                builder.a(C79028k.m126973b(b, dVar));
            }
            builder.copyOnWrite();
            builder.instance.a = j.emptyProtobufList();
            for (f b2 : jVar.a) {
                builder.a(C79028k.m126973b(b2, dVar));
            }
            j build = builder.build();
            adVar.copyOnWrite();
            C80413ae aeVar = (C80413ae) adVar.instance;
            C62962ci ciVar = C80413ae.f220687l;
            build.getClass();
            aeVar.f220696g = build;
            aeVar.f220690a |= 16;
        }
        return (C80413ae) adVar.build();
    }
}
