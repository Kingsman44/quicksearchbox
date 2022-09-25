package com.google.android.libraries.gsa.conversation.clientop.communication;

import android.content.Context;
import android.telecom.TelecomManager;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.CallExecutor;
import com.google.android.libraries.gsa.conversation.clientop.communication.p1843a.C22411a;
import com.google.android.libraries.gsa.conversation.clientop.communication.p1843a.C22412b;
import com.google.android.libraries.gsa.conversation.p1855h.C22695ah;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52289mf;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60895di;
import dagger.C68214a;
import java.util.concurrent.ExecutorService;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.communication.c */
/* compiled from: PG */
public final class C22414c extends C22538o {

    /* renamed from: a */
    public final CallExecutor f61909a;

    /* renamed from: b */
    private final C60887da f61910b;

    public C22414c(Context context, C22695ah ahVar, C68214a aVar, ExecutorService executorService) {
        this.f61909a = new CallExecutor(context, ahVar, aVar, executorService, (TelecomManager) null, (C22412b) null, (C22411a) null, new C22413b(), Optional.empty());
        this.f61910b = C60895di.m92995a(executorService);
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("call.CALL")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            return C60856cj.m92905n(new C22410a(this, (C52289mf) m41992m(dwVar, "call_client_op_args", C52289mf.f137258j.getParserForType())), this.f61910b);
        }
        throw new C22428d(dyVar);
    }
}
