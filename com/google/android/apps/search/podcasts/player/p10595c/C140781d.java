package com.google.android.apps.search.podcasts.player.p10595c;

import androidx.media3.common.C2585al;
import androidx.media3.common.C2650bl;
import androidx.media3.common.C2651bm;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.p10890h.p10891a.p10893b.C146582m;
import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: com.google.android.apps.search.podcasts.player.c.d */
/* compiled from: PG */
final class C140781d implements C146582m {

    /* renamed from: a */
    final /* synthetic */ C2651bm f382268a;

    /* renamed from: b */
    final /* synthetic */ int f382269b;

    public C140781d(C2651bm bmVar, int i) {
        this.f382268a = bmVar;
        this.f382269b = i;
    }

    /* renamed from: a */
    public final String mo95063a() {
        C2585al alVar = this.f382268a.mo6024e(this.f382269b, new C2650bl(), 0).f7338c.f7155d;
        alVar.getClass();
        return ((C140641b) alVar.f7138h).f381978e;
    }

    /* renamed from: b */
    public final String mo95064b() {
        return "pc";
    }

    /* renamed from: c */
    public final /* synthetic */ List mo95065c() {
        return C58485gu.m89837e().mo55394f();
    }

    /* renamed from: d */
    public final boolean mo95066d() {
        C2585al alVar = this.f382268a.mo6024e(this.f382269b, new C2650bl(), 0).f7338c.f7155d;
        alVar.getClass();
        return "file".equals(alVar.f7131a.getScheme());
    }
}
