package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Intent;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.fi */
/* compiled from: PG */
final class C109039fi extends C109273ih {

    /* renamed from: a */
    public final C109065gb f303208a;

    /* renamed from: b */
    final /* synthetic */ C109040fj f303209b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109039fi(C109040fj fjVar, C109065gb gbVar) {
        super(gbVar);
        this.f303209b = fjVar;
        this.f303208a = gbVar;
    }

    /* renamed from: a */
    public final boolean mo65089a(Intent intent) {
        C59071e eVar = C109040fj.f303210a;
        C58976aa aaVar = C58975e.f156826a;
        if (intent.getBooleanExtra("com.google.opa.SHOULD_AUTO_EXPAND_KEYBOARD", false)) {
            this.f303209b.f303326bg = true;
        }
        this.f303209b.mo97416D(new C109038fh(this, intent));
        return true;
    }
}
