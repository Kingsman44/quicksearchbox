package com.google.android.apps.gsa.staticplugins.webview;

import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.ew */
/* compiled from: PG */
public final /* synthetic */ class C118243ew implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C118248fa f328266a;

    /* renamed from: b */
    public final /* synthetic */ long f328267b;

    public /* synthetic */ C118243ew(C118248fa faVar, long j) {
        this.f328266a = faVar;
        this.f328267b = j;
    }

    public final void run() {
        C118248fa faVar = this.f328266a;
        long j = this.f328267b;
        C118152bo boVar = faVar.f328278g;
        C58976aa aaVar = C58975e.f156826a;
        C118119ai c = boVar.mo103561c(j);
        if (c != null) {
            synchronized (boVar.f327928g) {
                boVar.f327929h.remove(j);
            }
            c.mo103538l();
            C90875ai.m148465b(new C118128ar(c), c.mo103534g(), boVar.f327926e, "Ready to destroy webview").mo85223a(new C118129as(c));
        }
    }
}
