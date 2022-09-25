package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.staticplugins.accl.performers.p7352m.C93223a;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.n */
/* compiled from: PG */
public final /* synthetic */ class C93042n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ ChatPerformer f259542a;

    /* renamed from: b */
    public final /* synthetic */ C22434e f259543b;

    /* renamed from: c */
    public final /* synthetic */ C51809dy f259544c;

    public /* synthetic */ C93042n(ChatPerformer chatPerformer, C22434e eVar, C51809dy dyVar) {
        this.f259542a = chatPerformer;
        this.f259543b = eVar;
        this.f259544c = dyVar;
    }

    public final Object apply(Object obj) {
        ChatPerformer chatPerformer = this.f259542a;
        C22434e eVar = this.f259543b;
        C51809dy dyVar = this.f259544c;
        chatPerformer.mo87505h();
        C93223a.m153296b(chatPerformer.f259397i, eVar, dyVar.f135936b, "SEND_MSG_FAILED");
        chatPerformer.mo87504g(C89849ae.OPA_CHAT_PERFORMER_SEND_MSG_FAILED, eVar);
        return C22402a.m41822b(C52235kf.INTERNAL, "Exception: ".concat(String.valueOf(((Exception) obj).getMessage())));
    }
}
