package com.google.android.apps.gsa.search.core.google.p6794d;

import com.google.android.apps.gsa.search.core.p6513aj.C84558r;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.io.InputStream;
import java.nio.charset.Charset;

/* renamed from: com.google.android.apps.gsa.search.core.google.d.r */
/* compiled from: PG */
public final class C85951r extends C85949p {

    /* renamed from: b */
    private static final C59071e f232427b = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.d.r");

    /* renamed from: c */
    private static final byte[] f232428c = {101, 99, 116, 99, 109};

    /* renamed from: d */
    private static final byte[] f232429d = {115, 97, 111};

    /* renamed from: e */
    private static final byte[] f232430e = {109, 111, 100, 101, 115};

    /* renamed from: f */
    private static final byte[] f232431f = {102, 112};

    /* renamed from: g */
    private static final byte[] f232432g = {105, 108, 112};

    /* renamed from: h */
    private static final byte[] f232433h = {115, 99, 112, 97, 100};

    /* renamed from: i */
    private static final byte[] f232434i = {103, 115, 97, 95, 115, 101, 97, 114, 99, 104, 95, 116, 111, 111, 108, 115};

    /* renamed from: j */
    private static final byte[] f232435j = {101, 98, 116, 102, 112, 97, 115};

    /* renamed from: k */
    private static final byte[] f232436k = {112, 106, 102};

    /* renamed from: l */
    private static final byte[] f232437l = {101, 100};

    /* renamed from: m */
    private static final byte[] f232438m = {114, 99, 102, 108};

    /* renamed from: n */
    private static final byte[] f232439n = {101, 114};

    /* renamed from: o */
    private static final Charset f232440o = C90772bp.f253863a;

    /* renamed from: p */
    private final InputStream f232441p;

    /* renamed from: q */
    private C84558r f232442q;

    /* renamed from: r */
    private final String f232443r;

    /* renamed from: s */
    private final String[] f232444s;

    /* renamed from: t */
    private final C68214a f232445t;

