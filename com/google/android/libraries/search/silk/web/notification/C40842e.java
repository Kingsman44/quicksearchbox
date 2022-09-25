package com.google.android.libraries.search.silk.web.notification;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3229r.C41732a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4313r.C56811i;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.notification.e */
/* compiled from: PG */
public final /* synthetic */ class C40842e implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkNotificationV2MessageHandler f107029a;

    /* renamed from: b */
    public final /* synthetic */ C41732a f107030b;

    public /* synthetic */ C40842e(SilkNotificationV2MessageHandler silkNotificationV2MessageHandler, C41732a aVar) {
        this.f107029a = silkNotificationV2MessageHandler;
        this.f107030b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkNotificationV2MessageHandler silkNotificationV2MessageHandler = this.f107029a;
        C41732a aVar = this.f107030b;
        C40769f fVar = silkNotificationV2MessageHandler.f107024d;
        Objects.requireNonNull(aVar);
        fVar.mo42722f(new C40847j(aVar), oVar, jSONObject, "NotificationV2", "renderNotificationMenu", C56811i.f151593a.getParserForType());
    }
}
