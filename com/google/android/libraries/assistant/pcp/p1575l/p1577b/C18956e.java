package com.google.android.libraries.assistant.pcp.p1575l.p1577b;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.libraries.assistant.pcp.p1546d.C18579g;
import com.google.android.libraries.assistant.pcp.p1578m.C18976f;
import com.google.android.libraries.p1635au.C19566c;
import com.google.android.libraries.p1635au.C19567d;
import com.google.assistant.p3994s.p3995a.C53306j;
import java.util.concurrent.ScheduledExecutorService;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.pcp.l.b.e */
/* compiled from: PG */
public final class C18956e {

    /* renamed from: a */
    public static final Duration f53277a = Duration.ofSeconds(1);

    /* renamed from: b */
    public final C18955d f53278b;

    /* renamed from: c */
    public final C18976f f53279c;

    public C18956e(Context context, ScheduledExecutorService scheduledExecutorService, C18976f fVar) {
        this.f53278b = new C18955d(scheduledExecutorService, new C19566c(new C143658k(context, "STREAMZ_ASSISTANT_PCP", (String) null), "STREAMZ_ASSISTANT_PCP"), (Application) context);
        this.f53279c = fVar;
    }

    /* renamed from: a */
    public final void mo24231a(int i, C53306j jVar, C18579g gVar) {
        ((C19567d) this.f53278b.f53274b.mo6453a()).mo24822a(1, i != 1 ? i != 2 ? "ERROR" : "CANCEL" : "SUCCESS", jVar.name(), gVar.mo24074d());
    }
}