    public C85951r(InputStream inputStream, String str, String[] strArr, C68214a aVar) {
        this.f232441p = inputStream;
        this.f232443r = str;
        this.f232444s = strArr;
        this.f232445t = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        r1.f232442q.mo78304g(android.util.JsonToken.BEGIN_OBJECT);
        r3 = null;
        r5 = null;
        r6 = null;
        r7 = -1;
        r8 = -1;
        r9 = null;
        r10 = null;
        r11 = null;
        r12 = null;
        r13 = null;
        r14 = 0;
        r15 = null;
        r17 = null;
        r18 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x06a0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x06a9, code lost:
        throw new com.google.android.apps.gsa.shared.p7127q.C90457d((java.lang.Throwable) r0, (int) com.google.android.apps.gsa.shared.logger.p7054d.C89885b.GWS_PARSING_JSON_VALUE);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.apps.gsa.search.core.google.p6794d.C85945l m138183d() {
        /*
            r23 = this;
            r1 = r23
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q
            r2 = 1
            if (r0 != 0) goto L_0x0047
            com.google.android.apps.gsa.search.core.aj.r r0 = new com.google.android.apps.gsa.search.core.aj.r
            java.io.InputStream r3 = r1.f232441p
            dagger.a r4 = r1.f232445t
            r0.<init>(r3, r4)
            r1.f232442q = r0
            r0.f230112b = r2
            java.lang.String r3 = r1.f232443r
            if (r3 == 0) goto L_0x0047
            int r4 = r0.f230113c     // Catch:{ IOException -> 0x003d }
            int r5 = r3.length()     // Catch:{ IOException -> 0x003d }
            int r4 = r4 + r5
            int r5 = r0.f230114d     // Catch:{ IOException -> 0x003d }
            if (r4 <= r5) goto L_0x0033
            int r4 = r3.length()     // Catch:{ IOException -> 0x003d }
            boolean r4 = r0.mo78306i(r4)     // Catch:{ IOException -> 0x003d }
            if (r4 == 0) goto L_0x0047
            boolean r4 = r0.mo78308k(r3)     // Catch:{ IOException -> 0x003d }
            if (r4 == 0) goto L_0x0047
        L_0x0033:
            int r4 = r0.f230113c     // Catch:{ IOException -> 0x003d }
            int r3 = r3.length()     // Catch:{ IOException -> 0x003d }
            int r4 = r4 + r3
            r0.f230113c = r4     // Catch:{ IOException -> 0x003d }
            goto L_0x0047
        L_0x003d:
            r0 = move-exception
            com.google.android.apps.gsa.shared.q.d r2 = new com.google.android.apps.gsa.shared.q.d
            r3 = 196624(0x30010, float:2.75529E-40)
            r2.<init>((java.lang.Throwable) r0, (int) r3)
            throw r2
        L_0x0047:
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            android.util.JsonToken r0 = r0.mo78299c()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            if (r0 == 0) goto L_0x069e
            android.util.JsonToken r4 = android.util.JsonToken.END_DOCUMENT     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            if (r0 != r4) goto L_0x0055
            goto L_0x069e
        L_0x0055:
            android.util.JsonToken r4 = android.util.JsonToken.BEGIN_OBJECT     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            if (r0 != r4) goto L_0x0688
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            android.util.JsonToken r4 = android.util.JsonToken.BEGIN_OBJECT     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            r0.mo78304g(r4)     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = -1
            r8 = -1
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
        L_0x0070:
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            boolean r0 = r0.mo78307j()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            if (r0 == 0) goto L_0x0284
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            com.google.android.apps.gsa.search.core.aj.q r0 = r0.mo78301d()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            r2 = 101(0x65, float:1.42E-43)
            boolean r2 = r0.mo78294b(r2)     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            if (r2 == 0) goto L_0x008e
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            java.lang.String r6 = r0.mo78303f()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            goto L_0x0281
        L_0x008e:
            r2 = 99
            boolean r2 = r0.mo78294b(r2)     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            if (r2 == 0) goto L_0x009e
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            int r7 = r0.mo78297a()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            goto L_0x0281
        L_0x009e:
            r2 = 117(0x75, float:1.64E-43)
            boolean r2 = r0.mo78294b(r2)     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            if (r2 == 0) goto L_0x00ae
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            java.lang.String r9 = r0.mo78303f()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            goto L_0x0281
        L_0x00ae:
            r2 = 100
            boolean r2 = r0.mo78294b(r2)     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            if (r2 == 0) goto L_0x00be
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            byte[] r10 = r0.mo78309l()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            goto L_0x0281
        L_0x00be:
            r2 = 97
            boolean r2 = r0.mo78294b(r2)     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            if (r2 == 0) goto L_0x026e
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            android.util.JsonToken r2 = android.util.JsonToken.BEGIN_OBJECT     // Catch:{ IOException -> 0x0241 }
            r0.mo78304g(r2)     // Catch:{ IOException -> 0x0241 }
        L_0x00cd:
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            boolean r0 = r0.mo78307j()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            if (r0 == 0) goto L_0x024a
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            com.google.android.apps.gsa.search.core.aj.q r0 = r0.mo78301d()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            byte[] r2 = f232428c     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            r4 = 5
            boolean r2 = r0.mo78295c(r2, r4)     // Catch:{ IOException -> 0x0241 }
            if (r2 == 0) goto L_0x00eb
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            byte[] r12 = r0.mo78309l()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            goto L_0x00cd
        L_0x00eb:
            byte[] r2 = f232429d     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            r4 = 3
            boolean r2 = r0.mo78295c(r2, r4)     // Catch:{ IOException -> 0x0241 }
            if (r2 == 0) goto L_0x0104
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            int r0 = r0.mo78297a()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            if (r0 <= 0) goto L_0x00fe
            r0 = 1
            goto L_0x00ff
        L_0x00fe:
            r0 = 0
        L_0x00ff:
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r0)     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            goto L_0x00cd
        L_0x0104:
            byte[] r2 = f232430e     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            r4 = 5
            boolean r2 = r0.mo78295c(r2, r4)     // Catch:{ IOException -> 0x0241 }
            if (r2 == 0) goto L_0x013c
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            r2.<init>()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            android.util.JsonToken r4 = android.util.JsonToken.BEGIN_ARRAY     // Catch:{ IOException -> 0x0138 }
            r0.mo78304g(r4)     // Catch:{ IOException -> 0x0138 }
        L_0x0119:
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            boolean r0 = r0.mo78307j()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            if (r0 == 0) goto L_0x012f
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            int r0 = r0.mo78297a()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            r2.add(r0)     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            goto L_0x0119
        L_0x012f:
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            android.util.JsonToken r4 = android.util.JsonToken.END_ARRAY     // Catch:{ IOException -> 0x0138 }
            r0.mo78304g(r4)     // Catch:{ IOException -> 0x0138 }
            r13 = r2
            goto L_0x00cd
        L_0x0138:
            r0 = move-exception
            r13 = r2
            goto L_0x0252
        L_0x013c:
            byte[] r2 = f232431f     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            r4 = 2
            boolean r2 = r0.mo78295c(r2, r4)     // Catch:{ IOException -> 0x0241 }
            if (r2 == 0) goto L_0x014c
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            java.lang.String r11 = r0.mo78303f()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            goto L_0x00cd
        L_0x014c:
            byte[] r2 = f232432g     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            r4 = 3
            boolean r2 = r0.mo78295c(r2, r4)     // Catch:{ IOException -> 0x0241 }
            if (r2 == 0) goto L_0x0181
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            r2.<init>()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            android.util.JsonToken r3 = android.util.JsonToken.BEGIN_ARRAY     // Catch:{ IOException -> 0x017d }
            r0.mo78304g(r3)     // Catch:{ IOException -> 0x017d }
        L_0x0161:
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            boolean r0 = r0.mo78307j()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            if (r0 == 0) goto L_0x0173
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            java.lang.String r0 = r0.mo78303f()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            r2.add(r0)     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            goto L_0x0161
        L_0x0173:
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            android.util.JsonToken r3 = android.util.JsonToken.END_ARRAY     // Catch:{ IOException -> 0x017d }
            r0.mo78304g(r3)     // Catch:{ IOException -> 0x017d }
            r3 = r2
            goto L_0x00cd
        L_0x017d:
            r0 = move-exception
            r3 = r2
            goto L_0x0252
        L_0x0181:
            byte[] r2 = f232433h     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            r4 = 5
            boolean r2 = r0.mo78295c(r2, r4)     // Catch:{ IOException -> 0x0241 }
            if (r2 == 0) goto L_0x01c1
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            r0.mo78299c()     // Catch:{ IOException -> 0x0241 }
            android.util.JsonToken r2 = r0.f230115e     // Catch:{ IOException -> 0x0241 }
            android.util.JsonToken r4 = android.util.JsonToken.BOOLEAN     // Catch:{ IOException -> 0x0241 }
            if (r2 != r4) goto L_0x01ab
            com.google.android.apps.gsa.search.core.aj.q r2 = r0.f230116f     // Catch:{ IOException -> 0x0241 }
            byte[] r2 = r2.f230106a     // Catch:{ IOException -> 0x0241 }
            byte[] r4 = com.google.android.apps.gsa.search.core.p6513aj.C84558r.f230109a     // Catch:{ IOException -> 0x0241 }
            if (r2 != r4) goto L_0x019f
            r2 = 1
            goto L_0x01a0
        L_0x019f:
            r2 = 0
        L_0x01a0:
            r0.mo78298b()     // Catch:{ IOException -> 0x0241 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            r17 = r0
            goto L_0x00cd
        L_0x01ab:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0241 }
            java.lang.String r4 = "Expected a boolean but was "
            android.util.JsonToken r0 = r0.f230115e     // Catch:{ IOException -> 0x0241 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0241 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0241 }
            java.lang.String r0 = r4.concat(r0)     // Catch:{ IOException -> 0x0241 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0241 }
            throw r2     // Catch:{ IOException -> 0x0241 }
        L_0x01c1:
            byte[] r2 = f232435j     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            r4 = 7
            boolean r2 = r0.mo78295c(r2, r4)     // Catch:{ IOException -> 0x0241 }
            if (r2 == 0) goto L_0x01d2
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            int r14 = r0.mo78297a()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            goto L_0x00cd
        L_0x01d2:
            byte[] r2 = f232434i     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            r4 = 16
            boolean r2 = r0.mo78295c(r2, r4)     // Catch:{ IOException -> 0x0241 }
            if (r2 == 0) goto L_0x01e3
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            r0.mo78305h()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            goto L_0x00cd
        L_0x01e3:
            byte[] r2 = f232436k     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            r4 = 3
            boolean r2 = r0.mo78295c(r2, r4)     // Catch:{ IOException -> 0x0241 }
            if (r2 == 0) goto L_0x01f4
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            int r18 = r0.mo78297a()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            goto L_0x00cd
        L_0x01f4:
            byte[] r2 = f232437l     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            r4 = 2
            boolean r0 = r0.mo78295c(r2, r4)     // Catch:{ IOException -> 0x0241 }
            if (r0 == 0) goto L_0x0243
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            android.util.JsonToken r2 = android.util.JsonToken.BEGIN_OBJECT     // Catch:{ IOException -> 0x0241 }
            r0.mo78304g(r2)     // Catch:{ IOException -> 0x0241 }
        L_0x0204:
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            boolean r0 = r0.mo78307j()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            if (r0 == 0) goto L_0x0238
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            com.google.android.apps.gsa.search.core.aj.q r0 = r0.mo78301d()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            byte[] r2 = f232438m     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            r4 = 4
            boolean r2 = r0.mo78295c(r2, r4)     // Catch:{ IOException -> 0x0241 }
            if (r2 == 0) goto L_0x0222
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            int r8 = r0.mo78297a()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            goto L_0x0204
        L_0x0222:
            byte[] r2 = f232439n     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            r4 = 2
            boolean r0 = r0.mo78295c(r2, r4)     // Catch:{ IOException -> 0x0241 }
            if (r0 == 0) goto L_0x0232
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            java.lang.String r5 = r0.mo78303f()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            goto L_0x0204
        L_0x0232:
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            r0.mo78305h()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            goto L_0x0204
        L_0x0238:
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            android.util.JsonToken r2 = android.util.JsonToken.END_OBJECT     // Catch:{ IOException -> 0x0241 }
            r0.mo78304g(r2)     // Catch:{ IOException -> 0x0241 }
            goto L_0x00cd
        L_0x0241:
            r0 = move-exception
            goto L_0x0252
        L_0x0243:
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            r0.mo78305h()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            goto L_0x00cd
        L_0x024a:
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa }
            android.util.JsonToken r2 = android.util.JsonToken.END_OBJECT     // Catch:{ IOException -> 0x0241 }
            r0.mo78304g(r2)     // Catch:{ IOException -> 0x0241 }
            goto L_0x0281
        L_0x0252:
            com.google.common.f.e r2 = f232427b     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            com.google.common.f.x r0 = r2.mo56382g(r0)     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            r2 = 8156(0x1fdc, float:1.1429E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            java.lang.String r2 = "Could not parse pellet 'a' field"
            r0.mo56386p(r2)     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            goto L_0x0281
        L_0x026e:
            r2 = 112(0x70, float:1.57E-43)
            boolean r0 = r0.mo78294b(r2)     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            if (r0 == 0) goto L_0x027c
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            r0.mo78305h()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            goto L_0x0281
        L_0x027c:
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            r0.mo78305h()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
        L_0x0281:
            r2 = 1
            goto L_0x0070
        L_0x0284:
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            android.util.JsonToken r2 = android.util.JsonToken.END_OBJECT     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            r0.mo78304g(r2)     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            if (r6 == 0) goto L_0x0686
            r2 = -1
            if (r7 != r2) goto L_0x0293
            if (r8 == r2) goto L_0x0686
            r7 = -1
        L_0x0293:
            if (r9 == 0) goto L_0x0686
            if (r10 == 0) goto L_0x0686
            android.net.Uri r0 = android.net.Uri.parse(r9)
            java.lang.String r2 = "fp"
            java.lang.String r2 = r0.getQueryParameter(r2)
            if (r2 == 0) goto L_0x02a5
            r2 = 1
            goto L_0x02a6
        L_0x02a5:
            r2 = 0
        L_0x02a6:
            java.lang.String r4 = "ect"
            java.lang.String r4 = r0.getQueryParameter(r4)
            if (r7 != 0) goto L_0x02b2
            r20 = r3
            r7 = 1
            goto L_0x02b5
        L_0x02b2:
            r20 = r3
            r7 = 0
        L_0x02b5:
            com.google.android.apps.gsa.search.core.google.d.q r3 = new com.google.android.apps.gsa.search.core.google.d.q
            r3.<init>()
            com.google.al.d.a.ac r16 = com.google.p395al.p417d.p418a.C8523ac.f29564e
            com.google.protobuf.bn r16 = r16.createBuilder()
            r21 = r11
            r11 = r16
            com.google.al.d.a.ab r11 = (com.google.p395al.p417d.p418a.C8522ab) r11
            r11.copyOnWrite()
            r22 = r13
            com.google.protobuf.bv r13 = r11.instance
            com.google.al.d.a.ac r13 = (com.google.p395al.p417d.p418a.C8523ac) r13
            r16 = r7
            int r7 = r13.f29566a
            r19 = 1
            r7 = r7 | 1
            r13.f29566a = r7
            r13.f29567b = r6
            r6 = -1
            if (r8 == r6) goto L_0x0320
            com.google.al.d.a.v r0 = r3.f232423b
            if (r0 != 0) goto L_0x02ec
            com.google.al.d.a.w r0 = com.google.p395al.p417d.p418a.C8596w.f29744d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.al.d.a.v r0 = (com.google.p395al.p417d.p418a.C8595v) r0
            r3.f232423b = r0
        L_0x02ec:
            com.google.al.d.a.v r0 = r3.f232423b
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.al.d.a.w r2 = (com.google.p395al.p417d.p418a.C8596w) r2
            com.google.al.d.a.w r4 = com.google.p395al.p417d.p418a.C8596w.f29744d
            int r4 = r2.f29747a
            r6 = 1
            r4 = r4 | r6
            r2.f29747a = r4
            r2.f29748b = r8
            if (r5 == 0) goto L_0x0310
            r0.copyOnWrite()
            com.google.protobuf.bv r0 = r0.instance
            com.google.al.d.a.w r0 = (com.google.p395al.p417d.p418a.C8596w) r0
            int r2 = r0.f29747a
            r4 = 2
            r2 = r2 | r4
            r0.f29747a = r2
            r0.f29749c = r5
        L_0x0310:
            r3.mo79622c(r11)
            com.google.android.apps.gsa.search.core.google.d.l r0 = new com.google.android.apps.gsa.search.core.google.d.l
            com.google.protobuf.bv r2 = r11.build()
            int r3 = r10.length
            r4 = 1
            r0.<init>(r9, r4, r2, r3)
            goto L_0x0685
        L_0x0320:
            if (r12 == 0) goto L_0x03b2
            com.google.cm.d.a.b r5 = com.google.p4500cm.p4518d.p4519a.C58179b.f155534j
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.cm.d.a.a r5 = (com.google.p4500cm.p4518d.p4519a.C58178a) r5
            byte[] r6 = com.google.android.apps.gsa.shared.util.C90734ar.m148202e(r12)     // Catch:{ ct -> 0x0362 }
            com.google.protobuf.ba r7 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0362 }
            r5.mergeFrom((byte[]) r6, (com.google.protobuf.C62921ba) r7)     // Catch:{ ct -> 0x0362 }
            com.google.al.d.a.u r6 = r3.mo79620a()
            com.google.protobuf.bn r6 = r6.toBuilder()
            com.google.al.d.a.t r6 = (com.google.p395al.p417d.p418a.C8593t) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.al.d.a.u r7 = (com.google.p395al.p417d.p418a.C8594u) r7
            com.google.protobuf.bv r5 = r5.build()
            com.google.cm.d.a.b r5 = (com.google.p4500cm.p4518d.p4519a.C58179b) r5
            r5.getClass()
            r7.f29742e = r5
            int r5 = r7.f29738a
            r5 = r5 | 8
            r7.f29738a = r5
            com.google.protobuf.bv r5 = r6.build()
            com.google.al.d.a.u r5 = (com.google.p395al.p417d.p418a.C8594u) r5
            r3.f232424c = r5
            goto L_0x03b2
        L_0x0360:
            r0 = move-exception
            goto L_0x0387
        L_0x0362:
            r0 = move-exception
            com.google.common.f.e r2 = f232427b     // Catch:{ all -> 0x0360 }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x0360 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0360 }
            com.google.common.f.x r2 = r2.mo56382g(r0)     // Catch:{ all -> 0x0360 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0360 }
            r4 = 8150(0x1fd6, float:1.142E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r4)     // Catch:{ all -> 0x0360 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0360 }
            java.lang.String r4 = "Error making CardMetadata protobuf. data=%s"
            r2.mo56389s(r4, r12)     // Catch:{ all -> 0x0360 }
            com.google.android.apps.gsa.shared.q.d r2 = new com.google.android.apps.gsa.shared.q.d     // Catch:{ all -> 0x0360 }
            r4 = 196631(0x30017, float:2.75539E-40)
            r2.<init>((java.lang.Throwable) r0, (int) r4)     // Catch:{ all -> 0x0360 }
            throw r2     // Catch:{ all -> 0x0360 }
        L_0x0387:
            com.google.al.d.a.u r2 = r3.mo79620a()
            com.google.protobuf.bn r2 = r2.toBuilder()
            com.google.al.d.a.t r2 = (com.google.p395al.p417d.p418a.C8593t) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.al.d.a.u r4 = (com.google.p395al.p417d.p418a.C8594u) r4
            com.google.protobuf.bv r5 = r5.build()
            com.google.cm.d.a.b r5 = (com.google.p4500cm.p4518d.p4519a.C58179b) r5
            r5.getClass()
            r4.f29742e = r5
            int r5 = r4.f29738a
            r5 = r5 | 8
            r4.f29738a = r5
            com.google.protobuf.bv r2 = r2.build()
            com.google.al.d.a.u r2 = (com.google.p395al.p417d.p418a.C8594u) r2
            r3.f232424c = r2
            throw r0
        L_0x03b2:
            if (r18 == 0) goto L_0x03d5
            com.google.al.d.a.z r5 = r3.f232425d
            if (r5 != 0) goto L_0x03c2
            com.google.al.d.a.aa r5 = com.google.p395al.p417d.p418a.C8521aa.f29558d
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.al.d.a.z r5 = (com.google.p395al.p417d.p418a.C8599z) r5
            r3.f232425d = r5
        L_0x03c2:
            com.google.al.d.a.z r5 = r3.f232425d
            r5.copyOnWrite()
            com.google.protobuf.bv r5 = r5.instance
            com.google.al.d.a.aa r5 = (com.google.p395al.p417d.p418a.C8521aa) r5
            com.google.al.d.a.aa r6 = com.google.p395al.p417d.p418a.C8521aa.f29558d
            int r6 = r5.f29561a
            r7 = 1
            r6 = r6 | r7
            r5.f29561a = r6
            r5.f29562b = r7
        L_0x03d5:
            if (r15 == 0) goto L_0x03f0
            com.google.al.d.a.aj r5 = r3.mo79621b()
            boolean r6 = r15.booleanValue()
            r5.copyOnWrite()
            com.google.protobuf.bv r5 = r5.instance
            com.google.al.d.a.am r5 = (com.google.p395al.p417d.p418a.C8533am) r5
            com.google.al.d.a.am r7 = com.google.p395al.p417d.p418a.C8533am.f29592s
            int r7 = r5.f29595a
            r7 = r7 | 8
            r5.f29595a = r7
            r5.f29598d = r6
        L_0x03f0:
            java.lang.String r5 = r0.getPath()
            java.lang.String[] r6 = r1.f232444s
            int r7 = r6.length
            r8 = 0
        L_0x03f8:
            if (r8 >= r7) goto L_0x042f
            r12 = r6[r8]
            boolean r12 = r12.equals(r5)
            if (r12 == 0) goto L_0x042c
            com.google.al.d.a.af r0 = r3.f232422a
            if (r0 != 0) goto L_0x0410
            com.google.al.d.a.ag r0 = com.google.p395al.p417d.p418a.C8527ag.f29575d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.al.d.a.af r0 = (com.google.p395al.p417d.p418a.C8526af) r0
            r3.f232422a = r0
        L_0x0410:
            com.google.al.d.a.af r0 = r3.f232422a
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r4 = f232440o
            r2.<init>(r10, r4)
            r0.copyOnWrite()
            com.google.protobuf.bv r0 = r0.instance
            com.google.al.d.a.ag r0 = (com.google.p395al.p417d.p418a.C8527ag) r0
            com.google.al.d.a.ag r4 = com.google.p395al.p417d.p418a.C8527ag.f29575d
            int r4 = r0.f29578a
            r5 = 2
            r4 = r4 | r5
            r0.f29578a = r4
            r0.f29579b = r2
            goto L_0x0676
        L_0x042c:
            int r8 = r8 + 1
            goto L_0x03f8
        L_0x042f:
            if (r4 != 0) goto L_0x053d
            com.google.al.d.a.aj r4 = r3.mo79621b()
            if (r2 == 0) goto L_0x043a
            com.google.al.d.a.al r5 = com.google.p395al.p417d.p418a.C8532al.JESR
            goto L_0x043c
        L_0x043a:
            com.google.al.d.a.al r5 = com.google.p395al.p417d.p418a.C8532al.HTML
        L_0x043c:
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.al.d.a.am r6 = (com.google.p395al.p417d.p418a.C8533am) r6
            com.google.al.d.a.am r7 = com.google.p395al.p417d.p418a.C8533am.f29592s
            int r5 = r5.f29591d
            r6.f29604j = r5
            int r5 = r6.f29595a
            r5 = r5 | 128(0x80, float:1.794E-43)
            r6.f29595a = r5
            r5 = 1
            if (r5 == r2) goto L_0x0455
            java.lang.String r2 = "text/html;charset=utf-8"
            goto L_0x0457
        L_0x0455:
            java.lang.String r2 = "application/json;charset=utf-8"
        L_0x0457:
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.al.d.a.am r5 = (com.google.p395al.p417d.p418a.C8533am) r5
            int r6 = r5.f29595a
            r6 = r6 | 64
            r5.f29595a = r6
            r5.f29603i = r2
            com.google.protobuf.z r2 = com.google.protobuf.C63088z.m96139A(r10)
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.al.d.a.am r5 = (com.google.p395al.p417d.p418a.C8533am) r5
            int r6 = r5.f29595a
            r6 = r6 | 32
            r5.f29595a = r6
            r5.f29602h = r2
            if (r14 <= 0) goto L_0x047d
            r5 = 1
            goto L_0x047e
        L_0x047d:
            r5 = 0
        L_0x047e:
            r4.copyOnWrite()
            com.google.protobuf.bv r2 = r4.instance
            com.google.al.d.a.am r2 = (com.google.p395al.p417d.p418a.C8533am) r2
            int r6 = r2.f29595a
            r6 = r6 | 512(0x200, float:7.175E-43)
            r2.f29595a = r6
            r2.f29606l = r5
            if (r5 == 0) goto L_0x04a0
            r4.copyOnWrite()
            com.google.protobuf.bv r2 = r4.instance
            com.google.al.d.a.am r2 = (com.google.p395al.p417d.p418a.C8533am) r2
            int r5 = r2.f29595a
            r5 = r5 | 1024(0x400, float:1.435E-42)
            r2.f29595a = r5
            java.lang.String r5 = "text/javascript;charset=utf-8"
            r2.f29607m = r5
        L_0x04a0:
            java.lang.String r2 = "q"
            java.lang.String r0 = r0.getQueryParameter(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x04be
            r4.copyOnWrite()
            com.google.protobuf.bv r2 = r4.instance
            com.google.al.d.a.am r2 = (com.google.p395al.p417d.p418a.C8533am) r2
            r0.getClass()
            int r5 = r2.f29595a
            r6 = 4
            r5 = r5 | r6
            r2.f29595a = r5
            r2.f29597c = r0
        L_0x04be:
            r4.copyOnWrite()
            com.google.protobuf.bv r0 = r4.instance
            com.google.al.d.a.am r0 = (com.google.p395al.p417d.p418a.C8533am) r0
            int r2 = r0.f29595a
            r5 = 2
            r2 = r2 | r5
            r0.f29595a = r2
            r2 = r16
            r0.f29596b = r2
            if (r22 == 0) goto L_0x04ed
            r4.copyOnWrite()
            com.google.protobuf.bv r0 = r4.instance
            com.google.al.d.a.am r0 = (com.google.p395al.p417d.p418a.C8533am) r0
            com.google.protobuf.ch r2 = r0.f29599e
            boolean r5 = r2.mo58948c()
            if (r5 != 0) goto L_0x04e6
            com.google.protobuf.ch r2 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62961ch) r2)
            r0.f29599e = r2
        L_0x04e6:
            com.google.protobuf.ch r0 = r0.f29599e
            r13 = r22
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r13, (java.util.List) r0)
        L_0x04ed:
            boolean r0 = android.text.TextUtils.isEmpty(r21)
            if (r0 != 0) goto L_0x0508
            r4.copyOnWrite()
            com.google.protobuf.bv r0 = r4.instance
            com.google.al.d.a.am r0 = (com.google.p395al.p417d.p418a.C8533am) r0
            r21.getClass()
            int r2 = r0.f29595a
            r5 = 16
            r2 = r2 | r5
            r0.f29595a = r2
            r2 = r21
            r0.f29600f = r2
        L_0x0508:
            if (r20 == 0) goto L_0x0526
            r4.copyOnWrite()
            com.google.protobuf.bv r0 = r4.instance
            com.google.al.d.a.am r0 = (com.google.p395al.p417d.p418a.C8533am) r0
            com.google.protobuf.cq r2 = r0.f29601g
            boolean r5 = r2.mo58948c()
            if (r5 != 0) goto L_0x051f
            com.google.protobuf.cq r2 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r2)
            r0.f29601g = r2
        L_0x051f:
            com.google.protobuf.cq r0 = r0.f29601g
            r2 = r20
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r2, (java.util.List) r0)
        L_0x0526:
            if (r17 == 0) goto L_0x0676
            boolean r0 = r17.booleanValue()
            r4.copyOnWrite()
            com.google.protobuf.bv r2 = r4.instance
            com.google.al.d.a.am r2 = (com.google.p395al.p417d.p418a.C8533am) r2
            int r4 = r2.f29595a
            r4 = r4 | 256(0x100, float:3.59E-43)
            r2.f29595a = r4
            r2.f29605k = r0
            goto L_0x0676
        L_0x053d:
            r2 = r16
            java.lang.String r0 = "eoc"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0580
            com.google.al.d.a.u r0 = r3.mo79620a()
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.al.d.a.t r0 = (com.google.p395al.p417d.p418a.C8593t) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.al.d.a.u r2 = (com.google.p395al.p417d.p418a.C8594u) r2
            int r4 = r2.f29738a
            r5 = 1
            r4 = r4 | r5
            r2.f29738a = r4
            r2.f29739b = r5
            com.google.protobuf.bv r0 = r0.build()
            com.google.al.d.a.u r0 = (com.google.p395al.p417d.p418a.C8594u) r0
            r3.f232424c = r0
            com.google.al.d.a.aj r0 = r3.mo79621b()
            r0.copyOnWrite()
            com.google.protobuf.bv r0 = r0.instance
            com.google.al.d.a.am r0 = (com.google.p395al.p417d.p418a.C8533am) r0
            com.google.al.d.a.am r2 = com.google.p395al.p417d.p418a.C8533am.f29592s
            int r2 = r0.f29595a
            r4 = 2
            r2 = r2 | r4
            r0.f29595a = r2
            r5 = 0
            r0.f29596b = r5
            goto L_0x0676
        L_0x0580:
            r5 = 0
            java.lang.String r0 = "mdp"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0676
            java.lang.String r0 = "tts"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0676
            com.google.al.d.a.u r0 = r3.mo79620a()
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.al.d.a.t r0 = (com.google.p395al.p417d.p418a.C8593t) r0
            com.google.protobuf.bv r6 = r0.instance
            com.google.al.d.a.u r6 = (com.google.p395al.p417d.p418a.C8594u) r6
            int r6 = r6.f29738a
            r6 = r6 & 8
            if (r6 != 0) goto L_0x05b2
            com.google.common.f.e r6 = f232427b
            com.google.common.f.x r6 = r6.mo56226d()
            java.lang.String r7 = "Pellet contains an action but no CardMetadata"
            r8 = 8149(0x1fd5, float:1.1419E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r8)).mo56386p(r7)
        L_0x05b2:
            int r6 = r4.length()
        L_0x05b6:
            int r7 = r6 + -1
            char r8 = r4.charAt(r7)
            r12 = 48
            if (r8 < r12) goto L_0x05c8
            r12 = 57
            if (r8 <= r12) goto L_0x05c5
            goto L_0x05c8
        L_0x05c5:
            r6 = r7
            if (r7 > 0) goto L_0x05b6
        L_0x05c8:
            int r7 = r4.length()
            if (r6 >= r7) goto L_0x05d6
            java.lang.String r5 = r4.substring(r6)
            int r5 = java.lang.Integer.parseInt(r5)
        L_0x05d6:
            r0.copyOnWrite()
            com.google.protobuf.bv r6 = r0.instance
            com.google.al.d.a.u r6 = (com.google.p395al.p417d.p418a.C8594u) r6
            int r7 = r6.f29738a
            r8 = 4
            r7 = r7 | r8
            r6.f29738a = r7
            r6.f29741d = r5
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.al.d.a.u r5 = (com.google.p395al.p417d.p418a.C8594u) r5
            int r6 = r5.f29738a
            r7 = 1
            r6 = r6 | r7
            r5.f29738a = r6
            r5.f29739b = r2
            java.lang.String r2 = "act"
            boolean r2 = r4.startsWith(r2)     // Catch:{ ct -> 0x065f }
            if (r2 == 0) goto L_0x060d
            byte[] r2 = com.google.android.apps.gsa.shared.util.C90734ar.m148202e(r10)     // Catch:{ ct -> 0x065f }
            com.google.protobuf.ba r4 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x065f }
            com.google.bb.a.pb r5 = com.google.p4152bb.p4153a.C55349pb.f145830g     // Catch:{ ct -> 0x065f }
            com.google.protobuf.bv r2 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r5, (byte[]) r2, (com.google.protobuf.C62921ba) r4)     // Catch:{ ct -> 0x065f }
            com.google.bb.a.pb r2 = (com.google.p4152bb.p4153a.C55349pb) r2     // Catch:{ ct -> 0x065f }
            goto L_0x0644
        L_0x060d:
            java.lang.String r2 = "ans"
            boolean r2 = r4.startsWith(r2)     // Catch:{ ct -> 0x065f }
            if (r2 == 0) goto L_0x062d
            com.google.common.f.e r2 = f232427b     // Catch:{ ct -> 0x065f }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ ct -> 0x065f }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ ct -> 0x065f }
            r4 = 8173(0x1fed, float:1.1453E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r4)     // Catch:{ ct -> 0x065f }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ ct -> 0x065f }
            java.lang.String r4 = "Native answers are no longer supported"
            r2.mo56386p(r4)     // Catch:{ ct -> 0x065f }
            int r2 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a     // Catch:{ ct -> 0x065f }
            goto L_0x0642
        L_0x062d:
            com.google.common.f.e r2 = f232427b     // Catch:{ ct -> 0x065f }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ ct -> 0x065f }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ ct -> 0x065f }
            r5 = 8171(0x1feb, float:1.145E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r5)     // Catch:{ ct -> 0x065f }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ ct -> 0x065f }
            java.lang.String r5 = "Unknown pellet type. Not an action or an answer. cardId=%s"
            r2.mo56389s(r5, r4)     // Catch:{ ct -> 0x065f }
        L_0x0642:
            com.google.bb.a.pb r2 = com.google.p4152bb.p4153a.C55349pb.f145830g
        L_0x0644:
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.al.d.a.u r4 = (com.google.p395al.p417d.p418a.C8594u) r4
            r2.getClass()
            r4.f29740c = r2
            int r2 = r4.f29738a
            r5 = 2
            r2 = r2 | r5
            r4.f29738a = r2
            com.google.protobuf.bv r0 = r0.build()
            com.google.al.d.a.u r0 = (com.google.p395al.p417d.p418a.C8594u) r0
            r3.f232424c = r0
            goto L_0x0676
        L_0x065f:
            r0 = move-exception
            com.google.common.f.e r2 = f232427b
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r3 = "Could not make card"
            r4 = 8172(0x1fec, float:1.1451E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r4)).mo56386p(r3)
            com.google.android.apps.gsa.shared.q.d r0 = new com.google.android.apps.gsa.shared.q.d
            r2 = 196630(0x30016, float:2.75537E-40)
            r0.<init>(r2)
            throw r0
        L_0x0676:
            int r0 = r10.length
            r3.mo79622c(r11)
            com.google.android.apps.gsa.search.core.google.d.l r2 = new com.google.android.apps.gsa.search.core.google.d.l
            com.google.protobuf.bv r3 = r11.build()
            r4 = 1
            r2.<init>(r9, r4, r3, r0)
            r0 = r2
        L_0x0685:
            return r0
        L_0x0686:
            r2 = 0
            return r2
        L_0x0688:
            r4 = 1
            com.google.common.f.e r2 = f232427b     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            java.lang.String r3 = "Unexpected JSON token. Expected pellet, but got %s"
            r5 = 8175(0x1fef, float:1.1456E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56389s(r3, r0)     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            com.google.android.apps.gsa.search.core.aj.r r0 = r1.f232442q     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            r0.mo78305h()     // Catch:{ MalformedJsonException -> 0x06b6, EOFException -> 0x06ac, b -> 0x06aa, IOException -> 0x06a0 }
            r2 = 1
            goto L_0x0047
        L_0x069e:
            r2 = 0
            return r2
        L_0x06a0:
            r0 = move-exception
            com.google.android.apps.gsa.shared.q.d r2 = new com.google.android.apps.gsa.shared.q.d
            r3 = 196622(0x3000e, float:2.75526E-40)
            r2.<init>((java.lang.Throwable) r0, (int) r3)
            throw r2
        L_0x06aa:
            r0 = move-exception
            throw r0
        L_0x06ac:
            r0 = move-exception
            com.google.android.apps.gsa.shared.q.d r2 = new com.google.android.apps.gsa.shared.q.d
            r3 = 196635(0x3001b, float:2.75544E-40)
            r2.<init>((java.lang.Throwable) r0, (int) r3)
            throw r2
        L_0x06b6:
            com.google.android.apps.gsa.shared.q.d r0 = new com.google.android.apps.gsa.shared.q.d
            r2 = 196614(0x30006, float:2.75515E-40)
            r0.<init>(r2)
            goto L_0x06c0
        L_0x06bf:
            throw r0
        L_0x06c0:
            goto L_0x06bf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.google.p6794d.C85951r.m138183d():com.google.android.apps.gsa.search.core.google.d.l");
    }

    /* renamed from: a */
    public final C85945l mo79619a() {
        try {
            return m138183d();
        } catch (NumberFormatException e) {
            ((C89911f) this.f232445t.mo27525b()).mo83755a((Throwable) null, 8543654, 29).mo83721a();
            throw new C90457d((Throwable) e, (int) C89885b.GWS_INVALID_JSON_ESCAPE_VALUE);
        }
    }
}
