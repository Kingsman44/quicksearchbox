package com.google.android.apps.gsa.staticplugins.fedass.p7945d;

import android.text.TextUtils;
import com.google.android.apps.search.fedora.p10110k.p10112b.C133012b;
import com.google.android.apps.search.fedora.p10110k.p10112b.C133015e;
import com.google.android.apps.search.fedora.p10110k.p10112b.C133024n;
import com.google.android.apps.search.fedora.p10110k.p10112b.C133025o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.d.o */
/* compiled from: PG */
public final /* synthetic */ class C100836o implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C100838q f281796a;

    /* renamed from: b */
    public final /* synthetic */ String f281797b;

    public /* synthetic */ C100836o(C100838q qVar, String str) {
        this.f281796a = qVar;
        this.f281797b = str;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C100838q qVar = this.f281796a;
        String str = this.f281797b;
        C133024n nVar = (C133024n) C133025o.f362743c.createBuilder();
        if (!TextUtils.isEmpty(str)) {
            nVar.copyOnWrite();
            C133025o oVar = (C133025o) nVar.instance;
            str.getClass();
            oVar.f362745a |= 1;
            oVar.f362746b = str;
        }
        C133012b bVar = qVar.f281799b;
        C47633f h = C47633f.m84733g(C70876o.m103760a(bVar.f189039a.mo39510a(C133015e.m215983d(), bVar.f189040b), (C133025o) nVar.build())).mo51515h(C100835n.f281795a, qVar.f281800c);
        C60856cj.m92911t(h.f164926b, C47810es.m84974n(new C100837p()), qVar.f281800c);
        return h;
    }
}
