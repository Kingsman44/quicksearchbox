package com.google.android.apps.gsa.staticplugins.actionsui;

import com.google.android.apps.gsa.search.shared.actions.core.CommunicationAction;
import com.google.android.apps.gsa.search.shared.contact.Contact;
import com.google.android.apps.gsa.search.shared.contact.Person;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88507a;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.a */
/* compiled from: PG */
public final class C93431a implements C93696u {

    /* renamed from: a */
    private final C93507m f260785a;

    public C93431a(C93507m mVar) {
        this.f260785a = mVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo87748b(Object obj) {
        C88507a aVar = this.f260785a.f239232a;
        aVar.getClass();
        C93693r rVar = (C93693r) aVar;
        ((CommunicationAction) rVar.f239226b).f236042f.mo81535d((Person) obj, true);
        rVar.mo82050m(2, 3);
    }

    /* renamed from: a */
    public final void mo87747a(Contact contact) {
        C88507a aVar = this.f260785a.f239232a;
        aVar.getClass();
        C93693r rVar = (C93693r) aVar;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 44;
        int i = rVar.mo82042e().f146230cP;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        ufVar2.f164093a |= 256;
        ufVar2.f164264s = i;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        ((CommunicationAction) rVar.f239226b).f236042f.mo81610w(contact, true);
        rVar.mo82050m(2, 3);
    }
}
