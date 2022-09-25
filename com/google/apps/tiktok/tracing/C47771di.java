package com.google.apps.tiktok.tracing;

import android.app.Application;
import com.google.common.base.C58817ah;

/* renamed from: com.google.apps.tiktok.tracing.di */
/* compiled from: PG */
public final /* synthetic */ class C47771di implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C47770dh f123765a;

    public /* synthetic */ C47771di(C47770dh dhVar) {
        this.f123765a = dhVar;
    }

    public final Object apply(Object obj) {
        return new C47766dd(this.f123765a, (Application.ActivityLifecycleCallbacks) obj);
    }
}
