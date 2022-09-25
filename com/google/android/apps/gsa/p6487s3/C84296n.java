package com.google.android.apps.gsa.p6487s3;

import com.google.android.apps.gsa.shared.speech.p7139a.C90522n;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.speech.p5208h.C66610ch;
import com.google.speech.p5208h.C66611ci;

/* renamed from: com.google.android.apps.gsa.s3.n */
/* compiled from: PG */
public final class C84296n implements C84332u {
    /* renamed from: a */
    public final int mo77828a() {
        return 0;
    }

    /* renamed from: b */
    public final C90523o mo77829b(C66611ci ciVar) {
        C66610ch a = C66610ch.m97260a(ciVar.f181209b);
        if (a == null) {
            a = C66610ch.IN_PROGRESS;
        }
        if (a == C66610ch.DONE_ERROR) {
            return new C90522n(ciVar.f181210c);
        }
        return null;
    }

    /* renamed from: c */
    public final boolean mo77830c(C90523o oVar) {
        return false;
    }
}
