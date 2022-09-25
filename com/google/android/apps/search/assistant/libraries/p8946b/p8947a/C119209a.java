package com.google.android.apps.search.assistant.libraries.p8946b.p8947a;

import com.google.assistant.p3897e.p3921j.C52427ri;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.common.base.C58837ba;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.libraries.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C119209a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f332463a;

    public /* synthetic */ C119209a(C60870cx cxVar) {
        this.f332463a = cxVar;
    }

    public final Object call() {
        C60870cx cxVar = this.f332463a;
        C52427ri riVar = (C52427ri) C52428rj.f137558m.createBuilder();
        String str = (String) C60856cj.m92909r(cxVar);
        if (!C58837ba.m90859h(str)) {
            riVar.copyOnWrite();
            C52428rj rjVar = (C52428rj) riVar.instance;
            str.getClass();
            rjVar.f137560a |= 16;
            rjVar.f137564e = str;
        }
        return (C52428rj) riVar.build();
    }
}
