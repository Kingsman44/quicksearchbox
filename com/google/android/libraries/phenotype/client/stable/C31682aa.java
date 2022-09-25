package com.google.android.libraries.phenotype.client.stable;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.phenotype.client.C31760t;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.phenotype.client.stable.aa */
/* compiled from: PG */
abstract class C31682aa {

    /* renamed from: a */
    public static final C31759z f85193a = new C31759z();

    /* renamed from: b */
    final C31760t f85194b;

    /* renamed from: c */
    final String f85195c;

    /* renamed from: d */
    final String f85196d = BuildConfig.FLAVOR;

    /* renamed from: e */
    final C31716bh f85197e;

    /* renamed from: f */
    final C31694am f85198f;

    /* renamed from: g */
    public final boolean f85199g = false;

    /* renamed from: h */
    public final Set f85200h;

    protected C31682aa(C31760t tVar, String str, Set set) {
        this.f85194b = tVar;
        this.f85195c = str;
        this.f85200h = set;
        this.f85197e = new C31716bh(new C31755v(this));
        this.f85198f = new C31694am();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C60870cx mo37320a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Map mo37321b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo37322c();
}
