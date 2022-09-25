package com.google.android.apps.search.googleapp.search.srp.p10435e;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.android.apps.search.googleapp.p10516t.p10519c.C139695b;
import com.google.android.apps.search.googleapp.search.p10409e.C137415d;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137540b;
import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d;
import com.google.android.apps.search.googleapp.search.srp.p10437g.C137852a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69762k;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.e.ba */
/* compiled from: PG */
public final class C137777ba {

    /* renamed from: b */
    private static final C59071e f374798b = C59071e.m91331h();

    /* renamed from: a */
    public final boolean f374799a;

    /* renamed from: c */
    private final Context f374800c;

    /* renamed from: d */
    private final boolean f374801d;

    /* renamed from: e */
    private final String f374802e;

    /* renamed from: f */
    private final C136832c f374803f;

    /* renamed from: g */
    private final Optional f374804g;

    /* renamed from: h */
    private final C139695b f374805h;

    /* renamed from: i */
    private final C137852a f374806i;

    /* renamed from: j */
    private final boolean f374807j;

    /* renamed from: k */
    private final Set f374808k;

    public C137777ba(Context context, String str, boolean z, String str2, C136832c cVar, Optional optional, C139695b bVar, C137852a aVar, boolean z2, boolean z3) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(cVar, "googleUrlAnalyzer");
        C69664n.m101061g(optional, "debugPropertyLookupOptional");
        C69664n.m101061g(bVar, "sourceReader");
        C69664n.m101061g(aVar, "nonSearchUrlAnalyzer");
        this.f374800c = context;
        this.f374801d = z;
        this.f374802e = str2;
        this.f374803f = cVar;
        this.f374804g = optional;
        this.f374805h = bVar;
        this.f374806i = aVar;
        this.f374807j = z2;
        this.f374799a = z3;
        Object[] array = new C69762k(",").mo61433a(str, 0).toArray(new String[0]);
        C69664n.m101059e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        this.f374808k = new HashSet(C69540x.m100947e(Arrays.copyOf(strArr, strArr.length)));
    }

    /* renamed from: d */
    private final Map m223958d(C137542d dVar, Map map) {
        C137542d dVar2;
        int i;
        CharSequence charSequence;
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        C137418g gVar = dVar.f374092f;
        if (gVar == null) {
            gVar = C137418g.f373767r;
        }
        String str = gVar.f373770b;
        C69664n.m101060f(str, "searchQuery.queryOptions.query");
        hashMap.put("q", str);
        int i2 = dVar.f374088b;
        int a = C137540b.m223424a(i2);
        if (a == 0 || a != 2) {
            int a2 = C137540b.m223424a(i2);
            if (a2 != 0 && a2 == 7) {
                C137418g gVar2 = dVar.f374092f;
                if (gVar2 == null) {
                    gVar2 = C137418g.f373767r;
                }
                if (!Collection.EL.stream(Collections.unmodifiableMap(gVar2.f373773e).entrySet()).anyMatch(C137774ay.f374795a)) {
                    hashMap.put("gs_lp", BuildConfig.FLAVOR);
                }
            } else {
                hashMap.put("gs_lp", BuildConfig.FLAVOR);
            }
        }
        C137418g gVar3 = dVar.f374092f;
        if (gVar3 == null) {
            gVar3 = C137418g.f373767r;
        }
        String str2 = gVar3.f373771c;
        C69664n.m101060f(str2, "searchQuery.queryOptions.corpusType");
        hashMap.put("tbm", str2);
        hashMap.put("qsubts", String.valueOf(dVar.f374089c));
        String str3 = "1";
        hashMap.put("cs", true != dVar.f374090d ? "0" : str3);
        if (dVar == null) {
            dVar2 = C137542d.f374085g;
            C69664n.m101060f(dVar2, "getDefaultInstance()");
        } else {
            dVar2 = dVar;
        }
        Resources resources = this.f374800c.getResources();
        C137418g gVar4 = dVar2.f374092f;
        if (gVar4 == null) {
            gVar4 = C137418g.f373767r;
        }
        int a3 = C137415d.m223276a(gVar4.f373774f);
        if (a3 == 0) {
            a3 = 1;
        }
        C137770au auVar = C137770au.PSYCHIC;
        int i3 = a3 - 1;
        if (i3 == 0) {
            i = resources.getDimensionPixelSize(R.dimen.googleapp_srp_header_padding_top);
        } else if (i3 != 1) {
            i = 0;
        } else {
            i = resources.getDimensionPixelSize(R.dimen.googleapp_srp_header_search_box_padding_top);
        }
        double d = (double) i;
        double d2 = (double) resources.getDisplayMetrics().density;
        Double.isNaN(d);
        Double.isNaN(d2);
        hashMap.put("padt", String.valueOf((int) Math.ceil(d / d2)));
        C137418g gVar5 = dVar.f374092f;
        if (gVar5 == null) {
            gVar5 = C137418g.f373767r;
        }
        int a4 = C137415d.m223276a(gVar5.f373774f);
        if (a4 == 0) {
            a4 = 1;
        }
        int i4 = a4 - 1;
        if (i4 == 1) {
            str3 = "4";
        } else if (i4 != 2) {
            str3 = null;
        }
        if (str3 != null) {
            hashMap.put("gsas", str3);
        }
        if (!(!this.f374807j || (charSequence = (CharSequence) hashMap.get("hl")) == null || charSequence.length() == 0)) {
            C137418g gVar6 = dVar.f374092f;
            if (gVar6 == null) {
                gVar6 = C137418g.f373767r;
            }
            String str4 = (String) Collections.unmodifiableMap(gVar6.f373773e).get("hl");
            if (str4 != null) {
                hashMap.put("hl", str4);
            }
        }
        C137418g gVar7 = dVar.f374092f;
        if (gVar7 == null) {
            gVar7 = C137418g.f373767r;
        }
        Collection.EL.stream(Collections.unmodifiableMap(gVar7.f373773e).entrySet()).forEach(new C137773ax(hashMap));
        if (C69664n.m101066l(hashMap.get("inm"), "vs")) {
            hashMap.remove("tch");
        }
        return hashMap;
    }

    /* renamed from: e */
    private final void m223959e(Uri.Builder builder) {
        HashMap hashMap = new HashMap();
        Optional flatMap = this.f374804g.flatMap(C137775az.f374796a);
        String str = this.f374802e;
        if (true == C69764m.m101229h(str)) {
            str = null;
        }
        String str2 = (String) flatMap.orElse(str);
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        if (str2.length() != 0) {
            for (String E : C69764m.m101188E(str2, new String[]{"&"})) {
                List E2 = C69764m.m101188E(E, new String[]{"="});
                if (E2.size() != 2) {
                    C59052c cVar = (C59052c) f374798b.mo56226d();
                    cVar.mo56379ah(new C59094n(41059));
                    cVar.mo56386p("Illegal extra query parameter, please follow the format a=b&c=d");
                } else {
                    hashMap.put(E2.get(0), E2.get(1));
                }
            }
            C137772aw.m223955a(builder, hashMap);
        }
    }

    /* renamed from: a */
    public final Uri.Builder mo113950a(C137542d dVar, Map map, String str, boolean z) {
        int a;
        C136832c cVar = this.f374803f;
        int i = C136832c.f372447a;
        Uri.Builder appendPath = cVar.mo113405k().appendPath(str);
        C69664n.m101060f(appendPath, "builder");
        m223959e(appendPath);
        C137772aw.m223955a(appendPath, m223958d(dVar, map));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str2 = dVar.f374091e;
        C69664n.m101060f(str2, "searchQuery.uriFragment");
        if (str2.length() > 0) {
            String str3 = dVar.f374091e;
            C69664n.m101060f(str3, "searchQuery.uriFragment");
            linkedHashSet.add(str3);
        }
        C137418g gVar = dVar.f374092f;
        if (gVar == null) {
            gVar = C137418g.f373767r;
        }
        String str4 = gVar.f373781m;
        C69664n.m101060f(str4, "searchQuery.queryOptions.uriFragment");
        if (str4.length() > 0) {
            C137418g gVar2 = dVar.f374092f;
            if (gVar2 == null) {
                gVar2 = C137418g.f373767r;
            }
            String str5 = gVar2.f373781m;
            C69664n.m101060f(str5, "searchQuery.queryOptions.uriFragment");
            linkedHashSet.add(str5);
        }
        if (z && (a = C137540b.m223424a(dVar.f374088b)) != 0 && a == 6) {
            linkedHashSet.add("isRetry");
        }
        if (!linkedHashSet.isEmpty()) {
            appendPath.encodedFragment(TextUtils.join("&", linkedHashSet));
        }
        return mo113951b(appendPath);
    }

    /* renamed from: b */
    public final Uri.Builder mo113951b(Uri.Builder builder) {
        Uri uri;
        C69664n.m101061g(builder, "builder");
        Uri build = builder.build();
        String queryParameter = build.getQueryParameter("source");
        if (C69764m.m101228g(queryParameter, "and.opa.ash", false)) {
            return builder;
        }
        Object orElse = this.f374805h.mo115169a().orElse(BuildConfig.FLAVOR);
        C69664n.m101060f(orElse, "sourceReader.getSource().orElse(\"\")");
        String str = (String) orElse;
        if (str.length() == 0) {
            C59052c cVar = (C59052c) f374798b.mo56225c();
            cVar.mo56378ag(C38505d.f101864b, 144280204);
            cVar.mo56379ah(new C59094n(41057));
            cVar.mo56386p("App entry source is absent.");
            return builder;
        } else if (C69764m.m101228g(queryParameter, str, false)) {
            return builder;
        } else {
            C69664n.m101060f(build, "uri");
            Uri.Builder buildUpon = build.buildUpon();
            String queryParameter2 = build.getQueryParameter("source");
            if (queryParameter2 == null || queryParameter2.length() == 0) {
                buildUpon.appendQueryParameter("source", str);
                uri = buildUpon.build();
            } else {
                buildUpon.clearQuery();
                Set<String> queryParameterNames = build.getQueryParameterNames();
                C69664n.m101060f(queryParameterNames, "queryParameterNames");
                for (String str2 : queryParameterNames) {
                    if (!C69664n.m101066l(str2, "source")) {
                        buildUpon.appendQueryParameter(str2, build.getQueryParameter(str2));
                    }
                }
                buildUpon.appendQueryParameter("source", str);
                uri = buildUpon.build();
            }
            C69664n.m101060f(uri, "with(buildUpon()) {\n    …    build()\n      }\n    }");
            Uri.Builder buildUpon2 = uri.buildUpon();
            C69664n.m101060f(buildUpon2, "uri\n        .addUriParam…der)\n        .buildUpon()");
            return buildUpon2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f7, code lost:
        if (r1.mo113403i(r5) == false) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x018c, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x018d, code lost:
        p5462h.p5472e.C69598b.m101013a(r0, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0191, code lost:
        throw r11;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.net.Uri mo113952c(com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d r10, java.util.Map r11) {
        /*
            r9 = this;
            java.lang.String r0 = "searchQuery"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r0)
            java.lang.String r0 = "requestParams"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r0)
            java.lang.String r0 = "toSearchUrl"
            com.google.apps.tiktok.tracing.bi r0 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r0)
            int r1 = r10.f374087a     // Catch:{ all -> 0x018a }
            r1 = r1 & 2
            if (r1 == 0) goto L_0x0184
            com.google.android.apps.search.googleapp.search.e.g r1 = r10.f374092f     // Catch:{ all -> 0x018a }
            if (r1 != 0) goto L_0x001c
            com.google.android.apps.search.googleapp.search.e.g r1 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r     // Catch:{ all -> 0x018a }
        L_0x001c:
            int r1 = r1.f373769a     // Catch:{ all -> 0x018a }
            r1 = r1 & 16
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0171
            com.google.android.apps.search.googleapp.search.e.g r1 = r10.f374092f     // Catch:{ all -> 0x018a }
            if (r1 != 0) goto L_0x002b
            com.google.android.apps.search.googleapp.search.e.g r4 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r     // Catch:{ all -> 0x018a }
            goto L_0x002c
        L_0x002b:
            r4 = r1
        L_0x002c:
            int r4 = r4.f373769a     // Catch:{ all -> 0x018a }
            r2 = r2 & r4
            java.lang.String r4 = "Failed requirement."
            if (r2 == 0) goto L_0x00dc
            if (r1 != 0) goto L_0x0037
            com.google.android.apps.search.googleapp.search.e.g r1 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r     // Catch:{ all -> 0x018a }
        L_0x0037:
            java.lang.String r1 = r1.f373770b     // Catch:{ all -> 0x018a }
            java.lang.String r2 = "searchQuery.queryOptions.query"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)     // Catch:{ all -> 0x018a }
            boolean r1 = p5462h.p5483m.C69764m.m101229h(r1)     // Catch:{ all -> 0x018a }
            if (r1 == 0) goto L_0x0046
            goto L_0x00dc
        L_0x0046:
            com.google.android.apps.search.googleapp.search.e.g r1 = r10.f374092f     // Catch:{ all -> 0x018a }
            if (r1 != 0) goto L_0x004d
            com.google.android.apps.search.googleapp.search.e.g r2 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r     // Catch:{ all -> 0x018a }
            goto L_0x004e
        L_0x004d:
            r2 = r1
        L_0x004e:
            int r2 = r2.f373769a     // Catch:{ all -> 0x018a }
            r2 = r2 & 16
            if (r2 == 0) goto L_0x00d6
            if (r1 != 0) goto L_0x0058
            com.google.android.apps.search.googleapp.search.e.g r1 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r     // Catch:{ all -> 0x018a }
        L_0x0058:
            java.lang.String r1 = r1.f373775g     // Catch:{ all -> 0x018a }
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ all -> 0x018a }
            android.net.Uri$Builder r1 = r1.buildUpon()     // Catch:{ all -> 0x018a }
            java.lang.String r2 = "parse(searchQuery.queryOptions.uri).buildUpon()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)     // Catch:{ all -> 0x018a }
            android.net.Uri$Builder r1 = r9.mo113951b(r1)     // Catch:{ all -> 0x018a }
            android.net.Uri r2 = r1.build()     // Catch:{ all -> 0x018a }
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x018a }
            java.util.Set r5 = r2.getQueryParameterNames()     // Catch:{ all -> 0x018a }
            r4.<init>(r5)     // Catch:{ all -> 0x018a }
            java.util.Set r5 = r9.f374808k     // Catch:{ all -> 0x018a }
            boolean r5 = r4.retainAll(r5)     // Catch:{ all -> 0x018a }
            if (r5 == 0) goto L_0x00bf
            com.google.common.f.e r5 = f374798b     // Catch:{ all -> 0x018a }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ all -> 0x018a }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x018a }
            com.google.common.f.aa r6 = com.google.android.libraries.search.integrations.p3018c.C38505d.f101864b     // Catch:{ all -> 0x018a }
            r7 = 162437965(0x9ae9b4d, float:4.203502E-33)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x018a }
            r5.mo56378ag(r6, r7)     // Catch:{ all -> 0x018a }
            java.lang.String r6 = "Deeplink contains request params not eligible for GoogleApp Search. Deeplink uri: %s"
            com.google.common.f.n r7 = new com.google.common.f.n     // Catch:{ all -> 0x018a }
            r8 = 41056(0xa060, float:5.7532E-41)
            r7.<init>(r8)     // Catch:{ all -> 0x018a }
            r5.mo56379ah(r7)     // Catch:{ all -> 0x018a }
            r5.mo56389s(r6, r2)     // Catch:{ all -> 0x018a }
            r1.clearQuery()     // Catch:{ all -> 0x018a }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x018a }
        L_0x00ab:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x018a }
            if (r5 == 0) goto L_0x00bf
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x018a }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x018a }
            java.lang.String r6 = r2.getQueryParameter(r5)     // Catch:{ all -> 0x018a }
            r1.appendQueryParameter(r5, r6)     // Catch:{ all -> 0x018a }
            goto L_0x00ab
        L_0x00bf:
            r9.m223959e(r1)     // Catch:{ all -> 0x018a }
            java.util.Map r10 = r9.m223958d(r10, r11)     // Catch:{ all -> 0x018a }
            com.google.android.apps.search.googleapp.search.srp.p10435e.C137772aw.m223955a(r1, r10)     // Catch:{ all -> 0x018a }
            android.net.Uri r10 = r1.build()     // Catch:{ all -> 0x018a }
            java.lang.String r11 = "getUriBuilderForDeeplink…y, requestParams).build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r11)     // Catch:{ all -> 0x018a }
            p5462h.p5472e.C69598b.m101013a(r0, r3)
            return r10
        L_0x00d6:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x018a }
            r10.<init>(r4)     // Catch:{ all -> 0x018a }
            throw r10     // Catch:{ all -> 0x018a }
        L_0x00dc:
            boolean r1 = r9.f374801d     // Catch:{ all -> 0x018a }
            java.lang.String r2 = "parse(searchQuery.queryOptions.uri)"
            if (r1 == 0) goto L_0x00f9
            com.google.android.apps.search.googleapp.o.c r1 = r9.f374803f     // Catch:{ all -> 0x018a }
            com.google.android.apps.search.googleapp.search.e.g r5 = r10.f374092f     // Catch:{ all -> 0x018a }
            if (r5 != 0) goto L_0x00ea
            com.google.android.apps.search.googleapp.search.e.g r5 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r     // Catch:{ all -> 0x018a }
        L_0x00ea:
            java.lang.String r5 = r5.f373775g     // Catch:{ all -> 0x018a }
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ all -> 0x018a }
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)     // Catch:{ all -> 0x018a }
            boolean r1 = r1.mo113403i(r5)     // Catch:{ all -> 0x018a }
            if (r1 != 0) goto L_0x0110
        L_0x00f9:
            com.google.android.apps.search.googleapp.search.srp.g.a r1 = r9.f374806i     // Catch:{ all -> 0x018a }
            com.google.android.apps.search.googleapp.search.e.g r5 = r10.f374092f     // Catch:{ all -> 0x018a }
            if (r5 != 0) goto L_0x0101
            com.google.android.apps.search.googleapp.search.e.g r5 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r     // Catch:{ all -> 0x018a }
        L_0x0101:
            java.lang.String r5 = r5.f373775g     // Catch:{ all -> 0x018a }
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ all -> 0x018a }
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)     // Catch:{ all -> 0x018a }
            boolean r1 = r1.mo114007a(r5)     // Catch:{ all -> 0x018a }
            if (r1 == 0) goto L_0x014e
        L_0x0110:
            com.google.android.apps.search.googleapp.search.e.g r1 = r10.f374092f     // Catch:{ all -> 0x018a }
            if (r1 != 0) goto L_0x0117
            com.google.android.apps.search.googleapp.search.e.g r2 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r     // Catch:{ all -> 0x018a }
            goto L_0x0118
        L_0x0117:
            r2 = r1
        L_0x0118:
            int r2 = r2.f373769a     // Catch:{ all -> 0x018a }
            r2 = r2 & 16
            if (r2 == 0) goto L_0x0148
            if (r1 != 0) goto L_0x0122
            com.google.android.apps.search.googleapp.search.e.g r1 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r     // Catch:{ all -> 0x018a }
        L_0x0122:
            java.lang.String r1 = r1.f373775g     // Catch:{ all -> 0x018a }
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ all -> 0x018a }
            android.net.Uri$Builder r1 = r1.buildUpon()     // Catch:{ all -> 0x018a }
            java.lang.String r2 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)     // Catch:{ all -> 0x018a }
            r9.m223959e(r1)     // Catch:{ all -> 0x018a }
            java.util.Map r10 = r9.m223958d(r10, r11)     // Catch:{ all -> 0x018a }
            com.google.android.apps.search.googleapp.search.srp.p10435e.C137772aw.m223955a(r1, r10)     // Catch:{ all -> 0x018a }
            android.net.Uri r10 = r1.build()     // Catch:{ all -> 0x018a }
            java.lang.String r11 = "getUriBuilderForQueryles…y, requestParams).build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r11)     // Catch:{ all -> 0x018a }
            p5462h.p5472e.C69598b.m101013a(r0, r3)
            return r10
        L_0x0148:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x018a }
            r10.<init>(r4)     // Catch:{ all -> 0x018a }
            throw r10     // Catch:{ all -> 0x018a }
        L_0x014e:
            com.google.common.f.e r10 = f374798b     // Catch:{ all -> 0x018a }
            com.google.common.f.x r10 = r10.mo56225c()     // Catch:{ all -> 0x018a }
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10     // Catch:{ all -> 0x018a }
            java.lang.String r11 = "Not able to handle queryless url."
            com.google.common.f.n r1 = new com.google.common.f.n     // Catch:{ all -> 0x018a }
            r2 = 41058(0xa062, float:5.7535E-41)
            r1.<init>(r2)     // Catch:{ all -> 0x018a }
            r10.mo56379ah(r1)     // Catch:{ all -> 0x018a }
            r10.mo56386p(r11)     // Catch:{ all -> 0x018a }
            android.net.Uri r10 = android.net.Uri.EMPTY     // Catch:{ all -> 0x018a }
            java.lang.String r11 = "EMPTY"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r11)     // Catch:{ all -> 0x018a }
            p5462h.p5472e.C69598b.m101013a(r0, r3)
            return r10
        L_0x0171:
            p5462h.p5472e.C69598b.m101013a(r0, r3)
            java.lang.String r0 = "search"
            android.net.Uri$Builder r10 = r9.mo113950a(r10, r11, r0, r2)
            android.net.Uri r10 = r10.build()
            java.lang.String r11 = "getUriBuilderForNonDeepl…ue\n      )\n      .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r11)
            return r10
        L_0x0184:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x018a }
            r10.<init>()     // Catch:{ all -> 0x018a }
            throw r10     // Catch:{ all -> 0x018a }
        L_0x018a:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x018c }
        L_0x018c:
            r11 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r10)
            goto L_0x0192
        L_0x0191:
            throw r11
        L_0x0192:
            goto L_0x0191
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.srp.p10435e.C137777ba.mo113952c(com.google.android.apps.search.googleapp.search.k.a.d, java.util.Map):android.net.Uri");
    }
}
