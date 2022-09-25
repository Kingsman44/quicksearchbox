package com.google.android.libraries.gcoreclient.p1796t.p1797a;

import com.google.android.gms.mobiledataplan.consent.C145521b;
import com.google.android.gms.mobiledataplan.consent.ConsentStatus;
import java.util.Locale;

@Deprecated
/* renamed from: com.google.android.libraries.gcoreclient.t.a.u */
/* compiled from: PG */
public final class C21691u extends C21673c {

    /* renamed from: a */
    private final C145521b f60014a;

    public C21691u(C145521b bVar) {
        this.f60014a = bVar;
    }

    /* renamed from: a */
    public final void mo27064a(int i) {
        C145521b bVar = this.f60014a;
        if (ConsentStatus.m236589a(i)) {
            bVar.f393567a.f393546a = i;
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Illegal EnumVal value %d", new Object[]{Integer.valueOf(i)}));
    }

    /* renamed from: b */
    public final C21674d mo27065b() {
        return new C21692v(this.f60014a.f393567a);
    }
}
