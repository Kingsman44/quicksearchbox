package com.google.android.libraries.appdoctor.p573a;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.libs.p10836d.p10839c.C144859a;
import com.google.android.gms.libs.p10836d.p10839c.C144860b;
import com.google.android.libraries.appdoctor.p575c.C10474f;
import com.google.android.libraries.appdoctor.p575c.C10475g;
import com.google.android.libraries.storage.p3304a.p3305a.C42718e;
import com.google.android.libraries.storage.p3304a.p3305a.C42719f;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.android.libraries.storage.protostore.C42877ac;
import com.google.android.libraries.storage.protostore.C42878ad;
import com.google.android.libraries.storage.protostore.C42880af;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.libraries.appdoctor.a.n */
/* compiled from: PG */
final class C10457n implements C10445b {

    /* renamed from: a */
    final C42876ab f35211a;

    /* renamed from: b */
    final Executor f35212b;

    public C10457n(Context context) {
        C42880af a = C10475g.m25447a(context);
        C144859a aVar = C144860b.f391709a;
        ExecutorService a2 = C144859a.m235445a(4, Executors.defaultThreadFactory());
        C42718e a3 = C42719f.m75461a(context);
        C42719f.m75463c("app_doctor");
        a3.f111968c = "app_doctor";
        a3.mo45821b("AppDoctor.pb");
        Uri a4 = a3.mo45820a();
        C42877ac i = C42878ad.m75739i();
        i.mo45968e(a4);
        i.mo45967d(C10474f.f35237b);
        this.f35211a = a.mo45979a(i.mo45964a());
        this.f35212b = a2;
    }
}
