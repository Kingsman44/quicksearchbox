package com.google.android.libraries.search.silk.web.notification;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.silk.p3205a.p3229r.C41732a;
import com.google.android.libraries.silk.p3238b.p3239a.C41743a;
import com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.silk.web.notification.i */
/* compiled from: PG */
public final /* synthetic */ class C40846i implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ SilkNotificationV2MessageHandler f107034a;

    public /* synthetic */ C40846i(SilkNotificationV2MessageHandler silkNotificationV2MessageHandler) {
        this.f107034a = silkNotificationV2MessageHandler;
    }

    public final void accept(Object obj) {
        SilkNotificationV2MessageHandler silkNotificationV2MessageHandler = this.f107034a;
        C41732a aVar = (C41732a) obj;
        ((PostMessageMixinImpl) silkNotificationV2MessageHandler.f107023c).mo46952c(R.id.get_notification_opt_in_status, C40848k.f107036a, new C40849l(silkNotificationV2MessageHandler, aVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkNotificationV2MessageHandler.f107023c).mo46952c(R.id.show_notification_opt_in_page, C40850m.f107039a, new C40851n(silkNotificationV2MessageHandler, aVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkNotificationV2MessageHandler.f107023c).mo46952c(R.id.handle_notification_client_action, C40852o.f107042a, new C40853p(silkNotificationV2MessageHandler, aVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkNotificationV2MessageHandler.f107023c).mo46952c(R.id.handle_notification_opt_in_promo_client_action, C40854q.f107045a, new C40855r(silkNotificationV2MessageHandler, aVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkNotificationV2MessageHandler.f107023c).mo46952c(R.id.render_notification_menu, C40856s.f107048a, new C40842e(silkNotificationV2MessageHandler, aVar), true, C41743a.f109088b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
