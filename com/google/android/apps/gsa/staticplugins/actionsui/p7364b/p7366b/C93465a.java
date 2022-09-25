package com.google.android.apps.gsa.staticplugins.actionsui.p7364b.p7366b;

import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.b.b.a */
/* compiled from: PG */
public final /* synthetic */ class C93465a implements C87682aj {

    /* renamed from: a */
    public final /* synthetic */ C93469e f260845a;

    public /* synthetic */ C93465a(C93469e eVar) {
        this.f260845a = eVar;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C93469e eVar = this.f260845a;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (a == C88244um.UPDATE_TOP_VOICE_ACTION) {
            ParcelableVoiceAction parcelableVoiceAction = (ParcelableVoiceAction) serviceEventData.mo81912b(ParcelableVoiceAction.class);
            return;
        }
        int i = serviceEventData.f236959a.f238699b;
        eVar.f260851c.mo79250a(serviceEventData);
    }
}
