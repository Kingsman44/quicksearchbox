package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8587h;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.C2391v;
import androidx.slice.Slice;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.C111591p;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111248k;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58800sl;
import dagger.C68214a;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p3186j$.util.Objects;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.h.g */
/* compiled from: PG */
public final class C113495g implements C113491c {

    /* renamed from: a */
    public final Context f314237a;

    /* renamed from: b */
    public final C2391v f314238b;

    /* renamed from: c */
    public final Map f314239c;

    /* renamed from: d */
    public final Object f314240d = new Object();

    /* renamed from: e */
    public final C111248k f314241e;

    /* renamed from: f */
    public final C21370a f314242f;

    /* renamed from: g */
    public final AtomicLong f314243g = new AtomicLong(-1);

    /* renamed from: h */
    public final C22871g f314244h;

    /* renamed from: i */
    public final Map f314245i = new ConcurrentHashMap();

    /* renamed from: j */
    public final C68214a f314246j;

    /* renamed from: k */
    public final C86124t f314247k;

    /* renamed from: l */
    private final C22871g f314248l;

    public C113495g(Context context, C2391v vVar, C22871g gVar, C111248k kVar, C21370a aVar, C22871g gVar2, C86124t tVar, Map map, C68214a aVar2) {
        this.f314237a = context;
        this.f314238b = vVar;
        this.f314248l = gVar;
        this.f314241e = kVar;
        this.f314242f = aVar;
        this.f314244h = gVar2;
        this.f314247k = tVar;
        this.f314239c = map;
        this.f314246j = aVar2;
    }

    /* renamed from: b */
    public final C113490b mo100246b(Uri uri) {
        if (mo100248d(uri)) {
            return (C113490b) Objects.requireNonNull((C113490b) this.f314239c.get(uri));
        }
        throw new IllegalStateException("Report not available, call hasReport() before this call.");
    }

    /* renamed from: c */
    public final void mo100247c() {
        C58800sl lA = ((C111591p) this.f314246j.mo27525b()).f310327b.iterator();
        while (lA.hasNext()) {
            Uri uri = (Uri) lA.next();
            if (!this.f314239c.containsKey(uri)) {
                this.f314244h.mo28212l("observe", new C113494f(this, uri));
            }
        }
    }

    /* renamed from: d */
    public final boolean mo100248d(Uri uri) {
        return this.f314239c.containsKey(uri);
    }

    /* renamed from: hX */
    public final /* bridge */ /* synthetic */ void mo774hX(Object obj) {
        this.f314248l.mo28212l("Inspect & cache slice", new C113493e(this, (Slice) obj));
    }
}
