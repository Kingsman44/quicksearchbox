package com.google.android.libraries.lens.view.session.ondevice.p2164a;

import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.e */
/* compiled from: PG */
final class C27888e extends C27854ak {

    /* renamed from: a */
    private boolean f75997a;

    /* renamed from: b */
    private C58485gu f75998b;

    /* renamed from: c */
    private byte f75999c;

    /* renamed from: a */
    public final C27855al mo33336a() {
        C58485gu guVar;
        if (this.f75999c == 1 && (guVar = this.f75998b) != null) {
            return new C27889f(this.f75997a, guVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f75999c == 0) {
            sb.append(" requiresPreloading");
        }
        if (this.f75998b == null) {
            sb.append(" cascadesOrderedByPreference");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo33337b(C58485gu guVar) {
        if (guVar != null) {
            this.f75998b = guVar;
            return;
        }
        throw new NullPointerException("Null cascadesOrderedByPreference");
    }

    /* renamed from: c */
    public final void mo33338c(boolean z) {
        this.f75997a = z;
        this.f75999c = 1;
    }
}
