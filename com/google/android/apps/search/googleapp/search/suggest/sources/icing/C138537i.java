package com.google.android.apps.search.googleapp.search.suggest.sources.icing;

import android.content.pm.LauncherApps;
import com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138034az;
import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.apps.search.googleapp.search.suggest.settings.C138346b;
import com.google.android.apps.search.googleapp.search.suggest.sources.C138366a;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46788de;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.protos.p5124m.p5125a.C65603f;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.icing.i */
/* compiled from: PG */
public final class C138537i implements C138366a {

    /* renamed from: a */
    public final C138509a f376793a;

    /* renamed from: b */
    public final String f376794b;

    /* renamed from: c */
    public final String f376795c;

    /* renamed from: d */
    public final List f376796d;

    /* renamed from: e */
    public final LauncherApps f376797e;

    /* renamed from: f */
    private final boolean f376798f;

    /* renamed from: g */
    private final C60888db f376799g;

    /* renamed from: h */
    private final C138346b f376800h;

    /* renamed from: i */
    private final C46723bg f376801i;

    /* renamed from: j */
    private final long f376802j;

    /* renamed from: k */
    private final boolean f376803k;

    public C138537i(C138509a aVar, boolean z, C60888db dbVar, long j, C138346b bVar, C46723bg bgVar, boolean z2, String str, String str2, C65603f fVar, LauncherApps launcherApps) {
        this.f376793a = aVar;
        this.f376798f = z;
        this.f376799g = dbVar;
        this.f376802j = j;
        this.f376800h = bVar;
        this.f376801i = bgVar;
        this.f376803k = z2;
        this.f376794b = str;
        this.f376795c = str2;
        this.f376796d = fVar.f178307a;
        this.f376797e = launcherApps;
    }

    /* renamed from: a */
    public final C138034az mo114248a() {
        return C138034az.ICING;
    }

    /* renamed from: b */
    public final /* synthetic */ C60870cx mo114249b() {
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final C60870cx mo114250c(C138133o oVar) {
        return C47633f.m84733g(this.f376801i.mo50750c(this.f376800h.mo114243a(), C46788de.DONT_CARE)).mo51516i(new C138536h(this, oVar), this.f376799g).mo51517j(this.f376802j, TimeUnit.MILLISECONDS, this.f376799g);
    }

    /* renamed from: d */
    public final C60870cx mo114251d(C138030av avVar) {
        return C60856cj.m92900i(Optional.empty());
    }

    /* renamed from: e */
    public final /* synthetic */ C60870cx mo114252e() {
        return C60866ct.f164955a;
    }

    /* renamed from: f */
    public final boolean mo114253f(C138133o oVar) {
        if (this.f376803k) {
            C139704d a = C139704d.m227141a(oVar.f375830g);
            if (a == null) {
                a = C139704d.UNKNOWN;
            }
            if (a == C139704d.WIDGET) {
                if (!oVar.f375825b.isEmpty() || this.f376798f) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final /* synthetic */ boolean mo114254g() {
        return true;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo114255h() {
    }
}
