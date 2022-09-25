package com.google.android.apps.gsa.staticplugins.p7761cz;

import com.google.android.apps.gsa.p6487s3.C84295m;
import com.google.android.apps.gsa.p6487s3.C84333v;
import com.google.android.apps.gsa.shared.speech.p7139a.C90522n;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import com.google.speech.p5208h.C66610ch;
import com.google.speech.p5208h.C66611ci;

/* renamed from: com.google.android.apps.gsa.staticplugins.cz.x */
/* compiled from: PG */
final class C99266x extends C57987f implements C84295m {

    /* renamed from: a */
    private final C84333v f277698a;

    /* renamed from: b */
    private final C99245c f277699b;

    public C99266x(C84333v vVar, C99245c cVar) {
        this.f277698a = vVar;
        this.f277699b = cVar;
    }

    /* renamed from: a */
    public final void mo77831a(C90523o oVar) {
        ((C59052c) ((C59052c) ((C59052c) C99267y.f277700a.mo56226d()).mo56382g(oVar)).mo56372aa(31705)).mo56386p("Received fatal error from PairHttpConnection");
        try {
            if (oVar.mo79846d()) {
                this.f277699b.mo91389a().mo4106b(new C99265w(this, oVar), C60826bg.f164896a);
            } else {
                this.f155056f.mo54590g(oVar);
            }
        } finally {
            this.f277698a.mo77826a();
        }
    }

    /* renamed from: c */
    public final void mo77832c(C90523o oVar) {
        ((C59052c) ((C59052c) ((C59052c) C99267y.f277700a.mo56225c()).mo56382g(oVar)).mo56372aa(31706)).mo56386p("Received non-fatal error from PairHttpConnection");
    }

    /* renamed from: d */
    public final void mo77833d(C66611ci ciVar) {
        C66610ch a = C66610ch.m97260a(ciVar.f181209b);
        if (a == null) {
            a = C66610ch.IN_PROGRESS;
        }
        if (a != C66610ch.DONE_ERROR) {
            this.f155056f.mo54591h(ciVar);
            C66610ch a2 = C66610ch.m97260a(ciVar.f181209b);
            if (a2 == null) {
                a2 = C66610ch.IN_PROGRESS;
            }
            if (a2 == C66610ch.DONE_SUCCESS) {
                try {
                    this.f155056f.mo54589f(false);
                } finally {
                    this.f277698a.mo77826a();
                }
            }
        } else {
            mo77831a(new C90522n(ciVar.f181210c));
        }
    }

    /* renamed from: jK */
    public final void mo20388jK() {
        try {
            this.f155056f.mo54589f(true);
        } finally {
            this.f277698a.mo77826a();
        }
    }
}
