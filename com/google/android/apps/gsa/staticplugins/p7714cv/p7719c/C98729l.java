package com.google.android.apps.gsa.staticplugins.p7714cv.p7719c;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.apps.gsa.p8889z.p8907d.p8908a.C118948b;
import com.google.android.apps.gsa.search.core.p6519al.p6656cl.C85133a;
import com.google.android.apps.gsa.search.core.p6519al.p6658cm.C85139a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.hotword.p7289d.C92375a;
import com.google.android.apps.gsa.speech.p7269b.C92216a;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7721e.C98741d;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7724h.C98780g;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7724h.C98784k;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.c.l */
/* compiled from: PG */
public final class C98729l implements C118948b {

    /* renamed from: a */
    public final C90931ca f275778a;

    /* renamed from: b */
    public final C68214a f275779b;

    /* renamed from: c */
    public final C21370a f275780c;

    /* renamed from: d */
    public final Context f275781d;

    /* renamed from: e */
    public final C68214a f275782e;

    /* renamed from: f */
    public final C85133a f275783f;

    /* renamed from: g */
    C98721d f275784g;

    /* renamed from: h */
    private final C89012aj f275785h;

    /* renamed from: i */
    private final C98784k f275786i;

    /* renamed from: j */
    private final C69464a f275787j;

    /* renamed from: k */
    private final C22871g f275788k;

    /* renamed from: l */
    private final C85139a f275789l;

    /* renamed from: m */
    private final C86124t f275790m;

    /* renamed from: n */
    private final C92375a f275791n;

    /* renamed from: o */
    private final C68214a f275792o;

    /* renamed from: p */
    private C60870cx f275793p;

