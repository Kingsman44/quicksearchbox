package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.contacts.ci;
import com.google.android.apps.gsa.contacts.cp;
import com.google.android.apps.gsa.nga.shared.p6345h.C81273bd;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.assistant.p1481f.p1483b.C17949d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.fh */
/* compiled from: PG */
public final class C81213fh implements C81273bd {

    /* renamed from: a */
    public final C17949d f222352a;

    /* renamed from: b */
    private final C22871g f222353b;

    /* renamed from: c */
    private final C22871g f222354c;

    /* renamed from: d */
    private final C42876ab f222355d;

    /* renamed from: e */
    private final C91142g f222356e;

    public C81213fh(C90821bm bmVar, C90821bm bmVar2, C42876ab abVar, C17949d dVar, C91142g gVar) {
        this.f222353b = bmVar.mo85163a(C81212fg.class);
        this.f222354c = bmVar2.mo85163a(C81211ff.class);
        this.f222355d = abVar;
        this.f222352a = dVar;
        this.f222356e = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo74969a(ci ciVar) {
        C60870cx j = this.f222353b.mo28210j(this.f222355d.mo46042d(), "[NGA] NgaReadOnlyLogsBasedTopContactsPreferences.getTopContactInfo", new C81207fb(ciVar));
        if (!this.f222356e.mo85405j(C90126fx.f251298gF)) {
            return j;
        }
        return this.f222353b.mo28210j(j, "[NGA] NgaReadOnlyLogsBasedTopContactsPreferences.getShortcutTopContacts", new C81208fc(this, ciVar));
    }

    /* renamed from: b */
    public final C60870cx mo74970b(cp cpVar) {
        C58976aa aaVar = C58975e.f156826a;
        return this.f222354c.mo28210j(this.f222355d.mo46039a(new C81209fd(cpVar), C60826bg.f164896a), "[NGA] NgaReadOnlyLogsBasedTopContactsPreferences.updateReadOnlyLogsBasedTopContacts", C81210fe.f222351a);
    }
}
