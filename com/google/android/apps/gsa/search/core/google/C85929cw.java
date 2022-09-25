package com.google.android.apps.gsa.search.core.google;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.corpora.C85752a;
import com.google.android.apps.gsa.search.core.corpora.C85753b;
import com.google.android.apps.gsa.search.core.corpora.WebCorpus;
import com.google.android.apps.gsa.search.core.google.p6796f.C85980b;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86130z;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.search.C90482a;
import com.google.android.apps.gsa.shared.search.C90498f;
import com.google.android.apps.gsa.shared.search.C90503k;
import com.google.android.apps.gsa.shared.search.C90504l;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.search.corpus.Corpus;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7191w.C91144a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4575r.C60761r;
import com.google.p4500cm.p4518d.C58190g;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

@Deprecated
/* renamed from: com.google.android.apps.gsa.search.core.google.cw */
/* compiled from: PG */
public final class C85929cw {

    /* renamed from: a */
    public static final C59071e f232318a = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.cw");

    /* renamed from: b */
    public static final C58528ij f232319b = new C58759qy("X-Client-Opt-In-Context");

    /* renamed from: c */
    public static final C58528ij f232320c = new C58759qy("X-Geo");

    /* renamed from: t */
    private static final Pattern f232321t = Pattern.compile(".*:\\d+");

    /* renamed from: u */
    private static final C58528ij f232322u = C58528ij.m90011K("auth", "uberauth");

    /* renamed from: A */
    private final C68214a f232323A;

    /* renamed from: B */
    private final C68214a f232324B;

    /* renamed from: C */
    private final C68214a f232325C;

    /* renamed from: D */
    private final C68214a f232326D;

    /* renamed from: E */
    private final C68214a f232327E;

    /* renamed from: d */
    public final Context f232328d;

    /* renamed from: e */
    public final C86130z f232329e;

    /* renamed from: f */
    public final C86124t f232330f;

    /* renamed from: g */
    public final C89994f f232331g;

    /* renamed from: h */
    public final C85923cq f232332h;

    /* renamed from: i */
    public final C86338r f232333i;

    /* renamed from: j */
    public final C85886bi f232334j;

    /* renamed from: k */
    public final C68214a f232335k;

    /* renamed from: l */
    public final C68214a f232336l;

    /* renamed from: m */
    public final C68214a f232337m;

    /* renamed from: n */
    public final C68214a f232338n;

    /* renamed from: o */
    public final C68214a f232339o;

    /* renamed from: p */
    public final C68214a f232340p;

    /* renamed from: q */
    public final C68214a f232341q;

    /* renamed from: r */
    public final C68214a f232342r;

    /* renamed from: s */
    public final C68214a f232343s;

    /* renamed from: v */
    private final C21370a f232344v;

    /* renamed from: w */
    private final C85753b f232345w;

    /* renamed from: x */
    private final C68214a f232346x;

    /* renamed from: y */
    private final C68214a f232347y;

    /* renamed from: z */
    private final C68214a f232348z;

    public C85929cw(Context context, C86130z zVar, C86124t tVar, C21370a aVar, C85753b bVar, C89994f fVar, C85923cq cqVar, C86338r rVar, C85886bi biVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C68214a aVar10, C68214a aVar11, C68214a aVar12, C68214a aVar13, C68214a aVar14, C68214a aVar15, C68214a aVar16, C68214a aVar17, C68214a aVar18) {
        this.f232328d = context;
        this.f232329e = zVar;
        this.f232330f = tVar;
        this.f232344v = aVar;
        this.f232345w = bVar;
        this.f232331g = fVar;
        this.f232332h = cqVar;
        this.f232333i = rVar;
        this.f232334j = biVar;
        this.f232335k = aVar2;
        this.f232336l = aVar3;
        this.f232337m = aVar4;
        this.f232338n = aVar5;
        this.f232346x = aVar6;
        this.f232347y = aVar7;
        this.f232348z = aVar8;
        this.f232339o = aVar9;
        this.f232323A = aVar10;
        this.f232340p = aVar11;
        this.f232341q = aVar12;
        this.f232342r = aVar13;
        this.f232324B = aVar14;
        this.f232343s = aVar15;
        this.f232325C = aVar16;
        this.f232326D = aVar17;
        this.f232327E = aVar18;
    }

    /* renamed from: C */
    public static int m138085C(String str) {
        return ("X-Additional-Discourse-Context".equals(str) || "X-Client-Discourse-Context".equals(str)) ? 2 : 3;
    }

