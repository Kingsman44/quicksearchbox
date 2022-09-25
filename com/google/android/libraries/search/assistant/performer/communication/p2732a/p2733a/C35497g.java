package com.google.android.libraries.search.assistant.performer.communication.p2732a.p2733a;

import android.provider.CallLog;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.a.a.g */
/* compiled from: PG */
public final /* synthetic */ class C35497g implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C35505o f93221a;

    /* renamed from: b */
    public final /* synthetic */ String f93222b;

    public /* synthetic */ C35497g(C35505o oVar, String str) {
        this.f93221a = oVar;
        this.f93222b = str;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C35505o oVar = this.f93221a;
        return oVar.f93235h.f93241e.mo50872b(CallLog.Calls.CONTENT_URI.buildUpon().appendQueryParameter("limit", "1").build(), new String[]{"duration", "number", "type", "date", "last_modified"}, (String) null, (String[]) null, "date DESC").f121591a.mo57272e(C47810es.m84970j(new C35496f(oVar, this.f93222b)), oVar.f93235h.f93239c).mo57275g();
    }
}
