package com.google.android.libraries.gsa.conversation.p1837a;

import androidx.p104d.p105a.C2169h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.conversation.p1852f.C22587n;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63088z;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.gsa.conversation.a.aa */
/* compiled from: PG */
public final /* synthetic */ class C22310aa implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C22312ac f61613a;

    public /* synthetic */ C22310aa(C22312ac acVar) {
        this.f61613a = acVar;
    }

    public final C60870cx apply(Object obj) {
        C22312ac acVar = this.f61613a;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return C118826c.f331423b;
        }
        C22343x xVar = acVar.f61616b;
        C63088z b = ((C22587n) axVar.mo56107c()).mo27672b();
        return C60922j.m93044g(C60856cj.m92908q(C2169h.m6027a(new C22340u(xVar, b)), 1, TimeUnit.MINUTES, acVar.f61615a), C47810es.m84963c(C22311ab.f61614a), C60826bg.f164896a);
    }
}
