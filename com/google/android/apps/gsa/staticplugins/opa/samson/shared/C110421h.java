package com.google.android.apps.gsa.staticplugins.opa.samson.shared;

import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.assistant.shared.v;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.shared.h */
/* compiled from: PG */
public final class C110421h {

    /* renamed from: a */
    public final Context f307773a;

    /* renamed from: b */
    public final C86124t f307774b;

    /* renamed from: c */
    public final h f307775c;

    /* renamed from: d */
    public final v f307776d;

    /* renamed from: e */
    private final C89994f f307777e;

    /* renamed from: f */
    private final C110425l f307778f;

    public C110421h(Context context, C86124t tVar, C89994f fVar, C110425l lVar, h hVar, v vVar) {
        this.f307773a = context;
        this.f307774b = tVar;
        this.f307777e = fVar;
        this.f307778f = lVar;
        this.f307775c = hVar;
        this.f307776d = vVar;
    }

    /* renamed from: a */
    public final boolean mo98655a() {
        return this.f307774b.mo79746e(C90014bt.f247232dK) && this.f307777e.mo83835A();
    }

    /* renamed from: b */
    public final boolean mo98656b() {
        return mo98655a() && mo98657c();
    }

    /* renamed from: c */
    public final boolean mo98657c() {
        return this.f307774b.mo79746e(C90014bt.f247233dL) && this.f307778f.mo98664b();
    }

    /* renamed from: d */
    public final boolean mo98658d() {
        Account a;
        if (!mo98656b() && (a = this.f307775c.a()) != null && !this.f307776d.e(a.name)) {
            return true;
        }
        return false;
    }
}