    /* renamed from: D */
    private static Uri m138086D(String str, String str2, Uri uri, Set set, Map map) {
        Uri.Builder builder;
        if (set == null || set.isEmpty()) {
            builder = uri.buildUpon();
        } else {
            builder = new Uri.Builder().fragment(uri.getFragment()).path(uri.getPath());
            for (String next : uri.getQueryParameterNames()) {
                if (!set.contains(next)) {
                    for (String appendQueryParameter : uri.getQueryParameters(next)) {
                        builder.appendQueryParameter(next, appendQueryParameter);
                    }
                }
            }
        }
        builder.scheme(str);
        builder.encodedAuthority(str2);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return builder.build();
    }

    /* renamed from: c */
    public static Uri m138087c(Uri uri, Uri uri2, Set set, Map map) {
        return m138086D(uri.getScheme(), uri.getEncodedAuthority(), uri2, set, map);
    }

    /* renamed from: n */
    public static UriRequest m138088n(UriRequest uriRequest, String str) {
        Uri.Builder clearQuery = uriRequest.f236331a.buildUpon().clearQuery();
        for (String next : uriRequest.f236331a.getQueryParameterNames()) {
            String queryParameter = uriRequest.f236331a.getQueryParameter(next);
            if (!"q".equals(next) && queryParameter != null) {
                clearQuery.appendQueryParameter(next, queryParameter);
            }
        }
        clearQuery.appendQueryParameter("q", str);
        return new UriRequest(clearQuery.build(), uriRequest.mo81502a(), (Map) null, (byte[]) null);
    }

    /* renamed from: r */
    public static String m138089r(String str) {
        if ("iw".equals(str)) {
            return "he";
        }
        if ("in".equals(str)) {
            return "id";
        }
        return "ji".equals(str) ? "yi" : str;
    }

    /* renamed from: u */
    public static String m138090u(Uri uri) {
        if (uri == null) {
            return BuildConfig.FLAVOR;
        }
        if (!uri.isHierarchical() || Collections.disjoint(uri.getQueryParameterNames(), f232322u)) {
            return uri.toString();
        }
        return uri.buildUpon().query("REDACTED").build().toString();
    }

    /* renamed from: v */
    public static String m138091v(String str) {
        return str == null ? BuildConfig.FLAVOR : m138090u(Uri.parse(str));
    }

    /* renamed from: x */
    public static void m138092x(C85981c cVar) {
        cVar.mo79638d("getexp", "1");
    }

    /* renamed from: A */
    public final C58881cr mo79560A(Query query) {
        return C58886cw.m90973a(new C85928cv(this, query));
    }

    /* renamed from: B */
    public final C85965dk mo79561B(Query query) {
        C85981c i = mo79569i(query, false, true, false);
        ((C85970dp) this.f232325C.mo27525b()).mo79436d(i, query);
        return mo79566f(i);
    }

    /* renamed from: a */
    public final Uri mo79562a(String str) {
        return Uri.parse(String.format(C85980b.f232491a, str, new Object[]{this.f232332h.mo83212j(), this.f232332h.mo83211i()}));
    }

    /* renamed from: b */
    public final Uri mo79563b(boolean z) {
        Uri.Builder builder = new Uri.Builder();
        if (!z || this.f232332h.mo83212j().equals("https")) {
            builder.scheme(this.f232332h.mo83212j());
        } else {
            builder.scheme("https");
        }
        builder.encodedAuthority(this.f232332h.mo83211i());
        return builder.build();
    }

    /* renamed from: d */
    public final Uri mo79564d(Uri uri, String str) {
        String str2;
        String str3;
        if (str.startsWith("/")) {
            str = str.replace(":", "%3A");
        }
        Uri parse = Uri.parse(str);
        if (!parse.isRelative()) {
            return parse;
        }
        if (uri != null) {
            str3 = uri.getScheme();
            str2 = uri.getEncodedAuthority();
        } else {
            str3 = this.f232332h.mo83212j();
            str2 = this.f232332h.mo83211i();
            if (!str2.equals(this.f232332h.mo79551b()) || !f232321t.matcher(str2).matches()) {
                str2 = Uri.encode(str2);
            }
        }
        return m138086D(str3, str2, parse, (Set) null, (Map) null);
    }

    /* renamed from: f */
    public final C85965dk mo79566f(C85981c cVar) {
        return new C85965dk(cVar, this.f232333i);
    }

