package com.google.android.libraries.mdi.download.p2243e;

import android.content.Context;
import com.google.android.libraries.mdi.download.foreground.C29421a;
import com.google.android.libraries.mdi.download.foreground.C29422b;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29097k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.mdi.download.e.ab */
/* compiled from: PG */
final class C29348ab implements C29361k {

    /* renamed from: a */
    public final Context f79553a;

    /* renamed from: b */
    public final C58833ax f79554b;

    /* renamed from: c */
    public final Executor f79555c;

    /* renamed from: d */
    public final C58833ax f79556d;

    /* renamed from: e */
    public final C58881cr f79557e;

    /* renamed from: f */
    final C29097k f79558f;

    /* renamed from: g */
    final C29097k f79559g;

    public C29348ab(Context context, C58833ax axVar, Executor executor, C58833ax axVar2, C58881cr crVar) {
        this.f79553a = context;
        this.f79555c = executor;
        this.f79554b = axVar;
        this.f79556d = axVar2;
        this.f79557e = crVar;
        this.f79558f = C29097k.m53993a(executor);
        this.f79559g = new C29097k(executor, new C29347aa(axVar, context));
    }

    /* renamed from: c */
    private final C60870cx m54237c(String str) {
        C60870cx c = this.f79559g.mo34566c(str);
        C29366p pVar = new C29366p(this, str);
        return C60922j.m93045h(c, C47810es.m84966f(pVar), this.f79555c);
    }

    /* renamed from: a */
    public final C60870cx mo34665a(C29359i iVar) {
        C29045l.m53931c("%s: downloadWithForegroundService for Uri = %s", "DownloaderImp", iVar.mo34671c().toString());
        if (!this.f79556d.mo56113h()) {
            return C60856cj.m92899h(new IllegalStateException("downloadWithForegroundService: DownloadMonitor is not provided!"));
        }
        if (!this.f79554b.mo56113h()) {
            return C60856cj.m92899h(new IllegalStateException("downloadWithForegroundService: ForegroundDownloadService is not provided!"));
        }
        C29422b d = C29422b.m54375d(iVar.mo34671c());
        C60870cx c = m54237c(((C29421a) d).f79765a);
        C29362l lVar = new C29362l(this, iVar, d);
        return C60922j.m93045h(c, C47810es.m84966f(lVar), this.f79555c);
    }

    /* renamed from: b */
    public final void mo34666b(String str) {
        C29045l.m53931c("%s: CancelForegroundDownload for Uri = %s", "DownloaderImp", str);
        C60870cx c = m54237c(str);
        C29367q qVar = new C29367q(str);
        C60922j.m93045h(c, C47810es.m84966f(qVar), this.f79555c);
    }
}
