package com.google.android.libraries.search.silk.web.notification;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3229r.C41732a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4313r.C56807e;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.notification.p */
/* compiled from: PG */
public final /* synthetic */ class C40853p implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkNotificationV2MessageHandler f107043a;

    /* renamed from: b */
    public final /* synthetic */ C41732a f107044b;

    public /* synthetic */ C40853p(SilkNotificationV2MessageHandler silkNotificationV2MessageHandler, C41732a aVar) {
        this.f107043a = silkNotificationV2MessageHandler;
        this.f107044b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkNotificationV2MessageHandler silkNotificationV2MessageHandler = this.f107043a;
        C41732a aVar = this.f107044b;
        C40769f fVar = silkNotificationV2MessageHandler.f107024d;
        Objects.requireNonNull(aVar);
        fVar.mo42720d(new C40844g(aVar), oVar, jSONObject, "NotificationV2", "handleNotificationClientAction", C56807e.f151588a.getParserForType());
    }
}
