package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.staticplugins.accl.performers.p7352m.C93223a;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.m */
/* compiled from: PG */
public final /* synthetic */ class C93041m implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ ChatPerformer f259537a;

    /* renamed from: b */
    public final /* synthetic */ boolean f259538b;

    /* renamed from: c */
    public final /* synthetic */ C22434e f259539c;

    /* renamed from: d */
    public final /* synthetic */ C51809dy f259540d;

    /* renamed from: e */
    public final /* synthetic */ C89849ae f259541e;

    public /* synthetic */ C93041m(ChatPerformer chatPerformer, boolean z, C22434e eVar, C51809dy dyVar, C89849ae aeVar) {
        this.f259537a = chatPerformer;
        this.f259538b = z;
        this.f259539c = eVar;
        this.f259540d = dyVar;
        this.f259541e = aeVar;
    }

    public final Object apply(Object obj) {
        ChatPerformer chatPerformer = this.f259537a;
        boolean z = this.f259538b;
        C22434e eVar = this.f259539c;
        C51809dy dyVar = this.f259540d;
        C89849ae aeVar = this.f259541e;
        TimeoutException timeoutException = (TimeoutException) obj;
        chatPerformer.mo87505h();
        if (z) {
            C93223a.m153296b(chatPerformer.f259397i, eVar, dyVar.f135936b, "SUCCESS");
            chatPerformer.mo87504g(aeVar, eVar);
            return C22402a.f61894b;
        }
        C93223a.m153296b(chatPerformer.f259397i, eVar, dyVar.f135936b, "TIME_OUT");
        chatPerformer.mo87504g(C89849ae.OPA_CHAT_PERFORMER_SEND_MSG_FAILED, eVar);
        return ChatPerformer.m153032b(C52235kf.INTERNAL, "TimeoutException: ".concat(String.valueOf(timeoutException.getMessage())));
    }
}
