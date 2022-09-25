package com.google.android.libraries.web.contrib.errorpage.p3373a.p3374a;

import com.google.android.libraries.web.contrib.errorpage.p3373a.C43512b;
import com.google.android.libraries.web.contrib.errorpage.p3373a.C43513c;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.android.libraries.web.p3353c.p3355b.C43348q;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import com.google.android.libraries.web.shared.p3441a.C44078b;
import com.google.android.libraries.web.shared.p3441a.C44080d;
import com.google.android.libraries.web.shared.p3443c.C44082a;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.common.util.concurrent.C60866ct;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.contrib.errorpage.a.a.c */
/* compiled from: PG */
public final class C43511c implements C43513c {

    /* renamed from: a */
    public final C46690ah f113623a;

    /* renamed from: b */
    private final C44080d f113624b;

    /* renamed from: c */
    private final C46778cv f113625c;

    /* renamed from: d */
    private final WebModelProvider f113626d;

    public C43511c(C44078b bVar, C43377v vVar, C46778cv cvVar, WebModelProvider webModelProvider) {
        this.f113624b = bVar.mo47044a(C44082a.f114755a, "com.google.android.libraries.web.contrib.errorpage.data", false);
        long a = ((C43348q) vVar).f113231a.mo46383a();
        this.f113623a = new C46885y("com.google.android.libraries.web.contrib.errorpage.data" + a);
        this.f113625c = cvVar;
        this.f113626d = webModelProvider;
    }

    /* renamed from: a */
    public final void mo46578a(C43512b bVar) {
        C43510b bVar2 = (C43510b) this.f113626d.mo47072a(C43510b.class);
        Consumer consumer = bVar2.f113622b;
        if (consumer != null) {
            consumer.accept(bVar);
        } else {
            bVar2.f113621a = bVar;
        }
    }

    /* renamed from: b */
    public final boolean mo46579b() {
        return ((Boolean) this.f113624b.mo47045a()).booleanValue();
    }

    /* renamed from: c */
    public final void mo46580c(boolean z) {
        this.f113624b.mo47046b(Boolean.valueOf(z));
        this.f113625c.mo50787a(C60866ct.f164955a, this.f113623a);
    }
}
