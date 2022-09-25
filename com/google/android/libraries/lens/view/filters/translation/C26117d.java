package com.google.android.libraries.lens.view.filters.translation;

import com.google.android.libraries.lens.view.p2069am.C25327c;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.d */
/* compiled from: PG */
final class C26117d extends C26200m {

    /* renamed from: a */
    public Locale f70972a;

    /* renamed from: b */
    public C25327c f70973b;

    /* renamed from: a */
    public final void mo31309a(C25327c cVar) {
        if (cVar != null) {
            this.f70973b = cVar;
            return;
        }
        throw new NullPointerException("Null downloadState");
    }

    /* renamed from: b */
    public final void mo31310b(Locale locale) {
        if (locale != null) {
            this.f70972a = locale;
            return;
        }
        throw new NullPointerException("Null locale");
    }
}
