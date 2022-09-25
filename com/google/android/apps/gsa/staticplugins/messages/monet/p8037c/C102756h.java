package com.google.android.apps.gsa.staticplugins.messages.monet.p8037c;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8035b.C102734c;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8035b.C102746o;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8035b.C102747p;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;
import com.google.common.p4552o.C60572uw;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.monet.c.h */
/* compiled from: PG */
public final class C102756h implements C23113i {

    /* renamed from: a */
    private final C102754f f286851a;

    public C102756h(C102754f fVar) {
        this.f286851a = fVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("MessageCardEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("onCardIconClicked")) {
                C102747p pVar2 = (C102747p) this.f286851a;
                C102746o oVar = pVar2.f286847b;
                boolean z = false;
                if (((Boolean) ((C102734c) pVar2.f286846a).f286818g.f63720e).booleanValue() && ((Boolean) ((C102734c) pVar2.f286846a).f286813b.f63720e).booleanValue()) {
                    z = true;
                }
                oVar.mo93406b(z);
            } else if (str.equals("onFeedbackLinkClicked")) {
                C102747p pVar3 = (C102747p) this.f286851a;
                C102746o oVar2 = pVar3.f286847b;
                pVar3.mo93411e();
                oVar2.mo93408d();
            } else if (str.equals("onFuseUiStatus_com.google.common.logging.GsaClientLogProto.LocalIntentCountdownStatus")) {
                C23259d dVar = new C23259d(C60572uw.values());
                int i = pVar.f63472a.getInt("status");
                ((C102747p) this.f286851a).f286847b.mo93407c((C60572uw) dVar.f63738a[i]);
            }
        }
    }
}
