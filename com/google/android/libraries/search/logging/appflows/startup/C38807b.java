package com.google.android.libraries.search.logging.appflows.startup;

import android.app.Activity;
import com.google.android.libraries.search.logging.appflows.startup.logger.C38824e;
import com.google.android.libraries.search.logging.appflows.startup.p3038b.C38814g;
import com.google.android.libraries.search.p2871b.C37251i;
import com.google.android.libraries.search.p2871b.C37266j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.ArrayList;
import java.util.List;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71204an;

/* renamed from: com.google.android.libraries.search.logging.appflows.startup.b */
/* compiled from: PG */
public final class C38807b {

    /* renamed from: a */
    public final C37266j f102408a;

    /* renamed from: b */
    public C58833ax f102409b;

    /* renamed from: c */
    public C58833ax f102410c;

    /* renamed from: d */
    public C58833ax f102411d;

    /* renamed from: e */
    public C58833ax f102412e;

    /* renamed from: f */
    public C58833ax f102413f;

    /* renamed from: g */
    public C71204an f102414g;

    /* renamed from: h */
    public boolean f102415h;

    /* renamed from: i */
    public boolean f102416i;

    /* renamed from: j */
    public List f102417j = new ArrayList();

    /* renamed from: k */
    public C37251i f102418k;

    /* renamed from: l */
    public boolean f102419l;

    /* renamed from: m */
    public C37251i f102420m;

    /* renamed from: n */
    public int f102421n;

    /* renamed from: o */
    public int f102422o;

    /* renamed from: p */
    private final C38814g f102423p;

    public C38807b(C37266j jVar, C38814g gVar) {
        this.f102408a = jVar;
        this.f102423p = gVar;
        this.f102418k = jVar.mo40826a();
        this.f102420m = jVar.mo40826a();
        C58836b bVar = C58836b.f156633a;
        this.f102409b = bVar;
        this.f102410c = bVar;
        this.f102411d = bVar;
        this.f102412e = bVar;
        this.f102413f = bVar;
        this.f102421n = 1;
        this.f102422o = 1;
        this.f102414g = C71204an.UNKNOWN;
    }

    /* renamed from: a */
    public final void mo41645a(C38824e eVar) {
        eVar.mo41659g(this.f102418k);
        this.f102418k = this.f102408a.mo40826a();
    }

    /* renamed from: b */
    public final void mo41646b() {
        this.f102418k = this.f102408a.mo40826a();
        this.f102420m = this.f102408a.mo40826a();
        this.f102421n = 1;
        this.f102411d = C58836b.f156633a;
        this.f102422o = 4;
        this.f102414g = C71204an.UNKNOWN;
        this.f102412e = C58836b.f156633a;
        this.f102416i = false;
        this.f102419l = false;
    }

    /* renamed from: c */
    public final void mo41647c(C58833ax axVar) {
        if (!axVar.equals(this.f102412e)) {
            this.f102412e = axVar;
            if (axVar.mo56113h()) {
                Activity activity = (Activity) axVar.mo56107c();
                this.f102414g = this.f102423p.mo41658a(activity.getClass(), activity.getIntent());
            }
        }
    }
}
