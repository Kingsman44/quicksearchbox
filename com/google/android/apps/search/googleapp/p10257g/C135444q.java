package com.google.android.apps.search.googleapp.p10257g;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.g.q */
/* compiled from: PG */
final class C135444q implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C135435j f369004a;

    /* renamed from: b */
    final /* synthetic */ C135414ae f369005b;

    public C135444q(C135435j jVar, C135414ae aeVar) {
        this.f369004a = jVar;
        this.f369005b = aeVar;
    }

    public final void onClick(View view) {
        C135435j jVar = this.f369004a;
        C69664n.m101060f(view, "it");
        C135414ae aeVar = this.f369005b;
        C28443m mVar = this.f369004a.f368982j;
        C28440j c = C28442l.m53137c();
        c.mo33895b(C28375ak.m53063e(3));
        mVar.mo33853c(c.mo33894a(), C28485y.m53234a(view));
        C135412ac acVar = aeVar.f368933e;
        if (!(acVar instanceof C135453z)) {
            C47393f.m84237h(new C135421al(), view);
            if (acVar instanceof C135452y) {
                jVar.f368978f.mo112338a(((C135452y) acVar).f369017a);
            } else if (acVar instanceof C135411ab) {
                jVar.f368978f.mo112338a(((C135411ab) acVar).f368925a);
            } else if (acVar instanceof C135410aa) {
                C135449v.m219615b(view, (C135410aa) acVar);
            } else {
                throw new IllegalStateException("Invalid interaction type. This should not happen.");
            }
        }
    }
}
