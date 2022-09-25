package com.google.android.apps.gsa.staticplugins.opa.p8182af;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28290h;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.af.e */
/* compiled from: PG */
public final class C106128e implements C28290h {
    /* renamed from: c */
    public static void m176795c(C60321oe oeVar) {
        if (oeVar != null) {
            C89949q.m146525j((C60555uf) null, oeVar, (C63196b) null, (String) null);
        }
    }

    /* renamed from: d */
    private static void m176796d(int i, View view) {
        C28292j a = C28295m.m52915a(view);
        if (i != 2) {
            i = 3;
        }
        if (a != null && a.f76977e != 3) {
            view.getClass();
            m176795c(C28285c.m52881h(i, C28295m.m52916b(view), (View) null));
        }
    }

    /* renamed from: a */
    public final void mo33783a(View view) {
        m176796d(3, view);
    }

    /* renamed from: b */
    public final void mo33784b(View view) {
        m176796d(2, view);
    }
}
