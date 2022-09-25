package com.google.android.libraries.search.assistant.notification.data.p2713a;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.notification.data.MessageNotification;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.notification.data.a.d */
/* compiled from: PG */
public final /* synthetic */ class C34876d implements Function {

    /* renamed from: a */
    public final /* synthetic */ Context f92510a;

    public /* synthetic */ C34876d(Context context) {
        this.f92510a = context;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        MessageNotification messageNotification = (MessageNotification) obj;
        return String.format(this.f92510a.getString(R.string.notification_group_message_format), new Object[]{messageNotification.mo39562s(), messageNotification.mo39557n().orElse(BuildConfig.FLAVOR)});
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
