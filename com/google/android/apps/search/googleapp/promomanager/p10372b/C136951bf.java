package com.google.android.apps.search.googleapp.promomanager.p10372b;

import com.google.android.apps.search.googleapp.promomanager.p10374c.C137037f;
import com.google.android.apps.search.googleapp.promomanager.p10374c.C137041j;
import com.google.android.apps.search.googleapp.promomanager.p10374c.C137043l;
import com.google.android.apps.search.googleapp.promomanager.p10374c.C137044m;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.base.C58817ah;
import com.google.protos.p4880aq.C63733av;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.bf */
/* compiled from: PG */
public final /* synthetic */ class C136951bf implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C136958bm f372716a;

    /* renamed from: b */
    public final /* synthetic */ int f372717b;

    /* renamed from: c */
    public final /* synthetic */ C137007dh f372718c;

    public /* synthetic */ C136951bf(C136958bm bmVar, int i, C137007dh dhVar) {
        this.f372716a = bmVar;
        this.f372717b = i;
        this.f372718c = dhVar;
    }

    public final Object apply(Object obj) {
        C63733av avVar;
        C136958bm bmVar = this.f372716a;
        int i = this.f372717b;
        C137007dh dhVar = this.f372718c;
        C137041j jVar = (C137041j) obj;
        bmVar.mo113454k(C37182a.f97900cZ.mo40779c());
        C137037f fVar = (C137037f) jVar.toBuilder();
        C137043l c = C136958bm.m222603c(i, fVar);
        if (dhVar.f372872b == 1) {
            avVar = (C63733av) dhVar.f372873c;
        } else {
            avVar = C63733av.f172308c;
        }
        c.copyOnWrite();
        C137044m mVar = (C137044m) c.instance;
        C137044m mVar2 = C137044m.f372948m;
        avVar.getClass();
        mVar.f372961l = avVar;
        mVar.f372950a |= 1024;
        C137041j b = bmVar.mo113446b(i, fVar, c);
        bmVar.mo113466w(C37182a.f97954da.mo40806d(), dhVar, jVar);
        return b;
    }
}
