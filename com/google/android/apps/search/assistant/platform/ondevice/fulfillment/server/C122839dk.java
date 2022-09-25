package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122454i;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.p9283a.C122594e;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import p3186j$.time.ZoneId;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.dk */
/* compiled from: PG */
public final /* synthetic */ class C122839dk implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C122594e f340230a;

    /* renamed from: b */
    public final /* synthetic */ String f340231b;

    /* renamed from: c */
    public final /* synthetic */ C122454i f340232c;

    /* renamed from: d */
    public final /* synthetic */ C122419bk f340233d;

    public /* synthetic */ C122839dk(C122594e eVar, String str, C122454i iVar, C122419bk bkVar) {
        this.f340230a = eVar;
        this.f340231b = str;
        this.f340232c = iVar;
        this.f340233d = bkVar;
    }

    public final Object apply(Object obj) {
        C58485gu a = this.f340230a.mo105688a(this.f340231b, this.f340232c.f339474a, ZoneId.m71280of(this.f340233d.f339398e));
        C58480gp e = C58485gu.m89837e();
        e.mo55396h((C58485gu) obj);
        e.mo55396h(a);
        return e.mo55394f();
    }
}
