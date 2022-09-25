package com.google.android.apps.search.assistant.verticals.reminders.home;

import com.google.android.libraries.web.base.C43259j;
import com.google.android.libraries.web.base.WebConfig;
import com.google.android.libraries.web.p3345b.C43229a;

/* renamed from: com.google.android.apps.search.assistant.verticals.reminders.home.l */
/* compiled from: PG */
public final class C132568l implements C43229a {

    /* renamed from: a */
    private final String f361785a;

    public C132568l(String str) {
        this.f361785a = str;
    }

    /* renamed from: a */
    public final WebConfig mo46279a() {
        C43259j jVar = new C43259j();
        jVar.f113058a = false;
        jVar.mo46375e(String.format("GSA/%s", new Object[]{this.f361785a}));
        return jVar.mo46371a();
    }
}
