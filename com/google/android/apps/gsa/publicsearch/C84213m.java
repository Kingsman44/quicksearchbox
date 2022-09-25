package com.google.android.apps.gsa.publicsearch;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.apps.tiktok.inject.C47266f;
import dagger.C68214a;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.publicsearch.m */
/* compiled from: PG */
public final class C84213m {

    /* renamed from: a */
    public final Context f229202a;

    /* renamed from: b */
    public C68214a f229203b;

    /* renamed from: c */
    public Map f229204c;

    /* renamed from: d */
    public Map f229205d;

    /* renamed from: e */
    public C68214a f229206e;

    /* renamed from: f */
    private boolean f229207f;

    /* renamed from: com.google.android.apps.gsa.publicsearch.m$a */
    /* compiled from: PG */
    public interface C84214a {
        /* renamed from: pY */
        void mo77681pY(C84213m mVar);
    }

    public C84213m(Context context) {
        this.f229202a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C86124t mo77679a() {
        mo77680b();
        return (C86124t) this.f229203b.mo27525b();
    }

    /* renamed from: b */
    public final synchronized void mo77680b() {
        if (!this.f229207f) {
            ((C84214a) C47266f.m84076a(this.f229202a, C84214a.class)).mo77681pY(this);
            this.f229207f = true;
        }
    }
}
