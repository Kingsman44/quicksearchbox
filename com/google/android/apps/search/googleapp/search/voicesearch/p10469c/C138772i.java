package com.google.android.apps.search.googleapp.search.voicesearch.p10469c;

import com.google.android.apps.search.googleapp.search.p10415i.C137521w;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.c.i */
/* compiled from: PG */
public final class C138772i {

    /* renamed from: a */
    public final C46778cv f377457a;

    /* renamed from: b */
    public volatile C137521w f377458b;

    /* renamed from: c */
    public volatile C138784u f377459c;

    /* renamed from: d */
    public volatile C58495hd f377460d = C58729pv.f156485a;

    /* renamed from: e */
    public volatile boolean f377461e;

    /* renamed from: f */
    public volatile int f377462f = 1;

    /* renamed from: g */
    private final C46723bg f377463g;

    public C138772i(C46778cv cvVar, C46723bg bgVar) {
        this.f377457a = cvVar;
        this.f377463g = bgVar;
    }

    /* renamed from: a */
    public final C138788y mo114522a() {
        C138788y yVar = (C138788y) Optional.ofNullable(this.f377459c).map(C138770g.f377455a).orElse(C138788y.f377531g);
        if (yVar.equals(C138788y.f377531g)) {
            return yVar;
        }
        int b = C138787x.m225440b(yVar.f377534b);
        if ((b != 0 && b == 7) || !this.f377461e) {
            return yVar;
        }
        C138786w wVar = (C138786w) yVar.toBuilder();
        wVar.copyOnWrite();
        ((C138788y) wVar.instance).f377534b = C138787x.m225439a(12);
        return (C138788y) wVar.build();
    }

    /* renamed from: b */
    public final C46689ag mo114523b() {
        return new C46719bc(this.f377463g, new C138769f(this), "VOICE_SEARCH_STATE");
    }

    /* renamed from: c */
    public final void mo114524c() {
        this.f377459c = null;
        this.f377458b = null;
        this.f377460d = C58729pv.f156485a;
        this.f377462f = 1;
        this.f377461e = false;
    }

    /* renamed from: d */
    public final boolean mo114525d() {
        int b = C138787x.m225440b(mo114522a().f377534b);
        return b != 0 && b == 6;
    }

    /* renamed from: e */
    public final boolean mo114526e() {
        int b = C138787x.m225440b(mo114522a().f377534b);
        if (b == 0) {
            b = 1;
        }
        if (C138787x.m225439a(b) <= 1 || C138787x.m225439a(b) >= 4) {
            return false;
        }
        return true;
    }
}
