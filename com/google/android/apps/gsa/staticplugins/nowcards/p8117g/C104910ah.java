package com.google.android.apps.gsa.staticplugins.nowcards.p8117g;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91671j;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104298a;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104308aj;
import com.google.android.apps.gsa.staticplugins.nowcards.p8119i.C105048f;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7834lr;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.g.ah */
/* compiled from: PG */
public final class C104910ah extends C104298a {

    /* renamed from: b */
    private final C105048f f292330b;

    /* renamed from: c */
    private final C89291a f292331c;

    public C104910ah(C105048f fVar, C89291a aVar) {
        this.f292330b = fVar;
        this.f292331c = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C91671j mo94021a(C7718hj hjVar, CardRenderingContext cardRenderingContext) {
        C7834lr lrVar;
        C105048f fVar = this.f292330b;
        C89291a aVar = this.f292331c;
        C104308aj ajVar = this.f290089a;
        if ((hjVar.f26955a & C89885b.S3REQUEST_VALUE) != 0) {
            lrVar = hjVar.f26981v;
            if (lrVar == null) {
                lrVar = C7834lr.f27467c;
            }
        } else {
            lrVar = null;
        }
        return new C104913ak(hjVar, lrVar, cardRenderingContext, fVar, aVar, ajVar);
    }
}
