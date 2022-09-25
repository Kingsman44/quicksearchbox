package com.google.android.libraries.search.p3055n.p3058b.p3060b;

import android.content.Context;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import java.io.File;
import java.util.concurrent.Executor;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.n.b.b.bt */
/* compiled from: PG */
public final class C39326bt {

    /* renamed from: a */
    public static final C59071e f103582a = C59071e.m91332i("com.google.android.libraries.search.n.b.b.bt");

    /* renamed from: b */
    public final boolean f103583b;

    /* renamed from: c */
    public final Executor f103584c;

    /* renamed from: d */
    public boolean f103585d = false;

    /* renamed from: e */
    public Optional f103586e = Optional.empty();

    /* renamed from: f */
    public Optional f103587f = Optional.empty();

    /* renamed from: g */
    public Optional f103588g = Optional.empty();

    public C39326bt(boolean z, Executor executor) {
        this.f103583b = z;
        this.f103584c = executor;
    }

    /* renamed from: a */
    public static String m68736a(Context context, String str, Instant instant) {
        return new File(context.getFilesDir(), String.format("%s/%s_%s.wav", new Object[]{"soda_recordings", str, instant})).toString();
    }

    /* renamed from: b */
    public final void mo41777b() {
        if (this.f103583b) {
            C39322bp bpVar = new C39322bp(this);
            C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(bpVar), this.f103584c), "SodaAsrController: Failed to end audio dumps", new Object[0]);
        }
    }
}
