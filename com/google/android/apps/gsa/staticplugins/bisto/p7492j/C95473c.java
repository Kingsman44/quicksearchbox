package com.google.android.apps.gsa.staticplugins.bisto.p7492j;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.gsa.staticplugins.bisto.p7534y.C96632b;
import com.google.android.libraries.storage.p3304a.p3305a.C42718e;
import com.google.android.libraries.storage.p3304a.p3305a.C42719f;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.android.libraries.storage.protostore.C42877ac;
import com.google.android.libraries.storage.protostore.C42878ad;
import com.google.android.libraries.storage.protostore.C42880af;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.j.c */
/* compiled from: PG */
public final class C95473c {

    /* renamed from: a */
    public final C68214a f267160a;

    /* renamed from: b */
    private final C42880af f267161b;

    /* renamed from: c */
    private final Uri f267162c;

    public C95473c(Context context, C42880af afVar, C68214a aVar) {
        C42718e a = C42719f.m75461a(context);
        C42719f.m75463c("bisto");
        a.f111968c = "bisto";
        a.mo45821b("NotificationAccessRequestTracking.pb");
        this.f267162c = a.mo45820a();
        this.f267161b = afVar;
        this.f267160a = aVar;
    }

    /* renamed from: a */
    public final C42876ab mo89379a() {
        C42880af afVar = this.f267161b;
        C42877ac i = C42878ad.m75739i();
        i.mo45968e(this.f267162c);
        i.mo45967d(C96632b.f270318e);
        return afVar.mo45979a(i.mo45964a());
    }
}
