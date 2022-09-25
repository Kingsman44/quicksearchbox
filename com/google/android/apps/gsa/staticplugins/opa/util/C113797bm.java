package com.google.android.apps.gsa.staticplugins.opa.util;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.p1649b.p1650a.C19606c;
import com.google.common.p4552o.p4566l.C60214n;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.bm */
/* compiled from: PG */
public final class C113797bm extends C19606c {
    public C113797bm(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* renamed from: a */
    public final C60214n mo24928a(View view) {
        C28292j a = C28295m.m52915a(view);
        if (!(view == null || a == null)) {
            C60214n b = a.mo33788b();
            if ((b.f162916a & 2048) != 0) {
                return b;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo24929b(View view) {
        C28292j a = C28295m.m52915a(view);
        return a != null && a.f76976d;
    }
}
