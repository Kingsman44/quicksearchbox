package com.google.android.apps.gsa.staticplugins.actionsui;

import android.view.View;
import com.google.android.apps.gsa.search.shared.actions.core.ShowContactInformationAction;
import com.google.android.apps.gsa.search.shared.contact.Contact;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88507a;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.bk */
/* compiled from: PG */
final class C93483bk implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C93487bo f260898a;

    public C93483bk(C93487bo boVar) {
        this.f260898a = boVar;
    }

    public final void onClick(View view) {
        Contact contact = (Contact) view.getTag();
        if (contact != null) {
            C88507a aVar = this.f260898a.f239232a;
            aVar.getClass();
            C93489bq bqVar = (C93489bq) aVar;
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 116;
            int i = bqVar.mo82042e().f146230cP;
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            ufVar2.f164093a |= 256;
            ufVar2.f164264s = i;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            bqVar.mo82058u();
            ((ShowContactInformationAction) bqVar.f239226b).f236056h = contact;
            bqVar.mo82052o(104);
        }
    }
}
