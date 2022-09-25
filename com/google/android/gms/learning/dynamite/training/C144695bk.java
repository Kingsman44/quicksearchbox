package com.google.android.gms.learning.dynamite.training;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143773bu;
import com.google.android.libraries.micore.learning.base.C29719k;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.learning.dynamite.training.bk */
/* compiled from: PG */
final class C144695bk implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C143773bu f391472a;

    /* renamed from: b */
    final /* synthetic */ C29719k f391473b;

    /* renamed from: c */
    final /* synthetic */ Executor f391474c;

    /* renamed from: d */
    final /* synthetic */ Context f391475d;

    public C144695bk(C143773bu buVar, C29719k kVar, Executor executor, Context context) {
        this.f391472a = buVar;
        this.f391473b = kVar;
        this.f391474c = executor;
        this.f391475d = context;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f391474c.execute(new C144694bj(th, this.f391475d));
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C144696bl.m235202a(this.f391472a, (Status) obj, this.f391473b);
    }
}
