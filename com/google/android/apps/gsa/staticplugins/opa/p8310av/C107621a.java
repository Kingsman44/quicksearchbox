package com.google.android.apps.gsa.staticplugins.opa.p8310av;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87564g;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90057di;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.av.a */
/* compiled from: PG */
public final class C107621a {

    /* renamed from: a */
    public final Activity f299389a;

    /* renamed from: b */
    public final C91097g f299390b;

    /* renamed from: c */
    public final C86124t f299391c;

    /* renamed from: d */
    public final C68214a f299392d;

    /* renamed from: e */
    public int f299393e;

    public C107621a(Activity activity, C91097g gVar, C86124t tVar, C68214a aVar) {
        this.f299389a = activity;
        this.f299390b = gVar;
        this.f299391c = tVar;
        this.f299392d = aVar;
    }

    /* renamed from: b */
    public static boolean m178509b(Bundle bundle) {
        return C87564g.m142223a(bundle) == e.bQ;
    }

    /* renamed from: c */
    public static boolean m178510c(Bundle bundle) {
        return C87564g.m142223a(bundle) == e.aI;
    }

    /* renamed from: a */
    public final boolean mo96076a() {
        return this.f299391c.mo79746e(C90057di.f249008d);
    }

    /* renamed from: d */
    public final boolean mo96077d(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        if (m178509b(bundle) && mo96076a()) {
            return true;
        }
        if (!m178510c(bundle) || !this.f299391c.mo79746e(C90057di.f249007c)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo96078e(Bundle bundle) {
        return this.f299391c.mo79746e(C90057di.f249006b) && mo96076a() && m178509b(bundle);
    }

    /* renamed from: f */
    public final void mo96079f() {
        int i = this.f299393e;
        if (i == 1) {
            ((C89859i) this.f299392d.mo27525b()).mo83702b(C89849ae.OPA_CHROME_VOICE_SEARCH_FAILURE);
            this.f299389a.setResult(this.f299393e);
        } else if (i != -1) {
            ((C89859i) this.f299392d.mo27525b()).mo83702b(C89849ae.OPA_CHROME_VOICE_SEARCH_CANCEL);
        }
    }
}
