package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.google.android.apps.gsa.nga.shared.p6275aa.C80125bc;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80126bd;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80886aa;
import com.google.android.apps.gsa.shared.p6976ag.p6980d.C89126b;
import com.google.android.apps.gsa.shared.p6976ag.p6980d.C89127c;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.common.p4522b.C58759qy;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.bw */
/* compiled from: PG */
public final /* synthetic */ class C103701bw implements Function {

    /* renamed from: a */
    public final /* synthetic */ C103704bz f288820a;

    /* renamed from: b */
    public final /* synthetic */ C80126bd f288821b;

    /* renamed from: c */
    public final /* synthetic */ C123777f f288822c;

    public /* synthetic */ C103701bw(C103704bz bzVar, C80126bd bdVar, C123777f fVar) {
        this.f288820a = bzVar;
        this.f288821b = bdVar;
        this.f288822c = fVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }

    public final Object apply(Object obj) {
        C89126b bVar;
        C103704bz bzVar = this.f288820a;
        C80126bd bdVar = this.f288821b;
        C123777f fVar = this.f288822c;
        C89127c cVar = (C89127c) obj;
        int a = C80125bc.m128085a(bdVar.f219870b);
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 2) {
            bVar = C89126b.QUICK_ACTION;
        } else {
            bVar = C89126b.TACTILE_ASSISTANT_SUGGEST;
        }
        return C80886aa.m128740e(cVar.mo83113a(new C58759qy(bVar), fVar), bzVar.f288827b).mo74704d(new C103702bx(bzVar));
    }
}
