package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.gms.tasks.C146006ab;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.android.play.core.p3538g.C45121ag;
import com.google.android.play.core.p3538g.C45122ah;
import com.google.android.play.core.p3538g.C45187v;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.mi */
/* compiled from: PG */
public final /* synthetic */ class C109470mi implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C109471mj f304918a;

    /* renamed from: b */
    public final /* synthetic */ Locale f304919b;

    public /* synthetic */ C109470mi(C109471mj mjVar, Locale locale) {
        this.f304918a = mjVar;
        this.f304919b = locale;
    }

    public final void run() {
        C109471mj mjVar = this.f304918a;
        Locale locale = this.f304919b;
        C59104x b = C109471mj.f304920a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OpaLanguageSplitter");
        ((C59052c) ((C59052c) b).mo56372aa(22972)).mo56389s("schedule language live installation %s", locale);
        C45187v vVar = mjVar.f304921b;
        C45121ag agVar = new C45121ag();
        locale.getClass();
        agVar.f117806b.add(locale);
        C146006ab e = vVar.mo48998e(new C45122ah(agVar));
        if (e != null) {
            e.mo122498q(C109468mg.f304916a);
            e.mo122499r(C109469mh.f304917a);
        }
    }
}
