package com.google.android.libraries.gsa.conversation.clientop.communication;

import android.content.Context;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.p1855h.C22695ah;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.apn;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60895di;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.communication.j */
/* compiled from: PG */
public final class C22426j extends C22538o {

    /* renamed from: a */
    public static final C59071e f61940a = C59071e.m91332i("com.google.android.libraries.gsa.conversation.clientop.communication.j");

    /* renamed from: b */
    public final Context f61941b;

    /* renamed from: c */
    public final C22695ah f61942c;

    /* renamed from: d */
    private final C60887da f61943d;

    public C22426j(Context context, C22695ah ahVar, ExecutorService executorService) {
        this.f61941b = context;
        this.f61942c = ahVar;
        this.f61943d = C60895di.m92995a(executorService);
    }

    /* renamed from: b */
    public static void m41858b(boolean z, String str) {
        if (!z) {
            ((C59052c) ((C59052c) f61940a.mo56225c()).mo56372aa(48248)).mo56389s("%s", str);
            throw new C22534k();
        }
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("video_call.CALL")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            return C60856cj.m92905n(new C22424h(this, (apn) m41992m(dwVar, "video_call_args", apn.f135563g.getParserForType())), this.f61943d);
        }
        throw new C22428d(dyVar);
    }
}
