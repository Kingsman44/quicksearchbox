package com.google.android.apps.gsa.staticplugins.paymentsauth.p8670c;

import com.google.android.apps.gsa.search.shared.service.p6935b.C87811el;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87812em;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87827fa;
import com.google.android.apps.gsa.shared.p6984ai.p6985a.C89164c;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.c.b */
/* compiled from: PG */
final class C115959b implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C115963f f321529a;

    public C115959b(C115963f fVar) {
        this.f321529a = fVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        if (!this.f321529a.f321540h) {
            C59104x c = C115963f.f321533a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AuthController");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(30195)).mo56386p("Error checking fingerprint availability");
            this.f321529a.mo102363h(true, C58833ax.m90834k(C89164c.UNKNOWN_REASON));
        }
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        C58833ax axVar;
        C87827fa faVar = (C87827fa) obj;
        C115963f fVar = this.f321529a;
        if (!fVar.f321540h) {
            if (faVar == null) {
                C59104x c = C115963f.f321533a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "AuthController");
                ((C59052c) ((C59052c) c).mo56372aa(30198)).mo56386p("Null FingerprintAuthServiceEventData.");
                this.f321529a.mo102363h(true, C58833ax.m90834k(C89164c.UNKNOWN_REASON));
            } else if (faVar.f237639a == 6) {
                C87812em emVar = (C87812em) faVar.f237640b;
                if ((emVar.f237616a & 1) != 0) {
                    C87811el a = C87811el.m142769a(emVar.f237617b);
                    if (a == null) {
                        a = C87811el.UNKNOWN;
                    }
                    int ordinal = a.ordinal();
                    if (ordinal == 1) {
                        axVar = C58833ax.m90834k(C89164c.NO_ENROLLED_FINGERPRINT);
                    } else if (ordinal == 2) {
                        axVar = C58833ax.m90834k(C89164c.KEYGUARD_NOT_SECURE);
                    } else if (ordinal != 3) {
                        axVar = C58833ax.m90834k(C89164c.UNKNOWN_REASON);
                    } else {
                        axVar = C58833ax.m90834k(C89164c.NEW_FINGERPRINT_ADDED);
                    }
                    C59104x d = C115963f.f321533a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "AuthController");
                    ((C59052c) ((C59052c) d).mo56372aa(30196)).mo56389s("Fingerprint is not available: hasRecoverableError: %s", a);
                    this.f321529a.mo102363h(true, axVar);
                    return;
                }
                ((C23251a) fVar.f321534b.mo102372j()).mo28730f(false, false);
                C115963f fVar2 = this.f321529a;
                fVar2.mo102361e();
                fVar2.f321535c.mo28211k(fVar2.f321536d.mo79062b(), "Getting CryptoObject", new C115962e(fVar2));
            } else {
                C59104x d2 = C115963f.f321533a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "AuthController");
                ((C59052c) ((C59052c) d2).mo56372aa(30197)).mo56386p("Fingerprint is not available on this device: availableEvent is null");
                this.f321529a.mo102363h(true, C58836b.f156633a);
            }
        }
    }
}
