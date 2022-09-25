package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10288e;

import com.google.android.libraries.web.p3353c.C43378w;
import com.google.apps.tiktok.dataservice.C46688af;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58837ba;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.net.URLDecoder;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.e.h */
/* compiled from: PG */
public final /* synthetic */ class C135765h implements C43378w {

    /* renamed from: a */
    public final /* synthetic */ C135766i f369794a;

    /* renamed from: b */
    public final /* synthetic */ boolean f369795b;

    /* renamed from: c */
    public final /* synthetic */ boolean f369796c;

    public /* synthetic */ C135765h(C135766i iVar, boolean z, boolean z2) {
        this.f369794a = iVar;
        this.f369795b = z;
        this.f369796c = z2;
    }

    /* renamed from: a */
    public final C60870cx mo46481a(Object obj) {
        C135766i iVar = this.f369794a;
        boolean z = this.f369795b;
        boolean z2 = this.f369796c;
        try {
            URLDecoder.decode((String) obj, "UTF-8");
        } catch (Exception unused) {
        }
        if (!z2) {
            String str = (String) obj;
            if (!C58837ba.m90859h(str)) {
                C60870cx e = iVar.f369804h.mo50345e(C135766i.m220268a(str, z));
                C60870cx a = C47638k.m84753d(iVar.f369803g.mo32554n().mo42409a(), e).mo51520a(new C135759b(e), iVar.f369800d);
                C135760c cVar = new C135760c(iVar);
                return C60846c.m92878g(a, Exception.class, C47810es.m84963c(cVar), iVar.f369800d);
            }
        }
        return C60856cj.m92900i(C46688af.m83205b(Optional.empty(), iVar.f369799c.mo26871c()));
    }
}
