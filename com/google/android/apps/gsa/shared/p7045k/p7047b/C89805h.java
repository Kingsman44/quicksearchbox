package com.google.android.apps.gsa.shared.p7045k.p7047b;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89052h;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.shared.k.b.h */
/* compiled from: PG */
public final class C89805h {

    /* renamed from: a */
    public static final C59071e f243084a = C59071e.m91332i("com.google.android.apps.gsa.shared.k.b.h");

    /* renamed from: b */
    public final C89052h f243085b;

    /* renamed from: c */
    private final C22871g f243086c;

    /* renamed from: d */
    private final C22871g f243087d;

    public C89805h(C22871g gVar, C22871g gVar2, C89052h hVar) {
        this.f243086c = gVar;
        this.f243087d = gVar2;
        this.f243085b = hVar;
    }

    /* renamed from: b */
    public static final C90457d m146195b(String str) {
        return new C90457d(str, C89885b.HTTP_OTHER_IO_EXCEPTION.f246280a);
    }

    /* renamed from: a */
    public final C60870cx mo83661a(C89806i iVar, URL url, boolean z, C89800c cVar, int i) {
        C89801d dVar = C89801d.f243075a;
        C60870cx h = C60922j.m93045h(this.f243086c.mo28202b("SendHTTPSRequest", new C89802e(iVar, url, z, cVar, i)), new C89803f(this, iVar), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return C60846c.m92878g(C90877ak.m148471e(C60846c.m92878g(h, C90457d.class, C89804g.f243083a, C60826bg.f164896a), 100000, TimeUnit.MILLISECONDS, this.f243087d), TimeoutException.class, dVar, C60826bg.f164896a);
    }
}
