package com.google.android.libraries.assistant.auto.tng.media.mediabrowser;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.work.C4632m;
import androidx.work.C4634o;
import androidx.work.C4645z;
import androidx.work.WorkerParameters;
import com.google.android.libraries.assistant.auto.tng.media.mediabrowser.p1063b.C14016a;
import com.google.apps.tiktok.contrib.work.C46570d;
import com.google.apps.tiktok.contrib.work.C46573g;
import com.google.apps.tiktok.contrib.work.C46574h;
import com.google.apps.tiktok.contrib.work.C46575i;
import com.google.apps.tiktok.contrib.work.C46582p;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.mediabrowser.k */
/* compiled from: PG */
public final class C14049k implements C46575i {

    /* renamed from: a */
    private final C14016a f42672a;

    /* renamed from: b */
    private final Context f42673b;

    /* renamed from: c */
    private final Executor f42674c;

    /* renamed from: d */
    private final PackageManager f42675d;

    public C14049k(Context context, C14016a aVar, PackageManager packageManager, Executor executor) {
        this.f42672a = aVar;
        this.f42674c = executor;
        this.f42673b = context;
        this.f42675d = packageManager;
    }

    /* renamed from: a */
    public static C46586t m30340a(int i, int i2) {
        int i3;
        if (i == 2) {
            i3 = Math.max(360, i2);
        } else {
            i3 = Math.max(10, i2);
        }
        C46582p j = C46586t.m83063j(C14049k.class);
        C46570d dVar = (C46570d) j;
        dVar.f121757f = C58833ax.m90834k(new C46574h("ANDROID_AUTO_TNG_NEWS_CONTENT_SYNC_WORKER", C4634o.REPLACE));
        dVar.f121754c = new C46573g((long) i3, TimeUnit.MINUTES);
        return j.mo50561a();
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        if (this.f42675d.getComponentEnabledSetting(new ComponentName(this.f42673b.getPackageName(), "com.google.android.libraries.assistant.auto.tng.media.mediabrowser.NewsMediaBrowserService")) != 1) {
            return C60856cj.m92900i(new C4645z(C4632m.f14549a));
        }
        C60870cx a = this.f42672a.mo21385a();
        C14048j jVar = C14048j.f42671a;
        return C60922j.m93044g(a, C47810es.m84963c(jVar), this.f42674c);
    }
}
