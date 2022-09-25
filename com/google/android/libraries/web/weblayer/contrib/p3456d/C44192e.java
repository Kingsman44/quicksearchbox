package com.google.android.libraries.web.weblayer.contrib.p3456d;

import android.net.Uri;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.profile.Profile;
import com.google.android.libraries.web.weblayer.wrapper.C44315a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.libraries.web.weblayer.contrib.d.e */
/* compiled from: PG */
public final class C44192e {

    /* renamed from: a */
    public final Profile f114967a;

    /* renamed from: b */
    public final C44315a f114968b;

    /* renamed from: c */
    private final C60887da f114969c;

    public C44192e(Profile profile, C44315a aVar, C60887da daVar) {
        this.f114967a = profile;
        this.f114968b = aVar;
        this.f114969c = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo47127a(Uri uri) {
        return C2169h.m6027a(new C44190c(this, uri));
    }

    /* renamed from: b */
    public final void mo47128b(Uri uri) {
        C60870cx cxVar;
        if (this.f114967a.f114484b.equals(C43271v.WEB_LAYER)) {
            if (C19559g.m37305d(Thread.currentThread())) {
                cxVar = mo47127a(uri);
            } else {
                C44189b bVar = new C44189b(this, uri);
                cxVar = C60856cj.m92905n(C47810es.m84965e(bVar), this.f114969c);
            }
            C46459k.m82829b(cxVar, "Failed to prefetch.", new Object[0]);
        }
    }
}
