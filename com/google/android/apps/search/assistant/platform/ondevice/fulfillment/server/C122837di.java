package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.C122617c;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123060h;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p4813ah.p4814a.p4815a.C63179l;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.di */
/* compiled from: PG */
public final /* synthetic */ class C122837di implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ String f340226a;

    /* renamed from: b */
    public final /* synthetic */ C122419bk f340227b;

    /* renamed from: c */
    public final /* synthetic */ C52091ex f340228c;

    public /* synthetic */ C122837di(String str, C122419bk bkVar, C52091ex exVar) {
        this.f340226a = str;
        this.f340227b = bkVar;
        this.f340228c = exVar;
    }

    public final C60870cx apply(Object obj) {
        return ((C122617c) obj).mo105691b(this.f340226a, this.f340227b.f339398e, (C63179l) C123060h.m202402a(this.f340228c).map(C122848dt.f340257a).orElse(C63179l.f170583h));
    }
}
