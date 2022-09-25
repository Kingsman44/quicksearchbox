package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.p9288a.C122811k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123047cn;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60826bg;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.dh */
/* compiled from: PG */
public final /* synthetic */ class C122836dh implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C122870ea f340224a;

    /* renamed from: b */
    public final /* synthetic */ C122419bk f340225b;

    public /* synthetic */ C122836dh(C122870ea eaVar, C122419bk bkVar) {
        this.f340224a = eaVar;
        this.f340225b = bkVar;
    }

    public final Object apply(Object obj) {
        C122870ea eaVar = this.f340224a;
        C122419bk bkVar = this.f340225b;
        C122811k kVar = (C122811k) obj;
        eaVar.f340319t = kVar;
        if (!bkVar.f339403j) {
            C123047cn.m202382b(kVar.mo105753b(), new C122834df(eaVar), C60826bg.f164896a);
        }
        C123047cn.m202382b(kVar.mo105752a(), new C122832dd(eaVar), C60826bg.f164896a);
        C123047cn.m202382b(kVar.f340175e.mo105787h(), new C122840dl(eaVar), C60826bg.f164896a);
        eaVar.f340316q = C122854dz.WORKING;
        return Status.f186902OK;
    }
}
