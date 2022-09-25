package com.google.android.apps.gsa.staticplugins.p7761cz.p7762a;

import com.google.android.apps.gsa.p6487s3.C84295m;
import com.google.android.apps.gsa.p6487s3.C84332u;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.speech.p7139a.C90521m;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.speech.p5208h.C66610ch;
import com.google.speech.p5208h.C66611ci;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.cz.a.f */
/* compiled from: PG */
public final class C99243f implements C84295m {

    /* renamed from: a */
    private final C84295m f277649a;

    /* renamed from: b */
    private final C84332u f277650b;

    /* renamed from: c */
    private final AtomicBoolean f277651c = new AtomicBoolean(false);

    /* renamed from: d */
    private final C99239b f277652d;

    public C99243f(C84295m mVar, C84332u uVar, C99239b bVar) {
        this.f277649a = mVar;
        this.f277650b = uVar;
        this.f277652d = bVar;
    }

    /* renamed from: a */
    public final void mo77831a(C90523o oVar) {
        if (!this.f277651c.getAndSet(true)) {
            if (this.f277650b.mo77830c(oVar)) {
                this.f277649a.mo77832c(new C90521m(oVar));
                C99239b bVar = this.f277652d;
                bVar.f277624a.mo91387c(oVar.mo79846d());
                return;
            }
            C89949q.m146523g(9);
            this.f277649a.mo77831a(oVar);
        }
    }

    /* renamed from: c */
    public final void mo77832c(C90523o oVar) {
        if (!this.f277651c.get()) {
            this.f277649a.mo77832c(oVar);
        }
    }

    /* renamed from: d */
    public final void mo77833d(C66611ci ciVar) {
        if (this.f277651c.get()) {
            C66610ch a = C66610ch.m97260a(ciVar.f181209b);
            if (a == null) {
                a = C66610ch.IN_PROGRESS;
            }
            if (a != C66610ch.DONE_SUCCESS) {
                C66610ch a2 = C66610ch.m97260a(ciVar.f181209b);
                if (a2 == null) {
                    a2 = C66610ch.IN_PROGRESS;
                }
                if (a2 != C66610ch.DONE_ERROR) {
                    return;
                }
            }
        }
        C90523o b = this.f277650b.mo77829b(ciVar);
        if (b != null) {
            mo77831a(b);
        } else {
            this.f277649a.mo77833d(ciVar);
        }
    }
}
