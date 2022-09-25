package com.google.android.apps.gsa.staticplugins.p7374ag;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.util.p7159c.C90878al;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.ag.w */
/* compiled from: PG */
final class C93843w extends C90878al {

    /* renamed from: a */
    final /* synthetic */ String f262103a;

    /* renamed from: b */
    final /* synthetic */ C93809aa f262104b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93843w(C93809aa aaVar, String str) {
        super("Refresh cookies on get", 1, 0);
        this.f262104b = aaVar;
        this.f262103a = str;
    }

    public final /* bridge */ /* synthetic */ C60870cx apply(Object obj) {
        String str = (String) obj;
        C93809aa aaVar = this.f262104b;
        String str2 = this.f262103a;
        if (((C86338r) aaVar.f262041g.mo27525b()).getString(C90507o.f253011a, (String) null) != null && ((C85923cq) aaVar.f262040f.mo27525b()).mo79556g(Uri.parse(str2), false, false)) {
            if (!"com.google.android.googlequicksearchbox".equals(((Context) aaVar.f262036b.mo27525b()).getPackageName())) {
                C59104x b = C93809aa.f262034a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "WebViewCookiesAsync");
                ((C59052c) ((C59052c) b).mo56372aa(19073)).mo56386p("Not googlequicksearchbox package, skipping refresh cookies");
            } else if (!C93809aa.m154809i(str)) {
                return C60922j.m93045h(this.f262104b.mo83049b(true), new C93842v(this, this.f262103a), C60826bg.f164896a);
            }
        }
        return C60856cj.m92900i(str);
    }
}
