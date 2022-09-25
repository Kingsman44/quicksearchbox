package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.staticplugins.accl.performers.p7352m.C93223a;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.ab */
/* compiled from: PG */
public final /* synthetic */ class C92991ab implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ ChatPerformer f259420a;

    /* renamed from: b */
    public final /* synthetic */ C22434e f259421b;

    /* renamed from: c */
    public final /* synthetic */ C51809dy f259422c;

    public /* synthetic */ C92991ab(ChatPerformer chatPerformer, C22434e eVar, C51809dy dyVar) {
        this.f259420a = chatPerformer;
        this.f259421b = eVar;
        this.f259422c = dyVar;
    }

    public final Object apply(Object obj) {
        ChatPerformer chatPerformer = this.f259420a;
        C22434e eVar = this.f259421b;
        C93223a.m153296b(chatPerformer.f259397i, eVar, this.f259422c.f135936b, "SEND_MSG_FAILED");
        chatPerformer.mo87504g(C89849ae.OPA_CHAT_PERFORMER_SEND_MSG_FAILED, eVar);
        chatPerformer.mo87505h();
        return ChatPerformer.m153032b(C52235kf.INTERNAL, "RuntimeException: ".concat(String.valueOf(((RuntimeException) obj).getMessage())));
    }
}
