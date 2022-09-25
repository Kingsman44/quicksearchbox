package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10290f;

import com.google.android.apps.search.googleapp.googleappbrowser.p10306h.C136013c;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.f.e */
/* compiled from: PG */
public final class C135783e {

    /* renamed from: a */
    public static final C59071e f369858a = C59071e.m91332i("com.google.android.apps.search.googleapp.googleappbrowser.feature.f.e");

    /* renamed from: b */
    public final C28306ab f369859b;

    /* renamed from: c */
    public final C43377v f369860c;

    /* renamed from: d */
    public final C46801dp f369861d;

    /* renamed from: e */
    public final C46792di f369862e = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C135783e.f369858a.mo56226d()).mo56382g(th)).mo56372aa(40619)).mo56386p("Failed to fetch WebState.");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C43376u uVar = (C43376u) obj;
            if (C135783e.this.f369863f == null) {
                return;
            }
            if (!C136013c.m220822a(uVar)) {
                C135780b bVar = C135783e.this.f369863f;
                if (!bVar.f369853d) {
                    bVar.f369853d = true;
                    bVar.f369851b.setVisibility(0);
                    bVar.f369850a.mo8962b(bVar.f369852c);
                    bVar.f369850a.start();
                    return;
                }
                return;
            }
            C135783e.this.f369863f.mo112556a();
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: f */
    public C135780b f369863f;

    public C135783e(C46801dp dpVar, C43377v vVar, C28306ab abVar) {
        this.f369860c = vVar;
        this.f369861d = dpVar;
        this.f369859b = abVar;
    }
}
