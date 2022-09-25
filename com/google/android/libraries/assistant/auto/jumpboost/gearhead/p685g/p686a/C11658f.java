package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p685g.p686a;

import android.content.Context;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1310a.p1311a.C16618c;
import com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification;
import com.google.android.libraries.search.assistant.notification.p2709a.C34837a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.g.a.f */
/* compiled from: PG */
public final class C11658f implements C34837a {

    /* renamed from: a */
    public static final C59071e f37632a = C59071e.m91332i("com.google.android.libraries.assistant.auto.jumpboost.gearhead.g.a.f");

    /* renamed from: b */
    public final Context f37633b;

    /* renamed from: c */
    public final Executor f37634c;

    /* renamed from: d */
    public final C16618c f37635d;

    /* renamed from: e */
    private final C34837a f37636e;

    public C11658f(Context context, Executor executor, C34837a aVar, C16618c cVar) {
        this.f37633b = context;
        this.f37634c = executor;
        this.f37636e = aVar;
        this.f37635d = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo20103a(BundledMessageNotification bundledMessageNotification, int i, boolean z) {
        C60870cx a = this.f37636e.mo20103a(bundledMessageNotification, i, z);
        C11653a aVar = new C11653a(this, bundledMessageNotification);
        return C60922j.m93045h(a, C47810es.m84966f(aVar), this.f37634c);
    }

    /* renamed from: b */
    public final C60870cx mo20104b(List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(mo20103a((BundledMessageNotification) list.get(i), i, z));
        }
        return C47633f.m84733g(C60856cj.m92896e(arrayList)).mo51515h(C11656d.f37630a, this.f37634c);
    }
}
