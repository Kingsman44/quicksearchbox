package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113188cs;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113367dh;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.hp */
/* compiled from: PG */
public final class C112925hp {

    /* renamed from: a */
    public final C113367dh f312960a;

    /* renamed from: b */
    private final C113188cs f312961b;

    public C112925hp(C113188cs csVar, C113367dh dhVar) {
        this.f312961b = csVar;
        this.f312960a = dhVar;
    }

    /* renamed from: a */
    public final CharSequence mo99782a(C112924ho hoVar) {
        if (hoVar.mo99706d().isPresent()) {
            return this.f312961b.mo99901b(hoVar.mo99707e(), (String) hoVar.mo99706d().get(), -7829368);
        }
        return hoVar.mo99707e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo99783b(C112924ho hoVar) {
        hoVar.mo99704b().setText(mo99782a(hoVar));
        hoVar.mo99705c().ifPresent(new C112922hm(this, hoVar));
    }
}
