package com.google.android.apps.gsa.staticplugins.p7565bu.p7566a;

import android.content.Context;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.C90773bq;
import com.google.android.libraries.mdi.download.C28798cm;
import com.google.android.libraries.mdi.download.C28803cr;
import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.bu.a.am */
/* compiled from: PG */
public final /* synthetic */ class C96768am implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Context f270666a;

    /* renamed from: b */
    public final /* synthetic */ C90476a f270667b;

    public /* synthetic */ C96768am(Context context, C90476a aVar) {
        this.f270666a = context;
        this.f270667b = aVar;
    }

    public final Object call() {
        Context context = this.f270666a;
        C90476a aVar = this.f270667b;
        String format = String.format(Locale.US, "%s-%s", new Object[]{C90773bq.m148322d(C90773bq.m148321c(context)), aVar.mo84224a()});
        C28798cm cmVar = (C28798cm) C28803cr.f78265n.createBuilder();
        cmVar.copyOnWrite();
        C28803cr crVar = (C28803cr) cmVar.instance;
        format.getClass();
        crVar.f78267a = 2 | crVar.f78267a;
        crVar.f78269c = format;
        return (C28803cr) cmVar.build();
    }
}
