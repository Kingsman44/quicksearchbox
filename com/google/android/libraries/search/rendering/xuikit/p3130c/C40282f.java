package com.google.android.libraries.search.rendering.xuikit.p3130c;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.gms.clearcut.C143673z;
import com.google.apps.tiktok.contrib.work.C46575i;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.c.f */
/* compiled from: PG */
public final class C40282f implements C46575i {

    /* renamed from: a */
    public final C40301y f105809a;

    /* renamed from: b */
    public final Context f105810b;

    /* renamed from: c */
    public final C143673z f105811c;

    /* renamed from: d */
    private final C71422aw f105812d;

    public C40282f(C40301y yVar, Context context, C71422aw awVar, C143673z zVar) {
        C69664n.m101061g(yVar, "diskCache");
        C69664n.m101061g(context, "context");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(zVar, "counters");
        this.f105809a = yVar;
        this.f105810b = context;
        this.f105812d = awVar;
        this.f105811c = zVar;
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        return C71663i.m104688a(C71803m.m105042c(this.f105812d, (C69585o) null, (C71424ay) null, new C40281e(this, (C69577g) null), 3));
    }
}
