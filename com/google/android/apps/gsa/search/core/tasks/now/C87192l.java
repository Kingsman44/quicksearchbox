package com.google.android.apps.gsa.search.core.tasks.now;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6513aj.C84533ar;
import com.google.android.apps.gsa.search.core.p6513aj.C84534as;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.tasks.now.l */
/* compiled from: PG */
public final class C87192l implements C118549h {

    /* renamed from: a */
    private final Context f235591a;

    /* renamed from: b */
    private final C86338r f235592b;

    /* renamed from: c */
    private final C84534as f235593c;

    /* renamed from: d */
    private final C86338r f235594d;

    /* renamed from: e */
    private final C89994f f235595e;

    /* renamed from: f */
    private final C92486a f235596f;

    public C87192l(Context context, C86338r rVar, C86127w wVar, C86338r rVar2, C89994f fVar, C92486a aVar) {
        this.f235591a = context;
        this.f235592b = rVar;
        this.f235593c = wVar.f232790a.f232728c;
        this.f235594d = rVar2;
        this.f235595e = fVar;
        this.f235596f = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        C84533ar a = this.f235593c.mo78241a();
        a.mo78237c("GSAPrefs.hotword_enabled", this.f235595e.mo83819h());
        a.mo78239e("GSAPrefs.hotword_prompt", this.f235596f.mo87230d());
        a.mo78237c("GEL.GSAPrefs.log_gel_events", this.f235592b.getBoolean("gel_usage_stats", C90772bp.m148279F(this.f235591a)));
        a.mo78239e("GSAPrefs.google_account", this.f235594d.getString(C90507o.f253011a, (String) null));
        a.mo78236b();
        this.f235591a.sendBroadcast(new Intent("com.google.android.apps.now.gel_prefs_synced_broadcast"));
        return C118826c.f331423b;
    }
}
