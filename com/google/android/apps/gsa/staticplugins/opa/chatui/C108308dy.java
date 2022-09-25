package com.google.android.apps.gsa.staticplugins.opa.chatui;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.dy */
/* compiled from: PG */
public final class C108308dy implements C108235bf {

    /* renamed from: a */
    public final List f301304a = new ArrayList();

    /* renamed from: a */
    public final int mo95351a() {
        return this.f301304a.size();
    }

    /* renamed from: b */
    public final C108232bc mo95352b(int i) {
        if (i < 0 || i >= this.f301304a.size()) {
            return null;
        }
        return (C108232bc) this.f301304a.get(i);
    }

    /* renamed from: c */
    public final C108232bc mo95353c() {
        return mo95352b(mo95351a() - 1);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo95354d(int i) {
    }
}
