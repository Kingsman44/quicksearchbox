package com.google.android.apps.gsa.staticplugins.p7643cc.p7644a;

import com.google.android.apps.gsa.search.core.p6816p.C86246cb;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89004ab;
import com.google.android.apps.gsa.shared.p6968aa.C89068x;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.cc.a.f */
/* compiled from: PG */
final class C97524f extends C89004ab {

    /* renamed from: a */
    public final C86246cb f272418a;

    /* renamed from: b */
    private final C89068x f272419b;

    /* renamed from: c */
    private final C22871g f272420c;

    /* renamed from: d */
    private final AtomicBoolean f272421d = new AtomicBoolean(false);

    /* renamed from: e */
    private final C22864c f272422e = new C97523e(this);

    public C97524f(C89068x xVar, C86246cb cbVar, C22871g gVar) {
        this.f272419b = xVar;
        this.f272418a = cbVar;
        this.f272420c = gVar;
    }

    /* renamed from: a */
    public final int mo27471a() {
        return this.f272419b.mo27471a();
    }

    /* renamed from: b */
    public final C60870cx mo27472b() {
        return this.f272420c.mo28209i(this.f272419b.mo27472b(), "ConnectionDataSource next chunk", this.f272422e);
    }

    /* renamed from: d */
    public final void mo27475d() {
        if (!this.f272421d.getAndSet(true)) {
            this.f272418a.mo79840k(new C90457d(C89885b.HTTP_DATA_SOURCE_ABORTED_VALUE));
            this.f272419b.mo27475d();
        }
    }
}
