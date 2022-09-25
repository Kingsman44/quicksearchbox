package com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a;

import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.shared.util.p7159c.C90883aq;
import com.google.android.libraries.searchbox.root.C41626a;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.searchbox.c.b.a.j */
/* compiled from: PG */
final class C88559j extends C90883aq {

    /* renamed from: a */
    final /* synthetic */ C88616t f239348a;

    /* renamed from: b */
    final /* synthetic */ long f239349b;

    /* renamed from: c */
    final /* synthetic */ C88560k f239350c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88559j(C88560k kVar, C88616t tVar, long j) {
        super("sb.r.CSResFetcher.LogTrackingCallback", 2, 0);
        this.f239350c = kVar;
        this.f239348a = tVar;
        this.f239349b = j;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (th instanceof C88565p) {
            this.f239350c.f239353c.mo82202v(this.f239348a);
        } else if (!(th instanceof CancellationException)) {
            this.f239350c.f239353c.mo82200t(this.f239348a);
        }
        this.f239350c.f239353c.mo82186f(this.f239348a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        this.f239350c.f239359i = ((C41626a) obj).f108840e.f142362b;
        this.f239350c.f239353c.mo82198r(this.f239348a, this.f239349b);
        this.f239350c.f239353c.mo82186f(this.f239348a);
    }
}
