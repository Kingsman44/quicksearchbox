package com.google.android.apps.search.assistant.surfaces.p9372b.p9376c.p9377a;

import com.google.android.libraries.search.assistant.p2828y.p2862s.C37084a;
import com.google.android.libraries.search.assistant.p2828y.p2862s.C37149e;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3050b.C39227c;
import com.google.apps.tiktok.p3624b.C46356a;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.assistant.p3897e.p3917i.p3918a.C51609oa;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.c.a.ah */
/* compiled from: PG */
public final /* synthetic */ class C124397ah implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124399aj f343330a;

    public /* synthetic */ C124397ah(C124399aj ajVar) {
        this.f343330a = ajVar;
    }

    public final C60870cx apply(Object obj) {
        C124399aj ajVar = this.f343330a;
        if (!((Boolean) obj).booleanValue()) {
            return C60856cj.m92900i(C51609oa.f134502b);
        }
        C47558bi a = C46356a.m82648a(C39227c.m68658b(C39226b.TAG_ASSISTANT_MOBILE_ASSISTANT));
        try {
            C37149e eVar = ajVar.f343336c;
            C37084a aVar = new C37084a();
            aVar.mo40613b();
            aVar.mo40614c();
            C60870cx a2 = eVar.mo40647a(aVar.mo40612a());
            a.close();
            return a2;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
