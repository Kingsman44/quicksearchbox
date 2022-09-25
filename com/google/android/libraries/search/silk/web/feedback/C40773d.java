package com.google.android.libraries.search.silk.web.feedback;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.silk.p3205a.p3221j.C41724a;
import com.google.android.libraries.silk.p3238b.p3239a.C41743a;
import com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.silk.web.feedback.d */
/* compiled from: PG */
public final /* synthetic */ class C40773d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ SilkFeedbackMessageHandler f106900a;

    public /* synthetic */ C40773d(SilkFeedbackMessageHandler silkFeedbackMessageHandler) {
        this.f106900a = silkFeedbackMessageHandler;
    }

    public final void accept(Object obj) {
        SilkFeedbackMessageHandler silkFeedbackMessageHandler = this.f106900a;
        ((PostMessageMixinImpl) silkFeedbackMessageHandler.f106894c).mo46952c(R.id.show_feedback_window, C40774e.f106901a, new C40775f(silkFeedbackMessageHandler, (C41724a) obj), true, C41743a.f109088b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