    /* renamed from: g */
    public final C85965dk mo79567g(Query query, int i) {
        C58838bb.m90868c(query.mo84468dv());
        C85981c cVar = new C85981c();
        C85968dn dnVar = (C85968dn) this.f232341q.mo27525b();
        dnVar.mo79438f(cVar, dnVar.mo79434a(query));
        String str = query.f252770i;
        if (!TextUtils.isEmpty(str)) {
            cVar.mo79638d("q", str);
        }
        C85955da.m138191a(cVar, query.f252749G);
        ((C85857ao) this.f232337m.mo27525b()).mo79489b(cVar, query, true);
        ((C85854al) this.f232343s.mo27525b()).mo79436d(cVar, query);
        ((C85924cr) this.f232340p.mo27525b()).mo79558a(query, cVar);
        ((C85908cb) this.f232336l.mo27525b()).mo79536d(cVar, query);
        ((C85862at) this.f232347y.mo27525b()).mo79493b(cVar, query, C39226b.TAG_CLASSIC_SEARCH_URI_LO);
        ((C85882be) this.f232326D.mo27525b()).mo79436d(cVar, query);
        C86074p pVar = (C86074p) this.f232335k.mo27525b();
        pVar.mo79715c(cVar, false, false, pVar.mo79714b());
        ((C85889bl) this.f232324B.mo27525b()).mo79521a(cVar, query);
        ((C85970dp) this.f232325C.mo27525b()).mo79436d(cVar, query);
        ((C85972dr) this.f232323A.mo27525b()).mo79491a(cVar);
        ((C85902by) this.f232339o.mo27525b()).mo79530g(cVar);
        mo79579w(cVar, i);
        ((C86076r) this.f232327E.mo27525b()).mo79436d(cVar, query);
        ((C85963di) this.f232342r.mo27525b()).mo79491a(cVar);
        Uri uri = cVar.f232493a;
        uri.getClass();
        cVar.mo79637c(cVar.f232497e, "Host", uri.getAuthority());
        return mo79566f(cVar);
    }

