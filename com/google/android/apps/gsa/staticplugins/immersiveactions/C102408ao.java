package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.gsa.search.shared.actions.VisitableAbstractVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.core.NewVisitableAbstractVoiceAction;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88507a;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88512f;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91665d;
import com.google.android.apps.gsa.sidekick.shared.util.C91977ba;
import com.google.android.apps.gsa.staticplugins.actionsui.C93499e;
import com.google.android.apps.gsa.staticplugins.actionsui.C93699x;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.base.C58885cv;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.ao */
/* compiled from: PG */
public final class C102408ao extends C93699x {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102408ao(Context context, C60870cx cxVar, C91665d dVar, Resources resources, C91123v vVar, C90929bz bzVar, C90465g gVar, C21370a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C58881cr crVar, C91977ba baVar, C91142g gVar2) {
        super(context, vVar, gVar, 2, aVar4, gVar2, C58836b.f156633a, C58833ax.m90834k(resources));
        C58833ax.m90834k(new C93499e(bzVar, aVar, aVar2, new C58885cv(cxVar), aVar3, crVar, baVar, dVar));
    }

    /* renamed from: a */
    public final C88507a mo88150a(VoiceAction voiceAction, C88512f fVar) {
        C88507a aVar;
        if (voiceAction instanceof VisitableAbstractVoiceAction) {
            aVar = (C88507a) ((VisitableAbstractVoiceAction) voiceAction).mo81132L(new C102407an(this, fVar));
        } else {
            aVar = voiceAction instanceof NewVisitableAbstractVoiceAction ? (C88507a) ((NewVisitableAbstractVoiceAction) voiceAction).mo81146L(new C102407an(this, fVar)) : null;
        }
        aVar.getClass();
        return aVar;
    }
}
