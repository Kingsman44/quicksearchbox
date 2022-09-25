package com.google.android.apps.gsa.search.core.google;

import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.google.p6796f.C85980b;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p6968aa.C89013ak;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import p3186j$.net.URLEncoder;

/* renamed from: com.google.android.apps.gsa.search.core.google.cl */
/* compiled from: PG */
public final class C85918cl extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C85929cw f232282a;

    /* renamed from: b */
    final /* synthetic */ CharSequence f232283b;

    /* renamed from: c */
    final /* synthetic */ String f232284c;

    /* renamed from: d */
    final /* synthetic */ C85919cm f232285d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85918cl(C85919cm cmVar, C85929cw cwVar, CharSequence charSequence, String str) {
        super("logUrlQuery", 2, 12);
        this.f232285d = cmVar;
        this.f232282a = cwVar;
        this.f232283b = charSequence;
        this.f232284c = str;
    }

    public final void run() {
        String str;
        C85929cw cwVar = this.f232282a;
        String obj = this.f232283b.toString();
        String str2 = this.f232284c;
        obj.getClass();
        str2.getClass();
        String x = cwVar.f232330f.mo79758x(C90120fr.f250773M);
        try {
            str = String.format(C85980b.f232491a, x, new Object[]{cwVar.f232332h.mo83211i(), URLEncoder.encode(obj, Charset.defaultCharset().displayName()), URLEncoder.encode(str2, Charset.defaultCharset().displayName())});
        } catch (UnsupportedEncodingException unused) {
            C59104x d = C85929cw.f232318a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Search.SearchUrlHelper");
            ((C59052c) ((C59052c) d).mo56372aa(7917)).mo56354G("Failed to URL encode query and url: %s, %s", obj, str2);
            str = String.format(C85980b.f232491a, x, new Object[]{cwVar.f232332h.mo83211i(), obj.replaceAll("@|&", BuildConfig.FLAVOR), str2.replaceAll("@|&", BuildConfig.FLAVOR)});
        }
        C85981c h = cwVar.mo79568h(Uri.parse(str));
        C58976aa aaVar = C58975e.f156826a;
        ((C85963di) cwVar.f232342r.mo27525b()).mo79491a(h);
        UriRequest b = cwVar.mo79566f(h).mo79626b((C85966dl) null);
        try {
            C89019aq c = C89020ar.m144758c();
            c.mo82994f(b.f236331a.toString());
            c.mo82991c(b.mo81502a());
            c.f241244j = true;
            c.f241245k = 5;
            ((C89057m) C90877ak.m148472f(((C89012aj) this.f232285d.f232289c.mo27525b()).mo27495f(c.mo82989a(), C89009ag.f241207b, ((C89012aj) this.f232285d.f232289c.mo27525b()).mo27510b(C89066v.f241382a)))).mo83036f();
        } catch (C89013ak | C90457d | InterruptedException e) {
            C59104x d2 = C85919cm.f232286a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "Velvet.SearchBoxLogging");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e)).mo56372aa(7890)).mo56386p("Could not do gen_204 for launching url");
        } catch (MalformedURLException | ExecutionException e2) {
            C59104x d3 = C85919cm.f232286a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "Velvet.SearchBoxLogging");
            ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(e2)).mo56372aa(7891)).mo56386p("Could not do gen_204 for launching url");
        }
    }
}
