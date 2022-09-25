package com.google.android.apps.gsa.staticplugins.fedass.brella;

import com.google.android.libraries.assistant.trainingcache.p1617b.C19435g;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.brella.a */
/* compiled from: PG */
public final class C100796a {

    /* renamed from: a */
    private static final String f281720a = String.format("%s.%s", new Object[]{"Fedora.ExampleStore", "QueryStart.Status"});

    /* renamed from: b */
    private static final String f281721b = String.format("%s.%s", new Object[]{"Fedora.ExampleStore", "QueryStartFailure"});

    /* renamed from: c */
    private final Optional f281722c;

    /* renamed from: d */
    private final String f281723d = "FatBrella";

    public C100796a(Optional optional) {
        this.f281722c = optional;
    }

    /* renamed from: c */
    private final String m167006c(String str) {
        return String.format("%s.%s.%s", new Object[]{"Fedora.ExampleStore", this.f281723d, str});
    }

    /* renamed from: d */
    private final String m167007d(String str, String str2) {
        return String.format("%s.%s", new Object[]{m167006c(str), str2});
    }

    /* renamed from: e */
    private static String m167008e(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        return str.replace('/', '_');
    }

    /* renamed from: a */
    public final void mo92059a(String str, int i) {
        if (!this.f281722c.isEmpty()) {
            C19435g gVar = (C19435g) this.f281722c.get();
            String e = m167008e(str);
            String str2 = f281720a;
            gVar.mo24621c(str2, 0);
            String str3 = f281721b;
            gVar.mo24621c(str3, i);
            gVar.mo24621c(m167006c("QueryStart.Status"), 0);
            gVar.mo24621c(m167006c("QueryStartFailure"), i);
            gVar.mo24621c(String.format("%s.%s", new Object[]{str2, e}), 0);
            gVar.mo24621c(String.format("%s.%s", new Object[]{str3, e}), i);
            gVar.mo24621c(m167007d("QueryStart.Status", e), 0);
            gVar.mo24621c(m167007d("QueryStartFailure", e), i);
        }
    }

    /* renamed from: b */
    public final void mo92060b(String str) {
        if (!this.f281722c.isEmpty()) {
            C19435g gVar = (C19435g) this.f281722c.get();
            String e = m167008e(str);
            String str2 = f281720a;
            gVar.mo24621c(str2, 1);
            gVar.mo24621c(m167006c("QueryStart.Status"), 1);
            gVar.mo24621c(String.format("%s.%s", new Object[]{str2, e}), 1);
            gVar.mo24621c(m167007d("QueryStart.Status", e), 1);
        }
    }
}
