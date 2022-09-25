package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p681d;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.assistant.auto.jumpboost.C11421a;
import com.google.android.libraries.assistant.auto.jumpboost.C11446b;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3305a.C42715b;
import com.google.android.libraries.storage.p3304a.p3305a.C42716c;
import com.google.android.libraries.storage.p3304a.p3305a.C42718e;
import com.google.android.libraries.storage.p3304a.p3305a.C42719f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.p4553a.C59473ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.d.b */
/* compiled from: PG */
public final class C11636b {

    /* renamed from: a */
    public static final C59071e f37591a = C59071e.m91332i("com.google.android.libraries.assistant.auto.jumpboost.gearhead.d.b");

    /* renamed from: b */
    public final Uri f37592b;

    /* renamed from: c */
    public final C42813k f37593c;

    /* renamed from: d */
    public final C11421a f37594d = ((C11421a) C11446b.f37230b.createBuilder());

    /* renamed from: e */
    public String f37595e;

    /* renamed from: f */
    public Long f37596f;

    /* renamed from: g */
    public Long f37597g;

    /* renamed from: h */
    private final C60887da f37598h;

    public C11636b(C60887da daVar, Context context) {
        this.f37598h = daVar;
        this.f37593c = new C42813k(C58485gu.m89846n(new C42716c(new C42715b(context))));
        C42718e a = C42719f.m75461a(context);
        C42719f.m75463c("aaptelemetry");
        a.f111968c = "aaptelemetry";
        a.mo45821b("AssistantAutoProjectedTelemetry.pb");
        this.f37592b = a.mo45820a();
    }

    /* renamed from: a */
    public final C60870cx mo20093a(C59473ax axVar, long j) {
        C11635a aVar = new C11635a(this, axVar, j);
        return C60856cj.m92903l(C47810es.m84977q(aVar), this.f37598h);
    }
}
