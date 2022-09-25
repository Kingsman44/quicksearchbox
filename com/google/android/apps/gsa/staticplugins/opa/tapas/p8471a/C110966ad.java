package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.ad */
/* compiled from: PG */
public final /* synthetic */ class C110966ad implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C110972aj f309136a;

    /* renamed from: b */
    public final /* synthetic */ String f309137b;

    public /* synthetic */ C110966ad(C110972aj ajVar, String str) {
        this.f309136a = ajVar;
        this.f309137b = str;
    }

    public final Object call() {
        C110972aj ajVar = this.f309136a;
        String str = this.f309137b;
        if (!((Boolean) C60856cj.m92909r(ajVar.mo99001g(str))).booleanValue()) {
            return C58485gu.m89845m();
        }
        Map map = (Map) C60856cj.m92909r(ajVar.f309148e);
        map.getClass();
        map.get(str.trim());
        List list = (List) ((Map) C60856cj.m92909r(ajVar.f309148e)).get(str.trim());
        list.getClass();
        return C58485gu.m89842j(list);
    }
}
