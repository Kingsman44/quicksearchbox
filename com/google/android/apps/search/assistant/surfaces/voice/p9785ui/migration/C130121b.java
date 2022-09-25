package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.base.C58838bb;
import p5462h.C69788q;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.migration.b */
/* compiled from: PG */
public final class C130121b {

    /* renamed from: a */
    private C130118a f356779a;

    /* renamed from: a */
    public final void mo109509a(C130118a aVar) {
        C69664n.m101061g(aVar, "handler");
        C19559g.m37304c();
        C58838bb.m90883r(this.f356779a == null);
        this.f356779a = aVar;
    }

    /* renamed from: b */
    public final void mo109510b(Object obj) {
        C69788q qVar;
        C19559g.m37304c();
        C130118a aVar = this.f356779a;
        if (aVar != null) {
            aVar.mo75520a(obj);
            qVar = C69788q.f186170a;
        } else {
            qVar = null;
        }
        if (qVar == null) {
            throw new IllegalStateException("UiCallback Handler not set");
        }
    }
}
