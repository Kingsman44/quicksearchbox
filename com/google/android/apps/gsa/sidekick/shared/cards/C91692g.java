package com.google.android.apps.gsa.sidekick.shared.cards;

import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.sidekick.shared.p7230a.C91643a;
import com.google.android.apps.gsa.sidekick.shared.p7231b.C91647a;
import com.google.android.apps.gsa.sidekick.shared.p7234d.C91713a;
import com.google.android.apps.gsa.sidekick.shared.p7235e.p7236a.C91727k;
import com.google.android.apps.gsa.sidekick.shared.p7239h.C91738a;
import com.google.android.apps.gsa.sidekick.shared.p7240i.C91743a;
import com.google.android.apps.gsa.sidekick.shared.p7241j.C91748d;
import com.google.android.apps.gsa.sidekick.shared.p7255p.C91901c;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.base.C58833ax;
import com.google.p375ai.p378b.C8142xb;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.cards.g */
/* compiled from: PG */
public abstract class C91692g {
    /* renamed from: a */
    public abstract int mo86161a();

    /* renamed from: b */
    public abstract C89859i mo86162b();

    /* renamed from: c */
    public abstract C91643a mo86163c();

    /* renamed from: d */
    public abstract C91647a mo86164d();

    /* renamed from: e */
    public abstract C91713a mo86165e();

    /* renamed from: f */
    public abstract C91727k mo86167f();

    /* renamed from: g */
    public abstract C91738a mo86168g();

    /* renamed from: h */
    public abstract C91743a mo86169h();

    /* renamed from: i */
    public abstract C91748d mo86171i();

    /* renamed from: j */
    public abstract CardRenderingContext mo86172j();

    /* renamed from: k */
    public abstract C58833ax mo86173k();

    /* renamed from: l */
    public abstract C58833ax mo86174l();

    /* renamed from: m */
    public abstract C58833ax mo86175m();

    /* renamed from: n */
    public abstract C58833ax mo86176n();

    /* renamed from: o */
    public abstract C58833ax mo86177o();

    /* renamed from: p */
    public abstract C58833ax mo86178p();

    /* renamed from: q */
    public abstract C58833ax mo86179q();

    /* renamed from: r */
    public abstract C58833ax mo86180r();

    /* renamed from: s */
    public abstract C8142xb mo86181s();

    /* renamed from: t */
    public abstract C68214a mo86182t();

    /* renamed from: u */
    public abstract boolean mo86184u();

    /* renamed from: v */
    public abstract boolean mo86185v();

    /* renamed from: w */
    public abstract boolean mo86186w();

    /* renamed from: x */
    public abstract C91901c mo86187x();

    /* renamed from: y */
    public static C91692g m150163y(C91748d dVar, C91647a aVar, C91727k kVar, C91713a aVar2, C91743a aVar3, CardRenderingContext cardRenderingContext, C91901c cVar, C91738a aVar4, C58833ax axVar, C91643a aVar5, C58833ax axVar2, C58833ax axVar3, C68214a aVar6, boolean z, boolean z2, boolean z3, C8142xb xbVar, C89859i iVar, C58833ax axVar4, C58833ax axVar5, C58833ax axVar6, int i, C58833ax axVar7, C58833ax axVar8) {
        if (dVar == null) {
            throw new NullPointerException("Null activityHelper");
        } else if (aVar == null) {
            throw new NullPointerException("Null actionLogger");
        } else if (kVar == null) {
            throw new NullPointerException("Null nowRemoteActionHandlerClient");
        } else if (aVar2 == null) {
            throw new NullPointerException("Null cardRefresher");
        } else if (aVar3 == null) {
            throw new NullPointerException("Null feedbackSender");
        } else if (cardRenderingContext == null) {
            throw new NullPointerException("Null cardRenderingContext");
        } else if (cVar == null) {
            throw new NullPointerException("Null viewRecorderContainer");
        } else if (aVar4 == null) {
            throw new NullPointerException("Null entryDismisser");
        } else if (axVar == null) {
            throw new NullPointerException("Null permissionsRequester");
        } else if (aVar5 == null) {
            throw new NullPointerException("Null actionIntentUtil");
        } else if (axVar2 == null) {
            throw new NullPointerException("Null clientActionListener");
        } else if (axVar3 == null) {
            throw new NullPointerException("Null nowAmpLauncher");
        } else if (aVar6 == null) {
            throw new NullPointerException("Null errorReporterLazy");
        } else if (xbVar == null) {
            throw new NullPointerException("Null surfaceType");
        } else if (iVar == null) {
            throw new NullPointerException("Null appFlowLogger");
        } else if (axVar4 != null) {
            return new C91687b(dVar, aVar, kVar, aVar2, aVar3, cVar, aVar4, axVar, aVar5, axVar2, axVar3, aVar6, z, z2, xbVar, z3, iVar, axVar4, cardRenderingContext, axVar5, axVar6, i, axVar7, axVar8);
        } else {
            throw new NullPointerException("Null searchServiceMessenger");
        }
    }
}
