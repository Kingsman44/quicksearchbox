package com.google.android.apps.search.googleapp.settingsui;

import android.support.p033v7.widget.C0701hi;
import com.google.android.libraries.logging.p2185ve.C28440j;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.aa */
/* compiled from: PG */
public final class C139147aa implements C0701hi {

    /* renamed from: a */
    final /* synthetic */ C139148ab f378444a;

    public C139147aa(C139148ab abVar) {
        this.f378444a = abVar;
    }

    /* renamed from: a */
    public final boolean mo3186a(String str) {
        C69664n.m101061g(str, "queryText");
        if (this.f378444a.f378445a.isResumed()) {
            this.f378444a.f378448d.mo33853c(new C28440j(16).mo33894a(), this.f378444a.f378450f.mo33908b("SEARCH_FIELD_VE_KEY"));
        }
        this.f378444a.f378446b.mo114809a(str);
        return true;
    }

    /* renamed from: b */
    public final boolean mo3187b(String str) {
        C69664n.m101061g(str, "queryText");
        return false;
    }
}
