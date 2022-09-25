package com.google.android.apps.gsa.staticplugins.accl;

import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.b */
/* compiled from: PG */
public final class C92718b {

    /* renamed from: a */
    private final Map f258819a = new HashMap();

    /* renamed from: b */
    private final C68214a f258820b;

    public C92718b(C68214a aVar) {
        this.f258820b = aVar;
    }

    /* renamed from: c */
    private final String m152700c(int i) {
        return String.format(Locale.US, "%s_%d", new Object[]{((C86054o) this.f258820b.mo27525b()).mo79659F(), Integer.valueOf(i)});
    }

    /* renamed from: a */
    public final C52091ex mo87449a(int i) {
        C58976aa aaVar = C58975e.f156826a;
        String c = m152700c(i);
        if (!this.f258819a.containsKey(c)) {
            return C52091ex.f136710b;
        }
        return (C52091ex) this.f258819a.get(c);
    }

    /* renamed from: b */
    public final void mo87450b(int i, C52091ex exVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f258819a.put(m152700c(i), exVar);
    }
}