    /* renamed from: h */
    public final C85981c mo79568h(Uri uri) {
        C85981c cVar = new C85981c();
        ((C85968dn) this.f232341q.mo27525b()).mo79437e(cVar, uri);
        return cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final C85981c mo79569i(Query query, boolean z, boolean z2, boolean z3) {
        String str;
        if (!z) {
            C90748e.m148224b();
        }
        boolean z4 = !z;
        WebCorpus a = C85857ao.m137949a(this.f232345w, query);
        a.getClass();
        String str2 = a.f231866a;
        Long l = null;
        if (query != null) {
            C58838bb.m90868c(query.mo84468dv());
            str = query.f252770i;
        } else {
            str = null;
        }
        String a2 = ((C85908cb) this.f232336l.mo27525b()).mo79534a();
        if (query != null) {
            l = Long.valueOf(query.f252749G);
        }
        C85981c j = mo79570j(str2, query, str, a2, l, true, z4, z2);
        if (query != null && ((!query.mo84392cY() || query.mo84329bN()) && z3)) {
            mo79579w(j, 1);
        }
        return j;
    }

    /* renamed from: j */
    public final C85981c mo79570j(String str, Query query, String str2, String str3, Long l, boolean z, boolean z2, boolean z3) {
        C85981c cVar = new C85981c();
        if (query == null) {
            ((C85968dn) this.f232341q.mo27525b()).mo79435c(cVar, str);
        } else {
            ((C85968dn) this.f232341q.mo27525b()).mo79438f(cVar, str);
            ((C85902by) this.f232339o.mo27525b()).mo79530g(cVar);
            if (!TextUtils.isEmpty(str2)) {
                cVar.mo79638d("q", str2);
            }
            if (l != null) {
                C85955da.m138191a(cVar, l.longValue());
            }
            ((C85857ao) this.f232337m.mo27525b()).mo79489b(cVar, query, z);
            ((C85854al) this.f232343s.mo27525b()).mo79436d(cVar, query);
            ((C85908cb) this.f232336l.mo27525b()).mo79535b(cVar, query, str3, z);
            ((C85862at) this.f232347y.mo27525b()).mo79493b(cVar, query, C39226b.TAG_CLASSIC_SEARCH_URI_LO);
            C86074p pVar = (C86074p) this.f232335k.mo27525b();
            pVar.mo79715c(cVar, query.mo84392cY(), z3, pVar.mo79714b());
            ((C85972dr) this.f232323A.mo27525b()).mo79491a(cVar);
            ((C85889bl) this.f232324B.mo27525b()).mo79521a(cVar, query);
            ((C86076r) this.f232327E.mo27525b()).mo79436d(cVar, query);
            if (z2) {
                ((C85924cr) this.f232340p.mo27525b()).mo79558a(query, cVar);
            }
        }
        return cVar;
    }

    /* renamed from: k */
    public final UriRequest mo79571k(C58190g gVar) {
        C85981c h = mo79568h(Uri.parse(String.format(C85980b.f232491a, "%1$s://%2$s/velog/action", new Object[]{this.f232332h.mo83212j(), this.f232332h.mo83211i()})));
        ((C85902by) this.f232339o.mo27525b()).mo79527c(h);
        h.mo79638d("pb", Base64.encodeToString(gVar.toByteArray(), 11));
        ((C85963di) this.f232342r.mo27525b()).mo79491a(h);
        return mo79566f(h).mo79626b((C85966dl) null);
    }

    /* renamed from: l */
    public final UriRequest mo79572l(Query query) {
        String x;
        String x2 = this.f232330f.mo79758x(C90120fr.f250764D);
        String bk = query.mo84352bk();
        if (query.mo84403cj()) {
            x = this.f232330f.mo79758x(C90014bt.f247084aV);
        } else if (query.mo84405cl()) {
            x = this.f232330f.mo79758x(C90085ej.f250233k);
        } else if (query.f252767f == QueryTriggerType.INSPIRE_REFRESH) {
            x = this.f232330f.mo79758x(C90085ej.f250234l);
        } else {
            x = this.f232330f.mo79758x(C90120fr.f250845l);
        }
        C85981c j = mo79570j(x2, query, bk, x, (Long) null, false, false, false);
        if (query.mo84403cj()) {
            mo79579w(j, 4);
        }
        ((C85958dd) this.f232338n.mo27525b()).mo79624a(j, query, (String) null);
        j.mo79638d("xssi", C42181t.f110467a);
        if (mo79580y()) {
            m138092x(j);
        }
        ((C85963di) this.f232342r.mo27525b()).mo79491a(j);
        return mo79566f(j).mo79626b((C85966dl) null);
    }

    /* renamed from: m */
    public final UriRequest mo79573m(Query query, boolean z) {
        C85981c i = mo79569i(query, z, false, !z);
        if (!z) {
            ((C85963di) this.f232342r.mo27525b()).mo79491a(i);
        }
        return mo79566f(i).mo79626b((C85966dl) null);
    }

    /* renamed from: o */
    public final Query mo79574o(Query query, String str) {
        C58833ax p = mo79575p(str);
        if (!p.mo56113h()) {
            return null;
        }
        C85932cz czVar = (C85932cz) p.mo56107c();
        int a = czVar.mo79584a();
        if (a == 1) {
            C90504l b = czVar.mo79585b();
            b.getClass();
            return query.mo84266aC(str, b);
        } else if (a == 2) {
            C90504l b2 = czVar.mo79585b();
            b2.getClass();
            return query.mo84267aD(b2.mo84517h());
        } else if (a != 3) {
            return null;
        } else {
            C90498f i = query.mo84480i();
            i.mo84562U(13);
            i.mo84542A(str);
            i.mo84543B(str);
            i.mo84582n("query-header-visibility", 2);
            i.mo84572d(0, 536870912);
            i.mo84573e(0, 72057594037927936L);
            return i.mo84568a();
        }
    }

    /* renamed from: p */
    public final C58833ax mo79575p(String str) {
        Uri parse = Uri.parse(str);
        C58976aa aaVar = C58975e.f156826a;
        if (((C85961dg) this.f232346x.mo27525b()).mo79625a(str)) {
            C85931cy c = C85932cz.m138119c();
            c.mo79583b(3);
            return C58833ax.m90834k(c.mo79582a());
        }
        int i = 0;
        String str2 = null;
        if (this.f232332h.mo79556g(parse, false, false)) {
            if (!this.f232329e.mo79768h(parse.getPath())) {
                String s = mo79577s(parse, false, true);
                if (s != null) {
                    C58833ax p = mo79575p(s);
                    if (p.mo56113h()) {
                        return p;
                    }
                }
            } else if (parse.isHierarchical()) {
                String a = C91144a.m148924a(parse, this.f232329e.mo79764c(R.string.toolbelt_mode_query_param));
                String a2 = C91144a.m148924a(parse, this.f232329e.mo79764c(R.string.toolbelt_state_query_param));
                C85752a aVar = this.f232345w.f231875b;
                String c2 = C85752a.m137793c(a, a2);
                if (aVar.f231873c.containsKey(c2)) {
                    str2 = ((Corpus) aVar.f231873c.get(c2)).f252914e;
                } else {
                    String c3 = C85752a.m137793c(a, (String) null);
                    str2 = aVar.f231873c.containsKey(c3) ? ((Corpus) aVar.f231873c.get(c3)).f252914e : "web";
                }
            }
        } else if (TextUtils.equals(parse.getAuthority(), this.f232332h.mo79550a())) {
            C85931cy c4 = C85932cz.m138119c();
            c4.mo79583b(2);
            C90503k l = C90504l.m147594l();
            l.mo84504b(C85968dn.m137828b(parse));
            ((C86069k) c4).f232653a = l.mo84503a();
            return C58833ax.m90834k(c4.mo79582a());
        } else if (this.f232345w.f231875b.mo79409d()) {
            C58801sm G = this.f232345w.f231875b.f231872b.listIterator(0);
            while (true) {
                if (!G.hasNext()) {
                    break;
                }
                WebCorpus webCorpus = (WebCorpus) G.next();
                if (C58832aw.m90831a(parse.getPath(), webCorpus.f231868c) && C58832aw.m90831a(parse.getAuthority(), webCorpus.f231869d)) {
                    str2 = webCorpus.f252914e;
                    break;
                }
            }
        }
        if (str2 != null) {
            String a3 = C91144a.m148924a(parse, "output");
            if (TextUtils.equals("rss", a3) || TextUtils.equals("atom", a3)) {
                return C58836b.f156633a;
            }
            String a4 = C91144a.m148924a(parse, "q");
            if (a4 != null) {
                String a5 = C91144a.m148924a(parse, "start");
                if (!TextUtils.isEmpty(a5)) {
                    try {
                        i = Integer.parseInt(a5);
                    } catch (NumberFormatException e) {
                        C59104x d = f232318a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "Search.SearchUrlHelper");
                        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(7913)).mo56354G("Invalid integer value \"%s\" in search URL %s", "start", a5);
                    }
                }
                String a6 = C91144a.m148924a(parse, "stick");
                String a7 = C91144a.m148924a(parse, "tbs");
                Map b = C85968dn.m137828b(parse);
                String fragment = parse.getFragment();
                String a8 = C91144a.m148924a(parse, "hl");
                boolean equals = "-1".equals(C91144a.m148924a(parse, "tch"));
                boolean equals2 = "1".equals(C91144a.m148924a(parse, "gsas"));
                boolean equals3 = "4".equals(C91144a.m148924a(parse, "gsas"));
                C85931cy c5 = C85932cz.m138119c();
                c5.mo79583b(1);
                C90503k l2 = C90504l.m147594l();
                C90482a aVar2 = (C90482a) l2;
                aVar2.f252841a = a4;
                aVar2.f252842b = str2;
                l2.mo84508f(i);
                aVar2.f252843c = a6;
                aVar2.f252844d = a7;
                l2.mo84504b(b);
                aVar2.f252846f = a8;
                l2.mo84506d(equals);
                l2.mo84507e(equals2);
                l2.mo84505c(equals3);
                aVar2.f252847g = fragment;
                ((C86069k) c5).f232653a = l2.mo84503a();
                return C58833ax.m90834k(c5.mo79582a());
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: q */
    public final C58881cr mo79576q(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (!this.f232332h.mo79556g(uri, false, false) || !this.f232329e.mo79764c(R.string.clicked_ad_url_path).equals(uri.getPath())) {
            return null;
        }
        C86130z zVar = this.f232329e;
        String uri2 = uri.toString();
        for (String matches : zVar.mo79770k(R.array.click_ad_url_exception_patterns, false)) {
            if (uri2.matches(matches)) {
                C59104x d = f232318a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "Search.SearchUrlHelper");
                ((C59052c) ((C59052c) d).mo56372aa(7926)).mo56386p("Not handling JS-redirected ad click link");
                return null;
            }
        }
        String[] k = this.f232329e.mo79770k(R.array.click_ad_url_substitutions, true);
        ArrayList<Pair> arrayList = new ArrayList<>();
        for (int i = 0; i < k.length - 1; i += 2) {
            arrayList.add(Pair.create(k[i], k[i + 1]));
        }
        String uri3 = uri.toString();
        for (Pair pair : arrayList) {
            uri3 = uri3.replaceAll((String) pair.first, (String) pair.second);
        }
        C58976aa aaVar = C58975e.f156826a;
        return new C85926ct(this, uri3);
    }

    /* renamed from: s */
    public final String mo79577s(Uri uri, boolean z, boolean z2) {
        String c = this.f232329e.mo79764c(R.string.clicked_result_url_path);
        if (uri == null || !this.f232332h.mo79556g(uri, z, z2) || !TextUtils.equals(uri.getPath(), c)) {
            return null;
        }
        for (String queryParameter : this.f232329e.mo79770k(R.array.clicked_result_destination_params, false)) {
            String queryParameter2 = uri.getQueryParameter(queryParameter);
            if (!TextUtils.isEmpty(queryParameter2)) {
                return queryParameter2;
            }
        }
        return null;
    }

    /* renamed from: t */
    public final String mo79578t() {
        Locale locale = C85980b.f232491a;
        WebCorpus a = this.f232345w.f231875b.mo79407a();
        a.getClass();
        return String.format(locale, a.f231866a, new Object[]{this.f232332h.mo83212j(), this.f232332h.mo83211i()});
    }

    /* renamed from: w */
    public final void mo79579w(C85981c cVar, int i) {
        ((C86080v) this.f232348z.mo27525b()).mo79716a(cVar, i);
    }

    /* renamed from: y */
    public final boolean mo79580y() {
        return this.f232344v.mo26870b() - this.f232333i.getLong("server_experiment_ids_timestamp", 0) >= 3600000;
    }

    /* renamed from: z */
    public final UriRequest mo79581z(String str) {
        C58838bb.m90868c(!TextUtils.isEmpty(str));
        C85981c h = mo79568h(Uri.parse(str));
        ((C85902by) this.f232339o.mo27525b()).mo79530g(h);
        h.mo79638d("hl", ((C85854al) this.f232343s.mo27525b()).mo79488a());
        h.mo79638d("client", ((C85908cb) this.f232336l.mo27525b()).mo79534a());
        ((C85857ao) this.f232337m.mo27525b()).mo79490c(h);
        C86074p pVar = (C86074p) this.f232335k.mo27525b();
        pVar.mo79715c(h, true, false, pVar.mo79714b());
        h.mo79637c(h.f232497e, "User-Agent", (String) ((C85970dp) this.f232325C.mo27525b()).f232479a.mo6453a());
        ((C85862at) this.f232347y.mo27525b()).mo79495e(h, (Query) null, C39226b.TAG_CLASSIC_SEARCH_URI_LO);
        ((C86076r) this.f232327E.mo27525b()).mo79436d(h, (Query) null);
        if (!TextUtils.isEmpty(BuildConfig.FLAVOR)) {
            h.mo79637c(h.f232497e, "If-None-Match", BuildConfig.FLAVOR);
        }
        return mo79566f(h).mo79626b((C85966dl) null);
    }

    /* renamed from: e */
    public final Pair mo79565e(Uri uri, Uri uri2, long j) {
        String str;
        uri.getClass();
        HashMap hashMap = new HashMap();
        String s = mo79577s(uri, false, false);
        if (TextUtils.isEmpty(s)) {
            return Pair.create(new UriRequest(uri, hashMap, (Map) null, (byte[]) null), (Object) null);
        }
        Uri d = mo79564d(uri, s);
        if (uri2 == null || this.f232332h.mo79557h()) {
            str = BuildConfig.FLAVOR;
        } else {
            if (uri2.getScheme().equalsIgnoreCase("https")) {
                Uri.Builder authority = Uri.EMPTY.buildUpon().authority(uri2.getAuthority());
                if (d == null || !d.getScheme().equalsIgnoreCase("http")) {
                    authority.scheme("https");
                } else {
                    authority.scheme("http");
                }
                uri2 = authority.build();
            }
            str = uri2.toString();
        }
        if (!str.isEmpty()) {
            hashMap.put("Referer", str);
        }
        UriRequest uriRequest = new UriRequest(d, hashMap, (Map) null, (byte[]) null);
        C85981c h = mo79568h(uri);
        ((C85902by) this.f232339o.mo27525b()).mo79527c(h);
        ((C85857ao) this.f232337m.mo27525b()).mo79490c(h);
        h.mo79638d("agsac", Base64.encodeToString(C60761r.m92760f(j), 11));
        return Pair.create(uriRequest, new C85927cu(this, h));
    }
}