    public C98729l(C89012aj ajVar, C98780g gVar, C90931ca caVar, C68214a aVar, C69464a aVar2, C21370a aVar3, Context context, C68214a aVar4, C22871g gVar2, C85139a aVar5, C85133a aVar6, C86124t tVar, C92375a aVar7, C68214a aVar8) {
        this.f275785h = ajVar;
        this.f275786i = gVar;
        this.f275778a = caVar;
        this.f275779b = aVar;
        this.f275787j = aVar2;
        this.f275780c = aVar3;
        this.f275781d = context;
        this.f275782e = aVar4;
        this.f275788k = gVar2;
        this.f275789l = aVar5;
        this.f275783f = aVar6;
        this.f275790m = tVar;
        this.f275791n = aVar7;
        this.f275792o = aVar8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005a, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) com.google.android.apps.gsa.staticplugins.p7714cv.p7719c.C98731n.f275794a.mo56226d()).mo56372aa(31028)).mo56386p("Error closing streams.");
        r2 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007a, code lost:
        r0.f275798e = null;
        r0.f275797d = null;
        r0.f275799f = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0080, code lost:
        throw r10;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo91277a(boolean r10) {
        /*
            r9 = this;
            java.lang.Class<com.google.android.apps.gsa.staticplugins.cv.e.d> r0 = com.google.android.apps.gsa.staticplugins.p7714cv.p7721e.C98741d.class
            com.google.android.libraries.gsa.p1876k.C22872h.m42742b(r0)
            com.google.common.util.concurrent.cx r0 = r9.f275793p
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            com.google.android.apps.gsa.staticplugins.cv.c.d r0 = r9.f275784g
            r1 = 0
            if (r0 == 0) goto L_0x0083
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.base.ax r0 = r0.f275752b
            boolean r2 = r0.mo56113h()
            if (r2 == 0) goto L_0x0081
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.cv.c.n r0 = (com.google.android.apps.gsa.staticplugins.p7714cv.p7719c.C98731n) r0
            java.util.zip.ZipOutputStream r2 = r0.f275798e
            if (r2 != 0) goto L_0x0031
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.p7714cv.p7719c.C98731n.f275794a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "Nothing to share."
            r3 = 31029(0x7935, float:4.3481E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            goto L_0x0081
        L_0x0031:
            java.io.ByteArrayOutputStream r3 = r0.f275797d
            r4 = 0
            r2.finish()     // Catch:{ IOException -> 0x005c }
            android.content.Context r5 = r0.f275795b     // Catch:{ IOException -> 0x005c }
            byte[] r6 = r3.toByteArray()     // Catch:{ IOException -> 0x005c }
            r7 = 1
            java.io.File[] r7 = new java.io.File[r7]     // Catch:{ IOException -> 0x005c }
            java.lang.String r8 = "stream.zip"
            java.io.File r6 = com.google.android.apps.gsa.shared.util.debug.C91026j.m148688c(r5, r8, r6)     // Catch:{ IOException -> 0x005c }
            r7[r4] = r6     // Catch:{ IOException -> 0x005c }
            java.lang.String r6 = ""
            com.google.android.apps.gsa.shared.util.debug.C91026j.m148689d(r5, r6, r7)     // Catch:{ IOException -> 0x005c }
            r2.close()     // Catch:{ IOException -> 0x005c }
            r3.close()     // Catch:{ IOException -> 0x005c }
            r0.f275798e = r1
            r0.f275797d = r1
            r0.f275799f = r4
            goto L_0x0081
        L_0x005a:
            r10 = move-exception
            goto L_0x007a
        L_0x005c:
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.p7714cv.p7719c.C98731n.f275794a     // Catch:{ all -> 0x005a }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ all -> 0x005a }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x005a }
            r3 = 31028(0x7934, float:4.348E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ all -> 0x005a }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x005a }
            java.lang.String r3 = "Error closing streams."
            r2.mo56386p(r3)     // Catch:{ all -> 0x005a }
            int r2 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a     // Catch:{ all -> 0x005a }
            r0.f275798e = r1
            r0.f275797d = r1
            r0.f275799f = r4
            goto L_0x0081
        L_0x007a:
            r0.f275798e = r1
            r0.f275797d = r1
            r0.f275799f = r4
            throw r10
        L_0x0081:
            r9.f275784g = r1
        L_0x0083:
            if (r10 == 0) goto L_0x008b
            com.google.common.util.concurrent.cx r10 = r9.f275793p
            r9.mo91279c(r10)
            goto L_0x009b
        L_0x008b:
            com.google.common.util.concurrent.cx r10 = r9.f275793p
            com.google.android.libraries.gsa.k.g r0 = r9.f275788k
            com.google.android.apps.gsa.staticplugins.cv.c.f r2 = new com.google.android.apps.gsa.staticplugins.cv.c.f
            r2.<init>(r9, r10)
            java.lang.String r10 = "Delay cancel to send end_of_data"
            r3 = 3000(0xbb8, double:1.482E-320)
            r0.mo28213m(r10, r3, r2)
        L_0x009b:
            r9.f275793p = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7714cv.p7719c.C98729l.mo91277a(boolean):void");
    }

    /* renamed from: b */
    public final void mo91278b(C92216a aVar, C92473f fVar, C58833ax axVar) {
        C92473f fVar2 = fVar;
        C58833ax axVar2 = axVar;
        C58976aa aaVar = C58975e.f156826a;
        C22872h.m42742b(C98741d.class);
        C60870cx cxVar = this.f275793p;
        if (cxVar != null) {
            mo91279c(cxVar);
        }
        boolean z = ((SharedPreferences) this.f275787j.mo17428b()).getBoolean("record_then_share_s3_response_stream", false);
        String string = ((SharedPreferences) this.f275787j.mo17428b()).getString("fake_s3_server_content_uri", (String) null);
        boolean isEmpty = TextUtils.isEmpty(string);
        C98721d dVar = new C98721d(aVar, fVar2.f258014b, this.f275786i, z, this.f275781d, this.f275780c, this.f275790m, this.f275791n, this.f275792o, this.f275788k);
        this.f275784g = dVar;
        if (!(!isEmpty)) {
            C89061q qVar = fVar2.f258037y;
            if (qVar == null) {
                qVar = this.f275785h.mo27510b(C89066v.f241382a);
            }
            if (qVar != null) {
                C60870cx h = C60922j.m93045h(this.f275789l.mo78731a(fVar2, axVar2), new C98727j(this, dVar, qVar, fVar2), C60826bg.f164896a);
                C90476a aVar2 = C91018d.f254254a;
                this.f275793p = h;
                return;
            }
            throw new IllegalArgumentException("ConnectivityContext is null in sessionParams");
        }
        this.f275793p = this.f275788k.mo28209i(this.f275789l.mo78731a(fVar2, axVar2), "create and start networkRecognitionRunner", new C98726i(this, dVar, string));
    }

    /* renamed from: c */
    public final void mo91279c(C60870cx cxVar) {
        C58976aa aaVar = C58975e.f156826a;
        new C90873ag(cxVar, this.f275788k, "stopping networkRecognitionRunner", C98724g.f275768a).mo85223a(C98725h.f275769a);
    }
}
