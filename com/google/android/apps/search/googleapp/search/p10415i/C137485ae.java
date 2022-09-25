package com.google.android.apps.search.googleapp.search.p10415i;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.search.googleapp.config.C133665d;
import com.google.android.apps.search.googleapp.search.p10412h.C137469b;
import com.google.android.apps.search.googleapp.search.p10415i.p10417b.C137500g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.web.profile.Profile;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58585km;
import com.google.common.util.concurrent.C60817ay;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.googleapp.search.i.ae */
/* compiled from: PG */
public final class C137485ae {

    /* renamed from: a */
    static final long f373938a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    public final Object f373939b = new Object();

    /* renamed from: c */
    public final C137501c f373940c;

    /* renamed from: d */
    public final C133665d f373941d;

    /* renamed from: e */
    public final C21370a f373942e;

    /* renamed from: f */
    public final boolean f373943f;

    /* renamed from: g */
    public final C137500g f373944g;

    /* renamed from: h */
    public final ScheduledExecutorService f373945h;

    /* renamed from: i */
    public final Queue f373946i = new ConcurrentLinkedQueue();

    /* renamed from: j */
    public long f373947j;

    /* renamed from: k */
    private final boolean f373948k;

    /* renamed from: l */
    private final C137469b f373949l;

    /* renamed from: m */
    private final boolean f373950m;

    /* renamed from: n */
    private final boolean f373951n;

    public C137485ae(C137501c cVar, C137500g gVar, C133665d dVar, C21370a aVar, boolean z, boolean z2, ScheduledExecutorService scheduledExecutorService, C137469b bVar, boolean z3, boolean z4) {
        this.f373940c = cVar;
        this.f373944g = gVar;
        this.f373941d = dVar;
        this.f373942e = aVar;
        this.f373948k = z;
        this.f373943f = z2;
        this.f373945h = scheduledExecutorService;
        this.f373950m = z3;
        this.f373949l = bVar;
        this.f373951n = z4;
    }

    /* renamed from: a */
    public static Uri m223378a(Uri uri) {
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.clearQuery();
        for (String next : uri.getQueryParameterNames()) {
            if (!next.equals("pf") && !next.equals("sns") && !next.equals("agsai")) {
                buildUpon.appendQueryParameter(next, uri.getQueryParameter(next));
            }
        }
        return buildUpon.build();
    }

    /* renamed from: e */
    private final boolean m223379e(C137484ad adVar, boolean z) {
        for (C137483ac acVar : this.f373946i) {
            if (acVar.mo113778c(adVar)) {
                if (z) {
                    return true;
                }
                if ((!this.f373951n || !acVar.f373933a.f374791c) && !acVar.mo113777b()) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final C60817ay mo113780b(Uri uri, C58585km kmVar, Profile profile) {
        C137524z zVar = new C137524z(this, uri, kmVar, profile);
        C60817ay ayVar = null;
        if (uri.getQueryParameter("q") != null) {
            String queryParameter = uri.getQueryParameter("q");
            queryParameter.getClass();
            C137484ad c = C137484ad.m223375c(queryParameter, C58837ba.m90858g(uri.getQueryParameter("tbm")));
            Iterator it = this.f373946i.iterator();
            boolean z = !(uri.getQueryParameter("pf") != null);
            while (it.hasNext()) {
                C137483ac acVar = (C137483ac) it.next();
                it.remove();
                if (this.f373950m && z) {
                    acVar.mo113776a();
                } else if (!acVar.mo113778c(c) || !acVar.mo113777b()) {
                    acVar.mo113776a();
                } else {
                    ayVar = acVar.f373934b;
                }
            }
        }
        if (ayVar != null) {
            this.f373949l.mo113750a(C37182a.f98227in.mo40779c());
        }
        if (ayVar != null || !this.f373948k) {
            return ayVar;
        }
        uri.getQuery();
        return (C60817ay) zVar.get();
    }

    /* renamed from: c */
    public final boolean mo113781c(C137484ad adVar) {
        synchronized (this.f373939b) {
            if (m223379e(adVar, true)) {
                return false;
            }
            return this.f373942e.mo26871c() - this.f373947j >= 150;
        }
    }

    /* renamed from: d */
    public final boolean mo113782d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return m223379e(C137484ad.m223375c(str, str2), false);
    }
}
