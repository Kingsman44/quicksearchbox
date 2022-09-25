package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g;

import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g.p10292a.C135787a;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g.p10292a.p10293a.C135792e;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g.p10292a.p10293a.C135793f;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g.p10292a.p10293a.C135794g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.appactions.serviceengine.p11038b.C147890i;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.web.p3353c.C43379x;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46706ax;
import com.google.apps.tiktok.dataservice.C46708az;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.g.ar */
/* compiled from: PG */
public final class C135820ar implements C135812aj {

    /* renamed from: a */
    public final C135824av f369936a;

    /* renamed from: b */
    public final Executor f369937b;

    /* renamed from: c */
    public final C21370a f369938c;

    /* renamed from: d */
    public final C147890i f369939d;

    /* renamed from: e */
    private final C135787a f369940e;

    /* renamed from: f */
    private final C43379x f369941f;

    /* renamed from: g */
    private final C135823au f369942g;

    public C135820ar(C135824av avVar, C43379x xVar, C21370a aVar, C147890i iVar, C135787a aVar2, long j, Executor executor) {
        this.f369936a = avVar;
        this.f369940e = aVar2;
        this.f369937b = executor;
        this.f369941f = xVar;
        this.f369938c = aVar;
        this.f369939d = iVar;
        this.f369942g = C135823au.m220362a(j);
    }

    /* renamed from: a */
    public final C46689ag mo112569a() {
        if (this.f369942g != C135823au.FULFILLMENT_LINK_WEBX) {
            return this.f369941f.mo46471b(new C135817ao(this), new C135818ap(this));
        }
        C135794g gVar = (C135794g) this.f369940e;
        gVar.f369881g.mo46475b(R.id.googleapp_instacart_pageload_listener, new C135792e(gVar));
        C46689ag b = gVar.f369876b.mo46469b();
        return new C46706ax(new C46708az(b, b, new C135793f(gVar), gVar.f369880f), new C135816an(this), this.f369937b);
    }
}
