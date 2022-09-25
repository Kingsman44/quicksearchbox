package com.google.android.libraries.search.assistant.performer.p2757g.p2758a.p2759a.p2760a;

import android.content.Context;
import android.media.session.MediaController;
import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.MediaSessionCompat;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.search.assistant.performer.p2757g.p2758a.p2759a.C36013a;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.a.a.a.e */
/* compiled from: PG */
public final class C36018e implements C36013a {

    /* renamed from: a */
    public final C46428ao f94224a;

    /* renamed from: b */
    private final Context f94225b;

    /* renamed from: c */
    private final ScheduledExecutorService f94226c;

    public C36018e(Context context, ScheduledExecutorService scheduledExecutorService, C46428ao aoVar) {
        this.f94225b = context;
        this.f94226c = scheduledExecutorService;
        this.f94224a = aoVar;
    }

    /* renamed from: a */
    public final C60870cx mo39935a(MediaController mediaController) {
        C0320v vVar = new C0320v(this.f94225b, MediaSessionCompat.Token.fromToken(mediaController.getSessionToken()));
        C60870cx q = C60856cj.m92908q(C2169h.m6027a(new C36014a(this, vVar)), 2000, TimeUnit.MILLISECONDS, this.f94226c);
        C36015b bVar = new C36015b(vVar);
        return C60846c.m92879h(q, TimeoutException.class, C47810es.m84966f(bVar), this.f94226c);
    }
}
