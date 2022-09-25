package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122445cj;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122456k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.C122617c;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123060h;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p4813ah.p4814a.p4815a.C63179l;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.x */
/* compiled from: PG */
public final /* synthetic */ class C123560x implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122456k f341423a;

    public /* synthetic */ C123560x(C122456k kVar) {
        this.f341423a = kVar;
    }

    public final C60870cx apply(Object obj) {
        C122456k kVar = this.f341423a;
        C122617c cVar = (C122617c) obj;
        C122445cj cjVar = kVar.f339478a;
        if (cjVar == null) {
            cjVar = C122445cj.f339450b;
        }
        String str = cjVar.f339452a;
        C122419bk bkVar = kVar.f339480c;
        if (bkVar == null) {
            bkVar = C122419bk.f339392l;
        }
        String str2 = bkVar.f339398e;
        C122419bk bkVar2 = kVar.f339480c;
        if (bkVar2 == null) {
            bkVar2 = C122419bk.f339392l;
        }
        C52091ex exVar = bkVar2.f339396c;
        if (exVar == null) {
            exVar = C52091ex.f136710b;
        }
        return cVar.mo105691b(str, str2, (C63179l) C123060h.m202402a(exVar).map(C123557u.f341420a).orElse(C63179l.f170583h));
    }
}
