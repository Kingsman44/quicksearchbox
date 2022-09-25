package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p960b;

import com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.nlp.p4730a.p4731a.p4732a.p4733a.C62736g;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.b.b.d */
/* compiled from: PG */
public final /* synthetic */ class C13418d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C13426l f41223a;

    /* renamed from: b */
    public final /* synthetic */ BundledMessageNotification f41224b;

    /* renamed from: c */
    public final /* synthetic */ C62736g f41225c;

    /* renamed from: d */
    public final /* synthetic */ String f41226d;

    /* renamed from: e */
    public final /* synthetic */ String f41227e;

    public /* synthetic */ C13418d(C13426l lVar, BundledMessageNotification bundledMessageNotification, C62736g gVar, String str, String str2) {
        this.f41223a = lVar;
        this.f41224b = bundledMessageNotification;
        this.f41225c = gVar;
        this.f41226d = str;
        this.f41227e = str2;
    }

    public final C60870cx apply(Object obj) {
        C13426l lVar = this.f41223a;
        BundledMessageNotification bundledMessageNotification = this.f41224b;
        C62736g gVar = this.f41225c;
        String str = this.f41226d;
        String str2 = this.f41227e;
        ((C59052c) ((C59052c) C13426l.f41243a.mo56226d()).mo56372aa(44799)).mo56389s("Exception: %s", ((Throwable) obj).getMessage());
        return lVar.mo21074b(bundledMessageNotification, C58485gu.m89846n(gVar), str, str2);
    }
}
