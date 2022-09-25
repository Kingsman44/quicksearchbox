package com.google.android.libraries.p10908a.p10911c.p10912a;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import com.google.android.libraries.storage.protostore.C42880af;
import com.google.android.libraries.storage.protostore.C42936cd;
import com.google.android.libraries.storage.protostore.C42937ce;
import com.google.android.libraries.storage.protostore.C42939cg;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.a.c.a.b */
/* compiled from: PG */
public final class C146622b implements C146624d {

    /* renamed from: e */
    private static final C42937ce f396007e = C146621a.f396006a;

    /* renamed from: a */
    public final Context f396008a;

    /* renamed from: b */
    public final C42880af f396009b;

    /* renamed from: c */
    public final List f396010c;

    public C146622b(Context context, C42880af afVar, ExecutorService executorService) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(executorService, "executorService");
        this.f396008a = context;
        this.f396009b = afVar;
        AppWidgetManager instance = AppWidgetManager.getInstance(context);
        Iterable<AppWidgetProviderInfo> installedProviders = instance != null ? instance.getInstalledProviders() : null;
        installedProviders = installedProviders == null ? C69496am.f185918a : installedProviders;
        ArrayList arrayList = new ArrayList(C69540x.m100804k(installedProviders, 10));
        for (AppWidgetProviderInfo appWidgetProviderInfo : installedProviders) {
            C42936cd d = C42939cg.m75826d(this.f396008a.getApplicationContext(), executorService);
            d.f112321c = appWidgetProviderInfo.provider.getClassName();
            C58526ih ihVar = new C58526ih();
            ihVar.mo55488h("ids");
            C58528ij f = ihVar.mo55486f();
            C58838bb.m90869d(f.size() == 1, "Duplicate keys specified");
            d.f112322d = f;
            d.f112323e = false;
            d.f112324f = true;
            d.mo46009c(f396007e);
            arrayList.add(d.mo46007a());
        }
        this.f396010c = arrayList;
    }
}
