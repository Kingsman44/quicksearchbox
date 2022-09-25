package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78518aa;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78530am;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78533ap;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78540aw;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78545c;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78554i;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78563r;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6179c.p6180a.C78547a;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80752e;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80779f;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87693ab;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88339y;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C49826ak;
import com.google.common.p4522b.C58485gu;
import java.util.Locale;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.c */
/* compiled from: PG */
public final /* synthetic */ class C78404c implements Function {

    /* renamed from: a */
    public final /* synthetic */ C78547a f215853a;

    public /* synthetic */ C78404c(C78547a aVar) {
        this.f215853a = aVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int a;
        C58485gu guVar;
        C78547a aVar = this.f215853a;
        Optional optional = (Optional) obj;
        if (optional.isEmpty() || (a = C88339y.m142797a(((C87693ab) optional.get()).f237122f)) == 0 || a != 2) {
            C78530am d = C78540aw.m126175d();
            C78518aa aaVar = (C78518aa) d;
            aaVar.f216257a = C78563r.m126231b(C78533ap.f216280d);
            aaVar.f216258b = C78554i.m126206a(C78533ap.f216278b);
            return d.mo73434a();
        }
        C78530am d2 = C78540aw.m126175d();
        C87693ab abVar = (C87693ab) optional.get();
        boolean a2 = C78547a.m126190a(abVar);
        C80752e eVar = (C80752e) C80779f.f221691d.createBuilder();
        String string = aVar.f216299b.mo75121a((Locale) ((C83361k) aVar.f216300c).f227199b.get()).getString(a2 ? R.string.nga_app_shortcut_context_saved_shortcut_hint : R.string.nga_app_shortcut_context_new_shortcut_hint, new Object[0]);
        eVar.copyOnWrite();
        string.getClass();
        ((C80779f) eVar.instance).f221693a = string;
        C81515c cVar = aVar.f216299b;
        Locale locale = (Locale) ((C83361k) aVar.f216300c).f227199b.get();
        Object[] objArr = new Object[1];
        C49826ak akVar = abVar.f237119c;
        if (akVar == null) {
            akVar = C49826ak.f129462q;
        }
        objArr[0] = akVar.f129471h;
        String string2 = cVar.mo75121a(locale).getString(R.string.nga_app_shortcut_context_full_query, objArr);
        eVar.copyOnWrite();
        string2.getClass();
        ((C80779f) eVar.instance).f221694b = string2;
        int i = true != a2 ? 118022 : 118021;
        eVar.copyOnWrite();
        ((C80779f) eVar.instance).f221695c = i;
        C80779f fVar = (C80779f) eVar.build();
        fVar.getClass();
        C78518aa aaVar2 = (C78518aa) d2;
        aaVar2.f216258b = new C78545c(fVar);
        C87693ab abVar2 = (C87693ab) optional.get();
        if (C78547a.m126190a(abVar2)) {
            C78547a aVar2 = aVar;
            C87693ab abVar3 = abVar2;
            guVar = C58485gu.m89847o(aVar2.mo73492b(abVar3, 5, R.string.nga_app_shortcut_edit_button_text, 2, 118023), aVar2.mo73492b(abVar3, 9, R.string.nga_app_shortcut_explore_button_text, 2, 118386));
        } else {
            C78547a aVar3 = aVar;
            C87693ab abVar4 = abVar2;
            guVar = C58485gu.m89847o(aVar3.mo73492b(abVar4, 4, R.string.nga_app_shortcut_cancel_button_text, 2, 118020), aVar3.mo73492b(abVar4, 3, R.string.nga_app_shortcut_save_button_text, 3, 118024));
        }
        aaVar2.f216257a = C78563r.m126230a(aVar.f216298a.mo73305a(guVar, e.G).mo74590a());
        return d2.mo73434a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
