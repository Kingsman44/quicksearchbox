package com.google.android.apps.search.pronunciationlearning.p10638ui.p10639a;

import android.support.p031v4.app.C0167am;
import android.view.View;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.a.d */
/* compiled from: PG */
final class C141459d implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C141458c f383967a;

    public C141459d(C141458c cVar) {
        this.f383967a = cVar;
    }

    public final void onClick(View view) {
        C141458c cVar = this.f383967a;
        C69664n.m101061g(view, "view");
        C0167am activity = cVar.f383966e.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
