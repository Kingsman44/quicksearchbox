package com.google.android.libraries.search.assistant.performer.communication;

import android.net.Uri;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.aq */
/* compiled from: PG */
public final /* synthetic */ class C35524aq implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ ChatMessageExecutor f93291a;

    /* renamed from: b */
    public final /* synthetic */ String f93292b;

    public /* synthetic */ C35524aq(ChatMessageExecutor chatMessageExecutor, String str) {
        this.f93291a = chatMessageExecutor;
        this.f93292b = str;
    }

    public final void accept(Object obj) {
        this.f93291a.f93202c.grantUriPermission(this.f93292b, (Uri) obj, 1);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
