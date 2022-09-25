package com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.C105267dh;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.a.r */
/* compiled from: PG */
public final class C105410r implements C23113i {

    /* renamed from: a */
    private final C105408p f294029a;

    public C105410r(C105408p pVar) {
        this.f294029a = pVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("PublicationJudiciaireFooterEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            if (str.equals("onLinkClicked")) {
                C105408p pVar = this.f294029a;
                C58976aa aaVar = C58975e.f156826a;
                C105267dh dhVar = (C105267dh) pVar;
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(dhVar.f293680a.mo79758x(C90010bp.f246933aB)));
                intent.addCategory("android.intent.category.BROWSABLE");
                dhVar.f293681b.mo65089a(intent);
            }
        }
    }
}
