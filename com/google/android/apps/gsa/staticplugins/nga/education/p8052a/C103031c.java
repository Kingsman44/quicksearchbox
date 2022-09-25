package com.google.android.apps.gsa.staticplugins.nga.education.p8052a;

import android.content.SharedPreferences;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.shared.ad;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.a.c */
/* compiled from: PG */
public final class C103031c implements ad {

    /* renamed from: c */
    private static final Duration f287629c = Duration.ofSeconds(1);

    /* renamed from: a */
    public final C118561t f287630a;

    /* renamed from: b */
    public final AtomicBoolean f287631b = new AtomicBoolean(false);

    /* renamed from: d */
    private final SharedPreferences f287632d;

    /* renamed from: e */
    private final C91142g f287633e;

    /* renamed from: f */
    private final C22871g f287634f;

    public C103031c(SharedPreferences sharedPreferences, C91142g gVar, C118561t tVar, C90821bm bmVar) {
        this.f287632d = sharedPreferences;
        this.f287633e = gVar;
        this.f287630a = tVar;
        this.f287634f = bmVar.mo85163a(C103030b.class);
    }

    /* renamed from: d */
    public final void mo93564d(String str) {
        if (!this.f287632d.getString(str, Locale.getDefault().toLanguageTag()).equals(this.f287633e.mo85402g(str, BuildConfig.FLAVOR)) && !this.f287631b.getAndSet(true)) {
            this.f287634f.mo28213m("[NGA] scheduleRefreshZeroStateBackgroundTask", f287629c.toMillis(), new C103029a(this));
        }
    }
}
