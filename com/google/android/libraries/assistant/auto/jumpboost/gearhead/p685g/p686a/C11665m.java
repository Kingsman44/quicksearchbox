package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p685g.p686a;

import android.telephony.SmsMessage;
import com.google.android.gearhead.sdk.assistant.MessagingInfo;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.g.a.m */
/* compiled from: PG */
public final /* synthetic */ class C11665m implements Function {

    /* renamed from: a */
    public final /* synthetic */ C11668p f37646a;

    /* renamed from: b */
    public final /* synthetic */ MessagingInfo f37647b;

    public /* synthetic */ C11665m(C11668p pVar, MessagingInfo messagingInfo) {
        this.f37646a = pVar;
        this.f37647b = messagingInfo;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C11668p pVar = this.f37646a;
        MessagingInfo messagingInfo = this.f37647b;
        SmsMessage createFromPdu = SmsMessage.createFromPdu((byte[]) obj);
        if (createFromPdu == null) {
            return null;
        }
        return pVar.mo20105c(createFromPdu.getMessageBody(), messagingInfo.f387117c, createFromPdu.getTimestampMillis(), true, messagingInfo);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
