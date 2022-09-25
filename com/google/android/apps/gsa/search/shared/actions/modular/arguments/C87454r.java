package com.google.android.apps.gsa.search.shared.actions.modular.arguments;

import com.google.android.apps.gsa.search.shared.contact.Contact;
import com.google.common.base.C58817ah;
import com.google.p4152bb.p4153a.C55133hb;
import com.google.p4152bb.p4153a.C55134hc;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.modular.arguments.r */
/* compiled from: PG */
public final /* synthetic */ class C87454r implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C55134hc f236221a;

    public /* synthetic */ C87454r(C55134hc hcVar) {
        this.f236221a = hcVar;
    }

    public final Object apply(Object obj) {
        Contact contact = (Contact) obj;
        C55133hb a = C55133hb.m87600a(this.f236221a.f145123c);
        if (a == null) {
            a = C55133hb.NONE;
        }
        return PersonArgument.m141803M(contact, a);
    }
}
