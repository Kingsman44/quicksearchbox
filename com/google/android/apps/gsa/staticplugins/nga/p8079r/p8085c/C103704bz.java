package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.google.android.apps.gsa.nga.shared.p6275aa.C80126bd;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80886aa;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c.p8086a.C103651a;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123733b;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123776e;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import dagger.C68214a;
import java.util.Set;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.bz */
/* compiled from: PG */
public final class C103704bz implements C103651a {

    /* renamed from: c */
    private static final C58974d f288825c = C58974d.m91136j();

    /* renamed from: a */
    public final C68214a f288826a;

    /* renamed from: b */
    public final Executor f288827b;

    /* renamed from: d */
    private final C68214a f288828d;

    public C103704bz(C68214a aVar, C68214a aVar2, C22871g gVar) {
        this.f288828d = aVar;
        this.f288826a = aVar2;
        this.f288827b = new C103703by(gVar);
    }

    /* renamed from: a */
    public final C60870cx mo93582a(C80136bn bnVar) {
        if (bnVar.f219917a == 25) {
            C80126bd bdVar = (C80126bd) bnVar.f219918b;
            C123776e eVar = (C123776e) C123777f.f341922a.createBuilder();
            C62940bt btVar = C123733b.f341777e;
            C123733b bVar = bdVar.f219871c;
            if (bVar == null) {
                bVar = C123733b.f341776d;
            }
            eVar.mo58885m(btVar, bVar);
            C60870cx f = C80886aa.m128739a((C58485gu) Collection.EL.stream((Set) this.f288828d.mo27525b()).map(new C103701bw(this, bdVar, (C123777f) eVar.build())).collect(C58370cn.f155946a), this.f288827b).mo74703c(bdVar.f219869a).mo74705f(C58370cn.f155946a);
            C103699bu buVar = C103699bu.f288818a;
            return C60922j.m93044g(f, C47810es.m84963c(buVar), C60826bg.f164896a);
        }
        ((C58970a) ((C58970a) f288825c.mo56226d()).mo56372aa(21648)).mo56386p("Invalid request. Return empty.");
        return C60856cj.m92900i(C80275dd.f220288c);
    }
}
