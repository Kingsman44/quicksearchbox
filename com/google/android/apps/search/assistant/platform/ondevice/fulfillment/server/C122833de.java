package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122430bv;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122458m;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.p9288a.C122811k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122867l;
import com.google.common.p4526f.C59052c;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.de */
/* compiled from: PG */
public final /* synthetic */ class C122833de implements C122853dy {

    /* renamed from: a */
    public final /* synthetic */ C122870ea f340214a;

    /* renamed from: b */
    public final /* synthetic */ C122430bv f340215b;

    public /* synthetic */ C122833de(C122870ea eaVar, C122430bv bvVar) {
        this.f340214a = eaVar;
        this.f340215b = bvVar;
    }

    /* renamed from: a */
    public final Status mo105758a(C122811k kVar, C122419bk bkVar) {
        C122458m mVar;
        C122870ea eaVar = this.f340214a;
        C122430bv bvVar = this.f340215b;
        if (bvVar.f339421a == 4) {
            mVar = (C122458m) bvVar.f339422b;
        } else {
            mVar = C122458m.f339484b;
        }
        for (Integer num : mVar.f339486a) {
            C122852dx dxVar = (C122852dx) eaVar.f340317r.remove(num);
            if (dxVar != null) {
                ((C59052c) C122867l.m202189a(eaVar.f340302c, num.intValue()).mo105764c().mo56372aa(34851)).mo56386p("Request cancelled by client");
                dxVar.mo105761a();
            } else {
                ((C59052c) eaVar.f340302c.mo105765d().mo56372aa(34850)).mo56389s("Invalid request id to cancel, no matching request with id %d", num);
            }
        }
        return Status.f186902OK;
    }
}
