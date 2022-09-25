package com.google.android.libraries.search.assistant.performer.communication;

import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.at */
/* compiled from: PG */
public final /* synthetic */ class C35527at implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ ChatMessageExecutor f93299a;

    public /* synthetic */ C35527at(ChatMessageExecutor chatMessageExecutor) {
        this.f93299a = chatMessageExecutor;
    }

    public final Object apply(Object obj) {
        ChatMessageExecutor chatMessageExecutor = this.f93299a;
        RuntimeException runtimeException = (RuntimeException) obj;
        ((C59052c) ((C59052c) ((C59052c) ChatMessageExecutor.f93200a.mo56225c()).mo56382g(runtimeException)).mo56372aa(51615)).mo56386p("transformDoneToClientOpResult failed");
        chatMessageExecutor.f93204e.mo19974a(C37176a.f97079el.mo40805c(C62722b.INTERNAL));
        return ChatMessageExecutor.m63829a(C52235kf.INTERNAL, "RuntimeException: ".concat(String.valueOf(runtimeException.getMessage())));
    }
}
