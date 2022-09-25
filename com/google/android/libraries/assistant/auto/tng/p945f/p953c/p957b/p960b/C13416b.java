package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p960b;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.notification.data.MessageNotification;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.b.b.b */
/* compiled from: PG */
public final /* synthetic */ class C13416b implements Function {

    /* renamed from: a */
    public final /* synthetic */ Context f41220a;

    public /* synthetic */ C13416b(Context context) {
        this.f41220a = context;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        MessageNotification messageNotification = (MessageNotification) obj;
        String string = this.f41220a.getString(R.string.sender_message_format_for_group_message_notifications);
        Object[] objArr = new Object[2];
        objArr[0] = messageNotification.mo39562s();
        objArr[1] = messageNotification.mo39557n().isPresent() ? ((CharSequence) messageNotification.mo39557n().get()).toString() : BuildConfig.FLAVOR;
        return String.format(string, objArr);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
