package com.google.apps.tiktok.inject.p3659d;

import android.app.Activity;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.common.base.C58838bb;
import dagger.hilt.android.internal.managers.C68314a;

/* renamed from: com.google.apps.tiktok.inject.d.j */
/* compiled from: PG */
public final class C47241j extends C68314a {
    public C47241j(Activity activity) {
        super(activity);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo51143a() {
        C58838bb.m90890y(this.f184659a.getApplication() instanceof C47211g, "TikTok activity, %s, cannot be attached to a non-TikTok application, %s.", this.f184659a.getClass().getSimpleName(), this.f184659a.getApplication().getClass().getSimpleName());
        return super.mo51143a();
    }
}
