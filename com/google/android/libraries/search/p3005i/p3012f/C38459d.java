package com.google.android.libraries.search.p3005i.p3012f;

import com.google.assistant.p3897e.p3921j.C52427ri;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.common.base.C58837ba;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.i.f.d */
/* compiled from: PG */
public final /* synthetic */ class C38459d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f101783a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f101784b;

    public /* synthetic */ C38459d(C60870cx cxVar, C60870cx cxVar2) {
        this.f101783a = cxVar;
        this.f101784b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f101783a;
        C60870cx cxVar2 = this.f101784b;
        C52427ri riVar = (C52427ri) C52428rj.f137558m.createBuilder();
        String str = (String) C60856cj.m92909r(cxVar);
        if (!C58837ba.m90859h(str)) {
            riVar.copyOnWrite();
            C52428rj rjVar = (C52428rj) riVar.instance;
            str.getClass();
            rjVar.f137560a |= 2;
            rjVar.f137561b = str;
        }
        String str2 = (String) C60856cj.m92909r(cxVar2);
        if (!C58837ba.m90859h(str2)) {
            riVar.copyOnWrite();
            C52428rj rjVar2 = (C52428rj) riVar.instance;
            str2.getClass();
            rjVar2.f137560a |= 8;
            rjVar2.f137563d = str2;
        }
        return (C52428rj) riVar.build();
    }
}
