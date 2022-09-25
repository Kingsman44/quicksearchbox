package com.google.android.apps.gsa.staticplugins.nga.p8096v;

import com.google.android.apps.gsa.contacts.bz;
import com.google.android.apps.gsa.contacts.cp;
import com.google.android.apps.gsa.contacts.cq;
import com.google.android.apps.gsa.nga.api.C74713bn;
import com.google.android.apps.gsa.nga.shared.p6345h.C81273bd;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.apps.gsa.staticplugins.nga.p8087s.C103806n;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.v.d */
/* compiled from: PG */
public final class C104167d implements C118549h {

    /* renamed from: a */
    public final C103806n f289740a;

    /* renamed from: b */
    private final C81273bd f289741b;

    /* renamed from: c */
    private final C74713bn f289742c;

    /* renamed from: d */
    private final cp f289743d;

    /* renamed from: e */
    private final bz f289744e;

    /* renamed from: f */
    private final C22871g f289745f;

    public C104167d(C81273bd bdVar, C103806n nVar, C74713bn bnVar, cq cqVar, bz bzVar, C90821bm bmVar) {
        this.f289741b = bdVar;
        this.f289740a = nVar;
        this.f289742c = bnVar;
        this.f289743d = cqVar.a();
        this.f289744e = bzVar;
        this.f289745f = bmVar.mo85163a(C104166c.class);
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        if (!this.f289742c.mo71078c()) {
            C58976aa aaVar = C58975e.f156826a;
            return C118826c.f331423b;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        this.f289744e.c();
        return this.f289745f.mo28209i(this.f289745f.mo28210j(this.f289741b.mo74970b(this.f289743d), "[NGA] NgaSettingsChangeNotifier.notifyPreferenceDataStoreChanged", new C104164a(this)), "[NGA] PeriodicUpdateNgaReadOnlyLogsBasedTopContactsTask", C104165b.f289739a);
    }
}
