package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache;

import android.content.Context;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138300j;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58838bb;
import com.google.common.p4541l.C59324g;
import com.google.common.p4541l.C59325h;
import com.google.common.p4541l.C59326i;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.f */
/* compiled from: PG */
public final class C138227f {

    /* renamed from: a */
    public static final C138226e f376088a = new C138226e();

    /* renamed from: b */
    public static final Duration f376089b = Duration.ofHours(24);

    /* renamed from: c */
    public static final byte[] f376090c;

    /* renamed from: d */
    public final Context f376091d;

    /* renamed from: e */
    public final C138300j f376092e;

    /* renamed from: f */
    public final C21370a f376093f;

    static {
        C59326i iVar = C59326i.f157519g;
        boolean z = false;
        for (int i = 0; i <= 0; i++) {
            C58838bb.m90873h(true ^ ((C59325h) iVar).f157513b.mo56818f(":".charAt(i)), "Separator (%s) cannot contain alphabet characters", ":");
        }
        Character ch = ((C59325h) iVar).f157514c;
        if (ch != null) {
            if (":".indexOf(ch.charValue()) < 0) {
                z = true;
            }
            C58838bb.m90873h(z, "Separator (%s) cannot contain padding character", ":");
        }
        f376090c = new C59324g(iVar).mo56836k("4B:4D:9A:BD:E8:F3:D6:98:75:58:C7:6E:26:1E:6F:E9:D3:C7:CC:29:9E:BE:F2:2D:56:DF:63:21:DB:AE:35:62");
    }

    public C138227f(Context context, C138300j jVar, C21370a aVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(jVar, "suggestionsConverter");
        C69664n.m101061g(aVar, "clock");
        this.f376091d = context;
        this.f376092e = jVar;
        this.f376093f = aVar;
    }
}
