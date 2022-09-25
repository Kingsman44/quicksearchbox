package com.google.android.apps.gsa.search.core.p6820r.p6837i;

import com.google.android.apps.gsa.search.core.p6820r.C86575u;
import com.google.android.apps.gsa.search.core.p6820r.C86577w;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.r.i.n */
/* compiled from: PG */
public final class C86496n implements C86577w {

    /* renamed from: a */
    private static final C60870cx f233754a = C60856cj.m92898g();

    /* renamed from: b */
    private final Query f233755b;

    /* renamed from: c */
    private final C89356b f233756c;

    /* renamed from: d */
    private final Object f233757d = new Object();

    /* renamed from: e */
    private C86575u f233758e;

    /* renamed from: f */
    private C60870cx f233759f = null;

    public C86496n(Query query, C86575u uVar, C89356b bVar) {
        this.f233755b = query;
        this.f233758e = uVar;
        this.f233756c = bVar;
    }

    /* renamed from: b */
    public final C60870cx mo80181b() {
        synchronized (this.f233757d) {
            this.f233758e = null;
        }
        return this.f233756c.mo83286e().mo54566a();
    }

    /* renamed from: a */
    public final C60870cx mo80180a() {
        C60870cx cxVar;
        synchronized (this.f233757d) {
            if (this.f233759f == null) {
                C86575u uVar = this.f233758e;
                if (uVar == null) {
                    this.f233759f = f233754a;
                } else {
                    this.f233759f = uVar.mo80194b(this.f233755b).mo80193c();
                    this.f233758e = null;
                }
            }
            cxVar = this.f233759f;
        }
        return cxVar;
    }
}
