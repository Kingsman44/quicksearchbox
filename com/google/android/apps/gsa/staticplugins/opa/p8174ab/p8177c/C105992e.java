package com.google.android.apps.gsa.staticplugins.opa.p8174ab.p8177c;

import com.google.android.apps.gsa.opa.p6440e.C83608a;
import com.google.android.apps.gsa.p6487s3.C84294l;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.staticplugins.p7761cz.C99248f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64308b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ab.c.e */
/* compiled from: PG */
public final class C105992e {

    /* renamed from: a */
    public static final C59071e f295900a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ab.c.e");

    /* renamed from: b */
    public final C64308b f295901b;

    /* renamed from: c */
    public final C83608a f295902c;

    /* renamed from: d */
    public final C22871g f295903d;

    /* renamed from: e */
    public final C105997j f295904e;

    /* renamed from: f */
    public final C89012aj f295905f;

    /* renamed from: g */
    public final Object f295906g = new Object();

    /* renamed from: h */
    public C84294l f295907h;

    /* renamed from: i */
    public final C99248f f295908i;

    /* renamed from: j */
    private final C90931ca f295909j;

    /* renamed from: k */
    private final C90888av f295910k = new C105990c(this);

    /* renamed from: l */
    private boolean f295911l;

    public C105992e(C64308b bVar, C83608a aVar, C99248f fVar, C90931ca caVar, C22871g gVar, C105997j jVar, C89012aj ajVar) {
        this.f295901b = bVar;
        this.f295902c = aVar;
        this.f295908i = fVar;
        this.f295905f = ajVar;
        this.f295909j = caVar;
        this.f295903d = gVar;
        this.f295904e = jVar;
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: a */
    public final void mo95206a() {
        synchronized (this.f295906g) {
            if (!this.f295911l) {
                this.f295911l = true;
                this.f295909j.mo85139d(this.f295910k);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo95207b() {
        synchronized (this.f295906g) {
            C84294l lVar = this.f295907h;
            if (lVar != null) {
                lVar.mo77825b();
            }
            this.f295907h = null;
            this.f295911l = false;
        }
    }
}
