package com.google.android.apps.gsa.staticplugins.avocado;

import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83874ah;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.bj */
/* compiled from: PG */
public final /* synthetic */ class C94204bj implements C83874ah {

    /* renamed from: a */
    public final /* synthetic */ C94206bl f263205a;

    public /* synthetic */ C94204bj(C94206bl blVar) {
        this.f263205a = blVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C94206bl blVar = this.f263205a;
        if (((Boolean) obj).booleanValue()) {
            C94207bm bmVar = blVar.f263207a;
            bmVar.f263213f = 2;
            ((C89859i) bmVar.f263212e.mo27525b()).mo83702b(C89849ae.FACE_MATCH_LINK_ACCOUNT_SUCCESS);
            return C83875ai.f228524a;
        }
        ((C59052c) ((C59052c) C94207bm.f263208a.mo56225c()).mo56372aa(14242)).mo56386p("Checking Link account failed.");
        return C83875ai.m133541f((C94286ek) blVar.f263207a.f263211d.mo17428b(), new Bundle(), new C94202bh(blVar));
    }
}
