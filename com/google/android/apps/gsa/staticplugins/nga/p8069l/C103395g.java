package com.google.android.apps.gsa.staticplugins.nga.p8069l;

import android.accounts.Account;
import com.google.android.apps.gsa.nga.api.C74713bn;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.staticplugins.nga.p8067j.C103335ap;
import com.google.android.apps.gsa.staticplugins.nga.p8067j.C103367q;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.l.g */
/* compiled from: PG */
public final class C103395g implements C118549h {

    /* renamed from: a */
    private static final C59071e f288230a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nga.l.g");

    /* renamed from: b */
    private final C89994f f288231b;

    /* renamed from: c */
    private final C86124t f288232c;

    /* renamed from: d */
    private final C86054o f288233d;

    /* renamed from: e */
    private final C103335ap f288234e;

    /* renamed from: f */
    private final C74713bn f288235f;

    public C103395g(C89994f fVar, C86124t tVar, C86054o oVar, C103335ap apVar, C74713bn bnVar) {
        this.f288231b = fVar;
        this.f288232c = tVar;
        this.f288233d = oVar;
        this.f288234e = apVar;
        this.f288235f = bnVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        String str;
        if (!this.f288235f.mo71078c()) {
            C58976aa aaVar = C58975e.f156826a;
            return C118826c.f331423b;
        } else if (!this.f288232c.mo79746e(C90126fx.f251042bO)) {
            return C118826c.f331423b;
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            Account a = this.f288233d.mo79668a();
            if (a == null) {
                C59104x d = f288230a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "UploadSodaAudioLogs");
                ((C59052c) ((C59052c) d).mo56372aa(21518)).mo56386p("Account cannot be null");
                str = null;
            } else {
                str = this.f288233d.mo79658E(a, this.f288231b.mo83887ag(), 10000);
            }
            if (str == null) {
                C59104x d2 = f288230a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "UploadSodaAudioLogs");
                ((C59052c) ((C59052c) d2).mo56372aa(21520)).mo56386p("Auth token cannot be null");
            } else {
                this.f288234e.f288119a.mo93770d(new C103367q(str));
            }
            return C118826c.f331423b;
        }
    }
}
