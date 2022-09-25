package com.google.android.apps.search.assistant.platform.p9171i.p9227d;

import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.search.assistant.platform.i.d.a */
/* compiled from: PG */
final class C121476a extends C121488c {

    /* renamed from: a */
    private C58485gu f337146a;

    /* renamed from: a */
    public final C121489d mo105162a() {
        C58485gu guVar = this.f337146a;
        if (guVar != null) {
            return new C121482b(guVar);
        }
        throw new IllegalStateException("Missing required properties: suggestions");
    }

    /* renamed from: b */
    public final void mo105163b(C58485gu guVar) {
        if (guVar != null) {
            this.f337146a = guVar;
            return;
        }
        throw new NullPointerException("Null suggestions");
    }
}
