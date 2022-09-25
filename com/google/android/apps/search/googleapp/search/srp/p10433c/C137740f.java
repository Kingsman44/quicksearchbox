package com.google.android.apps.search.googleapp.search.srp.p10433c;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.search.googleapp.p10257g.C135410aa;
import com.google.android.apps.search.googleapp.p10257g.C135411ab;
import com.google.android.apps.search.googleapp.p10257g.C135412ac;
import com.google.android.apps.search.googleapp.p10257g.C135414ae;
import com.google.android.apps.search.googleapp.p10257g.C135449v;
import com.google.android.apps.search.googleapp.p10257g.C135452y;
import com.google.android.apps.search.googleapp.p10257g.C135453z;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.c.f */
/* compiled from: PG */
final class C137740f implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C137737d f374692a;

    /* renamed from: b */
    final /* synthetic */ C135414ae f374693b;

    public C137740f(C137737d dVar, C135414ae aeVar) {
        this.f374692a = dVar;
        this.f374693b = aeVar;
    }

    public final void onClick(View view) {
        C137737d dVar = this.f374692a;
        C135414ae aeVar = this.f374693b;
        View findViewById = dVar.f374678g.requireView().findViewById(R.id.googleapp_doodle);
        C69664n.m101060f(findViewById, "fragment.requireView().f…Id(R.id.googleapp_doodle)");
        ImageView imageView = (ImageView) findViewById;
        if (dVar.f374674c) {
            C28443m mVar = dVar.f374679h;
            C28440j c = C28442l.m53137c();
            c.mo33895b(C28375ak.m53063e(1));
            mVar.mo33853c(c.mo33894a(), C28485y.m53234a(imageView));
            C135412ac acVar = aeVar.f368933e;
            if (!(acVar instanceof C135453z)) {
                if (acVar instanceof C135452y) {
                    dVar.f374681j.mo112338a(((C135452y) acVar).f369017a);
                } else if (acVar instanceof C135411ab) {
                    dVar.f374681j.mo112338a(((C135411ab) acVar).f368925a);
                } else if (acVar instanceof C135410aa) {
                    C135449v.m219615b(imageView, (C135410aa) acVar);
                }
            }
        } else {
            C28443m mVar2 = dVar.f374679h;
            C28440j c2 = C28442l.m53137c();
            c2.mo33895b(C28375ak.m53063e(2));
            mVar2.mo33853c(c2.mo33894a(), C28485y.m53234a(imageView));
            View findViewById2 = dVar.f374678g.requireView().findViewById(R.id.googleapp_logo);
            C69664n.m101060f(findViewById2, "fragment.requireView().f…ById(R.id.googleapp_logo)");
            C137737d.m223896b(findViewById2);
        }
    }
}
