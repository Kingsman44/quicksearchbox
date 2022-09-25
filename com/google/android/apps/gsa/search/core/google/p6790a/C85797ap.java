package com.google.android.apps.gsa.search.core.google.p6790a;

import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.assistant.p3897e.p3917i.p3918a.C51303cs;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.assistant.p3897e.p3921j.C52427ri;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.common.base.C58837ba;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.ap */
/* compiled from: PG */
public final /* synthetic */ class C85797ap implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C85799ar f231962a;

    /* renamed from: b */
    public final /* synthetic */ C51303cs f231963b;

    /* renamed from: c */
    public final /* synthetic */ Query f231964c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f231965d;

    public /* synthetic */ C85797ap(C85799ar arVar, C51303cs csVar, Query query, C60870cx cxVar) {
        this.f231962a = arVar;
        this.f231963b = csVar;
        this.f231964c = query;
        this.f231965d = cxVar;
    }

    public final Object call() {
        C85799ar arVar = this.f231962a;
        C51303cs csVar = this.f231963b;
        Query query = this.f231964c;
        C60870cx cxVar = this.f231965d;
        arVar.mo79446b(csVar, query);
        String str = (String) C60856cj.m92909r(cxVar);
        if (arVar.f231983b.mo79746e(C90014bt.f247382gB) && !C58837ba.m90859h(str)) {
            C52428rj rjVar = ((C51334dw) csVar.instance).f133696j;
            if (rjVar == null) {
                rjVar = C52428rj.f137558m;
            }
            C52427ri riVar = (C52427ri) rjVar.toBuilder();
            riVar.copyOnWrite();
            C52428rj rjVar2 = (C52428rj) riVar.instance;
            str.getClass();
            rjVar2.f137560a |= 2;
            rjVar2.f137561b = str;
            C52428rj rjVar3 = (C52428rj) riVar.build();
            csVar.copyOnWrite();
            C51334dw dwVar = (C51334dw) csVar.instance;
            rjVar3.getClass();
            dwVar.f133696j = rjVar3;
            dwVar.f133685a |= 256;
        }
        return csVar;
    }
}
