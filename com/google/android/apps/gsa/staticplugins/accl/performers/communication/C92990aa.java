package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.staticplugins.accl.performers.p7352m.C93223a;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.aa */
/* compiled from: PG */
public final /* synthetic */ class C92990aa implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ ChatPerformer f259416a;

    /* renamed from: b */
    public final /* synthetic */ C22434e f259417b;

    /* renamed from: c */
    public final /* synthetic */ C51809dy f259418c;

    /* renamed from: d */
    public final /* synthetic */ C89849ae f259419d;

    public /* synthetic */ C92990aa(ChatPerformer chatPerformer, C22434e eVar, C51809dy dyVar, C89849ae aeVar) {
        this.f259416a = chatPerformer;
        this.f259417b = eVar;
        this.f259418c = dyVar;
        this.f259419d = aeVar;
    }

    public final Object apply(Object obj) {
        ChatPerformer chatPerformer = this.f259416a;
        C22434e eVar = this.f259417b;
        C51809dy dyVar = this.f259418c;
        C89849ae aeVar = this.f259419d;
        C118826c cVar = (C118826c) obj;
        C93223a.m153296b(chatPerformer.f259397i, eVar, dyVar.f135936b, "SUCCESS");
        chatPerformer.f259395g.mo27820i(dyVar, C58833ax.m90833j(eVar));
        chatPerformer.mo87504g(aeVar, eVar);
        chatPerformer.mo87505h();
        return C22402a.f61894b;
    }
}
