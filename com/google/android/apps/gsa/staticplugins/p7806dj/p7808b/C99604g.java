package com.google.android.apps.gsa.staticplugins.p7806dj.p7808b;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6884y.C87290c;
import com.google.android.apps.gsa.search.core.p6884y.C87379h;
import com.google.android.apps.gsa.staticplugins.p7806dj.p7809c.C99606a;
import com.google.android.apps.gsa.staticplugins.p7806dj.p7809c.C99609d;
import com.google.android.apps.gsa.staticplugins.p7806dj.p7811e.p7812a.C99621a;
import com.google.android.apps.gsa.velvet.p8863ui.settings.C118686y;
import com.google.android.apps.gsa.velvet.p8863ui.settings.p8865b.C118647j;
import com.google.android.apps.search.googleapp.search.settings.p10425b.C137589b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.dj.b.g */
/* compiled from: PG */
public final class C99604g extends C23056g implements C99606a {

    /* renamed from: a */
    public final C22871g f278735a;

    /* renamed from: b */
    public final C99621a f278736b;

    /* renamed from: c */
    public final C99609d f278737c;

    /* renamed from: d */
    public final Context f278738d;

    /* renamed from: e */
    public final C87379h f278739e;

    /* renamed from: f */
    public final C118686y f278740f;

    /* renamed from: g */
    public final C58495hd f278741g;

    /* renamed from: h */
    public final C84474e f278742h;

    /* renamed from: i */
    public final C87290c f278743i;

    public C99604g(C23052c cVar, C87290c cVar2, C99609d dVar, C99621a aVar, C22871g gVar, Context context, C118686y yVar, C87379h hVar, C84474e eVar) {
        super(cVar);
        this.f278743i = cVar2;
        this.f278737c = dVar;
        this.f278736b = aVar;
        this.f278735a = gVar;
        this.f278738d = context;
        this.f278740f = yVar;
        this.f278739e = hVar;
        this.f278742h = eVar;
        this.f278741g = C58495hd.m89902p(context.getString(R.string.hide_explicit_results_settings), C137589b.SAFE_SEARCH, context.getString(R.string.location), C137589b.LOCATION_CONSENT, context.getString(R.string.personal_results), C137589b.PERSONAL_RESULTS);
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C118647j jVar = (C118647j) C23245b.m43557b(protoParcelable, C118647j.f330999e.getParserForType(), C62921ba.m95368a(), true);
        if (jVar != null) {
            C58485gu j = C58485gu.m89842j(jVar.f331001a);
            ((C99599b) this.f278737c).f278727a.mo28730f(j, false);
            this.f278736b.mo91513b(j, jVar.f331002b, jVar.f331003c, jVar.f331004d);
        }
    }
}
