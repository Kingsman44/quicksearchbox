package com.google.android.apps.gsa.staticplugins.p7872dw.p7876d;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.gms.feedback.C144206k;
import com.google.android.gms.feedback.C144207l;
import com.google.android.gms.tasks.C146006ab;
import com.google.common.base.C58837ba;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.dw.d.c */
/* compiled from: PG */
final class C100278c extends C90888av {

    /* renamed from: a */
    final /* synthetic */ String f280421a;

    /* renamed from: b */
    final /* synthetic */ Map f280422b;

    /* renamed from: c */
    final /* synthetic */ C100279d f280423c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100278c(C100279d dVar, String str, Map map) {
        super("Sending Silent Feedback", 2, 0);
        this.f280423c = dVar;
        this.f280421a = str;
        this.f280422b = map;
    }

    public final void run() {
        C100279d dVar = this.f280423c;
        String str = this.f280421a;
        Map map = this.f280422b;
        map.put("query", C58837ba.m90858g(dVar.f280430h));
        map.put("pq", C58837ba.m90858g(dVar.f280431i));
        map.put("hl", dVar.f280428f.getString("hl_parameter", Locale.getDefault().getLanguage()));
        map.put("gl", dVar.f280428f.getString("selected_search_country_code", Locale.getDefault().getCountry()));
        Account a = dVar.f280427c.mo79668a();
        if (a != null && !TextUtils.isEmpty(a.name)) {
            map.put("signed_in", "true");
        }
        C144207l lVar = new C144207l(dVar.f280426b);
        lVar.f390624c = dVar.f280432j;
        lVar.f390625d = true;
        if (!TextUtils.isEmpty(str)) {
            lVar.f390623b = str;
        }
        lVar.mo119743c(map);
        C146006ab c = ((C144206k) dVar.f280429g.mo17428b()).mo119739c(lVar.mo119741a());
        c.mo122499r(C100276a.f280419a);
        c.mo122498q(C100277b.f280420a);
        this.f280423c.f280432j = "com.google.autocomplete.MOBILE_SEARCHBOX_FEEDBACK";
    }
}
