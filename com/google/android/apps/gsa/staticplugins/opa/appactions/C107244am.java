package com.google.android.apps.gsa.staticplugins.opa.appactions;

import com.google.android.apps.gsa.assistant.shared.appactions.ErrorStatesLayout;
import com.google.android.apps.gsa.shared.p7066m.C90019by;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.am */
/* compiled from: PG */
public final /* synthetic */ class C107244am implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C107247ap f298497a;

    public /* synthetic */ C107244am(C107247ap apVar) {
        this.f298497a = apVar;
    }

    public final void accept(Object obj) {
        C107247ap apVar = this.f298497a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C90021c cVar = apVar.f298512m;
        cVar.getClass();
        if (cVar.mo79746e(C90019by.f248088v)) {
            ErrorStatesLayout errorStatesLayout = apVar.f298507h;
            errorStatesLayout.getClass();
            errorStatesLayout.findViewById(R.id.loading_ui).setVisibility(true != booleanValue ? 8 : 0);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
