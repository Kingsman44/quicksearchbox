package com.google.android.apps.gsa.sidekick.shared.util;

import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.common.p4526f.C59071e;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.ap */
/* compiled from: PG */
public final class C91965ap {

    /* renamed from: a */
    static final Intent f256457a = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER");

    /* renamed from: b */
    static final Intent f256458b = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.INFO");

    /* renamed from: c */
    public static final C59071e f256459c = C59071e.m91332i("com.google.android.apps.gsa.sidekick.shared.util.ap");

    /* renamed from: d */
    public final PackageManager f256460d;

    /* renamed from: e */
    public Set f256461e;

    /* renamed from: f */
    private final C90931ca f256462f;

    public C91965ap(PackageManager packageManager, C90931ca caVar) {
        this.f256460d = packageManager;
        this.f256462f = caVar;
    }

    /* renamed from: a */
    public final void mo86663a() {
        this.f256462f.mo85139d(new C91964ao(this));
    }
}
