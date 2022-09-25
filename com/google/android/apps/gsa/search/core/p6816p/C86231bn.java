package com.google.android.apps.gsa.search.core.p6816p;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90964a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;

/* renamed from: com.google.android.apps.gsa.search.core.p.bn */
/* compiled from: PG */
public final class C86231bn implements C90964a {

    /* renamed from: a */
    public final long f233052a;

    /* renamed from: b */
    public final long f233053b;

    /* renamed from: c */
    public final String f233054c;

    /* renamed from: d */
    public final String f233055d;

    /* renamed from: e */
    public final long f233056e;

    /* renamed from: f */
    public final boolean f233057f;

    public C86231bn(long j, long j2, long j3, String str) {
        String str2;
        this.f233052a = j;
        this.f233053b = j2;
        this.f233056e = j3;
        this.f233055d = str;
        if (str != null) {
            this.f233057f = true;
            str2 = String.valueOf(j3);
        } else {
            this.f233057f = false;
            str2 = null;
        }
        this.f233054c = str2;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("SearchResultMetadata");
        fVar.mo85279c("requestId").mo85276a(C90752i.m148230d(Long.valueOf(this.f233052a)));
        fVar.mo85279c("editRequestId").mo85276a(C90752i.m148230d(Long.valueOf(this.f233053b)));
        fVar.mo85279c("fetchTimeMillis").mo85276a(C90752i.m148230d(Long.valueOf(this.f233056e)));
        fVar.mo85279c("srpIsFromCache").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f233057f)));
        fVar.mo85279c("cachedSearchId").mo85276a(C90752i.m148229c(this.f233054c));
        fVar.mo85279c("baseSearchEventId").mo85276a(C90752i.m148229c(this.f233055d));
    }
}
