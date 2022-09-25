package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p685g.p686a;

import com.google.android.libraries.search.assistant.notification.data.C34891l;
import com.google.android.libraries.search.assistant.notification.data.MessageNotification;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.g.a.g */
/* compiled from: PG */
public final /* synthetic */ class C11659g implements Function {

    /* renamed from: a */
    public final /* synthetic */ MessageNotification.Actions f37637a;

    public /* synthetic */ C11659g(MessageNotification.Actions actions) {
        this.f37637a = actions;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        MessageNotification.Actions actions = this.f37637a;
        C34891l a = ((MessageNotification) obj).mo39542a();
        a.mo39590b(actions);
        return a.mo39589a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
