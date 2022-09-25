package com.google.android.apps.search.googleapp.customtabs.features.appactions;

import com.google.android.libraries.appactions.serviceengine.api.C147874g;
import com.google.android.libraries.appactions.serviceengine.api.C147875h;
import com.google.android.libraries.appactions.serviceengine.impl.C147913f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.appactions.y */
/* compiled from: PG */
public final class C133806y {

    /* renamed from: a */
    public static final C59071e f364451a = C59071e.m91332i("com.google.android.apps.search.googleapp.customtabs.features.appactions.y");

    /* renamed from: b */
    public final C147875h f364452b;

    /* renamed from: c */
    public final C147874g f364453c;

    /* renamed from: d */
    public final Executor f364454d;

    /* renamed from: e */
    public final boolean f364455e;

    /* renamed from: f */
    public final String f364456f;

    /* renamed from: g */
    public final C60845bz f364457g = new C133805x(this);

    public C133806y(C147875h hVar, C147913f fVar, Executor executor, C147874g gVar, boolean z, long j, String str) {
        this.f364452b = hVar;
        this.f364453c = gVar;
        this.f364454d = executor;
        hVar.mo124562d(gVar.mo111399a());
        this.f364455e = z;
        this.f364456f = str;
        if (((int) j) == 1) {
            fVar.f398989b = true;
        }
    }
}
