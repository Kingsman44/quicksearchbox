package com.google.android.apps.search.googleapp.promomanager.p10372b;

import com.google.android.apps.search.googleapp.promomanager.p10374c.C137037f;
import com.google.android.apps.search.googleapp.promomanager.p10374c.C137041j;
import com.google.android.apps.search.googleapp.promomanager.p10374c.C137043l;
import com.google.android.apps.search.googleapp.promomanager.p10374c.C137044m;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.base.C58817ah;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.au */
/* compiled from: PG */
public final /* synthetic */ class C136939au implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C136958bm f372694a;

    /* renamed from: b */
    public final /* synthetic */ int f372695b;

    /* renamed from: c */
    public final /* synthetic */ C137007dh f372696c;

    public /* synthetic */ C136939au(C136958bm bmVar, int i, C137007dh dhVar) {
        this.f372694a = bmVar;
        this.f372695b = i;
        this.f372696c = dhVar;
    }

    public final Object apply(Object obj) {
        C136958bm bmVar = this.f372694a;
        int i = this.f372695b;
        C137007dh dhVar = this.f372696c;
        C137041j jVar = (C137041j) obj;
        bmVar.mo113454k(C37182a.f97896cV.mo40779c());
        C137037f fVar = (C137037f) jVar.toBuilder();
        C137043l c = C136958bm.m222603c(i, fVar);
        int i2 = ((C137044m) c.instance).f372958i;
        c.copyOnWrite();
        C137044m mVar = (C137044m) c.instance;
        mVar.f372950a |= 128;
        mVar.f372958i = i2 + 1;
        C63042fg i3 = C62953e.m95484i(bmVar.f372749i.mo26870b());
        c.copyOnWrite();
        C137044m mVar2 = (C137044m) c.instance;
        i3.getClass();
        mVar2.f372959j = i3;
        mVar2.f372950a |= 256;
        C137041j b = bmVar.mo113446b(i, fVar, c);
        bmVar.mo113466w(C37182a.f97897cW.mo40806d(), dhVar, jVar);
        return b;
    }
}
