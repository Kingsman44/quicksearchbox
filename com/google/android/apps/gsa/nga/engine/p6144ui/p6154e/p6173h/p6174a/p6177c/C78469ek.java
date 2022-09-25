package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78518aa;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78521ad;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78530am;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78536as;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78537at;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78540aw;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78554i;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78563r;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6175a.C78317f;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78805g;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78806h;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78815q;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78816r;
import com.google.android.apps.gsa.nga.shared.p6307af.C80595f;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80581o;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80590x;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80787fh;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import java.util.Locale;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.ek */
/* compiled from: PG */
public final /* synthetic */ class C78469ek implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ C78317f f216099a;

    /* renamed from: b */
    public final /* synthetic */ C81515c f216100b;

    /* renamed from: c */
    public final /* synthetic */ C91142g f216101c;

    public /* synthetic */ C78469ek(C78317f fVar, C81515c cVar, C91142g gVar) {
        this.f216099a = fVar;
        this.f216100b = cVar;
        this.f216101c = gVar;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C78806h hVar;
        C78317f fVar = this.f216099a;
        C81515c cVar = this.f216100b;
        C91142g gVar = this.f216101c;
        C78815q qVar = (C78815q) obj;
        Locale locale = (Locale) obj2;
        if (!C78816r.m126607l(qVar)) {
            return C78540aw.f216294a;
        }
        if (qVar.f216929a == 5) {
            hVar = (C78806h) qVar.f216930b;
        } else {
            hVar = C78806h.f216899c;
        }
        int a = C78805g.m126593a(hVar.f216902b);
        int i = 10;
        if (a != 0 && a == 3) {
            i = 9;
        }
        C78536as b = C78537at.m126170b();
        ((C78521ad) b).f216265a = i;
        C78537at a2 = b.mo73446a();
        C80595f f = C80595f.m128216f(C80590x.SCREEN_CONTEXT_MANAGE_SETTINGS, cVar.mo75121a(locale).getString(R.string.nga_screen_context_permission_explanation_manage, new Object[0]));
        f.mo74361h(114893);
        C80581o a3 = f.mo74358b().mo74356a();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(gVar.mo85403h(C90126fx.f251674nK)));
        C80595f f2 = C80595f.m128216f(C80590x.SCREEN_CONTEXT_LEARN_MORE, cVar.mo75121a(locale).getString(R.string.nga_screen_context_permission_explanation_learn_more, new Object[0]));
        f2.mo74361h(114894);
        C80787fh a4 = fVar.mo73305a(C58485gu.m89847o(a3, f2.mo74357a(intent).mo74356a()), e.H).mo74590a();
        C78530am d = C78540aw.m126175d();
        C78518aa aaVar = (C78518aa) d;
        aaVar.f216257a = C78563r.m126230a(a4);
        aaVar.f216258b = C78554i.m126208c(a2);
        return d.mo73434a();
    }
}
