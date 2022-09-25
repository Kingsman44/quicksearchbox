package com.google.android.libraries.gsa.monet.internal.service;

import android.text.TextUtils;
import com.google.android.libraries.gsa.monet.shared.C23078ai;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;

/* renamed from: com.google.android.libraries.gsa.monet.internal.service.i */
/* compiled from: PG */
final class C23013i {

    /* renamed from: a */
    public final String f63296a;

    /* renamed from: b */
    public final String f63297b;

    /* renamed from: c */
    public C23078ai f63298c;

    /* renamed from: d */
    public Runnable f63299d;

    /* renamed from: e */
    final /* synthetic */ C23015k f63300e;

    public C23013i(C23015k kVar, String str, String str2, Runnable runnable) {
        this.f63300e = kVar;
        C23067b.m43229b(!TextUtils.isEmpty(str2), "Scope name must not be empty");
        this.f63296a = str;
        this.f63297b = str2;
        this.f63299d = runnable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo28417a() {
        Runnable runnable = this.f63299d;
        if (runnable != null) {
            runnable.run();
            this.f63299d = null;
        }
    }
}
