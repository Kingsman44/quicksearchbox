package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider;

import android.content.Context;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders.C138630ai;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138182aq;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138183ar;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138185at;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138186au;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138187av;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138196bd;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138198bf;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.c */
/* compiled from: PG */
public final class C138268c {

    /* renamed from: a */
    public final Context f376183a;

    /* renamed from: b */
    public final C138630ai f376184b;

    public C138268c(Context context, C138630ai aiVar) {
        C69664n.m101061g(context, "context");
        this.f376183a = context;
        this.f376184b = aiVar;
    }

    /* renamed from: a */
    public final C138186au mo114223a() {
        C138183ar arVar = (C138183ar) C138186au.f375981d.createBuilder();
        C69664n.m101060f(arVar, "newBuilder()");
        C138196bd a = C69664n.m101061g(arVar, "builder");
        String string = this.f376183a.getResources().getString(17039370);
        C69664n.m101060f(string, "res.getString(android.R.string.ok)");
        a.mo114190c(string);
        a.mo114189b(C138185at.NONE);
        return a.mo114188a();
    }

    /* renamed from: b */
    public final C138186au mo114224b() {
        C138183ar arVar = (C138183ar) C138186au.f375981d.createBuilder();
        C69664n.m101060f(arVar, "newBuilder()");
        C138196bd a = C69664n.m101061g(arVar, "builder");
        String string = this.f376183a.getResources().getString(R.string.ga_report_this);
        C69664n.m101060f(string, "res.getString(R.string.ga_report_this)");
        a.mo114190c(string);
        a.mo114189b(C138185at.REPORT);
        return a.mo114188a();
    }

    /* renamed from: c */
    public final C138187av mo114225c(int i) {
        C138182aq aqVar = (C138182aq) C138187av.f375986h.createBuilder();
        C69664n.m101060f(aqVar, "newBuilder()");
        C138198bf a = C69664n.m101061g(aqVar, "builder");
        String string = this.f376183a.getResources().getString(i);
        C69664n.m101060f(string, "res.getString(messageId)");
        a.mo114196f(string);
        a.mo114195e(mo114223a());
        a.mo114194d(mo114224b());
        return a.mo114191a();
    }
}
