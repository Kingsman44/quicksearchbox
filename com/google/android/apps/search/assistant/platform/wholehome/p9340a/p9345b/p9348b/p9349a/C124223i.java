package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9348b.p9349a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.b.a.i */
/* compiled from: PG */
public final /* synthetic */ class C124223i implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C124234t f343005a;

    /* renamed from: b */
    public final /* synthetic */ String f343006b;

    /* renamed from: c */
    public final /* synthetic */ String f343007c;

    public /* synthetic */ C124223i(C124234t tVar, String str, String str2) {
        this.f343005a = tVar;
        this.f343006b = str;
        this.f343007c = str2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C124234t tVar = this.f343005a;
        String str = this.f343006b;
        String str2 = this.f343007c;
        if (!((Boolean) tVar.f343030i.mo17428b()).booleanValue()) {
            return C60856cj.m92899h(new IllegalStateException("Context broadcast is not enabled in gmscore implementation."));
        }
        if (!str.equals(tVar.f343032k)) {
            ((C59052c) ((C59052c) C124234t.f343022a.mo56226d()).mo56372aa(36120)).mo56386p("OnContextInvalidated received for non primary connection, ignored");
            return C60866ct.f164955a;
        }
        ((C59052c) ((C59052c) C124234t.f343022a.mo56224b()).mo56372aa(36119)).mo56354G("Invalidated ContextKey: %s, connection id: %s.", str2, str);
        return tVar.mo106339b(str, C58485gu.m89846n(str2));
    }
}
