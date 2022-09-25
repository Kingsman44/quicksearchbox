package com.google.android.libraries.p10908a.p10911c.p10913b;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.os.Bundle;
import com.google.android.libraries.p10908a.p10909a.C146618a;
import com.google.android.libraries.p10908a.p10910b.C146619a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.protos.p4816ai.p4820d.p4821a.C63213e;
import com.google.protos.p4816ai.p4820d.p4821a.C63216h;
import java.util.concurrent.ExecutorService;
import p5462h.C69613f;
import p5462h.C69747m;
import p5462h.p5473f.p5475b.C69644aa;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.a.c.b.m */
/* compiled from: PG */
public abstract class C146637m extends AppWidgetProvider {

    /* renamed from: a */
    private final C69613f f396037a = new C69747m(new C146636l(this));

    /* renamed from: c */
    private final C146640p m238870c() {
        return (C146640p) this.f396037a.mo5768a();
    }

    /* renamed from: a */
    public abstract C146642r mo110860a();

    /* renamed from: b */
    public ExecutorService mo110861b() {
        throw null;
    }

    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(appWidgetManager, "appWidgetManager");
        C69664n.m101061g(bundle, "newOptions");
        m238870c();
        C146642r a = mo110860a();
        ExecutorService b = mo110861b();
        C69664n.m101061g(a, "widgetName");
        C69664n.m101061g(context, "context");
        C69664n.m101061g(appWidgetManager, "appWidgetManager");
        C69664n.m101061g(bundle, "newOptions");
        C69664n.m101061g(b, "executorService");
        C63213e eVar = (C63213e) C63216h.f170786f.createBuilder();
        eVar.copyOnWrite();
        C63216h hVar = (C63216h) eVar.instance;
        hVar.f170789b = 5;
        hVar.f170788a |= 1;
        C146640p.m238878b(a, context, eVar);
    }

    public void onDeleted(Context context, int[] iArr) {
        Context context2 = context;
        int[] iArr2 = iArr;
        C69664n.m101061g(context2, "context");
        C69664n.m101061g(iArr2, "appWidgetIds");
        m238870c();
        C146642r a = mo110860a();
        ExecutorService b = mo110861b();
        C69664n.m101061g(a, "widgetName");
        C69664n.m101061g(context2, "context");
        C69664n.m101061g(iArr2, "appWidgetIds");
        C69664n.m101061g(b, "executorService");
        long currentTimeMillis = System.currentTimeMillis();
        C146626b a2 = C146640p.m238877a(context2, b);
        for (int i : iArr2) {
            C69648ae aeVar = new C69648ae();
            C60856cj.m92911t(C146618a.m238861a(C146619a.m238862a(((C146631g) a2).f396024b, new C146629e(aeVar, i)), new C146630f(aeVar)), new C146638n(i, currentTimeMillis, a, context), C60826bg.f164896a);
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(appWidgetManager, "appWidgetManager");
        C69664n.m101061g(iArr, "appWidgetIds");
        m238870c();
        C146642r a = mo110860a();
        ExecutorService b = mo110861b();
        C69664n.m101061g(a, "widgetName");
        C69664n.m101061g(context, "context");
        C69664n.m101061g(appWidgetManager, "appWidgetManager");
        C69664n.m101061g(iArr, "appWidgetIds");
        C69664n.m101061g(b, "executorService");
        if (r11 != 0) {
            C63213e eVar = (C63213e) C63216h.f170786f.createBuilder();
            eVar.copyOnWrite();
            C63216h hVar = (C63216h) eVar.instance;
            hVar.f170789b = 4;
            hVar.f170788a |= 1;
            C146640p.m238878b(a, context, eVar);
            C146626b a2 = C146640p.m238877a(context, b);
            for (int i : iArr) {
                long currentTimeMillis = System.currentTimeMillis();
                C69644aa aaVar = new C69644aa();
                C60856cj.m92911t(C146618a.m238861a(C146619a.m238862a(((C146631g) a2).f396024b, new C146627c(aaVar, i, currentTimeMillis)), new C146628d(aaVar)), new C146639o(a, context, i), C60826bg.f164896a);
            }
        }
    }
}
