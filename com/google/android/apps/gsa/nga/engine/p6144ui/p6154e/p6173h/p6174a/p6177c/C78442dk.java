package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78521ad;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78536as;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78537at;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78540aw;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6175a.C78317f;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78815q;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78816r;
import com.google.android.apps.gsa.nga.shared.p6307af.C80595f;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80590x;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.nga.shared.p6417x.C83343ad;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.dk */
/* compiled from: PG */
public final /* synthetic */ class C78442dk implements C83343ad {

    /* renamed from: a */
    public final /* synthetic */ C78317f f215985a;

    /* renamed from: b */
    public final /* synthetic */ C81515c f215986b;

    public /* synthetic */ C78442dk(C78317f fVar, C81515c cVar) {
        this.f215985a = fVar;
        this.f215986b = cVar;
    }

    /* renamed from: a */
    public final Object mo73138a(Object obj, Object obj2, Object obj3) {
        C78317f fVar = this.f215985a;
        C81515c cVar = this.f215986b;
        Locale locale = (Locale) obj2;
        Boolean bool = (Boolean) obj3;
        if (!C78816r.m126604i((C78815q) obj)) {
            ((C59052c) ((C59052c) C78443dl.f215987a.mo56226d()).mo56372aa(5202)).mo56386p("Not in oauth token fix session.");
            return C78540aw.f216294a;
        }
        ((C59052c) ((C59052c) C78443dl.f215987a.mo56224b()).mo56372aa(5201)).mo56386p("New OAuth fix stage screen content provided.");
        boolean booleanValue = bool.booleanValue();
        int i = 1;
        if (true != booleanValue) {
            i = 3;
        }
        C78356af c = C78356af.m125854c(i);
        C78536as b = C78537at.m126170b();
        ((C78521ad) b).f216265a = 12;
        c.f215720c = Optional.m71637of(b.mo73446a());
        C80595f f = C80595f.m128216f(C80590x.ACCOUNT_FIX, cVar.mo75121a(locale).getString(R.string.nga_account_fix_button, new Object[0]));
        f.mo74361h(138372);
        c.f215721d = Optional.m71637of(fVar.mo73305a(C58485gu.m89846n(f.mo74358b().mo74356a()), e.H).mo74590a());
        return c.mo73311a();
    }
}
