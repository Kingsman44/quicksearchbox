package com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.voiceplatevisibility.impl;

import com.google.android.apps.gsa.staticplugins.opa.C108780dn;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.ui.voiceplatevisibility.impl.a */
/* compiled from: PG */
public final class C128687a {

    /* renamed from: a */
    public boolean f353753a;

    /* renamed from: b */
    public final CopyOnWriteArraySet f353754b = new CopyOnWriteArraySet();

    /* renamed from: c */
    public int f353755c;

    /* renamed from: a */
    public final void mo108619a() {
        int b = mo108620b();
        C58976aa aaVar = C58975e.f156826a;
        for (C108780dn a : this.f353754b) {
            a.mo97163a(b);
        }
    }

    /* renamed from: b */
    public final int mo108620b() {
        if (this.f353753a) {
            return 1;
        }
        int i = this.f353755c;
        if (i == 0) {
            return 2;
        }
        return i == 2 ? 4 : 3;
    }
}
