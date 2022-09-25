package com.google.android.apps.gsa.staticplugins.immersiveactions.valyrian;

import android.content.Context;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88508b;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.staticplugins.immersiveactions.C102405al;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.valyrian.r */
/* compiled from: PG */
public final class C102450r extends C102405al {
    public C102450r(Context context, C58833ax axVar, C68214a aVar, C90476a aVar2) {
        super(context, axVar, aVar);
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo81499f(ModularAction modularAction) {
        return mo87821q();
    }

    /* renamed from: q */
    public final C88508b mo87821q() {
        C102443k kVar = new C102443k(this.f260970a);
        kVar.f285906c.f260987e = kVar;
        kVar.f285907d.f261076f = kVar;
        kVar.f285908e = new C88511e(new C102440h(kVar));
        kVar.addOnAttachStateChangeListener(new C102441i(kVar));
        C89941l.m146512c(kVar, 21994);
        C89941l.m146512c(kVar.findViewById(R.id.immersive_actions_editor_content), 21993);
        return kVar;
    }
}
