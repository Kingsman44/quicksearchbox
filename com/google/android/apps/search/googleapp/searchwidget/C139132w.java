package com.google.android.apps.search.googleapp.searchwidget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71760h;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.searchwidget.SearchWidgetRouterImpl$onUpdateDefaultSearchProviderAndLog$1", mo61344c = "SearchWidgetRouterImpl.kt", mo61345d = "invokeSuspend", mo61346e = {107})
/* renamed from: com.google.android.apps.search.googleapp.searchwidget.w */
/* compiled from: PG */
final class C139132w extends C69572j implements C69630p {

    /* renamed from: a */
    int f378386a;

    /* renamed from: b */
    final /* synthetic */ C139134y f378387b;

    /* renamed from: c */
    final /* synthetic */ Context f378388c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C139132w(C139134y yVar, Context context, C69577g gVar) {
        super(2, gVar);
        this.f378387b = yVar;
        this.f378388c = context;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C139132w) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f378386a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C139033k kVar = this.f378387b.f378392a;
            AppWidgetManager instance = AppWidgetManager.getInstance(this.f378388c);
            C69664n.m101060f(instance, "getInstance(context)");
            int[] p = this.f378387b.f378393b.mo114766p();
            this.f378386a = 1;
            ArrayList arrayList = new ArrayList(r3);
            for (int i : p) {
                Bundle appWidgetOptions = instance.getAppWidgetOptions(i);
                C69664n.m101060f(appWidgetOptions, "options");
                arrayList.add(((C139035m) kVar).mo114662a(appWidgetOptions, instance, i));
            }
            Object b = C71760h.m104950b(arrayList, this);
            if (b != C69554a.COROUTINE_SUSPENDED) {
                b = C69788q.f186170a;
            }
            if (b == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C139132w(this.f378387b, this.f378388c, gVar);
    }
}
