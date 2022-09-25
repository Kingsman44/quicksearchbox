package com.google.android.apps.gsa.staticplugins.p7872dw.p7876d;

import android.content.Context;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6519al.p6699df.C85355a;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7076ad.C90184a;
import com.google.android.apps.gsa.shared.monet.p7116h.C90332a;
import com.google.android.apps.gsa.shared.monet.p7116h.C90334c;
import com.google.android.apps.gsa.shared.p6990an.C89224o;
import com.google.android.apps.gsa.shared.p6990an.C89225p;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.shared.util.p7184t.C91093c;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.dw.d.d */
/* compiled from: PG */
public final class C100279d extends C86734a implements C85355a {

    /* renamed from: a */
    public static final C59071e f280424a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.dw.d.d");

    /* renamed from: k */
    private static final C58827ar f280425k = C58827ar.m90818c(' ');

    /* renamed from: b */
    public final Context f280426b;

    /* renamed from: c */
    public final C86054o f280427c;

    /* renamed from: f */
    public final C86338r f280428f;

    /* renamed from: g */
    public final C69464a f280429g;

    /* renamed from: h */
    public String f280430h;

    /* renamed from: i */
    public String f280431i;

    /* renamed from: j */
    public String f280432j = "com.google.autocomplete.MOBILE_SEARCHBOX_FEEDBACK";

    /* renamed from: l */
    private final C90931ca f280433l;

    /* renamed from: m */
    private final C91093c f280434m;

    public C100279d(Context context, C69464a aVar, C90931ca caVar, C86338r rVar, C86054o oVar) {
        super(C118575h.WORKER_SUGGEST_FEEDBACK, "suggestfeedback");
        this.f280426b = context;
        this.f280429g = aVar;
        this.f280433l = caVar;
        this.f280428f = rVar;
        this.f280427c = oVar;
        this.f280434m = new C91093c(context);
    }

    /* renamed from: a */
    public final void mo78886a(String str, String str2, Suggestion suggestion) {
        mo78887b(str, str2, suggestion, "com.google.autocomplete.MOBILE_SEARCHBOX_FEEDBACK");
    }

    /* renamed from: b */
    public final void mo78887b(String str, String str2, Suggestion suggestion, String str3) {
        this.f280430h = str;
        this.f280431i = str2;
        this.f280432j = str3;
        C91093c cVar = this.f280434m;
        C89224o oVar = (C89224o) C89225p.f241917e.createBuilder();
        String v = suggestion.mo44269v();
        oVar.copyOnWrite();
        C89225p pVar = (C89225p) oVar.instance;
        v.getClass();
        pVar.f241919a |= 1;
        pVar.f241920b = v;
        String valueOf = String.valueOf(suggestion.f108910k);
        oVar.copyOnWrite();
        C89225p pVar2 = (C89225p) oVar.instance;
        valueOf.getClass();
        pVar2.f241919a |= 2;
        pVar2.f241921c = valueOf;
        C58485gu guVar = suggestion.f108925z;
        if (guVar != null && !guVar.isEmpty()) {
            String d = f280425k.mo56097d(suggestion.f108925z);
            oVar.copyOnWrite();
            C89225p pVar3 = (C89225p) oVar.instance;
            pVar3.f241919a |= 4;
            pVar3.f241922d = d;
        }
        cVar.mo65089a(C90334c.m146886a(C90332a.APP_COMPAT.f252281i, C90184a.f251955a, C23245b.m43556a((C89225p) oVar.build())).setFlags(276856832));
    }

    /* renamed from: c */
    public final void mo78888c(String str, Map map) {
        this.f280433l.mo85139d(new C100278c(this, str, map));
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
