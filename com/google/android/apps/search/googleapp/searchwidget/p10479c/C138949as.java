package com.google.android.apps.search.googleapp.searchwidget.p10479c;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.c.as */
/* compiled from: PG */
public final /* synthetic */ class C138949as implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C138963bf f377902a;

    public /* synthetic */ C138949as(C138963bf bfVar) {
        this.f377902a = bfVar;
    }

    public final C60870cx apply(Object obj) {
        C138963bf bfVar = this.f377902a;
        if (((Boolean) obj).booleanValue()) {
            return bfVar.mo114642a();
        }
        ((C59052c) ((C59052c) C138963bf.f377919a.mo56224b()).mo56372aa(41334)).mo56386p("Network Time not valid, clear cache.");
        C60870cx a = bfVar.f377920b.mo114648a();
        C60931s f = C47810es.m84966f(new C138960bc(bfVar));
        return C60922j.m93045h(a, C47810es.m84966f(f), bfVar.f377925g);
    }
}
