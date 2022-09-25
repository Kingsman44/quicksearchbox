package com.google.android.libraries.search.udcdataservice.facs;

import android.content.Intent;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10990a.p10992b.p10993a.C147487b;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.apps.tiktok.p3643g.C47102r;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import dagger.C68214a;

/* renamed from: com.google.android.libraries.search.udcdataservice.facs.b */
/* compiled from: PG */
public final class C41392b implements C47102r {

    /* renamed from: a */
    public static final C59071e f108151a = C59071e.m91332i("com.google.android.libraries.search.udcdataservice.facs.b");

    /* renamed from: b */
    public final C39141kp f108152b;

    /* renamed from: c */
    private final C68214a f108153c;

    /* renamed from: d */
    private final C60887da f108154d;

    /* renamed from: e */
    private final boolean f108155e;

    public C41392b(C68214a aVar, C60887da daVar, C39141kp kpVar, boolean z) {
        this.f108153c = aVar;
        this.f108154d = daVar;
        this.f108152b = kpVar;
        this.f108155e = z;
    }

    /* renamed from: b */
    public final C60870cx mo20087b(Intent intent, int i) {
        ((C19567d) this.f108152b.f102944cV.mo6453a()).mo24822a(1, new Object[0]);
        if (!this.f108155e) {
            return C60866ct.f164955a;
        }
        C60870cx a = ((C147487b) this.f108153c.mo27525b()).mo124243a(intent);
        if (a == null) {
            a = C60866ct.f164955a;
        }
        C41391a aVar = new C41391a(this);
        return C60846c.m92878g(a, Exception.class, C47810es.m84963c(aVar), this.f108154d);
    }
}
