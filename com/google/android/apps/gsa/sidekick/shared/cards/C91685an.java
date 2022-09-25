package com.google.android.apps.gsa.sidekick.shared.cards;

import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91667f;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.p375ai.p378b.C7665fk;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7763ja;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.cards.an */
/* compiled from: PG */
public final class C91685an {
    /* renamed from: a */
    public static Optional m150076a(C7665fk fkVar, C7681g gVar) {
        return Collection.EL.stream(fkVar.f26615c).filter(new C91683al(gVar)).findFirst();
    }

    /* renamed from: b */
    public static boolean m150077b(C7718hj hjVar) {
        if ((hjVar.f26955a & LinearLayoutManager.INVALID_OFFSET) != 0) {
            return true;
        }
        C7665fk fkVar = hjVar.f26942N;
        if (fkVar == null) {
            fkVar = C7665fk.f26611e;
        }
        if ((fkVar.f26613a & 1) == 0) {
            return false;
        }
        C7665fk fkVar2 = hjVar.f26942N;
        if (fkVar2 == null) {
            fkVar2 = C7665fk.f26611e;
        }
        return fkVar2.f26615c.size() > 1;
    }

    /* renamed from: c */
    public static final boolean m150078c(C91667f fVar) {
        C7718hj g = fVar.mo86085g();
        if (g == null || !m150077b(g) || C91978bb.m150937c(g, C7681g.LIKE_CARD, new C7681g[0]) == null || C91978bb.m150937c(g, C7681g.DISLIKE_CARD, new C7681g[0]) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static final boolean m150079d(C91667f fVar, C7718hj hjVar) {
        C7718hj g = fVar.mo86085g();
        if (!m150078c(fVar) || (g.f26961b & 1) == 0 || !g.f26940L || hjVar == null || (hjVar.f26961b & C89885b.S3REQUEST_VALUE) == 0) {
            return false;
        }
        C7763ja jaVar = hjVar.f26951W;
        if (jaVar == null) {
            jaVar = C7763ja.f27187g;
        }
        if ((jaVar.f27189a & 16) != 0) {
            return true;
        }
        return false;
    }
}
