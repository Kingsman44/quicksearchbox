package com.google.android.hotword.service;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.shared.p6996ar.C89286c;
import com.google.android.gms.common.C143701ac;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;

/* renamed from: com.google.android.hotword.service.a */
/* compiled from: PG */
abstract class C146583a extends C89286c implements C68288b {

    /* renamed from: a */
    private volatile C68326i f395935a;

    /* renamed from: b */
    private final Object f395936b = new Object();

    /* renamed from: c */
    private boolean f395937c = false;

    /* renamed from: a */
    public final C68326i mo123385a() {
        if (this.f395935a == null) {
            synchronized (this.f395936b) {
                if (this.f395935a == null) {
                    this.f395935a = new C68326i(this);
                }
            }
        }
        return this.f395935a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo123385a().mo17653jN();
    }

    public void onCreate() {
        if (!this.f395937c) {
            this.f395937c = true;
            HotwordService hotwordService = (HotwordService) this;
            amb amb = (amb) mo123385a().mo17653jN();
            hotwordService.f395910e = C68219e.m98518a(amb.f197807b.a.f202773dR);
            hotwordService.f395911f = C68219e.m98518a(amb.f197807b.a.f202651bB);
            hotwordService.f395912g = C68219e.m98518a(amb.f197744Q);
            hotwordService.f395913h = C68219e.m98518a(amb.f197807b.a.f202803dv);
            hotwordService.f395914i = C68219e.m98518a(amb.f197807b.a.f202006C);
            hotwordService.f395915j = C68219e.m98518a(amb.f197807b.a.f203444q);
            hotwordService.f395916k = (C87677ae) amb.f197807b.a.f202634al.mo17428b();
            hotwordService.f395917l = (String) amb.f197807b.aZ.mo17428b();
            hotwordService.f395918m = C68219e.m98518a(amb.f197807b.a.f202112E);
            hotwordService.f395919n = (SharedPreferences) amb.f197807b.a.f203126k.mo17428b();
            hotwordService.f395920o = C68219e.m98518a(amb.f197807b.a.f202798dq);
            hotwordService.f395921p = C68219e.m98518a(amb.f197807b.a.f202985hR);
            hotwordService.f395922q = C68219e.m98518a(amb.f197807b.cL);
            hotwordService.f395923r = C68219e.m98518a(amb.f197745R);
            hotwordService.f395924s = C68219e.m98518a(amb.f197807b.aC);
            hotwordService.f395925t = (Context) amb.f197807b.g.mo17428b();
            hotwordService.f395926u = (C143701ac) amb.f197807b.a.f203603t.mo17428b();
        }
        super.onCreate();
    }
}
