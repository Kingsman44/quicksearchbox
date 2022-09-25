package com.google.android.apps.gsa.staticplugins.chime.p7656a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.sidekick.shared.cards.C91678ag;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56975k;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.a.d */
/* compiled from: PG */
public final class C97647d implements C97645b {

    /* renamed from: a */
    private final C91678ag f272725a;

    /* renamed from: b */
    private final C89859i f272726b;

    public C97647d(C91678ag agVar, C89859i iVar) {
        this.f272725a = agVar;
        this.f272726b = iVar;
    }

    /* renamed from: a */
    public final void mo90782a(C29827r rVar, C56975k kVar, boolean z) {
        C9141ad a = C97644a.m161882a(kVar);
        if (a != null) {
            if ((a.f31535a & 16) != 0) {
                this.f272726b.mo83702b(C89849ae.OPEN_URL_FROM_NOTIFICATION_CLICK);
            }
            this.f272725a.mo86157b(a);
            return;
        }
        throw new IllegalArgumentException("Open URL action failed to convert.");
    }
}
