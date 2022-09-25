package com.google.android.libraries.search.assistant.performer.communication;

import android.telephony.PhoneNumberUtils;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.fa */
/* compiled from: PG */
public final /* synthetic */ class C35759fa implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C35759fa f93685a = new C35759fa();

    private /* synthetic */ C35759fa() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        return PhoneNumberUtils.normalizeNumber(str.substring(0, str.length() - 15));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
