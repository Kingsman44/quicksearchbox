package com.google.android.apps.gsa.nga.engine.education.p6017b;

import com.google.android.apps.gsa.nga.engine.p5960as.C75042j;
import com.google.android.apps.gsa.nga.engine.p6029g.C76088d;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.shared.p6307af.C80593d;
import com.google.android.apps.gsa.nga.shared.p6345h.C81251ap;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.b.ae */
/* compiled from: PG */
public final class C75708ae implements C80593d, C75042j, C76088d {

    /* renamed from: a */
    private static final C58974d f210160a = C58974d.m91136j();

    /* renamed from: b */
    private final C76092h f210161b;

    /* renamed from: c */
    private final C91142g f210162c;

    /* renamed from: d */
    private final AtomicReference f210163d = new AtomicReference(Optional.empty());

    public C75708ae(C76092h hVar, C91142g gVar) {
        C58485gu.m89845m();
        C58485gu.m89845m();
        this.f210161b = hVar;
        this.f210162c = gVar;
    }

    /* renamed from: I */
    public final void mo71412I(C81251ap apVar) {
        if (apVar.equals(C81251ap.CHALKBOARD_PREFERENCES) && this.f210162c.mo85405j(C90126fx.f251128cv)) {
            C58485gu.m89845m();
            C58485gu.m89845m();
        }
    }

    /* renamed from: Q */
    public final void mo71863Q() {
        if (this.f210162c.mo85405j(C90126fx.f251128cv)) {
            Locale e = this.f210161b.mo72021b().mo72039e();
            if (!((Optional) this.f210163d.get()).equals(Optional.m71637of(e))) {
                ((C58970a) ((C58970a) f210160a.mo56224b()).mo56372aa(3338)).mo56354G("Language changed from %s to %s. Clearing Quick Actions from Chalkboard.", this.f210163d, e);
                this.f210163d.set(Optional.m71637of(e));
                C58485gu.m89845m();
                C58485gu.m89845m();
            }
        }
    }

    /* renamed from: gC */
    public final boolean mo71201gC() {
        return true;
    }

    /* renamed from: gE */
    public final /* synthetic */ void mo71864gE(C58528ij ijVar) {
    }

    /* renamed from: l */
    public final String mo71204l() {
        return "QuickActionsChalkboardSuggestionProvider";
    }

    /* renamed from: o */
    public final int mo71205o() {
        return 13;
    }
}
