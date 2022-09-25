package com.google.android.apps.gsa.staticplugins.p7327ac;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p343ac.p346b.p347a.C6625b;
import com.google.p343ac.p346b.p347a.C6636m;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.ac.a */
/* compiled from: PG */
public final /* synthetic */ class C92692a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f258731a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f258732b;

    /* renamed from: c */
    public final /* synthetic */ String f258733c;

    /* renamed from: d */
    public final /* synthetic */ String f258734d;

    public /* synthetic */ C92692a(C60870cx cxVar, C60870cx cxVar2, String str, String str2) {
        this.f258731a = cxVar;
        this.f258732b = cxVar2;
        this.f258733c = str;
        this.f258734d = str2;
    }

    public final Object call() {
        C60870cx cxVar = this.f258731a;
        C60870cx cxVar2 = this.f258732b;
        String str = this.f258733c;
        String str2 = this.f258734d;
        Map map = (Map) C60856cj.m92909r(cxVar);
        C6625b bVar = (C6625b) C6636m.f19775aC.createBuilder();
        int intValue = C92701h.m152676c(map, str).intValue();
        bVar.copyOnWrite();
        ((C6636m) bVar.instance).f19827av = intValue;
        int intValue2 = C92701h.m152676c(map, str2).intValue();
        bVar.copyOnWrite();
        ((C6636m) bVar.instance).f19828aw = intValue2;
        int intValue3 = C92701h.m152676c((Map) C60856cj.m92909r(cxVar2), str).intValue();
        bVar.copyOnWrite();
        ((C6636m) bVar.instance).f19829ax = intValue3;
        return (C6636m) bVar.build();
    }
}
