package com.google.android.apps.search.podcasts.library.showsubscriptions;

import android.app.Dialog;
import android.support.p031v4.app.C0260w;
import android.support.p033v7.app.C0392m;
import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.C28456a;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.C28459d;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.library.showsubscriptions.d */
/* compiled from: PG */
public final class C140623d implements C28456a {

    /* renamed from: a */
    final /* synthetic */ C140627h f381917a;

    /* renamed from: b */
    private C28439i f381918b;

    public C140623d(C140627h hVar) {
        this.f381917a = hVar;
    }

    /* renamed from: a */
    public final void mo18181a(Dialog dialog, View view) {
        C69664n.m101061g(dialog, "dialog");
        C69664n.m101061g(view, "root");
        C140627h hVar = this.f381917a;
        this.f381918b = hVar.f381929e.mo33801b(view, hVar.f381928d.mo33805a(C28427h.m53115a(106157)));
        C140627h hVar2 = this.f381917a;
        hVar2.f381929e.mo33801b(((C0392m) dialog).f1349a.f1110j, hVar2.f381928d.mo33805a(C28427h.m53115a(106158)));
    }

    /* renamed from: b */
    public final void mo18182b(C0260w wVar) {
        C69664n.m101061g(wVar, "dialogFragment");
        C28439i iVar = this.f381918b;
        if (iVar != null) {
            C28459d.m53187b(wVar, iVar);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
