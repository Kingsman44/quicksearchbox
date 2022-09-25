package com.google.android.gms.droidguard.internal;

import android.os.Handler;
import com.google.android.gms.droidguard.C144112b;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import com.google.android.gms.droidguard.p10791b.C144116d;
import com.google.android.gms.learning.p10820a.C144548dl;
import java.util.Map;

/* renamed from: com.google.android.gms.droidguard.internal.g */
/* compiled from: PG */
final class C144127g {

    /* renamed from: a */
    public final C144112b f390417a;

    /* renamed from: b */
    public final Handler f390418b;

    /* renamed from: c */
    public final Map f390419c;

    /* renamed from: d */
    public final DroidGuardResultsRequest f390420d;

    /* renamed from: e */
    public final C144116d f390421e;

    /* renamed from: f */
    public final C144135o f390422f;

    /* renamed from: g */
    public final C144548dl f390423g;

    /* renamed from: h */
    private boolean f390424h = false;

    public C144127g(C144112b bVar, Handler handler, Map map, DroidGuardResultsRequest droidGuardResultsRequest, C144116d dVar, C144135o oVar, C144548dl dlVar) {
        this.f390417a = bVar;
        this.f390418b = handler;
        this.f390419c = map;
        this.f390420d = droidGuardResultsRequest;
        this.f390421e = dVar;
        this.f390422f = oVar;
        this.f390423g = dlVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo119677a(String str) {
        synchronized (this) {
            if (!this.f390424h) {
                this.f390424h = true;
                try {
                    this.f390418b.post(new C144126f(this, str));
                } catch (RuntimeException unused) {
                }
            }
        }
    }
}
