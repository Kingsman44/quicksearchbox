package com.google.android.apps.search.googleapp.searchwidget;

import android.appwidget.AppWidgetManager;
import android.os.Bundle;
import android.widget.RemoteViews;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.searchwidget.SearchWidgetProviderImpl$updateSearchWidget$1", mo61344c = "SearchWidgetProviderImpl.kt", mo61345d = "invokeSuspend", mo61346e = {93})
/* renamed from: com.google.android.apps.search.googleapp.searchwidget.l */
/* compiled from: PG */
final class C139034l extends C69572j implements C69630p {

    /* renamed from: a */
    int f378115a;

    /* renamed from: b */
    final /* synthetic */ C139035m f378116b;

    /* renamed from: c */
    final /* synthetic */ Bundle f378117c;

    /* renamed from: d */
    final /* synthetic */ int f378118d;

    /* renamed from: e */
    final /* synthetic */ AppWidgetManager f378119e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C139034l(C139035m mVar, Bundle bundle, int i, AppWidgetManager appWidgetManager, C69577g gVar) {
        super(2, gVar);
        this.f378116b = mVar;
        this.f378117c = bundle;
        this.f378118d = i;
        this.f378119e = appWidgetManager;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C139034l) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f378115a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C139130u uVar = this.f378116b.f378120a;
            Bundle bundle = this.f378117c;
            int i = this.f378118d;
            this.f378115a = 1;
            obj = uVar.mo114752c(bundle, i, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        this.f378119e.updateAppWidget(this.f378118d, (RemoteViews) obj);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C139034l(this.f378116b, this.f378117c, this.f378118d, this.f378119e, gVar);
    }
}
