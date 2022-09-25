package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ku */
/* compiled from: PG */
public final class C96360ku extends C83869ac {

    /* renamed from: a */
    private final C89492cd f269592a;

    /* renamed from: b */
    private final C96094ay f269593b;

    /* renamed from: c */
    private final C89656k f269594c;

    /* renamed from: d */
    private C124548d f269595d;

    /* renamed from: e */
    private final boolean f269596e;

    public C96360ku(C96094ay ayVar, C89492cd cdVar, C89656k kVar, boolean z) {
        this.f269593b = ayVar;
        this.f269592a = cdVar;
        this.f269594c = kVar;
        this.f269596e = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        return C83875ai.m133537b(new C96359kt());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        C124548d b;
        C124548d dVar = this.f269595d;
        if (dVar == null) {
            String str = this.f269593b.f269039a;
            if (!(str == null || (b = this.f269592a.mo83401b(str)) == null)) {
                this.f269595d = b;
            }
            dVar = this.f269595d;
        }
        return (dVar == null || !dVar.mo106513k().equals(C124719q.GACS_DEVICE)) ? this.f269594c.mo83553h("key_personal_results_enabled") && !this.f269594c.mo83553h("key_personal_results_headphones_enabled") : !this.f269596e;
    }
}
