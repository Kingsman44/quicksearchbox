package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10296j;

import com.google.android.apps.search.googleapp.googleappbrowser.p10306h.C136013c;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C136969bx;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C137009dj;
import com.google.android.apps.search.googleapp.promomanager.p10377f.C137119m;
import com.google.android.apps.search.googleapp.promomanager.p10377f.C137120n;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.j.c */
/* compiled from: PG */
public final class C135863c {

    /* renamed from: a */
    public static final C59071e f370022a = C59071e.m91332i("com.google.android.apps.search.googleapp.googleappbrowser.feature.j.c");

    /* renamed from: b */
    public final C135862b f370023b;

    /* renamed from: c */
    public final C136969bx f370024c;

    /* renamed from: d */
    public final C137119m f370025d;

    /* renamed from: e */
    public final C46801dp f370026e;

    /* renamed from: f */
    public final C43377v f370027f;

    /* renamed from: g */
    public final C46792di f370028g = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C135863c.f370022a.mo56226d()).mo56382g(th)).mo56372aa(40633)).mo56386p("Failed to fetch WebState.");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            if (C136013c.m220822a((C43376u) obj)) {
                C136969bx bxVar = C135863c.this.f370024c;
                bxVar.getClass();
                bxVar.mo113460q(C137009dj.f372879f);
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    public C135863c(C135862b bVar, C136969bx bxVar, C137120n nVar, C46801dp dpVar, C43377v vVar) {
        this.f370023b = bVar;
        this.f370024c = bxVar;
        this.f370025d = nVar.mo113538a(R.id.googleapp_browser_promotion_container);
        this.f370026e = dpVar;
        this.f370027f = vVar;
    }
}
