package com.google.android.apps.gsa.staticplugins.opa.appactions;

import com.google.android.apps.gsa.assistant.shared.appactions.ChatBubbleDialogLayout;
import com.google.android.apps.gsa.shared.p7066m.C90019by;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.ac */
/* compiled from: PG */
public final /* synthetic */ class C107234ac implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C107238ag f298437a;

    public /* synthetic */ C107234ac(C107238ag agVar) {
        this.f298437a = agVar;
    }

    public final void accept(Object obj) {
        C107238ag agVar = this.f298437a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C90021c cVar = agVar.f298457q;
        cVar.getClass();
        if (cVar.mo79746e(C90019by.f248088v)) {
            ChatBubbleDialogLayout chatBubbleDialogLayout = agVar.f298460t;
            chatBubbleDialogLayout.getClass();
            chatBubbleDialogLayout.c(booleanValue);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
