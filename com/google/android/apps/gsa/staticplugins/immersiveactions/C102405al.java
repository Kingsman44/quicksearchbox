package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.content.Context;
import com.google.android.apps.gsa.search.shared.actions.PuntAction;
import com.google.android.apps.gsa.search.shared.actions.core.VoiceDelightAction;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88508b;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.apps.gsa.staticplugins.actionsui.C93501g;
import com.google.android.apps.gsa.staticplugins.actionsui.C93507m;
import com.google.android.apps.gsa.staticplugins.immersiveactions.p8018a.C102386a;
import com.google.android.apps.gsa.staticplugins.immersiveactions.p8018a.C102387b;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.al */
/* compiled from: PG */
public class C102405al extends C93501g {

    /* renamed from: b */
    protected final C58833ax f285826b;

    public C102405al(Context context, C58833ax axVar, C68214a aVar) {
        super(context, aVar);
        this.f285826b = axVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo81495b(PuntAction puntAction) {
        return mo87819o();
    }

    /* renamed from: f */
    public /* bridge */ /* synthetic */ Object mo81499f(ModularAction modularAction) {
        return mo87821q();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Object mo81168m(VoiceDelightAction voiceDelightAction) {
        return mo87820p();
    }

    /* renamed from: o */
    public final C93507m mo87819o() {
        return new C102409ap(this.f260970a);
    }

    /* renamed from: p */
    public final C88508b mo87820p() {
        C102387b bVar = new C102387b(this.f260970a);
        bVar.addOnAttachStateChangeListener(new C102386a(bVar));
        return bVar;
    }

    /* renamed from: q */
    public C88508b mo87821q() {
        C102401ah ahVar = new C102401ah(this.f260970a, this.f285826b);
        ahVar.f285796c.f260987e = ahVar;
        ahVar.f285797d.f261076f = ahVar;
        ahVar.f285798e.getViewTreeObserver().addOnGlobalLayoutListener(new C102394aa(ahVar.f285799f));
        ahVar.f285798e.f285747b = new C102455z(ahVar.f285799f);
        ahVar.f285800g = new C88511e(new C102398ae(ahVar));
        ahVar.addOnAttachStateChangeListener(new C102399af(ahVar));
        C89941l.m146512c(ahVar, 21994);
        C89941l.m146512c(ahVar.findViewById(R.id.immersive_actions_editor_content), 21993);
        return ahVar;
    }
}
