package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29402ez;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: com.google.android.libraries.mdi.download.d.gz */
/* compiled from: PG */
public final /* synthetic */ class C29165gz implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C29170hd f79084a;

    /* renamed from: b */
    public final /* synthetic */ List f79085b;

    /* renamed from: c */
    public final /* synthetic */ List f79086c;

    /* renamed from: d */
    public final /* synthetic */ Boolean f79087d;

    public /* synthetic */ C29165gz(C29170hd hdVar, List list, List list2, Boolean bool) {
        this.f79084a = hdVar;
        this.f79085b = list;
        this.f79086c = list2;
        this.f79087d = bool;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C29170hd hdVar = this.f79084a;
        List list = this.f79085b;
        List list2 = this.f79086c;
        Boolean bool = this.f79087d;
        C60870cx i = C60856cj.m92900i(true);
        for (int i2 = 0; i2 < list.size(); i2++) {
            C29163gx gxVar = new C29163gx(hdVar, (C29398ev) list.get(i2), (C29402ez) C60856cj.m92909r((Future) list2.get(i2)));
            i = C60922j.m93045h(i, C47810es.m84966f(gxVar), hdVar.f79097d);
        }
        C29164gy gyVar = new C29164gy(bool);
        return C60922j.m93044g(i, C47810es.m84963c(gyVar), hdVar.f79097d);
    }
}
