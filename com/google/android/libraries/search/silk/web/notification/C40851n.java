package com.google.android.libraries.search.silk.web.notification;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3229r.C41732a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4313r.C56813k;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.notification.n */
/* compiled from: PG */
public final /* synthetic */ class C40851n implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkNotificationV2MessageHandler f107040a;

    /* renamed from: b */
    public final /* synthetic */ C41732a f107041b;

    public /* synthetic */ C40851n(SilkNotificationV2MessageHandler silkNotificationV2MessageHandler, C41732a aVar) {
        this.f107040a = silkNotificationV2MessageHandler;
        this.f107041b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkNotificationV2MessageHandler silkNotificationV2MessageHandler = this.f107040a;
        C41732a aVar = this.f107041b;
        C40769f fVar = silkNotificationV2MessageHandler.f107024d;
        Objects.requireNonNull(aVar);
        fVar.mo42720d(new C40845h(aVar), oVar, jSONObject, "NotificationV2", "showNotificationOptInPage", C56813k.f151598b.getParserForType());
    }
}
