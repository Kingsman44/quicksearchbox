package com.google.android.libraries.search.assistant.performer.communication;

import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.au */
/* compiled from: PG */
public final /* synthetic */ class C35528au implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ ChatMessageExecutor f93300a;

    /* renamed from: b */
    public final /* synthetic */ boolean f93301b;

    /* renamed from: c */
    public final /* synthetic */ C37252a f93302c;

    public /* synthetic */ C35528au(ChatMessageExecutor chatMessageExecutor, boolean z, C37252a aVar) {
        this.f93300a = chatMessageExecutor;
        this.f93301b = z;
        this.f93302c = aVar;
    }

    public final Object apply(Object obj) {
        ChatMessageExecutor chatMessageExecutor = this.f93300a;
        boolean z = this.f93301b;
        C37252a aVar = this.f93302c;
        TimeoutException timeoutException = (TimeoutException) obj;
        if (z) {
            chatMessageExecutor.f93204e.mo19974a(aVar);
            return C36180b.f94545b;
        }
        ((C59052c) ((C59052c) ((C59052c) ChatMessageExecutor.f93200a.mo56225c()).mo56382g(timeoutException)).mo56372aa(51616)).mo56386p("transformDoneToClientOpResult failed");
        chatMessageExecutor.f93204e.mo19974a(C37176a.f97079el.mo40805c(C62722b.INTERNAL));
        return ChatMessageExecutor.m63829a(C52235kf.INTERNAL, "TimeoutException: ".concat(String.valueOf(timeoutException.getMessage())));
    }
}
