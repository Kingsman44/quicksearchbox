package com.google.android.apps.search.podcasts.p10591p;

import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.TimeUnit;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.search.podcasts.p.l */
/* compiled from: PG */
public final class C140746l implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C140747m f382190a;

    /* renamed from: b */
    final /* synthetic */ long f382191b;

    /* renamed from: c */
    final /* synthetic */ String f382192c;

    /* renamed from: d */
    final /* synthetic */ String f382193d;

    public C140746l(C140747m mVar, long j, String str, String str2) {
        this.f382190a = mVar;
        this.f382191b = j;
        this.f382192c = str;
        this.f382193d = str2;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        String str;
        C69664n.m101061g(th, C42181t.f110467a);
        if (th instanceof C70761fa) {
            str = ((C70761fa) th).f188571a.getCode().toString();
        } else {
            str = Status.f186905c.getCode().toString();
        }
        this.f382190a.f382194a.mo115850b((double) TimeUnit.MILLISECONDS.toMicros(this.f382190a.f382195b.mo26871c() - this.f382191b), this.f382192c, this.f382193d, str);
        this.f382190a.f382194a.mo115849a(this.f382192c, this.f382193d, str);
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        this.f382190a.f382194a.mo115850b((double) TimeUnit.MILLISECONDS.toMicros(this.f382190a.f382195b.mo26871c() - this.f382191b), this.f382192c, this.f382193d, Status.f186902OK.getCode().toString());
        this.f382190a.f382194a.mo115849a(this.f382192c, this.f382193d, Status.f186902OK.getCode().toString());
    }
}
