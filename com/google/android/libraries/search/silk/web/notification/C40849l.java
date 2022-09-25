package com.google.android.libraries.search.silk.web.notification;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3229r.C41732a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.notification.l */
/* compiled from: PG */
public final /* synthetic */ class C40849l implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkNotificationV2MessageHandler f107037a;

    /* renamed from: b */
    public final /* synthetic */ C41732a f107038b;

    public /* synthetic */ C40849l(SilkNotificationV2MessageHandler silkNotificationV2MessageHandler, C41732a aVar) {
        this.f107037a = silkNotificationV2MessageHandler;
        this.f107038b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkNotificationV2MessageHandler silkNotificationV2MessageHandler = this.f107037a;
        C41732a aVar = this.f107038b;
        C40769f fVar = silkNotificationV2MessageHandler.f107024d;
        Objects.requireNonNull(aVar);
        fVar.mo42721e(new C40843f(aVar), oVar, jSONObject, "NotificationV2", "getNotificationOptInStatus");
    }
}
