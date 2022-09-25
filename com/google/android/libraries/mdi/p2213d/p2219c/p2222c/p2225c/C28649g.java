package com.google.android.libraries.mdi.p2213d.p2219c.p2222c.p2225c;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.mdisync.C145083d;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.SyncOptions;
import com.google.android.libraries.p3339v.C43205e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.libraries.mdi.d.c.c.c.g */
/* compiled from: PG */
public final class C28649g implements C28645c {

    /* renamed from: a */
    private final C145083d f77898a;

    /* renamed from: b */
    private final CallerInfo f77899b;

    public C28649g(Context context, C145083d dVar, String str, C58881cr crVar, C58881cr crVar2) {
        this.f77898a = dVar;
        this.f77899b = new CallerInfo("profile-".concat(str), 1);
        C28647e eVar = new C28647e(crVar2);
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(eVar, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_PHOTO_UPDATED"), 2);
        } else {
            context.registerReceiver(eVar, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_PHOTO_UPDATED"));
        }
        C28648f fVar = new C28648f(crVar);
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(fVar, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_INFO_UPDATED"), 2);
        } else {
            context.registerReceiver(fVar, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_INFO_UPDATED"));
        }
    }

    /* renamed from: a */
    public final C60870cx mo34311a() {
        C60870cx b = C43205e.m76192b(this.f77898a.mo120596a(new byte[0], new SyncOptions(), this.f77899b));
        C28646d dVar = C28646d.f77895a;
        return C60922j.m93045h(b, C47810es.m84966f(dVar), C60826bg.f164896a);
    }
}
