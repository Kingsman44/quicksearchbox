package com.google.android.apps.search.podcasts.playerpanel;

import android.app.Dialog;
import android.support.p031v4.app.C0260w;
import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.C28456a;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.C28459d;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.an */
/* compiled from: PG */
public final class C140883an implements C28456a {

    /* renamed from: a */
    final /* synthetic */ C140912ba f382569a;

    /* renamed from: b */
    private C28439i f382570b;

    public C140883an(C140912ba baVar) {
        this.f382569a = baVar;
    }

    /* renamed from: a */
    public final void mo18181a(Dialog dialog, View view) {
        C69664n.m101061g(dialog, "dialog");
        C69664n.m101061g(view, "root");
        C140912ba baVar = this.f382569a;
        this.f382570b = baVar.f382628f.mo33801b(view, baVar.f382627e.mo33805a(C28427h.m53115a(115645)));
    }

    /* renamed from: b */
    public final void mo18182b(C0260w wVar) {
        C69664n.m101061g(wVar, "dialogFragment");
        C28439i iVar = this.f382570b;
        if (iVar != null) {
            C28459d.m53187b(wVar, iVar);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
